package dao;

import DatabaseFakeJson.NewsCRUD;
import model.News;

import java.util.List;

public class NewsDAOImpl implements NewsDAO {

    @Override
    public void deleteNews(List<Integer> news_ids) {
        NewsCRUD newsCRUD = new NewsCRUD();
        newsCRUD.deleteNews(news_ids);
    }

    @Override
    public void addNews(List<News> newsL) {
        NewsCRUD newsCRUD = new NewsCRUD();
        newsCRUD.addNews(newsL);
    }
}
