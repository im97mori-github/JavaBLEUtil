package org.im97mori.ble.characteristic.u2acf;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.characteristic.core.StepClimberDataUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class StepClimberDataPacketTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[6];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_FALSE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00002 = data;
    }

    private static final byte[] data_00101;
    static {
        byte[] data = new byte[2];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00101 = data;
    }

    private static final byte[] data_00102;
    static {
        byte[] data = new byte[4];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_TRUE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00102 = data;
    }

    private static final byte[] data_00201;
    static {
        byte[] data = new byte[2];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00201 = data;
    }

    private static final byte[] data_00202;
    static {
        byte[] data = new byte[4];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_TRUE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00202 = data;
    }

    private static final byte[] data_00301;
    static {
        byte[] data = new byte[2];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00301 = data;
    }

    private static final byte[] data_00302;
    static {
        byte[] data = new byte[4];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_TRUE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00302 = data;
    }

    private static final byte[] data_00401;
    static {
        byte[] data = new byte[2];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00401 = data;
    }

    private static final byte[] data_00402;
    static {
        byte[] data = new byte[7];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_TRUE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data_00402 = data;
    }

    private static final byte[] data_00501;
    static {
        byte[] data = new byte[2];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00501 = data;
    }

    private static final byte[] data_00502;
    static {
        byte[] data = new byte[3];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_TRUE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data_00502 = data;
    }

    private static final byte[] data_00601;
    static {
        byte[] data = new byte[2];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00601 = data;
    }

    private static final byte[] data_00602;
    static {
        byte[] data = new byte[3];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_TRUE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data_00602 = data;
    }

    private static final byte[] data_00701;
    static {
        byte[] data = new byte[2];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00701 = data;
    }

    private static final byte[] data_00702;
    static {
        byte[] data = new byte[4];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_TRUE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00702 = data;
    }

    private static final byte[] data_00801;
    static {
        byte[] data = new byte[2];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00801 = data;
    }

    private static final byte[] data_00802;
    static {
        byte[] data = new byte[4];
        int flags = StepClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StepClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StepClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_TRUE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00802 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StepClimberDataUtils.isFlagsMoreDataFalse(result1.getFlags()));
        assertFalse(StepClimberDataUtils.isFlagsMoreDataTrue(result1.getFlags()));
        assertEquals(0x0201, result1.getFloors());
        assertEquals(0x0403, result1.getStepCount());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StepClimberDataUtils.isFlagsMoreDataFalse(result1.getFlags()));
        assertTrue(StepClimberDataUtils.isFlagsMoreDataTrue(result1.getFlags()));
    }

    @Test
    public void test_constructor_00101() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StepClimberDataUtils.isFlagsStepPerMinuteNotPresent(result1.getFlags()));
        assertFalse(StepClimberDataUtils.isFlagsStepPerMinutePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00102() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StepClimberDataUtils.isFlagsStepPerMinuteNotPresent(result1.getFlags()));
        assertTrue(StepClimberDataUtils.isFlagsStepPerMinutePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getStepPerMinute());
    }

    @Test
    public void test_constructor_00201() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StepClimberDataUtils.isFlagsAverageStepRateNotPresent(result1.getFlags()));
        assertFalse(StepClimberDataUtils.isFlagsAverageStepRatePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00202() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StepClimberDataUtils.isFlagsAverageStepRateNotPresent(result1.getFlags()));
        assertTrue(StepClimberDataUtils.isFlagsAverageStepRatePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getAverageStepRate());
    }

    @Test
    public void test_constructor_00301() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StepClimberDataUtils.isFlagsPositiveElevationGainNotPresent(result1.getFlags()));
        assertFalse(StepClimberDataUtils.isFlagsPositiveElevationGainPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00302() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StepClimberDataUtils.isFlagsPositiveElevationGainNotPresent(result1.getFlags()));
        assertTrue(StepClimberDataUtils.isFlagsPositiveElevationGainPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getPositiveElevationGain());
    }

    @Test
    public void test_constructor_00401() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StepClimberDataUtils.isFlagsExpendedEnergyNotPresent(result1.getFlags()));
        assertFalse(StepClimberDataUtils.isFlagsExpendedEnergyPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00402() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StepClimberDataUtils.isFlagsExpendedEnergyNotPresent(result1.getFlags()));
        assertTrue(StepClimberDataUtils.isFlagsExpendedEnergyPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getTotalEnergy());
        assertEquals(0x0403, result1.getEnergyPerHour());
        assertEquals(0x05, result1.getEnergyPerMinute());
    }

    @Test
    public void test_constructor_00501() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StepClimberDataUtils.isFlagsHeartRateNotPresent(result1.getFlags()));
        assertFalse(StepClimberDataUtils.isFlagsHeartRatePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00502() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StepClimberDataUtils.isFlagsHeartRateNotPresent(result1.getFlags()));
        assertTrue(StepClimberDataUtils.isFlagsHeartRatePresent(result1.getFlags()));
        assertEquals(0x01, result1.getHeartRate());
    }

    @Test
    public void test_constructor_00601() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StepClimberDataUtils.isFlagsMetabolicEquivalentNotPresent(result1.getFlags()));
        assertFalse(StepClimberDataUtils.isFlagsMetabolicEquivalentPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00602() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StepClimberDataUtils.isFlagsMetabolicEquivalentNotPresent(result1.getFlags()));
        assertTrue(StepClimberDataUtils.isFlagsMetabolicEquivalentPresent(result1.getFlags()));
        assertEquals(0x01, result1.getMetabolicEquivalent());
    }

    @Test
    public void test_constructor_00701() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StepClimberDataUtils.isFlagsElapsedTimeNotPresent(result1.getFlags()));
        assertFalse(StepClimberDataUtils.isFlagsElapsedTimePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00702() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StepClimberDataUtils.isFlagsElapsedTimeNotPresent(result1.getFlags()));
        assertTrue(StepClimberDataUtils.isFlagsElapsedTimePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getElapsedTime());
    }

    @Test
    public void test_constructor_00801() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StepClimberDataUtils.isFlagsRemainingTimeNotPresent(result1.getFlags()));
        assertFalse(StepClimberDataUtils.isFlagsRemainingTimePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00802() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StepClimberDataUtils.isFlagsRemainingTimeNotPresent(result1.getFlags()));
        assertTrue(StepClimberDataUtils.isFlagsRemainingTimePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getRemainingTime());
    }

    @Test
    public void test_constructor_00803() {
        byte[] flags = new byte[] { 1 };
        int floors = 2;
        int stepCount = 3;
        int stepPerMinute = 4;
        int averageStepRate = 5;
        int positiveElevationGain = 6;
        int totalEnergy = 7;
        int energyPerHour = 8;
        int energyPerMinute = 9;
        int heartRate = 10;
        int metabolicEquivalent = 11;
        int elapsedTime = 12;
        int remainingTime = 13;

        StepClimberDataPacket result1 = new StepClimberDataPacket(flags, floors, stepCount, stepPerMinute, averageStepRate, positiveElevationGain, totalEnergy, energyPerHour, energyPerMinute, heartRate, metabolicEquivalent, elapsedTime, remainingTime);
        assertArrayEquals(flags, result1.getFlags());
        assertEquals(floors, result1.getFloors());
        assertEquals(stepCount, result1.getStepCount());
        assertEquals(stepPerMinute, result1.getStepPerMinute());
        assertEquals(averageStepRate, result1.getAverageStepRate());
        assertEquals(positiveElevationGain, result1.getPositiveElevationGain());
        assertEquals(totalEnergy, result1.getTotalEnergy());
        assertEquals(energyPerHour, result1.getEnergyPerHour());
        assertEquals(energyPerMinute, result1.getEnergyPerMinute());
        assertEquals(heartRate, result1.getHeartRate());
        assertEquals(metabolicEquivalent, result1.getMetabolicEquivalent());
        assertEquals(elapsedTime, result1.getElapsedTime());
        assertEquals(remainingTime, result1.getRemainingTime());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00101() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00102() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00201() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00202() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00301() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00302() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00401() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00402() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00501() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00502() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00601() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00602() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00701() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00702() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00801() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00802() {
        byte[] data = getData();

        StepClimberDataPacket result1 = new StepClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
