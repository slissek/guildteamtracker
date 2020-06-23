package com.swgoh.guildteamtracker.internal.service;

import java.util.List;

import com.swgoh.guildteamtracker.domain.dto.guild.GuildDTO;
import com.swgoh.guildteamtracker.domain.dto.guild.GuildInfoDTO;

public interface GuildService {

    List<GuildDTO> getGuilds();

    GuildInfoDTO getGuildInfoById(String id);

    GuildInfoDTO getGuildInfoByName(String name);

}
