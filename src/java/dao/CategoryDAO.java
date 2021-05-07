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
import model.Category;

/**
 *
 * @author sontriplelift
 */
public class CategoryDAO extends DBContext{
    public List<Category> getAllCategories(){
        String sql="select * from Categories";
        List<Category> list = new ArrayList<>();
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(); 
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2),rs.getString(3)));
            }
            return list;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    //lay ten category
    public Category getCatByID(int id){
        String sql="select * from Categories where CategoryID=?";
        try{
            PreparedStatement st=con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next())
                return new Category(rs.getInt(1),
                           rs.getString(2),
                           rs.getString(3));
        }catch(SQLException e){
            System.out.println(e);
        }        
        return null;
    }
    
    // add
    public List<Category> getListCategory(int pageIndex) throws SQLException {
        List<Category> list = new ArrayList<>();
        try {
            String query = "select * from("
                    + "select ROW_NUMBER() over (order by CategoryID ASC) as rn, *\n"
                    + "from Categories"
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
                Category p = new Category();
                p.setCatID(rs.getInt("CategoryID"));
                p.setCatname(rs.getString("CategoryName"));
                p.setDescription(rs.getString("Description"));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //dem so hang trong bang category
    public int getCount() throws SQLException {
        int count = 0;
        try {
            String query = "select count(*) from Categories";

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
    
    //lay category
    public Category getCategory(int categoryId){
        String query="select * from Categories\n" +
                     "where CategoryID=?";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, categoryId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) { 
                Category p = new Category(rs.getInt("CategoryID"), rs.getString("CategoryName"), rs.getString("Description"));
                        
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
//    public List<Category> getListCategorybyCatid(int pageIndex, int categoryId) throws SQLException {
//        List<Category> list = new ArrayList<>();
//        try {
//            String query = "select * from("
//                    + "select ROW_NUMBER() over (order by ID ASC) as rn, *\n"
//                    + "from Categories where CategoryId=?"
//                    + ")as x\n"
//                    + "where rn between (?-1)*?+1"
//                    + "and ?*?";
//
//            PreparedStatement ps = con.prepareStatement(query);
//            ps.setInt(1, categoryId);
//            ps.setInt(2, pageIndex);
//            ps.setInt(3, 6);
//            ps.setInt(4, pageIndex);
//            ps.setInt(5, 6);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Category p = new Category();
//                p.setId(rs.getString("ID"));
//                p.setName(rs.getString("Name"));
//                Category c = new Category(rs.getInt("CategoryId"), rs.getString("Name"), rs.getString("Description"));
//                p.setCategory(c);
//                p.setPrice(rs.getString("Price"));
//                p.setImage(rs.getString("Image"));
//                p.setDescription(rs.getString("Description"));
//                list.add(p);
//            }
//            return list;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    
//    public int getCountbyCatId(int categoryId) throws SQLException {
//        int count = 0;
//        try {
//            String query = "select count(*) from Categories where CategoryId=?";
//
//            PreparedStatement ps = con.prepareStatement(query);
//            ps.setInt(1, categoryId);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                count = rs.getInt(1);
//            }
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return count;
//   }
    
//    public int getLastOrderID() {
//        int orderID = 0;
//        try {
//            String sql = "select top(1) OrderID from [Orders] order by OrderID desc";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                return rs.getInt(1);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return orderID;
//    }
//    public void Buy(int orderID, int quantity, String total, String pID, String username) {
//        try {
//            String sql = "insert into [Orders] "
//                    + "(OrderID, OrderQuantity, TotalPrice, CategoryID, Username) "
//                    + "values (?,?,?,?,?)";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, orderID);
//            ps.setInt(2, quantity);
//            ps.setString(3, total);
//            ps.setString(4, pID);
//            ps.setString(5, username);
//            ps.executeUpdate();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
    
    //lay tat ca category
//    public List<Category> getAllCategories() {
//        List<Category> list = new ArrayList<>();
//        try {
//            String sql = "select p.*, c.CategoryName \n" +
//                        "from Categories p , Categories c\n" +
//                        "where p.CategoryID = c.CategoryID";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Category p = new Category();
//                p.setId(rs.getString("ID"));
//                p.setName(rs.getString("Name"));
//                Category c = new Category(rs.getInt("CategoryId"), rs.getString("CategoryName"), rs.getString("Description"));
//                p.setCategory(c);
//                p.setPrice(rs.getString("Price"));
//                p.setImage(rs.getString("Image"));
//                p.setDescription(rs.getString("Description"));
//                list.add(p);
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return list;
//    }
    
    public void deleteByCategoryname(String cName) {
        try {
            String sql = "delete from Categories where CategoryName = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cName);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void UpdateCategoryName(Category p) {
        try {
            String sql = "update Categories "
                    +    "set CategoryName=?\n" +
                         "where CategoryID=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getCatname());
            statement.setInt(2, p.getCatID());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void UpdateCategoryImage(Category p) {
        try {
            String sql = "update Categories "
                    +    "set Description=?\n" +
                         "where CategoryID=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getDescription());
            statement.setInt(2, p.getCatID());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public List<Category> getListByPage(List<Category> list,
            int start,int end){
        List<Category> arr=new ArrayList<>();
        for(int i=start;i<end;i++){
            arr.add(list.get(i));
        }
        return arr;
    }
    
    
    public void insertCategory(int cid, String cname, String description){
        try {
            String sql="insert into Categories(CategoryID,CategoryName,Description)\n" +
                        "values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cid);
            ps.setString(2, cname);
            
            ps.setString(3, description);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public boolean checkCategory(int categoryid){
        String sql="select * \n" +
                        "from Categories\n" +
                        "where CategoryID=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, categoryid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                return false;
            }
        } catch (SQLException e) {
        }
        return true;
    }
}
