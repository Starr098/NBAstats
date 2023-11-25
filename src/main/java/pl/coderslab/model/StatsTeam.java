package pl.coderslab.model;


import javax.persistence.*;

@Entity
@Table(name = "StatsTeam")
public class StatsTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int wins;
    private int lose;
    private int thrown;
    private int lost;

    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;

    public StatsTeam(){
    }

    public StatsTeam(long id, int wins, int lose, int thrown, int lost, Team team) {
        this.id = id;
        this.wins = wins;
        this.lose = lose;
        this.thrown = thrown;
        this.lost = lost;
        this.team = team;
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
