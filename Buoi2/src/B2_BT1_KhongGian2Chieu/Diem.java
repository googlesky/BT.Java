/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2_BT1_KhongGian2Chieu;

import java.util.Scanner;

/**
 *
 * @author GoogleSky
 */
public class Diem {

    private int x;
    private int y;

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getTungDo() {
        return this.x;
    }

    public int getHoanhDo() {
        return this.y;
    }

    public void setTungDo(int x) {
        this.x = x;
    }

    public void setHoanhDo(int y) {
        this.y = y;
    }

    public void Copy(Diem t) {
        this.x = t.getTungDo();
        this.y = t.getHoanhDo();
    }

    public void nhap() {
        System.out.print("Chương trình nhập tọa độ: \n");
        System.out.print("Mời bạn nhập vào x: ");
        Scanner sn = new Scanner(System.in);
        this.x = sn.nextInt();
        System.out.print("Mời bạn nhập vào y:");
        this.y = sn.nextInt();
    }

    public void xuat() {
        System.out.printf("(%d,%d)", x, y);
    }

    public double tinhDoDaiDoanThang(Diem t) {
        return Math.sqrt(Math.pow(this.x - t.getTungDo(), 2) + Math.pow(this.x - t.getHoanhDo(), 2));
    }

    public double tinhDoDaiDenO() {
        Diem t = new Diem(0, 0);
        return this.tinhDoDaiDoanThang(t);
    }

    public Diem timDoiXungQuaTam() {
        Diem t = new Diem(-1 * x, -1 * y);
        return t;
    }

    public Diem timDoiXungQuaOy() {
        Diem t = new Diem(-1 * this.x, y);
        return t;
    }

    public Diem timDoiXungQuaOx() {
        Diem t = new Diem(x, -1 * y);
        return t;
    }
    
    public Diem timTrungDiem(Diem te){
        Diem t = new Diem((x+te.getTungDo())/2,(y+te.getHoanhDo())/2);
        return t;
    }
}
