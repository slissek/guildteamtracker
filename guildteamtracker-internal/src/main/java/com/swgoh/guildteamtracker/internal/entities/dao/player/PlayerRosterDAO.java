package com.swgoh.guildteamtracker.internal.entities.dao.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayerRosterDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String defId;
    private String nameKey;

    private Integer rarity;
    private Integer level;
    private Integer xp;
    private Integer gear;
    private Integer combatType;
    private Integer gp;

//    private Relic relic;
//
//    private List<Skill> skills;
//    private List<Mod> mods;

    public PlayerRosterDAO() {
        super();
    }

    public PlayerRosterDAO(Long id, String defId, String nameKey, Integer rarity, Integer level, Integer xp, Integer gear, Integer combatType, Integer gp) {
        super();
        this.id = id;
        this.defId = defId;
        this.nameKey = nameKey;
        this.rarity = rarity;
        this.level = level;
        this.xp = xp;
        this.gear = gear;
        this.combatType = combatType;
        this.gp = gp;
    }

    @Override
    public String toString() {
        return String.format("PlayerRosterDAO [id=%s, defId=%s, nameKey=%s, rarity=%s, level=%s, xp=%s, gear=%s, combatType=%s, gp=%s]", id, defId, nameKey, rarity, level, xp,
                gear, combatType, gp);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDefId() {
        return defId;
    }

    public void setDefId(String defId) {
        this.defId = defId;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getGear() {
        return gear;
    }

    public void setGear(Integer gear) {
        this.gear = gear;
    }

    public Integer getCombatType() {
        return combatType;
    }

    public void setCombatType(Integer combatType) {
        this.combatType = combatType;
    }

    public Integer getGp() {
        return gp;
    }

    public void setGp(Integer gp) {
        this.gp = gp;
    }

//    public Relic getRelic() {
//        return relic;
//    }
//
//    public void setRelic(Relic relic) {
//        this.relic = relic;
//    }
//
//    public List<Skill> getSkills() {
//        return skills;
//    }
//
//    public void setSkills(List<Skill> skills) {
//        this.skills = skills;
//    }
//
//    public List<Mod> getMods() {
//        return mods;
//    }
//
//    public void setMods(List<Mod> mods) {
//        this.mods = mods;
//    }

}
