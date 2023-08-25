package org.im97mori.ble.characteristic.u2a3f;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class AlertStatusTest extends TestBase {

    @Test
    public void test_constructor001() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertEquals(flags, result1.getAlertStatus());
        assertTrue(result1.isAlertStatusRingerStateNotActive());
        assertFalse(result1.isAlertStatusRingerStateActive());
    }

    @Test
    public void test_constructor002() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertEquals(flags, result1.getAlertStatus());
        assertFalse(result1.isAlertStatusRingerStateNotActive());
        assertTrue(result1.isAlertStatusRingerStateActive());
    }

    @Test
    public void test_constructor003() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertEquals(flags, result1.getAlertStatus());
        assertTrue(result1.isAlertStatusVibrateStateNotActive());
        assertFalse(result1.isAlertStatusVibrateStateActive());
    }

    @Test
    public void test_constructor004() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertEquals(flags, result1.getAlertStatus());
        assertFalse(result1.isAlertStatusVibrateStateNotActive());
        assertTrue(result1.isAlertStatusVibrateStateActive());
    }

    @Test
    public void test_constructor005() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertEquals(flags, result1.getAlertStatus());
        assertTrue(result1.isAlertStatusDisplayAlertStatusNotActive());
        assertFalse(result1.isAlertStatusDisplayAlertStatusActive());
    }

    @Test
    public void test_constructor006() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertEquals(flags, result1.getAlertStatus());
        assertFalse(result1.isAlertStatusDisplayAlertStatusNotActive());
        assertTrue(result1.isAlertStatusDisplayAlertStatusActive());
    }

    @Test
    public void test_constructor007() {
        int alertStatus = 1;

        AlertStatus result1 = new AlertStatus(alertStatus);
        assertEquals(alertStatus, result1.getAlertStatus());
    }

    @Test
    public void test_parcelable101() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        //@formatter:off
       int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable103() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable104() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable105() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable106() {
        int flags = AlertStatus.ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
                | AlertStatus.ALERT_STATUS_DISPLAY_ALERT_STATUS_ACTIVE;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags;;
        //@formatter:on

        AlertStatus result1 = new AlertStatus(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
