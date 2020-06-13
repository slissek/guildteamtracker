package com.swgoh.guildteamtracker.internal.entities.service.gameassets;

import java.io.Serializable;
import java.util.List;

public class Mod implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer level;
    private Integer tier;
    private Integer slot;
    private Integer set;
    private Integer pips;

    private ModPrimaryStat primaryStat;
    private List<ModSecondaryStat> secondaryStat;

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

    public ModPrimaryStat getPrimaryStat() {
        return primaryStat;
    }

    public void setPrimaryStat(ModPrimaryStat primaryStat) {
        this.primaryStat = primaryStat;
    }

    public List<ModSecondaryStat> getSecondaryStat() {
        return secondaryStat;
    }

    public void setSecondaryStat(List<ModSecondaryStat> secondaryStat) {
        this.secondaryStat = secondaryStat;
    }

}
