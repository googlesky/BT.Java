/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author googlesky
 */
public class bai6main {

    public static void main(String[] args) {
        int A = 0;
        Scanner ins = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào 1 số nguyên: ");
        A = ins.nextInt();
        int check = 0;
        for (int i = 2; i < A; i++) {
            if (A % i == 0) {
                check = 0;
                break;
            } else {
                check = 1;
            }
        }
        if (A != 1) {
            if (check == 0) {
                System.out.println("Đây không phải là số nguyên tố!");
            } else {
                System.out.println("Đây là số nguyên tố!");
            }
        }
        else {
            System.out.println("Số 1 là số nguyên tố mà ._.!");
        }
        System.out.printf("Nhị Phân: %s", Integer.toString(A, 2));
    }
}
