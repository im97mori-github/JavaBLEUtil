package org.im97mori.ble.characteristic.u2a0f;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.core.DstOffsetUtils;
import org.im97mori.ble.characteristic.core.TimeZoneUtils;
import org.junit.Test;

public class LocalTimeInformationTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) TimeZoneUtils.TIME_ZONE_IS_NOT_KNOWN;
        data[ 1] = (byte) DstOffsetUtils.DST_OFFSET_IS_NOT_KNOWN;
        //@formatter:on

        LocalTimeInformation result1 = new LocalTimeInformation(data);
        assertEquals(TimeZoneUtils.TIME_ZONE_IS_NOT_KNOWN, result1.getTimeZone());
        assertEquals(DstOffsetUtils.DST_OFFSET_IS_NOT_KNOWN, result1.getDstOffset());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) -48;
        data[ 1] = DstOffsetUtils.DST_OFFSET_STANDARD_TIME;
        //@formatter:on

        LocalTimeInformation result1 = new LocalTimeInformation(data);
        assertEquals(-48, result1.getTimeZone());
        assertEquals(DstOffsetUtils.DST_OFFSET_STANDARD_TIME, result1.getDstOffset());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 56;
        data[ 1] = DstOffsetUtils.DST_OFFSET_HALF_AN_HOUR_DAYLIGHT_TIME;
        //@formatter:on

        LocalTimeInformation result1 = new LocalTimeInformation(data);
        assertEquals(56, result1.getTimeZone());
        assertEquals(DstOffsetUtils.DST_OFFSET_HALF_AN_HOUR_DAYLIGHT_TIME, result1.getDstOffset());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 56;
        data[ 1] = DstOffsetUtils.DST_OFFSET_DAYLIGHT_TIME;
        //@formatter:on

        LocalTimeInformation result1 = new LocalTimeInformation(data);
        assertEquals(56, result1.getTimeZone());
        assertEquals(DstOffsetUtils.DST_OFFSET_DAYLIGHT_TIME, result1.getDstOffset());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 56;
        data[ 1] = DstOffsetUtils.DST_OFFSET_DOUBLE_DAYLIGHT_TIME;
        //@formatter:on

        LocalTimeInformation result1 = new LocalTimeInformation(data);
        assertEquals(56, result1.getTimeZone());
        assertEquals(DstOffsetUtils.DST_OFFSET_DOUBLE_DAYLIGHT_TIME, result1.getDstOffset());
    }

    @Test
    public void test_constructor006() {
        int timeZone = 1;
        int dstOffset = 2;

        LocalTimeInformation result1 = new LocalTimeInformation(timeZone, dstOffset);
        assertEquals(timeZone, result1.getTimeZone());
        assertEquals(dstOffset, result1.getDstOffset());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        LocalTimeInformation result1 = new LocalTimeInformation(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
