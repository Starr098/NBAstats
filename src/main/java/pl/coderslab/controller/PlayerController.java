package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import pl.coderslab.Dao.PlayerDao;
import pl.coderslab.Service.PlayerService;
import pl.coderslab.Service.TeamService;
import pl.coderslab.model.Player;
import pl.coderslab.model.PlayerRequest;
import pl.coderslab.model.Team;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addPlayer(@RequestBody PlayerRequest playerRequest) {
        Player player = new Player(playerRequest.getFirstName(), playerRequest.getLastName());

        Player addedPlayer = playerService.addPlayer(player);

        if (addedPlayer != null) {
            return ResponseEntity.ok("Gracz dodany.");
        } else {
            return ResponseEntity.badRequest().body("Błąd podczas dodawania gracza.");
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayer(@PathVariable Long id) {
        Player player = playerService.getPlayerById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}