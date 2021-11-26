package org.im97mori.ble.characteristic.u2b4c;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class FourZoneHeartRateLimitsTest extends TestBase {

	//@formatter:off
	private static final byte[] data_00001;
    static {
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[3];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0xff;
        data_00002 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		FourZoneHeartRateLimits result1 = new FourZoneHeartRateLimits(data);
		assertEquals(0x01, result1.getFourZoneHeartRateLimitsLightModerateLimit());
		assertEquals(0x02, result1.getFourZoneHeartRateLimitsModerateHardLimit());
		assertEquals(0x03, result1.getFourZoneHeartRateLimitsHardMaximumLimit());
	}

	@Test
	public void test_constructor_00002() {
		byte[] data = getData();

		FourZoneHeartRateLimits result1 = new FourZoneHeartRateLimits(data);
		assertEquals(0xff, result1.getFourZoneHeartRateLimitsLightModerateLimit());
		assertEquals(0xff, result1.getFourZoneHeartRateLimitsModerateHardLimit());
		assertEquals(0xff, result1.getFourZoneHeartRateLimitsHardMaximumLimit());

	}

	@Test
	public void test_constructor003() {
		int fourZoneHeartRateLimitsLightModerateLimit = 1;
		int fourZoneHeartRateLimitsModerateHardLimit = 2;
		int fourZoneHeartRateLimitsHardMaximumLimit = 3;

		FourZoneHeartRateLimits result1 = new FourZoneHeartRateLimits(fourZoneHeartRateLimitsLightModerateLimit,
				fourZoneHeartRateLimitsModerateHardLimit, fourZoneHeartRateLimitsHardMaximumLimit);
		assertEquals(fourZoneHeartRateLimitsLightModerateLimit, result1.getFourZoneHeartRateLimitsLightModerateLimit());
		assertEquals(fourZoneHeartRateLimitsModerateHardLimit, result1.getFourZoneHeartRateLimitsModerateHardLimit());
		assertEquals(fourZoneHeartRateLimitsHardMaximumLimit, result1.getFourZoneHeartRateLimitsHardMaximumLimit());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		FourZoneHeartRateLimits result1 = new FourZoneHeartRateLimits(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		FourZoneHeartRateLimits result1 = new FourZoneHeartRateLimits(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
