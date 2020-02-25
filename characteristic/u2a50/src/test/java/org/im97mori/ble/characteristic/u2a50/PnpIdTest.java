package org.im97mori.ble.characteristic.u2a50;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PnpIdTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[7];
        data[ 0] = (byte) PnpId.VENDOR_ID_SURCE_BLUETOOTH_SIG & 0xff;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        //@formatter:on

        PnpId result1 = new PnpId(data);
        assertEquals(PnpId.VENDOR_ID_SURCE_BLUETOOTH_SIG, result1.getVendorIdSource());
        assertEquals(0x0302, result1.getVendorId());
        assertEquals(0x0504, result1.getProductId());
        assertEquals(0x0706, result1.getProductVersion());
        assertTrue(result1.isVendorIsSourceBluetoothSig());
        assertFalse(result1.isVendorIsSourceBluetoothUsb());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[7];
        data[ 0] = (byte) PnpId.VENDOR_ID_SURCE_USB & 0xff;
        data[ 1] = 0x02;
        data[ 2] = (byte) 0xff;
        data[ 3] = 0x04;
        data[ 4] = (byte) 0xff;
        data[ 5] = 0x06;
        data[ 6] = (byte) 0xff;
        //@formatter:on

        PnpId result1 = new PnpId(data);
        assertEquals(PnpId.VENDOR_ID_SURCE_USB, result1.getVendorIdSource());
        assertEquals(0xff02, result1.getVendorId());
        assertEquals(0xff04, result1.getProductId());
        assertEquals(0xff06, result1.getProductVersion());
        assertFalse(result1.isVendorIsSourceBluetoothSig());
        assertTrue(result1.isVendorIsSourceBluetoothUsb());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[7];
        data[ 0] = (byte) PnpId.VENDOR_ID_SURCE_BLUETOOTH_SIG & 0xff;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        //@formatter:on

        PnpId result1 = new PnpId(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
