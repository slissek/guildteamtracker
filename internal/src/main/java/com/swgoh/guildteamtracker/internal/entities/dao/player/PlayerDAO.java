package com.swgoh.guildteamtracker.internal.entities.dao.player;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "player")
public class PlayerDAO {

    @Id
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

    private List<PlayerRosterDAO> roster;

    public PlayerDAO() {
        super();
    }

    public PlayerDAO(String id, String name, String guildRefId, String guildName, String guildBannerColor, String guildBannerLogo, String guildTypeId, Integer allyCode,
            Integer level, Integer poUTCOffsetMinutes, Long grandArenaLifeTime, Long lastActivity, Long updated, List<PlayerRosterDAO> roster) {
        super();
        this.id = id;
        this.name = name;
        this.guildRefId = guildRefId;
        this.guildName = guildName;
        this.guildBannerColor = guildBannerColor;
        this.guildBannerLogo = guildBannerLogo;
        this.guildTypeId = guildTypeId;
        this.allyCode = allyCode;
        this.level = level;
        this.poUTCOffsetMinutes = poUTCOffsetMinutes;
        this.grandArenaLifeTime = grandArenaLifeTime;
        this.lastActivity = lastActivity;
        this.updated = updated;
        this.roster = roster;
    }

    @Override
    public String toString() {
        return String.format(
                "PlayerDAO [id=%s, name=%s, guildRefId=%s, guildName=%s, guildBannerColor=%s, guildBannerLogo=%s, guildTypeId=%s, allyCode=%s, level=%s, poUTCOffsetMinutes=%s, grandArenaLifeTime=%s, lastActivity=%s, updated=%s, roster=%s]",
                id, name, guildRefId, guildName, guildBannerColor, guildBannerLogo, guildTypeId, allyCode, level, poUTCOffsetMinutes, grandArenaLifeTime, lastActivity, updated,
                roster);
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

    public List<PlayerRosterDAO> getRoster() {
        return roster;
    }

    public void setRoster(List<PlayerRosterDAO> roster) {
        this.roster = roster;
    }

}
