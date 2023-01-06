package model;

public class Match {

    public Match() {}

    public Match(String datetime, String stadium) {
        this.datetime = datetime;
        this.stadium = stadium;
    }
    private String datetime;
    private String stadium;


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
}
