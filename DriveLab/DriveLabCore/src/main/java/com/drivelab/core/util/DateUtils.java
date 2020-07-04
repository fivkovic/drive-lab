package com.drivelab.core.util;

import java.util.Calendar;
import java.util.Date;

public final class DateUtils {

    private DateUtils() { }

    public static Date getDateInPast(Integer daysAgo) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, -daysAgo);
        return calendar.getTime();
    }
}
