package net.data.model.transfer;

import java.io.Serializable;

public class MonsterTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String kName;
    private short lv;
    private int hp;
    private Long sp;
    private Long exp;

    public MonsterTO(String kName, short lv, int hp, Long sp, Long exp) {
        this.kName = kName;
        this.lv = lv;
        this.hp = hp;
        this.sp = sp;
        this.exp = exp;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    public short getLv() {
        return lv;
    }

    public void setLv(short lv) {
        this.lv = lv;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Long getSp() {
        return sp;
    }

    public void setSp(Long sp) {
        this.sp = sp;
    }

    public Long getExp() {
        return exp;
    }

    public void setExp(Long exp) {
        this.exp = exp;
    }
}
