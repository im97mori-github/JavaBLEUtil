package org.im97mori.ble.characteristic.u2a73;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings({ "unused" })
public class ApparentWindDirectionTest {

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

        ApparentWindDirection result1 = new ApparentWindDirection(data);
        assertEquals(0x0201, result1.getApparentWindDirection());
        assertEquals(ApparentWindDirection.APPARENT_WIND_DIRECTION_RESOLUTION * 0x0201, result1.getApparentWindDirectionDegrees(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int apparentWindDirection = 1;

        ApparentWindDirection result1 = new ApparentWindDirection(apparentWindDirection);
        assertEquals(apparentWindDirection, result1.getApparentWindDirection());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ApparentWindDirection result1 = new ApparentWindDirection(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
