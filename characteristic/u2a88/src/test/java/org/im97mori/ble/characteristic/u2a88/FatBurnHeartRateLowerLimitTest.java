package org.im97mori.ble.characteristic.u2a88;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class FatBurnHeartRateLowerLimitTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        FatBurnHeartRateLowerLimit result1 = new FatBurnHeartRateLowerLimit(data);
        assertEquals(0x00, result1.getFatBurnHeartRateLowerLimit());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        FatBurnHeartRateLowerLimit result1 = new FatBurnHeartRateLowerLimit(data);
        assertEquals(0xff, result1.getFatBurnHeartRateLowerLimit());
    }

    @Test
    public void test_constructor003() {
        int fatBurnHeartRateLowerLimit = 1;

        FatBurnHeartRateLowerLimit result1 = new FatBurnHeartRateLowerLimit(fatBurnHeartRateLowerLimit);
        assertEquals(fatBurnHeartRateLowerLimit, result1.getFatBurnHeartRateLowerLimit());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        FatBurnHeartRateLowerLimit result1 = new FatBurnHeartRateLowerLimit(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
