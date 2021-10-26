package org.im97mori.ble.characteristic.u2a04;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PeripheralPreferredConnectionParametersTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) (0x10 & 0xff);
        data[ 1] = (byte) (0x00 & 0xff);
        data[ 2] = (byte) (0x20 & 0xff);
        data[ 3] = (byte) (0x00 & 0xff);
        data[ 4] = (byte) (0x04 & 0xff);
        data[ 5] = (byte) (0x00 & 0xff);
        data[ 6] = (byte) (0x90 & 0xff);
        data[ 7] = (byte) (0x01 & 0xff);
        //@formatter:on

        PeripheralPreferredConnectionParameters result1 = new PeripheralPreferredConnectionParameters(data);
        assertEquals(0x0010, result1.getMinimumConnectionInterval());
        assertEquals(20, result1.getMinimumConnectionIntervalMillis(), 0);
        assertEquals(0x0020, result1.getMaximumConnectionInterval());
        assertEquals(40, result1.getMaximumConnectionIntervalMillis(), 0);
        assertEquals(4, result1.getLatency(), 0);
        assertEquals(0x0190, result1.getTimeout());
        assertEquals(4000, result1.getTimeoutMillis(), 0);
    }

    @Test
    public void test_constructor002() {
        int minimumConnectionInterval = 1;
        int maximumConnectionInterval = 2;
        int latency = 3;
        int timeout = 4;

        PeripheralPreferredConnectionParameters result1 = new PeripheralPreferredConnectionParameters(minimumConnectionInterval, maximumConnectionInterval, latency, timeout);
        assertEquals(minimumConnectionInterval, result1.getMinimumConnectionInterval());
        assertEquals(maximumConnectionInterval, result1.getMaximumConnectionInterval());
        assertEquals(latency, result1.getLatency());
        assertEquals(timeout, result1.getTimeout());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) (0x10 & 0xff);
        data[ 1] = (byte) (0x00 & 0xff);
        data[ 2] = (byte) (0x20 & 0xff);
        data[ 3] = (byte) (0x00 & 0xff);
        data[ 4] = (byte) (0x04 & 0xff);
        data[ 5] = (byte) (0x00 & 0xff);
        data[ 6] = (byte) (0x90 & 0xff);
        data[ 7] = (byte) (0x01 & 0xff);
        //@formatter:on

        PeripheralPreferredConnectionParameters result1 = new PeripheralPreferredConnectionParameters(data);
        byte[] resultData = result1.getBytes();
        assertArrayEquals(data, resultData);
    }

}
