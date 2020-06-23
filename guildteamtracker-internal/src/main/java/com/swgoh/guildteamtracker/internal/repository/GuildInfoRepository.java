package com.swgoh.guildteamtracker.internal.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.swgoh.guildteamtracker.internal.entities.dao.guild.GuildInfoDAO;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class GuildInfoRepository implements PanacheRepositoryBase<GuildInfoDAO, String> {

    public List<GuildInfoDAO> findByName(String name) {
        return find("name", name).firstResult();
    }

}
