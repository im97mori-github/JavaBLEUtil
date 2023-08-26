package org.im97mori.ble.descriptor.u290c;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class EnvironmentalSensingMeasurementTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertArrayEquals(Arrays.copyOfRange(value, 0, 2), result.getFlags());
        assertEquals(value[2], result.getSamplingFunction());
        assertEquals(0x060504, result.getMeasurementPeriod());
        assertEquals(0x090807, result.getInternalUpdateInterval());
        assertEquals(0x0a, result.getApplication());
        assertEquals(0x0b, result.getMeasurementUncertainty());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = (byte) EnvironmentalSensingMeasurement.SAMPLING_FUNCTION_UNSPECIFIED;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertTrue(result.isSamplingFunctionUnspecified());
        assertFalse(result.isSamplingFunctionInstantaneous());
        assertFalse(result.isSamplingFunctionArithmeticMean());
        assertFalse(result.isSamplingFunctionRms());
        assertFalse(result.isSamplingFunctionMaximum());
        assertFalse(result.isSamplingFunctionMinimum());
        assertFalse(result.isSamplingFunctionAccumulated());
        assertFalse(result.isSamplingFunctionCount());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = (byte) EnvironmentalSensingMeasurement.SAMPLING_FUNCTION_INSTANTANEOUS;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isSamplingFunctionUnspecified());
        assertTrue(result.isSamplingFunctionInstantaneous());
        assertFalse(result.isSamplingFunctionArithmeticMean());
        assertFalse(result.isSamplingFunctionRms());
        assertFalse(result.isSamplingFunctionMaximum());
        assertFalse(result.isSamplingFunctionMinimum());
        assertFalse(result.isSamplingFunctionAccumulated());
        assertFalse(result.isSamplingFunctionCount());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = (byte) EnvironmentalSensingMeasurement.SAMPLING_FUNCTION_ARITHMETIC_MEAN;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isSamplingFunctionUnspecified());
        assertFalse(result.isSamplingFunctionInstantaneous());
        assertTrue(result.isSamplingFunctionArithmeticMean());
        assertFalse(result.isSamplingFunctionRms());
        assertFalse(result.isSamplingFunctionMaximum());
        assertFalse(result.isSamplingFunctionMinimum());
        assertFalse(result.isSamplingFunctionAccumulated());
        assertFalse(result.isSamplingFunctionCount());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = (byte) EnvironmentalSensingMeasurement.SAMPLING_FUNCTION_RMS;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isSamplingFunctionUnspecified());
        assertFalse(result.isSamplingFunctionInstantaneous());
        assertFalse(result.isSamplingFunctionArithmeticMean());
        assertTrue(result.isSamplingFunctionRms());
        assertFalse(result.isSamplingFunctionMaximum());
        assertFalse(result.isSamplingFunctionMinimum());
        assertFalse(result.isSamplingFunctionAccumulated());
        assertFalse(result.isSamplingFunctionCount());
    }

    @Test
    public void test_constructor006() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = (byte) EnvironmentalSensingMeasurement.SAMPLING_FUNCTION_MAXIMUM;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isSamplingFunctionUnspecified());
        assertFalse(result.isSamplingFunctionInstantaneous());
        assertFalse(result.isSamplingFunctionArithmeticMean());
        assertFalse(result.isSamplingFunctionRms());
        assertTrue(result.isSamplingFunctionMaximum());
        assertFalse(result.isSamplingFunctionMinimum());
        assertFalse(result.isSamplingFunctionAccumulated());
        assertFalse(result.isSamplingFunctionCount());
    }

    @Test
    public void test_constructor007() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = (byte) EnvironmentalSensingMeasurement.SAMPLING_FUNCTION_MINIMUM;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isSamplingFunctionUnspecified());
        assertFalse(result.isSamplingFunctionInstantaneous());
        assertFalse(result.isSamplingFunctionArithmeticMean());
        assertFalse(result.isSamplingFunctionRms());
        assertFalse(result.isSamplingFunctionMaximum());
        assertTrue(result.isSamplingFunctionMinimum());
        assertFalse(result.isSamplingFunctionAccumulated());
        assertFalse(result.isSamplingFunctionCount());
    }

    @Test
    public void test_constructor008() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = (byte) EnvironmentalSensingMeasurement.SAMPLING_FUNCTION_ACCUMULATED;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isSamplingFunctionUnspecified());
        assertFalse(result.isSamplingFunctionInstantaneous());
        assertFalse(result.isSamplingFunctionArithmeticMean());
        assertFalse(result.isSamplingFunctionRms());
        assertFalse(result.isSamplingFunctionMaximum());
        assertFalse(result.isSamplingFunctionMinimum());
        assertTrue(result.isSamplingFunctionAccumulated());
        assertFalse(result.isSamplingFunctionCount());
    }

    @Test
    public void test_constructor009() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = (byte) EnvironmentalSensingMeasurement.SAMPLING_FUNCTION_COUNT;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isSamplingFunctionUnspecified());
        assertFalse(result.isSamplingFunctionInstantaneous());
        assertFalse(result.isSamplingFunctionArithmeticMean());
        assertFalse(result.isSamplingFunctionRms());
        assertFalse(result.isSamplingFunctionMaximum());
        assertFalse(result.isSamplingFunctionMinimum());
        assertFalse(result.isSamplingFunctionAccumulated());
        assertTrue(result.isSamplingFunctionCount());
    }

    @Test
    public void test_constructor010() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = (byte) EnvironmentalSensingMeasurement.MEASUREMENT_PERIOD_NOT_IN_USE;
        value[ 4] = (byte) EnvironmentalSensingMeasurement.MEASUREMENT_PERIOD_NOT_IN_USE >> 8;
        value[ 5] = (byte) EnvironmentalSensingMeasurement.MEASUREMENT_PERIOD_NOT_IN_USE >> 16;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertTrue(result.isMeasurementPeriodNotInUse());
    }

    @Test
    public void test_constructor011() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = (byte) (EnvironmentalSensingMeasurement.MEASUREMENT_PERIOD_NOT_IN_USE + 1);
        value[ 4] = (byte) (EnvironmentalSensingMeasurement.MEASUREMENT_PERIOD_NOT_IN_USE + 1) >> 8;
        value[ 5] = (byte) (EnvironmentalSensingMeasurement.MEASUREMENT_PERIOD_NOT_IN_USE + 1) >> 16;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isMeasurementPeriodNotInUse());
    }

    @Test
    public void test_constructor012() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = (byte) EnvironmentalSensingMeasurement.INTERNAL_UPDATE_INTERVAL_NOT_IN_USE;
        value[ 7] = (byte) EnvironmentalSensingMeasurement.INTERNAL_UPDATE_INTERVAL_NOT_IN_USE >> 8;
        value[ 8] = (byte) EnvironmentalSensingMeasurement.INTERNAL_UPDATE_INTERVAL_NOT_IN_USE >> 16;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertTrue(result.isInternalUpdateIntervalNotInUse());
    }

    @Test
    public void test_constructor013() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = (byte) (EnvironmentalSensingMeasurement.INTERNAL_UPDATE_INTERVAL_NOT_IN_USE + 1);
        value[ 7] = (byte) (EnvironmentalSensingMeasurement.INTERNAL_UPDATE_INTERVAL_NOT_IN_USE + 1) >> 8;
        value[ 8] = (byte) (EnvironmentalSensingMeasurement.INTERNAL_UPDATE_INTERVAL_NOT_IN_USE + 1) >> 16;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isInternalUpdateIntervalNotInUse());
    }

    @Test
    public void test_constructor014() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_UNSPECIFIED;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertTrue(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor015() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_AIR;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertTrue(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor016() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_WATER;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertTrue(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor017() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_BAROMETRIC;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertTrue(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor018() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_SOIL;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertTrue(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor019() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_INFRARED;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertTrue(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor020() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_MAP_DATABASE;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertTrue(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor021() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_BAROMETRIC_ELEVATION_SOURCE;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertTrue(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor022() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_GPS_ONLY_ELEVATION_SOURCE;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertTrue(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor023() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_GPS_AND_MAP_DATABASE_ELEVATION_SOURCE;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertTrue(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor024() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_VERTICAL_DATUM_ELEVATION_SOURCE;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertTrue(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor025() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_ONSHORE;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertTrue(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor026() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_ONBOARD_VESSEL_OR_VEHICLE;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertTrue(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor027() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_FRONT;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertTrue(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor028() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_BACK_REAR;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertTrue(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor029() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_UPPER;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertTrue(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor030() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_LOWER;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertTrue(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor031() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_PRIMARY;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertTrue(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor032() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_SECONDARY;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertTrue(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor033() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_OUTDOOR;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertTrue(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor034() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_INDOOR;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertTrue(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor035() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_TOP;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertTrue(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor036() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_BOTTOM;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertTrue(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor037() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_MAIN;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertTrue(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor038() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_BACKUP;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertTrue(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor039() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_AUXILIARY;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertTrue(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor040() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_SUPPLEMENTARY;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertTrue(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor041() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_INSIDE;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertTrue(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor042() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_OUTSIDE;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertTrue(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor043() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_LEFT;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertTrue(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor044() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_RIGHT;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertTrue(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor045() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_INTERNAL;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertTrue(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor046() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_EXTERNAL;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertTrue(result.isApplicationExternal());
        assertFalse(result.isApplicationSolar());
    }

    @Test
    public void test_constructor047() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = (byte) EnvironmentalSensingMeasurement.APPLICATION_SOLAR;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isApplicationUnspecified());
        assertFalse(result.isApplicationAir());
        assertFalse(result.isApplicationWater());
        assertFalse(result.isApplicationBarometric());
        assertFalse(result.isApplicationSoil());
        assertFalse(result.isApplicationInfrared());
        assertFalse(result.isApplicationMapDatabase());
        assertFalse(result.isApplicationBarometricElevationSource());
        assertFalse(result.isApplicationGpsOnlyElevationSource());
        assertFalse(result.isApplicationGpsAndMapDatabaseElevationSource());
        assertFalse(result.isApplicationVerticalDatumElevationSource());
        assertFalse(result.isApplicationOnshore());
        assertFalse(result.isApplicationOnboardVesselOrVehicle());
        assertFalse(result.isApplicationFront());
        assertFalse(result.isApplicationBackRear());
        assertFalse(result.isApplicationUpper());
        assertFalse(result.isApplicationLower());
        assertFalse(result.isApplicationPrimary());
        assertFalse(result.isApplicationSecondary());
        assertFalse(result.isApplicationOutdoor());
        assertFalse(result.isApplicationIndoor());
        assertFalse(result.isApplicationTop());
        assertFalse(result.isApplicationBottom());
        assertFalse(result.isApplicationMain());
        assertFalse(result.isApplicationBackup());
        assertFalse(result.isApplicationAuxiliary());
        assertFalse(result.isApplicationSupplementary());
        assertFalse(result.isApplicationInside());
        assertFalse(result.isApplicationOutside());
        assertFalse(result.isApplicationLeft());
        assertFalse(result.isApplicationRight());
        assertFalse(result.isApplicationInternal());
        assertFalse(result.isApplicationExternal());
        assertTrue(result.isApplicationSolar());
    }

    @Test
    public void test_constructor048() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = (byte) EnvironmentalSensingMeasurement.MEASUREMENT_UNCERTAINTY_INFORMATION_NOT_AVAILABLE;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertTrue(result.isMeasurementUncertaintyInformationNotAvailable());
    }

    @Test
    public void test_constructor049() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = (byte) EnvironmentalSensingMeasurement.MEASUREMENT_UNCERTAINTY_INFORMATION_NOT_AVAILABLE + 1;
        //@formatter:on

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(value);
        assertFalse(result.isMeasurementUncertaintyInformationNotAvailable());
    }

    @Test
    public void test_constructor050() {
        byte[] flags = new byte[] { 1 };
        int samplingFunction = 2;
        int measurementPeriod = 3;
        int internalUpdateInterva = 4;
        int application = 5;
        int measurementUncertainty = 6;

        EnvironmentalSensingMeasurement result = new EnvironmentalSensingMeasurement(flags, samplingFunction, measurementPeriod, internalUpdateInterva, application, measurementUncertainty);
        assertArrayEquals(flags, result.getFlags());
        assertEquals(samplingFunction, result.getSamplingFunction());
        assertEquals(measurementPeriod, result.getMeasurementPeriod());
        assertEquals(internalUpdateInterva, result.getInternalUpdateInterval());
        assertEquals(application, result.getApplication());
        assertEquals(measurementUncertainty, result.getMeasurementUncertainty());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] value = new byte[11];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        value[ 7] = 0x08;
        value[ 8] = 0x09;
        value[ 9] = 0x0a;
        value[10] = 0x0b;
        //@formatter:on

        EnvironmentalSensingMeasurement result1 = new EnvironmentalSensingMeasurement(value);
        assertArrayEquals(value, result1.getBytes());
    }

}
