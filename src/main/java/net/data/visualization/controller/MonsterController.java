package net.data.visualization.controller;

import net.data.visualization.model.transfer.MonsterTO;
import net.data.visualization.service.MonsterService;
import net.data.visualization.util.TOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/monster")
public class MonsterController {

    @Autowired
    private MonsterService monsterService;

    @RequestMapping(method = RequestMethod.GET)
    public List<MonsterTO> list(){
        return monsterService.list().stream().map(TOConverter::toTO).collect(toList());
    }
}
