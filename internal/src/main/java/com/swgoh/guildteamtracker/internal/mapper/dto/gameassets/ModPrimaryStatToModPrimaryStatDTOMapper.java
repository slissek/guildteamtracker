package com.swgoh.guildteamtracker.internal.mapper.dto.gameassets;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.gameassets.ModPrimaryStatDTO;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.ModPrimaryStat;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ModPrimaryStatToModPrimaryStatDTOMapper {

    ModPrimaryStatDTO toResource(ModPrimaryStat source);

}
