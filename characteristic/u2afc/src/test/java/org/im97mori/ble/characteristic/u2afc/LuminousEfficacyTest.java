package org.im97mori.ble.characteristic.u2afc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class LuminousEfficacyTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        LuminousEfficacy result = new LuminousEfficacy(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousEfficacy());
        assertTrue(result.isLuminousEfficacyValueIsNotKnown());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MINIMUM / LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT);
        data[ 1] = (byte) (((int) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MINIMUM / LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT)) >> 8);
        //@formatter:on

        LuminousEfficacy result = new LuminousEfficacy(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(BLEUtils.createUInt16(data, 0) * LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MAXIMUM / LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT);
        data[ 1] = (byte) (((int) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MAXIMUM / LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT)) >> 8);
        //@formatter:on

        LuminousEfficacy result = new LuminousEfficacy(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(BLEUtils.createUInt16(data, 0) * LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 18001;
        data[ 1] = (byte) (18001 >> 8);
        //@formatter:on

        LuminousEfficacy result = new LuminousEfficacy(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MAXIMUM, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_constructor_00005() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 1;
        data[ 1] = (byte) (1 >> 8);
        //@formatter:on

        LuminousEfficacy result = new LuminousEfficacy(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(BLEUtils.createUInt16(data, 0) * LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_constructor_00006() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 17999;
        data[ 1] = (byte) (17999 >> 8);
        //@formatter:on

        LuminousEfficacy result = new LuminousEfficacy(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(BLEUtils.createUInt16(data, 0) * LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_constructor_00101() {
        int luminousEfficacy = LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_IS_NOT_KNOWN;

        LuminousEfficacy result = new LuminousEfficacy(luminousEfficacy);
        assertEquals(luminousEfficacy, result.getLuminousEfficacy());
        assertTrue(result.isLuminousEfficacyValueIsNotKnown());
    }

    @Test
    public void test_constructor_00102() {
        int luminousEfficacy = (int) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MINIMUM / LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT);

        LuminousEfficacy result = new LuminousEfficacy(luminousEfficacy);
        assertEquals(luminousEfficacy, result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(luminousEfficacy * LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_constructor_00103() {
        int luminousEfficacy = (int) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MAXIMUM / LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT);

        LuminousEfficacy result = new LuminousEfficacy(luminousEfficacy);
        assertEquals(luminousEfficacy, result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(luminousEfficacy * LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_constructor_00104() {
        int luminousEfficacy = 18001;

        LuminousEfficacy result = new LuminousEfficacy(luminousEfficacy);
        assertEquals(luminousEfficacy, result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MAXIMUM, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_constructor_00105() {
        int luminousEfficacy = 1;

        LuminousEfficacy result = new LuminousEfficacy(luminousEfficacy);
        assertEquals(luminousEfficacy, result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(luminousEfficacy * LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_constructor_00106() {
        int luminousEfficacy = 17999;

        LuminousEfficacy result = new LuminousEfficacy(luminousEfficacy);
        assertEquals(luminousEfficacy, result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(luminousEfficacy * LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_constructor_00107() {
        int luminousEfficacy = -1;

        LuminousEfficacy result = new LuminousEfficacy(luminousEfficacy);
        assertEquals(luminousEfficacy, result.getLuminousEfficacy());
        assertFalse(result.isLuminousEfficacyValueIsNotKnown());
        assertEquals(LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MINIMUM, result.getLuminousEfficacyLumenPerWatt(), 0);
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        LuminousEfficacy result1 = new LuminousEfficacy(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MINIMUM / LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT);
        data[ 1] = (byte) (((int) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MINIMUM / LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT)) >> 8);
        //@formatter:on

        LuminousEfficacy result1 = new LuminousEfficacy(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MAXIMUM / LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT);
        data[ 1] = (byte) (((int) (LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_MAXIMUM / LuminousEfficacy.LUMINOUS_EFFICACY_VALUE_UNIT)) >> 8);
        //@formatter:on
        LuminousEfficacy result1 = new LuminousEfficacy(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 18001;
        data[ 1] = (byte) (18001 >> 8);
        //@formatter:on

        LuminousEfficacy result1 = new LuminousEfficacy(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00105() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 1;
        data[ 1] = (byte) (1 >> 8);
        //@formatter:on

        LuminousEfficacy result1 = new LuminousEfficacy(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00106() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 17999;
        data[ 1] = (byte) (17999 >> 8);
        //@formatter:on

        LuminousEfficacy result1 = new LuminousEfficacy(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
