package org.im97mori.ble.characteristic.u2a8e;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class HeightTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        Height result1 = new Height(data);
        assertEquals(0x0201, result1.getHeight());
        assertEquals(Height.HEIGHT_RESOLUTION * 0x0201, result1.getHeightMeters(), 0);
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        //@formatter:on

        Height result1 = new Height(data);
        assertEquals(0xffff, result1.getHeight());
        assertEquals(Height.HEIGHT_RESOLUTION * 0xffff, result1.getHeightMeters(), 0);
    }

    @Test
    public void test_constructor003() {
        int height = 1;

        Height result1 = new Height(height);
        assertEquals(height, result1.getHeight());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        Height result1 = new Height(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
