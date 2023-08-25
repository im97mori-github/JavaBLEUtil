package org.im97mori.ble.characteristic.u2aed;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class DateUtcTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) DateUtc.DATE_UTC_IS_NOT_KNOWN;
        data[ 1] = (byte) (DateUtc.DATE_UTC_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (DateUtc.DATE_UTC_IS_NOT_KNOWN >> 16);
        //@formatter:on

        DateUtc result1 = new DateUtc(data);
        assertEquals(DateUtc.DATE_UTC_IS_NOT_KNOWN, result1.getDate());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 16777214;
        data[ 1] = (byte) (16777214 >> 8);
        data[ 2] = (byte) (16777214 >> 16);
        //@formatter:on

        DateUtc result1 = new DateUtc(data);
        assertEquals(16777214, result1.getDate());
    }

    @Test
    public void test_constructor_00101() {
        int dateUtc = DateUtc.DATE_UTC_IS_NOT_KNOWN;

        DateUtc result1 = new DateUtc(dateUtc);
        assertEquals(dateUtc, result1.getDate());
    }

    @Test
    public void test_constructor_00102() {
        int dateUtc = 16777214;

        DateUtc result1 = new DateUtc(dateUtc);
        assertEquals(dateUtc, result1.getDate());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) DateUtc.DATE_UTC_IS_NOT_KNOWN;
        data[ 1] = (byte) (DateUtc.DATE_UTC_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (DateUtc.DATE_UTC_IS_NOT_KNOWN >> 16);
        //@formatter:on

        DateUtc result1 = new DateUtc(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 16777214;
        data[ 1] = (byte) (16777214 >> 8);
        data[ 2] = (byte) (16777214 >> 16);
        //@formatter:on

        DateUtc result1 = new DateUtc(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
