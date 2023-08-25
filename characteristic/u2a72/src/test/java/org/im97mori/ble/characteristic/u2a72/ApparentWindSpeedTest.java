package org.im97mori.ble.characteristic.u2a72;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class ApparentWindSpeedTest extends TestBase {

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

        ApparentWindSpeed result1 = new ApparentWindSpeed(data);
        assertEquals(0x0201, result1.getApparentWindSpeed());
        assertEquals(ApparentWindSpeed.APPARENT_WIND_SPEED_RESOLUTION * 0x0201, result1.getApparentWindSpeedMetersPerSecond(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int apparentWindSpeed = 1;

        ApparentWindSpeed result1 = new ApparentWindSpeed(apparentWindSpeed);
        assertEquals(apparentWindSpeed, result1.getApparentWindSpeed());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ApparentWindSpeed result1 = new ApparentWindSpeed(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
