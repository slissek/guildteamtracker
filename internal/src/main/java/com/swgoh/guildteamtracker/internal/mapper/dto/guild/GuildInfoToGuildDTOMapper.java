package com.swgoh.guildteamtracker.internal.mapper.dto.guild;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.guild.GuildDTO;
import com.swgoh.guildteamtracker.internal.entities.service.guild.GuildInfo;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GuildInfoToGuildDTOMapper {

    GuildDTO toResource(GuildInfo source);

}
