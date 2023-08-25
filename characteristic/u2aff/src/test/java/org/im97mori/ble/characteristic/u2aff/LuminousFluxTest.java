package org.im97mori.ble.characteristic.u2aff;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.LuminousFluxUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class LuminousFluxTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        LuminousFlux result = new LuminousFlux(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousFlux());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM >> 8);
        //@formatter:on

        LuminousFlux result = new LuminousFlux(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousFlux());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM >> 8);
        //@formatter:on

        LuminousFlux result = new LuminousFlux(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousFlux());
    }

    @Test
    public void test_constructor_00101() {
        int luminousFlux = LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN;

        LuminousFlux result = new LuminousFlux(luminousFlux);
        assertEquals(luminousFlux, result.getLuminousFlux());
    }

    @Test
    public void test_constructor_00102() {
        int luminousFlux = LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM;

        LuminousFlux result = new LuminousFlux(luminousFlux);
        assertEquals(luminousFlux, result.getLuminousFlux());
    }

    @Test
    public void test_constructor_00103() {
        int luminousFlux = LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM;

        LuminousFlux result = new LuminousFlux(luminousFlux);
        assertEquals(luminousFlux, result.getLuminousFlux());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        LuminousFlux result1 = new LuminousFlux(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MINIMUM >> 8);
        //@formatter:on

        LuminousFlux result1 = new LuminousFlux(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM;
        data[ 1] = (byte) (LuminousFluxUtils.LUMINOUS_FLUX_VALUE_MAXIMUM >> 8);
        //@formatter:on

        LuminousFlux result1 = new LuminousFlux(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
