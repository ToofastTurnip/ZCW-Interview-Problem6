package io.zipcoder;

import java.util.regex.Pattern;

/**
 * Created by leon on 12/4/17.
 */
public class TimeSplitter {
    private final Time time;

    public TimeSplitter(String input) {
        if(!Pattern.matches("\\d{1,2}:[0-6]\\d[aA|pP][mM]",input)) {
            throw new IllegalArgumentException();
        }
        int hourStart = 0, hourEnd = 1;
        if(input.length() == 7) {
            hourEnd = 2;
        }

        int minuteStart = hourEnd+1, minuteEnd = minuteStart+2;
        int meridianStart = minuteEnd, meridianEnd = meridianStart+2;
            this.time = new Time( // 09:00am
                    input.substring(hourStart, hourEnd),
                    input.substring(minuteStart, minuteEnd),
                    input.substring(meridianStart, meridianEnd));

    }

    public Time getTime() {
        return time;
    }
}
