package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.PeripheralConnectionIntervalRange.PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS;
import static org.im97mori.ble.constants.DataType.SHORTENED_LOCAL_NAME_DATA_TYPE;
import static org.im97mori.ble.constants.DataType.PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class PeripheralConnectionIntervalRangeTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE;
        data[2] = (byte) 0xff;
        data[3] = (byte) 0xff;
        data[4] = (byte) 0xff;
        data[5] = (byte) 0xff;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE;
        data[2] = (byte) 0x00;
        data[3] = (byte) 0x00;
        data[4] = (byte) 0x00;
        data[5] = (byte) 0x00;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE;
        data[2] = (byte) 0x06;
        data[3] = (byte) 0x00;
        data[4] = (byte) 0x06;
        data[5] = (byte) 0x00;
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE;
        data[2] = (byte) 0x80;
        data[3] = (byte) 0x0c;
        data[4] = (byte) 0x80;
        data[5] = (byte) 0x0c;
        data_00004 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_1_00001() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertFalse(result1.hasMinimum());
        assertFalse(result1.hasMaximum());
    }

    @Test
    public void test_constructor_1_00002() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertTrue(result1.hasMinimum());
        assertTrue(result1.hasMaximum());
        assertEquals(0, result1.getMinimumValue());
        assertEquals(0, result1.getMaximumValue());
        assertEquals(0 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMinimumValueMillis(), 0);
        assertEquals(0 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMaximumValueMillis(), 0);
    }

    @Test
    public void test_constructor_1_00003() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertTrue(result1.hasMinimum());
        assertTrue(result1.hasMaximum());
        assertEquals(0x0006, result1.getMinimumValue());
        assertEquals(0x0006, result1.getMaximumValue());
        assertEquals(0x0006 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMinimumValueMillis(), 0);
        assertEquals(0x0006 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMaximumValueMillis(), 0);
    }

    @Test
    public void test_constructor_1_00004() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0, data[0]);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertTrue(result1.hasMinimum());
        assertTrue(result1.hasMaximum());
        assertEquals(0x0c80, result1.getMinimumValue());
        assertEquals(0x0c80, result1.getMaximumValue());
        assertEquals(0x0c80 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMinimumValueMillis(), 0);
        assertEquals(0x0c80 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMaximumValueMillis(), 0);
    }
    
    @Test
    public void test_constructor_2_00001() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertFalse(result1.hasMinimum());
        assertFalse(result1.hasMaximum());
    }

    @Test
    public void test_constructor_2_00002() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertTrue(result1.hasMinimum());
        assertTrue(result1.hasMaximum());
        assertEquals(0, result1.getMinimumValue());
        assertEquals(0, result1.getMaximumValue());
        assertEquals(0 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMinimumValueMillis(), 0);
        assertEquals(0 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMaximumValueMillis(), 0);
    }

    @Test
    public void test_constructor_2_00003() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertTrue(result1.hasMinimum());
        assertTrue(result1.hasMaximum());
        assertEquals(0x0006, result1.getMinimumValue());
        assertEquals(0x0006, result1.getMaximumValue());
        assertEquals(0x0006 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMinimumValueMillis(), 0);
        assertEquals(0x0006 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMaximumValueMillis(), 0);
    }

    @Test
    public void test_constructor_2_00004() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertTrue(result1.hasMinimum());
        assertTrue(result1.hasMaximum());
        assertEquals(0x0c80, result1.getMinimumValue());
        assertEquals(0x0c80, result1.getMaximumValue());
        assertEquals(0x0c80 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMinimumValueMillis(), 0);
        assertEquals(0x0c80 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMaximumValueMillis(), 0);
    }

    @Test
    public void test_constructor_3_00001() {
        byte[] data = getData();

		int minimumValue = BLEUtils.createUInt16(data, 2);
		int maximumValue = BLEUtils.createUInt16(data, 4);
        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(minimumValue, maximumValue);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertFalse(result1.hasMinimum());
        assertFalse(result1.hasMaximum());
    }

    @Test
    public void test_constructor_3_00002() {
        byte[] data = getData();

        int minimumValue = BLEUtils.createUInt16(data, 2);
		int maximumValue = BLEUtils.createUInt16(data, 4);
        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(minimumValue, maximumValue);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertTrue(result1.hasMinimum());
        assertTrue(result1.hasMaximum());
        assertEquals(0, result1.getMinimumValue());
        assertEquals(0, result1.getMaximumValue());
        assertEquals(0 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMinimumValueMillis(), 0);
        assertEquals(0 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMaximumValueMillis(), 0);
    }

    @Test
    public void test_constructor_3_00003() {
        byte[] data = getData();

        int minimumValue = BLEUtils.createUInt16(data, 2);
		int maximumValue = BLEUtils.createUInt16(data, 4);
        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(minimumValue, maximumValue);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertTrue(result1.hasMinimum());
        assertTrue(result1.hasMaximum());
        assertEquals(0x0006, result1.getMinimumValue());
        assertEquals(0x0006, result1.getMaximumValue());
        assertEquals(0x0006 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMinimumValueMillis(), 0);
        assertEquals(0x0006 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMaximumValueMillis(), 0);
    }

    @Test
    public void test_constructor_3_00004() {
        byte[] data = getData();

        int minimumValue = BLEUtils.createUInt16(data, 2);
		int maximumValue = BLEUtils.createUInt16(data, 4);
        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(minimumValue, maximumValue);
        assertEquals(5, result1.getLength());
        assertEquals(PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE, result1.getDataType());
        assertTrue(result1.hasMinimum());
        assertTrue(result1.hasMaximum());
        assertEquals(0x0c80, result1.getMinimumValue());
        assertEquals(0x0c80, result1.getMaximumValue());
        assertEquals(0x0c80 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMinimumValueMillis(), 0);
        assertEquals(0x0c80 * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS, result1.getMaximumValueMillis(), 0);
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00004() {
        byte[] data = getData();

        PeripheralConnectionIntervalRange result1 = new PeripheralConnectionIntervalRange(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

}
