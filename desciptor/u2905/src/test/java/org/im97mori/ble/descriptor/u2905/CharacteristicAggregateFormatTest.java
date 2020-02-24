package org.im97mori.ble.descriptor.u2905;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacteristicAggregateFormatTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        //@formatter:on

        CharacteristicAggregateFormat result = new CharacteristicAggregateFormat(value);
        assertArrayEquals(value, result.getListOfHandles());
        assertEquals(value.length / 2, result.getSize());
        assertEquals((value[0] & 0xff) | ((value[1] & 0xff) << 8), result.getHandle(0));
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] value = new byte[4];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        //@formatter:on

        CharacteristicAggregateFormat result = new CharacteristicAggregateFormat(value);
        assertArrayEquals(value, result.getListOfHandles());
        assertEquals(value.length / 2, result.getSize());
        assertEquals((value[0] & 0xff) | ((value[1] & 0xff) << 8), result.getHandle(0));
        assertEquals((value[2] & 0xff) | ((value[3] & 0xff) << 8), result.getHandle(1));
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        //@formatter:on

        CharacteristicAggregateFormat result1 = new CharacteristicAggregateFormat(value);
        assertArrayEquals(value, result1.getBytes());
    }

}
