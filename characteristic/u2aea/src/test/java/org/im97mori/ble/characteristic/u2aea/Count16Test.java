package org.im97mori.ble.characteristic.u2aea;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.Count16Utils;
import org.junit.Test;

public class Count16Test {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) Count16Utils.COUNT_IS_NOT_KNOWN;
        data[ 1] = (byte) (Count16Utils.COUNT_IS_NOT_KNOWN >> 8);
        //@formatter:on

        Count16 result = new Count16(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getCount());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) Count16Utils.COUNT_VALUE_MINIMUM;
        data[ 1] = (byte) (Count16Utils.COUNT_VALUE_MINIMUM >> 8);
        //@formatter:on

        Count16 result = new Count16(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getCount());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) Count16Utils.COUNT_VALUE_MAXIMUM;
        data[ 1] = (byte) (Count16Utils.COUNT_VALUE_MAXIMUM >> 8);
        //@formatter:on

        Count16 result = new Count16(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getCount());
    }

    @Test
    public void test_constructor_00101() {
        int count = Count16Utils.COUNT_IS_NOT_KNOWN;

        Count16 result = new Count16(count);
        assertEquals(count, result.getCount());
    }

    @Test
    public void test_constructor_00102() {
        int count = Count16Utils.COUNT_VALUE_MINIMUM;

        Count16 result = new Count16(count);
        assertEquals(count, result.getCount());
    }

    @Test
    public void test_constructor_00103() {
        int count = Count16Utils.COUNT_VALUE_MAXIMUM;

        Count16 result = new Count16(count);
        assertEquals(count, result.getCount());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) Count16Utils.COUNT_IS_NOT_KNOWN;
        data[ 1] = (byte) (Count16Utils.COUNT_IS_NOT_KNOWN >> 8);
        //@formatter:on

        Count16 result1 = new Count16(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) Count16Utils.COUNT_VALUE_MINIMUM;
        data[ 1] = (byte) (Count16Utils.COUNT_VALUE_MINIMUM >> 8);
        //@formatter:on

        Count16 result1 = new Count16(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) Count16Utils.COUNT_VALUE_MAXIMUM;
        data[ 1] = (byte) (Count16Utils.COUNT_VALUE_MAXIMUM >> 8);
        //@formatter:on

        Count16 result1 = new Count16(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
