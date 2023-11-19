package pl.coderslab.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.MatchResult;

@Repository
public interface MatchResultRepository extends JpaRepository<MatchResult, Long>{

}
