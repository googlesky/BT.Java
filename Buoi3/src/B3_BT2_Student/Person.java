/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3_BT2_Student;

import java.util.Scanner;

/**
 *
 * @author googlesky
 */
public class Person {
    private String HoVaTen;
    private String GioiTinh;
    private String NamSinh;
    private String DiaChi;

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public Person() {
        this.HoVaTen = "";
        this.GioiTinh = "Nam";
        this.NamSinh = "01/01/1900";
        this.DiaChi = "VietNam";
    }
    public Person(String HoVaTen, String GioiTinh, String NamSinh, String DiaChi) {
        this.HoVaTen = HoVaTen;
        this.GioiTinh = GioiTinh;
        this.NamSinh = NamSinh;
        this.DiaChi = DiaChi;
    }
    
    public Person(Person T){
        this.HoVaTen = T.getHoVaTen();
        this.GioiTinh = T.getGioiTinh();
        this.NamSinh = T.getNamSinh();
        this.DiaChi = T.getDiaChi();
    }
    
    public void nhap(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Họ và Tên: ");
        this.HoVaTen = sn.nextLine();
        System.out.print("Giới Tính: ");
        this.GioiTinh = sn.nextLine();
        System.out.print("Năm Sinh: ");
        this.NamSinh = sn.nextLine();
        System.out.print("Địa Chỉ: ");
        this.DiaChi = sn.nextLine();
    }
    
    public void xuat(){
        System.out.printf("Họ và Tên: %s \n",this.HoVaTen);
        System.out.printf("Giới Tính: %s \n",this.GioiTinh);
        System.out.printf("Năm Sinh: %s \n",this.NamSinh);
        System.out.printf("Địa Chỉ: %s \n",this.DiaChi);
    }
}
