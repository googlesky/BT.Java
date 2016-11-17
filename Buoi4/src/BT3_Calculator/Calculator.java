/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3_Calculator;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author googlesky
 */
public class Calculator extends JFrame {

    JButton B_Cong, B_Tru, B_Nhan, B_Chia;
    JLabel LB_title, LB_GiaTri1, LB_GiaTri2, LB_KQ;
    JTextField TF_GiaTri1, TF_GiaTri2, TF_KQ;

    int x = 20;
    int y = 20;

    public Calculator() {
        super();
        this.setTitle("Calculator 1.0");
        this.setSize(400, 240);
        this.setLocation(100, 100);
        this.inits();
        this.adds();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void inits() {
        B_Chia = new JButton();
        B_Cong = new JButton();
        B_Tru = new JButton();
        B_Nhan = new JButton();
        LB_GiaTri1 = new JLabel();
        LB_GiaTri2 = new JLabel();
        LB_title = new JLabel();
        LB_KQ = new JLabel();
        TF_GiaTri1 = new JTextField();
        TF_GiaTri2 = new JTextField();
        TF_KQ = new JTextField();

        LB_title.setSize(360, 20);
        LB_GiaTri1.setSize(100, y);
        LB_GiaTri2.setSize(100, y);
        LB_KQ.setSize(80, y);
        TF_GiaTri1.setSize(200, y);
        TF_GiaTri2.setSize(200, y);
        TF_KQ.setSize(220, y);
        B_Chia.setSize(80, y);
        B_Cong.setSize(80, y);
        B_Nhan.setSize(80, y);
        B_Tru.setSize(80, y);

        LB_title.setLocation(20, 20);
        LB_GiaTri1.setLocation(20, 20 + 30);
        TF_GiaTri1.setLocation(20 + 100 + 10, 20 + 30);
        LB_GiaTri2.setLocation(20, 20 + 30 * 2);
        TF_GiaTri2.setLocation(20 + 100 + 10, 20 + 30 * 2);
        B_Cong.setLocation(20, 20 + 30 * 3);
        B_Tru.setLocation(20 + 10 + 80, 20 + 30 * 3);
        B_Nhan.setLocation(20 + (10 + 80) * 2, 20 + 30 * 3);
        B_Chia.setLocation(20 + (10 + 80) * 3, 20 + 30 * 3);
        LB_KQ.setLocation(20, 20 + 30 * 4);
        TF_KQ.setLocation(20 + 80 + 10, 20 + 30 * 4);

        LB_title.setText("Phần mềm máy tính cá nhân v1.0");
        LB_GiaTri1.setText("Giá trị 1");
        LB_GiaTri2.setText("Giá trị 2");
        TF_GiaTri1.setText("0");
        TF_GiaTri2.setText("0");
        B_Chia.setText("Chia");
        B_Cong.setText("Cộng");
        B_Tru.setText("Trừ");
        B_Nhan.setText("Nhân");
        LB_KQ.setText("Kết Quả");
        TF_KQ.setText("");
        TF_KQ.setEnabled(false);
        
        this.B_Cong.addActionListener(new congAction());
        this.B_Tru.addActionListener(new truAction());
        this.B_Nhan.addActionListener(new nhanAction());
        this.B_Chia.addActionListener(new chiaAction());
    }

    public void adds() {
        Container ct = this.getContentPane();
        ct.setLayout(null);
        ct.add(B_Chia);
        ct.add(B_Cong);
        ct.add(B_Nhan);
        ct.add(B_Tru);
        ct.add(LB_GiaTri1);
        ct.add(LB_GiaTri2);
        ct.add(LB_KQ);
        ct.add(LB_title);
        ct.add(TF_GiaTri1);
        ct.add(TF_GiaTri2);
        ct.add(TF_KQ);

    }
    
    class congAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(TF_GiaTri1.getText());
            int b = Integer.parseInt(TF_GiaTri2.getText());
            int Tong = a + b ;
//            System.out.print(Tong);
            TF_KQ.setText(String.valueOf(Tong));
        }
    }
    
    class truAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(TF_GiaTri1.getText());
            int b = Integer.parseInt(TF_GiaTri2.getText());
            int Hieu = a-b;
            TF_KQ.setText(String.valueOf(Hieu));
        }
        
    }
    
    class nhanAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(TF_GiaTri1.getText());
            int b = Integer.parseInt(TF_GiaTri2.getText());
            int Tich = a*b;
            TF_KQ.setText(String.valueOf(Tich));
        }
        
    }
    
    class chiaAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(TF_GiaTri1.getText());
            int b = Integer.parseInt(TF_GiaTri2.getText());
            int Thuong = a/b;
            TF_KQ.setText(String.valueOf(Thuong));
        }
        
    }
}
