package org.im97mori.ble.characteristic.u2a23;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class SystemIdTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        //@formatter:on

        SystemId result1 = new SystemId(data);
        assertEquals(0x0504030201L, result1.getManufacturerIdentifier());
        assertEquals(0x080706, result1.getOrganizationallyUniqueIdentifier());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = (byte) 0xff;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = (byte) 0xff;
        //@formatter:on

        SystemId result1 = new SystemId(data);
        assertEquals(0xff04030201L, result1.getManufacturerIdentifier());
        assertEquals(0xff0706, result1.getOrganizationallyUniqueIdentifier());
    }

    @Test
    public void test_constructor003() {
        long manufacturerIdentifier = 1;
        int organizationallyUniqueIdentifier = 2;

        SystemId result1 = new SystemId(manufacturerIdentifier, organizationallyUniqueIdentifier);
        assertEquals(manufacturerIdentifier, result1.getManufacturerIdentifier());
        assertEquals(organizationallyUniqueIdentifier, result1.getOrganizationallyUniqueIdentifier());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        //@formatter:on

        SystemId result1 = new SystemId(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
