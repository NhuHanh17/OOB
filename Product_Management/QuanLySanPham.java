/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.opp.ontap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author trant
 */
public class QuanLySanPham {
    private List<SanPham> ds = new ArrayList<>();
    
    public void themSanPham(SanPham...a){
        this.getDs().addAll(Arrays.asList(a));
    }
    
    public void xoaSanPham(int id){
        this.getDs().removeIf(s->s.getMaSp() == id);
    }
    
    public void xoaSanPham(SanPham a){
        this.getDs().remove(a);
    }
    
    public void hienThi(){
        this.getDs().forEach(s->s.hienThi());
    }
    
     public SanPham timKiem(int key){
        return this.getDs().stream().filter(s -> s.getMaSp() == key).findFirst().get();
    }
     
     public List<SanPham> timKiem(double giaMin, double giaMax){
         return this.getDs().stream().filter(s -> s.getGia() >= giaMin && s.getGia() <= giaMax).collect(Collectors.toList());
     }
     
     public List<SanPham> timKiem(String str) {
        try {
            Class c = Class.forName(str);
            return this.getDs().stream().filter(s -> c.isInstance(s)).collect(Collectors.toList());
        } catch (ClassNotFoundException ex) {
            return this.getDs().stream().filter(s -> s.getTenSp().contains(str)).collect(Collectors.toList());
        }     
     }
     
     public void sapXep1(){
        this.ds.sort((s1, s2) -> -Double.compare(s1.getGia(), s2.getGia())) ;
     }
     
     public void sapXep2(){
         this.ds.sort((s1, s2) -> {
             double g1 = s1.getGia();
             double g2 = s2.getGia();
             
             if(Double.compare(g1, g2) == 0)
                 return s1.getTenSp().compareToIgnoreCase(s2.getTenSp());
             return Double.compare(g1, g2);
         });
     }

     
    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
     
     
}
