package ui;

import javax.swing.*;

public class Match extends  JFrame {
    private JPanel Master;

    public Match()
    {
        setContentPane(Master);
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
        setVisible(true);
    }
}
