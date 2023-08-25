package org.im97mori.ble.characteristic.u2a6d;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class PressureTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data_00001 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        Pressure result1 = new Pressure(data);
        assertEquals(0x04030201L, result1.getPressure());
        assertEquals(Pressure.PRESSURE_RESOLUTION * 0x04030201L, result1.getPressurePascals(), 0);
    }

    @Test
    public void test_constructor_00002() {
        long pressure = 1;

        Pressure result1 = new Pressure(pressure);
        assertEquals(pressure, result1.getPressure());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        Pressure result1 = new Pressure(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
