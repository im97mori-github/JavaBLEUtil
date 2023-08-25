package org.im97mori.ble.characteristic.u2aa3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class BarometricPressureTrendTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_UNKNOWN;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[1];
        data[ 0] = BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_CONTINUOUSLY_FALLING;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[1];
        data[ 0] = BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_CONTINUOUSLY_RISING;
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[1];
        data[ 0] = BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_FALLING_THEN_STEADY;
        data_00004 = data;
    }

    private static final byte[] data_00005;
    static {
        byte[] data = new byte[1];
        data[ 0] = BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_RISING_THEN_STEADY;
        data_00005 = data;
    }

    private static final byte[] data_00006;
    static {
        byte[] data = new byte[1];
        data[ 0] = BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_FALLING_BEFORE_A_LESSER_RISE;
        data_00006 = data;
    }

    private static final byte[] data_00007;
    static {
        byte[] data = new byte[1];
        data[ 0] = BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_FALLING_BEFORE_A_GREATER_RISE;
        data_00007 = data;
    }

    private static final byte[] data_00008;
    static {
        byte[] data = new byte[1];
        data[ 0] = BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_RISING_BEFORE_A_GREATER_FALL;
        data_00008 = data;
    }

    private static final byte[] data_00009;
    static {
        byte[] data = new byte[1];
        data[ 0] = BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_RISING_BEFORE_A_LESSER_FALL;
        data_00009 = data;
    }

    private static final byte[] data_00010;
    static {
        byte[] data = new byte[1];
        data[ 0] = BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_STEADY;
        data_00010 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertEquals(BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_UNKNOWN, result1.getBarometricPressureTrend());
        assertTrue(result1.isBarometricPressureTrendUnknown());
        assertFalse(result1.isBarometricPressureTrendContinuouslyFalling());
        assertFalse(result1.isBarometricPressureTrendContinuouslyRising());
        assertFalse(result1.isBarometricPressureTrendFallingThenSteady());
        assertFalse(result1.isBarometricPressureTrendRisingThenSteady());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeALesserRise());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeAGreaterRise());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeAGreaterFall());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeALesserFall());
        assertFalse(result1.isBarometricPressureTrendSteady());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertEquals(BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_CONTINUOUSLY_FALLING, result1.getBarometricPressureTrend());
        assertFalse(result1.isBarometricPressureTrendUnknown());
        assertTrue(result1.isBarometricPressureTrendContinuouslyFalling());
        assertFalse(result1.isBarometricPressureTrendContinuouslyRising());
        assertFalse(result1.isBarometricPressureTrendFallingThenSteady());
        assertFalse(result1.isBarometricPressureTrendRisingThenSteady());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeALesserRise());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeAGreaterRise());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeAGreaterFall());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeALesserFall());
        assertFalse(result1.isBarometricPressureTrendSteady());
    }

    @Test
    public void test_constructor_00003() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertEquals(BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_CONTINUOUSLY_RISING, result1.getBarometricPressureTrend());
        assertFalse(result1.isBarometricPressureTrendUnknown());
        assertFalse(result1.isBarometricPressureTrendContinuouslyFalling());
        assertTrue(result1.isBarometricPressureTrendContinuouslyRising());
        assertFalse(result1.isBarometricPressureTrendFallingThenSteady());
        assertFalse(result1.isBarometricPressureTrendRisingThenSteady());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeALesserRise());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeAGreaterRise());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeAGreaterFall());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeALesserFall());
        assertFalse(result1.isBarometricPressureTrendSteady());
    }

    @Test
    public void test_constructor_00004() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertEquals(BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_FALLING_THEN_STEADY, result1.getBarometricPressureTrend());
        assertFalse(result1.isBarometricPressureTrendUnknown());
        assertFalse(result1.isBarometricPressureTrendContinuouslyFalling());
        assertFalse(result1.isBarometricPressureTrendContinuouslyRising());
        assertTrue(result1.isBarometricPressureTrendFallingThenSteady());
        assertFalse(result1.isBarometricPressureTrendRisingThenSteady());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeALesserRise());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeAGreaterRise());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeAGreaterFall());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeALesserFall());
        assertFalse(result1.isBarometricPressureTrendSteady());
    }

    @Test
    public void test_constructor_00005() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertEquals(BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_RISING_THEN_STEADY, result1.getBarometricPressureTrend());
        assertFalse(result1.isBarometricPressureTrendUnknown());
        assertFalse(result1.isBarometricPressureTrendContinuouslyFalling());
        assertFalse(result1.isBarometricPressureTrendContinuouslyRising());
        assertFalse(result1.isBarometricPressureTrendFallingThenSteady());
        assertTrue(result1.isBarometricPressureTrendRisingThenSteady());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeALesserRise());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeAGreaterRise());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeAGreaterFall());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeALesserFall());
        assertFalse(result1.isBarometricPressureTrendSteady());
    }

    @Test
    public void test_constructor_00006() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertEquals(BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_FALLING_BEFORE_A_LESSER_RISE, result1.getBarometricPressureTrend());
        assertFalse(result1.isBarometricPressureTrendUnknown());
        assertFalse(result1.isBarometricPressureTrendContinuouslyFalling());
        assertFalse(result1.isBarometricPressureTrendContinuouslyRising());
        assertFalse(result1.isBarometricPressureTrendFallingThenSteady());
        assertFalse(result1.isBarometricPressureTrendRisingThenSteady());
        assertTrue(result1.isBarometricPressureTrendFallingBeforeALesserRise());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeAGreaterRise());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeAGreaterFall());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeALesserFall());
        assertFalse(result1.isBarometricPressureTrendSteady());
    }

    @Test
    public void test_constructor_00007() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertEquals(BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_FALLING_BEFORE_A_GREATER_RISE, result1.getBarometricPressureTrend());
        assertFalse(result1.isBarometricPressureTrendUnknown());
        assertFalse(result1.isBarometricPressureTrendContinuouslyFalling());
        assertFalse(result1.isBarometricPressureTrendContinuouslyRising());
        assertFalse(result1.isBarometricPressureTrendFallingThenSteady());
        assertFalse(result1.isBarometricPressureTrendRisingThenSteady());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeALesserRise());
        assertTrue(result1.isBarometricPressureTrendFallingBeforeAGreaterRise());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeAGreaterFall());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeALesserFall());
        assertFalse(result1.isBarometricPressureTrendSteady());
    }

    @Test
    public void test_constructor_00008() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertEquals(BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_RISING_BEFORE_A_GREATER_FALL, result1.getBarometricPressureTrend());
        assertFalse(result1.isBarometricPressureTrendUnknown());
        assertFalse(result1.isBarometricPressureTrendContinuouslyFalling());
        assertFalse(result1.isBarometricPressureTrendContinuouslyRising());
        assertFalse(result1.isBarometricPressureTrendFallingThenSteady());
        assertFalse(result1.isBarometricPressureTrendRisingThenSteady());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeALesserRise());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeAGreaterRise());
        assertTrue(result1.isBarometricPressureTrendRisingBeforeAGreaterFall());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeALesserFall());
        assertFalse(result1.isBarometricPressureTrendSteady());
    }

    @Test
    public void test_constructor_00009() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertEquals(BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_RISING_BEFORE_A_LESSER_FALL, result1.getBarometricPressureTrend());
        assertFalse(result1.isBarometricPressureTrendUnknown());
        assertFalse(result1.isBarometricPressureTrendContinuouslyFalling());
        assertFalse(result1.isBarometricPressureTrendContinuouslyRising());
        assertFalse(result1.isBarometricPressureTrendFallingThenSteady());
        assertFalse(result1.isBarometricPressureTrendRisingThenSteady());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeALesserRise());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeAGreaterRise());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeAGreaterFall());
        assertTrue(result1.isBarometricPressureTrendRisingBeforeALesserFall());
        assertFalse(result1.isBarometricPressureTrendSteady());
    }

    @Test
    public void test_constructor_00010() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertEquals(BarometricPressureTrend.BAROMETRIC_PRESSURE_TREND_STEADY, result1.getBarometricPressureTrend());
        assertFalse(result1.isBarometricPressureTrendUnknown());
        assertFalse(result1.isBarometricPressureTrendContinuouslyFalling());
        assertFalse(result1.isBarometricPressureTrendContinuouslyRising());
        assertFalse(result1.isBarometricPressureTrendFallingThenSteady());
        assertFalse(result1.isBarometricPressureTrendRisingThenSteady());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeALesserRise());
        assertFalse(result1.isBarometricPressureTrendFallingBeforeAGreaterRise());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeAGreaterFall());
        assertFalse(result1.isBarometricPressureTrendRisingBeforeALesserFall());
        assertTrue(result1.isBarometricPressureTrendSteady());
    }

    @Test
    public void test_constructor_00011() {
        int barometricPressureTrend = 1;

        BarometricPressureTrend result1 = new BarometricPressureTrend(barometricPressureTrend);
        assertEquals(barometricPressureTrend, result1.getBarometricPressureTrend());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00004() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00005() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00006() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00007() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00008() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00009() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00010() {
        byte[] data = getData();

        BarometricPressureTrend result1 = new BarometricPressureTrend(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
