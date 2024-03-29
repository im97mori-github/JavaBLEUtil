package org.im97mori.ble.characteristic.u2a25;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class SerialNumberStringTest extends TestBase {

    @Test
    public void test_constructor001() {
        String serialNumber = "0000MY0000";

        SerialNumberString result1 = new SerialNumberString(serialNumber.getBytes());
        assertEquals(serialNumber, result1.getSerialNumber());
    }

    @Test
    public void test_constructor002() {
        String serialNumber = "39Z9MY9999";

        SerialNumberString result1 = new SerialNumberString(serialNumber.getBytes());
        assertEquals(serialNumber, result1.getSerialNumber());
    }

    @Test
    public void test_constructor003() {
        String serialNumber = "39Z9MY9999";

        SerialNumberString result1 = new SerialNumberString(serialNumber);
        assertEquals(serialNumber, result1.getSerialNumber());
    }

    @Test
    public void test_parcelable003() {
        String serialNumber = "39Z9MY9999";

        SerialNumberString result1 = new SerialNumberString(serialNumber.getBytes());
        byte[] resultData = result1.getBytes();
        assertArrayEquals(serialNumber.getBytes(), resultData);
    }
}
