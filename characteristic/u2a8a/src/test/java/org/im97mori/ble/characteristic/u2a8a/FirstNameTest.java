package org.im97mori.ble.characteristic.u2a8a;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import org.im97mori.ble.characteristic.u2b37.RegisteredUser;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class FirstNameTest extends TestBase {

	@Test
	public void test_constructor_00001() {
		byte[] FirstName = "github@im97mori.org".getBytes();

		byte[] additionalData = new byte[2 + FirstName.length];
		additionalData[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData[1] = 0x01;
		System.arraycopy(FirstName, 0, additionalData, 2, FirstName.length);

		byte[] data = new byte[1 + additionalData.length];
		data[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x02 << 2));

		System.arraycopy(additionalData, 0, data, data.length - additionalData.length, additionalData.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data) };

		FirstName result1 = new FirstName(registeredUsers);
		assertEquals(new String(FirstName), result1.getFirstName());
	}

	@Test
	public void test_constructor_00002() {
		byte[] FirstName1 = "github@im97mori.org".getBytes();
		byte[] FirstName2 = "github_@im97mori.org".getBytes();

		byte[] additionalData1 = new byte[2 + FirstName1.length];
		additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData1[1] = 0x01;
		System.arraycopy(FirstName1, 0, additionalData1, 2, FirstName1.length);

		byte[] data1 = new byte[1 + additionalData1.length];
		data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x01 << 2));
		System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

		byte[] data2 = new byte[1 + FirstName2.length];
		data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x02 << 2));
		System.arraycopy(FirstName2, 0, data2, data2.length - FirstName2.length, FirstName2.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data1),
				new RegisteredUser(data2) };

		FirstName result1 = new FirstName(registeredUsers);
		assertEquals(new String(FirstName1) + new String(FirstName2),
				result1.getFirstName());
	}

	@Test
	public void test_constructor_00003() {
		byte[] FirstName1 = "github@im97mori.org".getBytes();
		byte[] FirstName2 = "github_@im97mori.org".getBytes();
		byte[] FirstName3 = "github__@im97mori.org".getBytes();

		byte[] additionalData1 = new byte[2 + FirstName1.length];
		additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData1[1] = 0x01;
		System.arraycopy(FirstName1, 0, additionalData1, 2, FirstName1.length);

		byte[] data1 = new byte[1 + additionalData1.length];
		data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x01 << 2));
		System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

		byte[] data2 = new byte[1 + FirstName2.length];
		data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x02 << 2));
		System.arraycopy(FirstName2, 0, data2, data2.length - FirstName2.length, FirstName2.length);

		byte[] data3 = new byte[1 + FirstName3.length];
		data3[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x03 << 2));
		System.arraycopy(FirstName3, 0, data3, data3.length - FirstName3.length, FirstName3.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data1), new RegisteredUser(data2),
				new RegisteredUser(data3) };

		FirstName result1 = new FirstName(registeredUsers);
		assertEquals(new String(FirstName1) + new String(FirstName2)
				+ new String(FirstName3), result1.getFirstName());
	}

	@Test
	public void test_constructor_00004() {
		String firstName = "a";

		FirstName result1 = new FirstName(firstName);
		assertEquals(firstName, result1.getFirstName());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] FirstName = "github@im97mori.org".getBytes();

		byte[] additionalData = new byte[2 + FirstName.length];
		additionalData[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData[1] = 0x01;
		System.arraycopy(FirstName, 0, additionalData, 2, FirstName.length);

		byte[] data = new byte[1 + additionalData.length];
		data[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x02 << 2));
		System.arraycopy(additionalData, 0, data, data.length - additionalData.length, additionalData.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data) };

		byte[] merged = new byte[3 + FirstName.length];
		merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
		merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
		merged[2] = (byte) 0;
		System.arraycopy(FirstName, 0, merged, 3, FirstName.length);

		FirstName result1 = new FirstName(registeredUsers);
		assertArrayEquals(merged, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] FirstName1 = "github@im97mori.org".getBytes();
		byte[] FirstName2 = "github_@im97mori.org".getBytes();

		byte[] additionalData1 = new byte[2 + FirstName1.length];
		additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData1[1] = 0x01;
		System.arraycopy(FirstName1, 0, additionalData1, 2, FirstName1.length);

		byte[] data1 = new byte[1 + additionalData1.length];
		data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x01 << 2));
		System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

		byte[] data2 = new byte[1 + FirstName2.length];
		data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x02 << 2));
		System.arraycopy(FirstName2, 0, data2, data2.length - FirstName2.length, FirstName2.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data1),
				new RegisteredUser(data2) };

		byte[] merged = new byte[3 + FirstName1.length + FirstName2.length];
		merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
		merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
		merged[2] = (byte) 0;
		System.arraycopy(FirstName1, 0, merged, 3, FirstName1.length);
		System.arraycopy(FirstName2, 0, merged, 3 + FirstName1.length, FirstName2.length);

		FirstName result1 = new FirstName(registeredUsers);
		assertArrayEquals(merged, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] FirstName1 = "github@im97mori.org".getBytes();
		byte[] FirstName2 = "github_@im97mori.org".getBytes();
		byte[] FirstName3 = "github__@im97mori.org".getBytes();

		byte[] additionalData1 = new byte[2 + FirstName1.length];
		additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
		additionalData1[1] = 0x01;
		System.arraycopy(FirstName1, 0, additionalData1, 2, FirstName1.length);

		byte[] data1 = new byte[1 + additionalData1.length];
		data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x01 << 2));
		System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

		byte[] data2 = new byte[1 + FirstName2.length];
		data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE | (0x02 << 2));
		System.arraycopy(FirstName2, 0, data2, data2.length - FirstName2.length, FirstName2.length);

		byte[] data3 = new byte[1 + FirstName3.length];
		data3[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE | (0x03 << 2));
		System.arraycopy(FirstName3, 0, data3, data3.length - FirstName3.length, FirstName3.length);

		RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data1), new RegisteredUser(data2),
				new RegisteredUser(data3) };

		byte[] merged = new byte[3 + FirstName1.length + FirstName2.length + FirstName3.length];
		merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
		merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
		merged[2] = (byte) 0;
		System.arraycopy(FirstName1, 0, merged, 3, FirstName1.length);
		System.arraycopy(FirstName2, 0, merged, 3 + FirstName1.length, FirstName2.length);
		System.arraycopy(FirstName3, 0, merged, 3 + FirstName1.length + FirstName2.length, FirstName3.length);

		FirstName result1 = new FirstName(registeredUsers);
		assertArrayEquals(merged, result1.getBytes());
	}

}
