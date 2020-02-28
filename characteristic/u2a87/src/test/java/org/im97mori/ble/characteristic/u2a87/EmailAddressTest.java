package org.im97mori.ble.characteristic.u2a87;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.core.RegisteredUser;
import org.junit.Test;

public class EmailAddressTest {

    @Test
    public void test_constructor_00001() {
        byte[] emailAddress = "github@im97mori.org".getBytes();

        byte[] additionalData = new byte[2 + emailAddress.length];
        additionalData[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData[1] = 0x01;
        System.arraycopy(emailAddress, 0, additionalData, 2, emailAddress.length);

        byte[] data = new byte[1 + additionalData.length];
        data[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x02 << 2));

        System.arraycopy(additionalData, 0, data, data.length - additionalData.length, additionalData.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data) };

        EmailAddress result1 = new EmailAddress(registeredUsers);
        assertEquals(new String(emailAddress), result1.getEmailAddress());
    }

    @Test
    public void test_constructor_00002() {
        byte[] emailAddress1 = "github@im97mori.org".getBytes();
        byte[] emailAddress2 = "github_@im97mori.org".getBytes();

        byte[] additionalData1 = new byte[2 + emailAddress1.length];
        additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData1[1] = 0x01;
        System.arraycopy(emailAddress1, 0, additionalData1, 2, emailAddress1.length);

        byte[] data1 = new byte[1 + additionalData1.length];
        data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x01 << 2));
        System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

        byte[] data2 = new byte[1 + emailAddress2.length];
        data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x02 << 2));
        System.arraycopy(emailAddress2, 0, data2, data2.length - emailAddress2.length, emailAddress2.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] {
                new RegisteredUser(data1), new RegisteredUser(data2)
        };

        EmailAddress result1 = new EmailAddress(registeredUsers);
        assertEquals(new String(emailAddress1) + new String(emailAddress2), result1.getEmailAddress());
    }

    @Test
    public void test_constructor_00003() {
        byte[] emailAddress1 = "github@im97mori.org".getBytes();
        byte[] emailAddress2 = "github_@im97mori.org".getBytes();
        byte[] emailAddress3 = "github__@im97mori.org".getBytes();

        byte[] additionalData1 = new byte[2 + emailAddress1.length];
        additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData1[1] = 0x01;
        System.arraycopy(emailAddress1, 0, additionalData1, 2, emailAddress1.length);

        byte[] data1 = new byte[1 + additionalData1.length];
        data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x01 << 2));
        System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

        byte[] data2 = new byte[1 + emailAddress2.length];
        data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x02 << 2));
        System.arraycopy(emailAddress2, 0, data2, data2.length - emailAddress2.length, emailAddress2.length);

        byte[] data3 = new byte[1 + emailAddress3.length];
        data3[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x03 << 2));
        System.arraycopy(emailAddress3, 0, data3, data3.length - emailAddress3.length, emailAddress3.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] {
                new RegisteredUser(data1), new RegisteredUser(data2), new RegisteredUser(data3)
        };

        EmailAddress result1 = new EmailAddress(registeredUsers);
        assertEquals(new String(emailAddress1) + new String(emailAddress2) + new String(emailAddress3), result1.getEmailAddress());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] emailAddress = "github@im97mori.org".getBytes();

        byte[] additionalData = new byte[2 + emailAddress.length];
        additionalData[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData[1] = 0x01;
        System.arraycopy(emailAddress, 0, additionalData, 2, emailAddress.length);

        byte[] data = new byte[1 + additionalData.length];
        data[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x02 << 2));
        System.arraycopy(additionalData, 0, data, data.length - additionalData.length, additionalData.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] { new RegisteredUser(data) };

        byte[] merged = new byte[3 + emailAddress.length];
        merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
        merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
        merged[2] = (byte) 0;
        System.arraycopy(emailAddress, 0, merged, 3, emailAddress.length);

        EmailAddress result1 = new EmailAddress(registeredUsers);
        assertArrayEquals(merged, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] emailAddress1 = "github@im97mori.org".getBytes();
        byte[] emailAddress2 = "github_@im97mori.org".getBytes();

        byte[] additionalData1 = new byte[2 + emailAddress1.length];
        additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData1[1] = 0x01;
        System.arraycopy(emailAddress1, 0, additionalData1, 2, emailAddress1.length);

        byte[] data1 = new byte[1 + additionalData1.length];
        data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x01 << 2));
        System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

        byte[] data2 = new byte[1 + emailAddress2.length];
        data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x02 << 2));
        System.arraycopy(emailAddress2, 0, data2, data2.length - emailAddress2.length, emailAddress2.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] {
                new RegisteredUser(data1), new RegisteredUser(data2)
        };

        byte[] merged = new byte[3 + emailAddress1.length + emailAddress2.length];
        merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
        merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
        merged[2] = (byte) 0;
        System.arraycopy(emailAddress1, 0, merged, 3, emailAddress1.length);
        System.arraycopy(emailAddress2, 0, merged, 3 + emailAddress1.length, emailAddress2.length);

        EmailAddress result1 = new EmailAddress(registeredUsers);
        assertArrayEquals(merged, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] emailAddress1 = "github@im97mori.org".getBytes();
        byte[] emailAddress2 = "github_@im97mori.org".getBytes();
        byte[] emailAddress3 = "github__@im97mori.org".getBytes();

        byte[] additionalData1 = new byte[2 + emailAddress1.length];
        additionalData1[0] = RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
                | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_TRUE;
        additionalData1[1] = 0x01;
        System.arraycopy(emailAddress1, 0, additionalData1, 2, emailAddress1.length);

        byte[] data1 = new byte[1 + additionalData1.length];
        data1[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x01 << 2));
        System.arraycopy(additionalData1, 0, data1, data1.length - additionalData1.length, additionalData1.length);

        byte[] data2 = new byte[1 + emailAddress2.length];
        data2[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
                | (0x02 << 2));
        System.arraycopy(emailAddress2, 0, data2, data2.length - emailAddress2.length, emailAddress2.length);

        byte[] data3 = new byte[1 + emailAddress3.length];
        data3[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
                | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
                | (0x03 << 2));
        System.arraycopy(emailAddress3, 0, data3, data3.length - emailAddress3.length, emailAddress3.length);

        RegisteredUser[] registeredUsers = new RegisteredUser[] {
                new RegisteredUser(data1), new RegisteredUser(data2), new RegisteredUser(data3)
        };

        byte[] merged = new byte[3 + emailAddress1.length + emailAddress2.length + emailAddress3.length];
        merged[0] = (byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
        merged[1] = (byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE);
        merged[2] = (byte) 0;
        System.arraycopy(emailAddress1, 0, merged, 3, emailAddress1.length);
        System.arraycopy(emailAddress2, 0, merged, 3 + emailAddress1.length, emailAddress2.length);
        System.arraycopy(emailAddress3, 0, merged, 3 + emailAddress1.length + emailAddress2.length, emailAddress3.length);

        EmailAddress result1 = new EmailAddress(registeredUsers);
        assertArrayEquals(merged, result1.getBytes());
    }

}
