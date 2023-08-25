package org.im97mori.ble.characteristic.u2afb;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.IlluminanceUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class IlluminanceTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) IlluminanceUtils.ILLUMINANCE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (IlluminanceUtils.ILLUMINANCE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (IlluminanceUtils.ILLUMINANCE_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        Illuminance result = new Illuminance(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getIlluminance());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

        Illuminance result = new Illuminance(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getIlluminance());
    }

    @Test
    public void test_constructor_00101() {
        int illuminance = IlluminanceUtils.ILLUMINANCE_VALUE_IS_NOT_KNOWN;

        Illuminance result = new Illuminance(illuminance);
        assertEquals(illuminance, result.getIlluminance());
    }

    @Test
    public void test_constructor_00102() {
        int illuminance = 1;

        Illuminance result = new Illuminance(illuminance);
        assertEquals(illuminance, result.getIlluminance());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) IlluminanceUtils.ILLUMINANCE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (IlluminanceUtils.ILLUMINANCE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (IlluminanceUtils.ILLUMINANCE_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        Illuminance result1 = new Illuminance(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

        Illuminance result1 = new Illuminance(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
