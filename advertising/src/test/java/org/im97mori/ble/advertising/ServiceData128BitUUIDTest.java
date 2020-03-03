package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_CHANNEL_MAP_UPDATE_INDICATION;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.UUID;

import org.junit.Test;

@SuppressWarnings("unused")
public class ServiceData128BitUUIDTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0x00;
        data[3] = 0x00;
        data[4] = 0x00;
        data[5] = 0x00;
        data[6] = 0x00;
        data[7] = 0x00;
        data[8] = 0x00;
        data[9] = 0x00;
        data[10] = 0x00;
        data[11] = 0x00;
        data[12] = 0x00;
        data[13] = 0x00;
        data[14] = 0x00;
        data[15] = 0x00;
        data[16] = 0x00;
        data[17] = 0x00;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 127;
        data[3] = 127;
        data[4] = 127;
        data[5] = 127;
        data[6] = 127;
        data[7] = 127;
        data[8] = 127;
        data[9] = 127;
        data[10] = 127;
        data[11] = 127;
        data[12] = 127;
        data[13] = 127;
        data[14] = 127;
        data[15] = 127;
        data[16] = 127;
        data[17] = 127;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 127;
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 127;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;
        data_00004 = data;
    }

    private static final byte[] data_00005;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = (byte) 0b11111111;
        data[3] = (byte) 0b11111111;
        data[4] = (byte) 0b11111111;
        data[5] = (byte) 0b11111111;
        data[6] = (byte) 0b11111111;
        data[7] = (byte) 0b11111111;
        data[8] = (byte) 0b11111111;
        data[9] = (byte) 0b11111111;
        data[10] = (byte) 0b11111111;
        data[11] = (byte) 0b11111111;
        data[12] = (byte) 0b11111111;
        data[13] = (byte) 0b11111111;
        data[14] = (byte) 0b11111111;
        data[15] = (byte) 0b11111111;
        data[16] = (byte) 0b11111111;
        data[17] = (byte) 0b11111111;
        data_00005 = data;
    }

    private static final byte[] data_00006;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = (byte) 0b11111111;
        data_00006 = data;
    }

    private static final byte[] data_00007;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = (byte) 0b11111111;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;
        data_00007 = data;
    }

    private static final byte[] data_00008;
    static {
        byte[] additionalData = new byte[1];
        additionalData[0] = 0;

        byte[] data = new byte[18 + additionalData.length];
        data[0] = (byte) (17 + additionalData.length);
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;
        
        System.arraycopy(additionalData, 0, data, 18, additionalData.length);
        data_00008 = data;
    }

    private static final byte[] data_00009;
    static {
        byte[] additionalData = new byte[1];
        additionalData[0] = 127;

        byte[] data = new byte[18 + additionalData.length];
        data[0] = (byte) (17 + additionalData.length);
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;

        System.arraycopy(additionalData, 0, data, 18, additionalData.length);
        data_00009 = data;
    }

    private static final byte[] data_00010;
    static {
        byte[] additionalData = new byte[1];
        additionalData[0] = (byte) 0b11111111;

        byte[] data = new byte[18 + additionalData.length];
        data[0] = (byte) (17 + additionalData.length);
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;

        System.arraycopy(additionalData, 0, data, 18, additionalData.length);
        data_00010 = data;
    }

    private static final byte[] data_00011;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = 0;
        additionalData[1] = 0;

        byte[] data = new byte[18 + additionalData.length];
        data[0] = (byte) (17 + additionalData.length);
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;

        System.arraycopy(additionalData, 0, data, 18, additionalData.length);
        data_00011 = data;
    }

    private static final byte[] data_00012;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = 127;
        additionalData[1] = 127;

        byte[] data = new byte[18 + additionalData.length];
        data[0] = (byte) (17 + additionalData.length);
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;

        System.arraycopy(additionalData, 0, data, 18, additionalData.length);
        data_00012 = data;
    }

    private static final byte[] data_00013;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = 0;
        additionalData[1] = 127;

        byte[] data = new byte[18 + additionalData.length];
        data[0] = (byte) (17 + additionalData.length);
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;

        System.arraycopy(additionalData, 0, data, 18, additionalData.length);
        data_00013 = data;
    }

    private static final byte[] data_00014;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = (byte) 0b11111111;
        additionalData[1] = (byte) 0b11111111;

        byte[] data = new byte[18 + additionalData.length];
        data[0] = (byte) (17 + additionalData.length);
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;

        System.arraycopy(additionalData, 0, data, 18, additionalData.length);
        data_00014 = data;
    }

    private static final byte[] data_00015;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = 0;
        additionalData[1] = (byte) 0b11111111;

        byte[] data = new byte[18 + additionalData.length];
        data[0] = (byte) (17 + additionalData.length);
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;

        System.arraycopy(additionalData, 0, data, 18, additionalData.length);
        data_00015 = data;
    }

    private static final byte[] data_00016;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = (byte) 0b11111111;
        additionalData[1] = 0;

        byte[] data = new byte[18 + additionalData.length];
        data[0] = (byte) (17 + additionalData.length);
        data[1] = DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;

        System.arraycopy(additionalData, 0, data, 18, additionalData.length);
        data_00016 = data;
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

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(17, result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(0, result1.getAdditionalServiceData().length);
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(17, result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("7f7f7f7f-7f7f-7f7f-7f7f-7f7f7f7f7f7f"), result1.getUuid());
        assertEquals(0, result1.getAdditionalServiceData().length);
    }

    @Test
    public void test_constructor_00003() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(17, result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("7f000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(0, result1.getAdditionalServiceData().length);
    }

    @Test
    public void test_constructor_00004() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(17, result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-00000000007f"), result1.getUuid());
        assertEquals(0, result1.getAdditionalServiceData().length);
    }

    @Test
    public void test_constructor_00005() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(17, result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("ffffffff-ffff-ffff-ffff-ffffffffffff"), result1.getUuid());
        assertEquals(0, result1.getAdditionalServiceData().length);
    }

    @Test
    public void test_constructor_00006() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(17, result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("ff000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(0, result1.getAdditionalServiceData().length);
    }

    @Test
    public void test_constructor_00007() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(17, result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-0000000000ff"), result1.getUuid());
        assertEquals(0, result1.getAdditionalServiceData().length);
    }

    @Test
    public void test_constructor_00008() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(data[0], result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(data[0] - 17, result1.getAdditionalServiceData().length);
        assertArrayEquals(Arrays.copyOfRange(data, 18, data.length), result1.getAdditionalServiceData());
    }

    @Test
    public void test_constructor_00009() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(data[0], result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(data[0] - 17, result1.getAdditionalServiceData().length);
        assertArrayEquals(Arrays.copyOfRange(data, 18, data.length), result1.getAdditionalServiceData());
    }

    @Test
    public void test_constructor_00010() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(data[0], result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(data[0] - 17, result1.getAdditionalServiceData().length);
        assertArrayEquals(Arrays.copyOfRange(data, 18, data.length), result1.getAdditionalServiceData());
    }

    @Test
    public void test_constructor_00011() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(data[0], result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(data[0] - 17, result1.getAdditionalServiceData().length);
        assertArrayEquals(Arrays.copyOfRange(data, 18, data.length), result1.getAdditionalServiceData());
    }

    @Test
    public void test_constructor_00012() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(data[0], result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(data[0] - 17, result1.getAdditionalServiceData().length);
        assertArrayEquals(Arrays.copyOfRange(data, 18, data.length), result1.getAdditionalServiceData());
    }

    @Test
    public void test_constructor_00013() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(data[0], result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(data[0] - 17, result1.getAdditionalServiceData().length);
        assertArrayEquals(Arrays.copyOfRange(data, 18, data.length), result1.getAdditionalServiceData());
    }

    @Test
    public void test_constructor_00014() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(data[0], result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(data[0] - 17, result1.getAdditionalServiceData().length);
        assertArrayEquals(Arrays.copyOfRange(data, 18, data.length), result1.getAdditionalServiceData());
    }

    @Test
    public void test_constructor_00015() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(data[0], result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(data[0] - 17, result1.getAdditionalServiceData().length);
        assertArrayEquals(Arrays.copyOfRange(data, 18, data.length), result1.getAdditionalServiceData());
    }

    @Test
    public void test_constructor_00016() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertEquals(data[0], result1.getLength());
        assertEquals(DATA_TYPE_SERVICE_DATA_128_BIT_UUID, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuid());
        assertEquals(data[0] - 17, result1.getAdditionalServiceData().length);
        assertArrayEquals(Arrays.copyOfRange(data, 18, data.length), result1.getAdditionalServiceData());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00004() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00005() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00006() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00007() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00008() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00009() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00010() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00011() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00012() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00013() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00014() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00015() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00016() {
        byte[] data = getData();

        ServiceData128BitUUID result1 = new ServiceData128BitUUID(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

}
