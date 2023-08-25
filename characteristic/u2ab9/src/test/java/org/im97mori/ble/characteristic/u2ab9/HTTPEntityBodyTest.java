package org.im97mori.ble.characteristic.u2ab9;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class HTTPEntityBodyTest extends TestBase {

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

        HTTPEntityBody result1 = new HTTPEntityBody(data);
        assertEquals("a", result1.getHttpEntityBody());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        HTTPEntityBody result1 = new HTTPEntityBody(data);
        assertEquals("ab", result1.getHttpEntityBody());
    }

    @Test
    public void test_constructor_00003() {
        String httpEntityBody = "1";

        HTTPEntityBody result1 = new HTTPEntityBody(httpEntityBody);
        assertEquals(httpEntityBody, result1.getHttpEntityBody());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        HTTPEntityBody result1 = new HTTPEntityBody(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        HTTPEntityBody result1 = new HTTPEntityBody(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
