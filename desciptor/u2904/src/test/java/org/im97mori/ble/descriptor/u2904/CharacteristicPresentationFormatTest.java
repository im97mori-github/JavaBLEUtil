package org.im97mori.ble.descriptor.u2904;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class CharacteristicPresentationFormatTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertEquals(CharacteristicPresentationFormat.FORMAT_BOOLEAN, result.getFormat());
        assertEquals(2, result.getExponent());
        assertEquals(0x0403, result.getUnit());
        assertEquals(5, result.getNamespace());
        assertArrayEquals(Arrays.copyOfRange(value, 5, 7), result.getDescription());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_BOOLEAN;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertTrue(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UNSIGNED_2_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertTrue(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UNSIGNED_4_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertTrue(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UNSIGNED_8_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertTrue(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor006() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UNSIGNED_12_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertTrue(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor007() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UNSIGNED_16_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertTrue(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor008() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UNSIGNED_24_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertTrue(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor009() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UNSIGNED_32_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertTrue(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor010() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UNSIGNED_48_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertTrue(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor011() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UNSIGNED_64_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertTrue(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor012() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UNSIGNED_128_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertTrue(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor013() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_SIGNED_8_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertTrue(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor014() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_SIGNED_12_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertTrue(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor015() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_SIGNED_16_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertTrue(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor016() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_SIGNED_24_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertTrue(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor017() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_SIGNED_32_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertTrue(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor018() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_SIGNED_48_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertTrue(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor019() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_SIGNED_64_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertTrue(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor020() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_SIGNED_128_BIT_INTEGER;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertTrue(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor021() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_IEEE_754_32_BIT_FLOATING_POINT;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertTrue(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor022() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_IEEE_754_64_BIT_FLOATING_POINT;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertTrue(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor023() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_IEEE_11073_16_BIT_SFLOAT;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertTrue(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor024() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_IEEE_11073_32_BIT_FLOAT;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertTrue(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor025() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_IEEE_20601_FORMAT;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertTrue(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor026() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UTF_8_STRING;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertTrue(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor027() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_UTF_16_STRING;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertTrue(result.isFormatUtf16String());
        assertFalse(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor028() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) CharacteristicPresentationFormat.FORMAT_OPAQUE_STRUCTURE;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on


        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isFormatBoolean());
        assertFalse(result.isFormatUnsigned2BitInteger());
        assertFalse(result.isFormatUnsigned4BitInteger());
        assertFalse(result.isFormatUnsigned8BitInteger());
        assertFalse(result.isFormatUnsigned12BitInteger());
        assertFalse(result.isFormatUnsigned16BitInteger());
        assertFalse(result.isFormatUnsigned24BitInteger());
        assertFalse(result.isFormatUnsigned32BitInteger());
        assertFalse(result.isFormatUnsigned48BitInteger());
        assertFalse(result.isFormatUnsigned64BitInteger());
        assertFalse(result.isFormatUnsigned128BitInteger());
        assertFalse(result.isFormatSigned8BitInteger());
        assertFalse(result.isFormatSigned12BitInteger());
        assertFalse(result.isFormatSigned16BitInteger());
        assertFalse(result.isFormatSigned24BitInteger());
        assertFalse(result.isFormatSigned32BitInteger());
        assertFalse(result.isFormatSigned48BitInteger());
        assertFalse(result.isFormatSigned64BitInteger());
        assertFalse(result.isFormatSigned128BitInteger());
        assertFalse(result.isFormatIEEE754_32BitFloatingPoint());
        assertFalse(result.isFormatIEEE754_64BitFloatingPoint());
        assertFalse(result.isFormatIEEE11073_16BitSfloat());
        assertFalse(result.isFormatIEEE11073_32BitFloat());
        assertFalse(result.isFormatIEEE20601Format());
        assertFalse(result.isFormatUtf8String());
        assertFalse(result.isFormatUtf16String());
        assertTrue(result.isFormatOpaqueStructure());
    }

    @Test
    public void test_constructor029() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) 0xff;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) 0xff;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertFalse(result.isNamespaceBluetoothSigAssignedNumbers());
    }

    @Test
    public void test_constructor030() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) 0xff;
        value[ 1] = (byte) 0xff;
        value[ 2] = (byte) 0xff;
        value[ 3] = (byte) 0xff;
        value[ 4] = (byte) CharacteristicPresentationFormat.NAMESPACE_BLUETOOTH_SIG_ASSIGNED_NUMBERS;
        value[ 5] = (byte) 0xff;
        value[ 6] = (byte) 0xff;
        //@formatter:on

        CharacteristicPresentationFormat result = new CharacteristicPresentationFormat(value);
        assertTrue(result.isNamespaceBluetoothSigAssignedNumbers());
    }
}
