package org.im97mori.ble.characteristic.u2aba;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class HTTPControlPointTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTP_GET_REQUEST;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTP_HEAD_REQUEST;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTP_POST_REQUEST;
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTP_PUT_REQUEST;
        data_00004 = data;
    }

    private static final byte[] data_00005;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTP_DELETE_REQUEST;
        data_00005 = data;
    }

    private static final byte[] data_00006;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTPS_GET_REQUEST;
        data_00006 = data;
    }

    private static final byte[] data_00007;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTPS_HEAD_REQUEST;
        data_00007 = data;
    }

    private static final byte[] data_00008;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTPS_POST_REQUEST;
        data_00008 = data;
    }

    private static final byte[] data_00009;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTPS_PUT_REQUEST;
        data_00009 = data;
    }

    private static final byte[] data_00010;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTPS_DELETE_REQUEST;
        data_00010 = data;
    }

    private static final byte[] data_00011;
    static {
        byte[] data = new byte[1];
        data[ 0] = HTTPControlPoint.OP_CODE_HTTP_REQUEST_CANCEL;
        data_00011 = data;
    }

    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTP_GET_REQUEST, result1.getOpCode());
        assertTrue(result1.isOpCodeHttpGetRequest());
        assertFalse(result1.isOpCodeHttpHeadRequest());
        assertFalse(result1.isOpCodeHttpPostRequest());
        assertFalse(result1.isOpCodeHttpPutRequest());
        assertFalse(result1.isOpCodeHttpDeleteRequest());
        assertFalse(result1.isOpCodeHttpsGetRequest());
        assertFalse(result1.isOpCodeHttpsHeadRequest());
        assertFalse(result1.isOpCodeHttpsPostRequest());
        assertFalse(result1.isOpCodeHttpsPutRequest());
        assertFalse(result1.isOpCodeHttpsDeleteRequest());
        assertFalse(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTP_HEAD_REQUEST, result1.getOpCode());
        assertFalse(result1.isOpCodeHttpGetRequest());
        assertTrue(result1.isOpCodeHttpHeadRequest());
        assertFalse(result1.isOpCodeHttpPostRequest());
        assertFalse(result1.isOpCodeHttpPutRequest());
        assertFalse(result1.isOpCodeHttpDeleteRequest());
        assertFalse(result1.isOpCodeHttpsGetRequest());
        assertFalse(result1.isOpCodeHttpsHeadRequest());
        assertFalse(result1.isOpCodeHttpsPostRequest());
        assertFalse(result1.isOpCodeHttpsPutRequest());
        assertFalse(result1.isOpCodeHttpsDeleteRequest());
        assertFalse(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00003() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTP_POST_REQUEST, result1.getOpCode());
        assertFalse(result1.isOpCodeHttpGetRequest());
        assertFalse(result1.isOpCodeHttpHeadRequest());
        assertTrue(result1.isOpCodeHttpPostRequest());
        assertFalse(result1.isOpCodeHttpPutRequest());
        assertFalse(result1.isOpCodeHttpDeleteRequest());
        assertFalse(result1.isOpCodeHttpsGetRequest());
        assertFalse(result1.isOpCodeHttpsHeadRequest());
        assertFalse(result1.isOpCodeHttpsPostRequest());
        assertFalse(result1.isOpCodeHttpsPutRequest());
        assertFalse(result1.isOpCodeHttpsDeleteRequest());
        assertFalse(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00004() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTP_PUT_REQUEST, result1.getOpCode());
        assertFalse(result1.isOpCodeHttpGetRequest());
        assertFalse(result1.isOpCodeHttpHeadRequest());
        assertFalse(result1.isOpCodeHttpPostRequest());
        assertTrue(result1.isOpCodeHttpPutRequest());
        assertFalse(result1.isOpCodeHttpDeleteRequest());
        assertFalse(result1.isOpCodeHttpsGetRequest());
        assertFalse(result1.isOpCodeHttpsHeadRequest());
        assertFalse(result1.isOpCodeHttpsPostRequest());
        assertFalse(result1.isOpCodeHttpsPutRequest());
        assertFalse(result1.isOpCodeHttpsDeleteRequest());
        assertFalse(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00005() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTP_DELETE_REQUEST, result1.getOpCode());
        assertFalse(result1.isOpCodeHttpGetRequest());
        assertFalse(result1.isOpCodeHttpHeadRequest());
        assertFalse(result1.isOpCodeHttpPostRequest());
        assertFalse(result1.isOpCodeHttpPutRequest());
        assertTrue(result1.isOpCodeHttpDeleteRequest());
        assertFalse(result1.isOpCodeHttpsGetRequest());
        assertFalse(result1.isOpCodeHttpsHeadRequest());
        assertFalse(result1.isOpCodeHttpsPostRequest());
        assertFalse(result1.isOpCodeHttpsPutRequest());
        assertFalse(result1.isOpCodeHttpsDeleteRequest());
        assertFalse(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00006() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTPS_GET_REQUEST, result1.getOpCode());
        assertFalse(result1.isOpCodeHttpGetRequest());
        assertFalse(result1.isOpCodeHttpHeadRequest());
        assertFalse(result1.isOpCodeHttpPostRequest());
        assertFalse(result1.isOpCodeHttpPutRequest());
        assertFalse(result1.isOpCodeHttpDeleteRequest());
        assertTrue(result1.isOpCodeHttpsGetRequest());
        assertFalse(result1.isOpCodeHttpsHeadRequest());
        assertFalse(result1.isOpCodeHttpsPostRequest());
        assertFalse(result1.isOpCodeHttpsPutRequest());
        assertFalse(result1.isOpCodeHttpsDeleteRequest());
        assertFalse(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00007() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTPS_HEAD_REQUEST, result1.getOpCode());
        assertFalse(result1.isOpCodeHttpGetRequest());
        assertFalse(result1.isOpCodeHttpHeadRequest());
        assertFalse(result1.isOpCodeHttpPostRequest());
        assertFalse(result1.isOpCodeHttpPutRequest());
        assertFalse(result1.isOpCodeHttpDeleteRequest());
        assertFalse(result1.isOpCodeHttpsGetRequest());
        assertTrue(result1.isOpCodeHttpsHeadRequest());
        assertFalse(result1.isOpCodeHttpsPostRequest());
        assertFalse(result1.isOpCodeHttpsPutRequest());
        assertFalse(result1.isOpCodeHttpsDeleteRequest());
        assertFalse(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00008() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTPS_POST_REQUEST, result1.getOpCode());
        assertFalse(result1.isOpCodeHttpGetRequest());
        assertFalse(result1.isOpCodeHttpHeadRequest());
        assertFalse(result1.isOpCodeHttpPostRequest());
        assertFalse(result1.isOpCodeHttpPutRequest());
        assertFalse(result1.isOpCodeHttpDeleteRequest());
        assertFalse(result1.isOpCodeHttpsGetRequest());
        assertFalse(result1.isOpCodeHttpsHeadRequest());
        assertTrue(result1.isOpCodeHttpsPostRequest());
        assertFalse(result1.isOpCodeHttpsPutRequest());
        assertFalse(result1.isOpCodeHttpsDeleteRequest());
        assertFalse(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00009() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTPS_PUT_REQUEST, result1.getOpCode());
        assertFalse(result1.isOpCodeHttpGetRequest());
        assertFalse(result1.isOpCodeHttpHeadRequest());
        assertFalse(result1.isOpCodeHttpPostRequest());
        assertFalse(result1.isOpCodeHttpPutRequest());
        assertFalse(result1.isOpCodeHttpDeleteRequest());
        assertFalse(result1.isOpCodeHttpsGetRequest());
        assertFalse(result1.isOpCodeHttpsHeadRequest());
        assertFalse(result1.isOpCodeHttpsPostRequest());
        assertTrue(result1.isOpCodeHttpsPutRequest());
        assertFalse(result1.isOpCodeHttpsDeleteRequest());
        assertFalse(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00010() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTPS_DELETE_REQUEST, result1.getOpCode());
        assertFalse(result1.isOpCodeHttpGetRequest());
        assertFalse(result1.isOpCodeHttpHeadRequest());
        assertFalse(result1.isOpCodeHttpPostRequest());
        assertFalse(result1.isOpCodeHttpPutRequest());
        assertFalse(result1.isOpCodeHttpDeleteRequest());
        assertFalse(result1.isOpCodeHttpsGetRequest());
        assertFalse(result1.isOpCodeHttpsHeadRequest());
        assertFalse(result1.isOpCodeHttpsPostRequest());
        assertFalse(result1.isOpCodeHttpsPutRequest());
        assertTrue(result1.isOpCodeHttpsDeleteRequest());
        assertFalse(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00011() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertEquals(HTTPControlPoint.OP_CODE_HTTP_REQUEST_CANCEL, result1.getOpCode());
        assertFalse(result1.isOpCodeHttpGetRequest());
        assertFalse(result1.isOpCodeHttpHeadRequest());
        assertFalse(result1.isOpCodeHttpPostRequest());
        assertFalse(result1.isOpCodeHttpPutRequest());
        assertFalse(result1.isOpCodeHttpDeleteRequest());
        assertFalse(result1.isOpCodeHttpsGetRequest());
        assertFalse(result1.isOpCodeHttpsHeadRequest());
        assertFalse(result1.isOpCodeHttpsPostRequest());
        assertFalse(result1.isOpCodeHttpsPutRequest());
        assertFalse(result1.isOpCodeHttpsDeleteRequest());
        assertTrue(result1.isOpCodeHttpRequestCancel());
    }

    @Test
    public void test_constructor_00012() {
        int opCode = 1;

        HTTPControlPoint result1 = new HTTPControlPoint(opCode);
        assertEquals(opCode, result1.getOpCode());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00004() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00005() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00006() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00007() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00008() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00009() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00010() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00011() {
        byte[] data = getData();

        HTTPControlPoint result1 = new HTTPControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
