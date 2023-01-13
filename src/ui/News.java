package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class News extends JFrame{
    private JPanel Master;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;
    private JTable NewsTable;
    private JPanel Header;
    private JScrollPane TablePane;
    private JLabel NewsTitle;

    public News(){
        setContentPane(Master);
        setTitle("News");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800,800);
        setVisible(true);

        String[][] data = {
                { "Makis o oreos! ","Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n Lorem Ipsum is simply dummy text of the printing and typesetting industry."},
        };

        String[] columnNames = { "Title" , "Description"};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        NewsTable.setModel(model);
    }
}
