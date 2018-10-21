package net.data.util;

import net.data.model.entity.Monster;
import net.data.model.transfer.MonsterTO;

public class TOConverter {

    public static MonsterTO toTO(Monster m) {
        return (null != m) ? new MonsterTO(m.getkName(), m.getLv(), m.getHp(), m.getSp(), m.getExp()) : null;
    }
}