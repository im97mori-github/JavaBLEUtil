package org.im97mori.ble.characteristic.u2aec;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class CountryCodeTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) CountryCode.COUNTRY_CODE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (CountryCode.COUNTRY_CODE_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        CountryCode result = new CountryCode(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getCountryCode());
        assertTrue(result.isCountryCodeValueIsNotKnown());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) CountryCode.COUNTRY_CODE_VALUE_MINIMUM;
        data[ 1] = (byte) (CountryCode.COUNTRY_CODE_VALUE_MINIMUM >> 8);
        //@formatter:on

        CountryCode result = new CountryCode(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getCountryCode());
        assertFalse(result.isCountryCodeValueIsNotKnown());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) CountryCode.COUNTRY_CODE_VALUE_MAXIMUM;
        data[ 1] = (byte) (CountryCode.COUNTRY_CODE_VALUE_MAXIMUM >> 8);
        //@formatter:on

        CountryCode result = new CountryCode(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getCountryCode());
        assertFalse(result.isCountryCodeValueIsNotKnown());
    }

    @Test
    public void test_constructor_00101() {
        int countryCode = CountryCode.COUNTRY_CODE_VALUE_IS_NOT_KNOWN;

        CountryCode result = new CountryCode(countryCode);
        assertEquals(countryCode, result.getCountryCode());
        assertTrue(result.isCountryCodeValueIsNotKnown());
    }

    @Test
    public void test_constructor_00102() {
        int countryCode = CountryCode.COUNTRY_CODE_VALUE_MINIMUM;

        CountryCode result = new CountryCode(countryCode);
        assertEquals(countryCode, result.getCountryCode());
        assertFalse(result.isCountryCodeValueIsNotKnown());
    }

    @Test
    public void test_constructor_00103() {
        int countryCode = CountryCode.COUNTRY_CODE_VALUE_MAXIMUM;

        CountryCode result = new CountryCode(countryCode);
        assertEquals(countryCode, result.getCountryCode());
        assertFalse(result.isCountryCodeValueIsNotKnown());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) CountryCode.COUNTRY_CODE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (CountryCode.COUNTRY_CODE_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        CountryCode result1 = new CountryCode(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) CountryCode.COUNTRY_CODE_VALUE_MINIMUM;
        data[ 1] = (byte) (CountryCode.COUNTRY_CODE_VALUE_MINIMUM >> 8);
        //@formatter:on

        CountryCode result1 = new CountryCode(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) CountryCode.COUNTRY_CODE_VALUE_MAXIMUM;
        data[ 1] = (byte) (CountryCode.COUNTRY_CODE_VALUE_MAXIMUM >> 8);
        //@formatter:on

        CountryCode result1 = new CountryCode(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
