package org.im97mori.ble.characteristic.u2a56;

import static org.junit.Assert.assertArrayEquals;

import org.im97mori.ble.characteristic.core.AutomationIoUtils;
import org.junit.Test;

public class DigitalTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AutomationIoUtils.DIGITAL_INACTIVE;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AutomationIoUtils.DIGITAL_ACTIVE;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AutomationIoUtils.DIGITAL_TRI_STATE;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AutomationIoUtils.DIGITAL_OUTPUT_STATE;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AutomationIoUtils.DIGITAL_INACTIVE << 2;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor102() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AutomationIoUtils.DIGITAL_ACTIVE << 2;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor103() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AutomationIoUtils.DIGITAL_TRI_STATE << 2;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor104() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = AutomationIoUtils.DIGITAL_OUTPUT_STATE << 2;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor201() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0;
        data[ 1] = AutomationIoUtils.DIGITAL_INACTIVE << 2;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor202() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0;
        data[ 1] = AutomationIoUtils.DIGITAL_ACTIVE << 2;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor203() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0;
        data[ 1] = AutomationIoUtils.DIGITAL_TRI_STATE << 2;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

    @Test
    public void test_constructor204() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0;
        data[ 1] = AutomationIoUtils.DIGITAL_OUTPUT_STATE << 2;
        //@formatter:on

        Digital result1 = new Digital(data);
        assertArrayEquals(data, result1.getDigital());
    }

}
