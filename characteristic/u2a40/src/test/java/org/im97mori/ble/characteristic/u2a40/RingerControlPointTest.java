package org.im97mori.ble.characteristic.u2a40;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RingerControlPointTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = RingerControlPoint.RINGER_CONTROL_POINT_SILENT_MODE;
        //@formatter:on

        RingerControlPoint result1 = new RingerControlPoint(data);
        assertEquals(RingerControlPoint.RINGER_CONTROL_POINT_SILENT_MODE, result1.getRingerControlPoint());
        assertTrue(result1.isRingerControlPointSilentMode());
        assertFalse(result1.isRingerControlPointMuteOnce());
        assertFalse(result1.isRingerControlPointCancelSilentMode());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = RingerControlPoint.RINGER_CONTROL_POINT_MUTE_ONCE;
        //@formatter:on

        RingerControlPoint result1 = new RingerControlPoint(data);
        assertEquals(RingerControlPoint.RINGER_CONTROL_POINT_MUTE_ONCE, result1.getRingerControlPoint());
        assertFalse(result1.isRingerControlPointSilentMode());
        assertTrue(result1.isRingerControlPointMuteOnce());
        assertFalse(result1.isRingerControlPointCancelSilentMode());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = RingerControlPoint.RINGER_CONTROL_POINT_CANCEL_SILENT_MODE;
        //@formatter:on

        RingerControlPoint result1 = new RingerControlPoint(data);
        assertEquals(RingerControlPoint.RINGER_CONTROL_POINT_CANCEL_SILENT_MODE, result1.getRingerControlPoint());
        assertFalse(result1.isRingerControlPointSilentMode());
        assertFalse(result1.isRingerControlPointMuteOnce());
        assertTrue(result1.isRingerControlPointCancelSilentMode());
    }

    @Test
    public void test_constructor004() {
        int ringerControlPoint = 1;

        RingerControlPoint result1 = new RingerControlPoint(ringerControlPoint);
        assertEquals(ringerControlPoint, result1.getRingerControlPoint());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = RingerControlPoint.RINGER_CONTROL_POINT_SILENT_MODE;
        //@formatter:on

        RingerControlPoint result1 = new RingerControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
