package com.swgoh.guildteamtracker.domain.dto.gameassets;

import java.util.List;

import com.swgoh.guildteamtracker.domain.dto.enums.ModSetEnum;

public class ModDTO {

    private String id;

    private Integer level;
    private Integer tier;
    private Integer slot;
    private Integer set;
    private Integer pips;

    private ModSetEnum modSet;

    private ModPrimaryStatDTO primaryStat;
    private List<ModSecondaryStatDTO> secondaryStat;

    @Override
    public String toString() {
        return String.format("ModDTO [id=%s, level=%s, tier=%s, slot=%s, set=%s, pips=%s, modSet=%s, primaryStat=%s, secondaryStat=%s]", id, level, tier, slot, set, pips, modSet,
                primaryStat, secondaryStat);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getSet() {
        return set;
    }

    public void setSet(Integer set) {
        this.set = set;
    }

    public Integer getPips() {
        return pips;
    }

    public void setPips(Integer pips) {
        this.pips = pips;
    }

    public ModSetEnum getModSet() {
        return modSet;
    }

    public void setModSet(ModSetEnum modSet) {
        this.modSet = modSet;
    }

    public ModPrimaryStatDTO getPrimaryStat() {
        return primaryStat;
    }

    public void setPrimaryStat(ModPrimaryStatDTO primaryStat) {
        this.primaryStat = primaryStat;
    }

    public List<ModSecondaryStatDTO> getSecondaryStat() {
        return secondaryStat;
    }

    public void setSecondaryStat(List<ModSecondaryStatDTO> secondaryStat) {
        this.secondaryStat = secondaryStat;
    }

}
