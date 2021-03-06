package org.im97mori.ble.characteristic.u2a29;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class ManufacturerNameStringTest {

    @Test
    public void test_constructor001() {
        String manufactureName = "OMRON";

        ManufacturerNameString result1 = new ManufacturerNameString(manufactureName.getBytes(StandardCharsets.UTF_8));
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

        ManufacturerNameString result1 = new ManufacturerNameString(manufactureName.getBytes(StandardCharsets.UTF_8));
        byte[] resultData = result1.getBytes();
        assertArrayEquals(manufactureName.getBytes(), resultData);
    }

}
