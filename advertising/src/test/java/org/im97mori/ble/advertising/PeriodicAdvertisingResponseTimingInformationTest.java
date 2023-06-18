package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

@SuppressWarnings("unused")
public class PeriodicAdvertisingResponseTimingInformationTest {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[10];
        data[0] = 9;
        data[1] = PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE;
        data[2] = 1;
		data[3] = 2;
		data[4] = 3;
		data[5] = 4;
		data[6] = 0x01;
		data[7] = 0x06;
		data[8] = 0x01;
		data[9] = 0x02;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[10];
        data[0] = 9;
        data[1] = PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE;
        data[2] = 1;
		data[3] = 2;
		data[4] = 3;
		data[5] = 4;
		data[6] = (byte) 0x80;
		data[7] = (byte) 0xff;
		data[8] = (byte) 0xfe;
		data[9] = (byte) 0xff;
        data_00002 = data;
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

		PeriodicAdvertisingResponseTimingInformation result1 = new PeriodicAdvertisingResponseTimingInformation(data, 0,
				data[0]);
		assertEquals(9, result1.getLength());
		assertEquals(PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 6), result1.getRspAa());
		assertEquals(BLEUtils.createUInt8(data, 6), result1.getNumSubevents());
		assertEquals(BLEUtils.createUInt8(data, 7), result1.getSubeventInterval());
		assertEquals(
				BLEUtils.createUInt8(data, 7)
						* PeriodicAdvertisingResponseTimingInformation.SUBEVENT_INTERVAL_UNIT_MILLIS,
				result1.getSubeventIntervalMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 8), result1.getResponseSlotDelay());
		assertEquals(
				BLEUtils.createUInt8(data, 8)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_DELAY_UNIT_MILLIS,
				result1.getResponseSlotDelayMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 9), result1.getResponseSlotSpacing());
		assertEquals(
				BLEUtils.createUInt8(data, 9)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_SPACING_UNIT_MILLIS,
				result1.getResponseSlotSpacingMillis(), 0);
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		PeriodicAdvertisingResponseTimingInformation result1 = new PeriodicAdvertisingResponseTimingInformation(data, 0,
				data[0]);
		assertEquals(9, result1.getLength());
		assertEquals(PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 6), result1.getRspAa());
		assertEquals(BLEUtils.createUInt8(data, 6), result1.getNumSubevents());
		assertEquals(BLEUtils.createUInt8(data, 7), result1.getSubeventInterval());
		assertEquals(
				BLEUtils.createUInt8(data, 7)
						* PeriodicAdvertisingResponseTimingInformation.SUBEVENT_INTERVAL_UNIT_MILLIS,
				result1.getSubeventIntervalMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 8), result1.getResponseSlotDelay());
		assertEquals(
				BLEUtils.createUInt8(data, 8)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_DELAY_UNIT_MILLIS,
				result1.getResponseSlotDelayMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 9), result1.getResponseSlotSpacing());
		assertEquals(
				BLEUtils.createUInt8(data, 9)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_SPACING_UNIT_MILLIS,
				result1.getResponseSlotSpacingMillis(), 0);
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		PeriodicAdvertisingResponseTimingInformation result1 = new PeriodicAdvertisingResponseTimingInformation(data,
				0);
		assertEquals(9, result1.getLength());
		assertEquals(PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 6), result1.getRspAa());
		assertEquals(BLEUtils.createUInt8(data, 6), result1.getNumSubevents());
		assertEquals(BLEUtils.createUInt8(data, 7), result1.getSubeventInterval());
		assertEquals(
				BLEUtils.createUInt8(data, 7)
						* PeriodicAdvertisingResponseTimingInformation.SUBEVENT_INTERVAL_UNIT_MILLIS,
				result1.getSubeventIntervalMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 8), result1.getResponseSlotDelay());
		assertEquals(
				BLEUtils.createUInt8(data, 8)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_DELAY_UNIT_MILLIS,
				result1.getResponseSlotDelayMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 9), result1.getResponseSlotSpacing());
		assertEquals(
				BLEUtils.createUInt8(data, 9)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_SPACING_UNIT_MILLIS,
				result1.getResponseSlotSpacingMillis(), 0);
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		PeriodicAdvertisingResponseTimingInformation result1 = new PeriodicAdvertisingResponseTimingInformation(data,
				0);
		assertEquals(9, result1.getLength());
		assertEquals(PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 6), result1.getRspAa());
		assertEquals(BLEUtils.createUInt8(data, 6), result1.getNumSubevents());
		assertEquals(BLEUtils.createUInt8(data, 7), result1.getSubeventInterval());
		assertEquals(
				BLEUtils.createUInt8(data, 7)
						* PeriodicAdvertisingResponseTimingInformation.SUBEVENT_INTERVAL_UNIT_MILLIS,
				result1.getSubeventIntervalMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 8), result1.getResponseSlotDelay());
		assertEquals(
				BLEUtils.createUInt8(data, 8)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_DELAY_UNIT_MILLIS,
				result1.getResponseSlotDelayMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 9), result1.getResponseSlotSpacing());
		assertEquals(
				BLEUtils.createUInt8(data, 9)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_SPACING_UNIT_MILLIS,
				result1.getResponseSlotSpacingMillis(), 0);
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		byte[] rspAa = new byte[4];
		System.arraycopy(data, 2, rspAa, 0, 4);
		int numSubevents = BLEUtils.createUInt8(data, 6);
		int subeventInterval = BLEUtils.createUInt8(data, 7);
		int responseSlotDelay = BLEUtils.createUInt8(data, 8);
		int responseSlotSpacing = BLEUtils.createUInt8(data, 9);

		PeriodicAdvertisingResponseTimingInformation result1 = new PeriodicAdvertisingResponseTimingInformation(rspAa,
				numSubevents, subeventInterval, responseSlotDelay, responseSlotSpacing);
		assertEquals(9, result1.getLength());
		assertEquals(PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 6), result1.getRspAa());
		assertEquals(BLEUtils.createUInt8(data, 6), result1.getNumSubevents());
		assertEquals(BLEUtils.createUInt8(data, 7), result1.getSubeventInterval());
		assertEquals(
				BLEUtils.createUInt8(data, 7)
						* PeriodicAdvertisingResponseTimingInformation.SUBEVENT_INTERVAL_UNIT_MILLIS,
				result1.getSubeventIntervalMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 8), result1.getResponseSlotDelay());
		assertEquals(
				BLEUtils.createUInt8(data, 8)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_DELAY_UNIT_MILLIS,
				result1.getResponseSlotDelayMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 9), result1.getResponseSlotSpacing());
		assertEquals(
				BLEUtils.createUInt8(data, 9)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_SPACING_UNIT_MILLIS,
				result1.getResponseSlotSpacingMillis(), 0);
	}

	@Test
	public void test_constructor_3_00002() {
		byte[] data = getData();

		byte[] rspAa = new byte[4];
		System.arraycopy(data, 2, rspAa, 0, 4);
		int numSubevents = BLEUtils.createUInt8(data, 6);
		int subeventInterval = BLEUtils.createUInt8(data, 7);
		int responseSlotDelay = BLEUtils.createUInt8(data, 8);
		int responseSlotSpacing = BLEUtils.createUInt8(data, 9);

		PeriodicAdvertisingResponseTimingInformation result1 = new PeriodicAdvertisingResponseTimingInformation(rspAa,
				numSubevents, subeventInterval, responseSlotDelay, responseSlotSpacing);
		assertEquals(9, result1.getLength());
		assertEquals(PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 6), result1.getRspAa());
		assertEquals(BLEUtils.createUInt8(data, 6), result1.getNumSubevents());
		assertEquals(BLEUtils.createUInt8(data, 7), result1.getSubeventInterval());
		assertEquals(
				BLEUtils.createUInt8(data, 7)
						* PeriodicAdvertisingResponseTimingInformation.SUBEVENT_INTERVAL_UNIT_MILLIS,
				result1.getSubeventIntervalMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 8), result1.getResponseSlotDelay());
		assertEquals(
				BLEUtils.createUInt8(data, 8)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_DELAY_UNIT_MILLIS,
				result1.getResponseSlotDelayMillis(), 0);
		assertEquals(BLEUtils.createUInt8(data, 9), result1.getResponseSlotSpacing());
		assertEquals(
				BLEUtils.createUInt8(data, 9)
						* PeriodicAdvertisingResponseTimingInformation.RESPONSE_SLOT_SPACING_UNIT_MILLIS,
				result1.getResponseSlotSpacingMillis(), 0);
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		PeriodicAdvertisingResponseTimingInformation result1 = new PeriodicAdvertisingResponseTimingInformation(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		PeriodicAdvertisingResponseTimingInformation result1 = new PeriodicAdvertisingResponseTimingInformation(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

}
