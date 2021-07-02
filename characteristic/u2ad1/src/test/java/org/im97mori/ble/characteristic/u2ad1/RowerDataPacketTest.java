package org.im97mori.ble.characteristic.u2ad1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.characteristic.core.RowerDataUtils;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class RowerDataPacketTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[5];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00002 = data;
    }

    private static final byte[] data_00101;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00101 = data;
    }

    private static final byte[] data_00102;
    static {
        byte[] data = new byte[3];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_TRUE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data_00102 = data;
    }

    private static final byte[] data_00201;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00201 = data;
    }

    private static final byte[] data_00202;
    static {
        byte[] data = new byte[5];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_TRUE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data_00202 = data;
    }

    private static final byte[] data_00301;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00301 = data;
    }

    private static final byte[] data_00302;
    static {
        byte[] data = new byte[4];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00302 = data;
    }

    private static final byte[] data_00401;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00401 = data;
    }

    private static final byte[] data_00402;
    static {
        byte[] data = new byte[4];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_TRUE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00402 = data;
    }

    private static final byte[] data_00501;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00501 = data;
    }

    private static final byte[] data_00502;
    static {
        byte[] data = new byte[4];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00502 = data;
    }

    private static final byte[] data_00601;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00601 = data;
    }

    private static final byte[] data_00602;
    static {
        byte[] data = new byte[4];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_TRUE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00602 = data;
    }

    private static final byte[] data_00701;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00701 = data;
    }

    private static final byte[] data_00702;
    static {
        byte[] data = new byte[4];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_TRUE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00702 = data;
    }

    private static final byte[] data_00801;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00801 = data;
    }

    private static final byte[] data_00802;
    static {
        byte[] data = new byte[7];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_TRUE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data_00802 = data;
    }

    private static final byte[] data_00901;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00901 = data;
    }

    private static final byte[] data_00902;
    static {
        byte[] data = new byte[3];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_TRUE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data_00902 = data;
    }

    private static final byte[] data_01001;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_01001 = data;
    }

    private static final byte[] data_01002;
    static {
        byte[] data = new byte[3];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_TRUE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data_01002 = data;
    }

    private static final byte[] data_01101;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_01101 = data;
    }

    private static final byte[] data_01102;
    static {
        byte[] data = new byte[4];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_TRUE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_01102 = data;
    }

    private static final byte[] data_01201;
    static {
        byte[] data = new byte[2];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_01201 = data;
    }

    private static final byte[] data_01202;
    static {
        byte[] data = new byte[4];
        int flags = RowerDataUtils.FLAGS_MORE_DATA_TRUE
                | RowerDataUtils.FLAGS_AVERAGE_STROKE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | RowerDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | RowerDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | RowerDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | RowerDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | RowerDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | RowerDataUtils.FLAGS_REMAINING_TIME_PRESENT_TRUE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_01202 = data;
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

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsMoreDataFalse(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsMoreDataTrue(result1.getFlags()));
        assertEquals(0x01, result1.getStrokeRate());
        assertEquals(0x0302, result1.getStrokeCount());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsMoreDataFalse(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsMoreDataTrue(result1.getFlags()));
    }

    @Test
    public void test_constructor_00101() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsAverageStrokeNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsAverageStrokePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00102() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsAverageStrokeNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsAverageStrokePresent(result1.getFlags()));
        assertEquals(0x01, result1.getAverageStrokeRate());
    }

    @Test
    public void test_constructor_00201() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsTotalDistanceNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsTotalDistancePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00202() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsTotalDistanceNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsTotalDistancePresent(result1.getFlags()));
        assertEquals(0x030201, result1.getTotalDistance());
    }

    @Test
    public void test_constructor_00301() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsInstantaneousPaceNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsInstantaneousPacePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00302() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsInstantaneousPaceNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsInstantaneousPacePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getInstantaneousPace());
    }

    @Test
    public void test_constructor_00401() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsAveragePaceNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsAveragePacePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00402() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsAveragePaceNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsAveragePacePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getAveragePace());
    }

    @Test
    public void test_constructor_00501() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsInstantaneousPowerNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsInstantaneousPowerPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00502() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsInstantaneousPowerNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsInstantaneousPowerPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getInstantaneousPower());
    }

    @Test
    public void test_constructor_00601() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsAveragePowerNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsAveragePowerPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00602() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsAveragePowerNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsAveragePowerPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getAveragePower());
    }

    @Test
    public void test_constructor_00701() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsResistanceLevelNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsResistanceLevelPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00702() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsResistanceLevelNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsResistanceLevelPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getResistanceLevel());
    }

    @Test
    public void test_constructor_00801() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsExpendedEnergyNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsExpendedEnergyPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00802() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsExpendedEnergyNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsExpendedEnergyPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getTotalEnergy());
        assertEquals(0x0403, result1.getEnergyPerHour());
        assertEquals(0x05, result1.getEnergyPerMinute());
    }

    @Test
    public void test_constructor_00901() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsHeartRateNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsHeartRatePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00902() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsHeartRateNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsHeartRatePresent(result1.getFlags()));
        assertEquals(0x01, result1.getHeartRate());
    }

    @Test
    public void test_constructor_01001() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsMetabolicEquivalentNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsMetabolicEquivalentPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_01002() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsMetabolicEquivalentNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsMetabolicEquivalentPresent(result1.getFlags()));
        assertEquals(0x01, result1.getMetabolicEquivalent());
    }

    @Test
    public void test_constructor_01101() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsElapsedTimeNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsElapsedTimePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_01102() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsElapsedTimeNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsElapsedTimePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getElapsedTime());
    }

    @Test
    public void test_constructor_01201() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(RowerDataUtils.isFlagsRemainingTimeNotPresent(result1.getFlags()));
        assertFalse(RowerDataUtils.isFlagsRemainingTimePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_01202() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(RowerDataUtils.isFlagsRemainingTimeNotPresent(result1.getFlags()));
        assertTrue(RowerDataUtils.isFlagsRemainingTimePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getRemainingTime());
    }

    @Test
    public void test_constructor_01203() {
        byte[] flags = new byte[] { 1 };
        int strokeRate = 2;
        int strokeCount = 3;
        int averageStrokeRate = 4;
        int totalDistance = 5;
        int instantaneousPace = 6;
        int averagePace = 7;
        int instantaneousPower = 8;
        int averagePower = 9;
        int resistanceLevel = 10;
        int totalEnergy = 11;
        int energyPerHour = 12;
        int energyPerMinute = 13;
        int heartRate = 14;
        int metabolicEquivalent = 15;
        int elapsedTime = 16;
        int remainingTime = 17;

        RowerDataPacket result1 = new RowerDataPacket(flags, strokeRate, strokeCount, averageStrokeRate, totalDistance, instantaneousPace, averagePace, instantaneousPower, averagePower, resistanceLevel, totalEnergy, energyPerHour, energyPerMinute, heartRate, metabolicEquivalent, elapsedTime, remainingTime);
        assertArrayEquals(flags, result1.getFlags());
        assertEquals(strokeRate, result1.getStrokeRate());
        assertEquals(strokeCount, result1.getStrokeCount());
        assertEquals(averageStrokeRate, result1.getAverageStrokeRate());
        assertEquals(totalDistance, result1.getTotalDistance());
        assertEquals(instantaneousPace, result1.getInstantaneousPace());
        assertEquals(averagePace, result1.getAveragePace());
        assertEquals(instantaneousPower, result1.getInstantaneousPower());
        assertEquals(averagePower, result1.getAveragePower());
        assertEquals(resistanceLevel, result1.getResistanceLevel());
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

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00101() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00102() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00201() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00202() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00301() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00302() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00401() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00402() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00501() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00502() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00601() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00602() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00701() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00702() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00801() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00802() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00901() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00902() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01001() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01002() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01101() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01102() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01201() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01202() {
        byte[] data = getData();

        RowerDataPacket result1 = new RowerDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
