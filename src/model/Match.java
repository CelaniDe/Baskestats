package model;

public class Match {

    public Match() {}

    public Match(String date, String stadium, int id, String time, int home, int away) {
        this.date = date;
        this.stadium = stadium;
        this.id = id;
        this.time = time;
        this.home = home;
        this.away = away;
    }
    private String date;
    private String time;
    private String stadium;
    private int id;

    private int home;

    private int away;


    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String datetime) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getAway() {
        return away;
    }

    public void setAway(int away) {
        this.away = away;
    }

    @Override
    public String toString() {
        return "Match{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", stadium='" + stadium + '\'' +
                ", id=" + id + '\'' +
                ", home=" + home + '\'' +
                ", away=" + away + '\'' +
                '}';
    }
}
