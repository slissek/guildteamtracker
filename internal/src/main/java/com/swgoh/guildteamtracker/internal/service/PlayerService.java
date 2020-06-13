package com.swgoh.guildteamtracker.internal.service;

import com.swgoh.guildteamtracker.domain.dto.player.PlayerDTO;

public interface PlayerService {

    PlayerDTO getPlayer(Integer playerAllyCode);

//    List<PlayerDTO> getPlayers(List<Integer> playerAllyCode);

}
