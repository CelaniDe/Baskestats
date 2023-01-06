package stats;

public class GeneralStat
{

    private int wins;
    private int GP;
    private int Championships;

    public GeneralStat(){}

    public GeneralStat(int wins, int GP, int championships) {
        this.wins = wins;
        this.GP = GP;
        Championships = championships;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getGP() {
        return GP;
    }

    public void setGP(int GP) {
        this.GP = GP;
    }

    public int getChampionships() {
        return Championships;
    }

    public void setChampionships(int championships) {
        Championships = championships;
    }
}
