package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUD extends JFrame {
    private JPanel Master;
    private JButton CRUDTeamsButton;
    private JButton CRUDPlayersButton;
    private JButton CRUDMatchButton;
    private JButton RUDAccountButton;
    private JButton CRUDNewsButton;

    public CRUD()
    {
        setContentPane(Master);
        setTitle("CRUD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000,800);
        setVisible(true);
        CRUDNewsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new CRUDNews();
                dispose();
            }
        });
    }
}
