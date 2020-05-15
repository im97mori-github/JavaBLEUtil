package org.im97mori.ble.characteristic.u2a02;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PeripheralPrivacyFlagTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) (PeripheralPrivacyFlag.FLAGS_PRIVACY_IS_DISABLED_IN_THIS_DEVICE & 0xff);
        //@formatter:on

        PeripheralPrivacyFlag result1 = new PeripheralPrivacyFlag(data);
        assertEquals(PeripheralPrivacyFlag.FLAGS_PRIVACY_IS_DISABLED_IN_THIS_DEVICE, result1.getFlag());
        assertTrue(result1.isPrivacyDisabled());
        assertFalse(result1.isPrivacyEnabled());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) (PeripheralPrivacyFlag.FLAGS_PRIVACY_IS_ENABLED_IN_THIS_DEVICE & 0xff);
        //@formatter:on

        PeripheralPrivacyFlag result1 = new PeripheralPrivacyFlag(data);
        assertEquals(PeripheralPrivacyFlag.FLAGS_PRIVACY_IS_ENABLED_IN_THIS_DEVICE, result1.getFlag());
        assertFalse(result1.isPrivacyDisabled());
        assertTrue(result1.isPrivacyEnabled());
    }

    @Test
    public void test_constructor003() {
        int flag = 1;

        PeripheralPrivacyFlag result1 = new PeripheralPrivacyFlag(flag);
        assertEquals(flag, result1.getFlag());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) (PeripheralPrivacyFlag.FLAGS_PRIVACY_IS_ENABLED_IN_THIS_DEVICE & 0xff);
        //@formatter:on

        PeripheralPrivacyFlag result1 = new PeripheralPrivacyFlag(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
