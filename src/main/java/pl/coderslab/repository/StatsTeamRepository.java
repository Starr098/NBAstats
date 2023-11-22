package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.StatsTeam;

@Repository
public interface StatsTeamRepository extends JpaRepository<StatsTeam, Long> {
}
