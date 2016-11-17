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
public class SDStudent {
    public static void main(String args[]){
        Student [] HV;
        Scanner sn = new Scanner(System.in );
        System.out.print("Bạn muốn nhập bao nhiêu Sinh Viên?: ");
        int soHV = sn.nextInt();
        HV = new Student[soHV];
        for (int i = 0; i < soHV; i++) {
            HV[i] = new Student();
            HV[i].nhap();
        }
        System.out.print("\nDanh sách SV Xuất Sắc: \n");
        for (Student SV : HV) {
            if(SV.xepLoai()==1){
                SV.xuat();
            }
        }
        System.out.print("\nDanh sách SV Giỏi: \n");
        for (Student SV : HV) {
            if(SV.xepLoai()==2){
                SV.xuat();
            }
        }
        System.out.print("\nDanh sách SV Khá: \n");
        for (Student SV : HV) {
            if(SV.xepLoai()==3){
                SV.xuat();
            }
        }
        System.out.print("\nDanh sách SV Trung Bình: \n");
        for (Student SV : HV) {
            if(SV.xepLoai()==4){
                SV.xuat();
            }
        }
        System.out.print("\nDanh sách SV Yếu: \n");
        for (Student SV : HV) {
            if(SV.xepLoai()==5){
                SV.xuat();
            }
        }
        
    }
    
}
