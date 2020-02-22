package org.im97mori.ble.descriptor.u2901;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacteristicUserDescriptionTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        String text = "abced";
        byte[] value = text.getBytes();
        //@formatter:on

        CharacteristicUserDescription result = new CharacteristicUserDescription(value);
        assertEquals(text, result.getUserDescription());
    }
}
