package com.swgoh.guildteamtracker.internal.mapper.dto.guild;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.guild.GuildInfoDTO;
import com.swgoh.guildteamtracker.domain.dto.guild.RaidDTO;
import com.swgoh.guildteamtracker.domain.dto.guild.RosterDTO;
import com.swgoh.guildteamtracker.internal.entities.service.guild.GuildInfo;
import com.swgoh.guildteamtracker.internal.entities.service.guild.Raid;
import com.swgoh.guildteamtracker.internal.entities.service.guild.Roster;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;
import com.swgoh.guildteamtracker.internal.mapper.util.LocalDateTimeMapper;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = LocalDateTimeMapper.class)
public interface GuildInfoToGuildInfoDTOMapper {

    GuildInfoDTO toResource(GuildInfo source);

    RaidDTO toResource(Raid source);

    RosterDTO toResource(Roster source);
}
