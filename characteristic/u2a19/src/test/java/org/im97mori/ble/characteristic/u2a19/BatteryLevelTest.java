package org.im97mori.ble.characteristic.u2a19;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class BatteryLevelTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        BatteryLevel result1 = new BatteryLevel(data);
        assertEquals(0x00, result1.getLevel());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x64;
        //@formatter:on

        BatteryLevel result1 = new BatteryLevel(data);
        assertEquals(0x64, result1.getLevel());
    }

    @Test
    public void test_constructor003() {
        int level = 1;

        BatteryLevel result1 = new BatteryLevel(level);
        assertEquals(level, result1.getLevel());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x64;
        //@formatter:on

        BatteryLevel result1 = new BatteryLevel(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
