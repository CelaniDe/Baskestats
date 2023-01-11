package dao;

import DatabaseFakeJson.NewsCRUD;
import model.NewsModel;

import java.util.List;

public class NewsDAOImpl implements NewsDAO {

    @Override
    public void deleteNews(List<Integer> news_ids) {
        NewsCRUD newsCRUD = new NewsCRUD();
        newsCRUD.deleteNews(news_ids);
    }

    @Override
    public void addNews(List<NewsModel> newsL) {
        NewsCRUD newsCRUD = new NewsCRUD();
        newsCRUD.addNews(newsL);
    }
}
