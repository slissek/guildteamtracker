package com.swgoh.guildteamtracker.internal.entities.dao.player;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayerStatisticDAO {

    @Id
    private Integer allyCode;

    private Integer galacticPower;
    private Integer characterPower;
    private Integer shipPower;

    private PlayerRosterStatisticDAO rosterStatistic;

    private ModStatisticDAO modStatistic;

    public PlayerStatisticDAO() {
        super();
    }

    public PlayerStatisticDAO(Integer allyCode, Integer galacticPower, Integer characterPower, Integer shipPower, PlayerRosterStatisticDAO rosterStatistic,
            ModStatisticDAO modStatistic) {
        super();
        this.allyCode = allyCode;
        this.galacticPower = galacticPower;
        this.characterPower = characterPower;
        this.shipPower = shipPower;
        this.rosterStatistic = rosterStatistic;
        this.modStatistic = modStatistic;
    }

    @Override
    public String toString() {
        return String.format("PlayerStatisticDAO [allyCode=%s, galacticPower=%s, characterPower=%s, shipPower=%s, rosterStatistic=%s, modStatistic=%s, timestamp=%s]", allyCode,
                galacticPower, characterPower, shipPower, rosterStatistic, modStatistic);
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

    public PlayerRosterStatisticDAO getRosterStatistic() {
        return rosterStatistic;
    }

    public void setRosterStatistic(PlayerRosterStatisticDAO rosterStatistic) {
        this.rosterStatistic = rosterStatistic;
    }

    public ModStatisticDAO getModStatistic() {
        return modStatistic;
    }

    public void setModStatistic(ModStatisticDAO modStatistic) {
        this.modStatistic = modStatistic;
    }

    public Integer getAllyCode() {
        return allyCode;
    }

    public void setAllyCode(Integer allyCode) {
        this.allyCode = allyCode;
    }

}
