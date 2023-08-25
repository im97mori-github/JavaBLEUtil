package org.im97mori.ble.characteristic.u2ad5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class SupportedInclinationRangeTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data_00001 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        SupportedInclinationRange result1 = new SupportedInclinationRange(data);
        assertEquals(0x0201, result1.getMinimumInclination());
        assertEquals(SupportedInclinationRange.MINIMUM_INCLINATION_RESOLUTION * 0x0201, result1.getMinimumInclinationPercent(), 0);
        assertEquals(0x0403, result1.getMaximumInclination());
        assertEquals(SupportedInclinationRange.MAXIMUM_INCLINATION_RESOLUTION * 0x0403, result1.getMaximumInclinationPercent(), 0);
        assertEquals(0x0605, result1.getMinimumIncrement());
        assertEquals(SupportedInclinationRange.MINIMUM_INCREMENT_RESOLUTION * 0x0605, result1.getMinimumIncrementPercent(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int minimumInclination = 1;
        int maximumInclination = 2;
        int minimumIncrement = 3;

        SupportedInclinationRange result1 = new SupportedInclinationRange(minimumInclination, maximumInclination, minimumIncrement);
        assertEquals(minimumInclination, result1.getMinimumInclination());
        assertEquals(maximumInclination, result1.getMaximumInclination());
        assertEquals(minimumIncrement, result1.getMinimumIncrement());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        SupportedInclinationRange result1 = new SupportedInclinationRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
