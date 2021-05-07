/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.Product;

/**
 *
 * @author sontriplelift
 */
public class ProductDAO extends DBContext{
    public List<Product> getListProduct(int pageIndex) throws SQLException {
        List<Product> list = new ArrayList<>();
        try {
            String query = "select * from("
                    + "select ROW_NUMBER() over (order by ID ASC) as rn, *\n"
                    + "from Products"
                    + ")as x\n"
                    + "where rn between (?-1)*?+1"
                    + "and ?*?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, pageIndex);
            ps.setInt(2, 6);
            ps.setInt(3, pageIndex);
            ps.setInt(4, 6);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("ID"));
                p.setName(rs.getString("Name"));
                Category c = new Category(rs.getInt("CategoryId"), rs.getString("Name"), rs.getString("Description"));
                p.setCategory(c);
                p.setPrice(rs.getString("Price"));
                p.setImage(rs.getString("Image"));
                p.setDescription(rs.getString("Description"));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //dem so hang trong bang product
    public int getCount() throws SQLException {
        int count = 0;
        try {
            String query = "select count(*) from Products";

            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return count;
    }
    //lay san pham
    public Product getProduct(String productId){
        String query="select * from Products\n" +
                     "where ID=?";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, productId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { 
                Product p = new Product(rs.getString("ID"), rs.getString("Name"), new Category(rs.getInt("CategoryId"), rs.getString("Name"), rs.getString("Description")), 
                        rs.getString("Price"), rs.getString("Image"), rs.getString("Description"));
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<Product> getListProductbyCatid(int pageIndex, int categoryId) throws SQLException {
        List<Product> list = new ArrayList<>();
        try {
            String query = "select * from("
                    + "select ROW_NUMBER() over (order by ID ASC) as rn, *\n"
                    + "from Products where CategoryId=?"
                    + ")as x\n"
                    + "where rn between (?-1)*?+1"
                    + "and ?*?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, categoryId);
            ps.setInt(2, pageIndex);
            ps.setInt(3, 6);
            ps.setInt(4, pageIndex);
            ps.setInt(5, 6);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("ID"));
                p.setName(rs.getString("Name"));
                Category c = new Category(rs.getInt("CategoryId"), rs.getString("Name"), rs.getString("Description"));
                p.setCategory(c);
                p.setPrice(rs.getString("Price"));
                p.setImage(rs.getString("Image"));
                p.setDescription(rs.getString("Description"));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public int getCountbyCatId(int categoryId) throws SQLException {
        int count = 0;
        try {
            String query = "select count(*) from Products where CategoryId=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return count;
   }
    public int getLastOrderID() {
        int orderID = 0;
        try {
            String sql = "select top(1) OrderID from [Orders] order by OrderID desc";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return orderID;
    }
    public void Buy(int orderID, int quantity, String total, String pID, String username) {
        try {
            String sql = "insert into [Orders] "
                    + "(OrderID, OrderQuantity, TotalPrice, ProductID, Username) "
                    + "values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, orderID);
            ps.setInt(2, quantity);
            ps.setString(3, total);
            ps.setString(4, pID);
            ps.setString(5, username);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //lay tat ca san pham
    public List<Product> getAllProducts() {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select p.*, c.CategoryName \n" +
                        "from Products p , Categories c\n" +
                        "where p.CategoryID = c.CategoryID";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("ID"));
                p.setName(rs.getString("Name"));
                Category c = new Category(rs.getInt("CategoryId"), rs.getString("CategoryName"), rs.getString("Description"));
                p.setCategory(c);
                p.setPrice(rs.getString("Price"));
                p.setImage(rs.getString("Image"));
                p.setDescription(rs.getString("Description"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    public void deleteByProductname(String pName) {
        try {
            String sql = "delete from Products where ID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pName);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void UpdateProductName(Product p) {
        try {
            String sql = "update Products "
                    +    "set Name=?\n" +
                         "where ID=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getName());
            statement.setString(2, p.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void UpdateProductPrice(Product p) {
        try {
            String sql = "update Products "
                    +    "set Price=?\n" +
                         "where ID=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getPrice());
            statement.setString(2, p.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void UpdateProductImage(Product p) {
        try {
            String sql = "update Products "
                    +    "set Image=?\n" +
                         "where ID=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getImage());
            statement.setString(2, p.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void UpdateProductDescription(Product p) {
        try {
            String sql = "update Products "
                    +    "set Description=?\n" +
                         "where ID=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getDescription());
            statement.setString(2, p.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void UpdateProductCategoryID(Product p) {
        try {
            String sql = "update Products "
                    +    "set CategoryID=?\n" +
                         "where ID=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, p.getCategory().getCatID());
            statement.setString(2, p.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Product> getListByPage(List<Product> list,
            int start,int end){
        List<Product> arr=new ArrayList<>();
        for(int i=start;i<end;i++){
            arr.add(list.get(i));
        }
        return arr;
    }
    public List<Product> searchProduct(String productName){
        List<Product> list = new ArrayList<>();
        String sql="select * \n" +
                        "from Products\n" +
                        "where Name like ?";
        try {           
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, "%"+productName+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) { 
                Product p = new Product(rs.getString("ID"), rs.getString("Name"), new Category(rs.getInt("CategoryId"), rs.getString("Name"), rs.getString("Description")), 
                        rs.getString("Price"), rs.getString("Image"), rs.getString("Description"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    public void insertProduct(String pid, String pname, int categoryid, String price, String image, String description){
        try {
            String sql="insert into Products(ID,Name,CategoryID,Price,[Image],[Description])\n" +
                        "values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            ps.setString(2, pname);
            ps.setInt(3, categoryid);
            ps.setString(4, price);
            ps.setString(5, image);
            ps.setString(6, description);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public boolean checkProduct(String productid){
        String sql="select * \n" +
                        "from Products\n" +
                        "where ID=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, productid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                return false;
            }
        } catch (SQLException e) {
        }
        return true;
    }
}
