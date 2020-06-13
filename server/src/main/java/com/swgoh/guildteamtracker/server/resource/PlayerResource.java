package com.swgoh.guildteamtracker.server.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.swgoh.guildteamtracker.domain.dto.player.PlayerDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerStatisticDTO;
import com.swgoh.guildteamtracker.internal.service.PlayerService;
import com.swgoh.guildteamtracker.internal.service.PlayerStatisticService;

@Path("/players")
@Produces(MediaType.APPLICATION_JSON)
public class PlayerResource {

    @Inject
    private PlayerService playerService;

    @Inject
    private PlayerStatisticService playerStatisticService;

    @GET
    @Path("{allyCode}")
    public PlayerDTO getPlayer(@PathParam("allyCode") Integer allyCode) {
        return playerService.getPlayer(allyCode);
    }

//    @GET
//    @Path("/list/{allyCodes}")
//    public List<PlayerDTO> getPlayers(@PathParam("allyCodes") List<Integer> allyCodes) {
//        return playerService.getPlayers(allyCodes);
//    }

    @GET
    @Path("{allyCode}/statistics")
    public PlayerStatisticDTO getPlayerStatistics(@PathParam("allyCodes") Integer allyCode) {
        return playerStatisticService.getPlayerStatistic(allyCode);
    }

}
