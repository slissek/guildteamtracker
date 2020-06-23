package com.swgoh.guildteamtracker.internal.entities.service.guild;

import java.io.Serializable;
import java.util.List;

public class GuildInfo implements Serializable {

    private static final long serialVersionUID = 1L;

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

    private Long updated;

    private Raid raid;

    private List<Roster> roster;

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

    public Raid getRaid() {
        return raid;
    }

    public void setRaid(Raid raid) {
        this.raid = raid;
    }

    public List<Roster> getRoster() {
        return roster;
    }

    public void setRoster(List<Roster> roster) {
        this.roster = roster;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

}
