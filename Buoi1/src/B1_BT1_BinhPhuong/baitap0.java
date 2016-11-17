/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package B1_BT1_BinhPhuong;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class baitap0 {

    public static int binhphuong(int n) {
        int kq = n * n;
        return kq;
    }

    public static void main(String args[]) {
        System.out.println("Nhập vào số N: ");
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        float kq = (float) Math.sqrt(n);
        System.out.println("\nCăn Bật 2:" + kq);
        int bp = baitap0.binhphuong(n);
        System.out.println("\nBình Phương: " + bp);
    }
}
