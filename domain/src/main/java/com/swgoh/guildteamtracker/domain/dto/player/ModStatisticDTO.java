package com.swgoh.guildteamtracker.domain.dto.player;

public class ModStatisticDTO {

    private Integer sixDotMods = 0;
    private Integer speedPlusTen = 0;
    private Integer speedPlusFifteen = 0;
    private Integer speedPlusTwenty = 0;
    private Integer speedPlusTwentyfive = 0;

    @Override
    public String toString() {
        return String.format("ModStatisticDTO [sixDotMods=%s, speedPlusTen=%s, speedPlusFifteen=%s, speedPlusTwenty=%s, speedPlusTwentyfive=%s]", sixDotMods, speedPlusTen,
                speedPlusFifteen, speedPlusTwenty, speedPlusTwentyfive);
    }

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
