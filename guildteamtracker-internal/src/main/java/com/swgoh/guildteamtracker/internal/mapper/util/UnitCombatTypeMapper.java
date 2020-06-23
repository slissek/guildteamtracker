package com.swgoh.guildteamtracker.internal.mapper.util;

import com.swgoh.guildteamtracker.domain.dto.enums.UnitCombatTypeEnum;

public class UnitCombatTypeMapper {

    public Integer asInteger(UnitCombatTypeEnum type) {
        return type.getId();
    }

    public UnitCombatTypeEnum asUnitCombatType(Integer type) {
        return UnitCombatTypeEnum.getEnumById(type);
    }
}
