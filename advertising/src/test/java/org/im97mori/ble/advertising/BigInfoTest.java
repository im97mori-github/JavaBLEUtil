package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.DATA_TYPE_BIG_INFO;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;

import org.junit.Test;

@SuppressWarnings("unused")
public class BigInfoTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000001;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b01000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = (byte) 0b10000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00004 = data;
    }

    private static final byte[] data_00005;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00001000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00005 = data;
    }

    private static final byte[] data_00006;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000001;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00006 = data;
    }

    private static final byte[] data_00007;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00100000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00007 = data;
    }

    private static final byte[] data_00008;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000001;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00008 = data;
    }

    private static final byte[] data_00009;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00010000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00009 = data;
    }

    private static final byte[] data_00010;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000001;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00010 = data;
    }

    private static final byte[] data_00011;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00010000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00011 = data;
    }

    private static final byte[] data_00012;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000001;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00012 = data;
    }

    private static final byte[] data_00013;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000001;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00013 = data;
    }

    private static final byte[] data_00014;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000001;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00014 = data;
    }

    private static final byte[] data_00015;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000001;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00015 = data;
    }

    private static final byte[] data_00016;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00010000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00016 = data;
    }

    private static final byte[] data_00017;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000001;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00017 = data;
    }

    private static final byte[] data_00018;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000001;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00018 = data;
    }

    private static final byte[] data_00019;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00100000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00019 = data;
    }

    private static final byte[] data_00020;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000001;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00020 = data;
    }

    private static final byte[] data_00021;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = (byte) 0b10000000;
        data_00021 = data;
    }

    private static final byte[] data_00022;
    static {
        byte[] data = new byte[59];
        data[ 0] = 58;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data[35] = 0b00000001;
        data[36] = 0b00000000;
        data[37] = 0b00000000;
        data[38] = 0b00000000;
        data[39] = 0b00000000;
        data[40] = 0b00000000;
        data[41] = 0b00000000;
        data[42] = 0b00000000;
        data[43] = 0b00000000;
        data[44] = 0b00000000;
        data[45] = 0b00000000;
        data[46] = 0b00000000;
        data[47] = 0b00000000;
        data[48] = 0b00000000;
        data[49] = 0b00000000;
        data[50] = 0b00000000;
        data[51] = 0b00000000;
        data[52] = 0b00000000;
        data[53] = 0b00000000;
        data[54] = 0b00000000;
        data[55] = 0b00000000;
        data[56] = 0b00000000;
        data[57] = 0b00000000;
        data[58] = 0b00000000;
        data_00022 = data;
    }

    private static final byte[] data_00023;
    static {
        byte[] data = new byte[59];
        data[ 0] = 58;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data[35] = 0b00000000;
        data[36] = 0b00000000;
        data[37] = 0b00000000;
        data[38] = 0b00000000;
        data[39] = 0b00000000;
        data[40] = 0b00000000;
        data[41] = 0b00000000;
        data[42] = 0b00000000;
        data[43] = 0b00000001;
        data[44] = 0b00000000;
        data[45] = 0b00000000;
        data[46] = 0b00000000;
        data[47] = 0b00000000;
        data[48] = 0b00000000;
        data[49] = 0b00000000;
        data[50] = 0b00000000;
        data[51] = 0b00000000;
        data[52] = 0b00000000;
        data[53] = 0b00000000;
        data[54] = 0b00000000;
        data[55] = 0b00000000;
        data[56] = 0b00000000;
        data[57] = 0b00000000;
        data[58] = 0b00000000;
        data_00023 = data;
    }

    private static final byte[] data_00101;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00101 = data;
    }

    private static final byte[] data_00102;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000000;
        data[ 3] = 0b01000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00102 = data;
    }

    private static final byte[] data_00103;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000001;
        data[ 3] = 0b00000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00103 = data;
    }

    private static final byte[] data_00104;
    static {
        byte[] data = new byte[35];
        data[ 0] = 34;
        data[ 1] = DATA_TYPE_BIG_INFO;
        data[ 2] = 0b00000001;
        data[ 3] = 0b01000000;
        data[ 4] = 0b00000000;
        data[ 5] = 0b00000000;
        data[ 6] = 0b00000000;
        data[ 7] = 0b00000000;
        data[ 8] = 0b00000000;
        data[ 9] = 0b00000000;
        data[10] = 0b00000000;
        data[11] = 0b00000000;
        data[12] = 0b00000000;
        data[13] = 0b00000000;
        data[14] = 0b00000000;
        data[15] = 0b00000000;
        data[16] = 0b00000000;
        data[17] = 0b00000000;
        data[18] = 0b00000000;
        data[19] = 0b00000000;
        data[20] = 0b00000000;
        data[21] = 0b00000000;
        data[22] = 0b00000000;
        data[23] = 0b00000000;
        data[24] = 0b00000000;
        data[25] = 0b00000000;
        data[26] = 0b00000000;
        data[27] = 0b00000000;
        data[28] = 0b00000000;
        data[29] = 0b00000000;
        data[30] = 0b00000000;
        data[31] = 0b00000000;
        data[32] = 0b00000000;
        data[33] = 0b00000000;
        data[34] = 0b00000000;
        data_00104 = data;
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

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(1, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00003() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(1, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00004() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(1, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00005() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(1, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00006() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(1, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00007() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(1, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00008() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(1, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00009() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(1, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00010() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(1, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00011() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(1, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00012() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(1, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00013() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(1, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00014() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(1, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00015() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(1, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00016() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(1, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00017() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(1, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00018() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(1, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00019() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(1, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00020() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(1, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00021() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(34, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(1, result1.getFraming());
        assertArrayEquals(null, result1.getGiv());
        assertArrayEquals(null, result1.getGskd());
    }

    @Test
    public void test_constructor_00022() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(58, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(Arrays.copyOfRange(data, 35, 43), result1.getGiv());
        assertArrayEquals(Arrays.copyOfRange(data, 43, 59), result1.getGskd());
    }

    @Test
    public void test_constructor_00023() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(58, result1.getLength());
        assertEquals(DATA_TYPE_BIG_INFO, result1.getDataType());
        assertEquals(0, result1.getBigOffset());
        assertEquals(0, result1.getBigOffsetUnits());
        assertEquals(0, result1.getIsoInterval());
        assertEquals(0, result1.getNumBis());
        assertEquals(0, result1.getNse());
        assertEquals(0, result1.getBn());
        assertEquals(0, result1.getSubInterval());
        assertEquals(0, result1.getPto());
        assertEquals(0, result1.getBisSpacing());
        assertEquals(0, result1.getIrc());
        assertEquals(0, result1.getMaxPdu());
        assertEquals(0, result1.getRfu());
        assertEquals(0, result1.getSeedAccessAddress());
        assertEquals(0, result1.getSduInterval());
        assertEquals(0, result1.getMaxSdu());
        assertEquals(0, result1.getBaseCrcInit());
        assertEquals(0, result1.getChm());
        assertEquals(0, result1.getPhy());
        assertEquals(0, result1.getBisPayloadCount());
        assertEquals(0, result1.getFraming());
        assertArrayEquals(Arrays.copyOfRange(data, 35, 43), result1.getGiv());
        assertArrayEquals(Arrays.copyOfRange(data, 43, 59), result1.getGskd());
    }

    @Test
    public void test_constructor_00101() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(0, result1.getBigOffsetMillis(), 0);
    }

    @Test
    public void test_constructor_00102() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(0, result1.getBigOffsetMillis(), 0);
    }

    @Test
    public void test_constructor_00103() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(30, result1.getBigOffsetMillis(), 0);
    }

    @Test
    public void test_constructor_00104() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertEquals(300, result1.getBigOffsetMillis(), 0);
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00004() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00005() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00006() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00007() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00008() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00009() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00010() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00011() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00012() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00013() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00014() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00015() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00016() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00017() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00018() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00019() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00020() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00021() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00022() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00023() {
        byte[] data = getData();

        BigInfo result1 = new BigInfo(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }
}
