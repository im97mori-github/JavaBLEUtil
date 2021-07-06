package org.im97mori.ble.characteristic.u2ae2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BLEBooleanTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) BLEBoolean.BOOLEAN_FALSE;
        //@formatter:on

        BLEBoolean result1 = new BLEBoolean(data);
        assertEquals(BLEBoolean.BOOLEAN_FALSE, result1.getBoolean());
        assertTrue(result1.isBooleanFalse());
        assertFalse(result1.isBooleanTrue());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) BLEBoolean.BOOLEAN_TRUE;
        //@formatter:on

        BLEBoolean result1 = new BLEBoolean(data);
        assertEquals(BLEBoolean.BOOLEAN_TRUE, result1.getBoolean());
        assertFalse(result1.isBooleanFalse());
        assertTrue(result1.isBooleanTrue());
    }

    @Test
    public void test_constructor_00101() {
        int booleanValue = 1;

        BLEBoolean result1 = new BLEBoolean(booleanValue);
        assertEquals(booleanValue, result1.getBoolean());
    }

    @Test
    public void test_parcelable_00100() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        BLEBoolean result1 = new BLEBoolean(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
