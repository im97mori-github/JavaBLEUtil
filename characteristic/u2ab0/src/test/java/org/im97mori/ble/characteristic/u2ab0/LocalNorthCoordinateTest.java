package org.im97mori.ble.characteristic.u2ab0;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class LocalNorthCoordinateTest extends TestBase {

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

        LocalNorthCoordinate result1 = new LocalNorthCoordinate(data);
        assertEquals(0x0201, result1.getLocalNorthCoordinate());
    }

    @Test
    public void test_constructor_00002() {
        int localNorthCoordinate = 1;

        LocalNorthCoordinate result1 = new LocalNorthCoordinate(localNorthCoordinate);
        assertEquals(localNorthCoordinate, result1.getLocalNorthCoordinate());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        LocalNorthCoordinate result1 = new LocalNorthCoordinate(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
