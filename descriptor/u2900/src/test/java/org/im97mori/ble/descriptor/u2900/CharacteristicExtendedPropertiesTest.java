package org.im97mori.ble.descriptor.u2900;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

@SuppressWarnings("unused")
public class CharacteristicExtendedPropertiesTest {

  //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        int flags = CharacteristicExtendedProperties.PROPERTIES_RELIABLE_WRITE_DISABLED;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        int flags = CharacteristicExtendedProperties.PROPERTIES_RELIABLE_WRITE_ENABLED;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[2];
        int flags = CharacteristicExtendedProperties.PROPERTIES_WRITABLE_AUXILIARIES_DISABLED;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[2];
        int flags = CharacteristicExtendedProperties.PROPERTIES_WRITABLE_AUXILIARIES_ENABLED;
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

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(data);
        assertArrayEquals(data, result.getProperties());
        assertTrue(result.isPropertiesReliableWriteDisabled());
        assertFalse(result.isPropertiesReliableWriteEnabled());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(data);
        assertArrayEquals(data, result.getProperties());
        assertFalse(result.isPropertiesReliableWriteDisabled());
        assertTrue(result.isPropertiesReliableWriteEnabled());
    }

    @Test
    public void test_constructor_00003() {
        byte[] data = getData();

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(data);
        assertArrayEquals(data, result.getProperties());
        assertTrue(result.isPropertiesWritableAuxiliariesDisabled());
        assertFalse(result.isPropertiesWritableAuxiliariesEnabled());
    }

    @Test
    public void test_constructor_00004() {
        byte[] data = getData();

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(data);
        assertArrayEquals(data, result.getProperties());
        assertFalse(result.isPropertiesWritableAuxiliariesDisabled());
        assertTrue(result.isPropertiesWritableAuxiliariesEnabled());
    }

    @Test
    public void test_constructor_00101() {
        int flag = CharacteristicExtendedProperties.PROPERTIES_RELIABLE_WRITE_DISABLED | CharacteristicExtendedProperties.PROPERTIES_WRITABLE_AUXILIARIES_DISABLED;
        byte[] data = new byte[] { (byte) flag, (byte) (flag >> 8) };

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(false, false);
        assertArrayEquals(data, result.getProperties());
        assertTrue(result.isPropertiesReliableWriteDisabled());
        assertFalse(result.isPropertiesReliableWriteEnabled());
        assertTrue(result.isPropertiesWritableAuxiliariesDisabled());
        assertFalse(result.isPropertiesWritableAuxiliariesEnabled());
    }

    @Test
    public void test_constructor_00102() {
        int flag = CharacteristicExtendedProperties.PROPERTIES_RELIABLE_WRITE_ENABLED | CharacteristicExtendedProperties.PROPERTIES_WRITABLE_AUXILIARIES_DISABLED;
        byte[] data = new byte[] { (byte) flag, (byte) (flag >> 8) };

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(true, false);
        assertArrayEquals(data, result.getProperties());
        assertFalse(result.isPropertiesReliableWriteDisabled());
        assertTrue(result.isPropertiesReliableWriteEnabled());
        assertTrue(result.isPropertiesWritableAuxiliariesDisabled());
        assertFalse(result.isPropertiesWritableAuxiliariesEnabled());
    }

    @Test
    public void test_constructor_00103() {
        int flag = CharacteristicExtendedProperties.PROPERTIES_RELIABLE_WRITE_DISABLED | CharacteristicExtendedProperties.PROPERTIES_WRITABLE_AUXILIARIES_ENABLED;
        byte[] data = new byte[] { (byte) flag, (byte) (flag >> 8) };

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(false, true);
        assertArrayEquals(data, result.getProperties());
        assertTrue(result.isPropertiesReliableWriteDisabled());
        assertFalse(result.isPropertiesReliableWriteEnabled());
        assertFalse(result.isPropertiesWritableAuxiliariesDisabled());
        assertTrue(result.isPropertiesWritableAuxiliariesEnabled());
    }

    @Test
    public void test_constructor_00104() {
        int flag = CharacteristicExtendedProperties.PROPERTIES_RELIABLE_WRITE_ENABLED | CharacteristicExtendedProperties.PROPERTIES_WRITABLE_AUXILIARIES_ENABLED;
        byte[] data = new byte[] { (byte) flag, (byte) (flag >> 8) };

        CharacteristicExtendedProperties result = new CharacteristicExtendedProperties(true, true);
        assertArrayEquals(data, result.getProperties());
        assertFalse(result.isPropertiesReliableWriteDisabled());
        assertTrue(result.isPropertiesReliableWriteEnabled());
        assertFalse(result.isPropertiesWritableAuxiliariesDisabled());
        assertTrue(result.isPropertiesWritableAuxiliariesEnabled());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        CharacteristicExtendedProperties result1 = new CharacteristicExtendedProperties(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        CharacteristicExtendedProperties result1 = new CharacteristicExtendedProperties(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] data = getData();

        CharacteristicExtendedProperties result1 = new CharacteristicExtendedProperties(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00004() {
        byte[] data = getData();

        CharacteristicExtendedProperties result1 = new CharacteristicExtendedProperties(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
