package com.swgoh.guildteamtracker.server.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.swgoh.guildteamtracker.domain.dto.gameassets.UnitDTO;
import com.swgoh.guildteamtracker.internal.service.GameDataService;

@Path("/gamedata")
@Produces(MediaType.APPLICATION_JSON)
public class GameDataResource {

    @Inject
    private GameDataService gameDataService;

    @GET
    @Path("/units")
    public List<UnitDTO> getUnits() {
        return gameDataService.getUnitData();
    }

}
