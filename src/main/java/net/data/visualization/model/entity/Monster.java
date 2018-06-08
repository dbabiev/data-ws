package net.data.visualization.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "monster")
public class Monster {
    private Long id;
    private String sprite;
    private String kName;
    private String iName;
    private short lv;
    private int hp;
    private Long sp;
    private Long exp;
    private Long jexp;
    private byte range1;
    private int atk1;
    private int atk2;
    private short def;
    private short mdef;
    private short str;
    private short agi;
    private short vit;
    private short intel;
    private short dex;
    private short luk;
    private byte range2;
    private byte range3;
    private byte scale;
    private byte race;
    private byte element;
    private int mode;
    private short speed;
    private short aDelay;
    private short aMotion;
    private short dMotion;
    private Long mexp;
    private short mvp1Id;
    private short mvp1Per;
    private short mvp2Id;
    private short mvp2Per;
    private short mvp3Id;
    private short mvp3Per;
    private short drop1Id;
    private short drop1Per;
    private short drop2Id;
    private short drop2Per;
    private short drop3Id;
    private short drop3Per;
    private short drop4Id;
    private short drop4Per;
    private short drop5Id;
    private short drop5Per;
    private short drop6Id;
    private short drop6Per;
    private short drop7Id;
    private short drop7Per;
    private short drop8Id;
    private short drop8Per;
    private short drop9Id;
    private short drop9Per;
    private short dropCardid;
    private short dropCardper;

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Sprite")
    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    @Basic
    @Column(name = "kName")
    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    @Basic
    @Column(name = "iName")
    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    @Basic
    @Column(name = "LV")
    public short getLv() {
        return lv;
    }

    public void setLv(short lv) {
        this.lv = lv;
    }

    @Basic
    @Column(name = "HP")
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Basic
    @Column(name = "SP")
    public Long getSp() {
        return sp;
    }

    public void setSp(Long sp) {
        this.sp = sp;
    }

    @Basic
    @Column(name = "EXP")
    public Long getExp() {
        return exp;
    }

    public void setExp(Long exp) {
        this.exp = exp;
    }

    @Basic
    @Column(name = "JEXP")
    public Long getJexp() {
        return jexp;
    }

    public void setJexp(Long jexp) {
        this.jexp = jexp;
    }

    @Basic
    @Column(name = "Range1")
    public byte getRange1() {
        return range1;
    }

    public void setRange1(byte range1) {
        this.range1 = range1;
    }

    @Basic
    @Column(name = "ATK1")
    public int getAtk1() {
        return atk1;
    }

    public void setAtk1(int atk1) {
        this.atk1 = atk1;
    }

    @Basic
    @Column(name = "ATK2")
    public int getAtk2() {
        return atk2;
    }

    public void setAtk2(int atk2) {
        this.atk2 = atk2;
    }

    @Basic
    @Column(name = "DEF")
    public short getDef() {
        return def;
    }

    public void setDef(short def) {
        this.def = def;
    }

    @Basic
    @Column(name = "MDEF")
    public short getMdef() {
        return mdef;
    }

    public void setMdef(short mdef) {
        this.mdef = mdef;
    }

    @Basic
    @Column(name = "STR")
    public short getStr() {
        return str;
    }

    public void setStr(short str) {
        this.str = str;
    }

    @Basic
    @Column(name = "AGI")
    public short getAgi() {
        return agi;
    }

    public void setAgi(short agi) {
        this.agi = agi;
    }

    @Basic
    @Column(name = "VIT")
    public short getVit() {
        return vit;
    }

    public void setVit(short vit) {
        this.vit = vit;
    }

    @Basic
    @Column(name = "INT")
    public short getIntel() {
        return intel;
    }

    public void setIntel(short intel) {
        this.intel = intel;
    }

    @Basic
    @Column(name = "DEX")
    public short getDex() {
        return dex;
    }

    public void setDex(short dex) {
        this.dex = dex;
    }

    @Basic
    @Column(name = "LUK")
    public short getLuk() {
        return luk;
    }

    public void setLuk(short luk) {
        this.luk = luk;
    }

    @Basic
    @Column(name = "Range2")
    public byte getRange2() {
        return range2;
    }

    public void setRange2(byte range2) {
        this.range2 = range2;
    }

