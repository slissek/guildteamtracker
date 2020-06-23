package com.swgoh.guildteamtracker.internal.service;

public interface RawApiDataService {

    String getPlayerAsString(Integer allyCode);

    String getPlayerRosterAsString(Integer playerAllyCode);

}
