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
public class GiangVienThinhGiang extends GiangVien{
    private String noiCongTac;

    public GiangVienThinhGiang(String hoVaTen, LocalDate ngaySinh, String hocHam, String hocVi, String noiCongTac) {
        super(hoVaTen, ngaySinh, hocHam, hocVi);
        this.noiCongTac = noiCongTac;
    }

    /**
     * @return the noiCongTac
     */
    public String getNoiCongTac() {
        return noiCongTac;
    }

    /**
     * @param noiCongTac the noiCongTac to set
     */
    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    @Override
    public double tinhLuong(int soGioLam) {
        return soGioLam * this.getThuLao();
    }
}
