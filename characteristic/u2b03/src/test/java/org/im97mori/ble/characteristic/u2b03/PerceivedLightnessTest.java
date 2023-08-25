package org.im97mori.ble.characteristic.u2b03;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class PerceivedLightnessTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) PerceivedLightness.PERCEIVED_LIGHTNESS_VALUE_MINIMUM;
        data[ 1] = (byte) (PerceivedLightness.PERCEIVED_LIGHTNESS_VALUE_MINIMUM >> 8);
        //@formatter:on

        PerceivedLightness result = new PerceivedLightness(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getPerceivedLightness());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) PerceivedLightness.PERCEIVED_LIGHTNESS_VALUE_MAXIMUM;
        data[ 1] = (byte) (PerceivedLightness.PERCEIVED_LIGHTNESS_VALUE_MAXIMUM >> 8);
        //@formatter:on

        PerceivedLightness result = new PerceivedLightness(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getPerceivedLightness());
    }

    @Test
    public void test_constructor_00101() {
        int luminousIntensity = PerceivedLightness.PERCEIVED_LIGHTNESS_VALUE_MINIMUM;

        PerceivedLightness result = new PerceivedLightness(luminousIntensity);
        assertEquals(luminousIntensity, result.getPerceivedLightness());
    }

    @Test
    public void test_constructor_00102() {
        int luminousIntensity = PerceivedLightness.PERCEIVED_LIGHTNESS_VALUE_MAXIMUM;

        PerceivedLightness result = new PerceivedLightness(luminousIntensity);
        assertEquals(luminousIntensity, result.getPerceivedLightness());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) PerceivedLightness.PERCEIVED_LIGHTNESS_VALUE_MINIMUM;
        data[ 1] = (byte) (PerceivedLightness.PERCEIVED_LIGHTNESS_VALUE_MINIMUM >> 8);
        //@formatter:on

        PerceivedLightness result1 = new PerceivedLightness(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) PerceivedLightness.PERCEIVED_LIGHTNESS_VALUE_MAXIMUM;
        data[ 1] = (byte) (PerceivedLightness.PERCEIVED_LIGHTNESS_VALUE_MAXIMUM >> 8);
        //@formatter:on

        PerceivedLightness result1 = new PerceivedLightness(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
