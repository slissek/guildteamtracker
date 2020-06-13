package com.swgoh.guildteamtracker.internal.service;

import java.util.List;

import com.swgoh.guildteamtracker.domain.dto.gameassets.UnitDTO;

public interface GameDataService {

    List<UnitDTO> getUnitData();

    String getModStatsList();

    String getModSetStatList();

}
