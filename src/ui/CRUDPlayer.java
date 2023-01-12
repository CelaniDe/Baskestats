package ui;

import javax.swing.*;

public class CRUDPlayer extends JFrame {
    private JPanel Master;
    private JButton CreateTeamButton;

    public CRUDPlayer()
    {
        setContentPane(Master);
        setTitle("Create Player");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600,600);
        setVisible(true);
    }
}
