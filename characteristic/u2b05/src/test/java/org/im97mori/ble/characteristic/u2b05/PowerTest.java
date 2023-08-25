package org.im97mori.ble.characteristic.u2b05;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.PowerUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class PowerTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) PowerUtils.POWER_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        Power result = new Power(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getPower());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        //@formatter:on

        Power result = new Power(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getPower());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 16777214;
        data[ 1] = (byte) (16777214 >> 8);
        data[ 2] = (byte) (16777214 >> 16);
        //@formatter:on

        Power result = new Power(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getPower());
    }

    @Test
    public void test_constructor_00101() {
        int power = PowerUtils.POWER_VALUE_IS_NOT_KNOWN;

        Power result = new Power(power);
        assertEquals(power, result.getPower());
    }

    @Test
    public void test_constructor_00102() {
        int power = 0;

        Power result = new Power(power);
        assertEquals(power, result.getPower());
    }

    @Test
    public void test_constructor_00103() {
        int power = 16777214;

        Power result = new Power(power);
        assertEquals(power, result.getPower());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) PowerUtils.POWER_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (PowerUtils.POWER_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        Power result1 = new Power(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        //@formatter:on

        Power result1 = new Power(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 16777214;
        data[ 1] = (byte) (16777214 >> 8);
        data[ 2] = (byte) (16777214 >> 16);
        //@formatter:on

        Power result1 = new Power(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
