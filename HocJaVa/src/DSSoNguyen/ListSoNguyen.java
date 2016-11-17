/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSSoNguyen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author GoogleSky
 */
public class ListSoNguyen {
    private List<Integer> DSSoNguyen = new ArrayList<Integer>();
    public ListSoNguyen(){
        DSSoNguyen.add(0, 0);
    }
    public ListSoNguyen(Object args){
        int ArrayLeng = Array.getLength(args);
        if(ArrayLeng>=1){
            for(int i=0;i<=ArrayLeng;i++){
                this.DSSoNguyen.add((Integer) Array.get(args, i));
            }
        }
    }
    public void Nhap(){
        String inp;
        do{
         System.out.println("\nMời bạn nhập một số: "); 
         Scanner sn = new Scanner(System.in);
         inp = sn.nextLine();
         if()
        }while(inp.equals("exit"));
    }
}
