package org.im97mori.ble.characteristic.u2a8b;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FiveZoneHeartRateLimitsTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        FiveZoneHeartRateLimits result1 = new FiveZoneHeartRateLimits(data);
        assertEquals(0x01, result1.getFiveZoneHeartRateLimitsVeryLightLightLimit());
        assertEquals(0x02, result1.getFiveZoneHeartRateLimitsLightModerateLimit());
        assertEquals(0x03, result1.getFiveZoneHeartRateLimitsModerateHardLimit());
        assertEquals(0x04, result1.getFiveZoneHeartRateLimitsHardMaximumLimit());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0xff;
        data[ 3] = (byte) 0xff;
        //@formatter:on

        FiveZoneHeartRateLimits result1 = new FiveZoneHeartRateLimits(data);
        assertEquals(0xff, result1.getFiveZoneHeartRateLimitsVeryLightLightLimit());
        assertEquals(0xff, result1.getFiveZoneHeartRateLimitsLightModerateLimit());
        assertEquals(0xff, result1.getFiveZoneHeartRateLimitsModerateHardLimit());
        assertEquals(0xff, result1.getFiveZoneHeartRateLimitsHardMaximumLimit());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        FiveZoneHeartRateLimits result1 = new FiveZoneHeartRateLimits(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
