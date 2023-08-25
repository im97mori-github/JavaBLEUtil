package org.im97mori.ble.characteristic.u2a24;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ModelNumberStringTest extends TestBase {

    @Test
    public void test_constructor001() {
        String modelNumber = "2JCIE-BU01";

        ModelNumberString result1 = new ModelNumberString(modelNumber.getBytes());
        assertEquals(modelNumber, result1.getModelNumber());
    }

    @Test
    public void test_constructor002() {
        String modelNumber = "2JCIE-BU01";

        ModelNumberString result1 = new ModelNumberString(modelNumber);
        assertEquals(modelNumber, result1.getModelNumber());
    }

    @Test
    public void test_parcelable002() {
        String modelNumber = "2JCIE-BU01";

        ModelNumberString result1 = new ModelNumberString(modelNumber.getBytes());
        byte[] resultData = result1.getBytes();
        assertArrayEquals(modelNumber.getBytes(), resultData);
    }

}
