package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class SecurityManagerOutOfBandTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE;
        data[2] = 0b00000001;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE;
        data[2] = 0b00000010;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE;
        data[2] = 0b00001000;
        data_00003 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0b00000001, result1.getSecurityManagerOutOfBandFlag());
		assertTrue(result1.isOobFlagsField());
		assertFalse(result1.isLeSupported());
		assertFalse(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0b00000010, result1.getSecurityManagerOutOfBandFlag());
		assertFalse(result1.isOobFlagsField());
		assertTrue(result1.isLeSupported());
		assertFalse(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_1_00003() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0b00001000, result1.getSecurityManagerOutOfBandFlag());
		assertFalse(result1.isOobFlagsField());
		assertFalse(result1.isLeSupported());
		assertTrue(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0b00000001, result1.getSecurityManagerOutOfBandFlag());
		assertTrue(result1.isOobFlagsField());
		assertFalse(result1.isLeSupported());
		assertFalse(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0b00000010, result1.getSecurityManagerOutOfBandFlag());
		assertFalse(result1.isOobFlagsField());
		assertTrue(result1.isLeSupported());
		assertFalse(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_2_00003() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0b00001000, result1.getSecurityManagerOutOfBandFlag());
		assertFalse(result1.isOobFlagsField());
		assertFalse(result1.isLeSupported());
		assertTrue(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(
				SecurityManagerOutOfBand.SECURITY_MANAGER_OUT_OF_BAND_FLAG_OOB_FLAGS);
		assertEquals(2, result1.getLength());
		assertEquals(SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0b00000001, result1.getSecurityManagerOutOfBandFlag());
		assertTrue(result1.isOobFlagsField());
		assertFalse(result1.isLeSupported());
		assertFalse(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_3_00002() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(
				SecurityManagerOutOfBand.SECURITY_MANAGER_LE_SUPPORTED);
		assertEquals(2, result1.getLength());
		assertEquals(SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0b00000010, result1.getSecurityManagerOutOfBandFlag());
		assertFalse(result1.isOobFlagsField());
		assertTrue(result1.isLeSupported());
		assertFalse(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_3_00003() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(
				SecurityManagerOutOfBand.SECURITY_MANAGER_ADDRESS_TYPE);
		assertEquals(2, result1.getLength());
		assertEquals(SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE, result1.getDataType());
		assertEquals(0b00001000, result1.getSecurityManagerOutOfBandFlag());
		assertFalse(result1.isOobFlagsField());
		assertFalse(result1.isLeSupported());
		assertTrue(result1.isRandomAddress());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		SecurityManagerOutOfBand result1 = new SecurityManagerOutOfBand(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}
}
