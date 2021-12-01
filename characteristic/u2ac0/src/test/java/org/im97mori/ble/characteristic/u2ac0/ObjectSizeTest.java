package org.im97mori.ble.characteristic.u2ac0;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class ObjectSizeTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[8];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data_00001 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		ObjectSize result1 = new ObjectSize(data);
		assertEquals(BLEUtils.createUInt32(data, 0), result1.getCurrentSize());
		assertEquals(BLEUtils.createUInt32(data, 4), result1.getAllocatedSize());
	}

	@Test
	public void test_constructor_00101() {
		long currentSize = 1;
		long allocatedSize = 2;

		ObjectSize result1 = new ObjectSize(currentSize, allocatedSize);
		assertEquals(currentSize, result1.getCurrentSize());
		assertEquals(allocatedSize, result1.getAllocatedSize());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		ObjectSize result1 = new ObjectSize(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
