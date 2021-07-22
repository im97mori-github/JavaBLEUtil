package org.im97mori.ble.characteristic.u2b01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

public class LuminousIntensityTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousIntensity.LUMINOUS_INTENSITY_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (LuminousIntensity.LUMINOUS_INTENSITY_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        LuminousIntensity result = new LuminousIntensity(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousIntensity());
        assertTrue(result.isLuminousFluxValueIsNotKnown());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousIntensity.LUMINOUS_INTENSITY_VALUE_MINIMUM;
        data[ 1] = (byte) (LuminousIntensity.LUMINOUS_INTENSITY_VALUE_MINIMUM >> 8);
        //@formatter:on

        LuminousIntensity result = new LuminousIntensity(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousIntensity());
        assertFalse(result.isLuminousFluxValueIsNotKnown());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousIntensity.LUMINOUS_INTENSITY_VALUE_MAXIMUM;
        data[ 1] = (byte) (LuminousIntensity.LUMINOUS_INTENSITY_VALUE_MAXIMUM >> 8);
        //@formatter:on

        LuminousIntensity result = new LuminousIntensity(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousIntensity());
        assertFalse(result.isLuminousFluxValueIsNotKnown());
    }

    @Test
    public void test_constructor_00101() {
        int luminousIntensity = LuminousIntensity.LUMINOUS_INTENSITY_VALUE_IS_NOT_KNOWN;

        LuminousIntensity result = new LuminousIntensity(luminousIntensity);
        assertEquals(luminousIntensity, result.getLuminousIntensity());
        assertTrue(result.isLuminousFluxValueIsNotKnown());
    }

    @Test
    public void test_constructor_00102() {
        int luminousIntensity = LuminousIntensity.LUMINOUS_INTENSITY_VALUE_MINIMUM;

        LuminousIntensity result = new LuminousIntensity(luminousIntensity);
        assertEquals(luminousIntensity, result.getLuminousIntensity());
        assertFalse(result.isLuminousFluxValueIsNotKnown());
    }

    @Test
    public void test_constructor_00103() {
        int luminousIntensity = LuminousIntensity.LUMINOUS_INTENSITY_VALUE_MAXIMUM;

        LuminousIntensity result = new LuminousIntensity(luminousIntensity);
        assertEquals(luminousIntensity, result.getLuminousIntensity());
        assertFalse(result.isLuminousFluxValueIsNotKnown());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousIntensity.LUMINOUS_INTENSITY_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (LuminousIntensity.LUMINOUS_INTENSITY_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        LuminousIntensity result1 = new LuminousIntensity(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousIntensity.LUMINOUS_INTENSITY_VALUE_MINIMUM;
        data[ 1] = (byte) (LuminousIntensity.LUMINOUS_INTENSITY_VALUE_MINIMUM >> 8);
        //@formatter:on

        LuminousIntensity result1 = new LuminousIntensity(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousIntensity.LUMINOUS_INTENSITY_VALUE_MAXIMUM;
        data[ 1] = (byte) (LuminousIntensity.LUMINOUS_INTENSITY_VALUE_MAXIMUM >> 8);
        //@formatter:on

        LuminousIntensity result1 = new LuminousIntensity(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
