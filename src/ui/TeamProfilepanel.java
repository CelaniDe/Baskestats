package ui;

import javax.swing.*;

public class TeamProfilepanel extends JFrame {
    private JButton compareButton;
    private JPanel panel2;

    public TeamProfilepanel()
    {
        setContentPane(panel2);
        setTitle("Team Profile");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,500);
        setVisible(true);
    }
}
