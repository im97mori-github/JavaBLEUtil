package org.im97mori.ble.characteristic.u2b48;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.u2b37.RegisteredUser;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class MiddleNameTest extends TestBase {

	@Test
	public void test_constructor_00001() {
		byte[] middleName = "github@im97mori.org".getBytes();

		byte[] additionalData = new byte[2 + middleName.length];
		additionalData[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData[1] = 0x01;
		System.arraycopy(middleName, 0, additionalData, 2, middleName.length);

		byte[] data = new byte[1 + additionalData.length];
		data[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x02 << 2));

		System.arraycopy(additionalData, 0, data, data.length - additionalData.length, additionalData.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data) };

		MiddleName result1 = new MiddleName(registeredUsers);
		assertEquals(new String(middleName), result1.getMiddleName());
	}

	@Test
	public void test_constructor_00002() {
		byte[] middleName1 = "github@im97mori.org".getBytes();
		byte[] middleName2 = "github_@im97mori.org".getBytes();

		byte[] additionalData1 = new byte[2 + middleName1.length];
		additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData1[1] = 0x01;
		System.arraycopy(middleName1, 0, additionalData1, 2, middleName1.length);

		byte[] data1 = new byte[1 + additionalData1.length];
		data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x01 << 2));
		System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

		byte[] data2 = new byte[1 + middleName2.length];
		data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x02 << 2));
		System.arraycopy(middleName2, 0, data2, data2.length - middleName2.length, middleName2.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data1),
				new RegisteredUser(data2) };

		MiddleName result1 = new MiddleName(registeredUsers);
		assertEquals(new String(middleName1) + new String(middleName2), result1.getMiddleName());
	}

	@Test
	public void test_constructor_00003() {
		byte[] middleName1 = "github@im97mori.org".getBytes();
		byte[] middleName2 = "github_@im97mori.org".getBytes();
		byte[] middleName3 = "github__@im97mori.org".getBytes();

		byte[] additionalData1 = new byte[2 + middleName1.length];
		additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData1[1] = 0x01;
		System.arraycopy(middleName1, 0, additionalData1, 2, middleName1.length);

		byte[] data1 = new byte[1 + additionalData1.length];
		data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x01 << 2));
		System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

		byte[] data2 = new byte[1 + middleName2.length];
		data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x02 << 2));
		System.arraycopy(middleName2, 0, data2, data2.length - middleName2.length, middleName2.length);

		byte[] data3 = new byte[1 + middleName3.length];
		data3[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x03 << 2));
		System.arraycopy(middleName3, 0, data3, data3.length - middleName3.length, middleName3.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data1), new RegisteredUser(data2),
				new RegisteredUser(data3) };

		MiddleName result1 = new MiddleName(registeredUsers);
		assertEquals(new String(middleName1) + new String(middleName2) + new String(middleName3),
				result1.getMiddleName());
	}

	@Test
	public void test_constructor_00101() {
		String middleName = "a";

		MiddleName result1 = new MiddleName(middleName);
		assertEquals(middleName, result1.getMiddleName());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] middleName = "github@im97mori.org".getBytes();

		byte[] additionalData = new byte[2 + middleName.length];
		additionalData[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData[1] = 0x01;
		System.arraycopy(middleName, 0, additionalData, 2, middleName.length);

		byte[] data = new byte[1 + additionalData.length];
		data[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x02 << 2));
		System.arraycopy(additionalData, 0, data, data.length - additionalData.length, additionalData.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data) };

		byte[] merged = new byte[3 + middleName.length];
		merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
		merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
		merged[2] = (byte) 0;
		System.arraycopy(middleName, 0, merged, 3, middleName.length);

		MiddleName result1 = new MiddleName(registeredUsers);
		assertArrayEquals(merged, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] middleName1 = "github@im97mori.org".getBytes();
		byte[] middleName2 = "github_@im97mori.org".getBytes();

		byte[] additionalData1 = new byte[2 + middleName1.length];
		additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData1[1] = 0x01;
		System.arraycopy(middleName1, 0, additionalData1, 2, middleName1.length);

		byte[] data1 = new byte[1 + additionalData1.length];
		data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x01 << 2));
		System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

		byte[] data2 = new byte[1 + middleName2.length];
		data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x02 << 2));
		System.arraycopy(middleName2, 0, data2, data2.length - middleName2.length, middleName2.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data1),
				new RegisteredUser(data2) };

		byte[] merged = new byte[3 + middleName1.length + middleName2.length];
		merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
		merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
		merged[2] = (byte) 0;
		System.arraycopy(middleName1, 0, merged, 3, middleName1.length);
		System.arraycopy(middleName2, 0, merged, 3 + middleName1.length, middleName2.length);

		MiddleName result1 = new MiddleName(registeredUsers);
		assertArrayEquals(merged, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] middleName1 = "github@im97mori.org".getBytes();
		byte[] middleName2 = "github_@im97mori.org".getBytes();
		byte[] middleName3 = "github__@im97mori.org".getBytes();

		byte[] additionalData1 = new byte[2 + middleName1.length];
		additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData1[1] = 0x01;
		System.arraycopy(middleName1, 0, additionalData1, 2, middleName1.length);

		byte[] data1 = new byte[1 + additionalData1.length];
		data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x01 << 2));
		System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

		byte[] data2 = new byte[1 + middleName2.length];
		data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x02 << 2));
		System.arraycopy(middleName2, 0, data2, data2.length - middleName2.length, middleName2.length);

		byte[] data3 = new byte[1 + middleName3.length];
		data3[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x03 << 2));
		System.arraycopy(middleName3, 0, data3, data3.length - middleName3.length, middleName3.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data1), new RegisteredUser(data2),
				new RegisteredUser(data3) };

		byte[] merged = new byte[3 + middleName1.length + middleName2.length + middleName3.length];
		merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
		merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
		merged[2] = (byte) 0;
		System.arraycopy(middleName1, 0, merged, 3, middleName1.length);
		System.arraycopy(middleName2, 0, merged, 3 + middleName1.length, middleName2.length);
		System.arraycopy(middleName3, 0, merged, 3 + middleName1.length + middleName2.length, middleName3.length);

		MiddleName result1 = new MiddleName(registeredUsers);
		assertArrayEquals(merged, result1.getBytes());
	}

}
