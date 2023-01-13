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
    private JTextField InputField;
    private JComboBox SearchChoiceBox;
    private JTable ResultsTable;
    private JScrollPane TablePane;

    public Search()
    {
        setContentPane(Master);
        setTitle("Search");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 800);
        setVisible(true);
    }
}
