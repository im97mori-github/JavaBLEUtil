package org.im97mori.ble.characteristic.u2bcf;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class AmmoniaConcentrationTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        data[ 0] = (byte) BLEUtils.SFLOAT_NRES;
        data[ 1] = (byte) (BLEUtils.SFLOAT_NRES >> 8);
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[2];
        data[ 0] = (byte) BLEUtils.SFLOAT_NAN;
        data[ 1] = (byte) (BLEUtils.SFLOAT_NAN >> 8);
        data_00003 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		AmmoniaConcentration result1 = new AmmoniaConcentration(data);
		assertEquals(BLEUtils.createSfloat(data, 0), result1.getAmmoniaConcentration().getSfloat(), 0);
		assertFalse(result1.isNres());
		assertFalse(result1.isNan());
	}

	@Test
	public void test_constructor_00002() {
		byte[] data = getData();

		AmmoniaConcentration result1 = new AmmoniaConcentration(data);
		assertTrue(result1.isNres());
		assertFalse(result1.isNan());
	}

	@Test
	public void test_constructor_00003() {
		byte[] data = getData();

		AmmoniaConcentration result1 = new AmmoniaConcentration(data);
		assertFalse(result1.isNres());
		assertTrue(result1.isNan());
	}

	@Test
	public void test_constructor_00101() {
		double ammoniaConcentration = 1d;
		IEEE_11073_20601_SFLOAT sfloat = new IEEE_11073_20601_SFLOAT(ammoniaConcentration);

		AmmoniaConcentration result1 = new AmmoniaConcentration(sfloat);
		assertEquals(ammoniaConcentration, result1.getAmmoniaConcentration().getSfloat(), 0);
		assertFalse(result1.isNres());
		assertFalse(result1.isNan());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		AmmoniaConcentration result1 = new AmmoniaConcentration(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		AmmoniaConcentration result1 = new AmmoniaConcentration(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		AmmoniaConcentration result1 = new AmmoniaConcentration(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
