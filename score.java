package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class score extends JFrame implements ActionListener {

    score(final String name, final int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        final ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        final Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        final ImageIcon i3 = new ImageIcon(i2);
        final JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        final JLabel heading = new JLabel("Thankyou " + name + " for playing Maths Hero");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        final JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);
        
        final JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(final ActionEvent ae) {
        setVisible(false);
        new login();
    }

    public static void main(final String[] args) {
        new score("User", 0);
    }
}
