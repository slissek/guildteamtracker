package com.swgoh.guildteamtracker.internal.service.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.swgoh.guildteamtracker.domain.dto.gameassets.UnitDTO;
import com.swgoh.guildteamtracker.internal.service.GameDataService;

@ApplicationScoped
public class GameDataServiceImpl implements GameDataService {

    @Override
    public List<UnitDTO> getUnitData() {
        return null;
    }

    @Override
    public String getModStatsList() {
        return null;
    }

    @Override
    public String getModSetStatList() {
        return null;
    }

}
