package com.swgoh.guildteamtracker.internal.entities.dao.player;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ModStatisticDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer sixDotMods = 0;
    private Integer speedPlusTen = 0;
    private Integer speedPlusFifteen = 0;
    private Integer speedPlusTwenty = 0;
    private Integer speedPlusTwentyfive = 0;

    public ModStatisticDAO() {
        super();
    }

    public ModStatisticDAO(Long id, Integer sixDotMods, Integer speedPlusTen, Integer speedPlusFifteen, Integer speedPlusTwenty, Integer speedPlusTwentyfive) {
        super();
        this.id = id;
        this.sixDotMods = sixDotMods;
        this.speedPlusTen = speedPlusTen;
        this.speedPlusFifteen = speedPlusFifteen;
        this.speedPlusTwenty = speedPlusTwenty;
        this.speedPlusTwentyfive = speedPlusTwentyfive;
    }

    @Override
    public String toString() {
        return String.format("ModStatisticDAO [id=%s, sixDotMods=%s, speedPlusTen=%s, speedPlusFifteen=%s, speedPlusTwenty=%s, speedPlusTwentyfive=%s]", id, sixDotMods,
                speedPlusTen, speedPlusFifteen, speedPlusTwenty, speedPlusTwentyfive);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
