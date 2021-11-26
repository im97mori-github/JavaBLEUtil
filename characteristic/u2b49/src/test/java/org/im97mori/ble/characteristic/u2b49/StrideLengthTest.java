package org.im97mori.ble.characteristic.u2b49;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class StrideLengthTest extends TestBase {

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

		StrideLength result1 = new StrideLength(data);
		assertEquals(BLEUtils.createUInt16(data, 0), result1.getStrideLength());
		assertEquals(BLEUtils.createUInt16(data, 0) * StrideLength.STRIDE_COUNT_RESOLUTION,
				result1.getStrideLengthMeter(), 0);
	}

	@Test
	public void test_constructor_00101() {
		int strideLength = 1;

		StrideLength result1 = new StrideLength(strideLength);
		assertEquals(strideLength, result1.getStrideLength());
		assertEquals(strideLength * StrideLength.STRIDE_COUNT_RESOLUTION, result1.getStrideLengthMeter(), 0);
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		StrideLength result1 = new StrideLength(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
