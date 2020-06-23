package com.swgoh.guildteamtracker.internal.entities.service.gameassets;

import java.io.Serializable;

public class Relic implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer currentTier;

    public Integer getCurrentTier() {
        return currentTier;
    }

    public void setCurrentTier(Integer currentTier) {
        this.currentTier = currentTier;
    }

}
