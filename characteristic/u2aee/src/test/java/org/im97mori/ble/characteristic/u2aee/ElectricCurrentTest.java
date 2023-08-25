package org.im97mori.ble.characteristic.u2aee;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.ElectricCurrentUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ElectricCurrentTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        ElectricCurrent result = new ElectricCurrent(data);
        assertEquals(ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN, result.getCurrent());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0;
        data[ 1] = (byte) (0 >> 8);
        //@formatter:on

        ElectricCurrent result = new ElectricCurrent(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getCurrent());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 65534;
        data[ 1] = (byte) (65534 >> 8);
        //@formatter:on

        ElectricCurrent result = new ElectricCurrent(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getCurrent());
    }

    @Test
    public void test_constructor_00101() {
        int current = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;

        ElectricCurrent result = new ElectricCurrent(current);
        assertEquals(current, result.getCurrent());
    }

    @Test
    public void test_constructor_00102() {
        int current = 0;

        ElectricCurrent result = new ElectricCurrent(current);
        assertEquals(current, result.getCurrent());
    }

    @Test
    public void test_constructor_00103() {
        int current = 65534;

        ElectricCurrent result = new ElectricCurrent(current);
        assertEquals(current, result.getCurrent());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        ElectricCurrent result1 = new ElectricCurrent(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0;
        data[ 1] = (byte) (0 >> 8);
        //@formatter:on

        ElectricCurrent result1 = new ElectricCurrent(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 65534;
        data[ 1] = (byte) (65534 >> 8);
        //@formatter:on

        ElectricCurrent result1 = new ElectricCurrent(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
