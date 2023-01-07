package ui;

import javax.swing.*;

public class CRUD extends JFrame {
    private JPanel crud;
    private JButton CRUDTEAMSButton;
    private JButton CRUDPLAYERSButton;
    private JButton CRUDMATCHButton;
    private JButton RUDACCOUNTButton;

    public CRUD()
    {
        setContentPane(crud);
        setTitle("CRUD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,500);
        setVisible(true);
    }
}
