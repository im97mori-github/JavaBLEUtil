package org.im97mori.ble.characteristic.u2bdf;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class HighTemperatureTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        data[ 0] = (byte) 0xde;
        data[ 1] = (byte) 0xfd;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0x7f;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[2];
        data[ 0] = (byte) HighTemperature.HIGH_TEMPERATURE_VALUE_IS_NOT_VALID;
        data[ 1] = (byte) (HighTemperature.HIGH_TEMPERATURE_VALUE_IS_NOT_VALID >> 8);
        data_00003 = data;
    }

	private static final byte[] data_00004;
    static {
        byte[] data = new byte[2];
        data[ 0] = (byte) HighTemperature.HIGH_TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (HighTemperature.HIGH_TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data_00004 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		HighTemperature result1 = new HighTemperature(data);
		assertEquals(BLEUtils.createSInt16(data, 0), result1.geHighTemperature());
		assertEquals(BLEUtils.createSInt16(data, 0) * HighTemperature.HIGH_TEMPERATURE_RESOLUTION,
				result1.geHighTemperatureDegreeCelsius(), 0);
		assertFalse(result1.isValueIsNotValid());
		assertFalse(result1.isValueIsNotKnown());
	}

	@Test
	public void test_constructor_00002() {
		byte[] data = getData();

		HighTemperature result1 = new HighTemperature(data);
		assertEquals(BLEUtils.createSInt16(data, 0), result1.geHighTemperature());
		assertEquals(BLEUtils.createSInt16(data, 0) * HighTemperature.HIGH_TEMPERATURE_RESOLUTION,
				result1.geHighTemperatureDegreeCelsius(), 0);
		assertFalse(result1.isValueIsNotValid());
		assertFalse(result1.isValueIsNotKnown());
	}

	@Test
	public void test_constructor_00003() {
		byte[] data = getData();

		HighTemperature result1 = new HighTemperature(data);
		assertTrue(result1.isValueIsNotValid());
		assertFalse(result1.isValueIsNotKnown());
	}

	@Test
	public void test_constructor_00004() {
		byte[] data = getData();

		HighTemperature result1 = new HighTemperature(data);
		assertFalse(result1.isValueIsNotValid());
		assertTrue(result1.isValueIsNotKnown());
	}

	@Test
	public void test_constructor_00101() {
		int highTemperature = (int) (-273 / HighTemperature.HIGH_TEMPERATURE_RESOLUTION);

		HighTemperature result1 = new HighTemperature(highTemperature);
		assertEquals(highTemperature, result1.geHighTemperature());
		assertEquals(highTemperature * HighTemperature.HIGH_TEMPERATURE_RESOLUTION,
				result1.geHighTemperatureDegreeCelsius(), 0);
		assertFalse(result1.isValueIsNotValid());
		assertFalse(result1.isValueIsNotKnown());
	}

	@Test
	public void test_constructor_00102() {
		int highTemperature = (int) (16383.5 / HighTemperature.HIGH_TEMPERATURE_RESOLUTION);

		HighTemperature result1 = new HighTemperature(highTemperature);
		assertEquals(highTemperature, result1.geHighTemperature());
		assertEquals(highTemperature * HighTemperature.HIGH_TEMPERATURE_RESOLUTION,
				result1.geHighTemperatureDegreeCelsius(), 0);
		assertFalse(result1.isValueIsNotValid());
		assertFalse(result1.isValueIsNotKnown());
	}

	@Test
	public void test_constructor_00103() {
		HighTemperature result1 = new HighTemperature(HighTemperature.HIGH_TEMPERATURE_VALUE_IS_NOT_VALID);
		assertTrue(result1.isValueIsNotValid());
		assertFalse(result1.isValueIsNotKnown());
	}

	@Test
	public void test_constructor_00104() {
		HighTemperature result1 = new HighTemperature(HighTemperature.HIGH_TEMPERATURE_VALUE_IS_NOT_KNOWN);
		assertFalse(result1.isValueIsNotValid());
		assertTrue(result1.isValueIsNotKnown());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		HighTemperature result1 = new HighTemperature(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		HighTemperature result1 = new HighTemperature(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		HighTemperature result1 = new HighTemperature(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00004() {
		byte[] data = getData();

		HighTemperature result1 = new HighTemperature(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
