package org.im97mori.ble.characteristic.u2ad0;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.characteristic.core.StairClimberDataUtils;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class StairClimberDataTest {

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
        //@formatter:off
        byte[] data = new byte[23];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_FALSE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_TRUE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data[ 7] = 0x06;
        data[ 8] = 0x07;
        data[ 9] = 0x08;
        data[10] = 0x09;
        data[11] = 0x0a;
        data[12] = 0x0b;
        data[13] = 0x0c;
        data[14] = 0x0d;
        data[15] = 0x0e;
        data[16] = 0x0f;
        data[17] = 0x10;
        data[18] = 0x11;
        data[19] = 0x12;
        data[20] = 0x13;
        data[21] = 0x14;
        data[22] = 0x15;
        //@formatter:on

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertEquals(0x0201, result1.getFloors());
        assertEquals(0x0403, result1.getStepPerMinute());
        assertEquals(0x0605, result1.getAverageStepRate());
        assertEquals(0x0807, result1.getPositiveElevationGain());
        assertEquals(0x0a09, result1.getStrideCount());
        assertEquals(0x0c0b, result1.getTotalEnergy());
        assertEquals(0x0e0d, result1.getEnergyPerHour());
        assertEquals(0x0f, result1.getEnergyPerMinute());
        assertEquals(0x10, result1.getHeartRate());
        assertEquals(0x11, result1.getMetabolicEquivalent());
        assertEquals(0x1312, result1.getElapsedTime());
        assertEquals(0x1514, result1.getRemainingTime());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data1 = new byte[23];
        int flags = StairClimberDataUtils.FLAGS_MORE_DATA_FALSE
                | StairClimberDataUtils.FLAGS_STEP_PER_MINUTE_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_AVERAGE_STEP_RATE_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_POSITIVE_ELEVATION_GAIN_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_STRIDE_COUNT_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_EXPENDED_ENERGY_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_HEART_RATE_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_ELAPSED_TIME_PRESENT_TRUE
                | StairClimberDataUtils.FLAGS_REMAINING_TIME_PRESENT_TRUE;
        data1[ 0] = (byte) flags;
        data1[ 1] = (byte) (flags >> 8);
        data1[ 2] = 0x01;
        data1[ 3] = 0x02;
        data1[ 4] = 0x03;
        data1[ 5] = 0x04;
        data1[ 6] = 0x05;
        data1[ 7] = 0x06;
        data1[ 8] = 0x07;
        data1[ 9] = 0x08;
        data1[10] = 0x09;
        data1[11] = 0x0a;
        data1[12] = 0x0b;
        data1[13] = 0x0c;
        data1[14] = 0x0d;
        data1[15] = 0x0e;
        data1[16] = 0x0f;
        data1[17] = 0x10;
        data1[18] = 0x11;
        data1[19] = 0x12;
        data1[20] = 0x13;
        data1[21] = 0x14;
        data1[22] = 0x15;

        byte[] data2 = new byte[23];
        data2[ 0] = (byte) flags;
        data2[ 1] = (byte) (flags >> 8);
        data2[ 2] = 0x16;
        data2[ 3] = 0x17;
        data2[ 4] = 0x18;
        data2[ 5] = 0x19;
        data2[ 6] = 0x1a;
        data2[ 7] = 0x1b;
        data2[ 8] = 0x1c;
        data2[ 9] = 0x1d;
        data2[10] = 0x1e;
        data2[11] = 0x1f;
        data2[12] = 0x20;
        data2[13] = 0x21;
        data2[14] = 0x22;
        data2[15] = 0x23;
        data2[16] = 0x24;
        data2[17] = 0x25;
        data2[18] = 0x26;
        data2[19] = 0x27;
        data2[20] = 0x28;
        data2[21] = 0x29;
        data2[22] = 0x2a;
        //@formatter:on

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data1), new StairClimberDataPacket(data2) });
        assertArrayEquals(Arrays.copyOfRange(data2, 0, 2), result1.getFlags());
        assertEquals(0x1716, result1.getFloors());
        assertEquals(0x1918, result1.getStepPerMinute());
        assertEquals(0x1b1a, result1.getAverageStepRate());
        assertEquals(0x1d1c, result1.getPositiveElevationGain());
        assertEquals(0x1f1e, result1.getStrideCount());
        assertEquals(0x2120, result1.getTotalEnergy());
        assertEquals(0x2322, result1.getEnergyPerHour());
        assertEquals(0x24, result1.getEnergyPerMinute());
        assertEquals(0x25, result1.getHeartRate());
        assertEquals(0x26, result1.getMetabolicEquivalent());
        assertEquals(0x2827, result1.getElapsedTime());
        assertEquals(0x2a29, result1.getRemainingTime());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00101() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00102() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00201() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00202() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00301() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00302() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00401() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00402() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00501() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00502() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00601() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00602() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00701() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00702() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00801() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00802() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00901() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00902() {
        byte[] data = getData();

        StairClimberData result1 = new StairClimberData(new StairClimberDataPacket[] { new StairClimberDataPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

}
