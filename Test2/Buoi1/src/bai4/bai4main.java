/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author googlesky
 */
public class bai4main {

    public static void main(String[] args) {
        int a, b;
        System.out.print("Mời bạn nhập số A: ");
        Scanner ins = new Scanner(System.in);
        a = ins.nextInt();
        System.out.print("Mời bạn nhập số B: ");
        b = ins.nextInt();
        int tong = a + b;
        System.out.println("Tổng Là: " + tong);
    }
}
