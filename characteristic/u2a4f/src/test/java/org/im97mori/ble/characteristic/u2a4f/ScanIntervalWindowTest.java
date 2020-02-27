package org.im97mori.ble.characteristic.u2a4f;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("unused")
public class ScanIntervalWindowTest {

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

        ScanIntervalWindow result1 = new ScanIntervalWindow(data);
        assertEquals(0x0201, result1.getLeScanInterval());
        assertEquals(ScanIntervalWindow.LE_SCAN_INTERVAL_RESOLUTION * 0x0201, result1.getLeScanIntervalMs(), 0);
        assertEquals(0x0403, result1.getLeScanWindow());
        assertEquals(ScanIntervalWindow.LE_SCAN_WINDOW_RESOLUTION * 0x0403, result1.getLeScanWindowMs(), 0);
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ScanIntervalWindow result1 = new ScanIntervalWindow(data);
        assertArrayEquals(data, result1.getBytes());
    }

}