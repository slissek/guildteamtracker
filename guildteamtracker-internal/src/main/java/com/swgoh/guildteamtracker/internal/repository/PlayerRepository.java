package com.swgoh.guildteamtracker.internal.repository;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;

import com.swgoh.guildteamtracker.internal.entities.dao.player.PlayerDAO;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class PlayerRepository implements PanacheRepositoryBase<PlayerDAO, Integer> {

    public Optional<PlayerDAO> findByAllyCode(Integer allyCode) {
        return find("allyCode", allyCode).firstResultOptional();
    }

    public List<PlayerDAO> findByName(String name) {
        return list("name", name);
    };

}
