/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3_BT1_DiemMau;

import java.util.Scanner;

/**
 *
 * @author googlesky
 */
public class DiemMau extends Diem {

    private String mau;

    public DiemMau() {
        super();
        this.mau = "";
    }

    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = mau;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void GanMau(String mau) {
        this.mau = mau;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Mời bạn nhập vào màu: ");
        Scanner sn = new Scanner(System.in);
        this.mau = sn.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.printf(" có màu %s",this.mau);
    }
    
    
}
