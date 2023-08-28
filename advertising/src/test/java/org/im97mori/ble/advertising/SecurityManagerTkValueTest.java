package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SECURITY_MANAGER_TK_VALUE_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class SecurityManagerTkValueTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = SECURITY_MANAGER_TK_VALUE_DATA_TYPE;
        data[2] = 0x01;
        data[3] = 0x02;
        data[4] = 0x03;
        data[5] = 0x04;
        data[6] = 0x05;
        data[7] = 0x06;
        data[8] = 0x07;
        data[9] = 0x08;
        data[10] = 0x09;
        data[11] = 0x0a;
        data[12] = 0x0b;
        data[13] = 0x0c;
        data[14] = 0x0d;
        data[15] = 0x0e;
        data[16] = 0x0f;
        data[17] = 0x10;
        data_00001 = data;
    }
    //@formatter:on

    @Test
    public void test_constructor_1_00001() {
        byte[] data = getData();

        SecurityManagerTkValue result1 = new SecurityManagerTkValue(data, 0, data[0]);
        assertEquals(17, result1.getLength());
        assertEquals(SECURITY_MANAGER_TK_VALUE_DATA_TYPE, result1.getDataType());
        assertEquals(BLEUtils.createUInt128(data, 2), result1.getSecurityManagerTkValue());
    }

    @Test
    public void test_constructor_2_00001() {
        byte[] data = getData();

        SecurityManagerTkValue result1 = new SecurityManagerTkValue(data, 0);
        assertEquals(17, result1.getLength());
        assertEquals(SECURITY_MANAGER_TK_VALUE_DATA_TYPE, result1.getDataType());
        assertEquals(BLEUtils.createUInt128(data, 2), result1.getSecurityManagerTkValue());
    }

    @Test
    public void test_constructor_3_00001() {
        byte[] data = getData();

        byte[] securityManagerTkValue = new byte[16];
        System.arraycopy(data, 2, securityManagerTkValue, 0, 16);
        SecurityManagerTkValue result1 = new SecurityManagerTkValue(securityManagerTkValue);
        assertEquals(17, result1.getLength());
        assertEquals(SECURITY_MANAGER_TK_VALUE_DATA_TYPE, result1.getDataType());
        assertEquals(BLEUtils.createUInt128(data, 2), result1.getSecurityManagerTkValue());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        SecurityManagerTkValue result1 = new SecurityManagerTkValue(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

}
