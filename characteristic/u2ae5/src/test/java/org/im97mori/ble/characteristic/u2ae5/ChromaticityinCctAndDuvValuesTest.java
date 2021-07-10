package org.im97mori.ble.characteristic.u2ae5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

public class ChromaticityinCctAndDuvValuesTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        ChromaticityinCctAndDuvValues result = new ChromaticityinCctAndDuvValues(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getCorrelatedColorTemperature());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getChromaticityDistanceFromPlanckian());
    }

    @Test
    public void test_constructor_00101() {
        int correlatedColorTemperature = 1;
        int chromaticityDistanceFromPlanckian = 2;

        ChromaticityinCctAndDuvValues result = new ChromaticityinCctAndDuvValues(correlatedColorTemperature, chromaticityDistanceFromPlanckian);
        assertEquals(correlatedColorTemperature, result.getCorrelatedColorTemperature());
        assertEquals(chromaticityDistanceFromPlanckian, result.getChromaticityDistanceFromPlanckian());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        ChromaticityinCctAndDuvValues result1 = new ChromaticityinCctAndDuvValues(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
