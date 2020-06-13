package com.swgoh.guildteamtracker.internal.entities.dao.guildevents;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TerritoryWarsStatisticDAO {

    @Id
    private String id;

    private LocalDate date;

    private String winLossIndicator;

    private List<TerritoryWarsPlayerStatisticDAO> playerStatistics;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getWinLossIndicator() {
        return winLossIndicator;
    }

    public void setWinLossIndicator(String winLossIndicator) {
        this.winLossIndicator = winLossIndicator;
    }

    public List<TerritoryWarsPlayerStatisticDAO> getPlayerStatistics() {
        return playerStatistics;
    }

    public void setPlayerStatistics(List<TerritoryWarsPlayerStatisticDAO> playerStatistics) {
        this.playerStatistics = playerStatistics;
    }

}
