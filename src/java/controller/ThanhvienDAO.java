/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Thanhvien;

/**
 *
 * @author anhnguyen
 */
public class ThanhvienDAO extends DAO{
    public ThanhvienDAO() {
        super();
    }
    
    public boolean dangNhap(Thanhvien tv) {
        String sql = "SELECT * FROM `tblthanhvien` WHERE username = ? AND password = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, tv.getUsername());
            stm.setString(2, tv.getPassword());
            
            ResultSet result = stm.executeQuery();
            if (result.next()) {
                tv.setId(result.getInt("id"));
                tv.setHoten(result.getString("hoten"));
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(ThanhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
