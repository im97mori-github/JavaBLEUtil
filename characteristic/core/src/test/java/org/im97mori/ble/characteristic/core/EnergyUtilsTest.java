package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EnergyUtilsTest {

    @Test
    public void test_isEnergyValueIsNotKnown_00001() {
        assertTrue(EnergyUtils.isEnergyValueIsNotKnown(EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isEnergyValueIsNotKnown_00002() {
        assertFalse(EnergyUtils.isEnergyValueIsNotKnown(0));
    }

}
