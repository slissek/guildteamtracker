package com.swgoh.guildteamtracker.internal.entities.service.player;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Arena implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("char")
    private CharArena charArena;

    private ShipArena ship;

    public CharArena getCharArena() {
        return charArena;
    }

    public void setCharArena(CharArena charArena) {
        this.charArena = charArena;
    }

    public ShipArena getShip() {
        return ship;
    }

    public void setShip(ShipArena ship) {
        this.ship = ship;
    }

}
