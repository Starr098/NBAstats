package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Player;
import pl.coderslab.repository.PlayerRepository;

import java.util.List;


@Service
public class PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long id, Player updatedPlayer) {
        Player player = getPlayerById(id);

        if (player != null) {
            player.setFirstName(updatedPlayer.getFirstName());
            player.setLastName(updatedPlayer.getLastName());
            player.setTeam(updatedPlayer.getTeam());
            return playerRepository.save(player);
        }

        return null; // Gracz o podanym ID nie istnieje
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
