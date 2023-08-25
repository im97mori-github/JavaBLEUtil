package org.im97mori.ble.characteristic.u2af6;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class FixedString24Test extends TestBase {

    @Test
    public void test_constructor_00001() {
        String fixedString = "012345678901234567890123";

        FixedString24 result1 = new FixedString24(fixedString.getBytes());
        assertEquals(fixedString, result1.getFixedString());
    }

    @Test
    public void test_constructor_00002() {
        String fixedString = "012345678901234567890123 ";

        FixedString24 result1 = new FixedString24(fixedString.getBytes());
        assertEquals(fixedString.substring(0, 24), result1.getFixedString());
    }

    @Test
    public void test_constructor_00003() {
        String fixedString = "01234567890123456789012";

        assertThrows(IndexOutOfBoundsException.class, (
        ) -> new FixedString24(fixedString.getBytes()));
    }

    @Test
    public void test_constructor_00101() {
        String fixedString = "012345678901234567890123";

        FixedString24 result1 = new FixedString24(fixedString);
        assertEquals(fixedString, result1.getFixedString());
    }

    @Test
    public void test_constructor_00102() {
        String fixedString = "012345678901234567890123 ";

        FixedString24 result1 = new FixedString24(fixedString);
        assertEquals(fixedString.substring(0, 24), result1.getFixedString());
    }

    @Test
    public void test_constructor_00103() {
        String fixedString = "01234567890123456789012";

        assertThrows(IndexOutOfBoundsException.class, (
        ) -> new FixedString24(fixedString));
    }

    @Test
    public void test_parcelable_00101() {
        String fixedString = "012345678901234567890123";

        FixedString24 result1 = new FixedString24(fixedString.getBytes());
        assertArrayEquals(fixedString.getBytes(), result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        String fixedString = "012345678901234567890123 ";

        FixedString24 result1 = new FixedString24(fixedString.getBytes());
        assertArrayEquals(fixedString.substring(0, 24).getBytes(), result1.getBytes());
    }

}
