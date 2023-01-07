package ui;

import javax.swing.*;

public class News extends JFrame{
    private JPanel newsPanel;
    private JLabel newsLabel;
    private JButton button1;
    private JLabel thirdNewsImg;
    private JLabel firstNewsImg;
    private JLabel secondNewsImg;
    private JLabel fourthNewsImg;
    private JLabel fifthNewsImg;
    private JLabel sixthNewsImg;
    private JLabel seventhNewsImg;

    public News(){
        setContentPane(newsPanel);
        setTitle("News");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,500);
        setVisible(true);
    }
}
