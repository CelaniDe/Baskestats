package stats;

public class GameStat
{
    private float PPG;
    private float APG;
    private float RPG;
    private float SPG;
    private float BPG;

    public GameStat(){}

    public GameStat(float PPG, float APG, float RPG, float SPG, float BPG) {
        this.PPG = PPG;
        this.APG = APG;
        this.RPG = RPG;
        this.SPG = SPG;
        this.BPG = BPG;
    }

    public float getPPG() {
        return PPG;
    }

    public void setPPG(float PPG) {
        this.PPG = PPG;
    }

    public float getAPG() {
        return APG;
    }

    public void setAPG(float APG) {
        this.APG = APG;
    }

    public float getRPG() {
        return RPG;
    }

    public void setRPG(float RPG) {
        this.RPG = RPG;
    }

    public float getSPG() {
        return SPG;
    }

    public void setSPG(float SPG) {
        this.SPG = SPG;
    }

    public float getBPG() {
        return BPG;
    }

    public void setBPG(float BPG) {
        this.BPG = BPG;
    }
}
