package org.im97mori.ble.characteristic.u2a14;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReferenceTimeInformationTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = ReferenceTimeInformation.TIME_SOURCE_UNKNOWN;
        data[ 1] = (byte) ReferenceTimeInformation.ACCURACY_OUT_OF_RANGE;
        data[ 2] = (byte) ReferenceTimeInformation.DAYS_SINCE_UPDATE_255_OR_MORE_DAYS;
        data[ 3] = (byte) ReferenceTimeInformation.DAYS_SINCE_UPDATE_255_OR_MORE_HOURS;
        //@formatter:on

        ReferenceTimeInformation result1 = new ReferenceTimeInformation(data);
        assertEquals(ReferenceTimeInformation.TIME_SOURCE_UNKNOWN, result1.getTimeSource());
        assertTrue(result1.isTimeSourceNotKnown());
        assertFalse(result1.isTimeSourceNetworkTimeProtocol());
        assertFalse(result1.isTimeSourceGps());
        assertFalse(result1.isTimeSourceRadioTimeSignal());
        assertFalse(result1.isTimeSourceManual());
        assertFalse(result1.isTimeSourceAtomicClock());
        assertFalse(result1.isTimeSourceCellularNetwork());
        assertEquals(ReferenceTimeInformation.ACCURACY_OUT_OF_RANGE, result1.getAccuracy());
        assertTrue(result1.isAccuracyOutOfRange());
        assertFalse(result1.isAccuracyUnknown());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_SUPPORTED_MILLIS
                        * ReferenceTimeInformation.ACCURACY_OUT_OF_RANGE
                , result1.getAccuracyFraction256SupportedMillis());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_NOT_SUPPORTED_MILLIS
                        * ReferenceTimeInformation.ACCURACY_OUT_OF_RANGE
                , result1.getAccuracyFraction256NotSupportedMillis());
        assertEquals(ReferenceTimeInformation.DAYS_SINCE_UPDATE_255_OR_MORE_DAYS, result1.getDaysSinceUpdate());
        assertTrue(result1.isDaysSinceUpdate255OrMoreDays());
        assertEquals(ReferenceTimeInformation.DAYS_SINCE_UPDATE_255_OR_MORE_HOURS, result1.getHoursSinceUpdate());
        assertTrue(result1.isHoursSinceUpdate255OrMoreHours());
        assertEquals(86400000L
                        * ReferenceTimeInformation.DAYS_SINCE_UPDATE_255_OR_MORE_DAYS
                        + 3600000L
                        * ReferenceTimeInformation.DAYS_SINCE_UPDATE_255_OR_MORE_DAYS
                , result1.getTimeFromUpdateMillis());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = ReferenceTimeInformation.TIME_SOURCE_NETWORK_TIME_PROTOCOL;
        data[ 1] = (byte) ReferenceTimeInformation.ACCURACY_UNKNOWN;
        data[ 2] = 0;
        data[ 3] = 0;
        //@formatter:on

        ReferenceTimeInformation result1 = new ReferenceTimeInformation(data);
        assertEquals(ReferenceTimeInformation.TIME_SOURCE_NETWORK_TIME_PROTOCOL, result1.getTimeSource());
        assertFalse(result1.isTimeSourceNotKnown());
        assertTrue(result1.isTimeSourceNetworkTimeProtocol());
        assertFalse(result1.isTimeSourceGps());
        assertFalse(result1.isTimeSourceRadioTimeSignal());
        assertFalse(result1.isTimeSourceManual());
        assertFalse(result1.isTimeSourceAtomicClock());
        assertFalse(result1.isTimeSourceCellularNetwork());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNKNOWN, result1.getAccuracy());
        assertFalse(result1.isAccuracyOutOfRange());
        assertTrue(result1.isAccuracyUnknown());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_SUPPORTED_MILLIS
                        * ReferenceTimeInformation.ACCURACY_UNKNOWN
                , result1.getAccuracyFraction256SupportedMillis());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_NOT_SUPPORTED_MILLIS
                        * ReferenceTimeInformation.ACCURACY_UNKNOWN
                , result1.getAccuracyFraction256NotSupportedMillis());
        assertEquals(0, result1.getDaysSinceUpdate());
        assertFalse(result1.isDaysSinceUpdate255OrMoreDays());
        assertEquals(0, result1.getHoursSinceUpdate());
        assertFalse(result1.isHoursSinceUpdate255OrMoreHours());
        assertEquals(0, result1.getTimeFromUpdateMillis());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = ReferenceTimeInformation.TIME_SOURCE_GPS;
        data[ 1] = 0;
        data[ 2] = (byte) 254;
        data[ 3] = 23;
        //@formatter:on

        ReferenceTimeInformation result1 = new ReferenceTimeInformation(data);
        assertEquals(ReferenceTimeInformation.TIME_SOURCE_GPS, result1.getTimeSource());
        assertFalse(result1.isTimeSourceNotKnown());
        assertFalse(result1.isTimeSourceNetworkTimeProtocol());
        assertTrue(result1.isTimeSourceGps());
        assertFalse(result1.isTimeSourceRadioTimeSignal());
        assertFalse(result1.isTimeSourceManual());
        assertFalse(result1.isTimeSourceAtomicClock());
        assertFalse(result1.isTimeSourceCellularNetwork());
        assertEquals(0, result1.getAccuracy());
        assertFalse(result1.isAccuracyOutOfRange());
        assertFalse(result1.isAccuracyUnknown());
        assertEquals(0, result1.getAccuracyFraction256SupportedMillis());
        assertEquals(0, result1.getAccuracyFraction256NotSupportedMillis());
        assertEquals(254, result1.getDaysSinceUpdate());
        assertFalse(result1.isDaysSinceUpdate255OrMoreDays());
        assertEquals(23, result1.getHoursSinceUpdate());
        assertFalse(result1.isHoursSinceUpdate255OrMoreHours());
        assertEquals(86400000L
                * 254
                + 3600000L
                * 23, result1.getTimeFromUpdateMillis());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = ReferenceTimeInformation.TIME_SOURCE_RADIO_TIME_SIGNAL;
        data[ 1] = (byte) 253;
        data[ 2] = (byte) 254;
        data[ 3] = 23;
        //@formatter:on

        ReferenceTimeInformation result1 = new ReferenceTimeInformation(data);
        assertEquals(ReferenceTimeInformation.TIME_SOURCE_RADIO_TIME_SIGNAL, result1.getTimeSource());
        assertFalse(result1.isTimeSourceNotKnown());
        assertFalse(result1.isTimeSourceNetworkTimeProtocol());
        assertFalse(result1.isTimeSourceGps());
        assertTrue(result1.isTimeSourceRadioTimeSignal());
        assertFalse(result1.isTimeSourceManual());
        assertFalse(result1.isTimeSourceAtomicClock());
        assertFalse(result1.isTimeSourceCellularNetwork());
        assertEquals(253, result1.getAccuracy());
        assertFalse(result1.isAccuracyOutOfRange());
        assertFalse(result1.isAccuracyUnknown());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_SUPPORTED_MILLIS
                * 253, result1.getAccuracyFraction256SupportedMillis());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_NOT_SUPPORTED_MILLIS
                * 253, result1.getAccuracyFraction256NotSupportedMillis());
        assertEquals(254, result1.getDaysSinceUpdate());
        assertFalse(result1.isDaysSinceUpdate255OrMoreDays());
        assertEquals(23, result1.getHoursSinceUpdate());
        assertFalse(result1.isHoursSinceUpdate255OrMoreHours());
        assertEquals(86400000L
                * 254
                + 3600000L
                * 23, result1.getTimeFromUpdateMillis());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = ReferenceTimeInformation.TIME_SOURCE_MANUAL;
        data[ 1] = (byte) 253;
        data[ 2] = (byte) 254;
        data[ 3] = 23;
        //@formatter:on

        ReferenceTimeInformation result1 = new ReferenceTimeInformation(data);
        assertEquals(ReferenceTimeInformation.TIME_SOURCE_MANUAL, result1.getTimeSource());
        assertFalse(result1.isTimeSourceNotKnown());
        assertFalse(result1.isTimeSourceNetworkTimeProtocol());
        assertFalse(result1.isTimeSourceGps());
        assertFalse(result1.isTimeSourceRadioTimeSignal());
        assertTrue(result1.isTimeSourceManual());
        assertFalse(result1.isTimeSourceAtomicClock());
        assertFalse(result1.isTimeSourceCellularNetwork());
        assertEquals(253, result1.getAccuracy());
        assertFalse(result1.isAccuracyOutOfRange());
        assertFalse(result1.isAccuracyUnknown());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_SUPPORTED_MILLIS
                * 253, result1.getAccuracyFraction256SupportedMillis());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_NOT_SUPPORTED_MILLIS
                * 253, result1.getAccuracyFraction256NotSupportedMillis());
        assertEquals(254, result1.getDaysSinceUpdate());
        assertFalse(result1.isDaysSinceUpdate255OrMoreDays());
        assertEquals(23, result1.getHoursSinceUpdate());
        assertFalse(result1.isHoursSinceUpdate255OrMoreHours());
        assertEquals(86400000L
                * 254
                + 3600000L
                * 23, result1.getTimeFromUpdateMillis());
    }

    @Test
    public void test_constructor006() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = ReferenceTimeInformation.TIME_SOURCE_ATOMIC_CLOCK;
        data[ 1] = (byte) 253;
        data[ 2] = (byte) 254;
        data[ 3] = 23;
        //@formatter:on

        ReferenceTimeInformation result1 = new ReferenceTimeInformation(data);
        assertEquals(ReferenceTimeInformation.TIME_SOURCE_ATOMIC_CLOCK, result1.getTimeSource());
        assertFalse(result1.isTimeSourceNotKnown());
        assertFalse(result1.isTimeSourceNetworkTimeProtocol());
        assertFalse(result1.isTimeSourceGps());
        assertFalse(result1.isTimeSourceRadioTimeSignal());
        assertFalse(result1.isTimeSourceManual());
        assertTrue(result1.isTimeSourceAtomicClock());
        assertFalse(result1.isTimeSourceCellularNetwork());
        assertEquals(253, result1.getAccuracy());
        assertFalse(result1.isAccuracyOutOfRange());
        assertFalse(result1.isAccuracyUnknown());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_SUPPORTED_MILLIS
                * 253, result1.getAccuracyFraction256SupportedMillis());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_NOT_SUPPORTED_MILLIS
                * 253, result1.getAccuracyFraction256NotSupportedMillis());
        assertEquals(254, result1.getDaysSinceUpdate());
        assertFalse(result1.isDaysSinceUpdate255OrMoreDays());
        assertEquals(23, result1.getHoursSinceUpdate());
        assertFalse(result1.isHoursSinceUpdate255OrMoreHours());
        assertEquals(86400000L
                * 254
                + 3600000L
                * 23, result1.getTimeFromUpdateMillis());
    }

    @Test
    public void test_constructor007() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = ReferenceTimeInformation.TIME_SOURCE_CELLULAR_NETWORK;
        data[ 1] = (byte) 253;
        data[ 2] = (byte) 254;
        data[ 3] = 23;
        //@formatter:on

        ReferenceTimeInformation result1 = new ReferenceTimeInformation(data);
        assertEquals(ReferenceTimeInformation.TIME_SOURCE_CELLULAR_NETWORK, result1.getTimeSource());
        assertFalse(result1.isTimeSourceNotKnown());
        assertFalse(result1.isTimeSourceNetworkTimeProtocol());
        assertFalse(result1.isTimeSourceGps());
        assertFalse(result1.isTimeSourceRadioTimeSignal());
        assertFalse(result1.isTimeSourceManual());
        assertFalse(result1.isTimeSourceAtomicClock());
        assertTrue(result1.isTimeSourceCellularNetwork());
        assertEquals(253, result1.getAccuracy());
        assertFalse(result1.isAccuracyOutOfRange());
        assertFalse(result1.isAccuracyUnknown());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_SUPPORTED_MILLIS
                * 253, result1.getAccuracyFraction256SupportedMillis());
        assertEquals(ReferenceTimeInformation.ACCURACY_UNIT_FRACTIONS256_NOT_SUPPORTED_MILLIS
                * 253, result1.getAccuracyFraction256NotSupportedMillis());
        assertEquals(254, result1.getDaysSinceUpdate());
        assertFalse(result1.isDaysSinceUpdate255OrMoreDays());
        assertEquals(23, result1.getHoursSinceUpdate());
        assertFalse(result1.isHoursSinceUpdate255OrMoreHours());
        assertEquals(86400000L
                * 254
                + 3600000L
                * 23, result1.getTimeFromUpdateMillis());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

        ReferenceTimeInformation result1 = new ReferenceTimeInformation(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
