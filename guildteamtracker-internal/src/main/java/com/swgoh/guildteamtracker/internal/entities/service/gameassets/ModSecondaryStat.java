package com.swgoh.guildteamtracker.internal.entities.service.gameassets;

import java.io.Serializable;

public class ModSecondaryStat extends ModPrimaryStat implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer roll;

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

}
