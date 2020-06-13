package com.swgoh.guildteamtracker.server.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.swgoh.guildteamtracker.domain.dto.guild.GuildDTO;
import com.swgoh.guildteamtracker.domain.dto.guild.GuildInfoDTO;
import com.swgoh.guildteamtracker.internal.service.GuildService;

@Path("/guilds")
@Produces(MediaType.APPLICATION_JSON)
public class GuildResource {

    @Inject
    private GuildService guildService;

    @GET
    public List<GuildDTO> getGuilds() {
        return guildService.getGuilds();
    }

    @GET
    @Path("/{id}/info")
    public GuildInfoDTO getGuildInfo(@PathParam("id") final String id) {
        return guildService.getGuildInfoById(id);
    }

}
