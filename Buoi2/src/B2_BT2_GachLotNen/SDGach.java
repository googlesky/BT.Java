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
public class SDGach {
    public static int minChiPhi(Gach[] DSGach) {
        int minIndex = 0;
        int Index = 0;
        double minChiPhi = 999999999;
        for (Gach tgach : DSGach) {
            if (minChiPhi >= tgach.getChiPhiLot()) {
                minIndex = Index;
                minChiPhi = tgach.getChiPhiLot();
            }
            Index++;
        }
        return minIndex;
    }
    public static long chiPhiMuaGach(Gach t,int ChieuDai, int ChieuRong){
        return t.soLuongHop(ChieuDai, ChieuRong)*t.getGiaBan();
        
    }
    public static void main(String args[]) {
        int minCP,slGach;
        System.out.print("Mời bạn nhập vào số lượng loại Gạch: ");
        Scanner sn = new Scanner(System.in);
        slGach = sn.nextInt();
        Gach[] DSGach = new Gach[slGach-1];
        for (int i = 0;i<slGach;i++) {
            DSGach[i] = new Gach();
            DSGach[i].nhap();
        }
        for (int i = 0;i<slGach;i++) {
            DSGach[i].xuat();
        }
        minCP = minChiPhi(DSGach);
        System.out.print("\nThông tin loại gạch thấp nhất: ");
        DSGach[minCP].xuat();
        System.out.printf("\nChi phí mua gạch rẻ nhất để lót 5x20m là %d VND",chiPhiMuaGach(DSGach[minCP], 5, 20));
        
    }


}
