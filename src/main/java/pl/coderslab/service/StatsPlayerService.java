package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.model.PlayerStatsInfo;
import pl.coderslab.model.StatsPlayer;
import pl.coderslab.repository.StatsPlayerRepository;

import java.util.ArrayList;
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

    public List<StatsPlayer> getStatsByPlayerId(Long playerId) {
        return statsPlayerRepository.findByPlayerId(playerId);
    }

    public List<PlayerStatsInfo> calculateAverageStatsForAllPlayers() {
        List<Object[]> playerStats = statsPlayerRepository.calculateAverageStatsForAllPlayers();
        List<PlayerStatsInfo> playerStatsInfoList = new ArrayList<>();

        for (Object[] stats : playerStats) {
            String firstName = (String) stats[0];
            String lastName = (String) stats[1];
            double pointsAverage = (Double) stats[2];
            double assistAverage = (Double) stats[3];
            double reboundAverage = (Double) stats[4];

            PlayerStatsInfo playerStatsInfo = new PlayerStatsInfo(firstName, lastName, pointsAverage, assistAverage, reboundAverage);
            playerStatsInfoList.add(playerStatsInfo);
        }

        return playerStatsInfoList;
    }



}