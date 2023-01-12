package model;

public class Match {

    public Match() {}

    public Match(String datetime, String stadium, int id) {
        this.datetime = datetime;
        this.stadium = stadium;
        this.id = id;
    }
    private String datetime;
    private String stadium;
    private int id;


    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
