package org.im97mori.ble.characteristic.u2a99;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class DatabaseChangeIncrementTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        DatabaseChangeIncrement result1 = new DatabaseChangeIncrement(data);
        assertEquals(0x04030201, result1.getDatabaseChangeIncrement());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0xff;
        data[ 3] = (byte) 0xff;
        //@formatter:on

        DatabaseChangeIncrement result1 = new DatabaseChangeIncrement(data);
        assertEquals(0xffffffffL, result1.getDatabaseChangeIncrement());
    }

    @Test
    public void test_constructor003() {
        long databaseChangeIncrement = 1;

        DatabaseChangeIncrement result1 = new DatabaseChangeIncrement(databaseChangeIncrement);
        assertEquals(databaseChangeIncrement, result1.getDatabaseChangeIncrement());
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

        DatabaseChangeIncrement result1 = new DatabaseChangeIncrement(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
