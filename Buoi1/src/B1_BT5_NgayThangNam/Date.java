/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_BT5_NgayThangNam;

import java.time.LocalDate;

/**
 *
 * @author student
 */
public class Date {

    private int ngay, thang, nam;

    /*
    Chỉ có tháng 2 có 29 ngày. Nếu năm chia hết cho 4 thì có 30 ngày.
    Tháng 1,3,5,7,8,10,12 có 31 ngày
    Tháng 2,4,6,9,11 có 30 ngày
     */

    public Date() {
        LocalDate today = LocalDate.now();
        ngay = today.getDayOfMonth();
        thang = today.getMonthValue();
        nam = today.getYear();
    }

    public Date(int Ngay, int Thang, int Nam) {
        this.ngay = Ngay;
        this.thang = Thang;
        this.nam = Nam;
    }

    public void addNumberDate(int x) {
        ngay += x;
        while (ngay > this.numberDateOfMounth(thang)) {
            ngay -= this.numberDateOfMounth(thang);
            this.incThang(1);
        }
    }

    public void incThang(int x) {
        thang += x;
        while (thang > 12) {
            thang -= 12;
            nam++;
        }
    }

    public int numberDateOfMounth(int Thang) {
        if (this.nam % 2000 != 0) {
            switch (Thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return this.nam % 4 != 0 ? 29 : 30;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return -1;
            }
        } else {
            switch (Thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return 29;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return -1;
            }
        }
    }
}
