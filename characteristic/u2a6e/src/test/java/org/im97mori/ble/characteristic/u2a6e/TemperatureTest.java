package org.im97mori.ble.characteristic.u2a6e;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class TemperatureTest extends TestBase {

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

        Temperature result1 = new Temperature(data);
        assertEquals(0x0201, result1.getTemperature());
    }

    @Test
    public void test_constructor_00002() {
        int temperature = 1;

        Temperature result1 = new Temperature(temperature);
        assertEquals(temperature, result1.getTemperature());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        Temperature result1 = new Temperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
