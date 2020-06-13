package com.swgoh.guildteamtracker.internal.entities.service.player;

import java.io.Serializable;

public class GrandArena implements Serializable {

    private static final long serialVersionUID = 1L;

    private String seasonId;
    private String eventInstanceId;
    private String league;

    private Integer wins;
    private Integer losses;

    private Integer seasonPoints;
    private Integer division;
    private Integer rank;

    private Boolean eliteDivision;
    private Boolean remove;

    private Long joinTime;
    private Long endTime;

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getEventInstanceId() {
        return eventInstanceId;
    }

    public void setEventInstanceId(String eventInstanceId) {
        this.eventInstanceId = eventInstanceId;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getSeasonPoints() {
        return seasonPoints;
    }

    public void setSeasonPoints(Integer seasonPoints) {
        this.seasonPoints = seasonPoints;
    }

    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean getEliteDivision() {
        return eliteDivision;
    }

    public void setEliteDivision(Boolean eliteDivision) {
        this.eliteDivision = eliteDivision;
    }

    public Boolean getRemove() {
        return remove;
    }

    public void setRemove(Boolean remove) {
        this.remove = remove;
    }

    public Long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Long joinTime) {
        this.joinTime = joinTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

}
