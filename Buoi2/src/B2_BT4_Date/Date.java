/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2_BT4_Date;

import java.util.Scanner;

/**
 *
 * @author googlesky
 */
public class Date {

    private int ngay;
    private int thang;
    private int nam;
    private int[] ArrayThang = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date() {
    }

    public Date(int nam) {
        this.nam = nam;
    }

    public Date(int thang, int nam) {
        this.thang = thang;
        this.nam = nam;
    }

    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void Date(Date n) {
        this.setNgay(n.ngay);
        this.setThang(n.thang);
        this.setNam(n.nam);
    }

    public void nhap() {
        System.out.print("Ngày: ");
        Scanner sn = new Scanner(System.in);
        this.ngay = sn.nextInt();
        System.out.print("Tháng: ");
        this.thang = sn.nextInt();
        System.out.print("Năm: ");
        this.nam = sn.nextInt();

    }

    public void xuat() {
        System.out.printf("%d/%d/%d", this.ngay, this.thang, this.nam);
    }

    public boolean hopLe() {
        if (this.nam > 1900) {
            if (this.nam % 4 == 0) {
                ArrayThang[2] = 29;
            }
            if (this.thang > 0 && this.thang <= 12) {
                if (ArrayThang[this.thang] >= this.ngay) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public Date cong() {
        Date backup = this;
        this.ngay += 1;
        if (this.hopLe()) {
            return this;
        }

        this.ngay = this.ngay % this.ArrayThang[this.thang];
        this.thang += 1;
        if (this.hopLe()) {
            return this;
        }

        this.thang = this.thang % 12;
        this.nam += 1;
        if (this.hopLe()) {
            return this;
        }
        return backup;
    }
    
    public Date cong(int SoNgay){
        for (int i = 0; i < SoNgay; i++) {
            this.cong();
        }
        return this;
    }
}
