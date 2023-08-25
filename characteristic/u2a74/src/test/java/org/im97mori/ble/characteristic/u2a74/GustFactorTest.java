package org.im97mori.ble.characteristic.u2a74;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class GustFactorTest extends TestBase {

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

        GustFactor result1 = new GustFactor(data);
        assertEquals(0x01, result1.getGustFactor());
        assertEquals(GustFactor.GUST_FACTOR_RESOLUTION * 0x01, result1.getGustFactorWithUnit(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int gustFactor = 1;

        GustFactor result1 = new GustFactor(gustFactor);
        assertEquals(gustFactor, result1.getGustFactor());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        GustFactor result1 = new GustFactor(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
