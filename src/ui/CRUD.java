package ui;

import javax.swing.*;

public class CRUD extends JFrame {
    private JPanel Master;
    private JButton CRUDTeamsButton;
    private JButton CRUDPlayersButton;
    private JButton CRUDMatchButton;
    private JButton RUDAccountButton;

    public CRUD()
    {
        setContentPane(Master);
        setTitle("CRUD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000,1000);
        setVisible(true);
    }
}
