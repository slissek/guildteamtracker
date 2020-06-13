package com.swgoh.guildteamtracker.internal.mapper.dao.player;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.internal.entities.dao.player.PlayerRosterDAO;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerRoster;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlayerRosterToPlayerRosterDAOConverter {

    PlayerRosterDAO toResource(PlayerRoster source);

}
