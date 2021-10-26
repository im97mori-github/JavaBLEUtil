package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SHORTENED_LOCAL_NAME_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

@SuppressWarnings("unused")
public class ShortenedLocalNameTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        String name = "shortened local name";
        byte[] utf8data = name.getBytes();
        byte[] data = new byte[utf8data.length + 2];
        data[0] = (byte) (utf8data.length + 1);
        data[1] = SHORTENED_LOCAL_NAME_DATA_TYPE;
        System.arraycopy(utf8data, 0, data, 2, utf8data.length);

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

        ShortenedLocalName result1 = new ShortenedLocalName(data, 0, data[0]);
        assertEquals(data[0], result1.getLength());
        assertEquals(SHORTENED_LOCAL_NAME_DATA_TYPE, result1.getDataType());
        assertEquals(new String(data, 2, data.length - 2), result1.getShortenedLocalName());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ShortenedLocalName result1 = new ShortenedLocalName(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

}
