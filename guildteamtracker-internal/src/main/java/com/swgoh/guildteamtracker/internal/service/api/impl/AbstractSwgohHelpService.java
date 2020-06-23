package com.swgoh.guildteamtracker.internal.service.api.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.fasterxml.jackson.databind.ObjectMapper;

import help.swgoh.api.SwgohAPI;

@ApplicationScoped
public abstract class AbstractSwgohHelpService {

    @Inject
    protected SwgohAPI swgohApi;

    @Inject
    protected ObjectMapper objectMapper;

    protected String convertToJson(final String response) {
        if (response.length() > 2) {
            return response.substring(1, response.length() - 2);
        }
        return null;
    }
}
