package net.data.service;

import net.data.repository.PlayerRepository;
import net.data.model.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> list(){
        return playerRepository.list();
    }

    public Player findByLogin(String login){
        return (login != null) ? playerRepository.findByLogin(login) : null;
    }
}
