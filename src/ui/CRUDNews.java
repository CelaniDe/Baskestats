package ui;

import dao.NewsDAO;
import dao.NewsDAOImpl;
import model.NewsModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CRUDNews extends JFrame {
    private JTextField newsTitleTextField;
    private JPanel crudpanel;
    private JTextArea descriptionTextArea;
    private JButton CREATEButton;

    public CRUDNews() {
        setContentPane(crudpanel);
        JFrame my_frame = this;
        setTitle("Create News");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000,800);
        setVisible(true);
        CREATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewsDAO newsDAO = new NewsDAOImpl();
                List<NewsModel> lista =  new ArrayList<>();
                lista.add(new NewsModel(newsTitleTextField.getText(),descriptionTextArea.getText()));
                newsDAO.addNews(lista);
                JOptionPane.showMessageDialog(my_frame, "The news have been added with success!!!");
                JFrame frame = new CRUD();
                dispose();
            }
        });
    }
}
