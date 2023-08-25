package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class IlluminanceUtilsTest extends TestBase {

    @Test
    public void test_isIlluminanceValueIsNotKnown_00001() {
        assertTrue(IlluminanceUtils.isIlluminanceValueIsNotKnown(IlluminanceUtils.ILLUMINANCE_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isIlluminanceValueIsNotKnown_00002() {
        assertFalse(IlluminanceUtils.isIlluminanceValueIsNotKnown(0));
    }

    @Test
    public void test_getIlluminanceLux_00001() {
        int illuminance = 0;

        assertEquals(IlluminanceUtils.ILLUMINANCE_VALUE_UNIT * illuminance, IlluminanceUtils.getIlluminanceLux(illuminance), 0);
    }

    @Test
    public void test_getIlluminanceLux_00002() {
        int illuminance = 1;

        assertEquals(IlluminanceUtils.ILLUMINANCE_VALUE_UNIT * illuminance, IlluminanceUtils.getIlluminanceLux(illuminance), 0);
    }

    @Test
    public void test_getIlluminanceLux_00003() {
        int illuminance = 16777214;

        assertEquals(IlluminanceUtils.ILLUMINANCE_VALUE_UNIT * illuminance, IlluminanceUtils.getIlluminanceLux(illuminance), 0);
    }

    @Test
    public void test_getIlluminanceLux_00004() {
        int illuminance = -1;

        assertEquals(IlluminanceUtils.ILLUMINANCE_VALUE_MINIMUM, IlluminanceUtils.getIlluminanceLux(illuminance), 0);
    }

    @Test
    public void test_getIlluminanceLux_00005() {
        int illuminance = 16777215;

        assertEquals(IlluminanceUtils.ILLUMINANCE_VALUE_MAXIMUM, IlluminanceUtils.getIlluminanceLux(illuminance), 0);
    }

}
