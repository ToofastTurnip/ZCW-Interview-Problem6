package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void convertHoursUnderTenTest(){
        Problem6 six = new Problem6();
        String expected = "Zero Nine Hundred hours";
        String actual = six.convertToMilitaryTimeString("9:00am");
        Assert.assertEquals("Should output Zero Nine Hundred", expected, actual);
    }

    @Test
    public void convertHoursGreatedThan10LessThan20Test(){
        Problem6 six = new Problem6();
        String expected = "Ten Hundred hours";
        String actual = six.convertToMilitaryTimeString("10:00am");
        Assert.assertEquals("Should output Ten Hundred", expected, actual);
    }

    @Test
    public void convertHoursGreaterThan20Test(){
        Problem6 six = new Problem6();
        String expected ="Twenty Two Hundred hours";
        String actual = six.convertToMilitaryTimeString("10:00pm");
        Assert.assertEquals("Should output Twenty Two Hundred", expected , actual);
    }

    @Test
    public void convertHoursToAfternoonValuesTest(){
        Problem6 six = new Problem6();
        String expected = "Zero Hundred hours";
        String actual = six.convertToMilitaryTimeString("12:00am");
       Assert.assertEquals("Should output Zero Hundred ", expected, actual);

    }

    @Test
    public void convertHoursAndMinutesUnderTenTest(){
        Problem6 six = new Problem6();
        String expected = "Ten Hundred Zero Two hours";
        String actual = six.convertToMilitaryTimeString("10:02am");
        Assert.assertEquals("Should output Ten Hundred Two hours", expected, actual);
    }
}
