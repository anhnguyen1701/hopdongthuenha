/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

/**
 *
 * @author anhnguyen
 */
public class Thanhvien {
    private int id;
    private String username;
    private String password;
    private Hoten hoten;
    private Diachi quequan;
    private Date ngaysinh;
    private String soCCCD;
    private String sodienthoai;
    private String email;

    public Thanhvien() {
    }

    public Thanhvien(int id, String username, String password, Hoten hoten, Diachi quequan, Date ngaysinh, String soCCCD, String sodienthoai, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.hoten = hoten;
        this.quequan = quequan;
        this.ngaysinh = ngaysinh;
        this.soCCCD = soCCCD;
        this.sodienthoai = sodienthoai;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Hoten getHoten() {
        return hoten;
    }

    public void setHoten(Hoten hoten) {
        this.hoten = hoten;
    }

    public Diachi getQuequan() {
        return quequan;
    }

    public void setQuequan(Diachi quequan) {
        this.quequan = quequan;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
