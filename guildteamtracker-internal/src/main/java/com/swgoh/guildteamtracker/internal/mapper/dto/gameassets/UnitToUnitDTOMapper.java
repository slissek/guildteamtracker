package com.swgoh.guildteamtracker.internal.mapper.dto.gameassets;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.gameassets.UnitDTO;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.Unit;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;
import com.swgoh.guildteamtracker.internal.mapper.util.UnitCombatTypeMapper;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = UnitCombatTypeMapper.class)
public interface UnitToUnitDTOMapper {

    UnitDTO toResource(Unit source);

}
