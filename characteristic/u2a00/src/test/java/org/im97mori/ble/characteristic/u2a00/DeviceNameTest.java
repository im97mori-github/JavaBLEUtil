package org.im97mori.ble.characteristic.u2a00;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class DeviceNameTest {

    @Test
    public void test_constructor001() {
        String name = "Rbt-Sensor";

        DeviceName result1 = new DeviceName(name.getBytes(StandardCharsets.UTF_8));
        assertEquals(name, result1.getName());
    }

    @Test
    public void test_parcelable002() {
        String name = "Rbt-Sensor";

        DeviceName result1 = new DeviceName(name.getBytes(StandardCharsets.UTF_8));
        byte[] resultData = result1.getBytes();
        assertArrayEquals(name.getBytes(), resultData);
    }

}
