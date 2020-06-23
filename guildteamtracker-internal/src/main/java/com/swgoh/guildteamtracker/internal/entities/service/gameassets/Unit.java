package com.swgoh.guildteamtracker.internal.entities.service.gameassets;

import java.io.Serializable;

public class Unit implements Serializable {

    private static final long serialVersionUID = 1L;

    private String baseId;
    private String nameKey;
    private Integer combatType;

    public String getBaseId() {
        return baseId;
    }

    public void setBaseId(String baseId) {
        this.baseId = baseId;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public Integer getCombatType() {
        return combatType;
    }

    public void setCombatType(Integer combatType) {
        this.combatType = combatType;
    }

}
