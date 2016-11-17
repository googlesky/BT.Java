/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package B1_BT2_TamGiac;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class BT2_TamGiac {
    public static void main(String args[]){
        float a,b,c;
        Scanner sn = new Scanner(System.in);
        System.out.print("\nMời bạn nhập vào cạnh a: ");
        a = sn.nextFloat();
        System.out.print("\nMời bạn nhập vào cạnh b: ");
        b= sn.nextFloat();
        System.out.print("\nMời bạn nhập vào cạnh c: ");
        c = sn.nextFloat();
        if((a+b<=c)||(a+c<=b)||(c+b<=a)){
            System.out.print("\n3 cạnh bạn nhập Không tạo thành tam giác");
        }else{
            float chuvi = a+b+c;
            float p = (a+b+c)/2;
            double tmp = (double) p*(p-a)*(p-b)*(p-c);
            double S = Math.sqrt(tmp);
            System.out.printf("\n\nChu vi: %f" , chuvi);
            System.out.println("\nDiện Tích: " + S);
        }
        
    }
}
