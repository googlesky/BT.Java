/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author googlesky
 */
public class bai5main {
    static int a,b,c;
    public static void nhap(){
        int a,b,c;
        Scanner ins = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào só A: ");
        a = ins.nextInt();
        System.out.print("Mời bạn nhập vào só B: ");
        b = ins.nextInt();
        System.out.print("Mời bạn nhập vào só C: ");
        c = ins.nextInt();
        bai5main.a = a;
        bai5main.b = b;
        bai5main.c = c;
    }
    public static void tinhx(){
        int a = bai5main.a;
        int b = bai5main.b;
        int c = bai5main.c;
        float x1,x2;
        if(a == 0){
            x1 = -c/b;
            System.out.printf("X = %.2f",x1);
        }
        else{
            float delta = b*b - 4*a*c;
            if(delta >= 0){
                x1 = (float) ((-b - Math.sqrt(delta))/(2*a));
                x2 = (float) ((-b + Math.sqrt(delta))/(2*a));
                System.out.println("Phương trình có nghiệm: ");
                System.out.printf("X1 = %.2f\n",x1);
                System.out.printf("X1 = %.2f",x2);
            }
            else{
                System.out.print("Phương trình vô nghiệm!");
            }
        }
    }
    public static void main(String[] args) {
        nhap();
        tinhx();
    }
}
