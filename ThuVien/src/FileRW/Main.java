/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileRW;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author googlesky
 */
public class Main {

    public static void main(String args[]) throws IOException {
        FileRW f = new FileRW("D:/phanthuong.txt");
        try {
            f.writeLine("");
        } catch (IOException ex) {
            f.fileEmpty();
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        String phanqua = null;
        while(true){
            System.out.print("Mời bạn nhập vào tên hàng: ");
            Scanner sn = new Scanner(System.in);
            phanqua = sn.nextLine();
            if(phanqua=="none"){
                break;
            }
            System.out.print("Mời bạn nhập vào tiền: ");
            double tien = sn.nextDouble();
            f.writeLine(phanqua+"="+tien);
        }
    }
}
