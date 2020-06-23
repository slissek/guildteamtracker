package com.swgoh.guildteamtracker.internal.mapper.dto.gameassets;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.gameassets.UnitDTO;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.Unit;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UnitToUnitDTOMapper {

    public UnitDTO toResource(Unit source);

}
