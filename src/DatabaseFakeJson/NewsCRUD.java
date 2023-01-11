package DatabaseFakeJson;

import model.NewsModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class NewsCRUD {
    private static String NEWS_JSON_FILE_PATH = "src/json_data/news.json";

    public void deleteNews(List<Integer> news_ids)
    {
        JSONParser parser = new JSONParser();
        try
        {
            FileReader reader = new FileReader(NEWS_JSON_FILE_PATH);
            Object obj = parser.parse(reader);
            JSONArray newsList = (JSONArray) obj;

            for(int news : news_ids)
            {
                for(int i = 0; i < newsList.size(); i++)
                {
                    JSONObject newsObject = (JSONObject) newsList.get(i);
                    int id = (int)(long)(newsObject.get("id"));
                    if(id == news)
                    {
                        newsList.remove(i);
                    }
                }
            }

            FileWriter file = new FileWriter(NEWS_JSON_FILE_PATH);
            file.write(newsList.toJSONString());
            file.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void addNews(List<NewsModel> newsL) {
        {
            JSONParser parser = new JSONParser();
            try
            {
                FileReader reader = new FileReader(NEWS_JSON_FILE_PATH);
                Object obj = parser.parse(reader);
                JSONArray newsList = (JSONArray) obj;
                reader.close();

                for (NewsModel news : newsL) {
                    JSONObject newNews = new JSONObject();
                    newNews.put("id", JsonArrayUtils.getLastID(newsList)+1);
                    newNews.put("title", news.getTitle());
                    newNews.put("description", news.getDescription());
                    newsList.add(newNews);
                }
                FileWriter file = new FileWriter(NEWS_JSON_FILE_PATH);
                file.write(newsList.toJSONString());
                file.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
