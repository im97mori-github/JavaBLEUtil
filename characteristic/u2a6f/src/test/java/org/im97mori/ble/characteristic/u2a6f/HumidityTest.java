package org.im97mori.ble.characteristic.u2a6f;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class HumidityTest extends TestBase {

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

        Humidity result1 = new Humidity(data);
        assertEquals(0x0201, result1.getHumidity());
        assertEquals(Humidity.HUMIDITY_RESOLUTION * 0x0201, result1.getHumidityPercent(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int humidity = 1;

        Humidity result1 = new Humidity(humidity);
        assertEquals(humidity, result1.getHumidity());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        Humidity result1 = new Humidity(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
