package org.im97mori.ble.characteristic.u2b00;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.LuminousFluxUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class LuminousFluxRangeTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        LuminousFluxRange result = new LuminousFluxRange(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMinimumLuminousFlux());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getMaximumLuminousFlux());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM;
        data[ 3] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM >> 8);
        //@formatter:on

        LuminousFluxRange result = new LuminousFluxRange(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMinimumLuminousFlux());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getMaximumLuminousFlux());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM;
        data[ 3] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM >> 8);
        //@formatter:on

        LuminousFluxRange result = new LuminousFluxRange(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMinimumLuminousFlux());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getMaximumLuminousFlux());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        LuminousFluxRange result = new LuminousFluxRange(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMinimumLuminousFlux());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getMaximumLuminousFlux());
    }

    @Test
    public void test_constructor_00101() {
        int minimumLuminousFlux = LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN;
        int maximumLuminousFlux = LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN;

        LuminousFluxRange result = new LuminousFluxRange(minimumLuminousFlux, maximumLuminousFlux);
        assertEquals(minimumLuminousFlux, result.getMinimumLuminousFlux());
        assertEquals(maximumLuminousFlux, result.getMaximumLuminousFlux());
    }

    @Test
    public void test_constructor_00102() {
        int minimumLuminousFlux = LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM;
        int maximumLuminousFlux = LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM;

        LuminousFluxRange result = new LuminousFluxRange(minimumLuminousFlux, maximumLuminousFlux);
        assertEquals(minimumLuminousFlux, result.getMinimumLuminousFlux());
        assertEquals(maximumLuminousFlux, result.getMaximumLuminousFlux());
    }

    @Test
    public void test_constructor_00103() {
        int minimumLuminousFlux = LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM;
        int maximumLuminousFlux = LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM;

        LuminousFluxRange result = new LuminousFluxRange(minimumLuminousFlux, maximumLuminousFlux);
        assertEquals(minimumLuminousFlux, result.getMinimumLuminousFlux());
        assertEquals(maximumLuminousFlux, result.getMaximumLuminousFlux());
    }

    @Test
    public void test_constructor_00104() {
        int minimumLuminousFlux = 1;
        int maximumLuminousFlux = 2;

        LuminousFluxRange result = new LuminousFluxRange(minimumLuminousFlux, maximumLuminousFlux);
        assertEquals(minimumLuminousFlux, result.getMinimumLuminousFlux());
        assertEquals(maximumLuminousFlux, result.getMaximumLuminousFlux());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        LuminousFluxRange result1 = new LuminousFluxRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM;
        data[ 3] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM >> 8);
        //@formatter:on

        LuminousFluxRange result1 = new LuminousFluxRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM;
        data[ 3] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM >> 8);
        //@formatter:on

        LuminousFluxRange result1 = new LuminousFluxRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        LuminousFluxRange result1 = new LuminousFluxRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
