package org.im97mori.ble.characteristic.u2abc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.characteristic.core.TDSControlPointUtils;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class TDSControlPointIndicationTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_SUCCESS;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[3];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_SUCCESS;
        data[ 2] = 0x01;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[4];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_SUCCESS;
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00003 = data;
    }

    private static final byte[] data_00101;
    static {
        byte[] data = new byte[2];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_OP_CODE_NOT_SUPPORTED;
        data_00101 = data;
    }

    private static final byte[] data_00102;
    static {
        byte[] data = new byte[3];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_OP_CODE_NOT_SUPPORTED;
        data[ 2] = 0x01;
        data_00102 = data;
    }

    private static final byte[] data_00103;
    static {
        byte[] data = new byte[4];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_OP_CODE_NOT_SUPPORTED;
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00103 = data;
    }

    private static final byte[] data_00201;
    static {
        byte[] data = new byte[2];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_INVALID_PARAMETER;
        data_00201 = data;
    }

    private static final byte[] data_00202;
    static {
        byte[] data = new byte[3];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_INVALID_PARAMETER;
        data[ 2] = 0x01;
        data_00202 = data;
    }

    private static final byte[] data_00203;
    static {
        byte[] data = new byte[4];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_INVALID_PARAMETER;
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00203 = data;
    }

    private static final byte[] data_00301;
    static {
        byte[] data = new byte[2];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_UNSUPPORTED_ORGANIZATION_ID;
        data_00301 = data;
    }

    private static final byte[] data_00302;
    static {
        byte[] data = new byte[3];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_UNSUPPORTED_ORGANIZATION_ID;
        data[ 2] = 0x01;
        data_00302 = data;
    }

    private static final byte[] data_00303;
    static {
        byte[] data = new byte[4];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_UNSUPPORTED_ORGANIZATION_ID;
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00303 = data;
    }

    private static final byte[] data_00401;
    static {
        byte[] data = new byte[2];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_OPERATION_FAILED;
        data_00401 = data;
    }

    private static final byte[] data_00402;
    static {
        byte[] data = new byte[3];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_OPERATION_FAILED;
        data[ 2] = 0x01;
        data_00402 = data;
    }

    private static final byte[] data_00403;
    static {
        byte[] data = new byte[4];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TDSControlPointUtils.RESULT_CODE_OPERATION_FAILED;
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00403 = data;
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

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_SUCCESS, result1.getResultCode());
        assertArrayEquals(new byte[0], result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_SUCCESS, result1.getResultCode());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 3), result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00003() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_SUCCESS, result1.getResultCode());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 4), result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00101() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_OP_CODE_NOT_SUPPORTED, result1.getResultCode());
        assertArrayEquals(new byte[0], result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00102() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_OP_CODE_NOT_SUPPORTED, result1.getResultCode());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 3), result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00103() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_OP_CODE_NOT_SUPPORTED, result1.getResultCode());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 4), result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00201() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_INVALID_PARAMETER, result1.getResultCode());
        assertArrayEquals(new byte[0], result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00202() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_INVALID_PARAMETER, result1.getResultCode());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 3), result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00203() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_INVALID_PARAMETER, result1.getResultCode());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 4), result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00301() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_UNSUPPORTED_ORGANIZATION_ID, result1.getResultCode());
        assertArrayEquals(new byte[0], result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00302() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_UNSUPPORTED_ORGANIZATION_ID, result1.getResultCode());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 3), result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00303() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_UNSUPPORTED_ORGANIZATION_ID, result1.getResultCode());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 4), result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00401() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_OPERATION_FAILED, result1.getResultCode());
        assertArrayEquals(new byte[0], result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00402() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_OPERATION_FAILED, result1.getResultCode());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 3), result1.getResponseParameter());
    }

    @Test
    public void test_constructor_00403() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getRequestedOpCode());
        assertEquals(TDSControlPointUtils.RESULT_CODE_OPERATION_FAILED, result1.getResultCode());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 4), result1.getResponseParameter());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00101() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00102() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00103() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00201() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00202() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00203() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00301() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00302() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00303() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00401() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00402() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00403() {
        byte[] data = getData();

        TDSControlPointIndication result1 = new TDSControlPointIndication(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
