/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anhnguyen
 */
public class Tiendichvu {
    private String ten;
    private float gia1sodien;
    private float gia1sonuoc;
    private float giagui1xemay;
    private float giagui1xedap;
    private float giavesinh1nguoi;
    private String mota;

    public Tiendichvu() {
    }

    public Tiendichvu(String ten, float gia1sodien, float gia1sonuoc, float giagui1xemay, float giagui1xedap, float giavesinh1nguoi, String mota) {
        this.ten = ten;
        this.gia1sodien = gia1sodien;
        this.gia1sonuoc = gia1sonuoc;
        this.giagui1xemay = giagui1xemay;
        this.giagui1xedap = giagui1xedap;
        this.giavesinh1nguoi = giavesinh1nguoi;
        this.mota = mota;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia1sodien() {
        return gia1sodien;
    }

    public void setGia1sodien(float gia1sodien) {
        this.gia1sodien = gia1sodien;
    }

    public float getGia1sonuoc() {
        return gia1sonuoc;
    }

    public void setGia1sonuoc(float gia1sonuoc) {
        this.gia1sonuoc = gia1sonuoc;
    }

    public float getGiagui1xemay() {
        return giagui1xemay;
    }

    public void setGiagui1xemay(float giagui1xemay) {
        this.giagui1xemay = giagui1xemay;
    }

    public float getGiagui1xedap() {
        return giagui1xedap;
    }

    public void setGiagui1xedap(float giagui1xedap) {
        this.giagui1xedap = giagui1xedap;
    }

    public float getGiavesinh1nguoi() {
        return giavesinh1nguoi;
    }

    public void setGiavesinh1nguoi(float giavesinh1nguoi) {
        this.giavesinh1nguoi = giavesinh1nguoi;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
}
