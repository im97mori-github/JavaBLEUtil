package org.im97mori.ble.characteristic.u2afe;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

public class LuminousExposureTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) LuminousExposure.LUMINOUS_EXPOSURE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        LuminousExposure result = new LuminousExposure(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getLuminousExposure());
        assertTrue(result.isLuminousExposureValueIsNotKnown());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MINIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT);
        data[ 1] = (byte) (((int) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MINIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT)) >> 8);
        data[ 2] = (byte) (((int) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MINIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT)) >> 16);
        //@formatter:on

        LuminousExposure result = new LuminousExposure(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getLuminousExposure());
        assertFalse(result.isLuminousExposureValueIsNotKnown());
        assertEquals(BLEUtils.createUInt24(data, 0) * LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT, result.getLuminousExposureLumenHour(), 0);
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MAXIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT);
        data[ 1] = (byte) (((int) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MAXIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT)) >> 8);
        data[ 2] = (byte) (((int) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MAXIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT)) >> 16);
        //@formatter:on

        LuminousExposure result = new LuminousExposure(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getLuminousExposure());
        assertFalse(result.isLuminousExposureValueIsNotKnown());
        assertEquals(BLEUtils.createUInt24(data, 0) * LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT, result.getLuminousExposureLumenHour(), 0);
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 1;
        data[ 1] = (byte) (1 >> 8);
        data[ 2] = (byte) (1 >> 16);
        //@formatter:on

        LuminousExposure result = new LuminousExposure(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getLuminousExposure());
        assertFalse(result.isLuminousExposureValueIsNotKnown());
        assertEquals(BLEUtils.createUInt24(data, 0) * LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT, result.getLuminousExposureLumenHour(), 0);
    }

    @Test
    public void test_constructor_00005() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 16777213;
        data[ 1] = (byte) (16777213 >> 8);
        data[ 2] = (byte) (16777213 >> 16);
        //@formatter:on

        LuminousExposure result = new LuminousExposure(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getLuminousExposure());
        assertFalse(result.isLuminousExposureValueIsNotKnown());
        assertEquals(BLEUtils.createUInt24(data, 0) * LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT, result.getLuminousExposureLumenHour(), 0);
    }

    @Test
    public void test_constructor_00101() {
        int luminousExposure = LuminousExposure.LUMINOUS_EXPOSURE_VALUE_IS_NOT_KNOWN;

        LuminousExposure result = new LuminousExposure(luminousExposure);
        assertEquals(luminousExposure, result.getLuminousExposure());
        assertTrue(result.isLuminousExposureValueIsNotKnown());
    }

    @Test
    public void test_constructor_00102() {
        int luminousExposure = (int) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MINIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT);

        LuminousExposure result = new LuminousExposure(luminousExposure);
        assertEquals(luminousExposure, result.getLuminousExposure());
        assertFalse(result.isLuminousExposureValueIsNotKnown());
        assertEquals(luminousExposure * LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT, result.getLuminousExposureLumenHour(), 0);
    }

    @Test
    public void test_constructor_00103() {
        int luminousExposure = (int) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MAXIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT);

        LuminousExposure result = new LuminousExposure(luminousExposure);
        assertEquals(luminousExposure, result.getLuminousExposure());
        assertFalse(result.isLuminousExposureValueIsNotKnown());
        assertEquals(luminousExposure * LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT, result.getLuminousExposureLumenHour(), 0);
    }

    @Test
    public void test_constructor_00104() {
        int luminousExposure = 16777216;

        LuminousExposure result = new LuminousExposure(luminousExposure);
        assertEquals(luminousExposure, result.getLuminousExposure());
        assertFalse(result.isLuminousExposureValueIsNotKnown());
        assertEquals(LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MAXIMUM, result.getLuminousExposureLumenHour(), 0);
    }

    @Test
    public void test_constructor_00105() {
        int luminousExposure = 1;

        LuminousExposure result = new LuminousExposure(luminousExposure);
        assertEquals(luminousExposure, result.getLuminousExposure());
        assertFalse(result.isLuminousExposureValueIsNotKnown());
        assertEquals(luminousExposure * LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT, result.getLuminousExposureLumenHour(), 0);
    }

    @Test
    public void test_constructor_00106() {
        int luminousExposure = 16777213;

        LuminousExposure result = new LuminousExposure(luminousExposure);
        assertEquals(luminousExposure, result.getLuminousExposure());
        assertFalse(result.isLuminousExposureValueIsNotKnown());
        assertEquals(luminousExposure * LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT, result.getLuminousExposureLumenHour(), 0);
    }

    @Test
    public void test_constructor_00107() {
        int luminousExposure = -1;

        LuminousExposure result = new LuminousExposure(luminousExposure);
        assertEquals(luminousExposure, result.getLuminousExposure());
        assertFalse(result.isLuminousExposureValueIsNotKnown());
        assertEquals(LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MINIMUM, result.getLuminousExposureLumenHour(), 0);
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) LuminousExposure.LUMINOUS_EXPOSURE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        LuminousExposure result1 = new LuminousExposure(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MINIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT);
        data[ 1] = (byte) (((int) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MINIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT)) >> 8);
        data[ 2] = (byte) (((int) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MINIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT)) >> 16);
        //@formatter:on

        LuminousExposure result1 = new LuminousExposure(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MAXIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT);
        data[ 1] = (byte) (((int) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MAXIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT)) >> 8);
        data[ 2] = (byte) (((int) (LuminousExposure.LUMINOUS_EXPOSURE_VALUE_MAXIMUM / LuminousExposure.LUMINOUS_EXPOSURE_VALUE_UNIT)) >> 16);
        //@formatter:on

        LuminousExposure result1 = new LuminousExposure(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 1;
        data[ 1] = (byte) (1 >> 8);
        data[ 2] = (byte) (1 >> 16);
        //@formatter:on

        LuminousExposure result1 = new LuminousExposure(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00105() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 16777213;
        data[ 1] = (byte) (16777213 >> 8);
        data[ 2] = (byte) (16777213 >> 16);
        //@formatter:on

        LuminousExposure result1 = new LuminousExposure(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
