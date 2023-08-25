package org.im97mori.ble.characteristic.u2a28;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class SoftwareRevisionStringTest extends TestBase {

    @Test
    public void test_constructor001() {
        String softwareRevision = "00.00";

        SoftwareRevisionString result1 = new SoftwareRevisionString(softwareRevision.getBytes());
        assertEquals(softwareRevision, result1.getSoftwareRevision());
    }

    @Test
    public void test_constructor002() {
        String softwareRevision = "99.99";

        SoftwareRevisionString result1 = new SoftwareRevisionString(softwareRevision.getBytes());
        assertEquals(softwareRevision, result1.getSoftwareRevision());
    }

    @Test
    public void test_constructor003() {
        String softwareRevision = "99.99";

        SoftwareRevisionString result1 = new SoftwareRevisionString(softwareRevision);
        assertEquals(softwareRevision, result1.getSoftwareRevision());
    }

    @Test
    public void test_parcelable003() {
        String softwareRevision = "12.34";

        SoftwareRevisionString result1 = new SoftwareRevisionString(softwareRevision.getBytes());
        byte[] resultData = result1.getBytes();
        assertArrayEquals(softwareRevision.getBytes(), resultData);
    }

}
