/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.opp.ontap;

/**
 *
 * @author trant
 */
public class BangDia extends SanPham{
    private int doDai;

    public BangDia(int maSp, String tenSp, double gia, int doDai) {
        super(maSp, tenSp, gia);
        this.doDai = doDai;
    }

    /**
     * @return the doDai
     */
    public int getDoDai() {
        return doDai;
    }

    /**
     * @param doDai the doDai to set
     */
    public void setDoDai(int doDai) {
        this.doDai = doDai;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Do dai: %d \n", this.doDai);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}

