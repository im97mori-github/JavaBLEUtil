package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LuminousFluxUtilsTest {

    @Test
    public void test_isLuminousFluxValueIsNotKnown_00001() {
        assertTrue(LuminousFluxUtils.isLuminousFluxValueIsNotKnown(LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isLuminousFluxValueIsNotKnown_00002() {
        assertFalse(LuminousFluxUtils.isLuminousFluxValueIsNotKnown(0));
    }

}
