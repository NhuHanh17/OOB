/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.opp.ontap;

/**
 *
 * @author trant
 */
public class Sach extends SanPham{
    private int soTrang;

    public Sach(int maSp, String tenSp, double gia, int soTrang) {
        super(maSp, tenSp, gia);
        this.soTrang = soTrang;
    }

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("So trang: %d \n", this.soTrang);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
