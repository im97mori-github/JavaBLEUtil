package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ElectricCurrentUtilsTest {

    @Test
    public void test_isCurrentNotKnown_00001() {
        assertTrue(ElectricCurrentUtils.isCurrentValueNotKnown(ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isCurrentNotKnown_00002() {
        assertFalse(ElectricCurrentUtils.isCurrentValueNotKnown(0));
    }

    @Test
    public void test_isCurrentNotKnown_00003() {
        assertFalse(ElectricCurrentUtils.isCurrentValueNotKnown(65534));
    }

    @Test
    public void test_getCurrentAmpere_00001() {
        int current = 0;

        assertEquals(ElectricCurrentUtils.CURRENT_RESOLUTION * current, ElectricCurrentUtils.getCurrentAmpere(current), 0);
    }

    @Test
    public void test_getCurrentAmpere_00002() {
        int current = 1;

        assertEquals(ElectricCurrentUtils.CURRENT_RESOLUTION * current, ElectricCurrentUtils.getCurrentAmpere(current), 0);
    }

    @Test
    public void test_getCurrentAmpere_00003() {
        int current = -1;

        assertEquals(ElectricCurrentUtils.CURRENT_VALUE_MINIMUM, ElectricCurrentUtils.getCurrentAmpere(current), 0);
    }

    @Test
    public void test_getCurrentAmpere_00004() {
        int current = 65534;

        assertEquals(ElectricCurrentUtils.CURRENT_RESOLUTION * current, ElectricCurrentUtils.getCurrentAmpere(current), 0);
    }

    @Test
    public void test_getCurrentAmpere_00005() {
        int current = 65535;

        assertEquals(ElectricCurrentUtils.CURRENT_VALUE_MAXIMUM, ElectricCurrentUtils.getCurrentAmpere(current), 0);
    }

}
