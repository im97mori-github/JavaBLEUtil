package org.im97mori.ble.characteristic.u2a89;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class FatBurnHeartRateUpperLimitTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        FatBurnHeartRateUpperLimit result1 = new FatBurnHeartRateUpperLimit(data);
        assertEquals(0x00, result1.getFatBurnHeartRateUpperLimit());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        FatBurnHeartRateUpperLimit result1 = new FatBurnHeartRateUpperLimit(data);
        assertEquals(0xff, result1.getFatBurnHeartRateUpperLimit());
    }

    @Test
    public void test_constructor003() {
        int fatBurnHeartRateUpperLimit = 1;

        FatBurnHeartRateUpperLimit result1 = new FatBurnHeartRateUpperLimit(fatBurnHeartRateUpperLimit);
        assertEquals(fatBurnHeartRateUpperLimit, result1.getFatBurnHeartRateUpperLimit());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        FatBurnHeartRateUpperLimit result1 = new FatBurnHeartRateUpperLimit(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
