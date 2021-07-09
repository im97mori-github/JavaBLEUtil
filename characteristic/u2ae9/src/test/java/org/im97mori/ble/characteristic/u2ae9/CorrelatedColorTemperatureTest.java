package org.im97mori.ble.characteristic.u2ae9;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

public class CorrelatedColorTemperatureTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        CorrelatedColorTemperature result = new CorrelatedColorTemperature(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getCorrelatedColorTemperature());
    }

    @Test
    public void test_constructor_00101() {
        int correlatedColorTemperature = 1;

        CorrelatedColorTemperature result = new CorrelatedColorTemperature(correlatedColorTemperature);
        assertEquals(correlatedColorTemperature, result.getCorrelatedColorTemperature());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        CorrelatedColorTemperature result1 = new CorrelatedColorTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
