package com.swgoh.guildteamtracker.domain.dto.guild;

public class RaidDTO {

    private String rancor;
    private String aat;
    private String sithRaid;

    @Override
    public String toString() {
        return String.format("RaidDTO [rancor=%s, aat=%s, sithRaid=%s]", rancor, aat, sithRaid);
    }

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

    public String getSithRaid() {
        return sithRaid;
    }

    public void setSithRaid(String sithRaid) {
        this.sithRaid = sithRaid;
    }

}
