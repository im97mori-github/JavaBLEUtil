package org.im97mori.ble.characteristic.u2b12;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.EnergyUtils;
import org.junit.Test;

public class TimeDecihour8Test {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        TimeDecihour8 result = new TimeDecihour8(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getTimeDecihour8());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MINIMUM;
        //@formatter:on

        TimeDecihour8 result = new TimeDecihour8(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getTimeDecihour8());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MAXIMUM;
        //@formatter:on

        TimeDecihour8 result = new TimeDecihour8(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getTimeDecihour8());
    }

    @Test
    public void test_constructor_00101() {
        int timeDecihour8 = EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN;

        TimeDecihour8 result = new TimeDecihour8(timeDecihour8);
        assertEquals(timeDecihour8, result.getTimeDecihour8());
    }

    @Test
    public void test_constructor_00102() {
        int timeDecihour8 = EnergyUtils.ENERGY_VALUE_MINIMUM;

        TimeDecihour8 result = new TimeDecihour8(timeDecihour8);
        assertEquals(timeDecihour8, result.getTimeDecihour8());
    }

    @Test
    public void test_constructor_00103() {
        int timeDecihour8 = EnergyUtils.ENERGY_VALUE_MAXIMUM;

        TimeDecihour8 result = new TimeDecihour8(timeDecihour8);
        assertEquals(timeDecihour8, result.getTimeDecihour8());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        TimeDecihour8 result1 = new TimeDecihour8(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MINIMUM;
        //@formatter:on

        TimeDecihour8 result1 = new TimeDecihour8(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MAXIMUM;
        //@formatter:on

        TimeDecihour8 result1 = new TimeDecihour8(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
