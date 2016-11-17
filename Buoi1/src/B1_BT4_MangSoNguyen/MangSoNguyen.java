/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_BT4_MangSoNguyen;

import static java.lang.Boolean.TRUE;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class MangSoNguyen {

    private int sophantu;
    private int danhsach[];

    public MangSoNguyen() {
        this.sophantu = 0;
    }

    public MangSoNguyen(int a) {
        this.sophantu = 1;
        danhsach[0] = a;
    }

    public MangSoNguyen(int n, int mang[]) {
        this.sophantu = n;
        this.danhsach = Arrays.copyOf(mang, n);
    }

    public void nhap() {
        System.out.print("Mời bạn nhập vào số lượng phần tử cần nhập: ");
        Scanner sn = new Scanner(System.in);
        this.sophantu = sn.nextInt();
        for (int i = 0; i <= this.sophantu; i++) {
            System.out.printf("\nMời bạn nhập vào phần tử thứ %d: ", i + 1);
            danhsach[i] = sn.nextInt();
        }
        this.xuat();
    }

    public void xuat() {
        for (int i = 0; i < sophantu; i++) {
            System.out.printf("%d ", danhsach[i]);
        }
    }

    public int timMAX() {
        int max = danhsach[0];
        for (int i = 0; i < sophantu; i++) {
            max = Math.max(max, danhsach[i]);
        }
        return max;
    }

    public int timMIN() {
        int min = danhsach[0];
        for (int i = 0; i < sophantu; i++) {
            min = Math.min(min, danhsach[i]);
        }
        return min;
    }

    public int tim(int x) {
        int i;
        for (i = 0; i < sophantu; i++) {
            if (x == danhsach[i]) {
                break;
            }
        }
        return i;
    }

    public int timX(int x) {
        int i, dem;
        dem = 0;
        for (i = 0; i < sophantu; i++) {
            if (x == danhsach[i]) {
                dem++;
            }
        }
        return dem;
    }

    public int TinhTong() {
        int Tong = 0;
        for (int i = 0; i < sophantu; i++) {
            Tong += danhsach[i];
        }
        return Tong;
    }

    public double TinhTrungBinh() {
        return this.TinhTong() / sophantu;
    }

    public void xoa() {
        this.sophantu--;
    }

    public int xoa(int ViTri) {
        if (ViTri >= this.sophantu) {
            return 0;
        } else {
            for (int i = ViTri; i < this.sophantu - 1; i++) {
                danhsach[i] = danhsach[i + 1];
            }
            this.sophantu--;
            return 1;
        }
    }

    public int them(int x) {
        int length = danhsach.length;
        danhsach[length + 1] = x;
        return 1;
    }

    public int them(int x, int i) {
        if ((i > 0) && (i <= this.sophantu)) {
            for (int j = i; j <= this.sophantu; j++) {
                danhsach[j + 1] = danhsach[j];
            }
            danhsach[i] = x;
            return 1;
        } else {
            return 0;
        }
    }

    public void sapXep(boolean s) {
        int temp;
        if (s == TRUE) {
            Arrays.sort(this.danhsach);
        } else {
            Arrays.sort(this.danhsach);
            for (int i = 0; i < this.sophantu / 2; i++) {
                temp = danhsach[i];
                danhsach[i] = danhsach[this.sophantu - i];
                danhsach[this.sophantu - i] = temp;
            }
        }
    }
}
