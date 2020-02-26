package org.im97mori.ble.characteristic.u2ac9;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ResolvablePrivateAddressOnlyTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) (ResolvablePrivateAddressOnly.RESOLVABLE_PRIVATE_ADDRESS_0 & 0xff);
        //@formatter:on

        ResolvablePrivateAddressOnly result1 = new ResolvablePrivateAddressOnly(data);
        assertEquals(ResolvablePrivateAddressOnly.RESOLVABLE_PRIVATE_ADDRESS_0, result1.getResolvablePrivateAddress());
        assertTrue(result1.isResolvablePrivateAddress0());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) (ResolvablePrivateAddressOnly.RESOLVABLE_PRIVATE_ADDRESS_0 + 1 & 0xff);
        //@formatter:on

        ResolvablePrivateAddressOnly result1 = new ResolvablePrivateAddressOnly(data);
        assertEquals(ResolvablePrivateAddressOnly.RESOLVABLE_PRIVATE_ADDRESS_0 + 1, result1.getResolvablePrivateAddress());
        assertFalse(result1.isResolvablePrivateAddress0());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) (ResolvablePrivateAddressOnly.RESOLVABLE_PRIVATE_ADDRESS_0 & 0xff);
        //@formatter:on

        ResolvablePrivateAddressOnly result1 = new ResolvablePrivateAddressOnly(data);
        byte[] resultData = result1.getBytes();
        assertArrayEquals(data, resultData);
    }

}
