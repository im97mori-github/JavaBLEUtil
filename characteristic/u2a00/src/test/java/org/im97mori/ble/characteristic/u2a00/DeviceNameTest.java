package org.im97mori.ble.characteristic.u2a00;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class DeviceNameTest extends TestBase {

    @Test
    public void test_constructor001() {
        String name = "Rbt-Sensor";

        DeviceName result1 = new DeviceName(name.getBytes());
        assertEquals(name, result1.getName());
    }

    @Test
    public void test_constructor002() {
        String name = "Rbt-Sensor";

        DeviceName result1 = new DeviceName(name);
        assertEquals(name, result1.getName());
    }

    @Test
    public void test_parcelable002() {
        String name = "Rbt-Sensor";

        DeviceName result1 = new DeviceName(name.getBytes());
        byte[] resultData = result1.getBytes();
        assertArrayEquals(name.getBytes(), resultData);
    }

}
