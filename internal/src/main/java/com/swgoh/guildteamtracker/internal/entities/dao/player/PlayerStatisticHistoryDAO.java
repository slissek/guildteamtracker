package com.swgoh.guildteamtracker.internal.entities.dao.player;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "playerstatistichistory")
public class PlayerStatisticHistoryDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate timestamp;

    private List<PlayerStatisticDAO> playerStatisitc;

    public PlayerStatisticHistoryDAO() {
        super();
    }

    public PlayerStatisticHistoryDAO(Long id, LocalDate timestamp, List<PlayerStatisticDAO> playerStatisitc) {
        super();
        this.id = id;
        this.timestamp = timestamp;
        this.playerStatisitc = playerStatisitc;
    }

    @Override
    public String toString() {
        return String.format("PlayerStatisticHistoryDAO [id=%s, timestamp=%s, playerStatisitc=%s]", id, timestamp, playerStatisitc);
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public List<PlayerStatisticDAO> getPlayerStatisitc() {
        return playerStatisitc;
    }

    public void setPlayerStatisitc(List<PlayerStatisticDAO> playerStatisitc) {
        this.playerStatisitc = playerStatisitc;
    }

}
