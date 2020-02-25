package org.im97mori.ble.characteristic.u2a5d;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.core.SensorLocationUtils;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class SensorLocationTest {

    //@formatter:off
    private static final byte[] data_001;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_OTHER;
        data_001 = data;
    }

    private static final byte[] data_002;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_TOP_OF_SHOE;
        data_002 = data;
    }

    private static final byte[] data_003;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_IN_SHOE;
        data_003 = data;
    }

    private static final byte[] data_004;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_HIP;
        data_004 = data;
    }

    private static final byte[] data_005;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_FRONT_WHEEL;
        data_005 = data;
    }

    private static final byte[] data_006;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_LEFT_CRANK;
        data_006 = data;
    }

    private static final byte[] data_007;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_RIGHT_CRANK;
        data_007 = data;
    }

    private static final byte[] data_008;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_LEFT_PEDAL;
        data_008 = data;
    }

    private static final byte[] data_009;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_RIGHT_PEDAL;
        data_009 = data;
    }

    private static final byte[] data_010;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_FRONT_HUB;
        data_010 = data;
    }

    private static final byte[] data_011;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_REAR_DROPOUT;
        data_011 = data;
    }

    private static final byte[] data_012;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_CHAINSTAY;
        data_012 = data;
    }

    private static final byte[] data_013;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_REAR_WHEEL;
        data_013 = data;
    }

    private static final byte[] data_014;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_REAR_HUB;
        data_014 = data;
    }

    private static final byte[] data_015;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_CHEST;
        data_015 = data;
    }

    private static final byte[] data_016;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_SPIDER;
        data_016 = data;
    }

    private static final byte[] data_017;
    static {
        byte[] data = new byte[1];
        data[ 0] = SensorLocationUtils.SENSOR_LOCATION_CHAIN_RING;
        data_017 = data;
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
    public void test_constructor_001() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_OTHER, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_002() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_TOP_OF_SHOE, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_003() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_IN_SHOE, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_004() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_HIP, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_005() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_FRONT_WHEEL, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_006() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_LEFT_CRANK, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_007() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_RIGHT_CRANK, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_008() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_LEFT_PEDAL, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_009() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_RIGHT_PEDAL, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_010() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_FRONT_HUB, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_011() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_REAR_DROPOUT, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_012() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_CHAINSTAY, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_013() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_REAR_WHEEL, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_014() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_REAR_HUB, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_015() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_CHEST, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_016() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_SPIDER, result1.getSensorLocation());
    }

    @Test
    public void test_constructor_017() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertEquals(SensorLocationUtils.SENSOR_LOCATION_CHAIN_RING, result1.getSensorLocation());
    }

    @Test
    public void test_parcelable_2_001() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_002() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_003() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_004() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_005() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_006() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_007() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_008() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_009() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_010() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_011() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_012() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_013() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_014() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_015() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_016() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_017() {
        byte[] data = getData();

        SensorLocation result1 = new SensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
