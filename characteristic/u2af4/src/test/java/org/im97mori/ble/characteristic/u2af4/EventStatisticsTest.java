package org.im97mori.ble.characteristic.u2af4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.Count16Utils;
import org.im97mori.ble.characteristic.core.TimeExponential8Utils;
import org.im97mori.ble.characteristic.core.TimeSecond16Utils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class EventStatisticsTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) Count16Utils.COUNT_IS_NOT_KNOWN;
        data[ 1] = (byte) (Count16Utils.COUNT_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_IS_NOT_KNOWN >> 8);
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        data[ 5] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        EventStatistics result = new EventStatistics(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getNumberOfEvents());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getAverageEventDuration());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getTimeElapsedSinceLastEvent());
        assertEquals(BLEUtils.createUInt8(data, 5), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) Count16Utils.COUNT_VALUE_MINIMUM;
        data[ 1] = (byte) (Count16Utils.COUNT_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM;
        data[ 3] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM >> 8);
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        data[ 5] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        EventStatistics result = new EventStatistics(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getNumberOfEvents());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getAverageEventDuration());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getTimeElapsedSinceLastEvent());
        assertEquals(BLEUtils.createUInt8(data, 5), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) Count16Utils.COUNT_VALUE_MAXIMUM;
        data[ 1] = (byte) (Count16Utils.COUNT_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_MAXIMUM;
        data[ 3] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_MAXIMUM >> 8);
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        data[ 5] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        //@formatter:on

        EventStatistics result = new EventStatistics(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getNumberOfEvents());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getAverageEventDuration());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getTimeElapsedSinceLastEvent());
        assertEquals(BLEUtils.createUInt8(data, 5), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        //@formatter:on

        EventStatistics result = new EventStatistics(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getNumberOfEvents());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getAverageEventDuration());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getTimeElapsedSinceLastEvent());
        assertEquals(BLEUtils.createUInt8(data, 5), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00101() {
        int numberOfEvents = Count16Utils.COUNT_IS_NOT_KNOWN;
        int averageEventDuration = TimeSecond16Utils.TIME_SECOND_16_VALUE_IS_NOT_KNOWN;
        int timeElapsedSinceLastEvent = TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;

        EventStatistics result = new EventStatistics(numberOfEvents, averageEventDuration, timeElapsedSinceLastEvent, sensingDuration);
        assertEquals(numberOfEvents, result.getNumberOfEvents());
        assertEquals(averageEventDuration, result.getAverageEventDuration());
        assertEquals(timeElapsedSinceLastEvent, result.getTimeElapsedSinceLastEvent());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00102() {
        int numberOfEvents = Count16Utils.COUNT_VALUE_MINIMUM;
        int averageEventDuration = TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM;
        int timeElapsedSinceLastEvent = TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;

        EventStatistics result = new EventStatistics(numberOfEvents, averageEventDuration, timeElapsedSinceLastEvent, sensingDuration);
        assertEquals(numberOfEvents, result.getNumberOfEvents());
        assertEquals(averageEventDuration, result.getAverageEventDuration());
        assertEquals(timeElapsedSinceLastEvent, result.getTimeElapsedSinceLastEvent());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00103() {
        int numberOfEvents = Count16Utils.COUNT_VALUE_MAXIMUM;
        int averageEventDuration = TimeSecond16Utils.TIME_SECOND_16_VALUE_MAXIMUM;
        int timeElapsedSinceLastEvent = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;

        EventStatistics result = new EventStatistics(numberOfEvents, averageEventDuration, timeElapsedSinceLastEvent, sensingDuration);
        assertEquals(numberOfEvents, result.getNumberOfEvents());
        assertEquals(averageEventDuration, result.getAverageEventDuration());
        assertEquals(timeElapsedSinceLastEvent, result.getTimeElapsedSinceLastEvent());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00104() {
        int numberOfEvents = 1;
        int averageEventDuration = 2;
        int timeElapsedSinceLastEvent = 3;
        int sensingDuration = 4;

        EventStatistics result = new EventStatistics(numberOfEvents, averageEventDuration, timeElapsedSinceLastEvent, sensingDuration);
        assertEquals(numberOfEvents, result.getNumberOfEvents());
        assertEquals(averageEventDuration, result.getAverageEventDuration());
        assertEquals(timeElapsedSinceLastEvent, result.getTimeElapsedSinceLastEvent());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) Count16Utils.COUNT_IS_NOT_KNOWN;
        data[ 1] = (byte) (Count16Utils.COUNT_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_IS_NOT_KNOWN >> 8);
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        data[ 5] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        EventStatistics result1 = new EventStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) Count16Utils.COUNT_VALUE_MINIMUM;
        data[ 1] = (byte) (Count16Utils.COUNT_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM;
        data[ 3] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM >> 8);
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        data[ 5] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        EventStatistics result1 = new EventStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) Count16Utils.COUNT_VALUE_MAXIMUM;
        data[ 1] = (byte) (Count16Utils.COUNT_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_MAXIMUM;
        data[ 3] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_MAXIMUM >> 8);
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        data[ 5] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        //@formatter:on

        EventStatistics result1 = new EventStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        //@formatter:on

        EventStatistics result1 = new EventStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
