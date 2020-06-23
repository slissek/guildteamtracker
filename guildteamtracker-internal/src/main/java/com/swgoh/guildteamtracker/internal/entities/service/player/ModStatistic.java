package com.swgoh.guildteamtracker.internal.entities.service.player;

import java.io.Serializable;

public class ModStatistic implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer sixDotMods = 0;
    private Integer speedPlusTen = 0;
    private Integer speedPlusFifteen = 0;
    private Integer speedPlusTwenty = 0;
    private Integer speedPlusTwentyfive = 0;

    public Integer getSixDotMods() {
        return sixDotMods;
    }

    public void setSixDotMods(Integer sixDotMods) {
        this.sixDotMods = sixDotMods;
    }

    public Integer getSpeedPlusTen() {
        return speedPlusTen;
    }

    public void setSpeedPlusTen(Integer speedPlusTen) {
        this.speedPlusTen = speedPlusTen;
    }

    public Integer getSpeedPlusFifteen() {
        return speedPlusFifteen;
    }

    public void setSpeedPlusFifteen(Integer speedPlusFifteen) {
        this.speedPlusFifteen = speedPlusFifteen;
    }

    public Integer getSpeedPlusTwenty() {
        return speedPlusTwenty;
    }

    public void setSpeedPlusTwenty(Integer speedPlusTwenty) {
        this.speedPlusTwenty = speedPlusTwenty;
    }

    public Integer getSpeedPlusTwentyfive() {
        return speedPlusTwentyfive;
    }

    public void setSpeedPlusTwentyfive(Integer speedPlusTwentyfive) {
        this.speedPlusTwentyfive = speedPlusTwentyfive;
    }

}
