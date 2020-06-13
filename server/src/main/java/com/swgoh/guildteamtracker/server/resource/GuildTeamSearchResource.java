package com.swgoh.guildteamtracker.server.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.swgoh.guildteamtracker.domain.dto.analysis.GuildTeamFilterResponseDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerRosterDTO;
import com.swgoh.guildteamtracker.internal.service.GuildTeamSearchService;

@Path("/guild/{id}/teamsearch")
@Produces(MediaType.APPLICATION_JSON)
public class GuildTeamSearchResource {

    @Inject
    private GuildTeamSearchService guildTeamSearchService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public GuildTeamFilterResponseDTO searchGuildTeam(@PathParam("id") final String id, final List<PlayerRosterDTO> teamFilter) {
        return guildTeamSearchService.searchTeam(id, teamFilter);
    }

}
