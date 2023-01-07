package ui;

import javax.swing.*;

public class Transfer extends JFrame{
    private JLabel firstTransfer;
    private JPanel transferPanel;
    private JLabel secondTransfer;
    private JLabel thirdTransfer;
    private JLabel fourthTransfer;

    public Transfer () {
        setContentPane(transferPanel);
        setTitle("Transfer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,500);
        setVisible(true);
    }
}
