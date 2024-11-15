package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tframe;
    login(){
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0, 0, 800, 450);
        add(image);

        JLabel heading=new JLabel("Maths Hero");
        heading.setBounds(880, 80, 300, 50);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel name=new JLabel("Enter your Name:");
        name.setBounds(910, 140, 160, 30);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(Color.DARK_GRAY);
        add(name);

        tframe=new JTextField();
        tframe.setBounds(890, 180, 200, 40);
        add(tframe);

        rules=new JButton("Rules");
        rules.setBounds(900, 230, 80, 30);
        rules.setBackground(Color.DARK_GRAY);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(1000, 230, 80, 30);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==rules) {
            String name=tframe.getText();
            setVisible(false);
            new Rules(name);
            
        } else if (ae.getSource()==back) {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new login();
    }
}
