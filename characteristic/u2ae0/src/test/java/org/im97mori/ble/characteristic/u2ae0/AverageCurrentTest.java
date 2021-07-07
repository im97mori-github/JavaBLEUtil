package org.im97mori.ble.characteristic.u2ae0;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.core.ElectricCurrentUtils;
import org.im97mori.ble.characteristic.core.TimeExponential8Utils;
import org.junit.Test;

public class AverageCurrentTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        //@formatter:on

        AverageCurrent result1 = new AverageCurrent(data);
        assertEquals(ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN, result1.getElectricCurrentValue());
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = 0x01;
        data[ 2] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        AverageCurrent result1 = new AverageCurrent(data);
        assertEquals(0x0100, result1.getElectricCurrentValue());
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = 0x01;
        data[ 2] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        AverageCurrent result1 = new AverageCurrent(data);
        assertEquals(0x0100, result1.getElectricCurrentValue());
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        AverageCurrent result1 = new AverageCurrent(data);
        assertEquals(0x0100, result1.getElectricCurrentValue());
        assertEquals(0x02, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00101() {
        int electricCurrentValue = ElectricCurrentUtils.CURRENT_VALUE_IS_NOT_KNOWN;
        int timeExponential8 = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;

        AverageCurrent result1 = new AverageCurrent(electricCurrentValue, timeExponential8);
        assertEquals(electricCurrentValue, result1.getElectricCurrentValue());
        assertEquals(timeExponential8, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00102() {
        int electricCurrentValue = 0x01;
        int timeExponential8 = TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;

        AverageCurrent result1 = new AverageCurrent(electricCurrentValue, timeExponential8);
        assertEquals(electricCurrentValue, result1.getElectricCurrentValue());
        assertEquals(timeExponential8, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00103() {
        int electricCurrentValue = 0x01;
        int timeExponential8 = TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;

        AverageCurrent result1 = new AverageCurrent(electricCurrentValue, timeExponential8);
        assertEquals(electricCurrentValue, result1.getElectricCurrentValue());
        assertEquals(timeExponential8, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00104() {
        int electricCurrentValue = 0x01;
        int timeExponential8 = 0x02;

        AverageCurrent result1 = new AverageCurrent(electricCurrentValue, timeExponential8);
        assertEquals(electricCurrentValue, result1.getElectricCurrentValue());
        assertEquals(timeExponential8, result1.getSensingDuration());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

        AverageCurrent result1 = new AverageCurrent(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
