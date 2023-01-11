package dao;

import model.News;

import java.util.List;

public interface NewsDAO {
    public void deleteNews(List<Integer> news_ids);
    public void addNews(List<News> newsL);
}
