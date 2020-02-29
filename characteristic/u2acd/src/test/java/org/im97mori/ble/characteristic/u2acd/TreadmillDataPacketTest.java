package org.im97mori.ble.characteristic.u2acd;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.characteristic.core.TreadmillDataUtils;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class TreadmillDataPacketTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_TRUE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data_00002 = data;
    }

    private static final byte[] data_00101;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00101 = data;
    }

    private static final byte[] data_00102;
    static {
        byte[] data = new byte[6];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data_00102 = data;
    }

    private static final byte[] data_00201;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00201 = data;
    }

    private static final byte[] data_00202;
    static {
        byte[] data = new byte[7];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data_00202 = data;
    }

    private static final byte[] data_00301;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00301 = data;
    }

    private static final byte[] data_00302;
    static {
        byte[] data = new byte[8];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data[ 7] = 0x06;
        data_00302 = data;
    }

    private static final byte[] data_00303;
    static {
        byte[] data = new byte[8];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) TreadmillDataUtils.INCLINATION_DATA_NOT_AVAILABLE;
        data[ 5] = (byte) (TreadmillDataUtils.INCLINATION_DATA_NOT_AVAILABLE >> 8);
        data[ 6] = (byte) TreadmillDataUtils.RAMP_ANGLE_SETTING_DATA_NOT_AVAILABLE;
        data[ 7] = (byte) (TreadmillDataUtils.RAMP_ANGLE_SETTING_DATA_NOT_AVAILABLE >> 8);
        data_00303 = data;
    }

    private static final byte[] data_00401;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00401 = data;
    }

    private static final byte[] data_00402;
    static {
        byte[] data = new byte[8];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data[ 7] = 0x06;
        data_00402 = data;
    }

    private static final byte[] data_00501;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00501 = data;
    }

    private static final byte[] data_00502;
    static {
        byte[] data = new byte[5];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data_00502 = data;
    }

    private static final byte[] data_00601;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00601 = data;
    }

    private static final byte[] data_00602;
    static {
        byte[] data = new byte[5];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data_00602 = data;
    }

    private static final byte[] data_00701;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00701 = data;
    }

    private static final byte[] data_00702;
    static {
        byte[] data = new byte[9];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data[ 7] = 0x06;
        data[ 8] = 0x07;
        data_00702 = data;
    }

    private static final byte[] data_00703;
    static {
        byte[] data = new byte[9];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) TreadmillDataUtils.TOTAL_ENERGY_DATA_NOT_AVAILABLE;
        data[ 5] = (byte) (TreadmillDataUtils.TOTAL_ENERGY_DATA_NOT_AVAILABLE >> 8);
        data[ 6] = (byte) TreadmillDataUtils.ENERGY_PER_HOUR_DATA_NOT_AVAILABLE;
        data[ 7] = (byte) (TreadmillDataUtils.ENERGY_PER_HOUR_DATA_NOT_AVAILABLE >> 8);
        data[ 8] = (byte) TreadmillDataUtils.ENERGY_PER_MINUTE_DATA_NOT_AVAILABLE;
        data_00703 = data;
    }

    private static final byte[] data_00801;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00801 = data;
    }

    private static final byte[] data_00802;
    static {
        byte[] data = new byte[5];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data_00802 = data;
    }

    private static final byte[] data_00901;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00901 = data;
    }

    private static final byte[] data_00902;
    static {
        byte[] data = new byte[5];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data_00902 = data;
    }

    private static final byte[] data_01001;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_01001 = data;
    }

    private static final byte[] data_01002;
    static {
        byte[] data = new byte[6];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data_01002 = data;
    }

    private static final byte[] data_01101;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_01101 = data;
    }

    private static final byte[] data_01102;
    static {
        byte[] data = new byte[6];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_TRUE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data_01102 = data;
    }

    private static final byte[] data_01201;
    static {
        byte[] data = new byte[4];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_FALSE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_01201 = data;
    }

    private static final byte[] data_01202;
    static {
        byte[] data = new byte[8];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_TRUE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data[ 7] = 0x06;
        data_01202 = data;
    }

    private static final byte[] data_01203;
    static {
        byte[] data = new byte[8];
        int flags = TreadmillDataUtils.FLAGS_MORE_DATA_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_SPEED_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INCLINATION_AND_RAMP_ANGLE_SETTING_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELEVATION_GAIN_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_INSTANTANEOUS_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_AVERAGE_PACE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_EXPANDED_ENERGY_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_HEART_RATE_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_METABOLIC_EQUIVALENT_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_ELAPSED_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_REMAINING_TIME_PRESENT_FALSE
                | TreadmillDataUtils.FLAGS_FORCE_ON_BELT_AND_POWER_OUTPUT_PRESSENT_TRUE;
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) TreadmillDataUtils.FORCE_ON_BELT_DATA_NOT_AVAILABLE;
        data[ 5] = (byte) (TreadmillDataUtils.FORCE_ON_BELT_DATA_NOT_AVAILABLE >> 8);
        data[ 6] = (byte) TreadmillDataUtils.POWER_OUTPUT_DATA_NOT_AVAILABLE;
        data[ 7] = (byte) (TreadmillDataUtils.POWER_OUTPUT_DATA_NOT_AVAILABLE >> 8);
        data_01203 = data;
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

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsMoreDataFalse(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsMoreDataTrue(result1.getFlags()));
        assertEquals(0x0201, result1.getInstantaneousSpeed());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsMoreDataFalse(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsMoreDataTrue(result1.getFlags()));
    }

    @Test
    public void test_constructor_00101() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsAverageSpeedNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsAverageSpeedPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00102() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsAverageSpeedNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsAverageSpeedPresent(result1.getFlags()));
        assertEquals(0x0403, result1.getAverageSpeed());
    }

    @Test
    public void test_constructor_00201() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsTotalDistanceNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsTotalDistancePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00202() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsTotalDistanceNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsTotalDistancePresent(result1.getFlags()));
        assertEquals(0x050403, result1.getTotalDistance());
    }

    @Test
    public void test_constructor_00301() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsInclinationAndRampAngleSettingNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsInclinationAndRampAngleSettingPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00302() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsInclinationAndRampAngleSettingNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsInclinationAndRampAngleSettingPresent(result1.getFlags()));
        assertEquals(0x0403, result1.getInclination());
        assertEquals(0x0605, result1.getRampAngleSetting());
    }

    @Test
    public void test_constructor_00401() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsElevationGainNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsElevationGainPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00402() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsElevationGainNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsElevationGainPresent(result1.getFlags()));
        assertEquals(0x0403, result1.getPositiveElevationGain());
        assertEquals(0x0605, result1.getNegativeElevationGain());
    }

    @Test
    public void test_constructor_00501() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsInstantaneousPaceNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsInstantaneousPacePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00502() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsInstantaneousPaceNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsInstantaneousPacePresent(result1.getFlags()));
        assertEquals(0x03, result1.getInstantaneousPace());
    }

    @Test
    public void test_constructor_00601() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsAveragePaceNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsAveragePacePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00602() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsAveragePaceNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsAveragePacePresent(result1.getFlags()));
        assertEquals(0x03, result1.getAveragePace());
    }

    @Test
    public void test_constructor_00701() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsExpendedEnergyNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsExpendedEnergyPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00702() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsExpendedEnergyNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsExpendedEnergyPresent(result1.getFlags()));
        assertEquals(0x0403, result1.getTotalEnergy());
        assertEquals(0x0605, result1.getEnergyPerHour());
        assertEquals(0x07, result1.getEnergyPerMinute());
    }

    @Test
    public void test_constructor_00801() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsHeartRateNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsHeartRatePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00802() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsHeartRateNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsHeartRatePresent(result1.getFlags()));
        assertEquals(0x03, result1.getHeartRate());
    }

    @Test
    public void test_constructor_00901() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsMetabolicEquivalentNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsMetabolicEquivalentPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_00902() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsMetabolicEquivalentNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsMetabolicEquivalentPresent(result1.getFlags()));
        assertEquals(0x03, result1.getMetabolicEquivalent());
    }

    @Test
    public void test_constructor_01001() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsElapsedTimeNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsElapsedTimePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_01002() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsElapsedTimeNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsElapsedTimePresent(result1.getFlags()));
        assertEquals(0x0403, result1.getElapsedTime());
    }

    @Test
    public void test_constructor_01101() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsRemainingTimeNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsRemainingTimePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_01102() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsRemainingTimeNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsRemainingTimePresent(result1.getFlags()));
        assertEquals(0x0403, result1.getRemainingTime());
    }

    @Test
    public void test_constructor_01201() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(TreadmillDataUtils.isFlagsForceOnBeltAndPowerOutputNotPresent(result1.getFlags()));
        assertFalse(TreadmillDataUtils.isFlagsForceOnBeltAndPowerOutputPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor_01202() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(TreadmillDataUtils.isFlagsForceOnBeltAndPowerOutputNotPresent(result1.getFlags()));
        assertTrue(TreadmillDataUtils.isFlagsForceOnBeltAndPowerOutputPresent(result1.getFlags()));
        assertEquals(0x0403, result1.getForceOnBelt());
        assertEquals(0x0605, result1.getPowerOutput());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00101() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00102() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00201() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00202() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00301() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00302() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00401() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00402() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00501() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00502() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00601() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00602() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00701() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00702() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00801() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00802() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00901() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00902() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01001() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01002() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01101() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01102() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01201() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_01202() {
        byte[] data = getData();

        TreadmillDataPacket result1 = new TreadmillDataPacket(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
