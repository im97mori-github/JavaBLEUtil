package org.im97mori.ble.descriptor.u2908;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReportReferenceTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        //@formatter:on

        ReportReference result = new ReportReference(value);
        assertEquals(0x01, result.getReportId());
        assertEquals(0x02, result.getReportType());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = (byte) ReportReference.REPORT_TYPE_INPUT_REPORT;
        //@formatter:on

        ReportReference result = new ReportReference(value);
        assertTrue(result.isReportTypeInputReport());
        assertFalse(result.isReportTypeOutputReport());
        assertFalse(result.isReportTypeFeatureReport());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = (byte) ReportReference.REPORT_TYPE_OUTPUT_REPORT;
        //@formatter:on

        ReportReference result = new ReportReference(value);
        assertFalse(result.isReportTypeInputReport());
        assertTrue(result.isReportTypeOutputReport());
        assertFalse(result.isReportTypeFeatureReport());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = (byte) ReportReference.REPORT_TYPE_FEATURE_REPORT;
        //@formatter:on

        ReportReference result = new ReportReference(value);
        assertFalse(result.isReportTypeInputReport());
        assertFalse(result.isReportTypeOutputReport());
        assertTrue(result.isReportTypeFeatureReport());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        //@formatter:on

        ReportReference result1 = new ReportReference(value);
        assertArrayEquals(value, result1.getBytes());
    }

}
