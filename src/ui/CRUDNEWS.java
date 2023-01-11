package ui;

import javax.swing.*;

public class CRUDNEWS extends JFrame {
    private JTextField newsTitleTextField;
    private JPanel crudpanel;
    private JTextArea descriptionTextArea;
    private JButton CREATEButton;

    public CRUDNEWS() {
        setContentPane(crudpanel);
        setTitle("Create News");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(650,650);
        setVisible(true);
    }
}
