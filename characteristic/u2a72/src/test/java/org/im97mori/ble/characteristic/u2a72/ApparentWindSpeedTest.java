package org.im97mori.ble.characteristic.u2a72;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings({ "unused" })
public class ApparentWindSpeedTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
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

        ApparentWindSpeed result1 = new ApparentWindSpeed(data);
        assertEquals(0x0201, result1.getApparentWindSpeed());
        assertEquals(ApparentWindSpeed.APPARENT_WIND_SPEED_RESOLUTION * 0x0201, result1.getApparentWindSpeedMetersPerSecond(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int apparentWindSpeed = 1;

        ApparentWindSpeed result1 = new ApparentWindSpeed(apparentWindSpeed);
        assertEquals(apparentWindSpeed, result1.getApparentWindSpeed());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ApparentWindSpeed result1 = new ApparentWindSpeed(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
