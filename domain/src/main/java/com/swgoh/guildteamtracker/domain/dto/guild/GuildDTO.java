package com.swgoh.guildteamtracker.domain.dto.guild;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class GuildDTO {

    private String id;
    private String name;
    private String desc;
    private String bannerColor;
    private String bannerLogo;
    private String message;

    private Integer members;
    private Integer status;
    private Integer required;

    private Integer gp;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime updated;

    @Override
    public String toString() {
        return String.format("GuildDTO [id=%s, name=%s, desc=%s, bannerColor=%s, bannerLogo=%s, message=%s, members=%s, status=%s, required=%s, gp=%s, updated=%s]", id, name, desc,
                bannerColor, bannerLogo, message, members, status, required, gp, updated);
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBannerColor() {
        return bannerColor;
    }

    public void setBannerColor(String bannerColor) {
        this.bannerColor = bannerColor;
    }

    public String getBannerLogo() {
        return bannerLogo;
    }

    public void setBannerLogo(String bannerLogo) {
        this.bannerLogo = bannerLogo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public Integer getGp() {
        return gp;
    }

    public void setGp(Integer gp) {
        this.gp = gp;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
