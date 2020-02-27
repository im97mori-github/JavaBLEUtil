package org.im97mori.ble.characteristic.u2a53;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

@SuppressWarnings({"unused"})
public class RSCMeasurementTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[4];
        data[ 0] = RSCMeasurement.FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_FALSE
                | RSCMeasurement.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RSCMeasurement.FLAGS_WALKING_OR_RUNNING_STATUS_BITS_WALKING;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[6];
        data[ 0] = RSCMeasurement.FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_TRUE
                | RSCMeasurement.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RSCMeasurement.FLAGS_WALKING_OR_RUNNING_STATUS_BITS_WALKING;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data_00002 = data;
    }

    private static final byte[] data_00101;
    static {
        byte[] data = new byte[4];
        data[ 0] = RSCMeasurement.FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_FALSE
                | RSCMeasurement.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RSCMeasurement.FLAGS_WALKING_OR_RUNNING_STATUS_BITS_WALKING;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data_00101 = data;
    }

    private static final byte[] data_00102;
    static {
        byte[] data = new byte[8];
        data[ 0] = RSCMeasurement.FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_FALSE
                | RSCMeasurement.FLAGS_TOTAL_DISTANCE_PRESENT_TRUE
                | RSCMeasurement.FLAGS_WALKING_OR_RUNNING_STATUS_BITS_WALKING;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data_00102 = data;
    }

    private static final byte[] data_00201;
    static {
        byte[] data = new byte[4];
        data[ 0] = RSCMeasurement.FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_FALSE
                | RSCMeasurement.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RSCMeasurement.FLAGS_WALKING_OR_RUNNING_STATUS_BITS_WALKING;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data_00201 = data;
    }

    private static final byte[] data_00202;
    static {
        byte[] data = new byte[4];
        data[ 0] = RSCMeasurement.FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_FALSE
                | RSCMeasurement.FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
                | RSCMeasurement.FLAGS_WALKING_OR_RUNNING_STATUS_BITS_RUNNING;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data_00202 = data;
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

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertEquals(data[0], result1.getFlags());
        assertTrue(result1.isFlagsInstantaneousStrideLengthNotPresent());
        assertFalse(result1.isFlagsInstantaneousStrideLengthPresent());
        assertEquals(0x0201, result1.getInstantaneousSpeed());
        assertEquals(0x03, result1.getInstantaneousCadence());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertEquals(data[0], result1.getFlags());
        assertFalse(result1.isFlagsInstantaneousStrideLengthNotPresent());
        assertTrue(result1.isFlagsInstantaneousStrideLengthPresent());
        assertEquals(0x0201, result1.getInstantaneousSpeed());
        assertEquals(0x03, result1.getInstantaneousCadence());
        assertEquals(0x0504, result1.getInstantaneousStrideLength());
    }

    @Test
    public void test_constructor_00101() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertEquals(data[0], result1.getFlags());
        assertTrue(result1.isFlagsTotalDistanceNotPresent());
        assertFalse(result1.isFlagsTotalDistancePresent());
        assertEquals(0x0201, result1.getInstantaneousSpeed());
        assertEquals(0x03, result1.getInstantaneousCadence());
    }

    @Test
    public void test_constructor_00102() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertEquals(data[0], result1.getFlags());
        assertFalse(result1.isFlagsTotalDistanceNotPresent());
        assertTrue(result1.isFlagsTotalDistancePresent());
        assertEquals(0x0201, result1.getInstantaneousSpeed());
        assertEquals(0x03, result1.getInstantaneousCadence());
        assertEquals(0x07060504L, result1.getTotalDistance());
    }

    @Test
    public void test_constructor_00201() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertEquals(data[0], result1.getFlags());
        assertTrue(result1.isFlagsWalkingOrRunningStatusBitsWalking());
        assertFalse(result1.isFlagsWalkingOrRunningStatusBitsRunning());
        assertEquals(0x0201, result1.getInstantaneousSpeed());
        assertEquals(0x03, result1.getInstantaneousCadence());
    }

    @Test
    public void test_constructor_00202() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertEquals(data[0], result1.getFlags());
        assertFalse(result1.isFlagsWalkingOrRunningStatusBitsWalking());
        assertTrue(result1.isFlagsWalkingOrRunningStatusBitsRunning());
        assertEquals(0x0201, result1.getInstantaneousSpeed());
        assertEquals(0x03, result1.getInstantaneousCadence());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00101() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00102() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00201() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00202() {
        byte[] data = getData();

        RSCMeasurement result1 = new RSCMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
