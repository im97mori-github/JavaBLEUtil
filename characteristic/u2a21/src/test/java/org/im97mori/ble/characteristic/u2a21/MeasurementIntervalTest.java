package org.im97mori.ble.characteristic.u2a21;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class MeasurementIntervalTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = MeasurementInterval.MEASUREMENT_INTERVAL_NO_PERIODIC_MEASUREMENT;
        data[ 1] = MeasurementInterval.MEASUREMENT_INTERVAL_NO_PERIODIC_MEASUREMENT >> 8;
        //@formatter:on

        MeasurementInterval result1 = new MeasurementInterval(data);
        assertEquals(MeasurementInterval.MEASUREMENT_INTERVAL_NO_PERIODIC_MEASUREMENT, result1.getMeasurementInterval());
        assertTrue(result1.isMeasurementIntevalNoPeriodicMeasurement());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        MeasurementInterval result1 = new MeasurementInterval(data);
        assertEquals(0x0201, result1.getMeasurementInterval());
        assertFalse(result1.isMeasurementIntevalNoPeriodicMeasurement());
    }

    @Test
    public void test_constructor003() {
        int measurementInterval = 1;

        MeasurementInterval result1 = new MeasurementInterval(measurementInterval);
        assertEquals(measurementInterval, result1.getMeasurementInterval());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 0] = 0x02;
        //@formatter:on

        MeasurementInterval result1 = new MeasurementInterval(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
