package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.service.TeamService;
import pl.coderslab.model.Team;

import java.util.List;

@Controller
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/add-form")
    public String showAddTeamForm(Model model) {
        model.addAttribute("team", new Team());
        return "addTeam";
    }

    @PostMapping("/add")
    public String addTeam(@RequestParam String name) {
        teamService.createTeam(name);
        return "redirect:/teams";
    }

    @GetMapping
    public String listTeams(Model model) {
        List<Team> teams = teamService.getAllTeams();
        model.addAttribute("teams", teams);
        return "teamList";
    }

}
