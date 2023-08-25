package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.ENCRYPTED_ADVERTISING_DATA_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class EncryptedDataTest extends TestBase {

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
