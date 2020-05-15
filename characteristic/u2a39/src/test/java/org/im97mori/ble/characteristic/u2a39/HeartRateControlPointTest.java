package org.im97mori.ble.characteristic.u2a39;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HeartRateControlPointTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0;
        //@formatter:on

        HeartRateControlPoint result1 = new HeartRateControlPoint(data);
        assertEquals(0, result1.getHeartRateControlPoint());
        assertFalse(result1.isHeartRateControlPointResetEnergyExpended());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = HeartRateControlPoint.HEART_RATE_CONTROL_POINT_RESET_ENERGY_EXPENDED;
        //@formatter:on

        HeartRateControlPoint result1 = new HeartRateControlPoint(data);
        assertEquals(HeartRateControlPoint.HEART_RATE_CONTROL_POINT_RESET_ENERGY_EXPENDED, result1.getHeartRateControlPoint());
        assertTrue(result1.isHeartRateControlPointResetEnergyExpended());
    }

    @Test
    public void test_constructor003() {
        int heartRateControlPoint = 1;

        HeartRateControlPoint result1 = new HeartRateControlPoint(heartRateControlPoint);
        assertEquals(heartRateControlPoint, result1.getHeartRateControlPoint());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = HeartRateControlPoint.HEART_RATE_CONTROL_POINT_RESET_ENERGY_EXPENDED;
        //@formatter:on

        HeartRateControlPoint result1 = new HeartRateControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
