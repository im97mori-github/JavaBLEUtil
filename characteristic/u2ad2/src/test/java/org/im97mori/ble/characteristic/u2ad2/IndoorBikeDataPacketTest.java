package org.im97mori.ble.characteristic.u2ad2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.characteristic.core.IndoorBikeDataUtils;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class IndoorBikeDataPacketTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[4];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00002 = data;
    }

    private static final byte[] data_00101;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00101 = data;
    }

    private static final byte[] data_00102;
    static {
        byte[] data = new byte[4];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00102 = data;
    }

    private static final byte[] data_00201;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00201 = data;
    }

    private static final byte[] data_00202;
    static {
        byte[] data = new byte[4];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00202 = data;
    }

    private static final byte[] data_00301;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00301 = data;
    }

    private static final byte[] data_00302;
    static {
        byte[] data = new byte[4];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00302 = data;
    }

    private static final byte[] data_00401;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00401 = data;
    }

    private static final byte[] data_00402;
    static {
        byte[] data = new byte[5];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data_00402 = data;
    }

    private static final byte[] data_00501;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00501 = data;
    }

    private static final byte[] data_00502;
    static {
        byte[] data = new byte[4];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00502 = data;
    }

    private static final byte[] data_00601;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00601 = data;
    }

    private static final byte[] data_00602;
    static {
        byte[] data = new byte[4];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00602 = data;
    }

    private static final byte[] data_00701;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00701 = data;
    }

    private static final byte[] data_00702;
    static {
        byte[] data = new byte[4];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00702 = data;
    }

    private static final byte[] data_00801;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00801 = data;
    }

    private static final byte[] data_00802;
    static {
        byte[] data = new byte[7];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
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
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00901 = data;
    }

    private static final byte[] data_00902;
    static {
        byte[] data = new byte[3];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data_00902 = data;
    }

    private static final byte[] data_01001;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_01001 = data;
    }

    private static final byte[] data_01002;
    static {
        byte[] data = new byte[3];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data_01002 = data;
    }

    private static final byte[] data_01101;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_01101 = data;
    }

    private static final byte[] data_01102;
    static {
        byte[] data = new byte[4];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_TRUE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_01102 = data;
    }

    private static final byte[] data_01201;
    static {
        byte[] data = new byte[2];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_01201 = data;
    }

    private static final byte[] data_01202;
    static {
        byte[] data = new byte[4];
        int flags = IndoorBikeDataUtils.FLAGS_MORE_DATA_TRUE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_CADENCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_RESISTANCE_LEVEL_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_INSTANTANEOUS_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_AVERAGE_POWER_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | IndoorBikeDataUtils.FLAGS_REMAINING_TIME_PRESENT_TRUE;
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

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsMoreDataFalse(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsMoreDataTrue(result1.getFlags()));
        assertEquals(0x0201, result1.getInstantaneousSpeed());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsMoreDataFalse(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsMoreDataTrue(result1.getFlags()));
    }

    @Test
    public void test_constructor_00101() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsAverageSpeedNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsAverageSpeedPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00102() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsAverageSpeedNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsAverageSpeedPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getAverageSpeed());
    }

    @Test
    public void test_constructor_00201() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsInstantaneousCadenceNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsInstantaneousCadencePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00202() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsInstantaneousCadenceNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsInstantaneousCadencePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getInstantaneousCadence());
    }

    @Test
    public void test_constructor_00301() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsAverageCandenceNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsAverageCandencePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00302() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsAverageCandenceNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsAverageCandencePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getAverageCadence());
    }

    @Test
    public void test_constructor_00401() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsTotalDistanceNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsTotalDistancePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00402() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsTotalDistanceNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsTotalDistancePresent(result1.getFlags()));
        assertEquals(0x030201, result1.getTotalDistance());
    }

    @Test
    public void test_constructor_00501() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsResistanceLevelNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsResistanceLevelPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00502() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsResistanceLevelNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsResistanceLevelPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getResistanceLevel());
    }

    @Test
    public void test_constructor_00601() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsInstantaneousPowerNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsInstantaneousPowerPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00602() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsInstantaneousPowerNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsInstantaneousPowerPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getInstantaneousPower());
    }

    @Test
    public void test_constructor_00701() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsAveragePowerNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsAveragePowerPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00702() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsAveragePowerNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsAveragePowerPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getAveragePower());
    }

    @Test
    public void test_constructor_00801() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsExpendedEnergyNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsExpendedEnergyPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00802() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsExpendedEnergyNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsExpendedEnergyPresent(result1.getFlags()));
        assertEquals(0x0201, result1.getTotalEnergy());
        assertEquals(0x0403, result1.getEnergyPerHour());
        assertEquals(0x05, result1.getEnergyPerMinute());
    }

    @Test
    public void test_constructor_00901() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsHeartRateNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsHeartRatePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00902() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsHeartRateNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsHeartRatePresent(result1.getFlags()));
        assertEquals(0x01, result1.getHeartRate());
    }

    @Test
    public void test_constructor_01001() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsMetabolicEquivalentNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsMetabolicEquivalentPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_01002() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsMetabolicEquivalentNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsMetabolicEquivalentPresent(result1.getFlags()));
        assertEquals(0x01, result1.getMetabolicEquivalent());
    }

    @Test
    public void test_constructor_01101() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsElapsedTimeNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsElapsedTimePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_01102() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsElapsedTimeNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsElapsedTimePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getElapsedTime());
    }

    @Test
    public void test_constructor_01201() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(IndoorBikeDataUtils.isFlagsRemainingTimeNotPresent(result1.getFlags()));
        assertFalse(IndoorBikeDataUtils.isFlagsRemainingTimePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_01202() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(IndoorBikeDataUtils.isFlagsRemainingTimeNotPresent(result1.getFlags()));
        assertTrue(IndoorBikeDataUtils.isFlagsRemainingTimePresent(result1.getFlags()));
        assertEquals(0x0201, result1.getRemainingTime());
    }

    @Test
    public void test_constructor_01203() {
        byte[] flags = new byte[] { 1 };
        int instantaneousSpeed = 2;
        int averageSpeed = 3;
        int instantaneousCadence = 4;
        int averageCadence = 5;
        int totalDistance = 6;
        int resistanceLevel = 7;
        int instantaneousPower = 8;
        int averagePower = 9;
        int totalEnergy = 10;
        int energyPerHour = 11;
        int energyPerMinute = 12;
        int heartRate = 13;
        int metabolicEquivalent = 14;
        int elapsedTime = 15;
        int remainingTime = 16;

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(flags, instantaneousSpeed, averageSpeed, instantaneousCadence, averageCadence, totalDistance, resistanceLevel, instantaneousPower, averagePower, totalEnergy, energyPerHour, energyPerMinute, heartRate, metabolicEquivalent, elapsedTime, remainingTime);
        assertArrayEquals(flags, result1.getFlags());
        assertEquals(instantaneousSpeed, result1.getInstantaneousSpeed());
        assertEquals(averageSpeed, result1.getAverageSpeed());
        assertEquals(instantaneousCadence, result1.getInstantaneousCadence());
        assertEquals(averageCadence, result1.getAverageCadence());
        assertEquals(totalDistance, result1.getTotalDistance());
        assertEquals(resistanceLevel, result1.getResistanceLevel());
        assertEquals(instantaneousPower, result1.getInstantaneousPower());
        assertEquals(averagePower, result1.getAveragePower());
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

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00101() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00102() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00201() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00202() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00301() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00302() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00401() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00402() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00501() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00502() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00601() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00602() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00701() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00702() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00801() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00802() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00901() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00902() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01001() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01002() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01101() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01102() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01201() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01202() {
        byte[] data = getData();

        IndoorBikeDataPacket result1 = new IndoorBikeDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
