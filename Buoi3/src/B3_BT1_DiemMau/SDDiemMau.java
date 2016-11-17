/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3_BT1_DiemMau;

/**
 *
 * @author googlesky
 */
public class SDDiemMau {
    public static void main(String args[]){
        DiemMau A = new DiemMau(5,10,"Trắng");
        DiemMau B = new DiemMau();
        A.xuat();
        B.nhap();
        B.xuat();
    }
}
