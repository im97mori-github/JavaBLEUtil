package org.im97mori.ble.characteristic.u2bba;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class ContentControlIdTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        data_00001 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		ContentControlId result1 = new ContentControlId(data);
		assertEquals(BLEUtils.createUInt8(data, 0), result1.getContentControlId());
	}

	@Test
	public void test_constructor_00101() {
		int contentControlId = 1;

		ContentControlId result1 = new ContentControlId(contentControlId);
		assertEquals(contentControlId, result1.getContentControlId());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		ContentControlId result1 = new ContentControlId(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
