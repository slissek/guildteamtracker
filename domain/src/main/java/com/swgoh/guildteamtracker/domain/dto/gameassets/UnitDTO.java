package com.swgoh.guildteamtracker.domain.dto.gameassets;

import com.swgoh.guildteamtracker.domain.dto.enums.UnitCombatTypeEnum;

public class UnitDTO {

    private String baseId;
    private String name;
    private UnitCombatTypeEnum combatType;

    @Override
    public String toString() {
        return String.format("UnitDTO [baseId=%s, name=%s, combatType=%s]", baseId, name, combatType);
    }

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

    public UnitCombatTypeEnum getCombatType() {
        return combatType;
    }

    public void setCombatType(UnitCombatTypeEnum combatType) {
        this.combatType = combatType;
    }

}
