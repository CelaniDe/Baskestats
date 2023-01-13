package ui;

import dao.MatchDAO;
import dao.MatchDAOImpl;
import org.json.simple.JSONObject;

import javax.swing.*;


public class Match extends JFrame {

    private JPanel Master;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;
    private JPanel Header;
    private JButton Team1ImgButton;
    private JLabel MatchTitle;
    private JLabel MatchName;
    private JLabel VSLabel;
    private JPanel Mid;
    private JLabel Info1;
    private JLabel Info2;
    private JLabel Info3;
    private JButton Team2ImgButton;

    public Match(int match_id)
    {
        setContentPane(Master);
        setTitle("Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
        setVisible(true);

        MatchDAO matchDAO = new MatchDAOImpl();
        model.Match match = matchDAO.getMatchById(match_id);
        Info1.setText("Date : " + match.getDate());
        Info2.setText("Time : " + match.getTime());
        Info3.setText("Stadium : " + match.getStadium());
    }
}
