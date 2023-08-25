package org.im97mori.ble.characteristic.u2b08;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.GenericLevelUtils;
import org.im97mori.ble.characteristic.core.Percentage8Utils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class RelativeRuntimeInAGenericLevelRangeTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM;
        data[ 2] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM >> 8);
        data[ 3] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM;
        data[ 4] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM >> 8);
        //@formatter:on

        RelativeRuntimeInAGenericLevelRange result = new RelativeRuntimeInAGenericLevelRange(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt16(data, 1), result.getMinimumGenericLevel());
        assertEquals(BLEUtils.createUInt16(data, 3), result.getMaximumGenericLevel());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_MINIMUM;
        data[ 1] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM;
        data[ 2] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM >> 8);
        data[ 3] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM;
        data[ 4] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM >> 8);
        //@formatter:on

        RelativeRuntimeInAGenericLevelRange result = new RelativeRuntimeInAGenericLevelRange(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt16(data, 1), result.getMinimumGenericLevel());
        assertEquals(BLEUtils.createUInt16(data, 3), result.getMaximumGenericLevel());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_MAXIMUM;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on

        RelativeRuntimeInAGenericLevelRange result = new RelativeRuntimeInAGenericLevelRange(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt16(data, 1), result.getMinimumGenericLevel());
        assertEquals(BLEUtils.createUInt16(data, 3), result.getMaximumGenericLevel());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on

        RelativeRuntimeInAGenericLevelRange result = new RelativeRuntimeInAGenericLevelRange(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt16(data, 1), result.getMinimumGenericLevel());
        assertEquals(BLEUtils.createUInt16(data, 3), result.getMaximumGenericLevel());
    }

    @Test
    public void test_constructor_00101() {
        int relativeValue = Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        int minimumGenericLevel = GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM;
        int maximumGenericLevel = GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM;

        RelativeRuntimeInAGenericLevelRange result = new RelativeRuntimeInAGenericLevelRange(relativeValue, minimumGenericLevel, maximumGenericLevel);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(minimumGenericLevel, result.getMinimumGenericLevel());
        assertEquals(maximumGenericLevel, result.getMaximumGenericLevel());
    }

    @Test
    public void test_constructor_00102() {
        int relativeValue = (int) Percentage8Utils.PERCENTAGE_8_VALUE_MINIMUM;
        int minimumGenericLevel = GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM;
        int maximumGenericLevel = GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM;

        RelativeRuntimeInAGenericLevelRange result = new RelativeRuntimeInAGenericLevelRange(relativeValue, minimumGenericLevel, maximumGenericLevel);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(minimumGenericLevel, result.getMinimumGenericLevel());
        assertEquals(maximumGenericLevel, result.getMaximumGenericLevel());
    }

    @Test
    public void test_constructor_00103() {
        int relativeValue = (int) Percentage8Utils.PERCENTAGE_8_VALUE_MAXIMUM;
        int minimumGenericLevel = 2;
        int maximumGenericLevel = 3;

        RelativeRuntimeInAGenericLevelRange result = new RelativeRuntimeInAGenericLevelRange(relativeValue, minimumGenericLevel, maximumGenericLevel);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(minimumGenericLevel, result.getMinimumGenericLevel());
        assertEquals(maximumGenericLevel, result.getMaximumGenericLevel());
    }

    @Test
    public void test_constructor_00104() {
        int relativeValue = 1;
        int minimumGenericLevel = 2;
        int maximumGenericLevel = 3;

        RelativeRuntimeInAGenericLevelRange result = new RelativeRuntimeInAGenericLevelRange(relativeValue, minimumGenericLevel, maximumGenericLevel);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(minimumGenericLevel, result.getMinimumGenericLevel());
        assertEquals(maximumGenericLevel, result.getMaximumGenericLevel());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM;
        data[ 2] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM >> 8);
        data[ 3] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM;
        data[ 4] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM >> 8);
        //@formatter:on

        RelativeRuntimeInAGenericLevelRange result1 = new RelativeRuntimeInAGenericLevelRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_MINIMUM;
        data[ 1] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM;
        data[ 2] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM >> 8);
        data[ 3] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM;
        data[ 4] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM >> 8);
        //@formatter:on

        RelativeRuntimeInAGenericLevelRange result1 = new RelativeRuntimeInAGenericLevelRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_MAXIMUM;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on

        RelativeRuntimeInAGenericLevelRange result1 = new RelativeRuntimeInAGenericLevelRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on

        RelativeRuntimeInAGenericLevelRange result1 = new RelativeRuntimeInAGenericLevelRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
