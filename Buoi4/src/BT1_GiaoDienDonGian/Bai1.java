/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1_GiaoDienDonGian;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author googlesky
 */
public class Bai1 extends JFrame {

    JTextField text;
    JButton hello, xinchao;

    public Bai1() {
        super();
        this.setTitle("Thông Báo");
        this.setSize(345, 128);
        this.setLocation(100, 100);
        this.inits();
        this.adds();
        this.addListenners();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void inits() {
        text = new JTextField();
        text.setText("Chào các bạn!!!");
        text.setSize(310, 30);
        text.setLocation(10, 10);
        xinchao = new JButton();
        xinchao.setText("Chào Các Bạn");
        xinchao.setSize(150, 30);
        xinchao.setLocation(170, 50);
        hello = new JButton();
        hello.setText("Hello World!!!");
        hello.setSize(150, 30);
        hello.setLocation(10, 50);
    }

    public void adds() {
        Container content = this.getContentPane();
        content.setLayout(null);
        content.add(this.text);
        content.add(this.hello);
        content.add(this.xinchao);
    }

    public void addListenners() {
        HelloListener helloObject = new HelloListener();
        this.hello.addActionListener(helloObject);

        ChaoListener chaoObject = new ChaoListener();
        this.xinchao.addActionListener(chaoObject);
    }

    class ChaoListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            text.setText("Chào Đại Học Cần Thơ");
        }
    }

    class HelloListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            text.setText("Hello CanTho University");
        }
    }
}

