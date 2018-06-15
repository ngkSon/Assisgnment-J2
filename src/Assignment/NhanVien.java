/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class NhanVien implements Serializable{
    private String manv,tennv,email;
    private double luong;
    private int tuoi;

    public NhanVien() {
        this.manv = "NV001";
        this.tennv = "Ngọc";
        this.email = "Ngoc001@gmail.com";
        this.luong = 5;
        this.tuoi = 21;
    }

    public NhanVien(String manv, String tennv, String email, double luong, int tuoi) {
        this.manv = manv;
        this.tennv = tennv;
        this.email = email;
        this.luong = luong;
        this.tuoi = tuoi;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Ma nv: " + this.manv + "\nTen nv: " +this.tennv + "\nTuoi: " + this.tuoi + "\nEmail: " + this.email + "\nLuong: " + this.luong;
    }

    
    
    
}
