package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Player;


public interface PlayerRepository extends JpaRepository<Player, Long> {
}