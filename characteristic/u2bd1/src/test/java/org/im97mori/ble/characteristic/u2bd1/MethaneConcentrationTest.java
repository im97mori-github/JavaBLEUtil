package org.im97mori.ble.characteristic.u2bd1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class MethaneConcentrationTest extends TestBase {

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

		MethaneConcentration result1 = new MethaneConcentration(data);
		assertEquals(BLEUtils.createSfloat(data, 0), result1.getMethaneConcentration().getSfloat(), 0);
		assertFalse(result1.isNres());
		assertFalse(result1.isNan());
	}

	@Test
	public void test_constructor_00002() {
		byte[] data = getData();

		MethaneConcentration result1 = new MethaneConcentration(data);
		assertTrue(result1.isNres());
		assertFalse(result1.isNan());
	}

	@Test
	public void test_constructor_00003() {
		byte[] data = getData();

		MethaneConcentration result1 = new MethaneConcentration(data);
		assertFalse(result1.isNres());
		assertTrue(result1.isNan());
	}

	@Test
	public void test_constructor_00101() {
		double methaneConcentration = 1d;
		IEEE_11073_20601_SFLOAT sfloat = new IEEE_11073_20601_SFLOAT(methaneConcentration);

		MethaneConcentration result1 = new MethaneConcentration(sfloat);
		assertEquals(methaneConcentration, result1.getMethaneConcentration().getSfloat(), 0);
		assertFalse(result1.isNres());
		assertFalse(result1.isNan());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		MethaneConcentration result1 = new MethaneConcentration(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		MethaneConcentration result1 = new MethaneConcentration(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		MethaneConcentration result1 = new MethaneConcentration(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
