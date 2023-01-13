package ui;

import javax.swing.*;

public class CRUDTeam extends JFrame {
    private JPanel Master;
    private JButton CreateTeamButton;
    private JTextField InsertNameField;
    private JTextField InsertPlayersField;
    private JLabel TeamNamePrompt;
    private JLabel TeamPlayerPrompt;

    public CRUDTeam()
    {
        setContentPane(Master);
        setTitle("Create Team");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000,800);
        setVisible(true);
    }
}
