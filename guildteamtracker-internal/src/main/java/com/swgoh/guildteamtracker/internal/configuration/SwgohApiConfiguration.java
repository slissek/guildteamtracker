package com.swgoh.guildteamtracker.internal.configuration;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import help.swgoh.api.SwgohAPI;
import help.swgoh.api.SwgohAPI.Language;
import help.swgoh.api.SwgohAPIBuilder;

public class SwgohApiConfiguration {

    @ConfigProperty(name = "swgoh.api.username")
    private String swgohHelpUsername;

    @ConfigProperty(name = "swgoh.api.password")
    private String swgohHelpPassword;

    @ApplicationScoped
    public SwgohAPI swgohApi() {
        return new SwgohAPIBuilder().withDefaultLanguage(Language.German).withUsername(swgohHelpUsername).withPassword(swgohHelpPassword).build();
    }

}
