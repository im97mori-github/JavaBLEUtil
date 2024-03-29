package org.im97mori.ble.characteristic.u2a9a;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class UserIndexTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        UserIndex result1 = new UserIndex(data);
        assertEquals(0x00, result1.getUserIndex());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        UserIndex result1 = new UserIndex(data);
        assertEquals(0xff, result1.getUserIndex());
    }

    @Test
    public void test_constructor003() {
        int userIndex = 1;

        UserIndex result1 = new UserIndex(userIndex);
        assertEquals(userIndex, result1.getUserIndex());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        UserIndex result1 = new UserIndex(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
