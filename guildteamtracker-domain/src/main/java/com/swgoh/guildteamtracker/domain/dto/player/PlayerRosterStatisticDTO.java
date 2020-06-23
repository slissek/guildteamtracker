package com.swgoh.guildteamtracker.domain.dto.player;

public class PlayerRosterStatisticDTO {

    private Integer gearEleven = 0;
    private Integer gearTwelve = 0;

    private Integer relicTierOne = 0;
    private Integer relicTierTwo = 0;
    private Integer relicTierThree = 0;
    private Integer relicTierFour = 0;
    private Integer relicTierFive = 0;
    private Integer relicTierSix = 0;
    private Integer relicTierSeven = 0;

    private Integer zeta = 0;

    @Override
    public String toString() {
        return String.format(
                "PlayerRosterStatisticDTO [gearEleven=%s, gearTwelve=%s, relicTierOne=%s, relicTierTwo=%s, relicTierThree=%s, relicTierFour=%s, relicTierFive=%s, relicTierSix=%s, relicTierSeven=%s, zeta=%s]",
                gearEleven, gearTwelve, relicTierOne, relicTierTwo, relicTierThree, relicTierFour, relicTierFive, relicTierSix, relicTierSeven, zeta);
    }

    public Integer getGearEleven() {
        return gearEleven;
    }

    public void setGearEleven(Integer gearEleven) {
        this.gearEleven = gearEleven;
    }

    public Integer getGearTwelve() {
        return gearTwelve;
    }

    public void setGearTwelve(Integer gearTwelve) {
        this.gearTwelve = gearTwelve;
    }

    public Integer getRelicTierOne() {
        return relicTierOne;
    }

    public void setRelicTierOne(Integer relicTierOne) {
        this.relicTierOne = relicTierOne;
    }

    public Integer getRelicTierTwo() {
        return relicTierTwo;
    }

    public void setRelicTierTwo(Integer relicTierTwo) {
        this.relicTierTwo = relicTierTwo;
    }

    public Integer getRelicTierThree() {
        return relicTierThree;
    }

    public void setRelicTierThree(Integer relicTierThree) {
        this.relicTierThree = relicTierThree;
    }

    public Integer getRelicTierFour() {
        return relicTierFour;
    }

    public void setRelicTierFour(Integer relicTierFour) {
        this.relicTierFour = relicTierFour;
    }

    public Integer getRelicTierFive() {
        return relicTierFive;
    }

    public void setRelicTierFive(Integer relicTierFive) {
        this.relicTierFive = relicTierFive;
    }

    public Integer getRelicTierSix() {
        return relicTierSix;
    }

    public void setRelicTierSix(Integer relicTierSix) {
        this.relicTierSix = relicTierSix;
    }

    public Integer getRelicTierSeven() {
        return relicTierSeven;
    }

    public void setRelicTierSeven(Integer relicTierSeven) {
        this.relicTierSeven = relicTierSeven;
    }

    public Integer getZeta() {
        return zeta;
    }

    public void setZeta(Integer zeta) {
        this.zeta = zeta;
    }

}
