package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.FLAGS_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class FlagsTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = FLAGS_DATA_TYPE;
        data[2] = 0b00000001;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = FLAGS_DATA_TYPE;
        data[2] = 0b00000010;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = FLAGS_DATA_TYPE;
        data[2] = 0b00000100;
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = FLAGS_DATA_TYPE;
        data[2] = 0b00001000;
        data_00004 = data;
    }

    private static final byte[] data_00005;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = FLAGS_DATA_TYPE;
        data[2] = 0b00010000;
        data_00005 = data;
    }

    private static final byte[] data_00006;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = FLAGS_DATA_TYPE;
        data[2] = (byte) 0b11111111;
        data_00006 = data;
    }

    private static final byte[] data_00007;
    static {
        byte[] data = new byte[2];
        data[0] = 1;
        data[1] = FLAGS_DATA_TYPE;
        data_00007 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00000001, result1.getFlagsList().get(0).intValue());
		assertTrue(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00000010, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertTrue(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_1_00003() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00000100, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertTrue(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_1_00004() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00001000, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertTrue(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_1_00005() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00010000, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_1_00006() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b11111111, result1.getFlagsList().get(0).intValue());
		assertTrue(result1.isLeLimitedDiscoverableMode());
		assertTrue(result1.isLeGeneralDiscoverableMode());
		assertTrue(result1.isBrEdrNotSupported());
		assertTrue(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_1_00007() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertEquals(1, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0, result1.getFlagsList().size());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00000001, result1.getFlagsList().get(0).intValue());
		assertTrue(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00000010, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertTrue(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_2_00003() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00000100, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertTrue(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_2_00004() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00001000, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertTrue(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_2_00005() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00010000, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_2_00006() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b11111111, result1.getFlagsList().get(0).intValue());
		assertTrue(result1.isLeLimitedDiscoverableMode());
		assertTrue(result1.isLeGeneralDiscoverableMode());
		assertTrue(result1.isBrEdrNotSupported());
		assertTrue(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_2_00007() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0);
		assertEquals(1, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0, result1.getFlagsList().size());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

        List<Integer> flagsList = new ArrayList<>();
        for (int i = 2; i < data[0] + 1; i++) {
            flagsList.add(data[i] & 0xff);
        }
		Flags result1 = new Flags(flagsList);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00000001, result1.getFlagsList().get(0).intValue());
		assertTrue(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_3_00002() {
		byte[] data = getData();

        List<Integer> flagsList = new ArrayList<>();
        for (int i = 2; i < data[0] + 1; i++) {
            flagsList.add(data[i] & 0xff);
        }
		Flags result1 = new Flags(flagsList);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00000010, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertTrue(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_3_00003() {
		byte[] data = getData();

        List<Integer> flagsList = new ArrayList<>();
        for (int i = 2; i < data[0] + 1; i++) {
            flagsList.add(data[i] & 0xff);
        }
		Flags result1 = new Flags(flagsList);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00000100, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertTrue(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_3_00004() {
		byte[] data = getData();

        List<Integer> flagsList = new ArrayList<>();
        for (int i = 2; i < data[0] + 1; i++) {
            flagsList.add(data[i] & 0xff);
        }
		Flags result1 = new Flags(flagsList);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00001000, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertTrue(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_3_00005() {
		byte[] data = getData();

        List<Integer> flagsList = new ArrayList<>();
        for (int i = 2; i < data[0] + 1; i++) {
            flagsList.add(data[i] & 0xff);
        }
		Flags result1 = new Flags(flagsList);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b00010000, result1.getFlagsList().get(0).intValue());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_3_00006() {
		byte[] data = getData();

        List<Integer> flagsList = new ArrayList<>();
        for (int i = 2; i < data[0] + 1; i++) {
            flagsList.add(data[i] & 0xff);
        }
		Flags result1 = new Flags(flagsList);
		assertEquals(2, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(1, result1.getFlagsList().size());
		assertEquals(0b11111111, result1.getFlagsList().get(0).intValue());
		assertTrue(result1.isLeLimitedDiscoverableMode());
		assertTrue(result1.isLeGeneralDiscoverableMode());
		assertTrue(result1.isBrEdrNotSupported());
		assertTrue(result1.isSimultaneousController());
	}

	@Test
	public void test_constructor_3_00007() {
		byte[] data = getData();

        List<Integer> flagsList = new ArrayList<>();
        for (int i = 2; i < data[0] + 1; i++) {
            flagsList.add(data[i] & 0xff);
        }
		Flags result1 = new Flags(flagsList);
		assertEquals(1, result1.getLength());
		assertEquals(FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0, result1.getFlagsList().size());
		assertFalse(result1.isLeLimitedDiscoverableMode());
		assertFalse(result1.isLeGeneralDiscoverableMode());
		assertFalse(result1.isBrEdrNotSupported());
		assertFalse(result1.isSimultaneousController());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00004() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00005() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00006() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00007() {
		byte[] data = getData();

		Flags result1 = new Flags(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

}
