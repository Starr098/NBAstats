package pl.coderslab.model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;


@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Player> players;


    public Team(Long id, String name, List<Player> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
       return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

}
