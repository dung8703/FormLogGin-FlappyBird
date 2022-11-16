/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;

/**
 *
 * @author PC ACER
 */
public class GUI2 {
    public static void main(String[] args) {
        JTextField jtf = new JTextField();
        //jtf.setText("Xin chao");
        jtf.setBounds(100, 100, 100, 30);
        
        JFrame frame = new JFrame("JTextField Example");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);
        frame.add(jtf); 
        frame.setVisible(true);
    }
    
}
