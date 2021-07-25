package org.im97mori.ble.characteristic.u2b0b;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.Percentage8Utils;
import org.im97mori.ble.characteristic.core.TimeDecihour8Utils;
import org.junit.Test;

public class RelativeValueInAPeriodOfDayTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        data[ 2] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        RelativeValueInAPeriodOfDay result = new RelativeValueInAPeriodOfDay(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getEndTime());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        //@formatter:on

        RelativeValueInAPeriodOfDay result = new RelativeValueInAPeriodOfDay(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getEndTime());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 200;
        data[ 1] = (byte) 240;
        data[ 2] = (byte) 240;
        //@formatter:on

        RelativeValueInAPeriodOfDay result = new RelativeValueInAPeriodOfDay(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getEndTime());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

        RelativeValueInAPeriodOfDay result = new RelativeValueInAPeriodOfDay(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getEndTime());
    }

    @Test
    public void test_constructor_00101() {
        int relativeValue = Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        int startTime = TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        int endTime = TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;

        RelativeValueInAPeriodOfDay result = new RelativeValueInAPeriodOfDay(relativeValue, startTime, endTime);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_constructor_00102() {
        int relativeValue = 0;
        int startTime = 0;
        int endTime = 0;

        RelativeValueInAPeriodOfDay result = new RelativeValueInAPeriodOfDay(relativeValue, startTime, endTime);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_constructor_00103() {
        int relativeValue = 200;
        int startTime = 240;
        int endTime = 240;

        RelativeValueInAPeriodOfDay result = new RelativeValueInAPeriodOfDay(relativeValue, startTime, endTime);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_constructor_00104() {
        int relativeValue = 1;
        int startTime = 2;
        int endTime = 3;

        RelativeValueInAPeriodOfDay result = new RelativeValueInAPeriodOfDay(relativeValue, startTime, endTime);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        data[ 2] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        RelativeValueInAPeriodOfDay result1 = new RelativeValueInAPeriodOfDay(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        //@formatter:on

        RelativeValueInAPeriodOfDay result1 = new RelativeValueInAPeriodOfDay(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 200;
        data[ 1] = (byte) 240;
        data[ 2] = (byte) 240;
        //@formatter:on

        RelativeValueInAPeriodOfDay result1 = new RelativeValueInAPeriodOfDay(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

        RelativeValueInAPeriodOfDay result1 = new RelativeValueInAPeriodOfDay(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
