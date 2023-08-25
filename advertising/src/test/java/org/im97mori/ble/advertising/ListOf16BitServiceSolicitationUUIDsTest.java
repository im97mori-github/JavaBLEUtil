package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

@SuppressWarnings("unused")
public class ListOf16BitServiceSolicitationUUIDsTest {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
        data[2] = 0;
        data[3] = 0;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
        data[2] = 127;
        data[3] = 127;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
        data[2] = 0;
        data[3] = 127;
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
        data[2] = 127;
        data[3] = 0;
        data_00004 = data;
    }
    
    private static final byte[] data_00005;
    static {
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
        data[2] = (byte) 0b11111111;
        data[3] = (byte) 0b11111111;
        data_00005 = data;
    }
    
    private static final byte[] data_00006;
    static {
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
        data[2] = 0;
        data[3] = (byte) 0b11111111;
        data_00006 = data;
    }
    
    private static final byte[] data_00007;
    static {
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
        data[2] = (byte) 0b11111111;
        data[3] = 0;
        data_00007 = data;
    }
    
    private static final byte[] data_00008;
    static {
        byte[] data = new byte[2];
        data[0] = 1;
        data[1] = LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
        data_00008 = data;
    }
    
    private static final byte[] data_00009;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
        data[2] = 1;
        data[3] = 2;
        data[4] = 3;
        data[5] = 4;
        data_00009 = data;
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

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("00000000-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("00007f7f-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00003() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("00007f00-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00004() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("0000007f-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00005() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("0000ffff-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00006() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("0000ff00-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00007() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("000000ff-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00008() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertEquals(1, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(0, result1.getUuidList().size());
	}

	@Test
	public void test_constructor_1_00009() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertEquals(5, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(2, result1.getUuidList().size());
		assertEquals(UUID.fromString("00000201-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
		assertEquals(UUID.fromString("00000403-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(1));
	}

	@Test
	public void test_constructor_1_00101() {
		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs();
		assertEquals(1, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(0, result1.getUuidList().size());
	}

	@Test
	public void test_constructor_1_00102() {
		UUID uuid1 = UUID.randomUUID();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(uuid1);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(uuid1, result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_1_00103() {
		UUID uuid1 = UUID.randomUUID();
		UUID uuid2 = UUID.randomUUID();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(uuid1, uuid2);
		assertEquals(5, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(2, result1.getUuidList().size());
		assertEquals(uuid1, result1.getUuidList().get(0));
		assertEquals(uuid2, result1.getUuidList().get(1));
	}

	@Test
	public void test_constructor_1_00104() {
		UUID uuid1 = UUID.randomUUID();
		UUID uuid2 = UUID.randomUUID();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(
				Arrays.asList(uuid1, uuid2));
		assertEquals(5, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(2, result1.getUuidList().size());
		assertEquals(uuid1, result1.getUuidList().get(0));
		assertEquals(uuid2, result1.getUuidList().get(1));
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("00000000-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("00007f7f-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00003() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("00007f00-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00004() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("0000007f-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00005() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("0000ffff-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00006() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("0000ff00-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00007() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0);
		assertEquals(3, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getUuidList().size());
		assertEquals(UUID.fromString("000000ff-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
	}

	@Test
	public void test_constructor_2_00008() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0);
		assertEquals(1, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(0, result1.getUuidList().size());
	}

	@Test
	public void test_constructor_2_00009() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0);
		assertEquals(5, result1.getLength());
		assertEquals(LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE, result1.getDataType());
		assertEquals(2, result1.getUuidList().size());
		assertEquals(UUID.fromString("00000201-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(0));
		assertEquals(UUID.fromString("00000403-0000-1000-8000-00805F9B34FB"), result1.getUuidList().get(1));
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00004() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00005() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00006() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00007() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00008() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00009() {
		byte[] data = getData();

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00101() {
		byte[] data = new byte[2];
		data[0] = 1;
		data[1] = LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs();
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00102() {
		UUID uuid1 = UUID.randomUUID();
		byte[] data = new byte[4];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) 3);
		byteBuffer.put((byte) LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE);
		byteBuffer.putShort((short) ((uuid1.getMostSignificantBits() << 16) >> 48));

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(uuid1);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00103() {
		UUID uuid1 = UUID.randomUUID();
		UUID uuid2 = UUID.randomUUID();
		byte[] data = new byte[6];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) 5);
		byteBuffer.put((byte) LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE);
		byteBuffer.putShort((short) ((uuid1.getMostSignificantBits() << 16) >> 48));
		byteBuffer.putShort((short) ((uuid2.getMostSignificantBits() << 16) >> 48));

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(uuid1, uuid2);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00104() {
		UUID uuid1 = UUID.randomUUID();
		UUID uuid2 = UUID.randomUUID();
		byte[] data = new byte[6];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) 5);
		byteBuffer.put((byte) LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE);
		byteBuffer.putShort((short) ((uuid1.getMostSignificantBits() << 16) >> 48));
		byteBuffer.putShort((short) ((uuid2.getMostSignificantBits() << 16) >> 48));

		ListOf16BitServiceSolicitationUUIDs result1 = new ListOf16BitServiceSolicitationUUIDs(
				Arrays.asList(uuid1, uuid2));
		assertArrayEquals(data, result1.getBytes());
	}

}
