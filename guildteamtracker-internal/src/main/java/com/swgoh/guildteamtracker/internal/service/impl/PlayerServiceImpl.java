package com.swgoh.guildteamtracker.internal.service.impl;

import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.swgoh.guildteamtracker.domain.dto.player.PlayerDTO;
import com.swgoh.guildteamtracker.internal.entities.dao.player.PlayerDAO;
import com.swgoh.guildteamtracker.internal.entities.service.player.Player;
import com.swgoh.guildteamtracker.internal.mapper.dao.player.PlayerDAOToPlayerMapper;
import com.swgoh.guildteamtracker.internal.mapper.dto.player.PlayerToPlayerDTOMapper;
import com.swgoh.guildteamtracker.internal.repository.PlayerRepository;
import com.swgoh.guildteamtracker.internal.service.PlayerService;

@ApplicationScoped
public class PlayerServiceImpl implements PlayerService {

    @Inject
    private PlayerRepository playerRepository;

    @Inject
    private PlayerDAOToPlayerMapper playerMapper;

    @Inject
    private PlayerToPlayerDTOMapper playerDTOMapper;

    @Override
    public PlayerDTO getPlayer(Integer playerAllyCode) {
        final Optional<PlayerDAO> playerOptional = playerRepository.findByAllyCode(playerAllyCode);
        if (playerOptional.isPresent()) {
            final PlayerDAO playerDAO = playerOptional.get();
            final Player player = playerMapper.toResource(playerDAO);
            return playerDTOMapper.toResource(player);
        }
        return null;
    }
//
//    @Override
//    public List<PlayerDTO> getPlayers(List<Integer> playerAllyCode) {
//        final List<PlayerDAO> playersDAO = playerRepository.findByAllyCodes(playerAllyCode);
//        final List<Player> players = collectionConversionService.convertToList(playersDAO, Player.class);
//        return collectionConversionService.convertToList(players, PlayerDTO.class);
//    }

}
