package model;

public class NewsModel {
    private String title;
    private String description;
    private int id;

    public NewsModel(String title, String description, int id) {
        this.title = title;
        this.description = description;
        this.id = id;
    }

    public NewsModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public NewsModel() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
