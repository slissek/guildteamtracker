package com.swgoh.guildteamtracker.internal.service.impl;

import java.util.concurrent.ExecutionException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.swgoh.guildteamtracker.internal.entities.dao.guild.GuildInfoDAO;
import com.swgoh.guildteamtracker.internal.entities.dao.player.PlayerDAO;
import com.swgoh.guildteamtracker.internal.entities.service.guild.GuildInfo;
import com.swgoh.guildteamtracker.internal.entities.service.player.Player;
import com.swgoh.guildteamtracker.internal.mapper.dao.guild.GuildInfoToGuildInfoDAOMapper;
import com.swgoh.guildteamtracker.internal.mapper.dao.player.PlayerToPlayerDAOMapper;
import com.swgoh.guildteamtracker.internal.repository.GuildInfoRepository;
import com.swgoh.guildteamtracker.internal.repository.PlayerRepository;
import com.swgoh.guildteamtracker.internal.service.ApiSynchService;
import com.swgoh.guildteamtracker.internal.service.api.impl.AbstractSwgohHelpService;

@ApplicationScoped
public class ApiSynchServiceImpl extends AbstractSwgohHelpService implements ApiSynchService {

    @Inject
    private GuildInfoRepository guildInfoRepository;

    @Inject
    private PlayerRepository playerRepository;

    @Inject
    private GuildInfoToGuildInfoDAOMapper guildInfoDAOMapper;

    @Inject
    private PlayerToPlayerDAOMapper playerDAOMapper;

    @Override
    public void updateGuildInfo(Integer allyCode) {
        try {
            final String guildInfoJSON = convertToJson(swgohApi.getLargeGuild(allyCode).get());
            final GuildInfo guildInfo = objectMapper.readValue(guildInfoJSON, GuildInfo.class);

            final GuildInfoDAO guildInfoDAO = guildInfoDAOMapper.toResource(guildInfo);
            guildInfoRepository.persist(guildInfoDAO);

        } catch (InterruptedException | ExecutionException | JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatePlayer(Integer playerAllyCode) {
        try {
            final String json = convertToJson(swgohApi.getPlayer(playerAllyCode).get());
            final Player player = objectMapper.readValue(json, Player.class);

            final PlayerDAO playerDAO = playerDAOMapper.toResource(player);

            playerRepository.persist(playerDAO);
        } catch (InterruptedException | ExecutionException | JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
