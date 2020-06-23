package com.swgoh.guildteamtracker.domain.dto.gameassets;

import com.swgoh.guildteamtracker.domain.dto.enums.ModSecondaryAttributEnum;

public class ModSecondaryStatDTO extends ModStatDTO {

    private Integer roll;
    private ModSecondaryAttributEnum modAttribute;

    @Override
    public String toString() {
        return String.format("ModSecondaryStatDTO [roll=%s, modAttribute=%s]", roll, modAttribute);
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public ModSecondaryAttributEnum getModAttribute() {
        return modAttribute;
    }

    public void setModAttribute(ModSecondaryAttributEnum modAttribute) {
        this.modAttribute = modAttribute;
    }

}
