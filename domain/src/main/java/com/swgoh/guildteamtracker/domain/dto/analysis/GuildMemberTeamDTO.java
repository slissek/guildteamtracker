package com.swgoh.guildteamtracker.domain.dto.analysis;

import java.util.List;

import com.swgoh.guildteamtracker.domain.dto.player.PlayerRosterDTO;

public class GuildMemberTeamDTO {

    private String playerName;
    private List<PlayerRosterDTO> rosterFilter;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public List<PlayerRosterDTO> getRosterFilter() {
        return rosterFilter;
    }

    public void setRosterFilter(List<PlayerRosterDTO> rosterFilter) {
        this.rosterFilter = rosterFilter;
    }

    @Override
    public String toString() {
        return String.format("GuildMemberTeamDTO [playerName=%s, rosterFilter=%s]", playerName, rosterFilter);
    }

}
