package com.swgoh.guildteamtracker.internal.entities.service.player;

import java.io.Serializable;
import java.util.List;

public class PlayerStatistic implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer galacticPower;
    private Integer characterPower;
    private Integer shipPower;

    private PlayerRosterStatistic rosterStatistic;
    private ModStatistic modStatistic;

    private List<PlayerRoster> legendaryCharList;
    private List<PlayerRoster> raidCharList;

    public Integer getGalacticPower() {
        return galacticPower;
    }

    public void setGalacticPower(Integer galacticPower) {
        this.galacticPower = galacticPower;
    }

    public Integer getCharacterPower() {
        return characterPower;
    }

    public void setCharacterPower(Integer characterPower) {
        this.characterPower = characterPower;
    }

    public Integer getShipPower() {
        return shipPower;
    }

    public void setShipPower(Integer shipPower) {
        this.shipPower = shipPower;
    }

    public PlayerRosterStatistic getRosterStatistic() {
        return rosterStatistic;
    }

    public void setRosterStatistic(PlayerRosterStatistic rosterStatistic) {
        this.rosterStatistic = rosterStatistic;
    }

    public ModStatistic getModStatistic() {
        return modStatistic;
    }

    public void setModStatistic(ModStatistic modStatistic) {
        this.modStatistic = modStatistic;
    }

    public List<PlayerRoster> getLegendaryCharList() {
        return legendaryCharList;
    }

    public void setLegendaryCharList(List<PlayerRoster> legendaryCharList) {
        this.legendaryCharList = legendaryCharList;
    }

    public List<PlayerRoster> getRaidCharList() {
        return raidCharList;
    }

    public void setRaidCharList(List<PlayerRoster> raidCharList) {
        this.raidCharList = raidCharList;
    }

}
