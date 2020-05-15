package org.im97mori.ble.characteristic.u2a84;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AerobicHeartRateUpperLimitTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        AerobicHeartRateUpperLimit result1 = new AerobicHeartRateUpperLimit(data);
        assertEquals(0x00, result1.getAerobicHeartRateUpperLimit());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        AerobicHeartRateUpperLimit result1 = new AerobicHeartRateUpperLimit(data);
        assertEquals(0xff, result1.getAerobicHeartRateUpperLimit());
    }

    @Test
    public void test_constructor003() {
        int aerobicHeartRateUpperLimit = 1;

        AerobicHeartRateUpperLimit result1 = new AerobicHeartRateUpperLimit(aerobicHeartRateUpperLimit);
        assertEquals(aerobicHeartRateUpperLimit, result1.getAerobicHeartRateUpperLimit());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        AerobicHeartRateUpperLimit result1 = new AerobicHeartRateUpperLimit(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
