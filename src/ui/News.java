package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class News extends JFrame{
    private JPanel newsPanel;
    private JLabel newsLabel;
    private JTable table1;

    public News(){
        setContentPane(newsPanel);
        setTitle("News");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,500);
        setVisible(true);

        String[][] data = {
                { "Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n Lorem Ipsum is simply dummy text of the printing and typesetting industry."},
        };

        String[] columnNames = { "News"};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table1.setModel(model);
    }
}
