package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Player;
import pl.coderslab.model.PlayerStatsInfo;
import pl.coderslab.model.StatsPlayer;
import java.util.List;

@Repository
public interface StatsPlayerRepository extends JpaRepository<StatsPlayer, Integer> {

    @Query("SELECT s.player.firstName, s.player.lastName, AVG(s.points), AVG(s.assist), AVG(s.rebound) " +
            "FROM StatsPlayer s GROUP BY s.player.id")
    List<Object[]> calculateAverageStatsForAllPlayers();

    List<StatsPlayer> findAllByPlayerId(Long playerId);

}
