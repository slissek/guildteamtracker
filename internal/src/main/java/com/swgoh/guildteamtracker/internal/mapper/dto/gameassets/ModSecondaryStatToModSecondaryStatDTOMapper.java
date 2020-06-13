package com.swgoh.guildteamtracker.internal.mapper.dto.gameassets;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.gameassets.ModSecondaryStatDTO;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.ModSecondaryStat;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ModSecondaryStatToModSecondaryStatDTOMapper {

    ModSecondaryStatDTO toResource(ModSecondaryStat source);

}
