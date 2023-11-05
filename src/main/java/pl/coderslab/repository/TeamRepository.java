package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}