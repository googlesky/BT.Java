/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datalinklayer;

import java.util.Arrays;

/**
 *
 * @author Lê Phương Hiếu
 */
public class Frame {

    private String StringGoc;
    private int ESC;
    private int Flag;
    private int len;
    private int[] LRC;
    private char data[];
    private int datalast = 0;
    private int dataInBin[][];
    private int dataInBinlast = 0;

    //Hàm khởi tạo
    public Frame() {
        ESC = 27;
        Flag = 29;
        len = 65;
        StringGoc = "";
        data = new char[len * 2];
        dataInBin = new int[len * 2][];
    }

    //Hàm khởi tạo với tham số
    public Frame(String str, int Flag) {
        this(str, 65, 27, Flag);
    }

    public Frame(int dataInBin[][], int[] LRC) {
        this.dataInBin = dataInBin.clone();
        this.dataInBinlast = this.datalast = dataInBin.length;
        this.LRC = LRC.clone();
    }

    public Frame(String str, int len, int ESC, int Flag) {
        StringGoc = str;
        this.ESC = ESC;
        this.Flag = Flag;
        this.len = len;
        //Khởi tạo độ dài mãng LRC để biểu diễn các số ẩn.
        int[] LRC = {0, 0, 0, 0, 0, 0, 0, 0};
        data = new char[len*2];
        dataInBin = new int[len*2][];
        //Duyệt chuỗi
        for (int i = 0; i < str.length(); i++) {
            //Trường hợp ký tự trong chuỗi trùng với Flag và ESC
            if (str.charAt(i) == ESC || str.charAt(i) == Flag) {
                data[this.datalast] = (char) ESC;
                this.datalast++;
                char[] rawData = Integer.toString((char) ESC, 2).toCharArray();
                //Tạo format cho chuỗi dạng 8 bits.
                int[] rData = {0, 0, 0, 0, 0, 0, 0, 0};
                //Tịnh tuyến đi 1 đơn vị để chứa Parity bits
                rData[0] = Integer.parseInt(String.valueOf(rawData[0]));
                for (int j = rawData.length - 1; j > 0; j--) {
                    rData[j] = Integer.parseInt(String.valueOf(rawData[j]));
                    if (rData[j - 1] == 1) {
                        if (LRC[j - 1] == 0) {
                            LRC[j - 1] = 1;
                        } else {
                            LRC[j - 1] = 0;
                        }
                    }
                }
                if (Integer.bitCount((int) str.charAt(i)) % 2 == 0) {
                    rData[7] = 0;
                } else {
                    rData[7] = 1;
                    if (LRC[7] == 0) {
                        LRC[7] = 1;
                    } else {
                        LRC[7] = 0;
                    }
                }
                dataInBin[this.dataInBinlast] = rData;
                this.dataInBinlast++;
            }
            data[this.datalast] = (char) str.charAt(i);
            this.datalast++;
            char[] rawData = Integer.toString(str.charAt(i), 2).toCharArray();
            int[] rData = {0, 0, 0, 0, 0, 0, 0, 0};
            //Tịnh tuyến đi 1 đơn vị để chứa Parity bits
            System.out.printf("%s\n", Arrays.toString(rawData));
            rData[0] = Integer.parseInt(String.valueOf(rawData[0]));
            for (int j = rawData.length - 1; j > 0; j--) {
                rData[j] = Integer.parseInt(String.valueOf(rawData[j]));
                if (rData[j - 1] == 1) {
                    if (LRC[j - 1] == 0) {
                        LRC[j - 1] = 1;
                    } else {
                        LRC[j - 1] = 0;
                    }
                }
            }
            if (Integer.bitCount((int) str.charAt(i)) % 2 == 0) {
                rData[7] = 0;
            } else {
                rData[7] = 1;
                if (LRC[7] == 0) {
                    LRC[7] = 1;
                } else {
                    LRC[7] = 0;
                }
            }
            dataInBin[this.dataInBinlast] = rData;
            this.dataInBinlast++;
        }
        this.LRC = LRC.clone();
    }

    public void inFrame() {
        System.out.println("Chuỗi Gốc: " + StringGoc);
        System.out.print("Frame: ");
        System.out.printf("[%d]", this.Flag);
        for (int i = 0; i < this.datalast; i++) {
            System.out.printf("[%d]", (int) data[i]);
        }
        System.out.printf("[%d]", this.Flag);
        System.out.println();
        System.out.println("Frame với Parity bits: (Không có Flag)");

//        char[] FlagBin = Integer.toString((char) this.Flag, 2).toCharArray();
//        char[] rFlagBin = {'0', '0', '0', '0', '0', '0', '0', '0'};
//        for (int j = 0; j < FlagBin.length; j++) {
//            rFlagBin[j + 1] = FlagBin[j];
//        }
//        if (Integer.bitCount(this.Flag) % 2 == 0) {
//            rFlagBin[0] = '0';
//        } else {
//            rFlagBin[0] = 1;
//        }
//        System.out.printf("%s\n", Arrays.toString(rFlagBin));
        for (int i = 0; i < this.dataInBinlast; i++) {
            System.out.printf("%s\n", Arrays.toString(dataInBin[i]));
        }
//        System.out.printf("%s\n", Arrays.toString(rFlagBin));

//            System.out.printf("[");
//            for (int bit : this.LRC) {
//                System.out.printf("%d",bit);
//                System.out.printf(" ");
//            }
//            System.out.printf("]\n");
        System.out.printf("%s <= LRC Byte\n", Arrays.toString(this.LRC));
    }

    public int check_error() {

        int[] LRC = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < this.dataInBinlast; i++) {
            int count = 0;
            for (int j = 0; j < 7; j++) {
                if (dataInBin[i][j] == 1) {
                    count++;
                    LRC[j] = (LRC[j] + 1) % 2;
                }
            }
//            System.out.printf("%d %d\n",count % 2,dataInBin[i][7]);
            if (count % 2 != dataInBin[i][7]) {
                System.out.printf("%s <= Wrong Parity bits", Arrays.toString(dataInBin[i]));
                return -1;
            }
        }
        for (int i = 0; i < 7; i++) {
            if (this.LRC[i] != LRC[i]) {
                System.out.printf("%s <= LRC Byte In\n", Arrays.toString(this.LRC));
                System.out.printf("%s <= LRC Byte Data\n", Arrays.toString(LRC));
                return -1;
            }
        }
        return 0;
    }

    public String getStringGoc() {
        return StringGoc;
    }

    public int getESC() {
        return ESC;
    }

    public int getFlag() {
        return Flag;
    }

    public int getLen() {
        return len;
    }

    public int[] getLRC() {
        return LRC;
    }

    public char[] getData() {
        return data;
    }

    public int getDatalast() {
        return datalast;
    }

    public int[][] getDataInBin() {
        return dataInBin;
    }

    public int getDataInBinlast() {
        return dataInBinlast;
    }

    public void setStringGoc(String StringGoc) {
        this.StringGoc = StringGoc;
    }

    public void setESC(int ESC) {
        this.ESC = ESC;
    }

    public void setFlag(int Flag) {
        this.Flag = Flag;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void setLRC(int[] LRC) {
        this.LRC = LRC;
    }

    public void setData(char[] data) {
        this.data = data;
    }

    public void setDatalast(int datalast) {
        this.datalast = datalast;
    }

    public void setDataInBin(int[][] dataInBin) {
        this.dataInBin = dataInBin;
    }

    public void setDataInBinlast(int dataInBinlast) {
        this.dataInBinlast = dataInBinlast;
    }

}
