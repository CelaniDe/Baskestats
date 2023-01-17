package ui;

import dao.GeneralStatsDAOImpl;
import dao.NewsDAO;
import dao.NewsDAOImpl;
import dao.PlayerDAOImpl;
import model.NewsModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
        setSize(1000,800);
        setVisible(true);

        NewsDAO newsDao = new NewsDAOImpl();
        List<NewsModel> newsList = newsDao.getNews();
        String[][] data = new String[newsList.size()][2];
        String[] columnNames = { "Title" , "Description"};

        for (int i=0;i < newsList.size(); i++){
            data[i] = new String[]{newsList.get(i).getTitle().toString(), newsList.get(i).getDescription().toString()};
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        NewsTable.setModel(model);

        NavHighlights.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new Highlights(new GeneralStatsDAOImpl(),new PlayerDAOImpl());
                dispose();
            }
        });

        NavSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new Search();
                dispose();
            }
        });
        NavLeague.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new LeagueStanding();
                dispose();
            }
        });
        NavMatch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new Matches();
                dispose();
            }
        });
    }
}
