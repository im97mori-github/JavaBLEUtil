package org.im97mori.ble.characteristic.u2aa6;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class CentralAddressResolutionTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) (CentralAddressResolution.CENTRAL_ADDRESS_RESOLUTION_NOT_SUPPORTED & 0xff);
        //@formatter:on

        CentralAddressResolution result1 = new CentralAddressResolution(data);
        assertEquals(CentralAddressResolution.CENTRAL_ADDRESS_RESOLUTION_NOT_SUPPORTED, result1.getCentralAddressResolutionSupport());
        assertTrue(result1.isCentralAddressResolutionNotSupported());
        assertFalse(result1.isCentralAddressResolutionSupported());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) (CentralAddressResolution.CENTRAL_ADDRESS_RESOLUTION_SUPPORTED & 0xff);
        //@formatter:on

        CentralAddressResolution result1 = new CentralAddressResolution(data);
        assertEquals(CentralAddressResolution.CENTRAL_ADDRESS_RESOLUTION_SUPPORTED, result1.getCentralAddressResolutionSupport());
        assertFalse(result1.isCentralAddressResolutionNotSupported());
        assertTrue(result1.isCentralAddressResolutionSupported());
    }

    @Test
    public void test_constructor003() {
        int centralAddressResolutionSupport = 1;

        CentralAddressResolution result1 = new CentralAddressResolution(centralAddressResolutionSupport);
        assertEquals(centralAddressResolutionSupport, result1.getCentralAddressResolutionSupport());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) (CentralAddressResolution.CENTRAL_ADDRESS_RESOLUTION_SUPPORTED & 0xff);
        //@formatter:on

        CentralAddressResolution result1 = new CentralAddressResolution(data);
        byte[] resultData = result1.getBytes();
        assertArrayEquals(data, resultData);
    }

}
