package pl.coderslab.model;


import javax.persistence.*;

@Entity
@Table(name = "StatsPlayer")
public class StatsPlayer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;
    private int points;
    private int assist;
    private int rebound;

    @OneToOne
    @JoinColumn(name = "player_id")
    private Player player;

    public StatsPlayer(){
    }

    public StatsPlayer(long id, Team team, int points, int assist, int rebound, Player player) {
        this.id = id;
        this.team = team;
        this.points = points;
        this.assist = assist;
        this.rebound = rebound;
        this.player = player;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
