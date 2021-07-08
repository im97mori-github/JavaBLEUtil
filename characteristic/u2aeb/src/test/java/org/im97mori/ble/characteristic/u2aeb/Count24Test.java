package org.im97mori.ble.characteristic.u2aeb;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

public class Count24Test {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Count24.COUNT_IS_NOT_KNOWN;
        data[ 1] = (byte) (Count24.COUNT_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (Count24.COUNT_IS_NOT_KNOWN >> 16);
        //@formatter:on

        Count24 result = new Count24(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getCount());
        assertTrue(result.isCountValueIsNotKnown());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Count24.COUNT_VALUE_MINIMUM;
        data[ 1] = (byte) (Count24.COUNT_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) (Count24.COUNT_VALUE_MINIMUM >> 16);
        //@formatter:on

        Count24 result = new Count24(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getCount());
        assertFalse(result.isCountValueIsNotKnown());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Count24.COUNT_VALUE_MAXIMUM;
        data[ 1] = (byte) (Count24.COUNT_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) (Count24.COUNT_VALUE_MAXIMUM >> 16);
        //@formatter:on

        Count24 result = new Count24(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getCount());
        assertFalse(result.isCountValueIsNotKnown());
    }

    @Test
    public void test_constructor_00101() {
        int count = Count24.COUNT_IS_NOT_KNOWN;

        Count24 result = new Count24(count);
        assertEquals(count, result.getCount());
        assertTrue(result.isCountValueIsNotKnown());
    }

    @Test
    public void test_constructor_00102() {
        int count = Count24.COUNT_VALUE_MINIMUM;

        Count24 result = new Count24(count);
        assertEquals(count, result.getCount());
        assertFalse(result.isCountValueIsNotKnown());
    }

    @Test
    public void test_constructor_00103() {
        int count = Count24.COUNT_VALUE_MAXIMUM;

        Count24 result = new Count24(count);
        assertEquals(count, result.getCount());
        assertFalse(result.isCountValueIsNotKnown());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Count24.COUNT_IS_NOT_KNOWN;
        data[ 1] = (byte) (Count24.COUNT_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (Count24.COUNT_IS_NOT_KNOWN >> 16);
        //@formatter:on

        Count24 result1 = new Count24(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Count24.COUNT_VALUE_MINIMUM;
        data[ 1] = (byte) (Count24.COUNT_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) (Count24.COUNT_VALUE_MINIMUM >> 16);
        //@formatter:on

        Count24 result1 = new Count24(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Count24.COUNT_VALUE_MAXIMUM;
        data[ 1] = (byte) (Count24.COUNT_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) (Count24.COUNT_VALUE_MAXIMUM >> 16);
        //@formatter:on

        Count24 result1 = new Count24(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
