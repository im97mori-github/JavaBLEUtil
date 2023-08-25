package org.im97mori.ble.characteristic.u2af9;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.GenericLevelUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class GenericLevelTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM;
        data[ 1] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM >> 8);
        //@formatter:on

        GenericLevel result = new GenericLevel(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getGenericLevel());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM;
        data[ 1] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM >> 8);
        //@formatter:on

        GenericLevel result = new GenericLevel(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getGenericLevel());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        GenericLevel result = new GenericLevel(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getGenericLevel());
    }

    @Test
    public void test_constructor_00101() {
        int genericLevel = GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM;

        GenericLevel result = new GenericLevel(genericLevel);
        assertEquals(genericLevel, result.getGenericLevel());
    }

    @Test
    public void test_constructor_00102() {
        int genericLevel = GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM;

        GenericLevel result = new GenericLevel(genericLevel);
        assertEquals(genericLevel, result.getGenericLevel());
    }

    @Test
    public void test_constructor_00103() {
        int genericLevel = 1;

        GenericLevel result = new GenericLevel(genericLevel);
        assertEquals(genericLevel, result.getGenericLevel());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM;
        data[ 1] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MINIMUM >> 8);
        //@formatter:on

        GenericLevel result1 = new GenericLevel(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM;
        data[ 1] = (byte) (GenericLevelUtils.GENERIC_LEVEL_VALUE_MAXIMUM >> 8);
        //@formatter:on

        GenericLevel result1 = new GenericLevel(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        GenericLevel result1 = new GenericLevel(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
