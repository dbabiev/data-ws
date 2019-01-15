package net.data.repository;

import net.data.model.entity.Monster;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MonsterRepository {

    @PersistenceContext
    private EntityManager em;


    @Transactional(readOnly = true)
    @PreAuthorize("hasAuthority('MONSTER_READ')")
    public List<Monster> list(){
        return em.createQuery("select m from Monster m", Monster.class).getResultList();
    }
}
