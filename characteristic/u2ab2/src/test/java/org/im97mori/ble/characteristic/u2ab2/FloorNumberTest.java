package org.im97mori.ble.characteristic.u2ab2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class FloorNumberTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        data_00001 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        FloorNumber result1 = new FloorNumber(data);
        assertEquals(0x01, result1.getFloorNumber());
    }

    @Test
    public void test_constructor_00002() {
        int floorNumber = 1;

        FloorNumber result1 = new FloorNumber(floorNumber);
        assertEquals(floorNumber, result1.getFloorNumber());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        FloorNumber result1 = new FloorNumber(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
