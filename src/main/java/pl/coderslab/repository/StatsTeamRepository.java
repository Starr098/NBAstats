package pl.coderslab.repository;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.StatsTeam;
import java.util.Optional;

import java.util.List;

@Repository
public interface StatsTeamRepository extends JpaRepository<StatsTeam, Long> {

    Optional<StatsTeam> findByTeamId(Long teamId);

    List<StatsTeam> findTopByOrderByWinsDesc(Pageable pageable);

    List<StatsTeam> findTopByOrderByLoseAsc(Pageable pageable);


}
