package org.im97mori.ble.advertising;

import static org.im97mori.ble.BLEConstants.APPEARANCE_DESCRIPTION_MAP;
import static org.im97mori.ble.BLEConstants.APPEARANCE_VALUE_MAP;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_ADVERTISING_INTERVAL;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_APPEARANCE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

@SuppressWarnings("unused")
public class AppearanceTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        Map.Entry<Integer, String> entry = APPEARANCE_VALUE_MAP.entrySet().iterator().next();
        int key = entry.getKey();
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = DATA_TYPE_APPEARANCE;
        data[2] = (byte) key;
        data[3] = (byte) (key >> 8);
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

        Appearance result1 = new Appearance(data, 0, data[0]);
        assertEquals(3, result1.getLength());
        assertEquals(DATA_TYPE_APPEARANCE, result1.getDataType());
        int key = (data[2] & 0xff) | ((data[3] & 0xff) << 8);
        assertEquals(key, result1.getAppearanceKey());
        assertEquals(APPEARANCE_VALUE_MAP.get(key), result1.getAppearanceValue());
        assertEquals(APPEARANCE_DESCRIPTION_MAP.get(key), result1.getAppearanceDescription());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        Appearance result1 = new Appearance(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

}
