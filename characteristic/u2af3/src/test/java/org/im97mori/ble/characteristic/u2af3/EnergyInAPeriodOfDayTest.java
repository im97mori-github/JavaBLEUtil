package org.im97mori.ble.characteristic.u2af3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.EnergyUtils;
import org.im97mori.ble.characteristic.core.TimeDecihour8Utils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class EnergyInAPeriodOfDayTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN >> 16);
        data[ 3] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        data[ 4] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        EnergyInAPeriodOfDay result = new EnergyInAPeriodOfDay(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getEnergyValue());
        assertEquals(BLEUtils.createUInt8(data, 3), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getEndTime());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MINIMUM;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_MINIMUM >> 16);
        data[ 3] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MINIMUM;
        data[ 4] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MINIMUM;
        //@formatter:on

        EnergyInAPeriodOfDay result = new EnergyInAPeriodOfDay(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getEnergyValue());
        assertEquals(BLEUtils.createUInt8(data, 3), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getEndTime());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MAXIMUM;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_MAXIMUM >> 16);
        data[ 3] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MAXIMUM;
        data[ 4] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MAXIMUM;
        //@formatter:on

        EnergyInAPeriodOfDay result = new EnergyInAPeriodOfDay(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getEnergyValue());
        assertEquals(BLEUtils.createUInt8(data, 3), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getEndTime());
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

        EnergyInAPeriodOfDay result = new EnergyInAPeriodOfDay(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getEnergyValue());
        assertEquals(BLEUtils.createUInt8(data, 3), result.getStartTime());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getEndTime());
    }

    @Test
    public void test_constructor_00101() {
        int energyValue = EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN;
        int startTime = TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        int endTime = TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;

        EnergyInAPeriodOfDay result = new EnergyInAPeriodOfDay(energyValue, startTime, endTime);
        assertEquals(energyValue, result.getEnergyValue());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_constructor_00102() {
        int energyValue = EnergyUtils.ENERGY_VALUE_MINIMUM;
        int startTime = (int) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MINIMUM;
        int endTime = (int) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MINIMUM;

        EnergyInAPeriodOfDay result = new EnergyInAPeriodOfDay(energyValue, startTime, endTime);
        assertEquals(energyValue, result.getEnergyValue());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_constructor_00103() {
        int energyValue = EnergyUtils.ENERGY_VALUE_MAXIMUM;
        int startTime = (int) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MAXIMUM;
        int endTime = (int) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MAXIMUM;

        EnergyInAPeriodOfDay result = new EnergyInAPeriodOfDay(energyValue, startTime, endTime);
        assertEquals(energyValue, result.getEnergyValue());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_constructor_00104() {
        int energyValue = 1;
        int startTime = 2;
        int endTime = 3;

        EnergyInAPeriodOfDay result = new EnergyInAPeriodOfDay(energyValue, startTime, endTime);
        assertEquals(energyValue, result.getEnergyValue());
        assertEquals(startTime, result.getStartTime());
        assertEquals(endTime, result.getEndTime());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN >> 16);
        data[ 3] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        data[ 4] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        EnergyInAPeriodOfDay result1 = new EnergyInAPeriodOfDay(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MINIMUM;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_MINIMUM >> 16);
        data[ 3] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MINIMUM;
        data[ 4] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MINIMUM;
        //@formatter:on

        EnergyInAPeriodOfDay result1 = new EnergyInAPeriodOfDay(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MAXIMUM;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_MAXIMUM >> 16);
        data[ 3] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MAXIMUM;
        data[ 4] = (byte) TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_MAXIMUM;
        //@formatter:on

        EnergyInAPeriodOfDay result1 = new EnergyInAPeriodOfDay(data);
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

        EnergyInAPeriodOfDay result1 = new EnergyInAPeriodOfDay(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
