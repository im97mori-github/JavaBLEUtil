package org.im97mori.ble.characteristic.u2a7a;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({"unused"})
public class HeatIndexTest extends TestBase {

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

        HeatIndex result1 = new HeatIndex(data);
        assertEquals(0x01, result1.getHeatIndex());
    }
    
    @Test
    public void test_constructor_00002() {
        int heatIndex = 1;

        HeatIndex result1 = new HeatIndex(heatIndex);
        assertEquals(heatIndex, result1.getHeatIndex());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        HeatIndex result1 = new HeatIndex(data);
        assertArrayEquals(data, result1.getBytes());
    }
}
