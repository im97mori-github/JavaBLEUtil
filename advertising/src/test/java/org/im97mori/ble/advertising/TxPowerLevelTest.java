package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_PERIPHERAL_CONNECTION_INTERVAL_RANGE;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_TX_POWER_LEVEL;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("unused")
public class TxPowerLevelTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = DATA_TYPE_TX_POWER_LEVEL;
        data[2] = -127;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = DATA_TYPE_TX_POWER_LEVEL;
        data[2] = 127;
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

        TxPowerLevel result1 = new TxPowerLevel(data, 0, data[0]);
        assertEquals(2, result1.getLength());
        assertEquals(DATA_TYPE_TX_POWER_LEVEL, result1.getDataType());
        assertEquals(-127, result1.getTxPowerLevel());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        TxPowerLevel result1 = new TxPowerLevel(data, 0, data[0]);
        assertEquals(2, result1.getLength());
        assertEquals(DATA_TYPE_TX_POWER_LEVEL, result1.getDataType());
        assertEquals(127, result1.getTxPowerLevel());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        TxPowerLevel result1 = new TxPowerLevel(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        TxPowerLevel result1 = new TxPowerLevel(data, 0, data[0]);
        assertArrayEquals(data, result1.getBytes());
    }

}
