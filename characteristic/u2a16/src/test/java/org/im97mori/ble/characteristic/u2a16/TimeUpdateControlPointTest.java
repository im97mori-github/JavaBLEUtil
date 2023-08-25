package org.im97mori.ble.characteristic.u2a16;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class TimeUpdateControlPointTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = TimeUpdateControlPoint.TIME_UPDATE_CONTROL_POINT_GET_REFERENCE_UPDATE;
        //@formatter:on

        TimeUpdateControlPoint result1 = new TimeUpdateControlPoint(data);
        assertEquals(TimeUpdateControlPoint.TIME_UPDATE_CONTROL_POINT_GET_REFERENCE_UPDATE, result1.getTimeUpdateControlPoint());
        assertTrue(result1.isTimeUpdateControlPointGetReferenceUpdate());
        assertFalse(result1.isTimeUpdateControlPointCancelReferenceUpdate());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = TimeUpdateControlPoint.TIME_UPDATE_CONTROL_POINT_CANCEL_REFERENCE_UPDATE;
        //@formatter:on

        TimeUpdateControlPoint result1 = new TimeUpdateControlPoint(data);
        assertEquals(TimeUpdateControlPoint.TIME_UPDATE_CONTROL_POINT_CANCEL_REFERENCE_UPDATE, result1.getTimeUpdateControlPoint());
        assertFalse(result1.isTimeUpdateControlPointGetReferenceUpdate());
        assertTrue(result1.isTimeUpdateControlPointCancelReferenceUpdate());
    }

    @Test
    public void test_constructor003() {
        int timeUpdateControlPoint = 1;

        TimeUpdateControlPoint result1 = new TimeUpdateControlPoint(timeUpdateControlPoint);
        assertEquals(timeUpdateControlPoint, result1.getTimeUpdateControlPoint());
    }

    @Test
    public void test_parcelable101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = TimeUpdateControlPoint.TIME_UPDATE_CONTROL_POINT_GET_REFERENCE_UPDATE;
        //@formatter:on

        TimeUpdateControlPoint result1 = new TimeUpdateControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = TimeUpdateControlPoint.TIME_UPDATE_CONTROL_POINT_CANCEL_REFERENCE_UPDATE;
        //@formatter:on

        TimeUpdateControlPoint result1 = new TimeUpdateControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
