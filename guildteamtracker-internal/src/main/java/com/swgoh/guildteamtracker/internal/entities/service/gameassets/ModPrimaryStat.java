package com.swgoh.guildteamtracker.internal.entities.service.gameassets;

import java.io.Serializable;
import java.math.BigDecimal;

public class ModPrimaryStat implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer unitStat;
    private BigDecimal value;

    public Integer getUnitStat() {
        return unitStat;
    }

    public void setUnitStat(Integer unitStat) {
        this.unitStat = unitStat;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
