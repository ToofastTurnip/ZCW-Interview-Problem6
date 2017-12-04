package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/4/17.
 */
public class NumberVerbalizerTest {
    @Test
    public void test() {
        Assert.assertEquals(NumberVerbalizer.toString(10), "Ten");
    }
}
