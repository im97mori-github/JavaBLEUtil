package org.im97mori.ble.characteristic.u2af1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.ElectricCurrentUtils;
import org.junit.Test;

public class ElectricCurrentStatisticsTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 4] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 5] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 6] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 7] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        ElectricCurrentStatistics result = new ElectricCurrentStatistics(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getAverageElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getStandardDeviationElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 4), result.getMinimumElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 6), result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0;
        data[ 1] = (byte) (0 >> 8);
        data[ 2] = (byte) 0;
        data[ 3] = (byte) (0 >> 8);
        data[ 4] = (byte) 0;
        data[ 5] = (byte) (0 >> 8);
        data[ 6] = (byte) 0;
        data[ 7] = (byte) (0 >> 8);
        //@formatter:on

        ElectricCurrentStatistics result = new ElectricCurrentStatistics(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getAverageElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getStandardDeviationElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 4), result.getMinimumElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 6), result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 65534;
        data[ 1] = (byte) (65534 >> 8);
        data[ 2] = (byte) 65533;
        data[ 3] = (byte) (65533 >> 8);
        data[ 4] = (byte) 65532;
        data[ 5] = (byte) (65532 >> 8);
        data[ 6] = (byte) 65531;
        data[ 7] = (byte) (65531 >> 8);
        //@formatter:on

        ElectricCurrentStatistics result = new ElectricCurrentStatistics(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getAverageElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getStandardDeviationElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 4), result.getMinimumElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 6), result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00101() {
        int averageElectricCurrentValue = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        int standardDeviationElectricCurrentValue = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        int minimumElectricCurrentValue = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        int maximumElectricCurrentValue = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;

        ElectricCurrentStatistics result = new ElectricCurrentStatistics(averageElectricCurrentValue, standardDeviationElectricCurrentValue, minimumElectricCurrentValue, maximumElectricCurrentValue);
        assertEquals(averageElectricCurrentValue, result.getAverageElectricCurrentValue());
        assertEquals(standardDeviationElectricCurrentValue, result.getStandardDeviationElectricCurrentValue());
        assertEquals(minimumElectricCurrentValue, result.getMinimumElectricCurrentValue());
        assertEquals(maximumElectricCurrentValue, result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00102() {
        int averageElectricCurrentValue = 0;
        int standardDeviationElectricCurrentValue = 0;
        int minimumElectricCurrentValue = 0;
        int maximumElectricCurrentValue = 0;

        ElectricCurrentStatistics result = new ElectricCurrentStatistics(averageElectricCurrentValue, standardDeviationElectricCurrentValue, minimumElectricCurrentValue, maximumElectricCurrentValue);
        assertEquals(averageElectricCurrentValue, result.getAverageElectricCurrentValue());
        assertEquals(standardDeviationElectricCurrentValue, result.getStandardDeviationElectricCurrentValue());
        assertEquals(minimumElectricCurrentValue, result.getMinimumElectricCurrentValue());
        assertEquals(maximumElectricCurrentValue, result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00103() {
        int averageElectricCurrentValue = 65534;
        int standardDeviationElectricCurrentValue = 65533;
        int minimumElectricCurrentValue = 65532;
        int maximumElectricCurrentValue = 65531;

        ElectricCurrentStatistics result = new ElectricCurrentStatistics(averageElectricCurrentValue, standardDeviationElectricCurrentValue, minimumElectricCurrentValue, maximumElectricCurrentValue);
        assertEquals(averageElectricCurrentValue, result.getAverageElectricCurrentValue());
        assertEquals(standardDeviationElectricCurrentValue, result.getStandardDeviationElectricCurrentValue());
        assertEquals(minimumElectricCurrentValue, result.getMinimumElectricCurrentValue());
        assertEquals(maximumElectricCurrentValue, result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 4] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 5] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 6] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 7] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        ElectricCurrentStatistics result1 = new ElectricCurrentStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0;
        data[ 1] = (byte) (0 >> 8);
        data[ 2] = (byte) 0;
        data[ 3] = (byte) (0 >> 8);
        data[ 4] = (byte) 0;
        data[ 5] = (byte) (0 >> 8);
        data[ 6] = (byte) 0;
        data[ 7] = (byte) (0 >> 8);
        //@formatter:on

        ElectricCurrentStatistics result1 = new ElectricCurrentStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 65534;
        data[ 1] = (byte) (65534 >> 8);
        data[ 2] = (byte) 65533;
        data[ 3] = (byte) (65533 >> 8);
        data[ 4] = (byte) 65532;
        data[ 5] = (byte) (65532 >> 8);
        data[ 6] = (byte) 65531;
        data[ 7] = (byte) (65531 >> 8);
        //@formatter:on

        ElectricCurrentStatistics result1 = new ElectricCurrentStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
