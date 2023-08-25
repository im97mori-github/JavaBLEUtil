package org.im97mori.ble.characteristic.u2a4f;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class ScanIntervalWindowTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data_00001 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        ScanIntervalWindow result1 = new ScanIntervalWindow(data);
        assertEquals(0x0201, result1.getLeScanInterval());
        assertEquals(ScanIntervalWindow.LE_SCAN_INTERVAL_RESOLUTION * 0x0201, result1.getLeScanIntervalMs(), 0);
        assertEquals(0x0403, result1.getLeScanWindow());
        assertEquals(ScanIntervalWindow.LE_SCAN_WINDOW_RESOLUTION * 0x0403, result1.getLeScanWindowMs(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int leScanInterval = 1;
        int leScanWindow = 2;

        ScanIntervalWindow result1 = new ScanIntervalWindow(leScanInterval, leScanWindow);
        assertEquals(leScanInterval, result1.getLeScanInterval());
        assertEquals(leScanWindow, result1.getLeScanWindow());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ScanIntervalWindow result1 = new ScanIntervalWindow(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
