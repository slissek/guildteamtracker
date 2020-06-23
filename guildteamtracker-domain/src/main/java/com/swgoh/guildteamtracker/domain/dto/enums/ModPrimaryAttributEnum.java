package com.swgoh.guildteamtracker.domain.dto.enums;

public enum ModPrimaryAttributEnum {

    //@formatter:off
    DEFENSE_PERCENTAGE (49),
    OFFENSE_PERCENTAGE (48),
    POTENCY_PERCENTAGE (17),
    HEALTH_PERCENTAGE (55),
    SPEED_PERCENTAGE (5),
    CRITICALAVOIDANCE_PERCENTAGE (54),
    CRITICALDAMAGE_PERCENTAGE (16),
    CRITICALCHANCE_PERCENTAGE (53),
    ACCURACY_PERCENTAGE (0),
    PROTECTION_PERCENTAGE (56),
    TENACITY_PERCENTAGE (18);
    //@formatter:on

    private Integer modSetId;

    private ModPrimaryAttributEnum(Integer modSetId) {
        this.modSetId = modSetId;
    }

    public static ModPrimaryAttributEnum getEnumById(Integer id) {
        for (final ModPrimaryAttributEnum value : ModPrimaryAttributEnum.values()) {
            if (id.equals(value.modSetId)) {
                return value;
            }
        }
        return null;
    }
}
