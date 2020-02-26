package org.im97mori.ble.characteristic.u2a01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppearanceTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) ((Appearance.CATEGORY_UNKNOWN) & 0xff);
        data[ 1] = (byte) ((Appearance.CATEGORY_UNKNOWN >> 8) & 0xff);
        //@formatter:on

        Appearance result1 = new Appearance(data);
        assertArrayEquals(data, result1.getCategory());
        assertEquals(Appearance.CATEGORY_UNKNOWN, result1.getCategoryUint16());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) ((0x000007CF) & 0xff);
        data[ 1] = (byte) ((0x000007CF >> 8) & 0xff);
        //@formatter:on

        Appearance result1 = new Appearance(data);
        assertArrayEquals(data, result1.getCategory());
        assertEquals(0x000007CF, result1.getCategoryUint16());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) ((0x000007CF) & 0xff);
        data[ 1] = (byte) ((0x000007CF >> 8) & 0xff);
        //@formatter:off
        
        Appearance result1 = new Appearance(data);
        byte[] resultData = result1.getBytes();
        assertArrayEquals(data, resultData);
    }
    
}
