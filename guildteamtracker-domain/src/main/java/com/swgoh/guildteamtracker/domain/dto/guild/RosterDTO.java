package com.swgoh.guildteamtracker.domain.dto.guild;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class RosterDTO {

    private String id;
    private String name;

    private Integer guildMemberLevel;
    private Integer level;
    private Integer allyCode;
    private Integer gp;
    private Integer gpChar;
    private Integer gpShip;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime updated;

    @Override
    public String toString() {
        return String.format("RosterDTO [id=%s, name=%s, guildMemberLevel=%s, level=%s, allyCode=%s, gp=%s, gpChar=%s, gpShip=%s, updated=%s]", id, name, guildMemberLevel, level,
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

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

}
