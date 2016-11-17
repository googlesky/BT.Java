/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_BT3_PTB2;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class PTB2 {

    private float a, b, c;
    private double x1, x2;
    private int songhiem;
    private double delta;

    public PTB2() {
        a = 0;
        b = 0;
        c = 0;
    }

    public PTB2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void nhap() {
        System.out.print("Mời bạn nhập vào a: ");
        Scanner sn = new Scanner(System.in);
        this.a = sn.nextFloat();
        System.out.print("Mời bạn nhập vào b: ");
        this.b = sn.nextFloat();
        System.out.print("Mời bạn nhập vào c: ");
        this.c = sn.nextFloat();
    }

    public void xuat() {
        System.out.printf("\n" + "Phương trình có dạng: %.2fx^2 + %.2fx + %.2fx = 0\n", this.a, this.b, this.c);
    }

    public void TinhDelta() {
        this.delta = b * b - 4 * a * c;
    }

    public void TinhNghiem() {
        if (this.a != 0) {
            //nếu a khác 0
            this.x1 = (-b + Math.sqrt(delta)) / (2 * a);
            this.x2 = (-b - Math.sqrt(delta)) / (2 * a);
            this.songhiem =2;
        } else {
            //nếu a = 0
            if (this.b != 0) {
                //b khác 0
                this.x1 = -c / b;
                this.songhiem = 1;
            } else {
                //b = 0
                if (c != 0) {
                    System.out.println("Phương trình vô nghiệm!");
                    this.songhiem = -1;
                } else {
                    System.out.println("Phương trình vô số nghiệm!");
                    this.songhiem = 9999;
                }
            }
        }
    }

    public void print() {
        this.xuat();
        if ((this.songhiem == 1) || (this.songhiem == 2)) {
            System.out.printf("Phương trình có %d nghiệm: x = %.2f", this.songhiem, this.x1);
            if ((this.songhiem == 2)&&(this.x1!=this.x2)) {
                System.out.printf(" và x = %.2f \n", x2);
            }
        }
    }

    public double getX1() {
        return this.x1;
    }

    public double getX2() {
        return this.x2;
    }

    public int getSoNghiem() {
        return this.songhiem;
    }

    public static void main(String args[]) {
        PTB2 pt;
        pt = new PTB2(1, 2, 1);
        pt.TinhNghiem();
        pt.print();
    }
}
