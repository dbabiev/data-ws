package net.data.controller;

import net.data.model.transfer.MonsterTO;
import net.data.service.MonsterService;
import net.data.util.TOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api/monster")
public class MonsterController {

    @Autowired
    private MonsterService monsterService;

    @RequestMapping(method = RequestMethod.GET)
    public List<MonsterTO> list(){
        return monsterService.list().stream().map(TOConverter::toTO).collect(toList());
    }
}
