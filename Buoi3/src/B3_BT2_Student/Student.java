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
public class Student extends Person {

    private double diemTB;
    private double diemRL;

    public Student() {
        super();
        this.diemTB = 0;
        this.diemRL = 0;
    }

    public Student(String HoVaTen, String GioiTinh, String NamSinh, String DiaChi, double diemTB, double diemRL) {
        super(HoVaTen, GioiTinh, NamSinh, DiaChi);
        this.diemTB = diemTB;
        this.diemRL = diemRL;
    }
    
    public void nhap(){
        super.nhap();
        Scanner sn = new Scanner(System.in);
        System.out.print("Điểm Trung Bình: "); 
        this.diemTB = sn.nextDouble();
        System.out.print("Điểm Rèn Luyện: "); 
        this.diemRL = sn.nextDouble();
    }
    
    public void xuat(){
        super.xuat();
        System.out.printf("Điểm Trung Bình: %.2f \n",this.diemTB); 
        System.out.printf("Điểm Rèn Luyện: %.2f \n",this.diemRL); 
    }
    
    public int xepLoai(){
        if(this.diemRL>9 && this.diemTB>9){ return 1; }
        else if(this.diemRL>8 && this.diemTB>8){ return 2; }
        else if(this.diemRL>6 && this.diemTB>6){ return 3; }
        else if(this.diemRL>4 && this.diemTB>4){ return 4; }
        else { return 5; }
    }
    
    
}
