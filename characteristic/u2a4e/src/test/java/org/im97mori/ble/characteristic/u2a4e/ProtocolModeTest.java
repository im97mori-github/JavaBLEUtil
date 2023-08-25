package org.im97mori.ble.characteristic.u2a4e;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class ProtocolModeTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = ProtocolMode.PROTOCOL_MODE_VALUE_BOOT_PROTOCOL_MODE;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[1];
        data[ 0] = ProtocolMode.PROTOCOL_MODE_VALUE_REPORT_PROTOCOL_MODE;
        data_00002 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        ProtocolMode result1 = new ProtocolMode(data);
        assertEquals(ProtocolMode.PROTOCOL_MODE_VALUE_BOOT_PROTOCOL_MODE, result1.getProtocolModeValue());
        assertTrue(result1.isProtocolModeValueBootProtocolMode());
        assertFalse(result1.isProtocolModeValueReportProtocolMode());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        ProtocolMode result1 = new ProtocolMode(data);
        assertEquals(ProtocolMode.PROTOCOL_MODE_VALUE_REPORT_PROTOCOL_MODE, result1.getProtocolModeValue());
        assertFalse(result1.isProtocolModeValueBootProtocolMode());
        assertTrue(result1.isProtocolModeValueReportProtocolMode());
    }

    @Test
    public void test_constructor_00003() {
        int protocolModeValues = 1;

        ProtocolMode result1 = new ProtocolMode(protocolModeValues);
        assertEquals(ProtocolMode.PROTOCOL_MODE_VALUE_REPORT_PROTOCOL_MODE, result1.getProtocolModeValue());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ProtocolMode result1 = new ProtocolMode(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        ProtocolMode result1 = new ProtocolMode(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
