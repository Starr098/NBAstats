package pl.coderslab.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.coderslab.Dao.PlayerDao;
import pl.coderslab.model.Player;


@Repository
public class PlayerRepository implements PlayerDao {

    private SessionFactory sessionFactory;

    @Override
    public void addPlayer(Player player) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(player);

    }
}