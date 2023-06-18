package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.ENCRYPTED_ADVERTISING_DATA_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

@SuppressWarnings("unused")
public class EncryptedDataTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[12];
        data[0] = 11;
        data[1] = ENCRYPTED_ADVERTISING_DATA_DATA_TYPE;
        data[2] = 1;
        data[3] = 2;
        data[4] = 3;
        data[5] = 4;
        data[6] = 5;
        data[7] = 6;
        data[8] = 7;
        data[9] = 8;
        data[10] = 9;
        data[11] = 10;
        data_00001 = data;
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
    public void test_constructor_1_00001() {
        byte[] data = getData();

        EncryptedData result1 = new EncryptedData(data, 0, data[0]);
        assertEquals(11, result1.getLength());
        assertEquals(ENCRYPTED_ADVERTISING_DATA_DATA_TYPE, result1.getDataType());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 7), result1.getRandomizer());
        assertArrayEquals(Arrays.copyOfRange(data, 7, 8), result1.getPayload());
        assertArrayEquals(Arrays.copyOfRange(data, 8, 12), result1.getMic());
    }

    @Test
    public void test_constructor_2_00001() {
        byte[] data = getData();

        EncryptedData result1 = new EncryptedData(data, 0);
        assertEquals(11, result1.getLength());
        assertEquals(ENCRYPTED_ADVERTISING_DATA_DATA_TYPE, result1.getDataType());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 7), result1.getRandomizer());
        assertArrayEquals(Arrays.copyOfRange(data, 7, 8), result1.getPayload());
        assertArrayEquals(Arrays.copyOfRange(data, 8, 12), result1.getMic());
    }

    @Test
    public void test_constructor_3_00001() {
        byte[] data = getData();

        byte[] randomizer = new byte[5];
        System.arraycopy(data, 2, randomizer, 0, 5);
        byte[] payload = new byte[data[0] - 10];
        System.arraycopy(data, 7, payload, 0, data[0] - 10);
        byte[] mic = new byte[4];
        System.arraycopy(data, data.length - 4, mic, 0, 4);
        EncryptedData result1 = new EncryptedData(randomizer, payload, mic);
        assertEquals(11, result1.getLength());
        assertEquals(ENCRYPTED_ADVERTISING_DATA_DATA_TYPE, result1.getDataType());
        assertArrayEquals(randomizer, result1.getRandomizer());
        assertArrayEquals(payload, result1.getPayload());
        assertArrayEquals(mic, result1.getMic());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        EncryptedData result1 = new EncryptedData(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

}