    @Basic
    @Column(name = "Range3")
    public byte getRange3() {
        return range3;
    }

    public void setRange3(byte range3) {
        this.range3 = range3;
    }

    @Basic
    @Column(name = "Scale")
    public byte getScale() {
        return scale;
    }

    public void setScale(byte scale) {
        this.scale = scale;
    }

    @Basic
    @Column(name = "Race")
    public byte getRace() {
        return race;
    }

    public void setRace(byte race) {
        this.race = race;
    }

    @Basic
    @Column(name = "Element")
    public byte getElement() {
        return element;
    }

    public void setElement(byte element) {
        this.element = element;
    }

    @Basic
    @Column(name = "Mode")
    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    @Basic
    @Column(name = "Speed")
    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    @Basic
    @Column(name = "aDelay")
    public short getaDelay() {
        return aDelay;
    }

    public void setaDelay(short aDelay) {
        this.aDelay = aDelay;
    }

    @Basic
    @Column(name = "aMotion")
    public short getaMotion() {
        return aMotion;
    }

    public void setaMotion(short aMotion) {
        this.aMotion = aMotion;
    }

    @Basic
    @Column(name = "dMotion")
    public short getdMotion() {
        return dMotion;
    }

    public void setdMotion(short dMotion) {
        this.dMotion = dMotion;
    }

    @Basic
    @Column(name = "MEXP")
    public Long getMexp() {
        return mexp;
    }

    public void setMexp(Long mexp) {
        this.mexp = mexp;
    }

    @Basic
    @Column(name = "MVP1id")
    public short getMvp1Id() {
        return mvp1Id;
    }

    public void setMvp1Id(short mvp1Id) {
        this.mvp1Id = mvp1Id;
    }

    @Basic
    @Column(name = "MVP1per")
    public short getMvp1Per() {
        return mvp1Per;
    }

    public void setMvp1Per(short mvp1Per) {
        this.mvp1Per = mvp1Per;
    }

    @Basic
    @Column(name = "MVP2id")
    public short getMvp2Id() {
        return mvp2Id;
    }

    public void setMvp2Id(short mvp2Id) {
        this.mvp2Id = mvp2Id;
    }

    @Basic
    @Column(name = "MVP2per")
    public short getMvp2Per() {
        return mvp2Per;
    }

    public void setMvp2Per(short mvp2Per) {
        this.mvp2Per = mvp2Per;
    }

    @Basic
    @Column(name = "MVP3id")
    public short getMvp3Id() {
        return mvp3Id;
    }

    public void setMvp3Id(short mvp3Id) {
        this.mvp3Id = mvp3Id;
    }

    @Basic
    @Column(name = "MVP3per")
    public short getMvp3Per() {
        return mvp3Per;
    }

    public void setMvp3Per(short mvp3Per) {
        this.mvp3Per = mvp3Per;
    }

    @Basic
    @Column(name = "Drop1id")
    public short getDrop1Id() {
        return drop1Id;
    }

    public void setDrop1Id(short drop1Id) {
        this.drop1Id = drop1Id;
    }

    @Basic
    @Column(name = "Drop1per")
    public short getDrop1Per() {
        return drop1Per;
    }

    public void setDrop1Per(short drop1Per) {
        this.drop1Per = drop1Per;
    }

    @Basic
    @Column(name = "Drop2id")
    public short getDrop2Id() {
        return drop2Id;
    }

    public void setDrop2Id(short drop2Id) {
        this.drop2Id = drop2Id;
    }

    @Basic
    @Column(name = "Drop2per")
    public short getDrop2Per() {
        return drop2Per;
    }

    public void setDrop2Per(short drop2Per) {
        this.drop2Per = drop2Per;
    }

    @Basic
    @Column(name = "Drop3id")
    public short getDrop3Id() {
        return drop3Id;
    }

    public void setDrop3Id(short drop3Id) {
        this.drop3Id = drop3Id;
    }

    @Basic
    @Column(name = "Drop3per")
    public short getDrop3Per() {
        return drop3Per;
    }

    public void setDrop3Per(short drop3Per) {
        this.drop3Per = drop3Per;
    }

    @Basic
    @Column(name = "Drop4id")
    public short getDrop4Id() {
        return drop4Id;
    }

