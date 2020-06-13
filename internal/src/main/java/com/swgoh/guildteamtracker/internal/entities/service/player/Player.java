package com.swgoh.guildteamtracker.internal.entities.service.player;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String guildRefId;
    private String guildName;
    private String guildBannerColor;
    private String guildBannerLogo;
    private String guildTypeId;

    private Integer allyCode;
    private Integer level;
    private Integer poUTCOffsetMinutes;

    private Long grandArenaLifeTime;

    private Long lastActivity;
    private Long updated;

    private Arena arena;

    private List<PlayerRoster> roster;
    private List<GrandArena> grandArena;

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

    public String getGuildRefId() {
        return guildRefId;
    }

    public void setGuildRefId(String guildRefId) {
        this.guildRefId = guildRefId;
    }

    public String getGuildName() {
        return guildName;
    }

    public void setGuildName(String guildName) {
        this.guildName = guildName;
    }

    public String getGuildBannerColor() {
        return guildBannerColor;
    }

    public void setGuildBannerColor(String guildBannerColor) {
        this.guildBannerColor = guildBannerColor;
    }

    public String getGuildBannerLogo() {
        return guildBannerLogo;
    }

    public void setGuildBannerLogo(String guildBannerLogo) {
        this.guildBannerLogo = guildBannerLogo;
    }

    public String getGuildTypeId() {
        return guildTypeId;
    }

    public void setGuildTypeId(String guildTypeId) {
        this.guildTypeId = guildTypeId;
    }

    public Integer getAllyCode() {
        return allyCode;
    }

    public void setAllyCode(Integer allyCode) {
        this.allyCode = allyCode;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPoUTCOffsetMinutes() {
        return poUTCOffsetMinutes;
    }

    public void setPoUTCOffsetMinutes(Integer poUTCOffsetMinutes) {
        this.poUTCOffsetMinutes = poUTCOffsetMinutes;
    }

    public Long getGrandArenaLifeTime() {
        return grandArenaLifeTime;
    }

    public void setGrandArenaLifeTime(Long grandArenaLifeTime) {
        this.grandArenaLifeTime = grandArenaLifeTime;
    }

    public Long getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(Long lastActivity) {
        this.lastActivity = lastActivity;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public List<PlayerRoster> getRoster() {
        return roster;
    }

    public void setRoster(List<PlayerRoster> roster) {
        this.roster = roster;
    }

    public List<GrandArena> getGrandArena() {
        return grandArena;
    }

    public void setGrandArena(List<GrandArena> grandArena) {
        this.grandArena = grandArena;
    }

}
