package com.swgoh.guildteamtracker.internal.service.impl;

import javax.enterprise.context.ApplicationScoped;

import com.swgoh.guildteamtracker.internal.service.RawApiDataService;
import com.swgoh.guildteamtracker.internal.service.api.impl.AbstractSwgohHelpService;

@ApplicationScoped
public class RawApiDataServiceImpl extends AbstractSwgohHelpService implements RawApiDataService {

    @Override
    public String getPlayerAsString(Integer allyCode) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPlayerRosterAsString(Integer playerAllyCode) {
        // TODO Auto-generated method stub
        return null;
    }

}
