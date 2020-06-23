package com.swgoh.guildteamtracker.domain.dto.player;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class PlayerDTO {

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

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime lastActivity;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime updated;

    private List<PlayerRosterDTO> roster;

    @Override
    public String toString() {
        return String.format(
                "PlayerDTO [id=%s, name=%s, guildRefId=%s, guildName=%s, guildBannerColor=%s, guildBannerLogo=%s, guildTypeId=%s, allyCode=%s, level=%s, poUTCOffsetMinutes=%s, grandArenaLifeTime=%s, lastActivity=%s, updated=%s, roster=%s]",
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

    public LocalDateTime getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(LocalDateTime lastActivity) {
        this.lastActivity = lastActivity;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public List<PlayerRosterDTO> getRoster() {
        return roster;
    }

    public void setRoster(List<PlayerRosterDTO> roster) {
        this.roster = roster;
    }

}
