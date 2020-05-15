package org.im97mori.ble.characteristic.u2abc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.TransportDiscoveryServiceUtils;
import org.im97mori.ble.characteristic.core.TDSControlPointUtils;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class TDSControlPointTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TransportDiscoveryServiceUtils.ORGANIZATION_ID_BLUETOOTH_SIG;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[3];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TransportDiscoveryServiceUtils.ORGANIZATION_ID_WIFI_ALLICANCE_NEIGHBOR_AWARENESS_NETWORKING;
        data[ 2] = 0x01;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[4];
        data[ 0] = TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT;
        data[ 1] = TransportDiscoveryServiceUtils.ORGANIZATION_ID_WIFI_ALLIANCE_SERVICE_ADVERTISEMENT;
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data_00003 = data;
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

        TDSControlPoint result1 = new TDSControlPoint(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getOpCode());
        assertEquals(TransportDiscoveryServiceUtils.ORGANIZATION_ID_BLUETOOTH_SIG, result1.getOrganizationId());
        assertArrayEquals(new byte[0], result1.getParameter());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        TDSControlPoint result1 = new TDSControlPoint(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getOpCode());
        assertEquals(TransportDiscoveryServiceUtils.ORGANIZATION_ID_WIFI_ALLICANCE_NEIGHBOR_AWARENESS_NETWORKING, result1.getOrganizationId());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 3), result1.getParameter());
    }

    @Test
    public void test_constructor_00003() {
        byte[] data = getData();

        TDSControlPoint result1 = new TDSControlPoint(data);
        assertEquals(TDSControlPointUtils.OP_CODE_ACTIVATE_TRANSPORT, result1.getOpCode());
        assertEquals(TransportDiscoveryServiceUtils.ORGANIZATION_ID_WIFI_ALLIANCE_SERVICE_ADVERTISEMENT, result1.getOrganizationId());
        assertArrayEquals(Arrays.copyOfRange(data, 2, 4), result1.getParameter());
    }

    public void test_constructor_00004() {
        int opCode = 1;
        int organizationId = 2;
        byte[] parameter = new byte[] { 3 };

        TDSControlPoint result1 = new TDSControlPoint(opCode, organizationId, parameter);
        assertEquals(opCode, result1.getOpCode());
        assertEquals(organizationId, result1.getOrganizationId());
        assertArrayEquals(parameter, result1.getParameter());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        TDSControlPoint result1 = new TDSControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        TDSControlPoint result1 = new TDSControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00003() {
        byte[] data = getData();

        TDSControlPoint result1 = new TDSControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
