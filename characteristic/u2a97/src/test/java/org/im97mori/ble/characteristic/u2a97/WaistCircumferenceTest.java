package org.im97mori.ble.characteristic.u2a97;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class WaistCircumferenceTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        WaistCircumference result1 = new WaistCircumference(data);
        assertEquals(0x0201, result1.getWaistCircumference());
        assertEquals(WaistCircumference.WAIST_CIRCUMFERENCE_RESOLUTION * 0x0201, result1.getWaistCircumferenceMeters(), 0);
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        //@formatter:on

        WaistCircumference result1 = new WaistCircumference(data);
        assertEquals(0xffff, result1.getWaistCircumference());
        assertEquals(WaistCircumference.WAIST_CIRCUMFERENCE_RESOLUTION * 0xffff, result1.getWaistCircumferenceMeters(), 0);
    }

    @Test
    public void test_constructor003() {
        int waistCircumference = 1;

        WaistCircumference result1 = new WaistCircumference(waistCircumference);
        assertEquals(waistCircumference, result1.getWaistCircumference());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        WaistCircumference result1 = new WaistCircumference(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
