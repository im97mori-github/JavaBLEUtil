package org.im97mori.ble.characteristic.u2aae;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class LatitudeTest extends TestBase {

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

        Latitude result1 = new Latitude(data);
        assertEquals(0x04030201, result1.getLatitude());
    }

    @Test
    public void test_constructor_00002() {
        int latitude = 1;

        Latitude result1 = new Latitude(latitude);
        assertEquals(latitude, result1.getLatitude());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        Latitude result1 = new Latitude(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
