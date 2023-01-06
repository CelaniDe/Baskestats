package stats;

public class LeagueStanding
{
private int teamsAmount;
private int totalGames;
private int totalWins;
private int totalLoses;
private int totalPoints;


public LeagueStanding(){}
public LeagueStanding(int teamsAmount, int totalGames, int totalWins, int totalLoses, int totalPoints) {
        this.teamsAmount = teamsAmount;
        this.totalGames = totalGames;
        this.totalWins = totalWins;
        this.totalLoses = totalLoses;
        this.totalPoints = totalPoints;
    }

    public int getTeamsAmount() {
        return teamsAmount;
    }

    public void setTeamsAmount(int teamsAmount) {
        this.teamsAmount = teamsAmount;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }

    public int getTotalLoses() {
        return totalLoses;
    }

    public void setTotalLoses(int totalLoses) {
        this.totalLoses = totalLoses;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}
