package com.swgoh.guildteamtracker.server.resource;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.swgoh.guildteamtracker.internal.service.ApiSynchService;

@Path("/apisynch")
@Produces(MediaType.APPLICATION_JSON)
public class ApiSynchResource {

    @Inject
    private ApiSynchService apiSynchService;

    @POST
    @Path("/guildinfo/{allyCode}")
    public void updateGuildInfoData(@PathParam("allyCode") Integer allyCode) {
        apiSynchService.updateGuildInfo(allyCode);
    }
}
