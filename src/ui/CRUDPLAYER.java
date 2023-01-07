package ui;

import javax.swing.*;

public class CRUDPLAYER extends JFrame {
    private JPanel crudplayer;
    private JTextField playerNameTextField;
    private JTextField ageTextField;
    private JTextField heightTextField;
    private JTextField weightTextField;
    private JTextField nationalityTextField;
    private JButton CREATEButton;

    public CRUDPLAYER()
    {
        setContentPane(crudplayer);
        setTitle("Create Player");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600,600);
        setVisible(true);
    }
}
