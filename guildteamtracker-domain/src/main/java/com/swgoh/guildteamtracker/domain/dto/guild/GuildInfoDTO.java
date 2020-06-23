package com.swgoh.guildteamtracker.domain.dto.guild;

import java.util.List;

public class GuildInfoDTO extends GuildDTO {

    private RaidDTO raid;

    private List<RosterDTO> roster;

    @Override
    public String toString() {
        return String.format("GuildInfoDTO [raid=%s, roster=%s]", raid, roster);
    }

    public RaidDTO getRaid() {
        return raid;
    }

    public void setRaid(RaidDTO raid) {
        this.raid = raid;
    }

    public List<RosterDTO> getRoster() {
        return roster;
    }

    public void setRoster(List<RosterDTO> roster) {
        this.roster = roster;
    }

}
