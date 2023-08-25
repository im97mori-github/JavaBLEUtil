package org.im97mori.ble.characteristic.u2a98;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class WeightTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        Weight result1 = new Weight(data);
        assertEquals(0x0201, result1.getWeight());
        assertEquals(Weight.WEIGHT_RESOLUTION * 0x0201, result1.getWeightKg(), 0);
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        //@formatter:on

        Weight result1 = new Weight(data);
        assertEquals(0xffff, result1.getWeight());
        assertEquals(Weight.WEIGHT_RESOLUTION * 0xffff, result1.getWeightKg(), 0);
    }

    @Test
    public void test_constructor003() {
        int weight = 1;

        Weight result1 = new Weight(weight);
        assertEquals(weight, result1.getWeight());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        Weight result1 = new Weight(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
