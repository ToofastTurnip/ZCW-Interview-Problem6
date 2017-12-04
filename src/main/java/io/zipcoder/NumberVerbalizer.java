package io.zipcoder;

/**
 * Created by leon on 12/4/17.
 */
public class NumberVerbalizer {

    private final Integer input;

    private NumberVerbalizer(Integer input) {
        this.input = input;
    }

    public static String toString(int s) {
        return new NumberVerbalizer(s).toString();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(numberGreaterThan20())
                .append(numberGreaterThan10LessThan20())
                .append(numberUnder10())
                .toString();
    }


    private String numberUnder10() {
        if (input > 10) return "";
        if (input == 0) return "Zero";
        String response = "";
        if (input % 100 < 10) {
            response = "Zero " + Number.getName(input);
        }
        return response;
    }

    private String numberGreaterThan10LessThan20() {
        if ((input < 10) || (input > 20)) return "";
        String response = "";
        if ((input % 100 > 9) && (input % 100 < 20)) {
            response = Number.getName(input);
        }
        return response;
    }

    private String numberGreaterThan20() {
        // If the number is greater than 20 exit method immediately
        if (input < 20) return "";

        // If the number is greater than 20 continue to process
        String response = "";
        String remainderString;
        Integer baseTenValue = 50, remainder = 0;
        while (baseTenValue > 19) {
            remainder = input % baseTenValue;
            if (remainder > 9) {
                baseTenValue -= 10;
            } else {
                break;
            }
        }
        remainderString = (Number.getName(remainder) == null ? "" : " " + Number.getName(remainder));
        response += Number.getName(baseTenValue) + remainderString;
        return response;
    }
}
