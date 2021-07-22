package org.im97mori.ble.characteristic.u2b02;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

public class MassFlowTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) MassFlow.MASS_FLOW_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (MassFlow.MASS_FLOW_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        MassFlow result = new MassFlow(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMassFlow());
        assertTrue(result.isMassFlowValueIsNotKnown());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) MassFlow.MASS_FLOW_VALUE_MINIMUM;
        data[ 1] = (byte) (MassFlow.MASS_FLOW_VALUE_MINIMUM >> 8);
        //@formatter:on

        MassFlow result = new MassFlow(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMassFlow());
        assertFalse(result.isMassFlowValueIsNotKnown());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) MassFlow.MASS_FLOW_VALUE_MAXIMUM;
        data[ 1] = (byte) (MassFlow.MASS_FLOW_VALUE_MAXIMUM >> 8);
        //@formatter:on

        MassFlow result = new MassFlow(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getMassFlow());
        assertFalse(result.isMassFlowValueIsNotKnown());
    }

    @Test
    public void test_constructor_00101() {
        int luminousIntensity = MassFlow.MASS_FLOW_VALUE_IS_NOT_KNOWN;

        MassFlow result = new MassFlow(luminousIntensity);
        assertEquals(luminousIntensity, result.getMassFlow());
        assertTrue(result.isMassFlowValueIsNotKnown());
    }

    @Test
    public void test_constructor_00102() {
        int luminousIntensity = MassFlow.MASS_FLOW_VALUE_MINIMUM;

        MassFlow result = new MassFlow(luminousIntensity);
        assertEquals(luminousIntensity, result.getMassFlow());
        assertFalse(result.isMassFlowValueIsNotKnown());
    }

    @Test
    public void test_constructor_00103() {
        int luminousIntensity = MassFlow.MASS_FLOW_VALUE_MAXIMUM;

        MassFlow result = new MassFlow(luminousIntensity);
        assertEquals(luminousIntensity, result.getMassFlow());
        assertFalse(result.isMassFlowValueIsNotKnown());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) MassFlow.MASS_FLOW_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (MassFlow.MASS_FLOW_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        MassFlow result1 = new MassFlow(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) MassFlow.MASS_FLOW_VALUE_MINIMUM;
        data[ 1] = (byte) (MassFlow.MASS_FLOW_VALUE_MINIMUM >> 8);
        //@formatter:on

        MassFlow result1 = new MassFlow(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) MassFlow.MASS_FLOW_VALUE_MAXIMUM;
        data[ 1] = (byte) (MassFlow.MASS_FLOW_VALUE_MAXIMUM >> 8);
        //@formatter:on

        MassFlow result1 = new MassFlow(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
