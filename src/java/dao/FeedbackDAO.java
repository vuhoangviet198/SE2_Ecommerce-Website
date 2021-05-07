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
import model.Feedback;

/**
 *
 * @author sontriplelift
 */
public class FeedbackDAO extends DBContext{
    
    public void insertFeedback(String username, String email, String phone, String content){
        try {
            String sql="insert into FeedBack(Username,Email,Phone,Content)\n" +
                    "values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, content);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
   
    
    public List<Feedback> getListFeedbacks(){
         List<Feedback> list = new ArrayList<>();
        try {
            String sql = "select * from [FeedBack]";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Feedback f = new Feedback();
                f.setFname(rs.getString("Username"));
                f.setFmail(rs.getString("Email"));
                f.setFphone(rs.getString("Phone"));
                f.setContent(rs.getString("Content"));
                list.add(f);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
