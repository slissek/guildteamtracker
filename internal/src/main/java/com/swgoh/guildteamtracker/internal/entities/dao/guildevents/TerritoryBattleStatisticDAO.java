package com.swgoh.guildteamtracker.internal.entities.dao.guildevents;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.swgoh.guildteamtracker.internal.entities.service.guildevents.TerritoryBattleMapEnum;

@Entity
public class TerritoryBattleStatisticDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TerritoryBattleMapEnum territoryBattleMap;

    private LocalDate startDate;

    private List<TerritoryBattlePlayerStatisticDAO> playerStatistic;
}
