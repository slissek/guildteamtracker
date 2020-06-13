package com.swgoh.guildteamtracker.internal.mapper.dto.guild;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.guild.RosterDTO;
import com.swgoh.guildteamtracker.internal.entities.service.guild.Roster;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RosterToRosterDTOMapper {

    RosterDTO toResource(Roster source);

}
