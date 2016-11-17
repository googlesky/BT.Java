/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B3_BT1_DiemMau;

import java.util.Scanner;

/**
 *
 * @author googlesky
 */
public class Diem {
    private int x,y;

    public Diem() {
    this.x=0;
    this.y=0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void saoChep(Diem X){
        this.x = X.getX();
        this.y = X.getY();
    }
    
    public int hoanhDo(){
        return this.x;
    }
    
    public int tungDo(){
        return this.y;
    }
    
    public void nhap(){
        System.out.print("Mời bạn nhập vào tọa độ trục Hoành: ");
        Scanner sn = new Scanner(System.in);
        this.x= sn.nextInt();
        System.out.print("Mời bạn nhập vào tọa độ trục Tung: ");
        this.y = sn.nextInt();
    }
    
    public void xuat(){
        System.out.printf("(%d,%d)",this.x,this.y);
    }
    
    public double khoanCach(Diem X){
        double KQ = Math.sqrt((this.x-X.getX())*(this.x-X.getX()) - (this.y-X.getY())*(this.y-X.getY()));
        return KQ;
    }
    
    public double khoanCachDenO(){
        Diem O = new Diem(0,0);
        return this.khoanCach(O);
    }
    
    public Diem doiXungQuaTam(){
        Diem A = new Diem(-this.x,-this.y);
        return A;
    }
    
    public Diem doiXungQuaTungDo(){
        Diem A = new Diem(-this.x,this.y);
        return A;
    }
    
    public Diem doiXungQuaHoanhDo(){
        Diem A = new Diem(this.x,-this.y);
        return A;
    }
    
}
