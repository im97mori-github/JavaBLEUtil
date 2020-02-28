package org.im97mori.ble.characteristic.u2a96;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VO2MaxTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        VO2Max result1 = new VO2Max(data);
        assertEquals(0x00, result1.getVo2Max());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        VO2Max result1 = new VO2Max(data);
        assertEquals(0xff, result1.getVo2Max());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        VO2Max result1 = new VO2Max(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
