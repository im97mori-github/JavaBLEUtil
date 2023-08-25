package org.im97mori.ble.characteristic.u2a69;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class PositionQualityTest extends TestBase {

    @Test
    public void test_constructor001() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsNumberOfBeasonsInSolutionNotPresent());
        assertFalse(result1.isFlagsNumberOfBeasonsInSolutionPresent());
    }

    @Test
    public void test_constructor002() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_TRUE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsNumberOfBeasonsInSolutionNotPresent());
        assertTrue(result1.isFlagsNumberOfBeasonsInSolutionPresent());
        assertEquals(0x01, result1.getNumberOfBeaconsInSolution());
    }

    @Test
    public void test_constructor003() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsNumberOfBeasonsInViewNotPresent());
        assertFalse(result1.isFlagsNumberOfBeasonsInViewPresent());
    }

    @Test
    public void test_constructor004() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_TRUE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsNumberOfBeasonsInViewNotPresent());
        assertTrue(result1.isFlagsNumberOfBeasonsInViewPresent());
        assertEquals(0x01, result1.getNumberOfBeaconsInView());
    }

    @Test
    public void test_constructor005() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsTimeToFirstFixNotPresent());
        assertFalse(result1.isFlagsTimeToFirstFixPresent());
    }

    @Test
    public void test_constructor006() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_TRUE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsTimeToFirstFixNotPresent());
        assertTrue(result1.isFlagsTimeToFirstFixPresent());
        assertEquals(0x0201, result1.getTimeToFirstFix());
        assertEquals(PositionQuality.TIME_TO_FIRST_FIX_RESOLUTION * 0x0201, result1.getTimeToFirstFixSeconds(), 0);
    }

    @Test
    public void test_constructor007() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsEhpeNotPresent());
        assertFalse(result1.isFlagsEhpePresent());
    }

    @Test
    public void test_constructor008() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_TRUE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEhpeNotPresent());
        assertTrue(result1.isFlagsEhpePresent());
        assertEquals(0x04030201, result1.getEhpe());
        assertEquals(PositionQuality.EHPE_RESOLUTION * 0x04030201, result1.getEhpeMeters(), 0);
    }

    @Test
    public void test_constructor009() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagEvpeNotPresent());
        assertFalse(result1.isFlagEvpePresent());
    }

    @Test
    public void test_constructor010() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_TRUE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagEvpeNotPresent());
        assertTrue(result1.isFlagEvpePresent());
        assertEquals(0x04030201, result1.getEvpe());
        assertEquals(PositionQuality.EHPE_RESOLUTION * 0x04030201, result1.getEvpeMeters(), 0);
    }

    @Test
    public void test_constructor011() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsHdopNotPresent());
        assertFalse(result1.isFlagsHdopPresent());
    }

    @Test
    public void test_constructor012() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_TRUE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsHdopNotPresent());
        assertTrue(result1.isFlagsHdopPresent());
        assertEquals(0x01, result1.getHdop());
        assertEquals(PositionQuality.HDOP_RESOLUTION * 0x01, result1.getHdopWithUnit(), 0);
    }

    @Test
    public void test_constructor013() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsVdopNotPresent());
        assertFalse(result1.isFlagsVdopPresent());
    }

    @Test
    public void test_constructor014() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_TRUE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsVdopNotPresent());
        assertTrue(result1.isFlagsVdopPresent());
        assertEquals(0x01, result1.getVdop());
        assertEquals(PositionQuality.VDOP_RESOLUTION * 0x01, result1.getVdopWithUnit(), 0);
    }

    @Test
    public void test_constructor015() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsPositionStatusNoPosition());
        assertFalse(result1.isFlagsPositionStatusPositionOk());
        assertFalse(result1.isFlagsPositionStatusEstimatedPosition());
        assertFalse(result1.isFlagsPositionStatusLastKnownPosition());
    }

    @Test
    public void test_constructor016() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_POSITION_OK;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsPositionStatusNoPosition());
        assertTrue(result1.isFlagsPositionStatusPositionOk());
        assertFalse(result1.isFlagsPositionStatusEstimatedPosition());
        assertFalse(result1.isFlagsPositionStatusLastKnownPosition());
    }

    @Test
    public void test_constructor017() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_ESTIMATED_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsPositionStatusNoPosition());
        assertFalse(result1.isFlagsPositionStatusPositionOk());
        assertTrue(result1.isFlagsPositionStatusEstimatedPosition());
        assertFalse(result1.isFlagsPositionStatusLastKnownPosition());
    }

    @Test
    public void test_constructor018() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_LAST_KNOWN_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsPositionStatusNoPosition());
        assertFalse(result1.isFlagsPositionStatusPositionOk());
        assertFalse(result1.isFlagsPositionStatusEstimatedPosition());
        assertTrue(result1.isFlagsPositionStatusLastKnownPosition());
    }

    @Test
    public void test_constructor019() {
        byte[] flags = new byte[] { 1 };
        int numberOfBeaconsInSolution = 2;
        int numberOfBeaconsInView = 3;
        int timeToFirstFix = 4;
        long ehpe = 5;
        long evpe = 6;
        int hdop = 7;
        int vdop = 8;

        PositionQuality result1 = new PositionQuality(flags, numberOfBeaconsInSolution, numberOfBeaconsInView, timeToFirstFix, ehpe, evpe, hdop, vdop);
        assertArrayEquals(flags, result1.getFlags());
        assertEquals(numberOfBeaconsInSolution, result1.getNumberOfBeaconsInSolution());
        assertEquals(numberOfBeaconsInView, result1.getNumberOfBeaconsInView());
        assertEquals(timeToFirstFix, result1.getTimeToFirstFix());
        assertEquals(ehpe, result1.getEhpe());
        assertEquals(evpe, result1.getEvpe());
        assertEquals(hdop, result1.getHdop());
        assertEquals(vdop, result1.getVdop());
    }

    @Test
    public void test_parcelable101() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_TRUE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable103() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable104() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_TRUE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable105() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable106() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_TRUE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable107() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable108() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_TRUE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable109() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable110() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_TRUE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable111() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable112() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_TRUE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable113() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable114() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_TRUE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable115() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_NO_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable116() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_POSITION_OK;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable117() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_ESTIMATED_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable118() {
        int flags = PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_SOLUTION_PRESENT_FALSE
                | PositionQuality.FLAGS_NUMBER_OF_BEACONS_IN_VIEW_PRESENT_FALSE
                | PositionQuality.FLAGS_TIME_TO_FIRST_FIX_PRESENT_FALSE
                | PositionQuality.FLAGS_EHPE_PRESENT_FALSE
                | PositionQuality.FLAGS_EVPE_PRESENT_FALSE
                | PositionQuality.FLAGS_HDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_VDOP_PRESENT_FALSE
                | PositionQuality.FLAGS_POSITION_STATUS_LAST_KNOWN_POSITION;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        PositionQuality result1 = new PositionQuality(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
