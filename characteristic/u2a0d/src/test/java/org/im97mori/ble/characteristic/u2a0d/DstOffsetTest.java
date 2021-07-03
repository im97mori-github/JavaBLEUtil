package org.im97mori.ble.characteristic.u2a0d;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.core.DstOffsetUtils;
import org.junit.Test;

public class DstOffsetTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DstOffsetUtils.DST_OFFSET_STANDARD_TIME;
        //@formatter:on

        DstOffset result1 = new DstOffset(data);
        assertEquals(DstOffsetUtils.DST_OFFSET_STANDARD_TIME, result1.getDstOffset());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DstOffsetUtils.DST_OFFSET_HALF_AN_HOUR_DAYLIGHT_TIME;
        //@formatter:on

        DstOffset result1 = new DstOffset(data);
        assertEquals(DstOffsetUtils.DST_OFFSET_HALF_AN_HOUR_DAYLIGHT_TIME, result1.getDstOffset());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DstOffsetUtils.DST_OFFSET_DAYLIGHT_TIME;
        //@formatter:on

        DstOffset result1 = new DstOffset(data);
        assertEquals(DstOffsetUtils.DST_OFFSET_DAYLIGHT_TIME, result1.getDstOffset());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DstOffsetUtils.DST_OFFSET_DOUBLE_DAYLIGHT_TIME;
        //@formatter:on

        DstOffset result1 = new DstOffset(data);
        assertEquals(DstOffsetUtils.DST_OFFSET_DOUBLE_DAYLIGHT_TIME, result1.getDstOffset());
    }

    @Test
    public void test_constructor_00101() {
        int dstOffset = 1;

        DstOffset result1 = new DstOffset(dstOffset);
        assertEquals(dstOffset, result1.getDstOffset());
    }

    @Test
    public void test_parcelable_00100() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        DstOffset result1 = new DstOffset(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
