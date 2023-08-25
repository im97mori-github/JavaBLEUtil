package org.im97mori.ble.characteristic.u2a01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.constants.AppearanceValues;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class AppearanceTest extends TestBase {

	@Test
	public void test_constructor001() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY;
        data[ 1] = (byte) (AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY >> 8);
        //@formatter:on

		Appearance result1 = new Appearance(data);
		assertEquals(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY,
				result1.getAppearanceValue());
		assertEquals((AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY >> 6) & 0b00000011_11111111,
				result1.getAppearanceCategory());
		assertEquals(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY & 0b11111111_11000000,
				result1.getAppearanceCategoryWithOffset());
		assertEquals(
				AppearanceValues.APPEARANCE_CATEGORY_MAPPING
						.get(AppearanceValues.OUTDOOR_SPORTS_ACTIVITY_APPEARANCE_CATEGORY),
				result1.getAppearanceCategoryName());
		assertEquals(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY & 0b00111111,
				result1.getAppearanceSubCategory());
		assertEquals(
				AppearanceValues.APPEARANCE_SUB_CATEGORY_MAPPING
						.get(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY),
				result1.getAppearanceSubCategoryName());
	}

	@Test
	public void test_constructor002() {
		int appearanceValue = AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY;

		Appearance result1 = new Appearance(appearanceValue);
		assertEquals(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY,
				result1.getAppearanceValue());
		assertEquals((AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY >> 6) & 0b00000011_11111111,
				result1.getAppearanceCategory());
		assertEquals(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY & 0b11111111_11000000,
				result1.getAppearanceCategoryWithOffset());
		assertEquals(
				AppearanceValues.APPEARANCE_CATEGORY_MAPPING
						.get(AppearanceValues.OUTDOOR_SPORTS_ACTIVITY_APPEARANCE_CATEGORY),
				result1.getAppearanceCategoryName());
		assertEquals(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY & 0b00111111,
				result1.getAppearanceSubCategory());
		assertEquals(
				AppearanceValues.APPEARANCE_SUB_CATEGORY_MAPPING
						.get(AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY),
				result1.getAppearanceSubCategoryName());
	}

	@Test
	public void test_parcelable001() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY;
        data[ 1] = (byte) (AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY >> 8);
        //@formatter:off
        
        Appearance result1 = new Appearance(data);
        byte[] resultData = result1.getBytes();
        assertArrayEquals(data, resultData);
    }
	
	@Test
	public void test_parcelable002() {
		int appearanceValue = AppearanceValues.LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY;

		Appearance result1 = new Appearance(appearanceValue);
        byte[] resultData = result1.getBytes();
        assertArrayEquals(new byte[] {(byte) appearanceValue,
        		(byte) (appearanceValue >> 8)}, resultData);
    }
    
}
