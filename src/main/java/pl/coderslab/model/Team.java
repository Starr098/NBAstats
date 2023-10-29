package pl.coderslab.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "pole nie może być puste") // Dzień 3 zad.dom.1
    @Size(min = 5, message = "pole musi mieć minimum {min} znaków")
    private String name;
    private int wins;
    private int lose;
    private int thrown;
    private int lost;

    public Team() {
    }

    public Team(Long id, String name, int wins, int lose, int thrown, int lost) {
        this.id = id;
        this.name = name;
        this.wins = wins;
        this.lose = lose;
        this.thrown = thrown;
        this.lost = lost;
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

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
