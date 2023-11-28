package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.coderslab.model.StatsTeam;
import pl.coderslab.repository.StatsTeamRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;


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


    public StatsTeam saveStatsTeam(StatsTeam statsTeam) {
        return statsTeamRepository.save(statsTeam);
    }

    @Transactional
    public void updateStatsTeam(StatsTeam statsTeam) {
        Optional<StatsTeam> optionalExistingStatsTeam = statsTeamRepository.findById(statsTeam.getId());
        if (optionalExistingStatsTeam.isPresent()) {
            StatsTeam existingStatsTeam = optionalExistingStatsTeam.get();
            existingStatsTeam.setWins(existingStatsTeam.getWins() + statsTeam.getWins());
            existingStatsTeam.setLose(existingStatsTeam.getLose() + statsTeam.getLose());
            existingStatsTeam.setThrown(existingStatsTeam.getThrown() + statsTeam.getThrown());
            existingStatsTeam.setLost(existingStatsTeam.getLost() + statsTeam.getLost());
            statsTeamRepository.save(existingStatsTeam);
        }
    }

    public StatsTeam getStatsByTeamId(Long teamId) {
        return statsTeamRepository.findByTeamId(teamId).orElse(null);
    }

    public List<StatsTeam> getTeamsWithMostWins(int limit) {
        return statsTeamRepository.findTopByOrderByWinsDesc(PageRequest.of(0, limit));
    }

    public List<StatsTeam> getTeamsWithMostLose(int limit) {
        return statsTeamRepository.findTopByOrderByLoseAsc(PageRequest.of(0, limit));
    }
}
