package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.constants.CompanyUUID;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class ManufacturerSpecificDataTest extends TestBase {

	// google
	private static final int COMPANY_ID = 0x000000E0;

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = (byte) MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
        data[2] = (byte) (COMPANY_ID & 0x0000ff);
        data[3] = (byte) ((COMPANY_ID >> 8) & 0x0000ff);
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] additionalData = new byte[1];
        additionalData[0] = 0;

        byte[] data = new byte[4 + additionalData.length];
        data[0] = (byte) (3 + additionalData.length);
        data[1] = (byte) MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
        data[2] = (byte) (COMPANY_ID & 0x0000ff);
        data[3] = (byte) ((COMPANY_ID >> 8) & 0x0000ff);

        System.arraycopy(additionalData, 0, data, 4, additionalData.length);
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] additionalData = new byte[1];
        additionalData[0] = 127;

        byte[] data = new byte[4 + additionalData.length];
        data[0] = (byte) (3 + additionalData.length);
        data[1] = (byte) MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
        data[2] = (byte) (COMPANY_ID & 0x0000ff);
        data[3] = (byte) ((COMPANY_ID >> 8) & 0x0000ff);

        System.arraycopy(additionalData, 0, data, 4, additionalData.length);
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] additionalData = new byte[1];
        additionalData[0] = (byte) 0b11111111;

        byte[] data = new byte[4 + additionalData.length];
        data[0] = (byte) (3 + additionalData.length);
        data[1] = (byte) MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
        data[2] = (byte) (COMPANY_ID & 0x0000ff);
        data[3] = (byte) ((COMPANY_ID >> 8) & 0x0000ff);

        System.arraycopy(additionalData, 0, data, 4, additionalData.length);
        data_00004 = data;
    }

    private static final byte[] data_00005;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = 0;
        additionalData[1] = 0;

        byte[] data = new byte[4 + additionalData.length];
        data[0] = (byte) (3 + additionalData.length);
        data[1] = (byte) MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
        data[2] = (byte) (COMPANY_ID & 0x0000ff);
        data[3] = (byte) ((COMPANY_ID >> 8) & 0x0000ff);

        System.arraycopy(additionalData, 0, data, 4, additionalData.length);
        data_00005 = data;
    }

    private static final byte[] data_00006;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = 127;
        additionalData[1] = 127;

        byte[] data = new byte[4 + additionalData.length];
        data[0] = (byte) (3 + additionalData.length);
        data[1] = (byte) MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
        data[2] = (byte) (COMPANY_ID & 0x0000ff);
        data[3] = (byte) ((COMPANY_ID >> 8) & 0x0000ff);

        System.arraycopy(additionalData, 0, data, 4, additionalData.length);
        data_00006 = data;
    }

    private static final byte[] data_00007;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = 0;
        additionalData[1] = 127;

        byte[] data = new byte[4 + additionalData.length];
        data[0] = (byte) (3 + additionalData.length);
        data[1] = (byte) MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
        data[2] = (byte) (COMPANY_ID & 0x0000ff);
        data[3] = (byte) ((COMPANY_ID >> 8) & 0x0000ff);

        System.arraycopy(additionalData, 0, data, 4, additionalData.length);
        data_00007 = data;
    }

    private static final byte[] data_00008;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = (byte) 0b11111111;
        additionalData[1] = (byte) 0b11111111;

        byte[] data = new byte[4 + additionalData.length];
        data[0] = (byte) (3 + additionalData.length);
        data[1] = (byte) MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
        data[2] = (byte) (COMPANY_ID & 0x0000ff);
        data[3] = (byte) ((COMPANY_ID >> 8) & 0x0000ff);

        System.arraycopy(additionalData, 0, data, 4, additionalData.length);
        data_00008 = data;
    }

    private static final byte[] data_00009;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = 0;
        additionalData[1] = (byte) 0b11111111;

        byte[] data = new byte[4 + additionalData.length];
        data[0] = (byte) (3 + additionalData.length);
        data[1] = (byte) MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
        data[2] = (byte) (COMPANY_ID & 0x0000ff);
        data[3] = (byte) ((COMPANY_ID >> 8) & 0x0000ff);

        System.arraycopy(additionalData, 0, data, 4, additionalData.length);
        data_00009 = data;
    }

    private static final byte[] data_00010;
    static {
        byte[] additionalData = new byte[2];
        additionalData[0] = (byte) 0b11111111;
        additionalData[1] = 0;

        byte[] data = new byte[4 + additionalData.length];
        data[0] = (byte) (3 + additionalData.length);
        data[1] = (byte) MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
        data[2] = (byte) (COMPANY_ID & 0x0000ff);
        data[3] = (byte) ((COMPANY_ID >> 8) & 0x0000ff);

        System.arraycopy(additionalData, 0, data, 4, additionalData.length);
        data_00010 = data;
    }
    //@formatter:on


	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertEquals(3, result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_1_00003() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_1_00004() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_1_00005() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_1_00006() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_1_00007() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_1_00008() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_1_00009() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_1_00010() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0);
		assertEquals(3, result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_2_00003() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_2_00004() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_2_00005() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_2_00006() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_2_00007() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_2_00008() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_2_00009() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_2_00010() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		int companyIdentifier = BLEUtils.createUInt16(data, 2);
		byte[] manufacturerSpecificData = new byte[data[0] - 3];
		System.arraycopy(data, 4, manufacturerSpecificData, 0, manufacturerSpecificData.length);
		ManufacturerSpecificData result1 = new ManufacturerSpecificData(companyIdentifier, manufacturerSpecificData);
		assertEquals(3, result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_3_00002() {
		byte[] data = getData();

		int companyIdentifier = BLEUtils.createUInt16(data, 2);
		byte[] manufacturerSpecificData = new byte[data[0] - 3];
		System.arraycopy(data, 4, manufacturerSpecificData, 0, manufacturerSpecificData.length);
		ManufacturerSpecificData result1 = new ManufacturerSpecificData(companyIdentifier, manufacturerSpecificData);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_3_00003() {
		byte[] data = getData();

		int companyIdentifier = BLEUtils.createUInt16(data, 2);
		byte[] manufacturerSpecificData = new byte[data[0] - 3];
		System.arraycopy(data, 4, manufacturerSpecificData, 0, manufacturerSpecificData.length);
		ManufacturerSpecificData result1 = new ManufacturerSpecificData(companyIdentifier, manufacturerSpecificData);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_3_00004() {
		byte[] data = getData();

		int companyIdentifier = BLEUtils.createUInt16(data, 2);
		byte[] manufacturerSpecificData = new byte[data[0] - 3];
		System.arraycopy(data, 4, manufacturerSpecificData, 0, manufacturerSpecificData.length);
		ManufacturerSpecificData result1 = new ManufacturerSpecificData(companyIdentifier, manufacturerSpecificData);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_3_00005() {
		byte[] data = getData();

		int companyIdentifier = BLEUtils.createUInt16(data, 2);
		byte[] manufacturerSpecificData = new byte[data[0] - 3];
		System.arraycopy(data, 4, manufacturerSpecificData, 0, manufacturerSpecificData.length);
		ManufacturerSpecificData result1 = new ManufacturerSpecificData(companyIdentifier, manufacturerSpecificData);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_3_00006() {
		byte[] data = getData();

		int companyIdentifier = BLEUtils.createUInt16(data, 2);
		byte[] manufacturerSpecificData = new byte[data[0] - 3];
		System.arraycopy(data, 4, manufacturerSpecificData, 0, manufacturerSpecificData.length);
		ManufacturerSpecificData result1 = new ManufacturerSpecificData(companyIdentifier, manufacturerSpecificData);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_3_00007() {
		byte[] data = getData();

		int companyIdentifier = BLEUtils.createUInt16(data, 2);
		byte[] manufacturerSpecificData = new byte[data[0] - 3];
		System.arraycopy(data, 4, manufacturerSpecificData, 0, manufacturerSpecificData.length);
		ManufacturerSpecificData result1 = new ManufacturerSpecificData(companyIdentifier, manufacturerSpecificData);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_3_00008() {
		byte[] data = getData();

		int companyIdentifier = BLEUtils.createUInt16(data, 2);
		byte[] manufacturerSpecificData = new byte[data[0] - 3];
		System.arraycopy(data, 4, manufacturerSpecificData, 0, manufacturerSpecificData.length);
		ManufacturerSpecificData result1 = new ManufacturerSpecificData(companyIdentifier, manufacturerSpecificData);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_3_00009() {
		byte[] data = getData();

		int companyIdentifier = BLEUtils.createUInt16(data, 2);
		byte[] manufacturerSpecificData = new byte[data[0] - 3];
		System.arraycopy(data, 4, manufacturerSpecificData, 0, manufacturerSpecificData.length);
		ManufacturerSpecificData result1 = new ManufacturerSpecificData(companyIdentifier, manufacturerSpecificData);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_constructor_3_00010() {
		byte[] data = getData();

		int companyIdentifier = BLEUtils.createUInt16(data, 2);
		byte[] manufacturerSpecificData = new byte[data[0] - 3];
		System.arraycopy(data, 4, manufacturerSpecificData, 0, manufacturerSpecificData.length);
		ManufacturerSpecificData result1 = new ManufacturerSpecificData(companyIdentifier, manufacturerSpecificData);
		assertEquals(data[0], result1.getLength());
		assertEquals(MANUFACTURER_SPECIFIC_DATA_DATA_TYPE, result1.getDataType());
		assertEquals(COMPANY_ID, result1.getCompanyIdentifier());
		assertEquals(CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(COMPANY_ID)),
				result1.getCompanyName());
		assertEquals(data[0] - 3, result1.getManufacturerSpecificData().length);
		assertArrayEquals(Arrays.copyOfRange(data, 4, data.length), result1.getManufacturerSpecificData());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00004() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00005() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00006() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00007() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00008() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00009() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00010() {
		byte[] data = getData();

		ManufacturerSpecificData result1 = new ManufacturerSpecificData(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

}
