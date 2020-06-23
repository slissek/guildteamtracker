package com.swgoh.guildteamtracker.internal.mapper.dao.player;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.internal.entities.dao.player.PlayerDAO;
import com.swgoh.guildteamtracker.internal.entities.dao.player.PlayerRosterDAO;
import com.swgoh.guildteamtracker.internal.entities.service.player.Player;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerRoster;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlayerDAOToPlayerMapper {

    Player toResource(PlayerDAO source);

    @IterableMapping
    PlayerRoster toResource(PlayerRosterDAO soruce);
}