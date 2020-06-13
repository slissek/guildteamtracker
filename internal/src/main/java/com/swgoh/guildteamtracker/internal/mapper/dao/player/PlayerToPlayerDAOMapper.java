package com.swgoh.guildteamtracker.internal.mapper.dao.player;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.internal.entities.dao.player.PlayerDAO;
import com.swgoh.guildteamtracker.internal.entities.service.player.Player;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlayerToPlayerDAOMapper {

    PlayerDAO toResource(Player source);

}
