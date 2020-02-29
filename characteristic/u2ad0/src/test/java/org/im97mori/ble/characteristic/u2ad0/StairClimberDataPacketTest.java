package org.im97mori.ble.characteristic.u2ad0;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.characteristic.core.StairClimberDataUtils;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class StairClimberDataPacketTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[4];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_FALSE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00002 = data;
    }

    private static final byte[] data_00101;
    static {
        byte[] data = new byte[2];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00101 = data;
    }

    private static final byte[] data_00102;
    static {
        byte[] data = new byte[4];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00102 = data;
    }

    private static final byte[] data_00201;
    static {
        byte[] data = new byte[2];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00201 = data;
    }

    private static final byte[] data_00202;
    static {
        byte[] data = new byte[4];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00202 = data;
    }

    private static final byte[] data_00301;
    static {
        byte[] data = new byte[2];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00301 = data;
    }

    private static final byte[] data_00302;
    static {
        byte[] data = new byte[4];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00302 = data;
    }

    private static final byte[] data_00401;
    static {
        byte[] data = new byte[2];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00401 = data;
    }

    private static final byte[] data_00402;
    static {
        byte[] data = new byte[4];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00402 = data;
    }

    private static final byte[] data_00501;
    static {
        byte[] data = new byte[2];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00501 = data;
    }

    private static final byte[] data_00502;
    static {
        byte[] data = new byte[7];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data_00502 = data;
    }

    private static final byte[] data_00601;
    static {
        byte[] data = new byte[2];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00601 = data;
    }

    private static final byte[] data_00602;
    static {
        byte[] data = new byte[3];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data_00602 = data;
    }

    private static final byte[] data_00701;
    static {
        byte[] data = new byte[2];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00701 = data;
    }

    private static final byte[] data_00702;
    static {
        byte[] data = new byte[3];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data_00702 = data;
    }

    private static final byte[] data_00801;
    static {
        byte[] data = new byte[2];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00801 = data;
    }

    private static final byte[] data_00802;
    static {
        byte[] data = new byte[4];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00802 = data;
    }

    private static final byte[] data_00901;
    static {
        byte[] data = new byte[2];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00901 = data;
    }

    private static final byte[] data_00902;
    static {
        byte[] data = new byte[4];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_TRUE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_TRUE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00902 = data;
    }
    //@formatter:on

    private byte[] getData() {
        int index = -1;
        byte[] data = null;

        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTraceElementArray.length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArray[i];
            if ("getData".equals(stackTraceElement.getMethodName())) {
                index = i + 1;
                break;
            }
        }
        if (index >= 0 && index < stackTraceElementArray.length) {
            StackTraceElement stackTraceElement = stackTraceElementArray[index];
            String[] splitted = stackTraceElement.getMethodName().split("_");
            try {
                data = (byte[]) this.getClass().getDeclaredField("data_" + splitted[splitted.length - 1]).get(null);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StairClimberDataUtils.isFlagsMoreDataFalse(result1.getFlags()));
        assertFalse(StairClimberDataUtils.isFlagsMoreDataTrue(result1.getFlags()));
        assertEquals(0x0201, result1.getFloors());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StairClimberDataUtils.isFlagsMoreDataFalse(result1.getFlags()));
        assertTrue(StairClimberDataUtils.isFlagsMoreDataTrue(result1.getFlags()));
    }

    @Test
    public void test_constructor_00101() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StairClimberDataUtils.isFlagsStepPerMinuteNotPresent(result1.getFlags()));
        assertFalse(StairClimberDataUtils.isFlagsStepPerMinutePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00102() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StairClimberDataUtils.isFlagsStepPerMinuteNotPresent(result1.getFlags()));
        assertTrue(StairClimberDataUtils.isFlagsStepPerMinutePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getStepPerMinute());
    }

    @Test
    public void test_constructor_00201() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StairClimberDataUtils.isFlagsAverageStepRateNotPresent(result1.getFlags()));
        assertFalse(StairClimberDataUtils.isFlagsAverageStepRatePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00202() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StairClimberDataUtils.isFlagsAverageStepRateNotPresent(result1.getFlags()));
        assertTrue(StairClimberDataUtils.isFlagsAverageStepRatePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getAverageStepRate());
    }

    @Test
    public void test_constructor_00301() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StairClimberDataUtils.isFlagsPositiveElevationGainNotPresent(result1.getFlags()));
        assertFalse(StairClimberDataUtils.isFlagsPositiveElevationGainPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00302() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StairClimberDataUtils.isFlagsPositiveElevationGainNotPresent(result1.getFlags()));
        assertTrue(StairClimberDataUtils.isFlagsPositiveElevationGainPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getPositiveElevationGain());
    }

    @Test
    public void test_constructor_00401() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StairClimberDataUtils.isFlagsStrideCountNotPresent(result1.getFlags()));
        assertFalse(StairClimberDataUtils.isFlagsStrideCountPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00402() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StairClimberDataUtils.isFlagsStrideCountNotPresent(result1.getFlags()));
        assertTrue(StairClimberDataUtils.isFlagsStrideCountPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getStrideCount());
    }

    @Test
    public void test_constructor_00501() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StairClimberDataUtils.isFlagsExpendedEnergyNotPresent(result1.getFlags()));
        assertFalse(StairClimberDataUtils.isFlagsExpendedEnergyPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00502() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StairClimberDataUtils.isFlagsExpendedEnergyNotPresent(result1.getFlags()));
        assertTrue(StairClimberDataUtils.isFlagsExpendedEnergyPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getTotalEnergy());
        assertEquals(0x0403, result1.getEnergyPerHour());
        assertEquals(0x05, result1.getEnergyPerMinute());
    }

    @Test
    public void test_constructor_00601() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StairClimberDataUtils.isFlagsHeartRateNotPresent(result1.getFlags()));
        assertFalse(StairClimberDataUtils.isFlagsHeartRatePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00602() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StairClimberDataUtils.isFlagsHeartRateNotPresent(result1.getFlags()));
        assertTrue(StairClimberDataUtils.isFlagsHeartRatePresent(result1.getFlags()));
        assertEquals(0x01, result1.getHeartRate());
    }

    @Test
    public void test_constructor_00701() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StairClimberDataUtils.isFlagsMetabolicEquivalentNotPresent(result1.getFlags()));
        assertFalse(StairClimberDataUtils.isFlagsMetabolicEquivalentPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00702() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StairClimberDataUtils.isFlagsMetabolicEquivalentNotPresent(result1.getFlags()));
        assertTrue(StairClimberDataUtils.isFlagsMetabolicEquivalentPresent(result1.getFlags()));
        assertEquals(0x01, result1.getMetabolicEquivalent());
    }

    @Test
    public void test_constructor_00801() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StairClimberDataUtils.isFlagsElapsedTimeNotPresent(result1.getFlags()));
        assertFalse(StairClimberDataUtils.isFlagsElapsedTimePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00802() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StairClimberDataUtils.isFlagsElapsedTimeNotPresent(result1.getFlags()));
        assertTrue(StairClimberDataUtils.isFlagsElapsedTimePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getElapsedTime());
    }

    @Test
    public void test_constructor_00901() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(StairClimberDataUtils.isFlagsRemainingTimeNotPresent(result1.getFlags()));
        assertFalse(StairClimberDataUtils.isFlagsRemainingTimePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00902() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(StairClimberDataUtils.isFlagsRemainingTimeNotPresent(result1.getFlags()));
        assertTrue(StairClimberDataUtils.isFlagsRemainingTimePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getRemainingTime());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00101() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00102() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00201() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00202() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00301() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00302() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00401() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00402() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00501() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00502() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00601() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00602() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00701() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00702() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00801() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00802() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00901() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00902() {
        byte[] data = getData();

        StairClimberDataPacket result1 = new StairClimberDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
