package ui;

import javax.swing.*;

public class Search extends JFrame {
    private JPanel Master;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;
    private JPanel Header;
    private JLabel SearchTitle;
    private JPanel Mid;
    private JLabel Result1;
    private JLabel Result2;
    private JLabel Result3;
    private JLabel Result4;
    private JLabel Result5;
    private JTextField textField1;
    private JButton SwitchSearchButton;
    private JLabel Result6;
    private JLabel Result7;
    private JLabel Result8;

    public Search()
    {
        setContentPane(Master);
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
        setVisible(true);
    }
}
