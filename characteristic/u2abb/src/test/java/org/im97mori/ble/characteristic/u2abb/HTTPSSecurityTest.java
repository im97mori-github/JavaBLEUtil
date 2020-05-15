package org.im97mori.ble.characteristic.u2abb;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

@SuppressWarnings({ "unused" })
public class HTTPSSecurityTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPSSecurity.HTTPS_SECURITY_FALSE;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPSSecurity.HTTPS_SECURITY_TRUE;
        data_00002 = data;
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

        HTTPSSecurity result1 = new HTTPSSecurity(data);
        assertEquals(HTTPSSecurity.HTTPS_SECURITY_FALSE, result1.getHttpsSecurity());
        assertTrue(result1.isHttpsSecurityFalse());
        assertFalse(result1.isHttpsSecurityTrue());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        HTTPSSecurity result1 = new HTTPSSecurity(data);
        assertEquals(HTTPSSecurity.HTTPS_SECURITY_TRUE, result1.getHttpsSecurity());
        assertFalse(result1.isHttpsSecurityFalse());
        assertTrue(result1.isHttpsSecurityTrue());
    }

    @Test
    public void test_constructor_00003() {
        int httpsSecurity = 1;

        HTTPSSecurity result1 = new HTTPSSecurity(httpsSecurity);
        assertEquals(httpsSecurity, result1.getHttpsSecurity());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        HTTPSSecurity result1 = new HTTPSSecurity(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        HTTPSSecurity result1 = new HTTPSSecurity(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
