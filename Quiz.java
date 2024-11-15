package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][6];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4 ,opt5;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 30;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name) {
        this.name = name;
        setSize(1440, 850);
        setLocationRelativeTo(null);
        setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
    questions[0][0] = "x²+8x-48=0 and y²-8y-105=0";
        questions[0][1] = "x>y";
        questions[0][2] = "x<y";
        questions[0][3] = "x=y or x≠y";
        questions[0][4] = "x<=y";
        questions[0][5] = "x>=y";

    questions[1][0] = "10x²-1000=0 and 5y²-73y-30=0";
        questions[1][1] = "x>y";
        questions[1][2] = "x<y";
        questions[1][3] = "x<=y";
        questions[1][4] = "x>=y";
        questions[1][5] = "x=y or x≠y";

    questions[2][0] = "5x²+27x+10=0 and 2y²-11y+12=0";
        questions[2][1] = "x>y";
        questions[2][2] = "x<y";
        questions[2][3] = "x<=y";
        questions[2][4] = "x>=y";
        questions[2][5] = "x=y or x≠y";

    questions[3][0] = "3x²-4x-32=0 and 9y²-29y+22=0";
        questions[3][1] = "x>y";
        questions[3][2] = "x>=y";
        questions[3][3] = "x<y";
        questions[3][4] = "x=y or x≠y";
        questions[3][5] = "x<=y";

    questions[4][0] = "25 + 32 of (1÷4) ÷ 8 + 32% of 25 + 35 = ?";
        questions[4][1] = "49";
        questions[4][2] = "59";
        questions[4][3] = "69";
        questions[4][4] = "79";
        questions[4][5] = "89";

    questions[5][0] = "125 % of 440 - 12 + 10 + 12.5 % of 328 = ?";
        questions[5][1] = "579";
        questions[5][2] = "589";
        questions[5][3] = "569";
        questions[5][4] = "599";
        questions[5][5] = "559";

    questions[6][0] = "(25 X 16) ÷ (10 X 20) + (24 ÷ 6) + √3600 X √400 = ?";
        questions[6][1] = "1208";
        questions[6][2] = "1216";
        questions[6][3] = "1206";
        questions[6][4] = "1205";
        questions[6][5] = "1204";

    questions[7][0] = "15, 23, 39, ? ,95, 135";
        questions[7][1] = "63";
        questions[7][2] = "69";
        questions[7][3] = "56";
        questions[7][4] = "78";
        questions[7][5] = "72";

    questions[8][0] = "1.5, 2.5, 3, 12, 44, ?";
        questions[8][1] = "196";
        questions[8][2] = "250";
        questions[8][3] = "320";
        questions[8][4] = "225";
        questions[8][5] = "164";

    questions[9][0] = "250, 225, 275, 175, 375, 25.     (Wrong number series)";
        questions[9][1] = "250";
        questions[9][2] = "275";
        questions[9][3] = "25";
        questions[9][4] = "175";
        questions[9][5] = "375";
        
        answers[0][1] = "x=y or x≠y";
        answers[1][1] = "x=y or x≠y";
        answers[2][1] = "x<y";
        answers[3][1] = "x=y or x≠y";
        answers[4][1] = "69";
        answers[5][1] = "589";
        answers[6][1] = "1206";
        answers[7][1] = "63";
        answers[8][1] = "225";
        answers[9][1] = "25";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        opt5 = new JRadioButton();
        opt5.setBounds(170, 680, 700, 30);
        opt5.setBackground(Color.WHITE);
        opt5.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt5);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        groupoptions.add(opt5);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
 /*     lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);    */
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            opt5.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 30;
        } else if (timer < 0) {
            timer = 30;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            opt5.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        opt5.setText(questions[count][5]);
        opt5.setActionCommand(questions[count][5]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}
