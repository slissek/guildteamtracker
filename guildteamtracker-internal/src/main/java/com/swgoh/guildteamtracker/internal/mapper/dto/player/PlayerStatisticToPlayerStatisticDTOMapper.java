package com.swgoh.guildteamtracker.internal.mapper.dto.player;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.player.ModStatisticDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerRosterDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerRosterStatisticDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerStatisticDTO;
import com.swgoh.guildteamtracker.internal.entities.service.player.ModStatistic;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerRoster;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerRosterStatistic;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerStatistic;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PlayerStatisticToPlayerStatisticDTOMapper {

    ModStatisticDTO toResource(ModStatistic source);

    PlayerRosterDTO toResource(PlayerRoster source);

    PlayerRosterStatisticDTO toResource(PlayerRosterStatistic source);

    PlayerStatisticDTO toResource(PlayerStatistic source);

}
