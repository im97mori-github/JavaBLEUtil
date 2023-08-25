package org.im97mori.ble.characteristic.u2ad6;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class SupportedResistanceLevelRangeTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data_00001 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        SupportedResistanceLevelRange result1 = new SupportedResistanceLevelRange(data);
        assertEquals(0x0201, result1.getMinimumResistanceLevel());
        assertEquals(SupportedResistanceLevelRange.MINIMUM_RESISTANCE_LEVEL_RESOLUTION * 0x0201, result1.getMinimumResistanceLevelWithUnit(), 0);
        assertEquals(0x0403, result1.getMaximumResistanceLevel());
        assertEquals(SupportedResistanceLevelRange.MAXIMUM_RESISTANCE_LEVEL_RESOLUTION * 0x0403, result1.getMaximumResistanceLevelWithUnit(), 0);
        assertEquals(0x0605, result1.getMinimumIncrement());
        assertEquals(SupportedResistanceLevelRange.MINIMUM_INCREMENT_RESOLUTION * 0x0605, result1.getMinimumIncrementWithUnit(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int minimumResistanceLevel = 1;
        int maximumResistanceLevel = 2;
        int minimumIncrement = 3;

        SupportedResistanceLevelRange result1 = new SupportedResistanceLevelRange(minimumResistanceLevel, maximumResistanceLevel, minimumIncrement);
        assertEquals(minimumResistanceLevel, result1.getMinimumResistanceLevel());
        assertEquals(maximumResistanceLevel, result1.getMaximumResistanceLevel());
        assertEquals(minimumIncrement, result1.getMinimumIncrement());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        SupportedResistanceLevelRange result1 = new SupportedResistanceLevelRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
