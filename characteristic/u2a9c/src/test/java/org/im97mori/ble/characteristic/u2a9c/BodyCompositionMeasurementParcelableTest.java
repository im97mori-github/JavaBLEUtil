package org.im97mori.ble.characteristic.u2a9c;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.im97mori.ble.characteristic.core.DateTimeUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class BodyCompositionMeasurementParcelableTest extends TestBase {

    @Test
    public void test_parcelable101() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable103() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable104() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 1582;
        data[ 5] = (byte) (1582 >> 8);
        data[ 6] = DateTimeUtils.MONTH_IS_NOT_KNOWN;
        data[ 7] = DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN;
        data[ 8] = 0;
        data[ 9] = 0;
        data[10] = 0;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable105() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_JANUARY;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 59;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable106() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_FEBRUARY;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable107() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_MARCH;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable108() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_APRIL;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable109() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_MAY;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable110() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_JUNE;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable111() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_JULY;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable112() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_AUGUST;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable113() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_SEPTEMBER;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable114() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_OCTOBER;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable115() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_NOVEMBER;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable116() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[11];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 9999;
        data[ 5] = (byte) (9999 >> 8);
        data[ 6] = DateTimeUtils.MONTH_DECEMBER;
        data[ 7] = 1;
        data[ 8] = 23;
        data[ 9] = 59;
        data[10] = 58;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable117() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable118() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable119() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable120() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable121() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable122() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable123() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable124() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable125() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable126() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable127() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable128() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable129() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable130() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable131() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable132() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable133() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable134() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable135() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable136() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable137() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable138() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable139() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable140() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable141() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable142() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable143() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable144() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable145() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable146() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable147() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable148() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable149() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable150() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable151() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable152() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable153() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable154() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable155() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable156() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable157() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = (byte) 0xff;
        data[ 5] = (byte) 0xff;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable158() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable159() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_TRUE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable160() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable161() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_FALSE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) BodyCompositionMeasurement.MEASUREMENT_UNSUCCESSFUL;
        data[ 3] = (byte) (BodyCompositionMeasurement.MEASUREMENT_UNSUCCESSFUL >> 8);
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable162() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[31];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) BodyCompositionMeasurement.MEASUREMENT_UNSUCCESSFUL;
        data[ 3] = (byte) (BodyCompositionMeasurement.MEASUREMENT_UNSUCCESSFUL >> 8);
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(Arrays.copyOfRange(data, 0, 12), result1.getBytes());
    }

    @Test
    public void test_parcelable163() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_SI
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[30];
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
        data[23] = 0x16;
        data[24] = 0x17;
        data[25] = 0x18;
        data[26] = 0x19;
        data[27] = 0x1a;
        data[28] = 0x1b;
        data[29] = 0x1c;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable164() {
        int flags = BodyCompositionMeasurement.FLAG_MEASUREMENT_UNITS_IMPERIAL
                | BodyCompositionMeasurement.FLAG_TIME_STAMP_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_USER_ID_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BASAL_METABOLISM_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MUSCLE_PERCENTAGE_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MUSCLE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_FAT_FREE_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_SOFT_LEAN_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_BODY_WATER_MASS_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_IMPEDANCE_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_WEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_HEIGHT_PRESENT_TRUE
                | BodyCompositionMeasurement.FLAG_MULTIPLE_PACKET_MEASUREMENT_FALSE;
        //@formatter:off
        byte[] data = new byte[30];
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
        data[23] = 0x16;
        data[24] = 0x17;
        data[25] = 0x18;
        data[26] = 0x19;
        data[27] = 0x1a;
        data[28] = 0x1b;
        data[29] = 0x1c;
        //@formatter:on

        BodyCompositionMeasurement result1 = new BodyCompositionMeasurement(new BodyCompositionMeasurementPacket[] { new BodyCompositionMeasurementPacket(data) });
        assertArrayEquals(data, result1.getBytes());
    }

}
