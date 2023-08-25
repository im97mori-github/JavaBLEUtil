package org.im97mori.ble.characteristic.u2a77;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class IrradianceTest extends TestBase {

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

        Irradiance result1 = new Irradiance(data);
        assertEquals(0x0201, result1.getIrradiance());
        assertEquals(Irradiance.IRRADIANCE_RESOLUTION * 0x0201, result1.getIrradianceWattPerSquareMeter(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int irradiance = 1;

        Irradiance result1 = new Irradiance(irradiance);
        assertEquals(irradiance, result1.getIrradiance());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        Irradiance result1 = new Irradiance(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
