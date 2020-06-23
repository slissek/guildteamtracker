package com.swgoh.guildteamtracker.domain.dto.enums;

public enum UnitCombatTypeEnum {

    // @formatter:off
    CHARACTER(1), 
    SHIP(2);
    // @formatter:on

    private final Integer modSetId;

    private UnitCombatTypeEnum(Integer modSetId) {
        this.modSetId = modSetId;
    }

    public static UnitCombatTypeEnum getEnumById(Integer id) {
        for (final UnitCombatTypeEnum value : UnitCombatTypeEnum.values()) {
            if (id.equals(value.modSetId)) {
                return value;
            }
        }
        return null;
    }

    public Integer getId() {
        return modSetId;
    }
}
