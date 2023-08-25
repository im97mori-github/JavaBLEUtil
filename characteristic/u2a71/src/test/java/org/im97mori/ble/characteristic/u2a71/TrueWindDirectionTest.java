package org.im97mori.ble.characteristic.u2a71;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class TrueWindDirectionTest extends TestBase {

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

        TrueWindDirection result1 = new TrueWindDirection(data);
        assertEquals(0x0201, result1.getTrueWindDirection());
        assertEquals(TrueWindDirection.TRUE_WIND_DIRECTION_RESOLUTION * 0x0201, result1.getTrueWindDirectionDegrees(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int trueWindDirection = 1;

        TrueWindDirection result1 = new TrueWindDirection(trueWindDirection);
        assertEquals(trueWindDirection, result1.getTrueWindDirection());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        TrueWindDirection result1 = new TrueWindDirection(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
