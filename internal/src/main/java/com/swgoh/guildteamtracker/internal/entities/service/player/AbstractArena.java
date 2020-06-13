package com.swgoh.guildteamtracker.internal.entities.service.player;

import java.io.Serializable;
import java.util.List;

public class AbstractArena implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer rank;

    private List<ArenaSquadMember> squad;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public List<ArenaSquadMember> getSquad() {
        return squad;
    }

    public void setSquad(List<ArenaSquadMember> squad) {
        this.squad = squad;
    }
}
