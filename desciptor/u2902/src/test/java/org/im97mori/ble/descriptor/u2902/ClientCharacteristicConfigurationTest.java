package org.im97mori.ble.descriptor.u2902;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClientCharacteristicConfigurationTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = ClientCharacteristicConfiguration.PROPERTIES_NOTIFICATIONS_DISABLED;
        value[ 1] = 0x00;
        //@formatter:on

        ClientCharacteristicConfiguration result = new ClientCharacteristicConfiguration(value);
        assertArrayEquals(value, result.getProperties());
        assertTrue(result.isPropertiesNotificationsDisabled());
        assertFalse(result.isPropertiesNotificationsEnabled());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = ClientCharacteristicConfiguration.PROPERTIES_NOTIFICATIONS_ENABLED;
        value[ 1] = 0x00;
        //@formatter:on

        ClientCharacteristicConfiguration result = new ClientCharacteristicConfiguration(value);
        assertArrayEquals(value, result.getProperties());
        assertFalse(result.isPropertiesNotificationsDisabled());
        assertTrue(result.isPropertiesNotificationsEnabled());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = ClientCharacteristicConfiguration.PROPERTIES_INDICATIONS_DISABLED;
        value[ 1] = 0x00;
        //@formatter:on

        ClientCharacteristicConfiguration result = new ClientCharacteristicConfiguration(value);
        assertArrayEquals(value, result.getProperties());
        assertTrue(result.isPropertiesIndicationsDisabled());
        assertFalse(result.isPropertiesIndicationsEnabled());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] =ClientCharacteristicConfiguration.PROPERTIES_INDICATIONS_ENABLED;
        value[ 1] = 0x00;
        //@formatter:on

        ClientCharacteristicConfiguration result = new ClientCharacteristicConfiguration(value);
        assertArrayEquals(value, result.getProperties());
        assertFalse(result.isPropertiesIndicationsDisabled());
        assertTrue(result.isPropertiesIndicationsEnabled());
    }
}
