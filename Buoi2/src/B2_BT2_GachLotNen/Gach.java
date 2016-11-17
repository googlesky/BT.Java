/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2_BT2_GachLotNen;

import java.util.Scanner;

/**
 *
 * @author GoogleSky
 */
public class Gach {

    private String MaSo;
    private String Mau;
    private int SoLuong;
    private int ChieuDai;
    private int ChieuNgang;
    private long GiaBan;

    public Gach() {
        this.MaSo = "0";
        this.Mau = "";
        this.SoLuong = 1;
        this.ChieuDai = 1;
        this.ChieuNgang = 1;
        this.GiaBan = 1;

    }

    public Gach(String MaSo, String Mau, int SoLuong, int ChieuDai, int ChieuNgang, long GiaBan) {
        this.MaSo = MaSo;
        this.Mau = Mau;
        this.SoLuong = SoLuong;
        this.ChieuDai = ChieuDai;
        this.ChieuNgang = ChieuNgang;
        this.GiaBan = GiaBan;
    }

    public String getMaSo() {
        return MaSo;
    }

    public String getMau() {
        return Mau;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getChieuDai() {
        return ChieuDai;
    }

    public int getChieuNgang() {
        return ChieuNgang;
    }

    public long getGiaBan() {
        return GiaBan;
    }

    public void setMaSo(String MaSo) {
        this.MaSo = MaSo;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setChieuDai(int ChieuDai) {
        this.ChieuDai = ChieuDai;
    }

    public void setChieuNgang(int ChieuNgang) {
        this.ChieuNgang = ChieuNgang;
    }

    public void setGiaBan(long GiaBan) {
        this.GiaBan = GiaBan;
    }

    public void nhap() {
        System.out.print("\nMời bạn nhập thông tin Gạch: \n");
        System.out.print("Mã Số: ");
        Scanner sn = new Scanner(System.in);
        this.MaSo = sn.nextLine();
        System.out.print("Màu: ");
        this.Mau = sn.nextLine();
        System.out.print("Số Lượng: ");
        this.SoLuong = sn.nextInt();
        System.out.print("Chiều Dài: ");
        this.ChieuDai = sn.nextInt();
        System.out.print("Chiều Rộng: ");
        this.ChieuNgang = sn.nextInt();
        System.out.print("Giá Bán: ");
        this.GiaBan = sn.nextLong();

    }

    public void xuat() {
        System.out.print("\nThông tin Gạch: ");
        System.out.print("\nMã Số: "+this.MaSo);
        System.out.print("\nMàu: "+this.Mau);
        System.out.print("\nSố Lượng: "+this.SoLuong);
        System.out.print("\nChiều Dài: "+this.ChieuDai);
        System.out.print("\nChiều Rộng: "+this.ChieuNgang);
        System.out.print("\nGiá Bán: "+this.GiaBan);
    }
    public double giaBanLe(){
        return (this.GiaBan/this.SoLuong)+(this.GiaBan/this.SoLuong)*0.2;
    }
    
    public double tinhDienTich(){
        return this.ChieuDai*this.ChieuNgang*this.SoLuong;
    }
    
    public int soLuongHop(int D, int N){
        return (int) Math.round((D*N)/this.tinhDienTich());
    }
    
    public double getChiPhiLot(){
        return this.GiaBan/this.tinhDienTich();
    }
}
