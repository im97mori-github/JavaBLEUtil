package org.im97mori.ble.characteristic.u2a75;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class PollenConcentrationTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data_00001 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        PollenConcentration result1 = new PollenConcentration(data);
        assertEquals(0x030201, result1.getPollenConcentration());
    }

    @Test
    public void test_constructor_00002() {
        int pollenConcentration = 1;

        PollenConcentration result1 = new PollenConcentration(pollenConcentration);
        assertEquals(pollenConcentration, result1.getPollenConcentration());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        PollenConcentration result1 = new PollenConcentration(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
