package com.swgoh.guildteamtracker.internal.entities.dao.guild;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "guildinfo")
public class GuildInfoDAO {

    @Id
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

    private List<RosterDAO> roster;

    public GuildInfoDAO() {
        super();
    }

    public GuildInfoDAO(String id, String name, String desc, String bannerColor, String bannerLogo, String message, Integer members, Integer status, Integer required, Integer gp,
            Long updated, List<RosterDAO> roster) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.bannerColor = bannerColor;
        this.bannerLogo = bannerLogo;
        this.message = message;
        this.members = members;
        this.status = status;
        this.required = required;
        this.gp = gp;
        this.updated = updated;
        this.roster = roster;
    }

    @Override
    public String toString() {
        return String.format("GuildInfoDAO [id=%s, name=%s, desc=%s, bannerColor=%s, bannerLogo=%s, message=%s, members=%s, status=%s, required=%s, gp=%s, updated=%s, roster=%s]",
                id, name, desc, bannerColor, bannerLogo, message, members, status, required, gp, updated, roster);
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

    public List<RosterDAO> getRoster() {
        return roster;
    }

    public void setRoster(List<RosterDAO> roster) {
        this.roster = roster;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

}
