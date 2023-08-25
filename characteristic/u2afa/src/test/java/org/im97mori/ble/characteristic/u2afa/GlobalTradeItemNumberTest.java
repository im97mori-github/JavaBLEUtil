package org.im97mori.ble.characteristic.u2afa;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class GlobalTradeItemNumberTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        //@formatter:on

        GlobalTradeItemNumber result = new GlobalTradeItemNumber(data);
        assertEquals(BLEUtils.createUInt48(data, 0), result.getGlobalTradeItemNumber());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 12345678912343L;
        data[ 1] = (byte) (12345678912343L >> 8);
        data[ 2] = (byte) (12345678912343L >> 16);
        data[ 3] = (byte) (12345678912343L >> 24);
        data[ 4] = (byte) (12345678912343L >> 32);
        data[ 5] = (byte) (12345678912343L >> 40);
        //@formatter:on

        GlobalTradeItemNumber result = new GlobalTradeItemNumber(data);
        assertEquals(BLEUtils.createUInt48(data, 0), result.getGlobalTradeItemNumber());
        assertTrue(result.isValid());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 12345678912344L;
        data[ 1] = (byte) (12345678912344L >> 8);
        data[ 2] = (byte) (12345678912344L >> 16);
        data[ 3] = (byte) (12345678912344L >> 24);
        data[ 4] = (byte) (12345678912344L >> 32);
        data[ 5] = (byte) (12345678912344L >> 40);
        //@formatter:on

        GlobalTradeItemNumber result = new GlobalTradeItemNumber(data);
        assertEquals(BLEUtils.createUInt48(data, 0), result.getGlobalTradeItemNumber());
        assertFalse(result.isValid());
    }

    @Test
    public void test_constructor_00101() {
        long globalTradeItemNumber = 1;

        GlobalTradeItemNumber result = new GlobalTradeItemNumber(globalTradeItemNumber);
        assertEquals(globalTradeItemNumber, result.getGlobalTradeItemNumber());
    }

    @Test
    public void test_constructor_00102() {
        long globalTradeItemNumber = 12345678912343L;

        GlobalTradeItemNumber result = new GlobalTradeItemNumber(globalTradeItemNumber);
        assertEquals(globalTradeItemNumber, result.getGlobalTradeItemNumber());
        assertTrue(result.isValid());
    }

    @Test
    public void test_constructor_00103() {
        long globalTradeItemNumber = 12345678912344L;

        GlobalTradeItemNumber result = new GlobalTradeItemNumber(globalTradeItemNumber);
        assertEquals(globalTradeItemNumber, result.getGlobalTradeItemNumber());
        assertFalse(result.isValid());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 1] = 0x04;
        data[ 1] = 0x05;
        data[ 1] = 0x06;
        //@formatter:on

        GlobalTradeItemNumber result1 = new GlobalTradeItemNumber(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
