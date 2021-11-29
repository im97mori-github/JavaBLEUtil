package org.im97mori.ble.characteristic.u2b85;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class SizeCharacteristicTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = 2;
        data_00001 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		SizeCharacteristic result1 = new SizeCharacteristic(data);
		assertEquals(BLEUtils.createUInt8(data, 0), result1.getCoordinatedSetSize());
	}

	@Test
	public void test_constructor_00101() {
		int coordinatedSetSize = 2;

		SizeCharacteristic result1 = new SizeCharacteristic(coordinatedSetSize);
		assertEquals(coordinatedSetSize, result1.getCoordinatedSetSize());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		SizeCharacteristic result1 = new SizeCharacteristic(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
