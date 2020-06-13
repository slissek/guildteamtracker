package com.swgoh.guildteamtracker.internal.mapper.dto.guild;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.guild.GuildInfoDTO;
import com.swgoh.guildteamtracker.internal.entities.service.guild.GuildInfo;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GuildInfoToGuildInfoDTOMapper {

    GuildInfoDTO toResource(GuildInfo source);

}
