package org.im97mori.ble.descriptor.u2907;

import static org.im97mori.ble.BLEUtils.BASE_UUID;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;

public class ExternalReportReferenceTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = 0x02;

        long target = value[0] & 0xff;
        target |= (value[1] & 0xff) << 8;
        target = target << 32;
        UUID uuid = new UUID(BASE_UUID.getMostSignificantBits() | target, BASE_UUID.getLeastSignificantBits());
        //@formatter:on

        ExternalReportReference result = new ExternalReportReference(value);
        assertArrayEquals(value, result.getExternalReportReference());
        assertEquals(uuid, result.getExternalReportReferenceUuid());
    }

    @Test
    public void test_constructor002() {
        byte[] externalReportReference = new byte[] { 1 };
        UUID uuid = UUID.randomUUID();

        ExternalReportReference result = new ExternalReportReference(externalReportReference, uuid);
        assertArrayEquals(externalReportReference, result.getExternalReportReference());
        assertEquals(uuid, result.getExternalReportReferenceUuid());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        //@formatter:on

        ExternalReportReference result1 = new ExternalReportReference(value);
        assertArrayEquals(value, result1.getBytes());
    }

}
