package com.swgoh.guildteamtracker.internal.entities.dao.guildevents;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TerritoryBattlePlayerStatisticDAO {

    @Id
    private Integer allyCode;

    private Integer galacticPower;
    private Integer characterPower;
    private Integer shipPower;

    @OneToOne
    @JoinColumn(name = "")
    private TerritoryBattlePlayerPhaseDeploymentDAO phaseDeployment;

    @OneToOne
    @JoinColumn(name = "")
    private TerritoryBattlePlayerPhaseBattleWavesDAO battleWa;

    @OneToOne
    @JoinColumn(name = "")
    private TerritoryBattlePlayerPhaseCombatMissionsDAO combatMissions;

    public Integer getAllyCode() {
        return allyCode;
    }

    public void setAllyCode(Integer allyCode) {
        this.allyCode = allyCode;
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

    public TerritoryBattlePlayerPhaseDeploymentDAO getPhaseDeployment() {
        return phaseDeployment;
    }

    public void setPhaseDeployment(TerritoryBattlePlayerPhaseDeploymentDAO phaseDeployment) {
        this.phaseDeployment = phaseDeployment;
    }

    public TerritoryBattlePlayerPhaseBattleWavesDAO getBattleWa() {
        return battleWa;
    }

    public void setBattleWa(TerritoryBattlePlayerPhaseBattleWavesDAO battleWa) {
        this.battleWa = battleWa;
    }

    public TerritoryBattlePlayerPhaseCombatMissionsDAO getCombatMissions() {
        return combatMissions;
    }

    public void setCombatMissions(TerritoryBattlePlayerPhaseCombatMissionsDAO combatMissions) {
        this.combatMissions = combatMissions;
    }

}
