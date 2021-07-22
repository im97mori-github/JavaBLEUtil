package org.im97mori.ble.characteristic.u2b04;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.Percentage8Utils;
import org.junit.Test;

public class Percentage8Test {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        Percentage8 result = new Percentage8(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getPercentage8());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x00;
        //@formatter:on

        Percentage8 result = new Percentage8(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getPercentage8());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xc8;
        //@formatter:on

        Percentage8 result = new Percentage8(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getPercentage8());
    }

    @Test
    public void test_constructor_00101() {
        int percentage8 = Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;

        Percentage8 result = new Percentage8(percentage8);
        assertEquals(percentage8, result.getPercentage8());
    }

    @Test
    public void test_constructor_00102() {
        int percentage8 = 0;

        Percentage8 result = new Percentage8(percentage8);
        assertEquals(percentage8, result.getPercentage8());
    }

    @Test
    public void test_constructor_00103() {
        int percentage8 = 200;

        Percentage8 result = new Percentage8(percentage8);
        assertEquals(percentage8, result.getPercentage8());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        Percentage8 result1 = new Percentage8(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x00;
        //@formatter:on

        Percentage8 result1 = new Percentage8(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xc8;
        //@formatter:on

        Percentage8 result1 = new Percentage8(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
