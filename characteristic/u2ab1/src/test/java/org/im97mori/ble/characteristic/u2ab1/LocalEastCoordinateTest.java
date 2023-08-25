package org.im97mori.ble.characteristic.u2ab1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class LocalEastCoordinateTest extends TestBase {

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

        LocalEastCoordinate result1 = new LocalEastCoordinate(data);
        assertEquals(0x0201, result1.getLocalEastCoordinate());
    }

    @Test
    public void test_constructor_00002() {
        int localEastCoordinate = 1;

        LocalEastCoordinate result1 = new LocalEastCoordinate(localEastCoordinate);
        assertEquals(localEastCoordinate, result1.getLocalEastCoordinate());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        LocalEastCoordinate result1 = new LocalEastCoordinate(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
