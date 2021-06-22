package org.im97mori.ble.advertising;

import static org.im97mori.ble.BLEUtils.BASE_UUID;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_APPEARANCE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.UUID;

import org.im97mori.ble.constants.AppearanceUUID;
import org.junit.Test;

@SuppressWarnings("unused")
public class AppearanceTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        Map.Entry<UUID, String> entry = AppearanceUUID.APPEARANCE_SUB_CATEGORY_MAPPING_128.entrySet().iterator().next();
        UUID uuid = entry.getKey();
        long msb = uuid.getMostSignificantBits();
        msb = msb >> 32;
        byte[] data = new byte[4];
        data[0] = 3;
        data[1] = DATA_TYPE_APPEARANCE;
        data[2] = (byte) msb;
        data[3] = (byte) (msb >> 8);
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
        long key = (data[2] & 0xff) | ((data[3] & 0xff) << 8);
        assertEquals(key, result1.getAppearanceKey());
        UUID baseuuid = BASE_UUID;
        long lsb = baseuuid.getLeastSignificantBits();
        long msb = baseuuid.getMostSignificantBits();
        key = key << 32;
        assertEquals(AppearanceUUID.APPEARANCE_SUB_CATEGORY_MAPPING_128.get(new UUID(msb | key, lsb)), result1.getAppearanceSubCategory());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        Appearance result1 = new Appearance(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

}
