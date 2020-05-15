package org.im97mori.ble.characteristic.u2a26;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class FirmwareRevisionStringTest {

    @Test
    public void test_constructor001() {
        String firmwareRevision = "00.00";

        FirmwareRevisionString result1 = new FirmwareRevisionString(firmwareRevision.getBytes(StandardCharsets.UTF_8));
        assertEquals(firmwareRevision, result1.getFirmwareRevision());
    }

    @Test
    public void test_constructor002() {
        String firmwareRevision = "99.99";

        FirmwareRevisionString result1 = new FirmwareRevisionString(firmwareRevision.getBytes(StandardCharsets.UTF_8));
        assertEquals(firmwareRevision, result1.getFirmwareRevision());
    }

    @Test
    public void test_constructor003() {
        String firmwareRevision = "99.99";

        FirmwareRevisionString result1 = new FirmwareRevisionString(firmwareRevision);
        assertEquals(firmwareRevision, result1.getFirmwareRevision());
    }

    @Test
    public void test_parcelable003() {
        String firmwareRevision = "12.34";

        FirmwareRevisionString result1 = new FirmwareRevisionString(firmwareRevision.getBytes(StandardCharsets.UTF_8));
        byte[] resultData = result1.getBytes();
        assertArrayEquals(firmwareRevision.getBytes(), resultData);
    }

}
