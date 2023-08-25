package org.im97mori.ble.characteristic.u2a0e;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.core.TimeZoneUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class TimeZoneTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = TimeZoneUtils.TIME_ZONE_IS_NOT_KNOWN;
        //@formatter:on

        TimeZone result1 = new TimeZone(data);
        assertEquals(TimeZoneUtils.TIME_ZONE_IS_NOT_KNOWN, result1.getTimeZone());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = -48;
        //@formatter:on

        TimeZone result1 = new TimeZone(data);
        assertEquals(-48, result1.getTimeZone());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 56;
        //@formatter:on

        TimeZone result1 = new TimeZone(data);
        assertEquals(56, result1.getTimeZone());
    }

    @Test
    public void test_constructor_00101() {
        int timeZone = 1;

        TimeZone result1 = new TimeZone(timeZone);
        assertEquals(timeZone, result1.getTimeZone());
    }

    @Test
    public void test_parcelable_00100() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        TimeZone result1 = new TimeZone(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
