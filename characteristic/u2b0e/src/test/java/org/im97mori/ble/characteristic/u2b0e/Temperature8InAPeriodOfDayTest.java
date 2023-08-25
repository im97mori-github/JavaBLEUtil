package org.im97mori.ble.characteristic.u2b0e;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.Percentage8Utils;
import org.im97mori.ble.characteristic.core.Temperature8Utils;
import org.im97mori.ble.characteristic.core.TimeDecihour8Utils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class Temperature8InAPeriodOfDayTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        data[ 2] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        Temperature8InAPeriodOfDay result = new Temperature8InAPeriodOfDay(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getTemperature());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getEndTime());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = -128;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        //@formatter:on

        Temperature8InAPeriodOfDay result = new Temperature8InAPeriodOfDay(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getTemperature());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getEndTime());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 126;
        data[ 1] = (byte) 240;
        data[ 2] = (byte) 240;
        //@formatter:on

        Temperature8InAPeriodOfDay result = new Temperature8InAPeriodOfDay(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getTemperature());
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

        Temperature8InAPeriodOfDay result = new Temperature8InAPeriodOfDay(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getTemperature());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getEndTime());
    }

    @Test
    public void test_constructor_00101() {
        int relativeValue = Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        int startTime = TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        int endTime = TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;

        Temperature8InAPeriodOfDay result = new Temperature8InAPeriodOfDay(relativeValue, startTime, endTime);
        assertEquals(relativeValue, result.getTemperature());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_constructor_00102() {
        int relativeValue = -128;
        int startTime = 0;
        int endTime = 0;

        Temperature8InAPeriodOfDay result = new Temperature8InAPeriodOfDay(relativeValue, startTime, endTime);
        assertEquals(relativeValue, result.getTemperature());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_constructor_00103() {
        int relativeValue = 126;
        int startTime = 240;
        int endTime = 240;

        Temperature8InAPeriodOfDay result = new Temperature8InAPeriodOfDay(relativeValue, startTime, endTime);
        assertEquals(relativeValue, result.getTemperature());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_constructor_00104() {
        int relativeValue = 1;
        int startTime = 2;
        int endTime = 3;

        Temperature8InAPeriodOfDay result = new Temperature8InAPeriodOfDay(relativeValue, startTime, endTime);
        assertEquals(relativeValue, result.getTemperature());
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

        Temperature8InAPeriodOfDay result1 = new Temperature8InAPeriodOfDay(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = -128;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        //@formatter:on

        Temperature8InAPeriodOfDay result1 = new Temperature8InAPeriodOfDay(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 126;
        data[ 1] = (byte) 240;
        data[ 2] = (byte) 240;
        //@formatter:on

        Temperature8InAPeriodOfDay result1 = new Temperature8InAPeriodOfDay(data);
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

        Temperature8InAPeriodOfDay result1 = new Temperature8InAPeriodOfDay(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
