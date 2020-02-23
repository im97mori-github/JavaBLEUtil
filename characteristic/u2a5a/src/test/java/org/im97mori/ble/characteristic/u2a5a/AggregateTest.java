package org.im97mori.ble.characteristic.u2a5a;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.im97mori.ble.characteristic.core.AutomationIoUtils;
import org.junit.Test;

public class AggregateTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = AutomationIoUtils.DIGITAL_INACTIVE;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        Aggregate result1 = new Aggregate(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 1), result1.getInputBits(1));
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getAnalogInput(1));
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AutomationIoUtils.DIGITAL_ACTIVE;
        //@formatter:on

        Aggregate result1 = new Aggregate(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 1), result1.getInputBits(1));
        assertArrayEquals(Arrays.copyOfRange(data, 1, 1), result1.getAnalogInput(1));
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        Aggregate result1 = new Aggregate(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 0), result1.getInputBits(0));
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getAnalogInput(0));
    }

}
