package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.StatsPlayer;

@Repository
public interface StatsPlayerRepository extends JpaRepository<StatsPlayer, Integer> {
}