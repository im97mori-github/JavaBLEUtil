package org.im97mori.ble.characteristic.u2aef;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.ElectricCurrentUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ElectricCurrentRangeTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        ElectricCurrentRange result = new ElectricCurrentRange(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMinimumElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0;
        data[ 1] = (byte) (0 >> 8);
        data[ 2] = (byte) 0;
        data[ 3] = (byte) (0 >> 8);
        //@formatter:on

        ElectricCurrentRange result = new ElectricCurrentRange(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMinimumElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 65534;
        data[ 1] = (byte) (65534 >> 8);
        data[ 2] = (byte) 65533;
        data[ 3] = (byte) (65533 >> 8);
        //@formatter:on

        ElectricCurrentRange result = new ElectricCurrentRange(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMinimumElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00101() {
        int minimumElectricCurrentValue = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        int maximumElectricCurrentValue = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;

        ElectricCurrentRange result = new ElectricCurrentRange(minimumElectricCurrentValue, maximumElectricCurrentValue);
        assertEquals(minimumElectricCurrentValue, result.getMinimumElectricCurrentValue());
        assertEquals(maximumElectricCurrentValue, result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00102() {
        int minimumElectricCurrentValue = 0;
        int maximumElectricCurrentValue = 0;

        ElectricCurrentRange result = new ElectricCurrentRange(minimumElectricCurrentValue, maximumElectricCurrentValue);
        assertEquals(minimumElectricCurrentValue, result.getMinimumElectricCurrentValue());
        assertEquals(maximumElectricCurrentValue, result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00103() {
        int minimumElectricCurrentValue = 65534;
        int maximumElectricCurrentValue = 65533;

        ElectricCurrentRange result = new ElectricCurrentRange(minimumElectricCurrentValue, maximumElectricCurrentValue);
        assertEquals(minimumElectricCurrentValue, result.getMinimumElectricCurrentValue());
        assertEquals(maximumElectricCurrentValue, result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        ElectricCurrentRange result1 = new ElectricCurrentRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0;
        data[ 1] = (byte) (0 >> 8);
        data[ 2] = (byte) 0;
        data[ 3] = (byte) (0 >> 8);
        //@formatter:on

        ElectricCurrentRange result1 = new ElectricCurrentRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 65534;
        data[ 1] = (byte) (65534 >> 8);
        data[ 2] = (byte) 65533;
        data[ 3] = (byte) (65533 >> 8);
        //@formatter:on

        ElectricCurrentRange result1 = new ElectricCurrentRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