    public void setDrop4Id(short drop4Id) {
        this.drop4Id = drop4Id;
    }

    @Basic
    @Column(name = "Drop4per")
    public short getDrop4Per() {
        return drop4Per;
    }

    public void setDrop4Per(short drop4Per) {
        this.drop4Per = drop4Per;
    }

    @Basic
    @Column(name = "Drop5id")
    public short getDrop5Id() {
        return drop5Id;
    }

    public void setDrop5Id(short drop5Id) {
        this.drop5Id = drop5Id;
    }

    @Basic
    @Column(name = "Drop5per")
    public short getDrop5Per() {
        return drop5Per;
    }

    public void setDrop5Per(short drop5Per) {
        this.drop5Per = drop5Per;
    }

    @Basic
    @Column(name = "Drop6id")
    public short getDrop6Id() {
        return drop6Id;
    }

    public void setDrop6Id(short drop6Id) {
        this.drop6Id = drop6Id;
    }

    @Basic
    @Column(name = "Drop6per")
    public short getDrop6Per() {
        return drop6Per;
    }

    public void setDrop6Per(short drop6Per) {
        this.drop6Per = drop6Per;
    }

    @Basic
    @Column(name = "Drop7id")
    public short getDrop7Id() {
        return drop7Id;
    }

    public void setDrop7Id(short drop7Id) {
        this.drop7Id = drop7Id;
    }

    @Basic
    @Column(name = "Drop7per")
    public short getDrop7Per() {
        return drop7Per;
    }

    public void setDrop7Per(short drop7Per) {
        this.drop7Per = drop7Per;
    }

    @Basic
    @Column(name = "Drop8id")
    public short getDrop8Id() {
        return drop8Id;
    }

    public void setDrop8Id(short drop8Id) {
        this.drop8Id = drop8Id;
    }

    @Basic
    @Column(name = "Drop8per")
    public short getDrop8Per() {
        return drop8Per;
    }

    public void setDrop8Per(short drop8Per) {
        this.drop8Per = drop8Per;
    }

    @Basic
    @Column(name = "Drop9id")
    public short getDrop9Id() {
        return drop9Id;
    }

    public void setDrop9Id(short drop9Id) {
        this.drop9Id = drop9Id;
    }

    @Basic
    @Column(name = "Drop9per")
    public short getDrop9Per() {
        return drop9Per;
    }

    public void setDrop9Per(short drop9Per) {
        this.drop9Per = drop9Per;
    }

    @Basic
    @Column(name = "DropCardid")
    public short getDropCardid() {
        return dropCardid;
    }

    public void setDropCardid(short dropCardid) {
        this.dropCardid = dropCardid;
    }

    @Basic
    @Column(name = "DropCardper")
    public short getDropCardper() {
        return dropCardper;
    }

