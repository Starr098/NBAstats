package pl.coderslab.Service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.coderslab.model.Player;
import pl.coderslab.repository.PlayerRepository;

public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player createPlayer(String firstName, String lastName) {
        Player player = new Player(firstName, lastName);
        return playerRepository.save(player);
    }

    public Player getPlayerById(Long playerId) {
        return playerRepository.findById(playerId).orElse(null);
    }
    public Player addPlayer(Player player) {

        return playerRepository.save(player);
    }
}
