package com.swgoh.guildteamtracker.internal.mapper.dto.player;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.player.PlayerStatisticDTO;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerStatistic;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlayerStatisticToPlayerStatisticDTOMapper {

    PlayerStatisticDTO toResource(PlayerStatistic source);
}
