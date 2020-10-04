package org.im97mori.ble.characteristic.u2a90;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.u2b37.RegisteredUser;
import org.junit.Test;

public class LastNameTest {

    @Test
    public void test_constructor_00001() {
        byte[] LastName = "github@im97mori.org".getBytes();

        byte[] additionalData = new byte[2 + LastName.length];
        additionalData[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData[1] = 0x01;
        System.arraycopy(LastName, 0, additionalData, 2, LastName.length);

        byte[] data = new byte[1 + additionalData.length];
        data[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x02 << 2));

        System.arraycopy(additionalData, 0, data, data.length - additionalData.length, additionalData.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data) };

        LastName result1 = new LastName(registeredUsers);
        assertEquals(new String(LastName), result1.getLastName());
    }

    @Test
    public void test_constructor_00002() {
        byte[] LastName1 = "github@im97mori.org".getBytes();
        byte[] LastName2 = "github_@im97mori.org".getBytes();

        byte[] additionalData1 = new byte[2 + LastName1.length];
        additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData1[1] = 0x01;
        System.arraycopy(LastName1, 0, additionalData1, 2, LastName1.length);

        byte[] data1 = new byte[1 + additionalData1.length];
        data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x01 << 2));
        System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

        byte[] data2 = new byte[1 + LastName2.length];
        data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x02 << 2));
        System.arraycopy(LastName2, 0, data2, data2.length - LastName2.length, LastName2.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] {
                new RegisteredUser(data1), new RegisteredUser(data2)
        };

        LastName result1 = new LastName(registeredUsers);
        assertEquals(new String(LastName1) + new String(LastName2), result1.getLastName());
    }

    @Test
    public void test_constructor_00003() {
        byte[] LastName1 = "github@im97mori.org".getBytes();
        byte[] LastName2 = "github_@im97mori.org".getBytes();
        byte[] LastName3 = "github__@im97mori.org".getBytes();

        byte[] additionalData1 = new byte[2 + LastName1.length];
        additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData1[1] = 0x01;
        System.arraycopy(LastName1, 0, additionalData1, 2, LastName1.length);

        byte[] data1 = new byte[1 + additionalData1.length];
        data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x01 << 2));
        System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

        byte[] data2 = new byte[1 + LastName2.length];
        data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x02 << 2));
        System.arraycopy(LastName2, 0, data2, data2.length - LastName2.length, LastName2.length);

        byte[] data3 = new byte[1 + LastName3.length];
        data3[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x03 << 2));
        System.arraycopy(LastName3, 0, data3, data3.length - LastName3.length, LastName3.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] {
                new RegisteredUser(data1), new RegisteredUser(data2), new RegisteredUser(data3)
        };

        LastName result1 = new LastName(registeredUsers);
        assertEquals(new String(LastName1) + new String(LastName2) + new String(LastName3), result1.getLastName());
    }

    @Test
    public void test_constructor_00004() {
        String LastName = "a";

        LastName result1 = new LastName(LastName);
        assertEquals(LastName, result1.getLastName());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] LastName = "github@im97mori.org".getBytes();

        byte[] additionalData = new byte[2 + LastName.length];
        additionalData[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData[1] = 0x01;
        System.arraycopy(LastName, 0, additionalData, 2, LastName.length);

        byte[] data = new byte[1 + additionalData.length];
        data[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x02 << 2));
        System.arraycopy(additionalData, 0, data, data.length - additionalData.length, additionalData.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data) };

        byte[] merged = new byte[3 + LastName.length];
        merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
        merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
        merged[2] = (byte) 0;
        System.arraycopy(LastName, 0, merged, 3, LastName.length);

        LastName result1 = new LastName(registeredUsers);
        assertArrayEquals(merged, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] LastName1 = "github@im97mori.org".getBytes();
        byte[] LastName2 = "github_@im97mori.org".getBytes();

        byte[] additionalData1 = new byte[2 + LastName1.length];
        additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData1[1] = 0x01;
        System.arraycopy(LastName1, 0, additionalData1, 2, LastName1.length);

        byte[] data1 = new byte[1 + additionalData1.length];
        data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x01 << 2));
        System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

        byte[] data2 = new byte[1 + LastName2.length];
        data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x02 << 2));
        System.arraycopy(LastName2, 0, data2, data2.length - LastName2.length, LastName2.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] {
                new RegisteredUser(data1), new RegisteredUser(data2)
        };

        byte[] merged = new byte[3 + LastName1.length + LastName2.length];
        merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
        merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
        merged[2] = (byte) 0;
        System.arraycopy(LastName1, 0, merged, 3, LastName1.length);
        System.arraycopy(LastName2, 0, merged, 3 + LastName1.length, LastName2.length);

        LastName result1 = new LastName(registeredUsers);
        assertArrayEquals(merged, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] LastName1 = "github@im97mori.org".getBytes();
        byte[] LastName2 = "github_@im97mori.org".getBytes();
        byte[] LastName3 = "github__@im97mori.org".getBytes();

        byte[] additionalData1 = new byte[2 + LastName1.length];
        additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData1[1] = 0x01;
        System.arraycopy(LastName1, 0, additionalData1, 2, LastName1.length);

        byte[] data1 = new byte[1 + additionalData1.length];
        data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x01 << 2));
        System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

        byte[] data2 = new byte[1 + LastName2.length];
        data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x02 << 2));
        System.arraycopy(LastName2, 0, data2, data2.length - LastName2.length, LastName2.length);

        byte[] data3 = new byte[1 + LastName3.length];
        data3[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x03 << 2));
        System.arraycopy(LastName3, 0, data3, data3.length - LastName3.length, LastName3.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] {
                new RegisteredUser(data1), new RegisteredUser(data2), new RegisteredUser(data3)
        };

        byte[] merged = new byte[3 + LastName1.length + LastName2.length + LastName3.length];
        merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
        merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
        merged[2] = (byte) 0;
        System.arraycopy(LastName1, 0, merged, 3, LastName1.length);
        System.arraycopy(LastName2, 0, merged, 3 + LastName1.length, LastName2.length);
        System.arraycopy(LastName3, 0, merged, 3 + LastName1.length + LastName2.length, LastName3.length);

        LastName result1 = new LastName(registeredUsers);
        assertArrayEquals(merged, result1.getBytes());
    }

}
