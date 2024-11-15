package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;

    Rules(String name){
        this.name=name;
        setLayout(null);

        JLabel heading=new JLabel("Welcome "+name+" to Maths Hero");
        heading.setBounds(100, 20, 700, 50);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(10, 50, 750, 500);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
        "<html>"+
            "1. Total 10 numbers of questions are there" + "<br><br>" +
            "2. Each question has 5 options" + "<br><br>" +
            "3. There are only one correct option" + "<br><br>" +
            "4. Answer the correct one" + "<br><br>" +
            "5. Do not unnecessarily mark the one which you don't know" + "<br><br>" +
            "6. value for each question is 10" + "<br><br>" +
            "7. No negative marking for wrong answer" + "<br><br>" +
            "8. Good Luck" + "<br><br>" +
        "<html>"
        );
        rules.setForeground(Color.BLACK);
        add(rules);

        back=new JButton("Back");
        back.setBounds(500, 500, 80, 30);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start=new JButton("Start");
        start.setBounds(200, 500, 80, 30);
        start.setBackground(Color.DARK_GRAY);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==start) {
            setVisible(false);
            new Quiz(name);
        } else{
            setVisible(false);
            new login();
        }
    }

public static void main(String[] args){
    new Rules("User");
}
}

