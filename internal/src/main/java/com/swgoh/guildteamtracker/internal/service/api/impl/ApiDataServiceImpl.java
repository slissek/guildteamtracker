package com.swgoh.guildteamtracker.internal.service.api.impl;

import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.enterprise.context.ApplicationScoped;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.Unit;
import com.swgoh.guildteamtracker.internal.entities.service.player.Player;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerRoster;
import com.swgoh.guildteamtracker.internal.service.api.ApiDataService;

import help.swgoh.api.SwgohAPI;
import help.swgoh.api.SwgohAPIFilter;

@ApplicationScoped
public class ApiDataServiceImpl extends AbstractSwgohHelpService implements ApiDataService {

    @Override
    public List<Unit> getUnitData() {
        try {
            final SwgohAPIFilter filter = new SwgohAPIFilter("nameKey", "combatType", "baseId");
            final String unitsJSON = convertToJson(swgohApi.getSupportData(SwgohAPI.Collection.unitsList, filter).get());
            return objectMapper.readValue(unitsJSON, new TypeReference<List<Unit>>() {
            });
        } catch (InterruptedException | ExecutionException | JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getUnitDataAsString() {
        try {
            final SwgohAPIFilter filter = new SwgohAPIFilter("nameKey", "combatType", "baseId");
            return convertToJson(swgohApi.getSupportData(SwgohAPI.Collection.unitsList, filter).get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Player getPlayer(Integer playerAllyCode) {
        try {
            final String playerJson = convertToJson(swgohApi.getPlayer(playerAllyCode).get());
            return objectMapper.readValue(playerJson, Player.class);
        } catch (InterruptedException | ExecutionException | JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getPlayerAsString(Integer playerAllyCode) {
        try {
            return convertToJson(swgohApi.getPlayer(playerAllyCode).get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public PlayerRoster getPlayerRoster(Integer playerAllyCode) {
        try {
            final String playerRosterJson = convertToJson(swgohApi.getRoster(playerAllyCode).get());
            return objectMapper.readValue(playerRosterJson, PlayerRoster.class);
        } catch (InterruptedException | ExecutionException | JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getPlayerRosterAsString(Integer playerAllyCode) {
        try {
            return swgohApi.getRoster(playerAllyCode).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getModStatsList() {
        try {
            final SwgohAPIFilter filter = new SwgohAPIFilter();
            return swgohApi.getSupportData(SwgohAPI.Collection.statModList, filter).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getModSetStatList() {
        try {
            final SwgohAPIFilter filter = new SwgohAPIFilter();
            return swgohApi.getSupportData(SwgohAPI.Collection.statModSetList, filter).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}
