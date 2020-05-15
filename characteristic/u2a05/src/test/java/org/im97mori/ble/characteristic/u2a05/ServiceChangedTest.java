package org.im97mori.ble.characteristic.u2a05;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServiceChangedTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        ServiceChanged result1 = new ServiceChanged(data);
        assertEquals(0x0201, result1.getStartOfAffectedAttributeHandleRange());
        assertEquals(0x0403, result1.getEndOfAffectedAttributeHandleRange());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0xff;
        data[ 2] = 0x03;
        data[ 3] = (byte) 0xff;
        //@formatter:on

        ServiceChanged result1 = new ServiceChanged(data);
        assertEquals(0xff01, result1.getStartOfAffectedAttributeHandleRange());
        assertEquals(0xff03, result1.getEndOfAffectedAttributeHandleRange());
    }

    @Test
    public void test_constructor003() {
        int startOfAffectedAttributeHandleRange = 1;
        int endOfAffectedAttributeHandleRange = 2;

        ServiceChanged result1 = new ServiceChanged(startOfAffectedAttributeHandleRange, endOfAffectedAttributeHandleRange);
        assertEquals(startOfAffectedAttributeHandleRange, result1.getStartOfAffectedAttributeHandleRange());
        assertEquals(endOfAffectedAttributeHandleRange, result1.getEndOfAffectedAttributeHandleRange());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        ServiceChanged result1 = new ServiceChanged(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
