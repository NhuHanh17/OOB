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
public abstract class GiangVien {
    private int thuLao = 90000;
    private String hoVaTen;
    private LocalDate ngaySinh;
    private String hocHam;
    private String hocVi;
    private LocalDate ngayBatDau = LocalDate.now();

    public GiangVien(String hoVaTen, LocalDate ngaySinh, String hocHam, String hocVi) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
    }

    /**
     * @return the hoVaTen
     */
    public String getHoVaTen() {
        return hoVaTen;
    }

    /**
     * @param hoVaTen the hoVaTen to set
     */
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }
    
        /**
     * @return the thuLao
     */
    public int getThuLao() {
        return thuLao;
    }

    /**
     * @param thuLao the luongCoBan to set
     */
    public void setThuLao(int thuLao) {
        this.thuLao = thuLao;
    }
    
    public abstract double tinhLuong(int soGioLam);


}
