package org.im97mori.ble.characteristic.u2a06;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AlertLevelTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AlertLevel.ALERT_LEVEL_NO_ALERT;
        //@formatter:on

        AlertLevel result1 = new AlertLevel(data);
        assertEquals(AlertLevel.ALERT_LEVEL_NO_ALERT, result1.getAlertLevel());
        assertTrue(result1.isAlertLevelNoAlert());
        assertFalse(result1.isAlertLevelMildAlert());
        assertFalse(result1.isAlertLevelHighAlert());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AlertLevel.ALERT_LEVEL_MILD_ALERT;
        //@formatter:on

        AlertLevel result1 = new AlertLevel(data);
        assertEquals(AlertLevel.ALERT_LEVEL_MILD_ALERT, result1.getAlertLevel());
        assertFalse(result1.isAlertLevelNoAlert());
        assertTrue(result1.isAlertLevelMildAlert());
        assertFalse(result1.isAlertLevelHighAlert());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AlertLevel.ALERT_LEVEL_HIGH_ALERT;
        //@formatter:on

        AlertLevel result1 = new AlertLevel(data);
        assertEquals(AlertLevel.ALERT_LEVEL_HIGH_ALERT, result1.getAlertLevel());
        assertFalse(result1.isAlertLevelNoAlert());
        assertFalse(result1.isAlertLevelMildAlert());
        assertTrue(result1.isAlertLevelHighAlert());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AlertLevel.ALERT_LEVEL_MILD_ALERT;
        //@formatter:on

        AlertLevel result1 = new AlertLevel(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
