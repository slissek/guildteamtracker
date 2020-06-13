package com.swgoh.guildteamtracker.domain.dto.gameassets;

import java.math.BigDecimal;

public abstract class ModStatDTO {

    private Integer unitStat;
    private BigDecimal value;

    @Override
    public String toString() {
        return String.format("ModStatDTO [unitStat=%s, value=%s]", unitStat, value);
    }

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
