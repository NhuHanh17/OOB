/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.opp.ontap;

import java.util.Scanner;

/**
 *
 * @author trant
 */
public class Ontap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        QuanLySanPham ds = new QuanLySanPham();
        SanPham a = new Sach(1, "OOP", 150, 10);
        SanPham b = new BangDia(2, "A", 50, 70);
        ds.themSanPham(a, b);
        
        do {
            System.out.print("=========================MENU=========================\n"
                    + "1 \n2 \n3 \n4 \n5 \n6 \n7 \n"
                    + "-> Lua chon: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    int sp;
                    System.out.print("-Them san pham:\n"
                            + "Chon loai san pham: 1.sach / 2.Bang dia ");
                    sp = sc.nextByte();
                    System.out.print("Nhap ma san pham: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap ten san pham: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap gia tien: ");
                    double price = sc.nextDouble();

                    if (sp == 1) {
                        System.out.print("Nhap so trang: ");
                        int soTrang = sc.nextInt();
                        ds.themSanPham(new Sach(id, name, price, soTrang));
                        System.out.println("Them sach thanh cong");
                    } else {
                        if (sp == 2) {
                            System.out.print("Nhap do dai: ");
                            int doDai = sc.nextInt();
                            ds.themSanPham(new BangDia(id, name, price, doDai));
                            System.out.println("Them bang dia thanh cong");
                        } else {
                            break;
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("=====Danh sach san pham giam dan theo gia tien=====");
                    ds.sapXep1();
                    ds.hienThi();
                    break;
                case 6:
                    System.out.println("=====Danh sach san pham=====");
                    ds.hienThi();
                    break;
                case 7:
                    System.out.println("Cam on da su dung chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        } while (choose != 7);
    }
}
