package com.swgoh.guildteamtracker.internal.service;

import com.swgoh.guildteamtracker.domain.dto.player.PlayerStatisticDTO;

public interface PlayerStatisticService {

    PlayerStatisticDTO getPlayerStatistic(Integer playerAllyCode);

}
