package net.data.service;

import net.data.dao.MonsterDao;
import net.data.model.entity.Monster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MonsterService {

    @Autowired
    private MonsterDao monsterDao;

    public List<Monster> list(){
        return monsterDao.list();
    }
}
