package org.im97mori.ble.characteristic.u2ad4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class SupportedSpeedRangeTest extends TestBase {

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

        SupportedSpeedRange result1 = new SupportedSpeedRange(data);
        assertEquals(0x0201, result1.getMinimumSpeed());
        assertEquals(SupportedSpeedRange.MINIMUM_SPEED_RESOLUTION * 0x0201, result1.getMinimumSpeedKilometerPerHour(), 0);
        assertEquals(0x0403, result1.getMaximumSpeed());
        assertEquals(SupportedSpeedRange.MAXIMUM_SPEED_RESOLUTION * 0x0403, result1.getMaximumSpeedKilometerPerHour(), 0);
        assertEquals(0x0605, result1.getMinimumIncrement());
        assertEquals(SupportedSpeedRange.MINIMUM_INCREMENT_RESOLUTION * 0x0605, result1.getMinimumIncrementMetersPerSecond(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int minimumSpeed = 1;
        int maximumSpeed = 2;
        int minimumIncrement = 3;

        SupportedSpeedRange result1 = new SupportedSpeedRange(minimumSpeed, maximumSpeed, minimumIncrement);
        assertEquals(minimumSpeed, result1.getMinimumSpeed());
        assertEquals(maximumSpeed, result1.getMaximumSpeed());
        assertEquals(minimumIncrement, result1.getMinimumIncrement());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        SupportedSpeedRange result1 = new SupportedSpeedRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
