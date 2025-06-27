/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.han.end;

import java.time.LocalDate;

/**
 *
 * @author trant
 */
public class GiangVienCoHuu extends GiangVien{
    private double luongCoBan;
    private double heSoLuong;

    public GiangVienCoHuu( String hoVaTen, LocalDate ngaySinh, String hocHam, String hocVi, double luongCoBan, double heSoLuong) {
        super(hoVaTen, ngaySinh, hocHam, hocVi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    /**
     * @return the luongCoBan
     */
    public double getLuongCoBan() {
        return luongCoBan;
    }

    /**
     * @param luongCoBan the luongCoBan to set
     */
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    /**
     * @return the heSoLuong
     */
    public double getHeSoLuong() {
        return heSoLuong;
    }

    /**
     * @param heSoLuong the heSoLuong to set
     */
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double tinhLuong(int soGioLam) {
        return soGioLam * this.getThuLao() + this.luongCoBan * this.heSoLuong;
    }
    
    
}
