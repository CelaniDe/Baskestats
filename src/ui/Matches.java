package ui;

import javax.swing.*;

public class Matches extends  JFrame {
    private JPanel Master;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;
    private JLabel MatchesTitle;
    private JPanel Header;
    private JTable table1;
    private JRadioButton futureRadioButton;
    private JRadioButton presentRadioButton;
    private JRadioButton pastRadioButton;

    public Matches()
    {
        setContentPane(Master);
        setTitle("Matches");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 800);
        setVisible(true);
    }
}
