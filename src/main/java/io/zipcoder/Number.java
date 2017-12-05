package io.zipcoder;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 12/4/17.
 */

public enum Number {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12),
    THIRTEEN(13),
    FOURTEEN(14),
    FIFTEEN(15),
    SIXTEEN(16),
    SEVENTEEN(17),
    EIGHTEEN(18),
    NINETEEN(19),
    TWENTY(20),
    THIRTY(30),
    FOURTY(40),
    FIFTY(50);

    private final int value;

    Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }




    public static String getName(int val) {
        for(Number number : Number.values()) {
            if(number.value == val) {
                return StringUtils.capitalize(number.name().toLowerCase());
            }
        }
        StringBuilder errorMessage = new StringBuilder("[ %s ] is not a valid input value.");
        Arrays.asList(values()).forEach(enumeration -> errorMessage.append(enumeration.getValue()));
        throw new IllegalArgumentException(errorMessage.toString());
    }

    public static int getValue(String val) {
        return valueOf(val).getValue();
    }
}