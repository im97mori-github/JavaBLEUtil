package org.im97mori.ble.characteristic.u2af5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class FixedString16Test {

    @Test
    public void test_constructor_00001() {
        String fixedString = "0123456789abcdef";

        FixedString16 result1 = new FixedString16(fixedString.getBytes(StandardCharsets.UTF_8));
        assertEquals(fixedString, result1.getFixedString());
    }

    @Test
    public void test_constructor_00002() {
        String fixedString = "0123456789abcdef ";

        FixedString16 result1 = new FixedString16(fixedString.getBytes(StandardCharsets.UTF_8));
        assertEquals(fixedString.substring(0, 16), result1.getFixedString());
    }

    @Test
    public void test_constructor_00003() {
        String fixedString = "0123456789abcde";

        assertThrows(IndexOutOfBoundsException.class, (
        ) -> new FixedString16(fixedString.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void test_constructor_00101() {
        String fixedString = "0123456789abcdef";

        FixedString16 result1 = new FixedString16(fixedString);
        assertEquals(fixedString, result1.getFixedString());
    }

    @Test
    public void test_constructor_00102() {
        String fixedString = "0123456789abcdef ";

        FixedString16 result1 = new FixedString16(fixedString);
        assertEquals(fixedString.substring(0, 16), result1.getFixedString());
    }

    @Test
    public void test_constructor_00103() {
        String fixedString = "0123456789abcde";

        assertThrows(IndexOutOfBoundsException.class, (
        ) -> new FixedString16(fixedString));
    }

    @Test
    public void test_parcelable_00101() {
        String fixedString = "0123456789abcdef";

        FixedString16 result1 = new FixedString16(fixedString.getBytes(StandardCharsets.UTF_8));
        assertArrayEquals(fixedString.getBytes(StandardCharsets.UTF_8), result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        String fixedString = "0123456789abcdef ";

        FixedString16 result1 = new FixedString16(fixedString.getBytes(StandardCharsets.UTF_8));
        assertArrayEquals(fixedString.substring(0, 16).getBytes(StandardCharsets.UTF_8), result1.getBytes());
    }

}
