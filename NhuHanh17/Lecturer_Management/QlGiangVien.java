/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.han.end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author trant
 */
public class QlGiangVien {
    private List<GiangVien> ds = new ArrayList<>();

    /**
     * @return the ds
     */
    public List<GiangVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<GiangVien> ds) {
        this.ds = ds;
    }
    
    public void themGV(GiangVien...a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void xoaGV(GiangVien a){
        this.ds.remove(a);
    }
    
}
