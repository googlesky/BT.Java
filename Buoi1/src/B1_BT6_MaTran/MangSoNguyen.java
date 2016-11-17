/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_BT6_MaTran;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author googlesky
 */
public class MangSoNguyen {

    int SoPhanTu;
    int DanhSach[];

    public MangSoNguyen() {
        SoPhanTu = 0;
        DanhSach = null;
    }

    public MangSoNguyen(int SoPhanTu) {
        this.SoPhanTu = SoPhanTu;
        this.DanhSach = new int[SoPhanTu];
    }

    public MangSoNguyen(int SoPhanTu, int[] DanhSach) {
        this.SoPhanTu = SoPhanTu;
        this.DanhSach = DanhSach;
    }

    public void setSoPhanTu(int SoPhanTu) {
        this.SoPhanTu = SoPhanTu;
    }

    public void setDanhSach(int[] DanhSach) {
        this.DanhSach = DanhSach;
    }

    public int getSoPhanTu() {
        return SoPhanTu;
    }

    public int[] getDanhSach() {
        return DanhSach;
    }

    /**
     * Nhập vào số lượng phần tử được định nghĩa trong lớp
     */
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < this.SoPhanTu; i++) {
            System.out.printf("Mời bạn nhập phần tử thứ %d: ", i + 1);
            DanhSach[i] = sn.nextInt();

        }

    }

    /**
     * Xuất ra danh sách phần tử trong lớp
     */
    public void xuat() {
        for (int i = 0; i < this.SoPhanTu; i++) {
            System.out.printf("%d ", this.DanhSach[i]);

        }
    }

    int timMAX() {
        int tMax = this.DanhSach[0];

        for (int i = 0; i < this.SoPhanTu; i++) {
            if (tMax < this.DanhSach[i]) {
                tMax = this.DanhSach[i];
            }
        }
        return tMax;
    }

    int timMIN() {
        int tMin = this.DanhSach[0];

        for (int i = 0; i < this.SoPhanTu; i++) {
            if (tMin > this.DanhSach[i]) {
                tMin = this.DanhSach[i];
            }
        }
        return tMin;
    }

    int tim(int ViTri) {
        if (ViTri > this.SoPhanTu || ViTri < 0) {
            return -1;
        } else {
            return this.DanhSach[ViTri];
        }
    }

    int timX(int X) {

        for (int i = 0; i < this.SoPhanTu; i++) {
            if (X == this.DanhSach[i]) {

                return i;
            }
        }
        return 0;
    }

    int tinhTong() {
        int Tong = 0;
        for (int i = 0; i < this.SoPhanTu; i++) {
            Tong += this.DanhSach[i];
        }
        return Tong;
    }

    double tinhTrungBinh() {
        return this.tinhTong() / this.SoPhanTu;
    }

    int xoa() {
        if (this.SoPhanTu == 0) {
            return 0;
        } else {
            this.SoPhanTu -= 1;
        }
        return 1;
    }

    int xoa(int ViTri) {
        if (ViTri > 0 && ViTri < this.SoPhanTu) {

            for (int i = ViTri; i < this.SoPhanTu; i++) {
                this.DanhSach[i] = this.DanhSach[i + 1];

            }
            this.SoPhanTu -= 1;
            return 1;
        } else {
            return -1;
        }
    }

    int them(int X) {
        this.DanhSach = Arrays.copyOf(DanhSach, SoPhanTu + 1);
        this.DanhSach[this.SoPhanTu] = X;
        this.SoPhanTu += 1;
        return 1;
    }

    int them(int X, int ViTri) {
        this.DanhSach = Arrays.copyOf(DanhSach, SoPhanTu + 1);
        for (int i = this.SoPhanTu; i > ViTri; i--) {
            this.DanhSach[i] = this.DanhSach[i - 1];
        }
        this.DanhSach[ViTri] = X;
        this.SoPhanTu += 1;
        return 1;
    }

    void sapXep(boolean d) {
        Arrays.sort(DanhSach);
        if (!d) {
            int[] C = new int[this.SoPhanTu];
            for (int i = this.SoPhanTu; i >= 0; i--) {
                C[this.SoPhanTu - i] = this.DanhSach[i];
            }
        }
    }
}
