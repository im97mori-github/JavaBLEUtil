package org.im97mori.ble.descriptor.u290a;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ValueTriggerSettingTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) ValueTriggerSetting.NONE_0;
        //@formatter:on

        ValueTriggerSetting result = new ValueTriggerSetting(value);
        assertTrue(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_1;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        //@formatter:on

        ValueTriggerSetting result = new ValueTriggerSetting(value);
        assertFalse(result.isNone0());
        assertTrue(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertEquals(0x0302, result.getValueAnalog());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_2;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        //@formatter:on

        ValueTriggerSetting result = new ValueTriggerSetting(value);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertTrue(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertEquals(0x0302, result.getValueAnalog());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_3;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        //@formatter:on

        ValueTriggerSetting result = new ValueTriggerSetting(value);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertTrue(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertEquals(0x0302, result.getValueAnalog());
    }

    @Test
    public void test_constructor_00005() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.BIT_MASK_4;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        //@formatter:on

        ValueTriggerSetting result = new ValueTriggerSetting(value);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertTrue(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertArrayEquals(Arrays.copyOfRange(value, 1, 3), result.getValueBitMask());
    }

    @Test
    public void test_constructor_00006() {
        //@formatter:off
        byte[] value = new byte[5];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_INTERVAL_5;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        //@formatter:on

        ValueTriggerSetting result = new ValueTriggerSetting(value);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertTrue(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertEquals(0x00302, result.getValueAnalogOne());
        assertEquals(0x00504, result.getValueAnalogTwo());
    }

    @Test
    public void test_constructor_00007() {
        //@formatter:off
        byte[] value = new byte[5];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_INTERVAL_6;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        //@formatter:on

        ValueTriggerSetting result = new ValueTriggerSetting(value);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertTrue(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertEquals(0x00302, result.getValueAnalogOne());
        assertEquals(0x00504, result.getValueAnalogTwo());
    }

    @Test
    public void test_constructor_00008() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) ValueTriggerSetting.NONE_7;
        //@formatter:on

        ValueTriggerSetting result = new ValueTriggerSetting(value);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertTrue(result.isNone7());
    }

    @Test
    public void test_constructor_00009() {
        ValueTriggerSetting result = new ValueTriggerSetting(ValueTriggerSetting.NONE_0, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertTrue(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
    }

    @Test
    public void test_constructor_00010() {
        ValueTriggerSetting result = new ValueTriggerSetting(ValueTriggerSetting.ANALOG_1, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertFalse(result.isNone0());
        assertTrue(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertEquals(0x0201, result.getValueAnalog());
    }

    @Test
    public void test_constructor_00011() {
        ValueTriggerSetting result = new ValueTriggerSetting(ValueTriggerSetting.ANALOG_2, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertTrue(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertEquals(0x0201, result.getValueAnalog());
    }

    @Test
    public void test_constructor_00012() {
        ValueTriggerSetting result = new ValueTriggerSetting(ValueTriggerSetting.ANALOG_3, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertTrue(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertEquals(0x0201, result.getValueAnalog());
    }

    @Test
    public void test_constructor_00013() {
        byte[] value = new byte[] { 0x03, 0x04 };

        ValueTriggerSetting result = new ValueTriggerSetting(ValueTriggerSetting.BIT_MASK_4, 0x0201, value, 0x0605, 0x0807);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertTrue(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertArrayEquals(value, result.getValueBitMask());
    }

    @Test
    public void test_constructor_00014() {
        ValueTriggerSetting result = new ValueTriggerSetting(ValueTriggerSetting.ANALOG_INTERVAL_5, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertTrue(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertEquals(0x0605, result.getValueAnalogOne());
        assertEquals(0x0807, result.getValueAnalogTwo());
    }

    @Test
    public void test_constructor_00015() {
        ValueTriggerSetting result = new ValueTriggerSetting(ValueTriggerSetting.ANALOG_INTERVAL_6, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertTrue(result.isAnalogInterval6());
        assertFalse(result.isNone7());
        assertEquals(0x0605, result.getValueAnalogOne());
        assertEquals(0x0807, result.getValueAnalogTwo());
    }

    @Test
    public void test_constructor_00016() {
        ValueTriggerSetting result = new ValueTriggerSetting(ValueTriggerSetting.NONE_7, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertFalse(result.isNone0());
        assertFalse(result.isAnalog1());
        assertFalse(result.isAnalog2());
        assertFalse(result.isAnalog3());
        assertFalse(result.isBitMask4());
        assertFalse(result.isAnalogInterval5());
        assertFalse(result.isAnalogInterval6());
        assertTrue(result.isNone7());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) ValueTriggerSetting.NONE_0;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_1;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_2;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_3;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00105() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.BIT_MASK_4;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00106() {
        //@formatter:off
        byte[] value = new byte[5];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_INTERVAL_5;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00107() {
        //@formatter:off
        byte[] value = new byte[5];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_INTERVAL_6;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00108() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) ValueTriggerSetting.NONE_7;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00109() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) ValueTriggerSetting.NONE_0;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(ValueTriggerSetting.NONE_0, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00110() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_1;
        value[ 1] = 0x01;
        value[ 2] = 0x02;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(ValueTriggerSetting.ANALOG_1, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00111() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_2;
        value[ 1] = 0x01;
        value[ 2] = 0x02;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(ValueTriggerSetting.ANALOG_2, 0x0201, new byte[] { 0x03, 0x04 }, 0x0807, 0x0605);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00112() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_3;
        value[ 1] = 0x01;
        value[ 2] = 0x02;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(ValueTriggerSetting.ANALOG_3, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00113() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) ValueTriggerSetting.BIT_MASK_4;
        value[ 1] = 0x03;
        value[ 2] = 0x04;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(ValueTriggerSetting.BIT_MASK_4, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00114() {
        //@formatter:off
        byte[] value = new byte[5];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_INTERVAL_5;
        value[ 1] = 0x05;
        value[ 2] = 0x06;
        value[ 3] = 0x07;
        value[ 4] = 0x08;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(ValueTriggerSetting.ANALOG_INTERVAL_5, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00115() {
        //@formatter:off
        byte[] value = new byte[5];
        value[ 0] = (byte) ValueTriggerSetting.ANALOG_INTERVAL_6;
        value[ 1] = 0x05;
        value[ 2] = 0x06;
        value[ 3] = 0x07;
        value[ 4] = 0x08;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(ValueTriggerSetting.ANALOG_INTERVAL_6, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00116() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) ValueTriggerSetting.NONE_7;
        //@formatter:on

        ValueTriggerSetting result1 = new ValueTriggerSetting(ValueTriggerSetting.NONE_7, 0x0201, new byte[] { 0x03, 0x04 }, 0x0605, 0x0807);
        assertArrayEquals(value, result1.getBytes());
    }

}
