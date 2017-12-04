package io.zipcoder;

/**
 * Created by leon on 12/4/17.
 */
public class Time {
    private final int numberOfHours;
    private final int numberOfMinutes;
    private final boolean isAM;

    public Time(int numberOfHours, int numberOfMinutes, boolean isAM) {
        this.numberOfHours = numberOfHours;
        this.numberOfMinutes = numberOfMinutes;
        this.isAM = isAM;
    }

    public Time(String hours, String minutes, String meridian) {
        this(
                Integer.parseInt(hours),
                Integer.parseInt(minutes),
                "am".equals(meridian));
    }


    public Integer getNumberOfHours() {
        int result = numberOfHours;
        boolean isMidnight = isAM && numberOfHours == 12;
        boolean isEvening = !isAM && numberOfHours < 12;

        if (isMidnight) {
            result = 0;
        }
        if (isEvening) {
            result = numberOfHours + 12;
        }

        return result;
    }

    public Integer getNumberOfMinutes() {
        return numberOfMinutes;
    }
}
