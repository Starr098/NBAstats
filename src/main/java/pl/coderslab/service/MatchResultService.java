package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.model.MatchResult;
import pl.coderslab.repository.MatchResultRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class MatchResultService {

    private final MatchResultRepository matchResultRepository;

    @Autowired
    public MatchResultService(MatchResultRepository matchResultRepository) {
        this.matchResultRepository = matchResultRepository;
    }

    public List<MatchResult> getAllMatchResults() {
        return matchResultRepository.findAll();
    }

    @Transactional
    public void saveMatchResult(MatchResult matchResult) {
        matchResultRepository.save(matchResult);
    }

}
