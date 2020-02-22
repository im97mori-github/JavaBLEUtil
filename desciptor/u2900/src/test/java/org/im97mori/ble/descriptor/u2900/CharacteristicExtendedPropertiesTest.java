package org.im97mori.ble.descriptor.u2900;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CharacteristicExtendedPropertiesTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = CharacteristicExtendedProperties.PROPERTIES_RELIABLE_WRITE_DISABLED;
        value[ 1] = CharacteristicExtendedProperties.PROPERTIES_RELIABLE_WRITE_DISABLED >> 8;
        //@formatter:on

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(value);
        assertArrayEquals(value, result.getProperties());
        assertTrue(result.isPropertiesReliableWriteDisabled());
        assertFalse(result.isPropertiesReliableWriteEnabled());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = CharacteristicExtendedProperties.PROPERTIES_RELIABLE_WRITE_ENABLED;
        value[ 1] = CharacteristicExtendedProperties.PROPERTIES_RELIABLE_WRITE_ENABLED >> 8;
        //@formatter:on

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(value);
        assertArrayEquals(value, result.getProperties());
        assertFalse(result.isPropertiesReliableWriteDisabled());
        assertTrue(result.isPropertiesReliableWriteEnabled());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = CharacteristicExtendedProperties.PROPERTIES_WRITABLE_AUXILIARIES_DISABLED;
        value[ 1] = CharacteristicExtendedProperties.PROPERTIES_WRITABLE_AUXILIARIES_DISABLED >> 8;
        //@formatter:on

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(value);
        assertArrayEquals(value, result.getProperties());
        assertTrue(result.isPropertiesWritableAuxiliariesDisabled());
        assertFalse(result.isPropertiesWritableAuxiliariesEnabled());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = CharacteristicExtendedProperties.PROPERTIES_WRITABLE_AUXILIARIES_ENABLED;
        value[ 1] = CharacteristicExtendedProperties.PROPERTIES_WRITABLE_AUXILIARIES_ENABLED >> 8;
        //@formatter:on

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(value);
        assertArrayEquals(value, result.getProperties());
        assertFalse(result.isPropertiesWritableAuxiliariesDisabled());
        assertTrue(result.isPropertiesWritableAuxiliariesEnabled());
    }
}
