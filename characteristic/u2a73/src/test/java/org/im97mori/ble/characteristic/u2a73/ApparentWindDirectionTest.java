package org.im97mori.ble.characteristic.u2a73;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class ApparentWindDirectionTest extends TestBase {

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

        ApparentWindDirection result1 = new ApparentWindDirection(data);
        assertEquals(0x0201, result1.getApparentWindDirection());
        assertEquals(ApparentWindDirection.APPARENT_WIND_DIRECTION_RESOLUTION * 0x0201, result1.getApparentWindDirectionDegrees(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int apparentWindDirection = 1;

        ApparentWindDirection result1 = new ApparentWindDirection(apparentWindDirection);
        assertEquals(apparentWindDirection, result1.getApparentWindDirection());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ApparentWindDirection result1 = new ApparentWindDirection(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
