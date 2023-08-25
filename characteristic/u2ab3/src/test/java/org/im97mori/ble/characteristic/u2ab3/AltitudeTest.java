package org.im97mori.ble.characteristic.u2ab3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class AltitudeTest extends TestBase {

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

        Altitude result1 = new Altitude(data);
        assertEquals(0x0201, result1.getAltitude());
    }

    @Test
    public void test_constructor_00002() {
        int altitude = 1;

        Altitude result1 = new Altitude(altitude);
        assertEquals(altitude, result1.getAltitude());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        Altitude result1 = new Altitude(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
