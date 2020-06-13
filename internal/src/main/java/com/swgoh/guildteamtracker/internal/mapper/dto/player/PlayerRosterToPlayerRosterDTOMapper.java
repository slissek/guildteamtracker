package com.swgoh.guildteamtracker.internal.mapper.dto.player;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.player.PlayerRosterDTO;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerRoster;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlayerRosterToPlayerRosterDTOMapper {

    PlayerRosterDTO toResource(PlayerRoster source);

}
