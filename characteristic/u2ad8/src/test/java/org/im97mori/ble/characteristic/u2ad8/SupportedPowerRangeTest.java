package org.im97mori.ble.characteristic.u2ad8;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("unused")
public class SupportedPowerRangeTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
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

        SupportedPowerRange result1 = new SupportedPowerRange(data);
        assertEquals(0x0201, result1.getMinimumPower());
        assertEquals(0x0403, result1.getMaximumPower());
        assertEquals(0x0605, result1.getMinimumIncrement());
    }

    @Test
    public void test_constructor_00002() {
        int minimumPower = 1;
        int maximumPower = 2;
        int minimumIncrement = 3;

        SupportedPowerRange result1 = new SupportedPowerRange(minimumPower, maximumPower, minimumIncrement);
        assertEquals(minimumPower, result1.getMinimumPower());
        assertEquals(maximumPower, result1.getMaximumPower());
        assertEquals(minimumIncrement, result1.getMinimumIncrement());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        SupportedPowerRange result1 = new SupportedPowerRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
