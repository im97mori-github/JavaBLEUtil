package org.im97mori.ble.characteristic.u2a81;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class AnaerobicHeartRateLowerLimitTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        AnaerobicHeartRateLowerLimit result1 = new AnaerobicHeartRateLowerLimit(data);
        assertEquals(0x00, result1.getAnaerobicHeartRateLowerLimit());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        AnaerobicHeartRateLowerLimit result1 = new AnaerobicHeartRateLowerLimit(data);
        assertEquals(0xff, result1.getAnaerobicHeartRateLowerLimit());
    }

    @Test
    public void test_constructor003() {
        int anaerobicHeartRateLowerLimit = 1;

        AnaerobicHeartRateLowerLimit result1 = new AnaerobicHeartRateLowerLimit(anaerobicHeartRateLowerLimit);
        assertEquals(anaerobicHeartRateLowerLimit, result1.getAnaerobicHeartRateLowerLimit());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        AnaerobicHeartRateLowerLimit result1 = new AnaerobicHeartRateLowerLimit(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
