package ui;

import javax.swing.*;

public class Match extends  JFrame {
    private JPanel match;
    private JButton pastButton;
    private JButton presentButton;
    private JButton futureButton;
    private JLabel teamIconDateTeamLabel;
    private JLabel LALakers101Label;

    public Match()
    {
        setContentPane(match);
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600,600);
        setVisible(true);
    }
}
