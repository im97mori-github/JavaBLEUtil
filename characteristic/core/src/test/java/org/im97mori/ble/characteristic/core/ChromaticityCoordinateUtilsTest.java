package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ChromaticityCoordinateUtilsTest extends TestBase {

    @Test
    public void test_getVoltageValueVolt_00001() {
        int chromaticityCoordinate = 0;

        assertEquals(ChromaticityCoordinateUtils.CHROMATICITY_COORDINATE_VALUE_UNIT * chromaticityCoordinate, ChromaticityCoordinateUtils.getChromaticityCoordinateWithUnit(chromaticityCoordinate), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00002() {
        int chromaticityCoordinate = 1;

        assertEquals(ChromaticityCoordinateUtils.CHROMATICITY_COORDINATE_VALUE_UNIT * chromaticityCoordinate, ChromaticityCoordinateUtils.getChromaticityCoordinateWithUnit(chromaticityCoordinate), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00003() {
        int chromaticityCoordinate = 65535;

        assertEquals(ChromaticityCoordinateUtils.CHROMATICITY_COORDINATE_VALUE_UNIT * chromaticityCoordinate, ChromaticityCoordinateUtils.getChromaticityCoordinateWithUnit(chromaticityCoordinate), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00004() {
        int chromaticityCoordinate = -1;

        assertEquals(ChromaticityCoordinateUtils.CHROMATICITY_COORDINATE_VALUE_MINIMUM, ChromaticityCoordinateUtils.getChromaticityCoordinateWithUnit(chromaticityCoordinate), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00005() {
        int chromaticityCoordinate = 655356;

        assertEquals(ChromaticityCoordinateUtils.CHROMATICITY_COORDINATE_VALUE_MAXIMUM, ChromaticityCoordinateUtils.getChromaticityCoordinateWithUnit(chromaticityCoordinate), 0);
    }

}
