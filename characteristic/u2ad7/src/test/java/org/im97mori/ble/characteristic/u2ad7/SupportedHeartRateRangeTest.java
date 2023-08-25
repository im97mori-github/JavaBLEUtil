package org.im97mori.ble.characteristic.u2ad7;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class SupportedHeartRateRangeTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data_00001 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        SupportedHeartRateRange result1 = new SupportedHeartRateRange(data);
        assertEquals(0x01, result1.getMinimumHeartRate());
        assertEquals(0x02, result1.getMaximumHeartRate());
        assertEquals(0x03, result1.getMinimumIncrement());
    }

    @Test
    public void test_constructor_00002() {
        int minimumHeartRate = 1;
        int maximumHeartRate = 2;
        int minimumIncrement = 3;

        SupportedHeartRateRange result1 = new SupportedHeartRateRange(minimumHeartRate, maximumHeartRate, minimumIncrement);
        assertEquals(minimumHeartRate, result1.getMinimumHeartRate());
        assertEquals(maximumHeartRate, result1.getMaximumHeartRate());
        assertEquals(minimumIncrement, result1.getMinimumIncrement());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        SupportedHeartRateRange result1 = new SupportedHeartRateRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
