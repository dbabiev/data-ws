package net.data.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {

    private short id;
    private String nameEnglish;
    private String nameJapanese;
    private byte type;
    private Long priceBuy;
    private Long priceSell;
    private short weight;
    private String atkMatk;
    private Short defence;
    private Byte range;
    private Byte slots;
    private Long equipJobs;
    private Byte equipUpper;
    private Byte equipGenders;
    private String equipLocations;
    private Byte weaponLevel;
    private String equipLevel;
    private Byte refineable;
    private Short view;
    private String script;
    private String equipScript;
    private String unequipScript;

    @Id
    @Column(name = "id")
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name_english")
    public String getNameEnglish() {
        return nameEnglish;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    @Basic
    @Column(name = "name_japanese")
    public String getNameJapanese() {
        return nameJapanese;
    }

    public void setNameJapanese(String nameJapanese) {
        this.nameJapanese = nameJapanese;
    }

    @Basic
    @Column(name = "type")
    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "price_buy")
    public Long getPriceBuy() {
        return priceBuy;
    }

    public void setPriceBuy(Long priceBuy) {
        this.priceBuy = priceBuy;
    }

    @Basic
    @Column(name = "price_sell")
    public Long getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(Long priceSell) {
        this.priceSell = priceSell;
    }

    @Basic
    @Column(name = "weight")
    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "atk:matk")
    public String getAtkMatk() {
        return atkMatk;
    }

    public void setAtkMatk(String atkMatk) {
        this.atkMatk = atkMatk;
    }

    @Basic
    @Column(name = "defence")
    public Short getDefence() {
        return defence;
    }

    public void setDefence(Short defence) {
        this.defence = defence;
    }

    @Basic
    @Column(name = "range")
    public Byte getRange() {
        return range;
    }

    public void setRange(Byte range) {
        this.range = range;
    }

    @Basic
    @Column(name = "slots")
    public Byte getSlots() {
        return slots;
    }

    public void setSlots(Byte slots) {
        this.slots = slots;
    }

    @Basic
    @Column(name = "equip_jobs")
    public Long getEquipJobs() {
        return equipJobs;
    }

    public void setEquipJobs(Long equipJobs) {
        this.equipJobs = equipJobs;
    }

    @Basic
    @Column(name = "equip_upper")
    public Byte getEquipUpper() {
        return equipUpper;
    }

    public void setEquipUpper(Byte equipUpper) {
        this.equipUpper = equipUpper;
    }

    @Basic
    @Column(name = "equip_genders")
    public Byte getEquipGenders() {
        return equipGenders;
    }

    public void setEquipGenders(Byte equipGenders) {
        this.equipGenders = equipGenders;
    }

    @Basic
    @Column(name = "equip_locations")
    public String getEquipLocations() {
        return equipLocations;
    }

    public void setEquipLocations(String equipLocations) {
        this.equipLocations = equipLocations;
    }

    @Basic
    @Column(name = "weapon_level")
    public Byte getWeaponLevel() {
        return weaponLevel;
    }

    public void setWeaponLevel(Byte weaponLevel) {
        this.weaponLevel = weaponLevel;
    }

    @Basic
    @Column(name = "equip_level")
    public String getEquipLevel() {
        return equipLevel;
    }

    public void setEquipLevel(String equipLevel) {
        this.equipLevel = equipLevel;
    }

    @Basic
    @Column(name = "refineable")
    public Byte getRefineable() {
        return refineable;
    }

    public void setRefineable(Byte refineable) {
        this.refineable = refineable;
    }

    @Basic
    @Column(name = "view")
    public Short getView() {
        return view;
    }

    public void setView(Short view) {
        this.view = view;
    }

    @Basic
    @Column(name = "script")
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Basic
    @Column(name = "equip_script")
    public String getEquipScript() {
        return equipScript;
    }

    public void setEquipScript(String equipScript) {
        this.equipScript = equipScript;
    }

    @Basic
    @Column(name = "unequip_script")
    public String getUnequipScript() {
        return unequipScript;
    }

    public void setUnequipScript(String unequipScript) {
        this.unequipScript = unequipScript;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item that = (Item) o;

        if (id != that.id) return false;
        if (type != that.type) return false;
        if (weight != that.weight) return false;
        if (nameEnglish != null ? !nameEnglish.equals(that.nameEnglish) : that.nameEnglish != null) return false;
        if (nameJapanese != null ? !nameJapanese.equals(that.nameJapanese) : that.nameJapanese != null) return false;
        if (priceBuy != null ? !priceBuy.equals(that.priceBuy) : that.priceBuy != null) return false;
        if (priceSell != null ? !priceSell.equals(that.priceSell) : that.priceSell != null) return false;
        if (atkMatk != null ? !atkMatk.equals(that.atkMatk) : that.atkMatk != null) return false;
        if (defence != null ? !defence.equals(that.defence) : that.defence != null) return false;
        if (range != null ? !range.equals(that.range) : that.range != null) return false;
        if (slots != null ? !slots.equals(that.slots) : that.slots != null) return false;
        if (equipJobs != null ? !equipJobs.equals(that.equipJobs) : that.equipJobs != null) return false;
        if (equipUpper != null ? !equipUpper.equals(that.equipUpper) : that.equipUpper != null) return false;
        if (equipGenders != null ? !equipGenders.equals(that.equipGenders) : that.equipGenders != null) return false;
        if (equipLocations != null ? !equipLocations.equals(that.equipLocations) : that.equipLocations != null)
            return false;
        if (weaponLevel != null ? !weaponLevel.equals(that.weaponLevel) : that.weaponLevel != null) return false;
        if (equipLevel != null ? !equipLevel.equals(that.equipLevel) : that.equipLevel != null) return false;
        if (refineable != null ? !refineable.equals(that.refineable) : that.refineable != null) return false;
        if (view != null ? !view.equals(that.view) : that.view != null) return false;
        if (script != null ? !script.equals(that.script) : that.script != null) return false;
        if (equipScript != null ? !equipScript.equals(that.equipScript) : that.equipScript != null) return false;
        if (unequipScript != null ? !unequipScript.equals(that.unequipScript) : that.unequipScript != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (nameEnglish != null ? nameEnglish.hashCode() : 0);
        result = 31 * result + (nameJapanese != null ? nameJapanese.hashCode() : 0);
        result = 31 * result + (int) type;
        result = 31 * result + (priceBuy != null ? priceBuy.hashCode() : 0);
        result = 31 * result + (priceSell != null ? priceSell.hashCode() : 0);
        result = 31 * result + (int) weight;
        result = 31 * result + (atkMatk != null ? atkMatk.hashCode() : 0);
        result = 31 * result + (defence != null ? defence.hashCode() : 0);
        result = 31 * result + (range != null ? range.hashCode() : 0);
        result = 31 * result + (slots != null ? slots.hashCode() : 0);
        result = 31 * result + (equipJobs != null ? equipJobs.hashCode() : 0);
        result = 31 * result + (equipUpper != null ? equipUpper.hashCode() : 0);
        result = 31 * result + (equipGenders != null ? equipGenders.hashCode() : 0);
        result = 31 * result + (equipLocations != null ? equipLocations.hashCode() : 0);
        result = 31 * result + (weaponLevel != null ? weaponLevel.hashCode() : 0);
        result = 31 * result + (equipLevel != null ? equipLevel.hashCode() : 0);
        result = 31 * result + (refineable != null ? refineable.hashCode() : 0);
        result = 31 * result + (view != null ? view.hashCode() : 0);
        result = 31 * result + (script != null ? script.hashCode() : 0);
        result = 31 * result + (equipScript != null ? equipScript.hashCode() : 0);
        result = 31 * result + (unequipScript != null ? unequipScript.hashCode() : 0);
        return result;
    }
}
