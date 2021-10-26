package org.im97mori.ble.characteristic.u2a27;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class HardwareRevisionStringTest {

    @Test
    public void test_constructor001() {
        String hardwareRevision = "00.00";

        HardwareRevisionString result1 = new HardwareRevisionString(hardwareRevision.getBytes());
        assertEquals(hardwareRevision, result1.getHardwareRevision());
    }

    @Test
    public void test_constructor002() {
        String hardwareRevision = "99.99";

        HardwareRevisionString result1 = new HardwareRevisionString(hardwareRevision.getBytes());
        assertEquals(hardwareRevision, result1.getHardwareRevision());
    }

    @Test
    public void test_constructor003() {
        String hardwareRevision = "99.99";

        HardwareRevisionString result1 = new HardwareRevisionString(hardwareRevision);
        assertEquals(hardwareRevision, result1.getHardwareRevision());
    }

    @Test
    public void test_parcelable003() {
        String hardwareRevision = "12.34";

        HardwareRevisionString result1 = new HardwareRevisionString(hardwareRevision.getBytes());
        byte[] resultData = result1.getBytes();
        assertArrayEquals(hardwareRevision.getBytes(), resultData);
    }

}
