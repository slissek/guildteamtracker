package com.swgoh.guildteamtracker.internal.entities.dao.guildevents;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TerritoryBattlePlayerPhaseDeploymentDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer phaseOne;
    private Integer phaseTwo;
    private Integer phaseThree;
    private Integer phaseFour;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPhaseOne() {
        return phaseOne;
    }

    public void setPhaseOne(Integer phaseOne) {
        this.phaseOne = phaseOne;
    }

    public Integer getPhaseTwo() {
        return phaseTwo;
    }

    public void setPhaseTwo(Integer phaseTwo) {
        this.phaseTwo = phaseTwo;
    }

    public Integer getPhaseThree() {
        return phaseThree;
    }

    public void setPhaseThree(Integer phaseThree) {
        this.phaseThree = phaseThree;
    }

    public Integer getPhaseFour() {
        return phaseFour;
    }

    public void setPhaseFour(Integer phaseFour) {
        this.phaseFour = phaseFour;
    }

}
