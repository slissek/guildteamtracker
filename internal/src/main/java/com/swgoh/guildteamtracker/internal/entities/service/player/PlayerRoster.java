package com.swgoh.guildteamtracker.internal.entities.service.player;

import java.io.Serializable;
import java.util.List;

import com.swgoh.guildteamtracker.internal.entities.service.gameassets.Mod;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.Relic;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.Skill;

public class PlayerRoster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String defId;
    private String nameKey;

    private Integer rarity;
    private Integer level;
    private Integer xp;
    private Integer gear;
    private Integer combatType;
    private Integer gp;

    private Relic relic;

    private List<Skill> skills;
    private List<Mod> mods;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Relic getRelic() {
        return relic;
    }

    public void setRelic(Relic relic) {
        this.relic = relic;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Mod> getMods() {
        return mods;
    }

    public void setMods(List<Mod> mods) {
        this.mods = mods;
    }

}
