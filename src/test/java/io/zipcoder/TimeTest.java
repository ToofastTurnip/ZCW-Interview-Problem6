package io.zipcoder;

import org.junit.Test;

/**
 * Created by leon on 12/4/17.
 */
public class TimeTest {
    @Test
    public void test1() {
        test("09:05am");
    }

    @Test
    public void test2() {
        test("09:05pm");
    }

    @Test
    public void test3() {
        test("10:00pm");
    }


    @Test
    public void test4() {
        test("10:00am");
    }


    public void test(String input) {
        System.out.println(new TimeSplitter(input).getTime());
    }
}
