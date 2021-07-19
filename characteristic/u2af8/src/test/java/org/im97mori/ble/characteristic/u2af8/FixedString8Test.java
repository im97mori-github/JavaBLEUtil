package org.im97mori.ble.characteristic.u2af8;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class FixedString8Test {

    @Test
    public void test_constructor_00001() {
        String fixedString = "01234567";

        FixedString8 result1 = new FixedString8(fixedString.getBytes(StandardCharsets.UTF_8));
        assertEquals(fixedString, result1.getFixedString());
    }

    @Test
    public void test_constructor_00002() {
        String fixedString = "01234567 ";

        FixedString8 result1 = new FixedString8(fixedString.getBytes(StandardCharsets.UTF_8));
        assertEquals(fixedString.substring(0, 8), result1.getFixedString());
    }

    @Test
    public void test_constructor_00003() {
        String fixedString = "0123456";

        assertThrows(IndexOutOfBoundsException.class, (
        ) -> new FixedString8(fixedString.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void test_constructor_00101() {
        String fixedString = "01234567";

        FixedString8 result1 = new FixedString8(fixedString);
        assertEquals(fixedString, result1.getFixedString());
    }

    @Test
    public void test_constructor_00102() {
        String fixedString = "01234567 ";

        FixedString8 result1 = new FixedString8(fixedString);
        assertEquals(fixedString.substring(0, 8), result1.getFixedString());
    }

    @Test
    public void test_constructor_00103() {
        String fixedString = "0123456";

        assertThrows(IndexOutOfBoundsException.class, (
        ) -> new FixedString8(fixedString));
    }

    @Test
    public void test_parcelable_00101() {
        String fixedString = "01234567";

        FixedString8 result1 = new FixedString8(fixedString.getBytes(StandardCharsets.UTF_8));
        assertArrayEquals(fixedString.getBytes(StandardCharsets.UTF_8), result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        String fixedString = "01234567 ";

        FixedString8 result1 = new FixedString8(fixedString.getBytes(StandardCharsets.UTF_8));
        assertArrayEquals(fixedString.substring(0, 8).getBytes(StandardCharsets.UTF_8), result1.getBytes());
    }

}
