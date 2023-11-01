package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.Dao.PlayerDao;
import pl.coderslab.model.Player;

@Controller
public class PlayerController {

    private PlayerDao playerDao;

    @RequestMapping(value = "/addPlayer", method = RequestMethod.POST)
    public String addPlayer(
            @RequestParam("imie") String firstName,
            @RequestParam("nazwisko") String lastName,
            @RequestParam("team") String team,
            @RequestParam("punkty") int points,
            @RequestParam("asysty") int assist,
            @RequestParam("zbiorki") int rebound,
            Model model
    ) {
        Player player = new Player();
        player.setFirstName(firstName);
        player.setLastName(lastName);
        player.setTeam(team);
        player.setPoints(points);
        player.setAssist(assist);
        player.setRebound(rebound);

        playerDao.addPlayer(player);

        model.addAttribute("wiadomosc", "Zawodnik został dodany do bazy danych.");

        return "wynik";
    }
}
