package com.swgoh.guildteamtracker.internal.service;

import java.util.List;

import com.swgoh.guildteamtracker.domain.dto.analysis.GuildTeamFilterResponseDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerRosterDTO;

public interface GuildTeamSearchService {

    GuildTeamFilterResponseDTO searchTeam(final String guildId, final List<PlayerRosterDTO> teamFilter);

}
