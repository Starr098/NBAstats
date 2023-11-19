package pl.coderslab.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.service.MatchResultService;
import pl.coderslab.model.MatchResult;
import java.util.List;

@Controller
@RequestMapping("/match-results")
public class MatchResultController {

    private final MatchResultService matchResultService;

    @Autowired
    public MatchResultController(MatchResultService matchResultService) {
        this.matchResultService = matchResultService;
    }

    @GetMapping("/all")
    public String getAllMatchResults(Model model) {
        List<MatchResult> matchResults = matchResultService.getAllMatchResults();
        model.addAttribute("matchResults", matchResults);
        return "matchResults";
    }

    @GetMapping("/add-form")
    public String showAddMatchResultForm(Model model) {
        model.addAttribute("matchResult", new MatchResult());
        // Pobierz i dodaj listy drużyn, daty itp. do modelu, jeśli potrzebne
        return "addMatchResult"; // Nazwa pliku HTML lub JSP
    }

    @PostMapping("/add")
    public String addMatchResult(@ModelAttribute("matchResult") MatchResult matchResult) {
        matchResultService.saveMatchResult(matchResult);
        return "redirect:/match-results/all";
    }


}