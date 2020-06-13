package com.swgoh.guildteamtracker.internal.entities.dao.guild;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "roster")
public class RosterDAO {

    @Id
    private String id;
    private String name;

    private Integer guildMemberLevel;
    private Integer level;
    private Integer allyCode;
    private Integer gp;
    private Integer gpChar;
    private Integer gpShip;

    private Long updated;

    public RosterDAO() {
        super();
    }

    public RosterDAO(String id, String name, Integer guildMemberLevel, Integer level, Integer allyCode, Integer gp, Integer gpChar, Integer gpShip, Long updated) {
        super();
        this.id = id;
        this.name = name;
        this.guildMemberLevel = guildMemberLevel;
        this.level = level;
        this.allyCode = allyCode;
        this.gp = gp;
        this.gpChar = gpChar;
        this.gpShip = gpShip;
        this.updated = updated;
    }

    @Override
    public String toString() {
        return String.format("RosterDAO [id=%s, name=%s, guildMemberLevel=%s, level=%s, allyCode=%s, gp=%s, gpChar=%s, gpShip=%s, updated=%s]", id, name, guildMemberLevel, level,
                allyCode, gp, gpChar, gpShip, updated);
    }

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
