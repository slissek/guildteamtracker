package com.swgoh.guildteamtracker.internal.entities.service.guild;

import java.io.Serializable;

public class Raid implements Serializable {

    private static final long serialVersionUID = 1L;

    private String rancor;
    private String aat;
    private String sith_raid;

    public String getRancor() {
        return rancor;
    }

    public void setRancor(String rancor) {
        this.rancor = rancor;
    }

    public String getAat() {
        return aat;
    }

    public void setAat(String aat) {
        this.aat = aat;
    }

    public String getSith_raid() {
        return sith_raid;
    }

    public void setSith_raid(String sith_raid) {
        this.sith_raid = sith_raid;
    }

}
