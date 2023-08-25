package org.im97mori.ble.characteristic.u2ae6;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ChromaticityToleranceTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x00;
        //@formatter:on

        ChromaticityTolerance result = new ChromaticityTolerance(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getChromaticityTolerance());
        assertEquals(BLEUtils.createUInt8(data, 0) * ChromaticityTolerance.CHROMATICITY_VALUE_UNIT, result.getChromaticityToleranceWithUnit(), 0);
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        ChromaticityTolerance result = new ChromaticityTolerance(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getChromaticityTolerance());
        assertEquals(BLEUtils.createUInt8(data, 0) * ChromaticityTolerance.CHROMATICITY_VALUE_UNIT, result.getChromaticityToleranceWithUnit(), 0);
    }

    @Test
    public void test_constructor_00101() {
        int chromaticityTolerance = 0;

        ChromaticityTolerance result = new ChromaticityTolerance(chromaticityTolerance);
        assertEquals(chromaticityTolerance, result.getChromaticityTolerance());
        assertEquals(chromaticityTolerance * ChromaticityTolerance.CHROMATICITY_VALUE_UNIT, result.getChromaticityToleranceWithUnit(), 0);
    }

    @Test
    public void test_constructor_00102() {
        int chromaticityTolerance = 255;

        ChromaticityTolerance result = new ChromaticityTolerance(chromaticityTolerance);
        assertEquals(chromaticityTolerance, result.getChromaticityTolerance());
        assertEquals(chromaticityTolerance * ChromaticityTolerance.CHROMATICITY_VALUE_UNIT, result.getChromaticityToleranceWithUnit(), 0);
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        ChromaticityTolerance result1 = new ChromaticityTolerance(data);
        assertArrayEquals(data, result1.getBytes());
    }
    
    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on

        ChromaticityTolerance result1 = new ChromaticityTolerance(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
