package com.swgoh.guildteamtracker.domain.dto.gameassets;

import com.swgoh.guildteamtracker.domain.dto.enums.ModPrimaryAttributEnum;

public class ModPrimaryStatDTO extends ModStatDTO {

    private ModPrimaryAttributEnum modAttribute;

    @Override
    public String toString() {
        return String.format("ModPrimaryStatDTO [modAttribute=%s]", modAttribute);
    }

    public ModPrimaryAttributEnum getModAttribute() {
        return modAttribute;
    }

    public void setModAttribute(ModPrimaryAttributEnum modAttribute) {
        this.modAttribute = modAttribute;
    }

}
