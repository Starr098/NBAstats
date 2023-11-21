package pl.coderslab.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.model.Team;
import pl.coderslab.service.MatchResultService;
import pl.coderslab.model.MatchResult;
import pl.coderslab.service.TeamService;

import java.util.List;

@Controller
@RequestMapping("/match-results")
public class MatchResultController {

    private final MatchResultService matchResultService;
    private final TeamService teamService;

    @Autowired
    public MatchResultController(MatchResultService matchResultService, TeamService teamService) {
        this.matchResultService = matchResultService;
        this.teamService = teamService;
    }

    @GetMapping("/all")
    public String getAllMatchResults(Model model) {
        List<MatchResult> matchResults = matchResultService.getAllMatchResults();
        model.addAttribute("matchResults", matchResults);
        return "matchResults";
    }

    @GetMapping("/add-form")
    public String showAddMatchResultForm(Model model) {
        List<Team> teams = teamService.getAllTeams(); // Pobierz listę drużyn z serwisu TeamService
        model.addAttribute("teams", teams); // Przekazanie listy drużyn do widoku
        model.addAttribute("matchResult", new MatchResult());
        return "addMatchResult"; // Nazwa pliku HTML lub JSP
    }

    @PostMapping("/add")
    public String addMatchResult(@ModelAttribute("matchResult") MatchResult matchResult) {
        matchResultService.saveMatchResult(matchResult);
        return "redirect:/match-results/all";
    }


}