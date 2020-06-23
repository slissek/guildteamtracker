package com.swgoh.guildteamtracker.internal.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.swgoh.guildteamtracker.domain.dto.guild.GuildInfoDTO;
import com.swgoh.guildteamtracker.domain.dto.guild.RosterDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerDTO;
import com.swgoh.guildteamtracker.domain.dto.player.PlayerStatisticDTO;
import com.swgoh.guildteamtracker.internal.entities.service.player.ModStatistic;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerRoster;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerRosterStatistic;
import com.swgoh.guildteamtracker.internal.entities.service.player.PlayerStatistic;
import com.swgoh.guildteamtracker.internal.service.GuildService;
import com.swgoh.guildteamtracker.internal.service.PlayerService;
import com.swgoh.guildteamtracker.internal.service.PlayerStatisticService;

@ApplicationScoped
public class PlayerStatisticServiceImpl implements PlayerStatisticService {

    private final List<String> RAID_CHARACTER_IDS = Arrays.asList("DARTHTRAYA", "HANSOLO", "GENERALKENOBI");

    private final List<String> LEGENDARY_CHARACTER_IDS = Arrays.asList("GRANDADMIRALTHRAWN", "EMPERORPALPATINE",
            "R2D2_LEGENDARY", "BB8", "COMMANDERLUKESKYWALKER", "REYJEDITRAINING", "GRANDMASTERYODA",
            "CHEWBACCALEGENDARY", "C3POLEGENDARY", "JEDIKNIGHTREVAN", "DARTHREVAN", "DARTHMALAK", "PADMEAMIDALA",
            "GENERALSKYWALKER");

    @Inject
    private PlayerService playerService;

    @Inject
    private GuildService guildService;

    public void createPlayerStatistic(String guildId) {
        final GuildInfoDTO guildInfo = guildService.getGuildInfoByName(guildId);

        guildInfo.getRoster().stream().forEach(roster -> {

        });

    }

    @Override
    public PlayerStatisticDTO getPlayerStatistic(final Integer playerAllyCode) {

        final PlayerStatisticDTO playerStatisticDTO = new PlayerStatisticDTO();

        final PlayerDTO player = playerService.getPlayer(playerAllyCode);

        final GuildInfoDTO guildInfo = guildService.getGuildInfoByName(player.getGuildName());
        final Optional<RosterDTO> playerGuildInfo = guildInfo.getRoster().stream()
                .filter(roster -> playerAllyCode.equals(roster.getAllyCode())).findFirst();

        if (playerGuildInfo.isPresent()) {
            final RosterDTO rosterDTO = playerGuildInfo.get();
            playerStatisticDTO.setCharacterPower(rosterDTO.getGpChar());
            playerStatisticDTO.setShipPower(rosterDTO.getGpShip());
            playerStatisticDTO.setGalacticPower(rosterDTO.getGp());
        }

        return playerStatisticDTO;
    }

    private PlayerStatistic createPlayerStatistic() {

        final PlayerStatistic playerStatistic = new PlayerStatistic();

        final PlayerRosterStatistic playerRosterStatistic = new PlayerRosterStatistic();
        final ModStatistic modStatistic = new ModStatistic();
        final List<PlayerRoster> legandaryCharList = new ArrayList<>();
        final List<PlayerRoster> raidCharList = new ArrayList<>();

//        player.getRoster().stream().forEach(roster -> {
//
//            evaluateGearStatistics(roster, playerRosterStatistic);
//            evaluateModStatistics(roster, modStatistic);
//
//            if (LEGENDARY_CHARACTER_IDS.contains(roster.getDefId())) {
//                legandaryCharList.add(roster);
//            }
//            if (RAID_CHARACTER_IDS.contains(roster.getDefId())) {
//                raidCharList.add(roster);
//            }
//        });
//
//        playerStatistic.setRosterStatistic(playerRosterStatistic);
//        playerStatistic.setModStatistic(modStatistic);
//        playerStatistic.setLegendaryCharList(legandaryCharList);
//        playerStatistic.setRaidCharList(raidCharList);

        return playerStatistic;
    }

    private void evaluateGearStatistics(PlayerRoster roster, final PlayerRosterStatistic playerRosterStatistic) {
        roster.getSkills().stream().forEach(skill -> {
            if (skill.getIsZeta() && skill.getTier() == skill.getTiers()) {
                playerRosterStatistic.setZeta(playerRosterStatistic.getZeta() + 1);
            }
        });

        final Integer gear = roster.getGear();
        switch (gear) {
        case 11:
            playerRosterStatistic.setGearEleven(playerRosterStatistic.getGearEleven() + 1);
            break;
        case 12:
            playerRosterStatistic.setGearTwelve(playerRosterStatistic.getGearTwelve() + 1);
            break;
        default:
            break;
        }

        // relict Level starts at 1... we need 0
//        Integer relictLevel = roster.getRelictLevel();
//        if (relictLevel != null) {
//            relictLevel = relictLevel - 1;
//            switch (relictLevel) {
//            case 1:
//                playerRosterStatistic.setRelicTierOne(playerRosterStatistic.getRelicTierOne() + 1);
//                break;
//            case 2:
//                playerRosterStatistic.setRelicTierTwo(playerRosterStatistic.getRelicTierTwo() + 1);
//                break;
//            case 3:
//                playerRosterStatistic.setRelicTierThree(playerRosterStatistic.getRelicTierThree() + 1);
//                break;
//            case 4:
//                playerRosterStatistic.setRelicTierFour(playerRosterStatistic.getRelicTierFour() + 1);
//                break;
//            case 5:
//                playerRosterStatistic.setRelicTierFive(playerRosterStatistic.getRelicTierFive() + 1);
//                break;
//            case 6:
//                playerRosterStatistic.setRelicTierSix(playerRosterStatistic.getRelicTierSix() + 1);
//                break;
//            case 7:
//                playerRosterStatistic.setRelicTierSeven(playerRosterStatistic.getRelicTierSeven() + 1);
//                break;
//            default:
//                break;
//            }
//        }
    }

    private void evaluateModStatistics(PlayerRoster roster, ModStatistic modStatistic) {
        roster.getMods().stream().forEach(mod -> {
            if (mod.getPips() == 6) {
                modStatistic.setSixDotMods(modStatistic.getSixDotMods() + 1);
            }

            mod.getSecondaryStat().stream().forEach(attribute -> {
//                if (attribute.getModAttribute() == ModSecondaryAttributEnum.SPEED_PERCENTAGE) {
//                    final int speedValue = attribute.getValue().intValue();
//
//                    if (speedValue >= 10 && speedValue < 15) {
//                        modStatistic.setSpeedPlusTen(modStatistic.getSpeedPlusTen() + 1);
//                    } else if (speedValue >= 15 && speedValue < 20) {
//                        modStatistic.setSpeedPlusFifteen(modStatistic.getSpeedPlusFifteen() + 1);
//                    } else if (speedValue >= 20 && speedValue < 25) {
//                        modStatistic.setSpeedPlusTwenty(modStatistic.getSpeedPlusTwenty() + 1);
//                    } else if (speedValue >= 25) {
//                        modStatistic.setSpeedPlusTwentyfive(modStatistic.getSpeedPlusTwentyfive() + 1);
//                    }
//                }
            });
        });
    }

}
