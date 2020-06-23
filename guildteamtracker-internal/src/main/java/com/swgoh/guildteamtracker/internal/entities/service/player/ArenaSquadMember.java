package com.swgoh.guildteamtracker.internal.entities.service.player;

import java.io.Serializable;

public class ArenaSquadMember implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String defId;

    private Integer squadUnitType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDefId() {
        return defId;
    }

    public void setDefId(String defId) {
        this.defId = defId;
    }

    public Integer getSquadUnitType() {
        return squadUnitType;
    }

    public void setSquadUnitType(Integer squadUnitType) {
        this.squadUnitType = squadUnitType;
    }

}
