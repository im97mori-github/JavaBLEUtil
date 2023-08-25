package org.im97mori.ble.characteristic.u2ab7;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class HTTPHeadersTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = 'a';
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        data[ 0] = 'a';
        data[ 1] = 'b';
        data_00002 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        HTTPHeaders result1 = new HTTPHeaders(data);
        assertEquals("a", result1.getHttpHeaders());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        HTTPHeaders result1 = new HTTPHeaders(data);
        assertEquals("ab", result1.getHttpHeaders());
    }

    @Test
    public void test_constructor_00003() {
        String httpHeaders = "1";

        HTTPHeaders result1 = new HTTPHeaders(httpHeaders);
        assertEquals(httpHeaders, result1.getHttpHeaders());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        HTTPHeaders result1 = new HTTPHeaders(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        HTTPHeaders result1 = new HTTPHeaders(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
