package com.swgoh.guildteamtracker.internal.service.api;

import java.util.List;

import com.swgoh.guildteamtracker.internal.entities.service.gameassets.Unit;
import com.swgoh.guildteamtracker.internal.entities.service.player.Player;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerRoster;

public interface ApiDataService {

    Player getPlayer(Integer playerAllyCode);

    String getPlayerAsString(Integer playerAllyCode);

    PlayerRoster getPlayerRoster(Integer playerAllyCode);

    String getPlayerRosterAsString(Integer playerAllyCode);

    List<Unit> getUnitData();

    String getUnitDataAsString();

    String getModStatsList();

    String getModSetStatList();

}