    public void setDropCardper(short dropCardper) {
        this.dropCardper = dropCardper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster that = (Monster) o;

        if (lv != that.lv) return false;
        if (hp != that.hp) return false;
        if (range1 != that.range1) return false;
        if (atk1 != that.atk1) return false;
        if (atk2 != that.atk2) return false;
        if (def != that.def) return false;
        if (mdef != that.mdef) return false;
        if (str != that.str) return false;
        if (agi != that.agi) return false;
        if (vit != that.vit) return false;
        if (intel != that.intel) return false;
        if (dex != that.dex) return false;
        if (luk != that.luk) return false;
        if (range2 != that.range2) return false;
        if (range3 != that.range3) return false;
        if (scale != that.scale) return false;
        if (race != that.race) return false;
        if (element != that.element) return false;
        if (mode != that.mode) return false;
        if (speed != that.speed) return false;
        if (aDelay != that.aDelay) return false;
        if (aMotion != that.aMotion) return false;
        if (dMotion != that.dMotion) return false;
        if (mvp1Id != that.mvp1Id) return false;
        if (mvp1Per != that.mvp1Per) return false;
        if (mvp2Id != that.mvp2Id) return false;
        if (mvp2Per != that.mvp2Per) return false;
        if (mvp3Id != that.mvp3Id) return false;
        if (mvp3Per != that.mvp3Per) return false;
        if (drop1Id != that.drop1Id) return false;
        if (drop1Per != that.drop1Per) return false;
        if (drop2Id != that.drop2Id) return false;
        if (drop2Per != that.drop2Per) return false;
        if (drop3Id != that.drop3Id) return false;
        if (drop3Per != that.drop3Per) return false;
        if (drop4Id != that.drop4Id) return false;
        if (drop4Per != that.drop4Per) return false;
        if (drop5Id != that.drop5Id) return false;
        if (drop5Per != that.drop5Per) return false;
        if (drop6Id != that.drop6Id) return false;
        if (drop6Per != that.drop6Per) return false;
        if (drop7Id != that.drop7Id) return false;
        if (drop7Per != that.drop7Per) return false;
        if (drop8Id != that.drop8Id) return false;
        if (drop8Per != that.drop8Per) return false;
        if (drop9Id != that.drop9Id) return false;
        if (drop9Per != that.drop9Per) return false;
        if (dropCardid != that.dropCardid) return false;
        if (dropCardper != that.dropCardper) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (sprite != null ? !sprite.equals(that.sprite) : that.sprite != null) return false;
        if (kName != null ? !kName.equals(that.kName) : that.kName != null) return false;
        if (iName != null ? !iName.equals(that.iName) : that.iName != null) return false;
        if (sp != null ? !sp.equals(that.sp) : that.sp != null) return false;
        if (exp != null ? !exp.equals(that.exp) : that.exp != null) return false;
        if (jexp != null ? !jexp.equals(that.jexp) : that.jexp != null) return false;
        if (mexp != null ? !mexp.equals(that.mexp) : that.mexp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (sprite != null ? sprite.hashCode() : 0);
        result = 31 * result + (kName != null ? kName.hashCode() : 0);
        result = 31 * result + (iName != null ? iName.hashCode() : 0);
        result = 31 * result + (int) lv;
        result = 31 * result + hp;
        result = 31 * result + (sp != null ? sp.hashCode() : 0);
        result = 31 * result + (exp != null ? exp.hashCode() : 0);
        result = 31 * result + (jexp != null ? jexp.hashCode() : 0);
        result = 31 * result + (int) range1;
        result = 31 * result + (int) atk1;
        result = 31 * result + (int) atk2;
        result = 31 * result + (int) def;
        result = 31 * result + (int) mdef;
        result = 31 * result + (int) str;
        result = 31 * result + (int) agi;
        result = 31 * result + (int) vit;
        result = 31 * result + (int) intel;
        result = 31 * result + (int) dex;
        result = 31 * result + (int) luk;
        result = 31 * result + (int) range2;
        result = 31 * result + (int) range3;
        result = 31 * result + (int) scale;
        result = 31 * result + (int) race;
        result = 31 * result + (int) element;
        result = 31 * result + mode;
        result = 31 * result + (int) speed;
        result = 31 * result + (int) aDelay;
        result = 31 * result + (int) aMotion;
        result = 31 * result + (int) dMotion;
        result = 31 * result + (mexp != null ? mexp.hashCode() : 0);
        result = 31 * result + (int) mvp1Id;
        result = 31 * result + (int) mvp1Per;
        result = 31 * result + (int) mvp2Id;
        result = 31 * result + (int) mvp2Per;
        result = 31 * result + (int) mvp3Id;
        result = 31 * result + (int) mvp3Per;
        result = 31 * result + (int) drop1Id;
        result = 31 * result + (int) drop1Per;
        result = 31 * result + (int) drop2Id;
        result = 31 * result + (int) drop2Per;
        result = 31 * result + (int) drop3Id;
        result = 31 * result + (int) drop3Per;
        result = 31 * result + (int) drop4Id;
        result = 31 * result + (int) drop4Per;
        result = 31 * result + (int) drop5Id;
        result = 31 * result + (int) drop5Per;
        result = 31 * result + (int) drop6Id;
        result = 31 * result + (int) drop6Per;
        result = 31 * result + (int) drop7Id;
        result = 31 * result + (int) drop7Per;
        result = 31 * result + (int) drop8Id;
        result = 31 * result + (int) drop8Per;
        result = 31 * result + (int) drop9Id;
        result = 31 * result + (int) drop9Per;
        result = 31 * result + (int) dropCardid;
        result = 31 * result + (int) dropCardper;
        return result;
    }
}
