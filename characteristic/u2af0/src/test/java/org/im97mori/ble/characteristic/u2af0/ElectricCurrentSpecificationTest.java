package org.im97mori.ble.characteristic.u2af0;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.ElectricCurrentUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ElectricCurrentSpecificationTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 4] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 5] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        ElectricCurrentSpecification result = new ElectricCurrentSpecification(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMinimumElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getTypicalElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 4), result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 0;
        data[ 1] = (byte) (0 >> 8);
        data[ 2] = (byte) 0;
        data[ 3] = (byte) (0 >> 8);
        data[ 4] = (byte) 0;
        data[ 5] = (byte) (0 >> 8);
        //@formatter:on

        ElectricCurrentSpecification result = new ElectricCurrentSpecification(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMinimumElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getTypicalElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 4), result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 65534;
        data[ 1] = (byte) (65534 >> 8);
        data[ 2] = (byte) 65533;
        data[ 3] = (byte) (65533 >> 8);
        data[ 4] = (byte) 65532;
        data[ 5] = (byte) (65532 >> 8);
        //@formatter:on

        ElectricCurrentSpecification result = new ElectricCurrentSpecification(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMinimumElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getTypicalElectricCurrentValue());
        assertEquals(BLEUtils.createUInt16(data, 4), result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00101() {
        int minimumElectricCurrentValue = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        int typicalElectricCurrentValue = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        int maximumElectricCurrentValue = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;

        ElectricCurrentSpecification result = new ElectricCurrentSpecification(minimumElectricCurrentValue, typicalElectricCurrentValue, maximumElectricCurrentValue);
        assertEquals(minimumElectricCurrentValue, result.getMinimumElectricCurrentValue());
        assertEquals(typicalElectricCurrentValue, result.getTypicalElectricCurrentValue());
        assertEquals(maximumElectricCurrentValue, result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00102() {
        int minimumElectricCurrentValue = 0;
        int typicalElectricCurrentValue = 0;
        int maximumElectricCurrentValue = 0;

        ElectricCurrentSpecification result = new ElectricCurrentSpecification(minimumElectricCurrentValue, typicalElectricCurrentValue, maximumElectricCurrentValue);
        assertEquals(minimumElectricCurrentValue, result.getMinimumElectricCurrentValue());
        assertEquals(typicalElectricCurrentValue, result.getTypicalElectricCurrentValue());
        assertEquals(maximumElectricCurrentValue, result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_constructor_00103() {
        int minimumElectricCurrentValue = 65534;
        int typicalElectricCurrentValue = 65533;
        int maximumElectricCurrentValue = 65532;

        ElectricCurrentSpecification result = new ElectricCurrentSpecification(minimumElectricCurrentValue, typicalElectricCurrentValue, maximumElectricCurrentValue);
        assertEquals(minimumElectricCurrentValue, result.getMinimumElectricCurrentValue());
        assertEquals(typicalElectricCurrentValue, result.getTypicalElectricCurrentValue());
        assertEquals(maximumElectricCurrentValue, result.getMaximumElectricCurrentValue());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 4] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 5] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        ElectricCurrentSpecification result1 = new ElectricCurrentSpecification(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 0;
        data[ 1] = (byte) (0 >> 8);
        data[ 2] = (byte) 0;
        data[ 3] = (byte) (0 >> 8);
        data[ 4] = (byte) 0;
        data[ 5] = (byte) (0 >> 8);
        //@formatter:on

        ElectricCurrentSpecification result1 = new ElectricCurrentSpecification(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 65534;
        data[ 1] = (byte) (65534 >> 8);
        data[ 2] = (byte) 65533;
        data[ 3] = (byte) (65533 >> 8);
        data[ 4] = (byte) 65532;
        data[ 5] = (byte) (65532 >> 8);
        //@formatter:on

        ElectricCurrentSpecification result1 = new ElectricCurrentSpecification(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
