package com.swgoh.guildteamtracker.domain.dto.analysis;

import java.util.ArrayList;
import java.util.List;

public class GuildTeamFilterResponseDTO {

    private List<GuildMemberTeamDTO> guildMemberTeams;

    public List<GuildMemberTeamDTO> getGuildMemberTeams() {
        return guildMemberTeams;
    }

    public void setGuildMemberTeam(List<GuildMemberTeamDTO> guildMemberTeams) {
        this.guildMemberTeams = guildMemberTeams;
    }

    public void addGuildMemberTeam(GuildMemberTeamDTO guildMemberTeam) {
        if (guildMemberTeams == null) {
            guildMemberTeams = new ArrayList<>();
        }
        guildMemberTeams.add(guildMemberTeam);
    }

    @Override
    public String toString() {
        return String.format("GuildTeamFilterResponseDTO [guildMemberTeams=%s]", guildMemberTeams);
    }

}
