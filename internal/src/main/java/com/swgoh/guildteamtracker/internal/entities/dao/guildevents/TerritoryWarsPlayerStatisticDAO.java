package com.swgoh.guildteamtracker.internal.entities.dao.guildevents;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TerritoryWarsPlayerStatisticDAO {

    @Id
    private Integer allyCode;

    private Integer galacticPower;

    private Integer offensivePoints;

    private Integer defensivePoints;

    private Integer totalPoints;

    private String notes;

    private Boolean registered;

    private Boolean noAction;

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

    public Integer getOffensivePoints() {
        return offensivePoints;
    }

    public void setOffensivePoints(Integer offensivePoints) {
        this.offensivePoints = offensivePoints;
    }

    public Integer getDefensivePoints() {
        return defensivePoints;
    }

    public void setDefensivePoints(Integer defensivePoints) {
        this.defensivePoints = defensivePoints;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    public Boolean getNoAction() {
        return noAction;
    }

    public void setNoAction(Boolean noAction) {
        this.noAction = noAction;
    }

}
