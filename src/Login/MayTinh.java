/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author PC ACER
 */


public class MayTinh {
    public static int Gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int Lcm(int a, int b) {
        int bcnn = (a * b) / Gcd(a, b);
        return bcnn;
    }

    public static boolean snt(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        JTextField jtf1 = new JTextField();
        jtf1.setBounds(100, 50, 100, 30);
        JTextField jtf2 = new JTextField();
        jtf2.setBounds(100, 100, 100, 30);
        JTextField jtf3 = new JTextField();
        jtf3.setBounds(470, 75, 100, 30);
        //JLabel
        JLabel jlb1 = new JLabel("Nhập số a : ");
        jlb1.setBounds(30, 50, 100, 30);
        JLabel jlb2 = new JLabel("Nhập số b : ");
        jlb2.setBounds(30, 100, 100, 30);
        JLabel jlb3 = new JLabel("Kết quả là : ");
        jlb3.setBounds(400, 75, 100, 30);
        JLabel jlb4 = new JLabel("Phép tính : ");
        jlb4.setBounds(30, 150, 100, 30);
        //JButton
        JButton btn1 = new JButton();
        btn1.setText("+");
        btn1.setBounds(100, 150, 50, 40);
        JButton btn2 = new JButton();
        btn2.setText("-");
        btn2.setBounds(250, 150, 50, 40);
        JButton btn3 = new JButton();
        btn3.setText("*");
        btn3.setBounds(400, 150, 50, 40);
        JButton btn4 = new JButton();
        btn4.setText("/");
        btn4.setBounds(550, 150, 50, 40);
        JButton btn5 = new JButton();
        btn5.setText("a^b");
        btn5.setBounds(100, 250, 70, 40);
        JButton btn6 = new JButton();
        btn6.setText("UCLN");
        btn6.setBounds(250, 250, 70, 40);
        JButton btn7 = new JButton();
        btn7.setText("BCNN");
        btn7.setBounds(400, 250, 70, 40);
        JButton btn8 = new JButton();
        btn8.setText("SQRT");
        btn8.setBounds(550, 250, 70, 40);
        //Xu ly su kien
        //addActionListener
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(jtf1.getText());
                int b = Integer.parseInt(jtf2.getText());
                jtf3.setText(a + b + "");
            }
        });
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(jtf1.getText());
                int b = Integer.parseInt(jtf2.getText());
                jtf3.setText(a - b + "");
            }
        });
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(jtf1.getText());
                int b = Integer.parseInt(jtf2.getText());
                jtf3.setText(a * b + "");
            }
        });
        btn4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                float a = Float.parseFloat(jtf1.getText());
                float b = Float.parseFloat(jtf2.getText());
                jtf3.setText(a / b + "");
            }
        });
        btn5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                float a = Float.parseFloat(jtf1.getText());
                float b = Float.parseFloat(jtf2.getText());
                jtf3.setText((int)Math.pow(a, b) + "");
            }
        });
        btn6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(jtf1.getText());
                int b = Integer.parseInt(jtf2.getText());
                jtf3.setText(Gcd(a,b)+"");
            }
        });
        btn7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(jtf1.getText());
                int b = Integer.parseInt(jtf2.getText());
                jtf3.setText(Lcm(a,b)+"");
            }
        });
        btn8.addActionListener((new ActionListener(){                    
            @Override
            public void actionPerformed(ActionEvent ae) {
                float a = Float.parseFloat(jtf1.getText());
                jtf2.setText("Căn chỉ cần nhập 1 số thôi má -_-");
                jtf3.setText(Math.sqrt(a) + "");
            }
        }));
        //JFrame
        JFrame frame = new JFrame();
        frame.setTitle("MÁY TÍNH");
        frame.setSize(800,400);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(jtf1);
        frame.add(jtf2);
        frame.add(jtf3);
        frame.add(jlb1);
        frame.add(jlb2);
        frame.add(jlb3);
        frame.add(jlb4);
        frame.setLayout(null);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }
}
