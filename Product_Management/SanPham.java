/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.opp.ontap;

/**
 *
 * @author trant
 */
public abstract class SanPham {
    private int maSp;
    private String tenSp;
    private double gia;

    public SanPham(int maSp, String tenSp, double gia) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.gia = gia;
    }

    /**
     * @return the maSp
     */
    public int getMaSp() {
        return maSp;
    }

    /**
     * @param maSp the maSp to set
     */
    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    /**
     * @return the tenSp
     */
    public String getTenSp() {
        return tenSp;
    }

    /**
     * @param tenSp the tenSp to set
     */
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void hienThi(){
        System.out.printf("==============\n"
                + "Ma san pham: %d \n"
                + "Ten san pham: %s \n"
                + "Gia tien: %.1f vnd \n", this.maSp, this.tenSp, this.gia);
    }
}
