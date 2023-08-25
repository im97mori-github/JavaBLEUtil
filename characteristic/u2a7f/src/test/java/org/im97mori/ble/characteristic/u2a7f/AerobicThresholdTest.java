package org.im97mori.ble.characteristic.u2a7f;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class AerobicThresholdTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        AerobicThreshold result1 = new AerobicThreshold(data);
        assertEquals(0x00, result1.getAerobicThreshold());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        AerobicThreshold result1 = new AerobicThreshold(data);
        assertEquals(0xff, result1.getAerobicThreshold());
    }

    @Test
    public void test_constructor003() {
        int aerobicThreshold = 1;

        AerobicThreshold result1 = new AerobicThreshold(aerobicThreshold);
        assertEquals(aerobicThreshold, result1.getAerobicThreshold());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        AerobicThreshold result1 = new AerobicThreshold(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
