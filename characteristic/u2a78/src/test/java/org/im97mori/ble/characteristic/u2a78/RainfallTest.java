package org.im97mori.ble.characteristic.u2a78;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class RainfallTest extends TestBase {

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

        Rainfall result1 = new Rainfall(data);
        assertEquals(0x0201, result1.getRainfall());
        assertEquals(Rainfall.RAINFALL_RESOLUTION * 0x0201, result1.getRainfallMilliMeters(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int rainfall = 1;

        Rainfall result1 = new Rainfall(rainfall);
        assertEquals(rainfall, result1.getRainfall());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        Rainfall result1 = new Rainfall(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
