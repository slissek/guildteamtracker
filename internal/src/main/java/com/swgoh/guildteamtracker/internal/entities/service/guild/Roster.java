package com.swgoh.guildteamtracker.internal.entities.service.guild;

import java.io.Serializable;

public class Roster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    private Integer guildMemberLevel;
    private Integer level;
    private Integer allyCode;
    private Integer gp;
    private Integer gpChar;
    private Integer gpShip;

    private Long updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGuildMemberLevel() {
        return guildMemberLevel;
    }

    public void setGuildMemberLevel(Integer guildMemberLevel) {
        this.guildMemberLevel = guildMemberLevel;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAllyCode() {
        return allyCode;
    }

    public void setAllyCode(Integer allyCode) {
        this.allyCode = allyCode;
    }

    public Integer getGp() {
        return gp;
    }

    public void setGp(Integer gp) {
        this.gp = gp;
    }

    public Integer getGpChar() {
        return gpChar;
    }

    public void setGpChar(Integer gpChar) {
        this.gpChar = gpChar;
    }

    public Integer getGpShip() {
        return gpShip;
    }

    public void setGpShip(Integer gpShip) {
        this.gpShip = gpShip;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

}
