package org.im97mori.ble.characteristic;

import static org.junit.Assert.assertArrayEquals;

import org.im97mori.ble.characteristic.u2a22.BootKeyboardInputReport;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class BootKeyboardInputReportTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data_00002 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        BootKeyboardInputReport result1 = new BootKeyboardInputReport(data);
        assertArrayEquals(data, result1.getBootKeyboardInputReportValue());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        BootKeyboardInputReport result1 = new BootKeyboardInputReport(data);
        assertArrayEquals(data, result1.getBootKeyboardInputReportValue());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        BootKeyboardInputReport result1 = new BootKeyboardInputReport(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        BootKeyboardInputReport result1 = new BootKeyboardInputReport(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
