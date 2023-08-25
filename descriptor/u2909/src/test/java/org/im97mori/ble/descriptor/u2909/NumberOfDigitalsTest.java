package org.im97mori.ble.descriptor.u2909;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class NumberOfDigitalsTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = 0x01;
        //@formatter:on

        NumberOfDigitals result = new NumberOfDigitals(value);
        assertEquals(0x01, result.getNoOfDigitals());
    }

    @Test
    public void test_constructor002() {
        int noOfDigitals = 1;

        NumberOfDigitals result = new NumberOfDigitals(noOfDigitals);
        assertEquals(noOfDigitals, result.getNoOfDigitals());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = 0x01;
        //@formatter:on

        NumberOfDigitals result1 = new NumberOfDigitals(value);
        assertArrayEquals(value, result1.getBytes());
    }

}
