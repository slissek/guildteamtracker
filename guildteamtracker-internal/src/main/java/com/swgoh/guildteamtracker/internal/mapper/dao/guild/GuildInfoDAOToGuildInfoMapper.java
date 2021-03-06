package com.swgoh.guildteamtracker.internal.mapper.dao.guild;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.swgoh.guildteamtracker.internal.entities.dao.guild.GuildInfoDAO;
import com.swgoh.guildteamtracker.internal.entities.dao.guild.RosterDAO;
import com.swgoh.guildteamtracker.internal.entities.service.guild.GuildInfo;
import com.swgoh.guildteamtracker.internal.entities.service.guild.Roster;
import com.swgoh.guildteamtracker.internal.mapper.MappingConfig;

@Mapper(config = MappingConfig.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GuildInfoDAOToGuildInfoMapper {

    GuildInfo toResource(GuildInfoDAO source);

//    Raid toResource(RaidDAO source);

    Roster toResource(RosterDAO source);
}
