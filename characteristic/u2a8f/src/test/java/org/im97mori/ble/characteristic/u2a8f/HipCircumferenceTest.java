package org.im97mori.ble.characteristic.u2a8f;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class HipCircumferenceTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        HipCircumference result1 = new HipCircumference(data);
        assertEquals(0x0201, result1.getHipCircumference());
        assertEquals(HipCircumference.HIP_CIRCUMFERENCE_RESOLUTION * 0x0201, result1.getHipCircumferenceMeters(), 0);
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        //@formatter:on

        HipCircumference result1 = new HipCircumference(data);
        assertEquals(0xffff, result1.getHipCircumference());
        assertEquals(HipCircumference.HIP_CIRCUMFERENCE_RESOLUTION * 0xffff, result1.getHipCircumferenceMeters(), 0);
    }

    @Test
    public void test_constructor003() {
        int hipCircumference = 1;

        HipCircumference result1 = new HipCircumference(hipCircumference);
        assertEquals(hipCircumference, result1.getHipCircumference());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        HipCircumference result1 = new HipCircumference(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
