package org.im97mori.ble.characteristic.u2a4c;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class HIDControlPointTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = HIDControlPoint.HID_CONTROL_POINT_COMMAND_SUSPEND;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[1];
        data[ 0] = HIDControlPoint.HID_CONTROL_POINT_COMMAND_EXIT_SUSPEND;
        data_00002 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        HIDControlPoint result1 = new HIDControlPoint(data);
        assertEquals(HIDControlPoint.HID_CONTROL_POINT_COMMAND_SUSPEND, result1.getHidControlPointCommand());
        assertTrue(result1.isHidControlPointCommandSuspend());
        assertFalse(result1.isHidControlPointCommandExitSuspend());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        HIDControlPoint result1 = new HIDControlPoint(data);
        assertEquals(HIDControlPoint.HID_CONTROL_POINT_COMMAND_EXIT_SUSPEND, result1.getHidControlPointCommand());
        assertFalse(result1.isHidControlPointCommandSuspend());
        assertTrue(result1.isHidControlPointCommandExitSuspend());
    }

    @Test
    public void test_constructor_00003() {
        int hidControlPointCommand = 1;

        HIDControlPoint result1 = new HIDControlPoint(hidControlPointCommand);
        assertEquals(HIDControlPoint.HID_CONTROL_POINT_COMMAND_EXIT_SUSPEND, result1.getHidControlPointCommand());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        HIDControlPoint result1 = new HIDControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        HIDControlPoint result1 = new HIDControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
