package org.im97mori.ble.characteristic.u2a91;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumRecommendedHeartRateTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        MaximumRecommendedHeartRate result1 = new MaximumRecommendedHeartRate(data);
        assertEquals(0x00, result1.getMaximumRecommendedHeartRate());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        MaximumRecommendedHeartRate result1 = new MaximumRecommendedHeartRate(data);
        assertEquals(0xff, result1.getMaximumRecommendedHeartRate());
    }

    @Test
    public void test_constructor003() {
        int maximumRecommendedHeartRate = 1;

        MaximumRecommendedHeartRate result1 = new MaximumRecommendedHeartRate(maximumRecommendedHeartRate);
        assertEquals(maximumRecommendedHeartRate, result1.getMaximumRecommendedHeartRate());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        MaximumRecommendedHeartRate result1 = new MaximumRecommendedHeartRate(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
