package com.swgoh.guildteamtracker.domain.dto.enums;

public enum ModSecondaryAttributEnum {

    //@formatter:off
    DEFENSE (42),
    DEFENSE_PERCENTAGE (49),
    OFFENSE (48),
    OFFENSE_PERCENTAGE (48),
    POTENCY_PERCENTAGE (17),
    HEALTH (1),
    HEALTH_PERCENTAGE (55),
    SPEED_PERCENTAGE (5),
    CRITICALCHANCE_PERCENTAGE (53),
    PROTECTION (28),
    PROTECTION_PERCENTAGE (56),
    TENACITY_PERCENTAGE (18);
    //@formatter:on

    private Integer modSetId;

    private ModSecondaryAttributEnum(Integer modSetId) {
        this.modSetId = modSetId;
    }

    public static ModSecondaryAttributEnum getEnumById(Integer id) {
        for (final ModSecondaryAttributEnum value : ModSecondaryAttributEnum.values()) {
            if (id.equals(value.modSetId)) {
                return value;
            }
        }
        return null;
    }
}
