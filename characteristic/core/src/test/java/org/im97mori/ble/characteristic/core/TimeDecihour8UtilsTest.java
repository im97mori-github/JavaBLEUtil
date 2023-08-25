package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class TimeDecihour8UtilsTest extends TestBase {

    @Test
    public void test_isTimeDecihour8IsNotKnown_00001() {
        assertTrue(TimeDecihour8Utils.isTimeDecihour8IsNotKnown(TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isTimeDecihour8IsNotKnown_00002() {
        assertFalse(TimeDecihour8Utils.isTimeDecihour8IsNotKnown(0));
    }

    @Test
    public void test_getTimeDecihour8Hour_00001() {
        int timeDecihour8 = 0;

        assertEquals(TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_UNIT * timeDecihour8, TimeDecihour8Utils.getTimeDecihour8Hour(timeDecihour8), 0);
    }

    @Test
    public void test_getTimeDecihour8Hour_00002() {
        int timeDecihour8 = 1;

        assertEquals(TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_UNIT * timeDecihour8, TimeDecihour8Utils.getTimeDecihour8Hour(timeDecihour8), 0);
    }

    @Test
    public void test_getTimeDecihour8Hour_00003() {
        int timeDecihour8 = 240;

        assertEquals(TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_UNIT * timeDecihour8, TimeDecihour8Utils.getTimeDecihour8Hour(timeDecihour8), 0);
    }

    @Test
    public void test_getTimeDecihour8Hour_00004() {
        int timeDecihour8 = -1;

        assertEquals(TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MINIMUM, TimeDecihour8Utils.getTimeDecihour8Hour(timeDecihour8), 0);
    }

    @Test
    public void test_getTimeDecihour8Hour_00005() {
        int timeDecihour8 = 241;

        assertEquals(TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MAXIMUM, TimeDecihour8Utils.getTimeDecihour8Hour(timeDecihour8), 0);
    }

}
