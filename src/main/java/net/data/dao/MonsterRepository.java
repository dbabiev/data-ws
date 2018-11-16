package net.data.dao;

import net.data.model.entity.Monster;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MonsterRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Monster> list(){
        return em.createQuery("select m from Monster m", Monster.class).getResultList();
    }
}
