package org.im97mori.ble.characteristic.u2a07;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TxPowerLevelTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0x9c;
        //@formatter:on

        TxPowerLevel result1 = new TxPowerLevel(data);
        assertEquals(0xffffff9c, result1.getTxPower());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x14;
        //@formatter:on

        TxPowerLevel result1 = new TxPowerLevel(data);
        assertEquals(0x14, result1.getTxPower());
    }

    @Test
    public void test_constructor003() {
        int txPower = 1;

        TxPowerLevel result1 = new TxPowerLevel(txPower);
        assertEquals(txPower, result1.getTxPower());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x64;
        //@formatter:on

        TxPowerLevel result1 = new TxPowerLevel(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
