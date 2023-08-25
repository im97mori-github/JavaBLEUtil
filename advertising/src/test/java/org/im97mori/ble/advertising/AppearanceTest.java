package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.APPEARANCE_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.constants.AppearanceValues;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class AppearanceTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = APPEARANCE_DATA_TYPE;
        data[2] = (byte) AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY;
        data[3] = (byte) (AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY >> 8);
        data_00001 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		Appearance result1 = new Appearance(data, 0, data[0]);
		assertEquals(3, result1.getLength());
		assertEquals(APPEARANCE_DATA_TYPE, result1.getDataType());
		long key = (data[2] & 0xff) | ((data[3] & 0xff) << 8);
		assertEquals(key, result1.getAppearance());
		assertEquals((key >> 6) & 0b00000011_11111111, result1.getAppearanceCategory());
		assertEquals(key & 0b11111111_11000000, result1.getAppearanceCategoryWithOffset());
		assertEquals(
				AppearanceValues.APPEARANCE_CATEGORY_MAPPING
						.get(AppearanceValues.OUTDOOR_SPORTS_ACTIVITY_APPEARANCE_CATEGORY),
				result1.getAppearanceCategoryName());
		assertEquals(key & 0b00111111, result1.getAppearanceSubCategory());
		assertEquals(
				AppearanceValues.APPEARANCE_SUB_CATEGORY_MAPPING
						.get(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY),
				result1.getAppearanceSubCategoryName());
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		Appearance result1 = new Appearance(data, 0);
		assertEquals(3, result1.getLength());
		assertEquals(APPEARANCE_DATA_TYPE, result1.getDataType());
		long key = (data[2] & 0xff) | ((data[3] & 0xff) << 8);
		assertEquals(key, result1.getAppearance());
		assertEquals((key >> 6) & 0b00000011_11111111, result1.getAppearanceCategory());
		assertEquals(key & 0b11111111_11000000, result1.getAppearanceCategoryWithOffset());
		assertEquals(
				AppearanceValues.APPEARANCE_CATEGORY_MAPPING
						.get(AppearanceValues.OUTDOOR_SPORTS_ACTIVITY_APPEARANCE_CATEGORY),
				result1.getAppearanceCategoryName());
		assertEquals(key & 0b00111111, result1.getAppearanceSubCategory());
		assertEquals(
				AppearanceValues.APPEARANCE_SUB_CATEGORY_MAPPING
						.get(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY),
				result1.getAppearanceSubCategoryName());
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		Appearance result1 = new Appearance(BLEUtils.createUInt16(data, 2));
		assertEquals(3, result1.getLength());
		assertEquals(APPEARANCE_DATA_TYPE, result1.getDataType());
		long key = (data[2] & 0xff) | ((data[3] & 0xff) << 8);
		assertEquals(key, result1.getAppearance());
		assertEquals((key >> 6) & 0b00000011_11111111, result1.getAppearanceCategory());
		assertEquals(key & 0b11111111_11000000, result1.getAppearanceCategoryWithOffset());
		assertEquals(
				AppearanceValues.APPEARANCE_CATEGORY_MAPPING
						.get(AppearanceValues.OUTDOOR_SPORTS_ACTIVITY_APPEARANCE_CATEGORY),
				result1.getAppearanceCategoryName());
		assertEquals(key & 0b00111111, result1.getAppearanceSubCategory());
		assertEquals(
				AppearanceValues.APPEARANCE_SUB_CATEGORY_MAPPING
						.get(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY),
				result1.getAppearanceSubCategoryName());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		Appearance result1 = new Appearance(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

}
