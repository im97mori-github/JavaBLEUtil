package org.im97mori.ble.descriptor.u2901;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class CharacteristicUserDescriptionTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        String text = "abced";
        byte[] value = text.getBytes();
        //@formatter:on

        CharacteristicUserDescription result = new CharacteristicUserDescription(value);
        assertEquals(text, result.getUserDescription());
    }
    
    @Test
    public void test_parcelable002() {
        //@formatter:off
        String text = "abced";
        byte[] value = text.getBytes();
        //@formatter:on

        CharacteristicUserDescription result1 = new CharacteristicUserDescription(value);
        assertArrayEquals(value, result1.getBytes());
    }
    
}
