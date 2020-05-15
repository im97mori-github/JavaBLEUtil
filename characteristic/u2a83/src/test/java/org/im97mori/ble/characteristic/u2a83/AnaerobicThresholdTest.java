package org.im97mori.ble.characteristic.u2a83;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnaerobicThresholdTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        AnaerobicThreshold result1 = new AnaerobicThreshold(data);
        assertEquals(0x00, result1.getAnaerobicThreshold());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        AnaerobicThreshold result1 = new AnaerobicThreshold(data);
        assertEquals(0xff, result1.getAnaerobicThreshold());
    }

    @Test
    public void test_constructor003() {
        int anaerobicThreshold = 1;

        AnaerobicThreshold result1 = new AnaerobicThreshold(anaerobicThreshold);
        assertEquals(anaerobicThreshold, result1.getAnaerobicThreshold());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        AnaerobicThreshold result1 = new AnaerobicThreshold(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
