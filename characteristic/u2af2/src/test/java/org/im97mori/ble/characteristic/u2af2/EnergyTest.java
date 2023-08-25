package org.im97mori.ble.characteristic.u2af2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.EnergyUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class EnergyTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        Energy result = new Energy(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getEnergy());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MINIMUM;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_MINIMUM >> 16);
        //@formatter:on

        Energy result = new Energy(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getEnergy());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MAXIMUM;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_MAXIMUM >> 16);
        //@formatter:on

        Energy result = new Energy(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getEnergy());
    }

    @Test
    public void test_constructor_00101() {
        int energy = EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN;

        Energy result = new Energy(energy);
        assertEquals(energy, result.getEnergy());
    }

    @Test
    public void test_constructor_00102() {
        int energy = EnergyUtils.ENERGY_VALUE_MINIMUM;

        Energy result = new Energy(energy);
        assertEquals(energy, result.getEnergy());
    }

    @Test
    public void test_constructor_00103() {
        int energy = EnergyUtils.ENERGY_VALUE_MAXIMUM;

        Energy result = new Energy(energy);
        assertEquals(energy, result.getEnergy());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        Energy result1 = new Energy(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MINIMUM;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_MINIMUM >> 16);
        //@formatter:on

        Energy result1 = new Energy(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) EnergyUtils.ENERGY_VALUE_MAXIMUM;
        data[ 1] = (byte) (EnergyUtils.ENERGY_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) (EnergyUtils.ENERGY_VALUE_MAXIMUM >> 16);
        //@formatter:on

        Energy result1 = new Energy(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
