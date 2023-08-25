package org.im97mori.ble.characteristic.u2a94;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ThreeZoneHeartRateLimitsTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        ThreeZoneHeartRateLimits result1 = new ThreeZoneHeartRateLimits(data);
        assertEquals(0x01, result1.getThreeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit());
        assertEquals(0x02, result1.getThreeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        //@formatter:on

        ThreeZoneHeartRateLimits result1 = new ThreeZoneHeartRateLimits(data);
        assertEquals(0xff, result1.getThreeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit());
        assertEquals(0xff, result1.getThreeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit());
    }

    @Test
    public void test_constructor003() {
        int threeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit = 1;
        int threeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit = 2;

        ThreeZoneHeartRateLimits result1 = new ThreeZoneHeartRateLimits(threeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit, threeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit);
        assertEquals(threeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit, result1.getThreeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit());
        assertEquals(threeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit, result1.getThreeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        ThreeZoneHeartRateLimits result1 = new ThreeZoneHeartRateLimits(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
