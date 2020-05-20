package org.im97mori.ble.characteristic.u2a7e;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AerobicHeartRateLowerLimitTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        AerobicHeartRateLowerLimit result1 = new AerobicHeartRateLowerLimit(data);
        assertEquals(0x00, result1.getAerobicHeartRateLowerLimit());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        AerobicHeartRateLowerLimit result1 = new AerobicHeartRateLowerLimit(data);
        assertEquals(0xff, result1.getAerobicHeartRateLowerLimit());
    }

    @Test
    public void test_constructor003() {
        int aerobicHeartRateLowerLimit = 1;

        AerobicHeartRateLowerLimit result1 = new AerobicHeartRateLowerLimit(aerobicHeartRateLowerLimit);
        assertEquals(aerobicHeartRateLowerLimit, result1.getAerobicHeartRateLowerLimit());
    }

    @Test
    public void test_parcelable002() {
        int aerobicHeartRateLowerLimit = 1;

        AerobicHeartRateLowerLimit result1 = new AerobicHeartRateLowerLimit(aerobicHeartRateLowerLimit);
        assertEquals(aerobicHeartRateLowerLimit, result1.getAerobicHeartRateLowerLimit());
    }

}
