package org.im97mori.ble.characteristic.u2a8d;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class HeartRateMaxTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        HeartRateMax result1 = new HeartRateMax(data);
        assertEquals(0x00, result1.getHeartRateMax());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        HeartRateMax result1 = new HeartRateMax(data);
        assertEquals(0xff, result1.getHeartRateMax());
    }

    @Test
    public void test_constructor003() {
        int heartRateMax = 1;

        HeartRateMax result1 = new HeartRateMax(heartRateMax);
        assertEquals(heartRateMax, result1.getHeartRateMax());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        HeartRateMax result1 = new HeartRateMax(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
