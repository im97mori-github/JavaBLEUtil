package org.im97mori.ble.descriptor.u290f;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CompleteBrEdrTransportBlockDataTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] value = new byte[0];
        //@formatter:on

        CompleteBrEdrTransportBlockData result = new CompleteBrEdrTransportBlockData(value);
        assertArrayEquals(value, result.getTransportData());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = 0x01;
        //@formatter:on

        CompleteBrEdrTransportBlockData result = new CompleteBrEdrTransportBlockData(value);
        assertArrayEquals(value, result.getTransportData());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] value = new byte[0];
        //@formatter:on

        CompleteBrEdrTransportBlockData result1 = new CompleteBrEdrTransportBlockData(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = 0x01;
        //@formatter:on

        CompleteBrEdrTransportBlockData result1 = new CompleteBrEdrTransportBlockData(value);
        assertArrayEquals(value, result1.getBytes());
    }
}