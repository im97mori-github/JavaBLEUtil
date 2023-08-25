package org.im97mori.ble.characteristic.u2a2c;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class MagneticDeclinationTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data_00001 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        MagneticDeclination result1 = new MagneticDeclination(data);
        assertEquals(0x0201, result1.getMagneticDeclination());
        assertEquals(MagneticDeclination.MAGNETIC_DECLINATION_RESOLUTION * 0x0201, result1.getMagneticDeclinationDegrees(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int magneticDeclination = 1;

        MagneticDeclination result1 = new MagneticDeclination(magneticDeclination);
        assertEquals(magneticDeclination, result1.getMagneticDeclination());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        MagneticDeclination result1 = new MagneticDeclination(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
