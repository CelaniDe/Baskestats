package dao;

import model.NewsModel;

import java.util.List;

public interface NewsDAO {
    public void deleteNews(List<Integer> news_ids);
    public void addNews(List<NewsModel> newsL);
    public List<NewsModel> getNews();
}
