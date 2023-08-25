package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ExactTime256UtilsTest extends TestBase {

    @Test
    public void test_isFractions256Supported_00001() {
        assertTrue(ExactTime256Utils.isFractions256Supported(ExactTime256Utils.FRACTIONS_256_NOT_SUPPORTED));
    }

    @Test
    public void test_isFractions256Supported_00002() {
        assertFalse(ExactTime256Utils.isFractions256Supported(ExactTime256Utils.FRACTIONS_256_NOT_SUPPORTED + 1));
    }

    @Test
    public void test_getFractions256WithUnit_00001() {
        int fractions256 = 0;

        assertEquals(fractions256, ExactTime256Utils.getFractions256WithUnit(fractions256), 0);
    }

    @Test
    public void test_getFractions256WithUnit_00002() {
        int fractions256 = 256;

        assertEquals(ExactTime256Utils.FRACTIONS_256_UNIT * fractions256, ExactTime256Utils.getFractions256WithUnit(fractions256), 0);
    }

    @Test
    public void test_getFractions256Millis_00001() {
        int fractions256 = 0;

        assertEquals((long) (1000L * ExactTime256Utils.getFractions256WithUnit(fractions256)), ExactTime256Utils.getFractions256Millis(fractions256));
    }

    @Test
    public void test_getFractions256Millis_00002() {
        int fractions256 = 255;

        assertEquals((long) (1000L * ExactTime256Utils.getFractions256WithUnit(fractions256)), ExactTime256Utils.getFractions256Millis(fractions256));
    }

}
