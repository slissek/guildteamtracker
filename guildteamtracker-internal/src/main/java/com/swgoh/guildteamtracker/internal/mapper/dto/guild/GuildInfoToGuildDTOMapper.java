package com.swgoh.guildteamtracker.internal.mapper.dto.guild;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.guild.GuildDTO;
import com.swgoh.guildteamtracker.internal.entities.service.guild.GuildInfo;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;
import com.swgoh.guildteamtracker.internal.mapper.util.LocalDateTimeMapper;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = LocalDateTimeMapper.class)
public interface GuildInfoToGuildDTOMapper {

    GuildDTO toResource(GuildInfo source);

}
