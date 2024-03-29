package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class IncompleteListOf128BitServiceUUIDsTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
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
        data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
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
        data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 0x01;
        data[3] = 0x02;
        data[4] = 0x03;
        data[5] = 0x04;
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
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0x01;
        data[7] = 0x02;
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
        data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0x01;
        data[9] = 0x02;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;
        data_00005 = data;
    }

    private static final byte[] data_00006;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0x01;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        data[14] = 0;
        data[15] = 0;
        data[16] = 0;
        data[17] = 0;
        data_00006 = data;
    }

    private static final byte[] data_00007;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data[6] = 0;
        data[7] = 0;
        data[8] = 0;
        data[9] = 0;
        data[10] = 0;
        data[11] = 0x01;
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
		byte[] data = new byte[18];
        data[0] = 17;
        data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
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
        data[12] = 0x01;
        data[13] = 0x02;
        data[14] = 0x03;
        data[15] = 0x04;
        data[16] = 0x05;
        data[17] = 0x06;
        data_00008 = data;
    }

    private static final byte[] data_00009;
    static {
		byte[] data = new byte[2];
        data[0] = 1;
        data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data_00009 = data;
    }

	private static final byte[] data_00010;
    static {
        byte[] data = new byte[34];
        data[0] = 33;
        data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
        data[2] = 0x01;
        data[3] = 0x02;
        data[4] = 0x03;
        data[5] = 0x04;
        data[6] = 0x05;
        data[7] = 0x06;
        data[8] = 0x07;
        data[9] = 0x08;
        data[10] = 0x09;
        data[11] = 0x0a;
        data[12] = 0x0b;
        data[13] = 0x0c;
        data[14] = 0x0d;
        data[15] = 0x0e;
        data[16] = 0x0f;
        data[17] = 0x10;
        data[18] = 0x11;
        data[19] = 0x12;
        data[20] = 0x13;
        data[21] = 0x14;
        data[22] = 0x15;
        data[23] = 0x16;
        data[24] = 0x17;
        data[25] = 0x18;
        data[26] = 0x19;
        data[27] = 0x1a;
        data[28] = 0x1b;
        data[29] = 0x1c;
        data[30] = 0x1d;
        data[31] = 0x1e;
        data[32] = 0x1f;
        data[33] = 0x20;
        data_00010 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("7f7f7f7f-7f7f-7f7f-7f7f-7f7f7f7f7f7f"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00003() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("04030201-0000-0000-0000-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00004() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0201-0000-0000-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00005() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0000-0201-0000-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00006() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0000-0000-0100-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00007() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0000-0000-0001-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00008() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0000-0000-0000-060504030201"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00009() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertEquals(1, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(0, result1.getUuidList().size());
	}

	@Test
	public void test_constructor_1_00010() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertEquals(33, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(2, result1.getUuidList().size());
		assertEquals(UUID.fromString("04030201-0605-0807-090a-100f0e0d0c0b"), result1.getUuidList().get(0));
		assertEquals(UUID.fromString("14131211-1615-1817-191a-201f1e1d1c1b"), result1.getUuidList().get(1));
	}

	@Test
	public void test_constructor_1_00101() {
		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs();
		assertEquals(1, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(0, result1.getUuidList().size());
	}

	@Test
	public void test_constructor_1_00102() {
		UUID uuid1 = UUID.randomUUID();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(uuid1);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(uuid1, result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00103() {
		UUID uuid1 = UUID.randomUUID();
		UUID uuid2 = UUID.randomUUID();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(uuid1, uuid2);
		assertEquals(33, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(2, result1.getUuidList().size());
		assertEquals(uuid1, result1.getUuidList().get(0));
		assertEquals(uuid2, result1.getUuidList().get(1));
	}

	@Test
	public void test_constructor_1_00104() {
		UUID uuid1 = UUID.randomUUID();
		UUID uuid2 = UUID.randomUUID();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(Arrays.asList(uuid1, uuid2));
		assertEquals(33, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(2, result1.getUuidList().size());
		assertEquals(uuid1, result1.getUuidList().get(0));
		assertEquals(uuid2, result1.getUuidList().get(1));
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0000-0000-0000-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("7f7f7f7f-7f7f-7f7f-7f7f-7f7f7f7f7f7f"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00003() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("04030201-0000-0000-0000-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00004() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0201-0000-0000-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00005() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0000-0201-0000-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00006() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0000-0000-0100-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00007() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0000-0000-0001-000000000000"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00008() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0);
		assertEquals(17, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(UUID.fromString("00000000-0000-0000-0000-060504030201"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00009() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0);
		assertEquals(1, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(0, result1.getUuidList().size());
	}

	@Test
	public void test_constructor_2_00010() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0);
		assertEquals(33, result1.getLength());
		assertEquals(INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(2, result1.getUuidList().size());
		assertEquals(UUID.fromString("04030201-0605-0807-090a-100f0e0d0c0b"), result1.getUuidList().get(0));
		assertEquals(UUID.fromString("14131211-1615-1817-191a-201f1e1d1c1b"), result1.getUuidList().get(1));
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00004() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00005() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00006() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00007() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00008() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00009() {
		byte[] data = getData();

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00101() {
		byte[] data = new byte[2];
		data[0] = 1;
		data[1] = INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs();
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00102() {
		UUID uuid1 = UUID.randomUUID();
		byte[] data = new byte[18];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) 17);
		byteBuffer.put((byte) INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE);

		long msb = uuid1.getMostSignificantBits();
		byteBuffer.putInt((int) (msb >> 32));
		byteBuffer.putShort((short) (msb >> 16));
		byteBuffer.putShort((short) msb);

		long lsb = uuid1.getLeastSignificantBits();
		byteBuffer.put((byte) (lsb >> 56));
		byteBuffer.put((byte) (lsb >> 48));
		byteBuffer.putInt((int) lsb);
		byteBuffer.putShort((short) (lsb >> 32));

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(uuid1);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00103() {
		UUID uuid1 = UUID.randomUUID();
		UUID uuid2 = UUID.randomUUID();
		byte[] data = new byte[34];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) 33);
		byteBuffer.put((byte) INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE);

		long msb = uuid1.getMostSignificantBits();
		byteBuffer.putInt((int) (msb >> 32));
		byteBuffer.putShort((short) (msb >> 16));
		byteBuffer.putShort((short) msb);

		long lsb = uuid1.getLeastSignificantBits();
		byteBuffer.put((byte) (lsb >> 56));
		byteBuffer.put((byte) (lsb >> 48));
		byteBuffer.putInt((int) lsb);
		byteBuffer.putShort((short) (lsb >> 32));

		msb = uuid2.getMostSignificantBits();
		byteBuffer.putInt((int) (msb >> 32));
		byteBuffer.putShort((short) (msb >> 16));
		byteBuffer.putShort((short) msb);

		lsb = uuid2.getLeastSignificantBits();
		byteBuffer.put((byte) (lsb >> 56));
		byteBuffer.put((byte) (lsb >> 48));
		byteBuffer.putInt((int) lsb);
		byteBuffer.putShort((short) (lsb >> 32));

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(uuid1, uuid2);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00104() {
		UUID uuid1 = UUID.randomUUID();
		UUID uuid2 = UUID.randomUUID();
		byte[] data = new byte[34];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) 33);
		byteBuffer.put((byte) INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE);

		long msb = uuid1.getMostSignificantBits();
		byteBuffer.putInt((int) (msb >> 32));
		byteBuffer.putShort((short) (msb >> 16));
		byteBuffer.putShort((short) msb);

		long lsb = uuid1.getLeastSignificantBits();
		byteBuffer.put((byte) (lsb >> 56));
		byteBuffer.put((byte) (lsb >> 48));
		byteBuffer.putInt((int) lsb);
		byteBuffer.putShort((short) (lsb >> 32));

		msb = uuid2.getMostSignificantBits();
		byteBuffer.putInt((int) (msb >> 32));
		byteBuffer.putShort((short) (msb >> 16));
		byteBuffer.putShort((short) msb);

		lsb = uuid2.getLeastSignificantBits();
		byteBuffer.put((byte) (lsb >> 56));
		byteBuffer.put((byte) (lsb >> 48));
		byteBuffer.putInt((int) lsb);
		byteBuffer.putShort((short) (lsb >> 32));

		IncompleteListOf128BitServiceUUIDs result1 = new IncompleteListOf128BitServiceUUIDs(Arrays.asList(uuid1, uuid2));
		assertArrayEquals(data, result1.getBytes());
	}

}
