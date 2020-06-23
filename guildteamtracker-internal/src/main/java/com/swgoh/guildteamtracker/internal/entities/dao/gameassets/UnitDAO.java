package com.swgoh.guildteamtracker.internal.entities.dao.gameassets;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "units")
public class UnitDAO {

    @Id
    private String baseId;
    private String name;
    private Integer combatType;

    public String getBaseId() {
        return baseId;
    }

    public void setBaseId(String baseId) {
        this.baseId = baseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCombatType() {
        return combatType;
    }

    public void setCombatType(Integer combatType) {
        this.combatType = combatType;
    }

}
