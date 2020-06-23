package com.swgoh.guildteamtracker.server.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.swgoh.guildteamtracker.internal.service.RawApiDataService;

@Path("/swgohapi")
@Produces(MediaType.APPLICATION_JSON)
public class RawApiDataResource {

    @Inject
    private RawApiDataService apiService;

    @GET
    @Path("/players/{allyCode}")
    public String getPlayerRaw(@PathParam("allyCode") Integer allyCode) {
        return apiService.getPlayerAsString(allyCode);
    }

    @GET
    @Path("/players/{allyCode}/roster/raw")
    public String getPlayerRosterRaw(@PathParam("allyCode") Integer allyCode) {
        return apiService.getPlayerRosterAsString(allyCode);
    }
}
