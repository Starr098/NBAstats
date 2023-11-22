package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.model.StatsTeam;
import pl.coderslab.repository.StatsTeamRepository;

import java.util.List;

@Service
public class StatsTeamService {

    private final StatsTeamRepository statsTeamRepository;

    @Autowired
    public StatsTeamService(StatsTeamRepository statsTeamRepository) {
        this.statsTeamRepository = statsTeamRepository;
    }

    public List<StatsTeam> getAllStatsTeams() {
        return statsTeamRepository.findAll();
    }

    public StatsTeam getStatsTeamById(long id) {
        return statsTeamRepository.findById(id).orElse(null);
    }

    public StatsTeam saveStatsTeam(StatsTeam statsTeam) {
        return statsTeamRepository.save(statsTeam);
    }

    public void updateStatsTeam(StatsTeam statsTeam) {
        StatsTeam existingStatsTeam = statsTeamRepository.findById(statsTeam.getId()).orElse(null);
        if (existingStatsTeam != null) {
            existingStatsTeam.setWins(existingStatsTeam.getWins() + statsTeam.getWins());
            existingStatsTeam.setLose(existingStatsTeam.getLose() + statsTeam.getLose());
            existingStatsTeam.setThrown(existingStatsTeam.getThrown() + statsTeam.getThrown());
            existingStatsTeam.setLost(existingStatsTeam.getLost() + statsTeam.getLost());
            statsTeamRepository.save(existingStatsTeam);
        }
    }
}
