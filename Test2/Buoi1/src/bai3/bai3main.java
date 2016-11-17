/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author googlesky
 */
public class bai3main {
    public static void main(String[] args){
        int max=0;
        for(int i=0;i<args.length;i++){
            int t = Integer.parseInt(args[i]);
            if(max <= t){
                max = t;
            }
        }
        System.out.print("Con số lớn nhất là:" + max);
    }
}
