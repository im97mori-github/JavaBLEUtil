package org.im97mori.ble.characteristic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.u2a03.ReconnectionAddress;
import org.junit.Test;

public class ReconnectionAddressTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        //@formatter:on

        ReconnectionAddress result1 = new ReconnectionAddress(data);
        assertEquals(0x060504030201L, result1.getAddress());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        ReconnectionAddress result1 = new ReconnectionAddress(data);
        assertEquals(0xff0504030201L, result1.getAddress());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        //@formatter:on

        ReconnectionAddress result1 = new ReconnectionAddress(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
