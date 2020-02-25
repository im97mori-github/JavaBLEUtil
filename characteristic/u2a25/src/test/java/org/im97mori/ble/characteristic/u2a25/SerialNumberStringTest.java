package org.im97mori.ble.characteristic.u2a25;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class SerialNumberStringTest {

    @Test
    public void test_constructor001() {
        String serialNumber = "0000MY0000";

        SerialNumberString result1 = new SerialNumberString(serialNumber.getBytes(StandardCharsets.UTF_8));
        assertEquals(serialNumber, result1.getSerialNumber());
    }

    @Test
    public void test_constructor002() {
        String serialNumber = "39Z9MY9999";

        SerialNumberString result1 = new SerialNumberString(serialNumber.getBytes(StandardCharsets.UTF_8));
        assertEquals(serialNumber, result1.getSerialNumber());
    }

    @Test
    public void test_parcelable003() {
        String serialNumber = "39Z9MY9999";

        SerialNumberString result1 = new SerialNumberString(serialNumber.getBytes(StandardCharsets.UTF_8));
        byte[] resultData = result1.getBytes();
        assertArrayEquals(serialNumber.getBytes(), resultData);
    }
}
