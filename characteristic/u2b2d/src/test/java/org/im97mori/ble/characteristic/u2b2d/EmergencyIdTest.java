package org.im97mori.ble.characteristic.u2b2d;

import static org.junit.Assert.assertArrayEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class EmergencyIdTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data_00001 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		EmergencyId result1 = new EmergencyId(data);
		assertArrayEquals(data, result1.getEmergencyId());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		EmergencyId result1 = new EmergencyId(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
