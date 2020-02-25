package org.im97mori.ble.characteristic.u2a24;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class ModelNumberStringTest {

    @Test
    public void test_constructor001() {
        String modelNumber = "2JCIE-BU01";

        ModelNumberString result1 = new ModelNumberString(modelNumber.getBytes(StandardCharsets.UTF_8));
        assertEquals(modelNumber, result1.getModelNumber());
    }

    @Test
    public void test_parcelable002() {
        String modelNumber = "2JCIE-BU01";

        ModelNumberString result1 = new ModelNumberString(modelNumber.getBytes(StandardCharsets.UTF_8));
        byte[] resultData = result1.getBytes();
        assertArrayEquals(modelNumber.getBytes(), resultData);
    }

}
