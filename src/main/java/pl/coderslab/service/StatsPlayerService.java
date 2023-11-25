package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.model.StatsPlayer;
import pl.coderslab.repository.StatsPlayerRepository;

import java.util.List;

@Service
public class StatsPlayerService {

    private final StatsPlayerRepository statsPlayerRepository;

    @Autowired
    public StatsPlayerService(StatsPlayerRepository statsPlayerRepository) {
        this.statsPlayerRepository = statsPlayerRepository;
    }

    public List<StatsPlayer> getAllStatsPlayers() {
        return statsPlayerRepository.findAll();
    }

    public StatsPlayer getStatsPlayerById(Integer id) {
        return statsPlayerRepository.findById(id).orElse(null);
    }

    public StatsPlayer saveStatsPlayer(StatsPlayer statsPlayer) {
        return statsPlayerRepository.save(statsPlayer);
    }

    public void deleteStatsPlayer(Integer id) {
        statsPlayerRepository.deleteById(id);
    }

    public List<StatsPlayer> getAllStatsForPlayer(Integer playerId) {
        return statsPlayerRepository.findAllByPlayerId(playerId);
    }
}