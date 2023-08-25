package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class CompleteListOf32BitServiceUUIDsTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 0x00;
        data[3] = 0x00;
        data[4] = 0x00;
        data[5] = 0x00;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 127;
        data[3] = 127;
        data[4] = 127;
        data[5] = 127;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 127;
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 127;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data_00004 = data;
    }

    private static final byte[] data_00005;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = (byte) 0b11111111;
        data[3] = (byte) 0b11111111;
        data[4] = (byte) 0b11111111;
        data[5] = (byte) 0b11111111;
        data_00005 = data;
    }

    private static final byte[] data_00006;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = (byte) 0b11111111;
        data_00006 = data;
    }

    private static final byte[] data_00007;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = (byte) 0b11111111;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data_00007 = data;
    }

    private static final byte[] data_00008;
    static {
        byte[] data = new byte[2];
        data[0] = 1;
        data[1] = COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data_00008 = data;
    }

    private static final byte[] data_00009;
    static {
        byte[] data = new byte[10];
        data[0] = 9;
        data[1] = COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 1;
        data[3] = 2;
        data[4] = 3;
        data[5] = 4;
        data[6] = 5;
        data[7] = 6;
        data[8] = 7;
        data[9] = 8;
        data_00009 = data;
    }
    //@formatter:on

    @Test
    public void test_constructor_1_00001() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_1_00002() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("7f7f7f7f-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_1_00003() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("7f000000-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_1_00004() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("0000007f-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_1_00005() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("ffffffff-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_1_00006() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("ff000000-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_1_00007() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("000000ff-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_1_00008() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertEquals(1, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(0, result1.getUuidList().size());
    }

    @Test
    public void test_constructor_1_00009() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertEquals(9, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(2, result1.getUuidList().size());
        assertEquals(UUID.fromString("04030201-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
        assertEquals(UUID.fromString("08070605-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(1));
    }

    @Test
    public void test_constructor_1_00101() {
        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs();
        assertEquals(1, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(0, result1.getUuidList().size());
    }

    @Test
    public void test_constructor_1_00102() {
        UUID uuid1 = UUID.randomUUID();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(uuid1);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(uuid1, result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_1_00103() {
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(uuid1, uuid2);
        assertEquals(9, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(2, result1.getUuidList().size());
        assertEquals(uuid1, result1.getUuidList().get(0));
        assertEquals(uuid2, result1.getUuidList().get(1));
    }

    @Test
    public void test_constructor_1_00104() {
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(Arrays.asList(uuid1, uuid2));
        assertEquals(9, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(2, result1.getUuidList().size());
        assertEquals(uuid1, result1.getUuidList().get(0));
        assertEquals(uuid2, result1.getUuidList().get(1));
    }

    @Test
    public void test_constructor_2_00001() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(UUID.fromString("00000000-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_2_00002() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("7f7f7f7f-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_2_00003() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("7f000000-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_2_00004() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("0000007f-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_2_00005() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("ffffffff-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_2_00006() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("ff000000-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_2_00007() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(1, result1.getUuidList().size());
        assertEquals(UUID.fromString("000000ff-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
    }

    @Test
    public void test_constructor_2_00008() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0);
        assertEquals(1, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(0, result1.getUuidList().size());
    }

    @Test
    public void test_constructor_2_00009() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0);
        assertEquals(9, result1.getLength());
        assertEquals(COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
        assertEquals(2, result1.getUuidList().size());
        assertEquals(UUID.fromString("04030201-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
        assertEquals(UUID.fromString("08070605-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(1));
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00004() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00005() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00006() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00007() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00008() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00009() {
        byte[] data = getData();

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00101() {
        byte[] data = new byte[2];
        data[0] = 1;
        data[1] = COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs();
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00102() {
        UUID uuid1 = UUID.randomUUID();
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) 5);
        byteBuffer.put((byte) COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE);
        byteBuffer.putInt((int) (uuid1.getMostSignificantBits() >> 32));

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(uuid1);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00103() {
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        byte[] data = new byte[10];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) 9);
        byteBuffer.put((byte) COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE);
        byteBuffer.putInt((int) (uuid1.getMostSignificantBits() >> 32));
        byteBuffer.putInt((int) (uuid2.getMostSignificantBits() >> 32));

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(uuid1, uuid2);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00104() {
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();
        byte[] data = new byte[10];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) 9);
        byteBuffer.put((byte) COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE);
        byteBuffer.putInt((int) (uuid1.getMostSignificantBits() >> 32));
        byteBuffer.putInt((int) (uuid2.getMostSignificantBits() >> 32));

        CompleteListOf32BitServiceUUIDs result1 = new CompleteListOf32BitServiceUUIDs(Arrays.asList(uuid1, uuid2));
        assertArrayEquals(data, result1.getBytes());
    }
}
