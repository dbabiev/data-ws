package net.data.service;

import net.data.repository.MonsterRepository;
import net.data.model.entity.Monster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MonsterService {

    @Autowired
    private MonsterRepository monsterRepository;

    public List<Monster> list(){
        return monsterRepository.list();
    }
}
