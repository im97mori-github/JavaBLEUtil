package org.im97mori.ble.descriptor.u2902;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

@SuppressWarnings("unused")
public class ClientCharacteristicConfigurationTest {

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

    private byte[] getData() {
        int index = -1;
        byte[] data = null;

        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTraceElementArray.length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArray[i];
            if ("getData".equals(stackTraceElement.getMethodName())) {
                index = i + 1;
                break;
            }
        }
        if (index >= 0 && index < stackTraceElementArray.length) {
            StackTraceElement stackTraceElement = stackTraceElementArray[index];
            String[] splitted = stackTraceElement.getMethodName().split("_");
            try {
                data = (byte[]) this.getClass().getDeclaredField("data_" + splitted[splitted.length - 1]).get(null);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

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
