package com.swgoh.guildteamtracker.internal.mapper.dto.player;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.domain.dto.gameassets.ModDTO;
import com.swgoh.guildteamtracker.domain.dto.gameassets.ModPrimaryStatDTO;
import com.swgoh.guildteamtracker.domain.dto.gameassets.ModSecondaryStatDTO;
import com.swgoh.guildteamtracker.domain.dto.gameassets.SkillDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerRosterDTO;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.Mod;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.ModPrimaryStat;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.ModSecondaryStat;
import com.swgoh.guildteamtracker.internal.entities.service.gameassets.Skill;
import com.swgoh.guildteamtracker.internal.entities.service.player.Player;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerRoster;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;
import com.swgoh.guildteamtracker.internal.mapper.util.LocalDateTimeMapper;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = LocalDateTimeMapper.class)
public interface PlayerToPlayerDTOMapper {

    @IterableMapping
    ModDTO toResource(Mod mod);

    ModPrimaryStatDTO toResource(ModPrimaryStat primaryStat);

    @IterableMapping
    ModSecondaryStatDTO toResource(ModSecondaryStat secondaryStat);

    PlayerDTO toResource(Player source);

    @IterableMapping
    PlayerRosterDTO toResource(PlayerRoster source);

    @IterableMapping
    SkillDTO toResource(Skill skill);
}
