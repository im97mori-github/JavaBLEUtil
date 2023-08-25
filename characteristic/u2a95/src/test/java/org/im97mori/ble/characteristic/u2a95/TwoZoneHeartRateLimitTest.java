package org.im97mori.ble.characteristic.u2a95;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class TwoZoneHeartRateLimitTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        TwoZoneHeartRateLimit result1 = new TwoZoneHeartRateLimit(data);
        assertEquals(0x01, result1.getTwoZoneHeartRateLimitFatBurnFitnessLimit());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        TwoZoneHeartRateLimit result1 = new TwoZoneHeartRateLimit(data);
        assertEquals(0xff, result1.getTwoZoneHeartRateLimitFatBurnFitnessLimit());
    }

    @Test
    public void test_constructor003() {
        int twoZoneHeartRateLimitFatBurnFitnessLimit = 1;

        TwoZoneHeartRateLimit result1 = new TwoZoneHeartRateLimit(twoZoneHeartRateLimitFatBurnFitnessLimit);
        assertEquals(twoZoneHeartRateLimitFatBurnFitnessLimit, result1.getTwoZoneHeartRateLimitFatBurnFitnessLimit());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        TwoZoneHeartRateLimit result1 = new TwoZoneHeartRateLimit(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
