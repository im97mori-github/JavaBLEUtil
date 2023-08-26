package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.AdvertisingInterval.ADVERTISING_INTERVAL_UNIT_MILLIS;
import static org.im97mori.ble.constants.DataType.ADVERTISING_INTERVAL_LONG_DATA_TYPE;
import static org.im97mori.ble.constants.DataType.ADVERTISING_INTERVAL_LONG_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class AdvertisingIntervalLongTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[5];
        data[0] = 4;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = 0x00;
        data[3] = 0x00;
        data[4] = 0x00;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[5];
        data[0] = 4;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = 0x7f;
        data[3] = 0x7f;
        data[4] = 0x7f;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[5];
        data[0] = 4;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = 0x00;
        data[3] = 0x00;
        data[4] = 0x7f;
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[5];
        data[0] = 4;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = 0x7f;
        data[3] = 0x00;
        data[4] = 0x00;
        data_00004 = data;
    }

    private static final byte[] data_00005;
    static {
        byte[] data = new byte[5];
        data[0] = 4;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = (byte) 0b11111111;
        data[3] = (byte) 0b11111111;
        data[4] = (byte) 0b11111111;
        data_00005 = data;
    }

    private static final byte[] data_00006;
    static {
        byte[] data = new byte[5];
        data[0] = 4;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = 0;
        data[3] = 0;
        data[4] = (byte) 0b11111111;
        data_00006 = data;
    }

    private static final byte[] data_00007;
    static {
        byte[] data = new byte[5];
        data[0] = 4;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = (byte) 0b11111111;
        data[3] = 0;
        data[4] = 0;
        data_00007 = data;
    }

    private static final byte[] data_00008;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = 0x00;
        data[3] = 0x00;
        data[4] = 0x00;
        data[5] = 0x00;
        data_00008 = data;
    }

    private static final byte[] data_00009;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = 0x7f;
        data[3] = 0x7f;
        data[4] = 0x7f;
        data[5] = 0x7f;
        data_00009 = data;
    }

    private static final byte[] data_00010;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = 0x00;
        data[3] = 0x00;
        data[4] = 0x00;
        data[5] = 0x7f;
        data_00010 = data;
    }

    private static final byte[] data_00011;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = 0x7f;
        data[3] = 0x00;
        data[4] = 0x00;
        data[5] = 0x00;
        data_00011 = data;
    }

    private static final byte[] data_00012;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = (byte) 0b11111111;
        data[3] = (byte) 0b11111111;
        data[4] = (byte) 0b11111111;
        data[5] = (byte) 0b11111111;
        data_00012 = data;
    }

    private static final byte[] data_00013;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = 0;
        data[3] = 0;
        data[4] = 0;
        data[5] = (byte) 0b11111111;
        data_00013 = data;
    }

    private static final byte[] data_00014;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = ADVERTISING_INTERVAL_LONG_DATA_TYPE;
        data[2] = (byte) 0b11111111;
        data[3] = 0;
        data[4] = 0;
        data[5] = 0;
        data_00014 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0L, result1.getAdvertisingIntervalLong());
		assertEquals(0L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f7f7fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f7f7fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00003() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f0000L, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f0000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00004() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x00007fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x00007fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00005() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xffffffL, result1.getAdvertisingIntervalLong());
		assertEquals(0xffffffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00006() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xff0000L, result1.getAdvertisingIntervalLong());
		assertEquals(0xff0000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00007() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x0000ffL, result1.getAdvertisingIntervalLong());
		assertEquals(0x0000ffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}
	
	@Test
	public void test_constructor_1_00008() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0L, result1.getAdvertisingIntervalLong());
		assertEquals(0L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}
	
	@Test
	public void test_constructor_1_00009() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f7f7f7fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f7f7f7fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00010() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f000000L, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f000000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00011() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x0000007fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x0000007fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00012() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xffffffffL, result1.getAdvertisingIntervalLong());
		assertEquals(0xffffffffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00013() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xff000000L, result1.getAdvertisingIntervalLong());
		assertEquals(0xff000000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_1_00014() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x000000ffL, result1.getAdvertisingIntervalLong());
		assertEquals(0x000000ffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0L, result1.getAdvertisingIntervalLong());
		assertEquals(0L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f7f7fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f7f7fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00003() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f0000L, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f0000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00004() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x00007fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x00007fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00005() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xffffffL, result1.getAdvertisingIntervalLong());
		assertEquals(0xffffffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00006() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xff0000L, result1.getAdvertisingIntervalLong());
		assertEquals(0xff0000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00007() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x0000ffL, result1.getAdvertisingIntervalLong());
		assertEquals(0x0000ffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}
	

	@Test
	public void test_constructor_2_00008() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0L, result1.getAdvertisingIntervalLong());
		assertEquals(0L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}
	
	@Test
	public void test_constructor_2_00009() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f7f7f7fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f7f7f7fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00010() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f000000L, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f000000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00011() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x0000007fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x0000007fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00012() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xffffffffL, result1.getAdvertisingIntervalLong());
		assertEquals(0xffffffffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00013() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xff000000L, result1.getAdvertisingIntervalLong());
		assertEquals(0xff000000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_2_00014() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0);
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x000000ffL, result1.getAdvertisingIntervalLong());
		assertEquals(0x000000ffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}
	
	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(false, BLEUtils.createUInt24(data, 2));
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0L, result1.getAdvertisingIntervalLong());
		assertEquals(0L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00002() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(false, BLEUtils.createUInt24(data, 2));
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f7f7fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f7f7fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00003() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(false, BLEUtils.createUInt24(data, 2));
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f0000L, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f0000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00004() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(false, BLEUtils.createUInt24(data, 2));
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x00007fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x00007fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00005() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(false, BLEUtils.createUInt24(data, 2));
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xffffffL, result1.getAdvertisingIntervalLong());
		assertEquals(0xffffffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00006() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(false, BLEUtils.createUInt24(data, 2));
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xff0000L, result1.getAdvertisingIntervalLong());
		assertEquals(0xff0000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00007() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(false, BLEUtils.createUInt24(data, 2));
		assertEquals(4, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x0000ffL, result1.getAdvertisingIntervalLong());
		assertEquals(0x0000ffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00008() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(true, BLEUtils.createUInt32(data, 2));
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0L, result1.getAdvertisingIntervalLong());
		assertEquals(0L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}
	
	@Test
	public void test_constructor_3_00009() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(true, BLEUtils.createUInt32(data, 2));
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f7f7f7fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f7f7f7fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00010() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(true, BLEUtils.createUInt32(data, 2));
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x7f000000L, result1.getAdvertisingIntervalLong());
		assertEquals(0x7f000000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00011() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(true, BLEUtils.createUInt32(data, 2));
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x0000007fL, result1.getAdvertisingIntervalLong());
		assertEquals(0x0000007fL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00012() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(true, BLEUtils.createUInt32(data, 2));
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xffffffffL, result1.getAdvertisingIntervalLong());
		assertEquals(0xffffffffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00013() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(true, BLEUtils.createUInt32(data, 2));
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0xff000000L, result1.getAdvertisingIntervalLong());
		assertEquals(0xff000000L * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}

	@Test
	public void test_constructor_3_00014() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(true, BLEUtils.createUInt32(data, 2));
		assertEquals(5, result1.getLength());
		assertEquals(ADVERTISING_INTERVAL_LONG_DATA_TYPE, result1.getDataType());
		assertEquals(0x000000ffL, result1.getAdvertisingIntervalLong());
		assertEquals(0x000000ffL * ADVERTISING_INTERVAL_UNIT_MILLIS, result1.getAdvertisingIntervalLongMillis(), 0);
	}
	
	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00004() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00005() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00006() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00007() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00008() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00009() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00010() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00011() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00012() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00013() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00014() {
		byte[] data = getData();

		AdvertisingIntervalLong result1 = new AdvertisingIntervalLong(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}
	
}
