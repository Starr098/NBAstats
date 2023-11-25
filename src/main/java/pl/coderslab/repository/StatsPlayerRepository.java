package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.StatsPlayer;
import java.util.List;

@Repository
public interface StatsPlayerRepository extends JpaRepository<StatsPlayer, Integer> {

    List<StatsPlayer> findAllByPlayerId(Integer playerId);

}
