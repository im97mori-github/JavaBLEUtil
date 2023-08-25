package org.im97mori.ble.characteristic.u2a70;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class TrueWindSpeedTest extends TestBase {

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

        TrueWindSpeed result1 = new TrueWindSpeed(data);
        assertEquals(0x0201, result1.getTrueWindSpeed());
        assertEquals(TrueWindSpeed.TRUE_WIND_SPEED_RESOLUTION * 0x0201, result1.getTrueWindSpeedMetersPerSecond(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int trueWindSpeed = 1;

        TrueWindSpeed result1 = new TrueWindSpeed(trueWindSpeed);
        assertEquals(trueWindSpeed, result1.getTrueWindSpeed());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        TrueWindSpeed result1 = new TrueWindSpeed(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
