package ui;

import javax.swing.*;

public class CRUDTEAM extends JFrame {
    private JPanel crudteam;
    private JTextField teamNameTextField;
    private JTextField cityTextField;
    private JTextField foundedTextField;
    private JTextField CEOTextField;
    private JButton CREATEButton;

    public CRUDTEAM()
    {
        setContentPane(crudteam);
        setTitle("Create Team");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600,600);
        setVisible(true);
    }
}
