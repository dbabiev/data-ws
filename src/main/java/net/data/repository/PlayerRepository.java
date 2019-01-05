package net.data.repository;

import net.data.model.entity.Player;
import net.data.util.ListUtil;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PlayerRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Player> list(){
        return em.createQuery("select p from Player p", Player.class)
            .getResultList();
    }

    public Player findByLogin(String login){
        List<Player> players = em.createQuery("select p from Player p where p.login = :login", Player.class)
            .setParameter("login", login)
            .getResultList();
        return ListUtil.firstOrNull(players);
    }
}
