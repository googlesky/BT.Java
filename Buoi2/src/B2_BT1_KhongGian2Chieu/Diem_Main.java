/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2_BT1_KhongGian2Chieu;

/**
 *
 * @author GoogleSky
 */
public class Diem_Main {
    public static void main(String args[]){
        Diem A = new Diem();
        Diem B = new Diem();
        A.nhap();
        System.out.print("Điểm Bạn vừa nhập là:");A.xuat();
        B.nhap();
        System.out.print("Điểm Bạn vừa nhập là:");B.xuat();
        Diem C = A.timDoiXungQuaTam();
        Diem D = B.timDoiXungQuaTam();
        System.out.print("\nĐiểm C:");C.xuat();
        System.out.print("\nĐiểm D:");D.xuat();
        System.out.printf("\nKhoản cách AD: %f",A.tinhDoDaiDoanThang(D));
        System.out.printf("\nKhoản cách BC: %f",B.tinhDoDaiDoanThang(C));
        Diem M = A.timTrungDiem(B);
        Diem N = C.timTrungDiem(D);
        System.out.print("\nĐiểm M:");M.xuat();
        System.out.print("\nĐiểm N:");N.xuat();
        System.out.printf("\nKhoản cách MN: %f",M.tinhDoDaiDoanThang(N));
    }
}
