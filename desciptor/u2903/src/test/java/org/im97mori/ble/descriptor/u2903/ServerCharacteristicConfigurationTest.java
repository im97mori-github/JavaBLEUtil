package org.im97mori.ble.descriptor.u2903;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ServerCharacteristicConfigurationTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        //@formatter:on

        ServerCharacteristicConfiguration result = new ServerCharacteristicConfiguration(value);
        assertEquals(0x0201, result.getProperties());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = (byte) ServerCharacteristicConfiguration.PROPERTIES_BROADCASTS_DISABLED;
        value[ 1] = (byte) ServerCharacteristicConfiguration.PROPERTIES_BROADCASTS_DISABLED >> 8;
        //@formatter:on

        ServerCharacteristicConfiguration result = new ServerCharacteristicConfiguration(value);
        assertTrue(result.isPropertiesBroadcastsDisabled());
        assertFalse(result.isPropertiesBroadcastsEnabled());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = (byte) ServerCharacteristicConfiguration.PROPERTIES_BROADCASTS_ENABLED;
        value[ 1] = (byte) ServerCharacteristicConfiguration.PROPERTIES_BROADCASTS_ENABLED >> 8;
        //@formatter:on

        ServerCharacteristicConfiguration result = new ServerCharacteristicConfiguration(value);
        assertFalse(result.isPropertiesBroadcastsDisabled());
        assertTrue(result.isPropertiesBroadcastsEnabled());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        //@formatter:on

        ServerCharacteristicConfiguration result1 = new ServerCharacteristicConfiguration(value);
        assertArrayEquals(value, result1.getBytes());
    }

}
