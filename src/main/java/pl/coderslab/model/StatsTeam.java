package pl.coderslab.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StatsTeam")
public class StatsTeam {

    @Id
    private long id;

    private int wins;
    private int lose;
    private int thrown;
    private int lost;


    public StatsTeam(){
    }

    public StatsTeam(long id, int wins, int lose, int thrown, int lost) {
        this.id = id;
        this.wins = wins;
        this.lose = lose;
        this.thrown = thrown;
        this.lost = lost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getThrown() {
        return thrown;
    }

    public void setThrown(int thrown) {
        this.thrown = thrown;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }
}
