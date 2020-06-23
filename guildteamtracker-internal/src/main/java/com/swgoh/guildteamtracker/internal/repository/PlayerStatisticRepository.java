package com.swgoh.guildteamtracker.internal.repository;

import javax.enterprise.context.ApplicationScoped;

import com.swgoh.guildteamtracker.internal.entities.dao.player.PlayerStatisticDAO;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PlayerStatisticRepository implements PanacheRepository<PlayerStatisticDAO> {

}
