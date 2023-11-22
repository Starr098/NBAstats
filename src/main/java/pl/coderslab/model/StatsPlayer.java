package pl.coderslab.model;


import javax.persistence.*;

@Entity
@Table(name = "StatsPlayer")
public class StatsPlayer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String team;
    private int points;
    private int assist;
    private int rebound;

    @OneToOne
    @JoinColumn(name = "player_id")
    private Player player;

    public StatsPlayer(){
    }

    public StatsPlayer(int id, String team, int points, int assist, int rebound) {
        this.id = id;
        this.team = team;
        this.points = points;
        this.assist = assist;
        this.rebound = rebound;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public int getRebound() {
        return rebound;
    }

    public void setRebound(int rebound) {
        this.rebound = rebound;
    }
}
