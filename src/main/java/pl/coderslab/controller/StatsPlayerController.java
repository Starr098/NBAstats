package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Player;
import pl.coderslab.model.StatsPlayer;
import pl.coderslab.model.Team;
import pl.coderslab.service.PlayerService;
import pl.coderslab.service.StatsPlayerService;
import pl.coderslab.service.TeamService;

import java.util.List;

@Controller
@RequestMapping("/stats-players")
public class StatsPlayerController {

    private final StatsPlayerService statsPlayerService;
    private final TeamService teamService;
    private final PlayerService playerService;

    @Autowired
    public StatsPlayerController(StatsPlayerService statsPlayerService, TeamService teamService, PlayerService playerService) {
        this.statsPlayerService = statsPlayerService;
        this.teamService = teamService;
        this.playerService = playerService;
    }

    @GetMapping("/add-form")
    public String showAddStatsPlayerForm(Model model) {
        List<Team> teams = teamService.getAllTeams(); // Pobierz listę drużyn z serwisu TeamService
        List<Player> players = playerService.getAllPlayers(); // Pobierz listę zawodników z serwisu PlayerService

        model.addAttribute("teams", teams); // Przekazanie listy drużyn do widoku
        model.addAttribute("players", players); // Przekazanie listy zawodników do widoku
        model.addAttribute("statsPlayer", new StatsPlayer());

        return "addStatsPlayer"; // Nazwa pliku HTML lub JSP
    }

    @PostMapping("/add")
    public String addStatsPlayer(@ModelAttribute("statsPlayer") StatsPlayer statsPlayer) {
        statsPlayerService.saveStatsPlayer(statsPlayer);
        return "redirect:/stats-players/all";
    }

    @GetMapping("/all")
    public String showAllStatsPlayers(Model model) {
        List<StatsPlayer> statsPlayers = statsPlayerService.getAllStatsPlayers();
        model.addAttribute("statsPlayers", statsPlayers);
        model.addAttribute("selectedPlayerStats", new StatsPlayer()); // Pusty obiekt na wybrane statystyki

        return "statsPlayers";
    }

    @PostMapping("/select")
    public String selectPlayerStats(@RequestParam("selectedPlayerId") Integer selectedPlayerId, Model model) {
        if (selectedPlayerId != null) {
            StatsPlayer selectedPlayerStats = statsPlayerService.getStatsPlayerById(selectedPlayerId);
            model.addAttribute("selectedPlayerStats", selectedPlayerStats);
        }

        List<StatsPlayer> statsPlayers = statsPlayerService.getAllStatsPlayers();
        model.addAttribute("statsPlayers", statsPlayers);

        return "statsPlayers";
    }




}

