/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2_SinhVienForm;

import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author googlesky
 */
public class SinhVienForm extends JFrame {

    JLabel MSSVLabel;
    JLabel HoTenLabel;
    JLabel DiaChiLabel;
    JLabel NamSinhLabel;
    JLabel DTBLabel;
    JTextField MSSVText;
    JTextField HoTenText;
    JTextField DiaChiText;
    JTextField NamSinhText;
    JTextField DTBText;
    JButton ThemButton;
    JButton XoaButton;
    JButton SuaButton;
    JButton ThoatButton;

    public SinhVienForm() {
        super();
        this.setTitle("Sinh Viên Form");
        this.setLocation(300, 100);
        this.setSize(260, 270);
        this.inits();
        this.adds();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void inits(){
        int x = 20;
        int y = 20;
        int y_Them = 30;
        int x_size_label = 100;
        int y_size_label = 20;
        MSSVLabel = new JLabel();
        MSSVLabel.setText("MSSV");
        MSSVLabel.setLocation(x, y);
        MSSVLabel.setSize(x_size_label, y_size_label);
        MSSVText = new JTextField();
        MSSVText.setSize(x_size_label, y_size_label);
        MSSVText.setLocation(x+x_size_label+10, y);
        
        HoTenLabel = new JLabel();
        HoTenLabel.setText("Họ Và Tên");
        HoTenLabel.setSize(x_size_label, y_size_label);
        HoTenLabel.setLocation(x, y+y_Them*1);
        HoTenText = new JTextField();
        HoTenText.setSize(x_size_label, y_size_label);
        HoTenText.setLocation(x+x_size_label+10, y+y_Them*1);
        
        DiaChiLabel = new JLabel();
        DiaChiLabel.setText("Địa Chỉ");
        DiaChiLabel.setSize(x_size_label, y_size_label);
        DiaChiLabel.setLocation(x, y+y_Them*2);
        DiaChiText = new JTextField();
        DiaChiText.setSize(x_size_label, y_size_label);
        DiaChiText.setLocation(x+x_size_label+10, y+y_Them*2);
        
        NamSinhLabel = new JLabel();
        NamSinhLabel.setText("Năm Sinh");
        NamSinhLabel.setSize(x_size_label, y_size_label);
        NamSinhLabel.setLocation(x, y+y_Them*3);
        NamSinhText = new JTextField();
        NamSinhText.setSize(x_size_label, y_size_label);
        NamSinhText.setLocation(x+x_size_label+10, y+y_Them*3);
        
        DTBLabel = new JLabel();
        DTBLabel.setText("Điểm TB");
        DTBLabel.setSize(x_size_label, y_size_label);
        DTBLabel.setLocation(x, y+y_Them*4);
        DTBText = new JTextField();
        DTBText.setSize(x_size_label, y_size_label);
        DTBText.setLocation(x+x_size_label+10, y+y_Them*4);
        
        int x_size_button = 100;
        int y_size_button = 20;
        
        ThemButton = new JButton();
        ThemButton.setText("Thêm");
        ThemButton.setLocation(x, y+y_Them*5);
        ThemButton.setSize(x_size_button, y_size_button);
        
        XoaButton = new JButton();
        XoaButton.setText("Xóa");
        XoaButton.setLocation(x+x_size_button+10, y+y_Them*5);
        XoaButton.setSize(x_size_button, y_size_button);
        
        SuaButton = new JButton();
        SuaButton.setText("Sửa");
        SuaButton.setLocation(x, y+y_Them*6);
        SuaButton.setSize(x_size_button, y_size_button);
        
        ThoatButton = new JButton();
        ThoatButton.setText("Thoát");
        ThoatButton.setLocation(x+x_size_button+10, y+y_Them*6);
        ThoatButton.setSize(x_size_button, y_size_button);
    }
    
    public void adds(){
        Container ct = this.getContentPane();
        ct.setLayout(null);
        ct.add(this.DTBLabel);
        ct.add(this.DTBText);
        ct.add(this.DiaChiLabel);
        ct.add(this.DiaChiText);
        ct.add(this.HoTenLabel);
        ct.add(this.HoTenText);
        ct.add(this.MSSVLabel);
        ct.add(this.MSSVText);
        ct.add(this.NamSinhLabel);
        ct.add(this.NamSinhText);
        ct.add(this.SuaButton);
        ct.add(this.ThemButton);
        ct.add(this.ThoatButton);
        ct.add(this.XoaButton);
    }
}
