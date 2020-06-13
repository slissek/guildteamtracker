package com.swgoh.guildteamtracker.domain.dto.player;

import java.util.List;

import com.swgoh.guildteamtracker.domain.dto.gameassets.ModDTO;
import com.swgoh.guildteamtracker.domain.dto.gameassets.SkillDTO;

public class PlayerRosterDTO {

    private String id;
    private String defId;
    private String nameKey;

    private Integer rarity;
    private Integer level;
    private Integer xp;
    private Integer gear;
    private Integer relictLevel;
    private Integer gp;

    private Boolean mandatory;

    private List<SkillDTO> skills;
    private List<ModDTO> mods;

    @Override
    public String toString() {
        return String.format("PlayerRosterDTO [id=%s, defId=%s, nameKey=%s, rarity=%s, level=%s, xp=%s, gear=%s, relictLevel=%s, gp=%s, mandatory=%s, skills=%s, mods=%s]", id,
                defId, nameKey, rarity, level, xp, gear, relictLevel, gp, mandatory, skills, mods);
    }

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

    public Integer getRelictLevel() {
        return relictLevel;
    }

    public void setRelictLevel(Integer relictLevel) {
        this.relictLevel = relictLevel;
    }

    public Integer getGp() {
        return gp;
    }

    public void setGp(Integer gp) {
        this.gp = gp;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public List<SkillDTO> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillDTO> skills) {
        this.skills = skills;
    }

    public List<ModDTO> getMods() {
        return mods;
    }

    public void setMods(List<ModDTO> mods) {
        this.mods = mods;
    }

}
