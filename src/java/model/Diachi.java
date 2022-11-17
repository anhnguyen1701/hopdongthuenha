/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anhnguyen
 */
public class Diachi {
    private int id;
    private String sonha;
    private String toanha;
    private String xompho;
    private String phuongxa;
    private String quanhuyen;
    private String tinhthanh;

    public Diachi() {
    }

    public Diachi(int id, String sonha, String toanha, String xompho, String phuongxa, String quanhuyen, String tinhthanh) {
        this.id = id;
        this.sonha = sonha;
        this.toanha = toanha;
        this.xompho = xompho;
        this.phuongxa = phuongxa;
        this.quanhuyen = quanhuyen;
        this.tinhthanh = tinhthanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getToanha() {
        return toanha;
    }

    public void setToanha(String toanha) {
        this.toanha = toanha;
    }

    public String getXompho() {
        return xompho;
    }

    public void setXompho(String xompho) {
        this.xompho = xompho;
    }

    public String getPhuongxa() {
        return phuongxa;
    }

    public void setPhuongxa(String phuongxa) {
        this.phuongxa = phuongxa;
    }

    public String getQuanhuyen() {
        return quanhuyen;
    }

    public void setQuanhuyen(String quanhuyen) {
        this.quanhuyen = quanhuyen;
    }

    public String getTinhthanh() {
        return tinhthanh;
    }

    public void setTinhthanh(String tinhthanh) {
        this.tinhthanh = tinhthanh;
    }
    
}
