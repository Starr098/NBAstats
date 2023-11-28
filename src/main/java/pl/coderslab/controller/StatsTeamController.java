package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.StatsTeam;
import pl.coderslab.model.Team;
import pl.coderslab.service.StatsTeamService;
import pl.coderslab.service.TeamService;

import java.util.List;

@Controller
@RequestMapping("/stats-teams")
public class StatsTeamController {

    private final StatsTeamService statsTeamService;
    private final TeamService teamService;

    @Autowired
    public StatsTeamController(StatsTeamService statsTeamService, TeamService teamService) {
        this.statsTeamService = statsTeamService;
        this.teamService = teamService;
    }

    @GetMapping("/all")
    public String getAllStatsTeams(Model model) {
        List<StatsTeam> statsTeams = statsTeamService.getAllStatsTeams();
        model.addAttribute("statsTeams", statsTeams);
        return "statsTeams";
    }

    @GetMapping("/add-form")
    public String showAddStatsTeamForm(Model model) {
        List<Team> teams = teamService.getAllTeams(); // Pobierz listę drużyn z serwisu TeamService
        model.addAttribute("teams", teams); // Przekazanie listy drużyn do widoku
        model.addAttribute("statsTeam", new StatsTeam());
        return "addStatsTeam"; // Nazwa pliku HTML lub JSP
    }

    @PostMapping("/add")
    public String addStatsTeam(@ModelAttribute("statsTeam") StatsTeam statsTeam) {
        statsTeamService.saveStatsTeam(statsTeam);
        return "redirect:/stats-teams/all";
    }

    @PostMapping("/update")
    public String updateStatsTeam(@ModelAttribute("statsTeam") StatsTeam statsTeam, @RequestParam("team.id") Long teamId) {
        statsTeam.setId(teamId);
        statsTeamService.updateStatsTeam(statsTeam);
        return "redirect:/stats-teams/all";
    }

    @GetMapping("/{teamId}")
    public StatsTeam getStatsByTeamId(@PathVariable Long teamId) {
        return statsTeamService.getStatsByTeamId(teamId);
    }

    @GetMapping("/most-wins/{limit}")
    public List<StatsTeam> getTeamsWithMostWins(@PathVariable int limit) {
        return statsTeamService.getTeamsWithMostWins(limit);
    }

    @GetMapping("/least-loses/{limit}")
    public List<StatsTeam> getTeamsWithLeastLoses(@PathVariable int limit) {
        return statsTeamService.getTeamsWithMostLose(limit);
    }

}

