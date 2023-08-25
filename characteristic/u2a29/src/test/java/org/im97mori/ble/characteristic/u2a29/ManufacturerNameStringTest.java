package org.im97mori.ble.characteristic.u2a29;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ManufacturerNameStringTest extends TestBase {

    @Test
    public void test_constructor001() {
        String manufactureName = "OMRON";

        ManufacturerNameString result1 = new ManufacturerNameString(manufactureName.getBytes());
        assertEquals(manufactureName, result1.getManufacturerName());
    }

    @Test
    public void test_constructor002() {
        String manufactureName = "OMRON";

        ManufacturerNameString result1 = new ManufacturerNameString(manufactureName);
        assertEquals(manufactureName, result1.getManufacturerName());
    }

    @Test
    public void test_parcelable002() {
        String manufactureName = "OMRON";

        ManufacturerNameString result1 = new ManufacturerNameString(manufactureName.getBytes());
        byte[] resultData = result1.getBytes();
        assertArrayEquals(manufactureName.getBytes(), resultData);
    }

}
