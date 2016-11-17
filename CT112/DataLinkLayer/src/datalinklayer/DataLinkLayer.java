/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datalinklayer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lê Phương Hiếu
 */
public class DataLinkLayer {

    //Hàm đóng khung từ file thành các khung có độ dài LEN.
    public static int framing(String filename, int len, byte flag, byte esc) {
        try {
            String str = "";
            FileReader fin = new FileReader(filename);
            ArrayList<Character> AFr = new ArrayList<>();
            int c;
            int count = 0;
            while ((c = fin.read()) != -1) {
                AFr.add((char) c);
                count++;
                if (count == len) { //đủ độ dài chuỗi thì thực hiện
                    for (Character chr : AFr) {
                        str += chr;
                    }
                    AFr.clear();
                    //Khởi tạo
                    Frame fr = new Frame(str, str.length(), (int) flag, (int) esc);
                    //In kết quả
                    fr.inFrame();

                    //Reset để tiếp tục đọc khung mới
                    count = 0;
                    str = "";
                }
            }

            if (count != 0) { //xử lý tán dư
                for (Character chr : AFr) {
                    str += chr;
                }
                AFr.clear();
                Frame fr = new Frame(str, str.length(), (int) flag, (int) esc);
                fr.inFrame();
            }
//            System.out.println(str);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("File không tồn tại.");
        } catch (IOException ex) {
            Logger.getLogger(DataLinkLayer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("File không thể đọc.");
        }
        return 1;
    }

    public static int error_detect(Frame e) {
        return e.check_error();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        char c = (char) 27;
//        Frame fr = new Frame("chuoi"+ c +"ascii", 27, 29);
//        fr.inFrame();
        framing("data.txt", 64, (byte) 27, (byte) 29);
        int[][] testF = {{0, 0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 1, 0, 0},
                    {0, 1, 1, 0, 1, 1, 1, 1},
                    {1, 1, 1, 0, 1, 1, 1, 0},
                    {1, 1, 1, 0, 0, 1, 1, 1},
                    {1, 1, 1, 1, 0, 0, 0, 0},
                    {1, 1, 1, 0, 1, 0, 0, 0},
                    {1, 1, 1, 1, 0, 1, 0, 1},
                    {0, 1, 1, 0, 1, 1, 1, 1},
                    {1, 1, 1, 0, 1, 1, 1, 0},
                    {1, 1, 1, 0, 0, 1, 1, 1},
                    {1, 1, 1, 0, 0, 0, 1, 0},
                    {1, 1, 1, 0, 0, 0, 0, 1},
                    {0, 1, 1, 1, 0, 1, 0, 0},
                    {1, 1, 1, 0, 0, 0, 1, 0},
                    {1, 1, 1, 0, 0, 0, 0, 1},
                    {0, 1, 1, 0, 1, 0, 0, 1},};
        int[] LRC={0, 0, 0, 1, 0, 1, 0, 0};
        Frame ne = new Frame(testF,LRC);
        System.out.println("Kết quả error detect: "+error_detect(ne));
    }

}
