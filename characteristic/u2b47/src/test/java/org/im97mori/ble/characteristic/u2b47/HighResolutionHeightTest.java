package org.im97mori.ble.characteristic.u2b47;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class HighResolutionHeightTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data_00001 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		HighResolutionHeight result1 = new HighResolutionHeight(data);
		assertEquals(BLEUtils.createUInt16(data, 0), result1.getHeight());
		assertEquals(BLEUtils.createUInt16(data, 0) * HighResolutionHeight.HEIGHT_RESOLUTION, result1.getHeightMeter(),
				0);
	}

	@Test
	public void test_constructor_00101() {
		int height = 1;

		HighResolutionHeight result1 = new HighResolutionHeight(height);
		assertEquals(height, result1.getHeight());
		assertEquals(height * HighResolutionHeight.HEIGHT_RESOLUTION, result1.getHeightMeter(), 0);
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		HighResolutionHeight result1 = new HighResolutionHeight(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
