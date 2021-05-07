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
import model.Users;


/**
 *
 * @author sontriplelift
 */
public class AccountDAO extends DBContext{
    //login
    public Users getAccount(String username, String password){
        String sql="select * from Users where Username=? and Pass=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Users(rs.getString("Username"), rs.getString("Pass"), rs.getString("email"), rs.getString("phone"), rs.getString("address"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public Users getAccountByName(String username){
        String sql="select * from Users where Username=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Users(rs.getString("Username"), rs.getString("Pass"), rs.getString("email"), rs.getString("phone"), rs.getString("address"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    //2.Dang ki user
    //1-Check user name
    public boolean checkUserName(String username){
        String sql="select * from Users where Username=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return true;
    }
    //2-Dang ki account
    public void signUpAccount(String username, String password, String email, String phone, String address) {
        try {
            String sql = "insert into Users (Username,Pass,email,phone,address) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, address);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public List<Users> getAllUser() {
        List<Users> list = new ArrayList<>();
        try {
            String sql = "select * from [Users] where Username not like 'admin'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Users u = new Users();
                u.setUsername(rs.getString("Username"));
                u.setPhone(rs.getString("phone"));
                u.setEmail(rs.getString("email"));
                u.setAddress(rs.getString("address"));
                list.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    public void deleteByUsername(String username) {
        try {
            String sql = "delete from [Users] where Username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void UpdatePassword(Users us) {
        try {
            String sql = "update Users\n" +
                        "set Pass=?\n" +
                         "where Username=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, us.getPass());
            statement.setString(2, us.getUsername());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void UpdatePhone(Users us) {
        try {
            String sql = "update Users\n" +
                        "set phone=?\n" +
                         "where Username=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, us.getPhone());
            statement.setString(2, us.getUsername());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void UpdateEmail(Users us) {
        try {
            String sql = "update Users\n" +
                        "set email=?\n" +
                         "where Username=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, us.getEmail());
            statement.setString(2, us.getUsername());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void UpdateAddress(Users us) {
        try {
            String sql = "update Users\n" +
                        "set address=?\n" +
                         "where Username=?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, us.getAddress());
            statement.setString(2, us.getUsername());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
