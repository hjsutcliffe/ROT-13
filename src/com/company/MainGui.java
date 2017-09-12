package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Harry on 9/11/2017.
 */
public class MainGui {
    private JButton Cipher;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel Input;
    private JLabel Output;
    private JPanel ROT;

    public MainGui() {
        Cipher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = Main.encode(textField1.getText());
                textField2.setText(temp);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainGui");
        frame.setContentPane(new MainGui().ROT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
