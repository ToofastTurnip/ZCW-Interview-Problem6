package io.zipcoder;

import java.util.regex.Pattern;

/**
 * Created by leon on 12/4/17.
 */
public class TimeSplitter {
    private final Time time;

    public TimeSplitter(String input) {
        if (!Pattern.matches("\\d{1,2}:[0-6]\\d[aA|pP][mM]", input)) {
            throw new IllegalArgumentException();
        }
        int
                hourStart = 0,             hourEnd = input.length() == 7 ? 2 : 1,
                minuteStart = hourEnd + 1, minuteEnd = minuteStart + 2,
                meridianStart = minuteEnd, meridianEnd = meridianStart + 2;
        this.time = new Time( // 09:00am
                input.substring(hourStart, hourEnd),
                input.substring(minuteStart, minuteEnd),
                input.substring(meridianStart, meridianEnd));
    }

    public Time getTime() {
        return time;
    }
}
