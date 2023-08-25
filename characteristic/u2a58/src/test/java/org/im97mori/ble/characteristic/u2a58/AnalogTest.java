package org.im97mori.ble.characteristic.u2a58;

import static org.junit.Assert.assertArrayEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class AnalogTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x81;
        data[ 1] = 0x02;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x81;
        data[ 1] = 0x02;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x08;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x08;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor201() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0x82;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor202() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0x82;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor301() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x81;
        data[ 1] = 0x02;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor302() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x81;
        data[ 1] = 0x02;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor401() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x08;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor402() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x08;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor501() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0x82;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor502() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0x82;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_constructor601() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0x02;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getAnalog());
    }

    @Test
    public void test_parcelable101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x81;
        data[ 1] = 0x02;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x81;
        data[ 1] = 0x02;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x08;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable104() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x08;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable105() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0x82;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable106() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0x82;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable107() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x81;
        data[ 1] = 0x02;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable108() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x81;
        data[ 1] = 0x02;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable109() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x08;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable110() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x08;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable111() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0x82;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable112() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0x82;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable113() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0x02;
        //@formatter:on

        Analog result1 = new Analog(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
