package com.swgoh.guildteamtracker.domain.dto.enums;

public enum ModSetEnum {

    //@formatter:off
    HEALTH (1),
    OFFENSE (2),
    DEFENSE (3),
    SPEED (4),
    CRITICALCHANCE (5),
    CRITICALDAMAGE (6),
    ACCURACY (7),
    TENACITY (8);
    //@formatter:on

    private Integer modSetId;

    private ModSetEnum(Integer modSetId) {
        this.modSetId = modSetId;
    }

    public static ModSetEnum getEnumById(Integer id) {
        for (final ModSetEnum value : ModSetEnum.values()) {
            if (id.equals(value.modSetId)) {
                return value;
            }
        }
        return null;
    }
}
