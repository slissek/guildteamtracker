package com.swgoh.guildteamtracker.internal.entities.service.gameassets;

import java.io.Serializable;

public class Skill implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String nameKey;

    private Integer tier;
    private Integer tiers;

    private Boolean isZeta;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public Integer getTiers() {
        return tiers;
    }

    public void setTiers(Integer tiers) {
        this.tiers = tiers;
    }

    public Boolean getIsZeta() {
        return isZeta;
    }

    public void setIsZeta(Boolean isZeta) {
        this.isZeta = isZeta;
    }

}
