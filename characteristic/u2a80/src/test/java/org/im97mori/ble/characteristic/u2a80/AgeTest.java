package org.im97mori.ble.characteristic.u2a80;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class AgeTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        //@formatter:on

        Age result1 = new Age(data);
        assertEquals(0x00, result1.getAge());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        Age result1 = new Age(data);
        assertEquals(0xff, result1.getAge());
    }

    @Test
    public void test_constructor003() {
        int age = 1;

        Age result1 = new Age(age);
        assertEquals(age, result1.getAge());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        Age result1 = new Age(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
