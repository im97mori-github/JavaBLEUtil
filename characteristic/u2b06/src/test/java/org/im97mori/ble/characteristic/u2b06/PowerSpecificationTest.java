package org.im97mori.ble.characteristic.u2b06;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.PowerUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class PowerSpecificationTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) PowerUtils.POWER_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 16);
        data[ 3] = (byte) PowerUtils.POWER_VALUE_IS_NOT_KNOWN;
        data[ 4] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 8);
        data[ 5] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 16);
        data[ 6] = (byte) PowerUtils.POWER_VALUE_IS_NOT_KNOWN;
        data[ 7] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 8);
        data[ 8] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        PowerSpecification result = new PowerSpecification(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getMinimumPowerValue());
        assertEquals(BLEUtils.createUInt24(data, 3), result.getTypicalPowerValue());
        assertEquals(BLEUtils.createUInt24(data, 6), result.getMaximumPowerValue());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x00;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        data[ 3] = 0x00;
        data[ 4] = 0x00;
        data[ 5] = 0x00;
        data[ 6] = 0x00;
        data[ 7] = 0x00;
        data[ 8] = 0x00;
        //@formatter:on

        PowerSpecification result = new PowerSpecification(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getMinimumPowerValue());
        assertEquals(BLEUtils.createUInt24(data, 3), result.getTypicalPowerValue());
        assertEquals(BLEUtils.createUInt24(data, 6), result.getMaximumPowerValue());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) 16777214;
        data[ 1] = (byte) (16777214 >> 8);
        data[ 2] = (byte) (16777214 >> 16);
        data[ 3] = (byte) 16777214;
        data[ 4] = (byte) (16777214 >> 8);
        data[ 5] = (byte) (16777214 >> 16);
        data[ 6] = (byte) 16777214;
        data[ 7] = (byte) (16777214 >> 8);
        data[ 8] = (byte) (16777214 >> 16);
        //@formatter:on

        PowerSpecification result = new PowerSpecification(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getMinimumPowerValue());
        assertEquals(BLEUtils.createUInt24(data, 3), result.getTypicalPowerValue());
        assertEquals(BLEUtils.createUInt24(data, 6), result.getMaximumPowerValue());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        //@formatter:on

        PowerSpecification result = new PowerSpecification(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getMinimumPowerValue());
        assertEquals(BLEUtils.createUInt24(data, 3), result.getTypicalPowerValue());
        assertEquals(BLEUtils.createUInt24(data, 6), result.getMaximumPowerValue());
    }

    @Test
    public void test_constructor_00101() {
        int minimumPowerValue = PowerUtils.POWER_VALUE_IS_NOT_KNOWN;
        int typicalPowerValue = PowerUtils.POWER_VALUE_IS_NOT_KNOWN;
        int maximumPowerValue = PowerUtils.POWER_VALUE_IS_NOT_KNOWN;

        PowerSpecification result = new PowerSpecification(minimumPowerValue, typicalPowerValue, maximumPowerValue);
        assertEquals(minimumPowerValue, result.getMinimumPowerValue());
        assertEquals(typicalPowerValue, result.getTypicalPowerValue());
        assertEquals(maximumPowerValue, result.getMaximumPowerValue());
    }

    @Test
    public void test_constructor_00102() {
        int minimumPowerValue = 0;
        int typicalPowerValue = 0;
        int maximumPowerValue = 0;

        PowerSpecification result = new PowerSpecification(minimumPowerValue, typicalPowerValue, maximumPowerValue);
        assertEquals(minimumPowerValue, result.getMinimumPowerValue());
        assertEquals(typicalPowerValue, result.getTypicalPowerValue());
        assertEquals(maximumPowerValue, result.getMaximumPowerValue());
    }

    @Test
    public void test_constructor_00103() {
        int minimumPowerValue = 16777214;
        int typicalPowerValue = 16777214;
        int maximumPowerValue = 16777214;

        PowerSpecification result = new PowerSpecification(minimumPowerValue, typicalPowerValue, maximumPowerValue);
        assertEquals(minimumPowerValue, result.getMinimumPowerValue());
        assertEquals(typicalPowerValue, result.getTypicalPowerValue());
        assertEquals(maximumPowerValue, result.getMaximumPowerValue());
    }

    @Test
    public void test_constructor_00104() {
        int minimumPowerValue = 1;
        int typicalPowerValue = 2;
        int maximumPowerValue = 3;

        PowerSpecification result = new PowerSpecification(minimumPowerValue, typicalPowerValue, maximumPowerValue);
        assertEquals(minimumPowerValue, result.getMinimumPowerValue());
        assertEquals(typicalPowerValue, result.getTypicalPowerValue());
        assertEquals(maximumPowerValue, result.getMaximumPowerValue());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) PowerUtils.POWER_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 16);
        data[ 3] = (byte) PowerUtils.POWER_VALUE_IS_NOT_KNOWN;
        data[ 4] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 8);
        data[ 5] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 16);
        data[ 6] = (byte) PowerUtils.POWER_VALUE_IS_NOT_KNOWN;
        data[ 7] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 8);
        data[ 8] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        PowerSpecification result1 = new PowerSpecification(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x00;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        data[ 3] = 0x00;
        data[ 4] = 0x00;
        data[ 5] = 0x00;
        data[ 6] = 0x00;
        data[ 7] = 0x00;
        data[ 8] = 0x00;
        //@formatter:on

        PowerSpecification result1 = new PowerSpecification(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) 16777214;
        data[ 1] = (byte) (16777214 >> 8);
        data[ 2] = (byte) (16777214 >> 16);
        data[ 3] = (byte) 16777214;
        data[ 4] = (byte) (16777214 >> 8);
        data[ 5] = (byte) (16777214 >> 16);
        data[ 6] = (byte) 16777214;
        data[ 7] = (byte) (16777214 >> 8);
        data[ 8] = (byte) (16777214 >> 16);
        //@formatter:on

        PowerSpecification result1 = new PowerSpecification(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        //@formatter:on

        PowerSpecification result1 = new PowerSpecification(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
