package com.swgoh.guildteamtracker.domain.dto.player;

import java.util.ArrayList;
import java.util.List;

public class PlayerStatisticDTO {

    private Integer galacticPower = 0;
    private Integer characterPower = 0;
    private Integer shipPower = 0;

    private PlayerRosterStatisticDTO rosterStatistic;
    private ModStatisticDTO modStatistic;

    private List<PlayerRosterDTO> legendaryCharList;
    private List<PlayerRosterDTO> raidCharList;

    @Override
    public String toString() {
        return String.format("PlayerStatisticDTO [galacticPower=%s, characterPower=%s, shipPower=%s, rosterStatistic=%s, modStatistic=%s, legendaryCharList=%s, raidCharList=%s]",
                galacticPower, characterPower, shipPower, rosterStatistic, modStatistic, legendaryCharList, raidCharList);
    }

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

    public PlayerRosterStatisticDTO getRosterStatistic() {
        return rosterStatistic;
    }

    public void setRosterStatistic(PlayerRosterStatisticDTO rosterStatistic) {
        this.rosterStatistic = rosterStatistic;
    }

    public ModStatisticDTO getModStatistic() {
        return modStatistic;
    }

    public void setModStatistic(ModStatisticDTO modStatistic) {
        this.modStatistic = modStatistic;
    }

    public List<PlayerRosterDTO> getLegendaryCharList() {
        return legendaryCharList;
    }

    public void setLegendaryCharList(List<PlayerRosterDTO> legendaryCharList) {
        this.legendaryCharList = legendaryCharList;
    }

    public void addLegendaryChar(PlayerRosterDTO legendary) {
        if (this.legendaryCharList == null) {
            legendaryCharList = new ArrayList<>();
        }
        legendaryCharList.add(legendary);
    }

    public List<PlayerRosterDTO> getRaidCharList() {
        return raidCharList;
    }

    public void setRaidCharList(List<PlayerRosterDTO> raidCharList) {
        this.raidCharList = raidCharList;
    }

    public void addRaidChar(PlayerRosterDTO legendary) {
        if (this.raidCharList == null) {
            raidCharList = new ArrayList<>();
        }
        raidCharList.add(legendary);
    }
}
