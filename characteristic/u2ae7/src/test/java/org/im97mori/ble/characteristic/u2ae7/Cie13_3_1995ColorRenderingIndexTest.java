package org.im97mori.ble.characteristic.u2ae7;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

public class Cie13_3_1995ColorRenderingIndexTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) Cie13_3_1995ColorRenderingIndex.COLOR_RENDERING_INDEX_VALUE_MINIMUM;
        //@formatter:on

        Cie13_3_1995ColorRenderingIndex result = new Cie13_3_1995ColorRenderingIndex(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getColorRenderingIndex());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) Cie13_3_1995ColorRenderingIndex.COLOR_RENDERING_INDEX_VALUE_MAXIMUM;
        //@formatter:on

        Cie13_3_1995ColorRenderingIndex result = new Cie13_3_1995ColorRenderingIndex(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getColorRenderingIndex());
    }

    @Test
    public void test_constructor_00101() {
        int colorRenderingIndex = Cie13_3_1995ColorRenderingIndex.COLOR_RENDERING_INDEX_VALUE_MINIMUM;

        Cie13_3_1995ColorRenderingIndex result = new Cie13_3_1995ColorRenderingIndex(colorRenderingIndex);
        assertEquals(colorRenderingIndex, result.getColorRenderingIndex());
    }

    @Test
    public void test_constructor_00102() {
        int colorRenderingIndex = Cie13_3_1995ColorRenderingIndex.COLOR_RENDERING_INDEX_VALUE_MAXIMUM;

        Cie13_3_1995ColorRenderingIndex result = new Cie13_3_1995ColorRenderingIndex(colorRenderingIndex);
        assertEquals(colorRenderingIndex, result.getColorRenderingIndex());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) Cie13_3_1995ColorRenderingIndex.COLOR_RENDERING_INDEX_VALUE_MINIMUM;
        //@formatter:on

        Cie13_3_1995ColorRenderingIndex result1 = new Cie13_3_1995ColorRenderingIndex(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) Cie13_3_1995ColorRenderingIndex.COLOR_RENDERING_INDEX_VALUE_MAXIMUM;
        //@formatter:on

        Cie13_3_1995ColorRenderingIndex result1 = new Cie13_3_1995ColorRenderingIndex(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
