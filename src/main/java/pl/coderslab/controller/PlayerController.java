package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import pl.coderslab.service.PlayerService;
import pl.coderslab.service.TeamService;
import pl.coderslab.model.Player;
import pl.coderslab.model.Team;
import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {

    private PlayerService playerService;
    private TeamService teamService;


    @Autowired
    public PlayerController(PlayerService playerService, TeamService teamService) {
        this.playerService = playerService;
        this.teamService = teamService;
    }

    @PostMapping("/add")
    public String addPlayer(@ModelAttribute Player player) {
        playerService.createPlayer(player);
        return "redirect:/players";
    }

    @GetMapping
    public String listPlayers(Model model) {
        List<Player> players = playerService.getAllPlayers();
        model.addAttribute("players", players);
        return "playerList";
    }

    @GetMapping("/add-form")
    public String showAddPlayerForm(Model model) {
        List<Team> teams = teamService.getAllTeams();
        model.addAttribute("teams", teams);
        model.addAttribute("player", new Player());
        System.out.println("Teams: " + teams);
        return "addPlayer";
    }


}