package com.swgoh.guildteamtracker.internal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.swgoh.guildteamtracker.domain.dto.analysis.GuildMemberTeamDTO;
import com.swgoh.guildteamtracker.domain.dto.analysis.GuildTeamFilterResponseDTO;
import com.swgoh.guildteamtracker.domain.dto.guild.GuildInfoDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerRosterDTO;
import com.swgoh.guildteamtracker.internal.service.GuildService;
import com.swgoh.guildteamtracker.internal.service.GuildTeamSearchService;
import com.swgoh.guildteamtracker.internal.service.PlayerService;

@ApplicationScoped
public class GuildTeamSearchServcieImpl implements GuildTeamSearchService {

    @Inject
    private GuildService guildService;

    @Inject
    private PlayerService playerService;

    @Override
    public GuildTeamFilterResponseDTO searchTeam(final String guildId, final List<PlayerRosterDTO> teamFilter) {

        final GuildTeamFilterResponseDTO guildTeamFilterResponseDTO = new GuildTeamFilterResponseDTO();

        final GuildInfoDTO guildInfo = guildService.getGuildInfoById(guildId);

        guildInfo.getRoster().stream().forEach(roster -> {
            final PlayerDTO player = playerService.getPlayer(roster.getAllyCode());

            final GuildMemberTeamDTO filterPlayerRoster = filterPlayerRoster(player, teamFilter);

            if (filterPlayerRoster != null) {
                guildTeamFilterResponseDTO.addGuildMemberTeam(filterPlayerRoster);
            }
        });

        return guildTeamFilterResponseDTO;
    }

    private GuildMemberTeamDTO filterPlayerRoster(final PlayerDTO player, final List<PlayerRosterDTO> teamFilter) {
        final List<PlayerRosterDTO> filteredPlayerRoster = new ArrayList<>();

        for (final PlayerRosterDTO filter : teamFilter) {
            final Optional<PlayerRosterDTO> characterMatchOptional = getCharacterMatch(player.getRoster(), filter);

            if (characterMatchOptional.isPresent()) {
                final PlayerRosterDTO characterMatch = characterMatchOptional.get();
                characterMatch.setMandatory(filter.getMandatory());

                filteredPlayerRoster.add(characterMatch);
            }
        }

        final long characterMatchMandatory = filteredPlayerRoster.stream().filter(characterMatch -> characterMatch.getMandatory() == Boolean.TRUE).count();
        final long mandatoryCounter = teamFilter.stream().filter(filter -> filter.getMandatory() == Boolean.TRUE).count();

        if (filteredPlayerRoster.size() > 4 && characterMatchMandatory == mandatoryCounter) {
            final GuildMemberTeamDTO guildMemberTeamDTO = new GuildMemberTeamDTO();
            guildMemberTeamDTO.setPlayerName(player.getName());
            guildMemberTeamDTO.setRosterFilter(filteredPlayerRoster);
            return guildMemberTeamDTO;
        }
        return null;
    }

    private Optional<PlayerRosterDTO> getCharacterMatch(final List<PlayerRosterDTO> playerRoster, PlayerRosterDTO characterFilter) {
        // @formatter:off
        return playerRoster.stream()
            .filter(character -> characterFilter.getDefId().equals(character.getDefId()))
            .filter(character -> characterFilter.getRarity() == character.getRarity())
            .filter(character -> characterFilter.getGear() <= character.getGear())
            .findFirst();
        // @formatter:on
    }
}
