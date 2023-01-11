package model;

public class News {
    private String title;
    private String description;
    private int id;

    public News(String title, String description, int id) {
        this.title = title;
        this.description = description;
        this.id = id;
    }

    public News() {
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
