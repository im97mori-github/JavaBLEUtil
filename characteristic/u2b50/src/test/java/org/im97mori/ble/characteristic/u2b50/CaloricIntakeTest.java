package org.im97mori.ble.characteristic.u2b50;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class CaloricIntakeTest extends TestBase {

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

		CaloricIntake result1 = new CaloricIntake(data);
		assertEquals(BLEUtils.createUInt16(data, 0), result1.getCaloricIntake());
	}

	@Test
	public void test_constructor_00101() {
		int caloricIntake = 1;

		CaloricIntake result1 = new CaloricIntake(caloricIntake);
		assertEquals(caloricIntake, result1.getCaloricIntake());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		CaloricIntake result1 = new CaloricIntake(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
