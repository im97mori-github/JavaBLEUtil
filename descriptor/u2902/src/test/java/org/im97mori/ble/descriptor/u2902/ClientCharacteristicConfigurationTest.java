package org.im97mori.ble.descriptor.u2902;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class ClientCharacteristicConfigurationTest extends TestBase {

  //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        int flags = ClientCharacteristicConfiguration.PROPERTIES_NOTIFICATIONS_DISABLED;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        int flags = ClientCharacteristicConfiguration.PROPERTIES_NOTIFICATIONS_ENABLED;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[2];
        int flags = ClientCharacteristicConfiguration.PROPERTIES_INDICATIONS_DISABLED;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[2];
        int flags = ClientCharacteristicConfiguration.PROPERTIES_INDICATIONS_ENABLED;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00004 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        ClientCharacteristicConfiguration result = new ClientCharacteristicConfiguration(data);
        assertArrayEquals(data, result.getProperties());
        assertTrue(result.isPropertiesNotificationsDisabled());
        assertFalse(result.isPropertiesNotificationsEnabled());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        ClientCharacteristicConfiguration result = new ClientCharacteristicConfiguration(data);
        assertArrayEquals(data, result.getProperties());
        assertFalse(result.isPropertiesNotificationsDisabled());
        assertTrue(result.isPropertiesNotificationsEnabled());
    }

    @Test
    public void test_constructor_00003() {
        byte[] data = getData();

        ClientCharacteristicConfiguration result = new ClientCharacteristicConfiguration(data);
        assertArrayEquals(data, result.getProperties());
        assertTrue(result.isPropertiesIndicationsDisabled());
        assertFalse(result.isPropertiesIndicationsEnabled());
    }

    @Test
    public void test_constructor_00004() {
        byte[] data = getData();

        ClientCharacteristicConfiguration result = new ClientCharacteristicConfiguration(data);
        assertArrayEquals(data, result.getProperties());
        assertFalse(result.isPropertiesIndicationsDisabled());
        assertTrue(result.isPropertiesIndicationsEnabled());
    }
    
    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ClientCharacteristicConfiguration result1 = new ClientCharacteristicConfiguration(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        ClientCharacteristicConfiguration result1 = new ClientCharacteristicConfiguration(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] data = getData();

        ClientCharacteristicConfiguration result1 = new ClientCharacteristicConfiguration(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00004() {
        byte[] data = getData();

        ClientCharacteristicConfiguration result1 = new ClientCharacteristicConfiguration(data);
        assertArrayEquals(data, result1.getBytes());
    }
    
}
