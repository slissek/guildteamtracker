package com.swgoh.guildteamtracker.internal.mapper.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeMapper {

    public LocalDateTime asLocalDateTime(Long date) {
        if (date == null) {
            return null;
        }
        final Date source = new Date(date);
        return source.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public Long asLong(LocalDateTime date) {
        if (date == null) {
            return null;
        }
        final Date converted = Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
        return converted.getTime();
    }
}
