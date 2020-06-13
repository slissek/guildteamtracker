package com.swgoh.guildteamtracker.internal.mapper.dto.player;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.player.ModStatisticDTO;
import com.swgoh.guildteamtracker.internal.entities.service.player.ModStatistic;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ModStatisticToModStatisticDTOMapper {

    ModStatisticDTO toResource(ModStatistic source);

}
