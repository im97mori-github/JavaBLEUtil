package org.im97mori.ble;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.UUID;

import org.junit.Test;

public class BLEUtilsTest {

	@Test
	public void test_createBoolean_001() {
		//@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on
		assertEquals(0x01, BLEUtils.createBoolean(data, 0));
	}

	@Test
	public void test_createBoolean_002() {
		//@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x00;
        //@formatter:on
		assertEquals(0x00, BLEUtils.createBoolean(data, 0));
	}

	@Test
	public void test_createUInt2_001() {
		//@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on
		assertEquals(0x01, BLEUtils.createUInt2(data, 0));
	}

	@Test
	public void test_createUInt2_002() {
		//@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x03;
        //@formatter:on
		assertEquals(0x03, BLEUtils.createUInt2(data, 0));
	}

	@Test
	public void test_createUInt2_003() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on
		assertEquals(0x02, BLEUtils.createUInt2(data, 1));
	}

	@Test
	public void test_createUInt4_001() {
		//@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on
		assertEquals(0x01, BLEUtils.createUInt4(data, 0));
	}

	@Test
	public void test_createUInt4_002() {
		//@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x0f;
        //@formatter:on
		assertEquals(0x0f, BLEUtils.createUInt4(data, 0));
	}

	@Test
	public void test_createUInt4_003() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on
		assertEquals(0x02, BLEUtils.createUInt4(data, 1));
	}

	@Test
	public void test_createUInt8_001() {
		//@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on
		assertEquals(0x01, BLEUtils.createUInt8(data, 0));
	}

	@Test
	public void test_createUInt8_002() {
		//@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on
		assertEquals(0x000000ff, BLEUtils.createUInt8(data, 0));
	}

	@Test
	public void test_createUInt8_003() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on
		assertEquals(0x02, BLEUtils.createUInt8(data, 1));
	}

	@Test
	public void test_createUInt12_001() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x32;
        //@formatter:on
		assertEquals(0x0201, BLEUtils.createUInt12(data, 0));
	}

	@Test
	public void test_createUInt12_002() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x0f;
        //@formatter:on
		assertEquals(0x00000f01, BLEUtils.createUInt12(data, 0));
	}

	@Test
	public void test_createUInt12_003() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x43;
        //@formatter:on
		assertEquals(0x0302, BLEUtils.createUInt12(data, 1));
	}

	@Test
	public void test_createUInt12_004() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = 0x10;
        data[ 2] = 0x20;
        //@formatter:on
		assertEquals(0x0201, BLEUtils.createUInt12(data, 0, 12));
	}

	@Test
	public void test_createUInt12_005() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 0x00;
        data[ 1] = (byte) 0x10;
        data[ 2] = (byte) 0xf0;
        //@formatter:on
		assertEquals(0x00000f01, BLEUtils.createUInt12(data, 0, 12));
	}

	@Test
	public void test_createUInt12_006() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x00;
        data[ 1] = 0x00;
        data[ 2] = 0x20;
        data[ 3] = 0x30;
        //@formatter:on
		assertEquals(0x0302, BLEUtils.createUInt12(data, 1, 12));
	}

	@Test
	public void test_createUInt16_001() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on
		assertEquals(0x0201, BLEUtils.createUInt16(data, 0));
	}

	@Test
	public void test_createUInt16_002() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0xff;
        //@formatter:on
		assertEquals(0x0000ff01, BLEUtils.createUInt16(data, 0));
	}

	@Test
	public void test_createUInt16_003() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on
		assertEquals(0x0302, BLEUtils.createUInt16(data, 1));
	}

	@Test
	public void test_createUInt24_001() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on
		assertEquals(0x030201, BLEUtils.createUInt24(data, 0));
	}

	@Test
	public void test_createUInt24_002() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x02;
        data[ 2] = (byte) 0xff;
        //@formatter:on
		assertEquals(0x00ff0201, BLEUtils.createUInt24(data, 0));
	}

	@Test
	public void test_createUInt24_003() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on
		assertEquals(0x040302, BLEUtils.createUInt24(data, 1));
	}

	@Test
	public void test_createUInt32_001() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on
		assertEquals(0x04030201L, BLEUtils.createUInt32(data, 0));
	}

	@Test
	public void test_createUInt32_002() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x02;
        data[ 2] = (byte) 0x03;
        data[ 3] = (byte) 0xff;
        //@formatter:on
		assertEquals(0xff030201L, BLEUtils.createUInt32(data, 0));
	}

	@Test
	public void test_createUInt32_003() {
		//@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on
		assertEquals(0x05040302L, BLEUtils.createUInt32(data, 1));
	}

	@Test
	public void test_createUInt40_001() {
		//@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on
		assertEquals(0x0504030201L, BLEUtils.createUInt40(data, 0));
	}

	@Test
	public void test_createUInt40_002() {
		//@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x02;
        data[ 2] = (byte) 0x03;
        data[ 3] = (byte) 0x04;
        data[ 4] = (byte) 0xff;
        //@formatter:on
		assertEquals(0xff04030201L, BLEUtils.createUInt40(data, 0));
	}

	@Test
	public void test_createUInt40_003() {
		//@formatter:off
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        //@formatter:on
		assertEquals(0x0605040302L, BLEUtils.createUInt40(data, 1));
	}

	@Test
	public void test_createUInt48_001() {
		//@formatter:off
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        //@formatter:on
		assertEquals(0x060504030201L, BLEUtils.createUInt48(data, 0));
	}

	@Test
	public void test_createUInt48_002() {
		//@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x02;
        data[ 2] = (byte) 0x03;
        data[ 3] = (byte) 0x04;
        data[ 4] = (byte) 0x05;
        data[ 5] = (byte) 0xff;
        //@formatter:on
		assertEquals(0xff0504030201L, BLEUtils.createUInt48(data, 0));
	}

	@Test
	public void test_createUInt48_003() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        //@formatter:on
		assertEquals(0x070605040302L, BLEUtils.createUInt48(data, 1));
	}

	@Test
	public void test_createUInt64_001() {
		//@formatter:off
        byte[] data = new byte[16];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        data[ 9] = 0x0a;
        data[10] = 0x0b;
        data[11] = 0x0c;
        data[12] = 0x0d;
        data[13] = 0x0e;
        data[14] = 0x0f;
        data[15] = 0x10;
        //@formatter:on

		assertEquals(0x04030201, BLEUtils.createUInt64(data, 0).intValue());
		assertEquals(0x08070605, BLEUtils.createUInt64(data, 0).shiftRight(32).intValue());
	}

	@Test
	public void test_createUInt64_002() {
		//@formatter:off
        byte[] data = new byte[16];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        //@formatter:on

		assertEquals(0x04030201, BLEUtils.createUInt64(data, 0).intValue());
		assertEquals(0x08070605, BLEUtils.createUInt64(data, 0).shiftRight(32).intValue());
	}

	@Test
	public void test_createUInt64_003() {
		//@formatter:off
        byte[] data = new byte[17];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        //@formatter:on

		assertEquals(0x05040302, BLEUtils.createUInt128(data, 1).intValue());
		assertEquals(0x09080706, BLEUtils.createUInt128(data, 1).shiftRight(32).intValue());
	}

	@Test
	public void test_createUInt128_001() {
		//@formatter:off
        byte[] data = new byte[16];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        data[ 9] = 0x0a;
        data[10] = 0x0b;
        data[11] = 0x0c;
        data[12] = 0x0d;
        data[13] = 0x0e;
        data[14] = 0x0f;
        data[15] = 0x10;
        //@formatter:on

		assertEquals(0x0807060504030201L, BLEUtils.createUInt128(data, 0).longValue());
		assertEquals(0x100f0e0d0c0b0a09L, BLEUtils.createUInt128(data, 0).shiftRight(64).longValue());
	}

	@Test
	public void test_createUInt128_002() {
		//@formatter:off
        byte[] data = new byte[16];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        data[ 9] = 0x0a;
        data[10] = 0x0b;
        data[11] = 0x0c;
        data[12] = 0x0d;
        data[13] = 0x0e;
        data[14] = 0x0f;
        data[15] = (byte) 0xff;
        //@formatter:on

		assertEquals(0x0807060504030201L, BLEUtils.createUInt128(data, 0).longValue());
		assertEquals(0xff0f0e0d0c0b0a09L, BLEUtils.createUInt128(data, 0).shiftRight(64).longValue());
	}

	@Test
	public void test_createUInt128_003() {
		//@formatter:off
        byte[] data = new byte[17];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        data[ 9] = 0x0a;
        data[10] = 0x0b;
        data[11] = 0x0c;
        data[12] = 0x0d;
        data[13] = 0x0e;
        data[14] = 0x0f;
        data[15] = 0x10;
        data[16] = 0x11;
        //@formatter:on

		assertEquals(0x0908070605040302L, BLEUtils.createUInt128(data, 1).longValue());
		assertEquals(0x11100f0e0d0c0b0aL, BLEUtils.createUInt128(data, 1).shiftRight(64).longValue());
	}

	@Test
	public void test_createSInt8_001() {
		//@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on
		assertEquals(0x01, BLEUtils.createSInt8(data, 0));
	}

	@Test
	public void test_createSInt8_002() {
		//@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 0xff;
        //@formatter:on
		assertEquals(0xffffffff, BLEUtils.createSInt8(data, 0));
	}

	@Test
	public void test_createSInt8_003() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on
		assertEquals(0x02, BLEUtils.createSInt8(data, 1));
	}

	@Test
	public void test_createSInt12_001() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x32;
        //@formatter:on
		assertEquals(0x0201, BLEUtils.createSInt12(data, 0));
	}

	@Test
	public void test_createSInt12_002() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x0f;
        //@formatter:on
		assertEquals(0xffffff01, BLEUtils.createSInt12(data, 0));
	}

	@Test
	public void test_createSInt12_003() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x43;
        //@formatter:on
		assertEquals(0x0302, BLEUtils.createSInt12(data, 1));
	}

	@Test
	public void test_createSInt12_004() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = 0x10;
        data[ 2] = 0x20;
        //@formatter:on
		assertEquals(0x0201, BLEUtils.createSInt12(data, 0, 12));
	}

	@Test
	public void test_createSInt12_005() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 0x00;
        data[ 1] = (byte) 0x10;
        data[ 2] = (byte) 0xf0;
        //@formatter:on
		assertEquals(0xffffff01, BLEUtils.createSInt12(data, 0, 12));
	}

	@Test
	public void test_createSInt12_006() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x00;
        data[ 1] = 0x00;
        data[ 2] = 0x20;
        data[ 3] = 0x30;
        //@formatter:on
		assertEquals(0x0302, BLEUtils.createSInt12(data, 1, 12));
	}

	@Test
	public void test_createSInt16_001() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on
		assertEquals(0x0201, BLEUtils.createSInt16(data, 0));
	}

	@Test
	public void test_createSInt16_002() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0xff;
        //@formatter:on
		assertEquals(0xffffff01, BLEUtils.createSInt16(data, 0));
	}

	@Test
	public void test_createSInt16_003() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on
		assertEquals(0x0302, BLEUtils.createSInt16(data, 1));
	}

	@Test
	public void test_createSInt24_001() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on
		assertEquals(0x030201, BLEUtils.createSInt24(data, 0));
	}

	@Test
	public void test_createSInt24_002() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x02;
        data[ 2] = (byte) 0xff;
        //@formatter:on
		assertEquals(0xffff0201, BLEUtils.createSInt24(data, 0));
	}

	@Test
	public void test_createSInt24_003() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on
		assertEquals(0x040302, BLEUtils.createSInt24(data, 1));
	}

	@Test
	public void test_createSInt32_001() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on
		assertEquals(0x04030201, BLEUtils.createSInt32(data, 0));
	}

	@Test
	public void test_createSInt32_002() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x02;
        data[ 2] = (byte) 0x03;
        data[ 3] = (byte) 0xff;
        //@formatter:on
		assertEquals(0xff030201, BLEUtils.createSInt32(data, 0));
	}

	@Test
	public void test_createSInt32_003() {
		//@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on
		assertEquals(0x05040302, BLEUtils.createSInt32(data, 1));
	}

	@Test
	public void test_createSInt48_001() {
		//@formatter:off
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        //@formatter:on
		assertEquals(0x060504030201L, BLEUtils.createSInt48(data, 0));
	}

	@Test
	public void test_createSInt48_002() {
		//@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x02;
        data[ 2] = (byte) 0x03;
        data[ 3] = (byte) 0x04;
        data[ 4] = (byte) 0x05;
        data[ 5] = (byte) 0xff;
        //@formatter:on
		assertEquals(0xffffff0504030201L, BLEUtils.createSInt48(data, 0));
	}

	@Test
	public void test_createSInt48_003() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        //@formatter:on
		assertEquals(0x070605040302L, BLEUtils.createSInt48(data, 1));
	}

	@Test
	public void test_createSInt64_001() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        //@formatter:on
		assertEquals(0x0807060504030201L, BLEUtils.createSInt64(data, 0));
	}

	@Test
	public void test_createSInt64_002() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x02;
        data[ 2] = (byte) 0x03;
        data[ 3] = (byte) 0x04;
        data[ 4] = (byte) 0x05;
        data[ 5] = (byte) 0x06;
        data[ 6] = (byte) 0x07;
        data[ 7] = (byte) 0xff;
        //@formatter:on
		assertEquals(0xff07060504030201L, BLEUtils.createSInt64(data, 0));
	}

	@Test
	public void test_createSInt64_003() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        //@formatter:on
		assertEquals(0x0908070605040302L, BLEUtils.createSInt64(data, 1));
	}
	
	@Test
	public void test_createSInt128_001() {
		//@formatter:off
        byte[] data = new byte[16];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        data[ 9] = 0x0a;
        data[10] = 0x0b;
        data[11] = 0x0c;
        data[12] = 0x0d;
        data[13] = 0x0e;
        data[14] = 0x0f;
        data[15] = 0x10;
        //@formatter:on

		assertEquals(0x0807060504030201L, BLEUtils.createSInt128(data, 0).longValue());
		assertEquals(0x100f0e0d0c0b0a09L, BLEUtils.createSInt128(data, 0).shiftRight(64).longValue());
	}

	@Test
	public void test_createSInt128_002() {
		//@formatter:off
        byte[] data = new byte[16];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        data[ 9] = 0x0a;
        data[10] = 0x0b;
        data[11] = 0x0c;
        data[12] = 0x0d;
        data[13] = 0x0e;
        data[14] = 0x0f;
        data[15] = (byte) 0xff;
        //@formatter:on

		assertEquals(0x0807060504030201L, BLEUtils.createSInt128(data, 0).negate().longValue());
		assertEquals(0xff0f0e0d0c0b0a09L, BLEUtils.createSInt128(data, 0).negate().shiftRight(64).longValue());
	}

	@Test
	public void test_createSInt128_003() {
		//@formatter:off
        byte[] data = new byte[17];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        data[ 9] = 0x0a;
        data[10] = 0x0b;
        data[11] = 0x0c;
        data[12] = 0x0d;
        data[13] = 0x0e;
        data[14] = 0x0f;
        data[15] = 0x10;
        data[16] = 0x11;
        //@formatter:on

		assertEquals(0x0908070605040302L, BLEUtils.createSInt128(data, 1).longValue());
		assertEquals(0x11100f0e0d0c0b0aL, BLEUtils.createSInt128(data, 1).shiftRight(64).longValue());
	}
	
	@Test
	public void test_createFloat32_001() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x7f800000;
        data[ 1] = (byte) (0x7f800000 >> 8);
        data[ 2] = (byte) (0x7f800000 >> 16);
        data[ 3] = (byte) (0x7f800000 >> 24);
        //@formatter:on
		assertEquals(Float.POSITIVE_INFINITY, BLEUtils.createFloat32(data, 0), 0);
	}

	@Test
	public void test_createFloat32_002() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xff800000;
        data[ 1] = (byte) (0xff800000 >> 8);
        data[ 2] = (byte) (0xff800000 >> 16);
        data[ 3] = (byte) (0xff800000 >> 24);
        //@formatter:on
		assertEquals(Float.NEGATIVE_INFINITY, BLEUtils.createFloat32(data, 0), 0);
	}
	
	@Test
	public void test_createFloat32_003() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x7f800001;
        data[ 1] = (byte) (0x7f800001 >> 8);
        data[ 2] = (byte) (0x7f800001 >> 16);
        data[ 3] = (byte) (0x7f800001 >> 24);
        //@formatter:on
		assertEquals(Float.NaN, BLEUtils.createFloat32(data, 0), 0);
	}
	
	@Test
	public void test_createFloat32_004() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x7fffffff;
        data[ 1] = (byte) (0x7fffffff >> 8);
        data[ 2] = (byte) (0x7fffffff >> 16);
        data[ 3] = (byte) (0x7fffffff >> 24);
        //@formatter:on
		assertEquals(Float.NaN, BLEUtils.createFloat32(data, 0), 0);
	}
	
	@Test
	public void test_createFloat32_005() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xff800001;
        data[ 1] = (byte) (0xff800001 >> 8);
        data[ 2] = (byte) (0xff800001 >> 16);
        data[ 3] = (byte) (0xff800001 >> 24);
        //@formatter:on
		assertEquals(Float.NaN, BLEUtils.createFloat32(data, 0), 0);
	}
	
	@Test
	public void test_createFloat32_006() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xffffffff;
        data[ 1] = (byte) (0xffffffff >> 8);
        data[ 2] = (byte) (0xffffffff >> 16);
        data[ 3] = (byte) (0xffffffff >> 24);
        //@formatter:on
		assertEquals(Float.NaN, BLEUtils.createFloat32(data, 0), 0);
	}
	
	@Test
	public void test_createFloat32_007() {
		float value = 1;
		int intbits = Float.floatToRawIntBits(value);
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) intbits;
        data[ 1] = (byte) (intbits >> 8);
        data[ 2] = (byte) (intbits >> 16);
        data[ 3] = (byte) (intbits >> 24);
        //@formatter:on
		assertEquals(value, BLEUtils.createFloat32(data, 0), 0);
	}
	
	@Test
	public void test_createFloat32_008() {
		float value = -1;
		int intbits = Float.floatToRawIntBits(value);
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) intbits;
        data[ 1] = (byte) (intbits >> 8);
        data[ 2] = (byte) (intbits >> 16);
        data[ 3] = (byte) (intbits >> 24);
        //@formatter:on
		assertEquals(value, BLEUtils.createFloat32(data, 0), 0);
	}
	
	@Test
	public void test_createFloat32_009() {
		float value = 0.1f;
		int intbits = Float.floatToRawIntBits(value);
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) intbits;
        data[ 1] = (byte) (intbits >> 8);
        data[ 2] = (byte) (intbits >> 16);
        data[ 3] = (byte) (intbits >> 24);
        //@formatter:on
		assertEquals(value, BLEUtils.createFloat32(data, 0), 0);
	}
	
	@Test
	public void test_createFloat32_010() {
		float value = -0.1f;
		int intbits = Float.floatToRawIntBits(value);
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) intbits;
        data[ 1] = (byte) (intbits >> 8);
        data[ 2] = (byte) (intbits >> 16);
        data[ 3] = (byte) (intbits >> 24);
        //@formatter:on
		assertEquals(value, BLEUtils.createFloat32(data, 0), 0);
	}
	
	@Test
	public void test_createFloat64_001() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0x7ff0000000000000L;
        data[ 1] = (byte) (0x7ff0000000000000L >> 8);
        data[ 2] = (byte) (0x7ff0000000000000L >> 16);
        data[ 3] = (byte) (0x7ff0000000000000L >> 24);
        data[ 4] = (byte) (0x7ff0000000000000L >> 32);
        data[ 5] = (byte) (0x7ff0000000000000L >> 40);
        data[ 6] = (byte) (0x7ff0000000000000L >> 48);
        data[ 7] = (byte) (0x7ff0000000000000L >> 56);
        //@formatter:on
		assertEquals(Double.POSITIVE_INFINITY, BLEUtils.createFloat64(data, 0), 0);
	}

	@Test
	public void test_createFloat64_002() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0xfff0000000000000L;
        data[ 1] = (byte) (0xfff0000000000000L >> 8);
        data[ 2] = (byte) (0xfff0000000000000L >> 16);
        data[ 3] = (byte) (0xfff0000000000000L >> 24);
        data[ 4] = (byte) (0xfff0000000000000L >> 32);
        data[ 5] = (byte) (0xfff0000000000000L >> 40);
        data[ 6] = (byte) (0xfff0000000000000L >> 48);
        data[ 7] = (byte) (0xfff0000000000000L >> 56);
        //@formatter:on
		assertEquals(Double.NEGATIVE_INFINITY, BLEUtils.createFloat64(data, 0), 0);
	}
	
	@Test
	public void test_createFloat64_003() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0x7ff0000000000001L;
        data[ 1] = (byte) (0x7ff0000000000001L >> 8);
        data[ 2] = (byte) (0x7ff0000000000001L >> 16);
        data[ 3] = (byte) (0x7ff0000000000001L >> 24);
        data[ 4] = (byte) (0x7ff0000000000001L >> 32);
        data[ 5] = (byte) (0x7ff0000000000001L >> 40);
        data[ 6] = (byte) (0x7ff0000000000001L >> 48);
        data[ 7] = (byte) (0x7ff0000000000001L >> 56);
        //@formatter:on
		assertEquals(Double.NaN, BLEUtils.createFloat64(data, 0), 0);
	}
	
	@Test
	public void test_createFloat64_004() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0x7fffffffffffffffL;
        data[ 1] = (byte) (0x7fffffffffffffffL >> 8);
        data[ 2] = (byte) (0x7fffffffffffffffL >> 16);
        data[ 3] = (byte) (0x7fffffffffffffffL >> 24);
        data[ 4] = (byte) (0x7fffffffffffffffL >> 32);
        data[ 5] = (byte) (0x7fffffffffffffffL >> 40);
        data[ 6] = (byte) (0x7fffffffffffffffL >> 48);
        data[ 7] = (byte) (0x7fffffffffffffffL >> 56);
        //@formatter:on
		assertEquals(Double.NaN, BLEUtils.createFloat64(data, 0), 0);
	}
	
	@Test
	public void test_createFloat64_005() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0xfff0000000000001L;
        data[ 1] = (byte) (0xfff0000000000001L >> 8);
        data[ 2] = (byte) (0xfff0000000000001L >> 16);
        data[ 3] = (byte) (0xfff0000000000001L >> 24);
        data[ 4] = (byte) (0xfff0000000000001L >> 32);
        data[ 5] = (byte) (0xfff0000000000001L >> 40);
        data[ 6] = (byte) (0xfff0000000000001L >> 48);
        data[ 7] = (byte) (0xfff0000000000001L >> 56);
        //@formatter:on
		assertEquals(Double.NaN, BLEUtils.createFloat64(data, 0), 0);
	}
	
	@Test
	public void test_createFloat64_006() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0xffffffffffffffffL;
        data[ 1] = (byte) (0xffffffffffffffffL >> 8);
        data[ 2] = (byte) (0xffffffffffffffffL >> 16);
        data[ 3] = (byte) (0xffffffffffffffffL >> 24);
        data[ 4] = (byte) (0xffffffffffffffffL >> 32);
        data[ 5] = (byte) (0xffffffffffffffffL >> 40);
        data[ 6] = (byte) (0xffffffffffffffffL >> 48);
        data[ 7] = (byte) (0xffffffffffffffffL >> 56);
        //@formatter:on
		assertEquals(Double.NaN, BLEUtils.createFloat64(data, 0), 0);
	}
	
	@Test
	public void test_createFloat64_007() {
		double value = 1;
		long longbits = Double.doubleToRawLongBits(value);
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) longbits;
        data[ 1] = (byte) (longbits >> 8);
        data[ 2] = (byte) (longbits >> 16);
        data[ 3] = (byte) (longbits >> 24);
        data[ 4] = (byte) (longbits >> 32);
        data[ 5] = (byte) (longbits >> 40);
        data[ 6] = (byte) (longbits >> 48);
        data[ 7] = (byte) (longbits >> 56);
        //@formatter:on
		assertEquals(value, BLEUtils.createFloat64(data, 0), 0);
	}
	
	@Test
	public void test_createFloat64_008() {
		double value = -1;
		long longbits = Double.doubleToRawLongBits(value);
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) longbits;
        data[ 1] = (byte) (longbits >> 8);
        data[ 2] = (byte) (longbits >> 16);
        data[ 3] = (byte) (longbits >> 24);
        data[ 4] = (byte) (longbits >> 32);
        data[ 5] = (byte) (longbits >> 40);
        data[ 6] = (byte) (longbits >> 48);
        data[ 7] = (byte) (longbits >> 56);
        //@formatter:on
		assertEquals(value, BLEUtils.createFloat64(data, 0), 0);
	}
	
	@Test
	public void test_createFloat64_009() {
		double value = 0.1;
		long longbits = Double.doubleToRawLongBits(value);
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) longbits;
        data[ 1] = (byte) (longbits >> 8);
        data[ 2] = (byte) (longbits >> 16);
        data[ 3] = (byte) (longbits >> 24);
        data[ 4] = (byte) (longbits >> 32);
        data[ 5] = (byte) (longbits >> 40);
        data[ 6] = (byte) (longbits >> 48);
        data[ 7] = (byte) (longbits >> 56);
        //@formatter:on
		assertEquals(value, BLEUtils.createFloat64(data, 0), 0);
	}
	
	@Test
	public void test_createFloat64_010() {
		double value = -0.1;
		long longbits = Double.doubleToRawLongBits(value);
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) longbits;
        data[ 1] = (byte) (longbits >> 8);
        data[ 2] = (byte) (longbits >> 16);
        data[ 3] = (byte) (longbits >> 24);
        data[ 4] = (byte) (longbits >> 32);
        data[ 5] = (byte) (longbits >> 40);
        data[ 6] = (byte) (longbits >> 48);
        data[ 7] = (byte) (longbits >> 56);
        //@formatter:on
		assertEquals(value, BLEUtils.createFloat64(data, 0), 0);
	}
	
	@Test
	public void test_createSfloat_001() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0xff;
        data[ 1] = 0x07;
        //@formatter:on

		assertTrue(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_002() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x00;
        data[ 1] = 0x08;
        //@formatter:on

		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertTrue(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_003() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0xfe;
        data[ 1] = 0x07;
        //@formatter:on

		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertTrue(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_004() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x02;
        data[ 1] = 0x08;
        //@formatter:on

		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertTrue(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_005() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x08;
        //@formatter:on

		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertTrue(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_006() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

		assertEquals(0x0201, BLEUtils.createSfloatMantissa(data, 0));
		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_007() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x0f;
        //@formatter:on

		assertEquals(0xffffff01, BLEUtils.createSfloatMantissa(data, 0));
		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_008() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

		assertEquals(0x0302, BLEUtils.createSfloatMantissa(data, 1));
		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_009() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x02;
        data[ 1] = 0x10;
        //@formatter:on

		assertEquals(0x01, BLEUtils.createSfloatExponent(data, 0));
		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_010() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x02;
        data[ 1] = (byte) 0xf0;
        //@formatter:on

		assertEquals(0xffffffff, BLEUtils.createSfloatExponent(data, 0));
		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_011() {
		//@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x02;
        data[ 1] = 0x03;
        data[ 2] = 0x10;
        //@formatter:on

		assertEquals(0x01, BLEUtils.createSfloatExponent(data, 1));
		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_012() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

		BigDecimal bd = BigDecimal.valueOf(0x0201);
		bd = bd.round(new MathContext(5, RoundingMode.DOWN));
		assertEquals(bd.doubleValue(), BLEUtils.createSfloat(data, 0), 0);
		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_013() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0b111001000000001;
        data[ 1] = (byte) (0b111001000000001 >> 8);
        //@formatter:on

		BigDecimal bd = BigDecimal.valueOf(513);
		bd = bd.scaleByPowerOfTen(7);
		bd = bd.round(new MathContext(5, RoundingMode.DOWN));
		assertEquals(bd.doubleValue(), BLEUtils.createSfloat(data, 0), 0);
		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createSfloat_014() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = (byte) 0xf2;
        //@formatter:on

		BigDecimal bd = BigDecimal.valueOf(513);
		bd = bd.scaleByPowerOfTen(-1);
		bd = bd.round(new MathContext(5, RoundingMode.DOWN));
		assertEquals(bd.doubleValue(), BLEUtils.createSfloat(data, 0), 0);
		assertFalse(BLEUtils.isSfloatNan(data, 0));
		assertFalse(BLEUtils.isSfloatNres(data, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isSfloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_001() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0x7f;
        data[ 3] = (byte) 0x00;
        //@formatter:on

		assertTrue(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_002() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x00;
        data[ 1] = (byte) 0x00;
        data[ 2] = (byte) 0x80;
        data[ 3] = (byte) 0x00;
        //@formatter:on

		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertTrue(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_003() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xfe;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0x7f;
        data[ 3] = (byte) 0x00;
        //@formatter:on

		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertTrue(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_004() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x02;
        data[ 1] = (byte) 0x00;
        data[ 2] = (byte) 0x80;
        data[ 3] = (byte) 0x00;
        //@formatter:on

		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertTrue(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_005() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x00;
        data[ 2] = (byte) 0x80;
        data[ 3] = (byte) 0x00;
        //@formatter:on

		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertTrue(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_006() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

		assertEquals(0x030201, BLEUtils.createFloatMantissa(data, 0));
		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_007() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = (byte) 0xff;
        data[ 3] = 0x04;
        //@formatter:on

		assertEquals(0xffff0201, BLEUtils.createFloatMantissa(data, 0));
		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_008() {
		//@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on

		assertEquals(0x040302, BLEUtils.createFloatMantissa(data, 1));
		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_009() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

		assertEquals(0x04, BLEUtils.createFloatExponent(data, 0));
		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_010() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = (byte) 0xff;
        //@formatter:on

		assertEquals(0xffffffff, BLEUtils.createFloatExponent(data, 0));
		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_011() {
		//@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on

		assertEquals(0x05, BLEUtils.createFloatExponent(data, 1));
		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_012() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x00;
        //@formatter:on

		BigDecimal bd = BigDecimal.valueOf(0x030201);
		bd = bd.round(new MathContext(8, RoundingMode.DOWN));
		assertEquals(bd.doubleValue(), BLEUtils.createFloat(data, 0), 0);
		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_013() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

		BigDecimal bd = BigDecimal.valueOf(0x030201);
		bd = bd.multiply(BigDecimal.valueOf(10000));
		bd = bd.round(new MathContext(8, RoundingMode.DOWN));
		assertEquals(bd.doubleValue(), BLEUtils.createFloat(data, 0), 0);
		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_createFloat_014() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = (byte) 0xff;
        //@formatter:on

		BigDecimal bd = BigDecimal.valueOf(0x030201);
		bd = bd.divide(BigDecimal.valueOf(10));
		bd = bd.round(new MathContext(8, RoundingMode.DOWN));
		assertEquals(bd.doubleValue(), BLEUtils.createFloat(data, 0), 0);
		assertFalse(BLEUtils.isFloatNan(data, 0));
		assertFalse(BLEUtils.isFloatNres(data, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(data, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(data, 0));
		assertFalse(BLEUtils.isFloatRfu(data, 0));
	}

	@Test
	public void test_floatToByteArray_001() {
		double value = Double.NaN;
		byte[] result = BLEUtils.floatToByteArray(value);

		assertTrue(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));
	}

	@Test
	public void test_floatToByteArray_002() {
		double data = Double.POSITIVE_INFINITY;
		byte[] result = BLEUtils.floatToByteArray(data);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertTrue(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));
	}

	@Test
	public void test_floatToByteArray_003() {
		double value = Double.NEGATIVE_INFINITY;
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertTrue(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));
	}

	@Test
	public void test_floatToByteArray_004() {
		double value = Math.pow(10, 128);
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertTrue(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));
	}

	@Test
	public void test_floatToByteArray_005() {
		double value = Math.pow(10, 127);
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));
	}

	@Test
	public void test_floatToByteArray_006() {
		double data = Math.pow(10, -129);
		byte[] result = BLEUtils.floatToByteArray(data);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertTrue(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));
	}

	@Test
	public void test_floatToByteArray_007() {
		double data = Math.pow(10, -128);
		byte[] result = BLEUtils.floatToByteArray(data);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));
	}

	@Test
	public void test_floatToByteArray_008() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        data[ 3] = 0x00;
        //@formatter:on

		double value = BLEUtils.createFloat(data, 0);
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));

		assertEquals(value, BLEUtils.createFloat(result, 0), 0);
	}

	@Test
	public void test_floatToByteArray_009() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0xff;
        data[ 3] = 0x00;
        //@formatter:on

		double value = BLEUtils.createFloat(data, 0);
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));

		assertEquals(value, BLEUtils.createFloat(result, 0), 0);
	}

	@Test
	public void test_floatToByteArray_010() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x05;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        data[ 3] = (byte) 0xff;
        //@formatter:on

		double value = BLEUtils.createFloat(data, 0);
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));

		assertEquals(value, BLEUtils.createFloat(result, 0), 0);
	}

	@Test
	public void test_floatToByteArray_011() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xfb;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0xff;
        data[ 3] = 0x00;
        //@formatter:on

		double value = BLEUtils.createFloat(data, 0);
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));

		assertEquals(value, BLEUtils.createFloat(result, 0), 0);
	}

	@Test
	public void test_floatToByteArray_012() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x00;
        data[ 2] = 0x00;
        data[ 3] = (byte) 0xfe;
        //@formatter:on

		double value = BLEUtils.createFloat(data, 0);
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));

		assertEquals(value, BLEUtils.createFloat(result, 0), 0);
	}

	@Test
	public void test_floatToByteArray_013() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0xff;
        data[ 3] = (byte) 0xfe;
        //@formatter:on

		double value = BLEUtils.createFloat(data, 0);
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));

		assertEquals(value, BLEUtils.createFloat(result, 0), 0);
	}

	@Test
	public void test_floatToByteArray_014() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x65;
        data[ 1] = (byte) 0x00;
        data[ 2] = (byte) 0x00;
        data[ 3] = (byte) 0xff;
        //@formatter:on

		double value = BLEUtils.createFloat(data, 0);
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));

		assertEquals(value, BLEUtils.createFloat(result, 0), 0);
	}

	@Test
	public void test_floatToByteArray_015() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x9b;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0xff;
        data[ 3] = (byte) 0xff;
        //@formatter:on

		double value = BLEUtils.createFloat(data, 0);
		byte[] result = BLEUtils.floatToByteArray(value);

		assertFalse(BLEUtils.isFloatNan(result, 0));
		assertFalse(BLEUtils.isFloatNres(result, 0));
		assertFalse(BLEUtils.isFloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isFloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isFloatRfu(result, 0));

		assertEquals(value, BLEUtils.createFloat(result, 0), 0);
	}

	@Test
	public void test_sfloatToByteArray_001() {
		double value = Double.NaN;
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertTrue(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));
	}

	@Test
	public void test_sfloatToByteArray_002() {
		double value = Double.POSITIVE_INFINITY;
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertTrue(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));
	}

	@Test
	public void test_sfloatToByteArray_003() {
		double value = Double.NEGATIVE_INFINITY;
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertTrue(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));
	}

	@Test
	public void test_sfloatToByteArray_004() {
		double value = Math.pow(10, 8);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertTrue(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));
	}

	@Test
	public void test_sfloatToByteArray_005() {
		double value = Math.pow(10, 7);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));
	}

	@Test
	public void test_sfloatToByteArray_006() {
		double value = Math.pow(10, -9);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertTrue(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));
	}

	@Test
	public void test_sfloatToByteArray_007() {
		double value = Math.pow(10, -8);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));
	}

	@Test
	public void test_sfloatToByteArray_008() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0b00000001;
        data[ 1] = 0b00000000;
        //@formatter:on

		double value = BLEUtils.createSfloat(data, 0);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));

		assertEquals(value, BLEUtils.createSfloat(result, 0), 0);
	}

	@Test
	public void test_sfloatToByteArray_009() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0b11111111;
        data[ 1] = 0b00001111;
        //@formatter:on

		double value = BLEUtils.createSfloat(data, 0);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));

		assertEquals(value, BLEUtils.createSfloat(result, 0), 0);
	}

	@Test
	public void test_sfloatToByteArray_010() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0b00000101;
        data[ 1] = (byte) 0b11110000;
        //@formatter:on

		double value = BLEUtils.createSfloat(data, 0);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));

		assertEquals(value, BLEUtils.createSfloat(result, 0), 0);
	}

	@Test
	public void test_sfloatToByteArray_011() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0b11111011;
        data[ 1] = (byte) 0b11111111;
        //@formatter:on

		double value = BLEUtils.createSfloat(data, 0);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));

		assertEquals(value, BLEUtils.createSfloat(result, 0), 0);
	}

	@Test
	public void test_sfloatToByteArray_012() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0b00000001;
        data[ 1] = (byte) 0b11100000;
        //@formatter:on

		double value = BLEUtils.createSfloat(data, 0);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));

		assertEquals(value, BLEUtils.createSfloat(result, 0), 0);
	}

	@Test
	public void test_sfloatToByteArray_013() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0b11111111;
        data[ 1] = (byte) 0b11101111;
        //@formatter:on

		double value = BLEUtils.createSfloat(data, 0);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));

		assertEquals(value, BLEUtils.createSfloat(result, 0), 0);
	}

	@Test
	public void test_sfloatToByteArray_014() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0b01100101;
        data[ 1] = (byte) 0b11110000;
        //@formatter:on

		double value = BLEUtils.createSfloat(data, 0);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));

		assertEquals(value, BLEUtils.createSfloat(result, 0), 0);
	}

	@Test
	public void test_sfloatToByteArray_015() {
		//@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) 0b10011011;
        data[ 1] = (byte) 0b11111111;
        //@formatter:on

		double value = BLEUtils.createSfloat(data, 0);
		byte[] result = BLEUtils.sfloatToByteArray(value);

		assertFalse(BLEUtils.isSfloatNan(result, 0));
		assertFalse(BLEUtils.isSfloatNres(result, 0));
		assertFalse(BLEUtils.isSfloatPositiveInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatNegativeInfinity(result, 0));
		assertFalse(BLEUtils.isSfloatRfu(result, 0));

		assertEquals(value, BLEUtils.createSfloat(result, 0), 0);
	}

	@Test
	public void test_createBigInteger_001() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;

        byte[] reverse = new byte[8];
        reverse[ 0] = 0x08;
        reverse[ 1] = 0x07;
        reverse[ 2] = 0x06;
        reverse[ 3] = 0x05;
        reverse[ 4] = 0x04;
        reverse[ 5] = 0x03;
        reverse[ 6] = 0x02;
        reverse[ 7] = 0x01;
        //@formatter:on

		BigInteger result1 = BLEUtils.createBigInteger(data, 0, 8, true);
		assertEquals(new BigInteger(reverse), result1);
	}

	@Test
	public void test_createBigInteger_002() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0xff;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;

        byte[] reverse = new byte[8];
        reverse[ 0] = 0x08;
        reverse[ 1] = 0x07;
        reverse[ 2] = 0x06;
        reverse[ 3] = 0x05;
        reverse[ 4] = 0x04;
        reverse[ 5] = 0x03;
        reverse[ 6] = 0x02;
        reverse[ 7] = (byte) 0xff;
        //@formatter:on

		BigInteger result1 = BLEUtils.createBigInteger(data, 0, 8, true);
		assertEquals(new BigInteger(1, reverse), result1);
	}

	@Test
	public void test_createBigInteger_003() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;

        byte[] reverse = new byte[8];
        reverse[ 0] = 0x09;
        reverse[ 1] = 0x08;
        reverse[ 2] = 0x07;
        reverse[ 3] = 0x06;
        reverse[ 4] = 0x05;
        reverse[ 5] = 0x04;
        reverse[ 6] = 0x03;
        reverse[ 7] = 0x02;
        //@formatter:on

		BigInteger result1 = BLEUtils.createBigInteger(data, 1, 8, true);
		assertEquals(new BigInteger(reverse), result1);
	}

	@Test
	public void test_createBigInteger_004() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;

        byte[] reverse = new byte[4];
        reverse[ 0] = 0x04;
        reverse[ 1] = 0x03;
        reverse[ 2] = 0x02;
        reverse[ 3] = 0x01;
        //@formatter:on

		BigInteger result1 = BLEUtils.createBigInteger(data, 0, 4, true);
		assertEquals(new BigInteger(reverse), result1);
	}
	
	@Test
	public void test_createBigInteger_005() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = (byte) 0xff;

        byte[] reverse = new byte[8];
        reverse[ 0] = (byte) 0xff;
        reverse[ 1] = 0x07;
        reverse[ 2] = 0x06;
        reverse[ 3] = 0x05;
        reverse[ 4] = 0x04;
        reverse[ 5] = 0x03;
        reverse[ 6] = 0x02;
        reverse[ 7] = 0x01;
        //@formatter:on

		BigInteger result1 = BLEUtils.createBigInteger(data, 0, 8, true);
		assertEquals(new BigInteger(1, reverse), result1);
	}
	
	@Test
	public void test_createBigInteger_101() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;

        byte[] reverse = new byte[8];
        reverse[ 0] = 0x08;
        reverse[ 1] = 0x07;
        reverse[ 2] = 0x06;
        reverse[ 3] = 0x05;
        reverse[ 4] = 0x04;
        reverse[ 5] = 0x03;
        reverse[ 6] = 0x02;
        reverse[ 7] = 0x01;
        //@formatter:on

		BigInteger result1 = BLEUtils.createBigInteger(data, 0, 8, false);
		assertEquals(new BigInteger(reverse), result1);
	}

	@Test
	public void test_createBigInteger_102() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0xff;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;

        byte[] reverse = new byte[8];
        reverse[ 0] = 0x08;
        reverse[ 1] = 0x07;
        reverse[ 2] = 0x06;
        reverse[ 3] = 0x05;
        reverse[ 4] = 0x04;
        reverse[ 5] = 0x03;
        reverse[ 6] = 0x02;
        reverse[ 7] = (byte) 0xff;
        //@formatter:on

		BigInteger result1 = BLEUtils.createBigInteger(data, 0, 8, false);
		assertEquals(new BigInteger(1, reverse), result1);
	}

	@Test
	public void test_createBigInteger_103() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;

        byte[] reverse = new byte[8];
        reverse[ 0] = 0x09;
        reverse[ 1] = 0x08;
        reverse[ 2] = 0x07;
        reverse[ 3] = 0x06;
        reverse[ 4] = 0x05;
        reverse[ 5] = 0x04;
        reverse[ 6] = 0x03;
        reverse[ 7] = 0x02;
        //@formatter:on

		BigInteger result1 = BLEUtils.createBigInteger(data, 1, 8, false);
		assertEquals(new BigInteger(reverse), result1);
	}

	@Test
	public void test_createBigInteger_104() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;

        byte[] reverse = new byte[4];
        reverse[ 0] = 0x04;
        reverse[ 1] = 0x03;
        reverse[ 2] = 0x02;
        reverse[ 3] = 0x01;
        //@formatter:on

		BigInteger result1 = BLEUtils.createBigInteger(data, 0, 4, false);
		assertEquals(new BigInteger(reverse), result1);
	}
	
	@Test
	public void test_createBigInteger_105() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = (byte) 0xff;

        byte[] reverse = new byte[8];
        reverse[ 0] = (byte) 0xff;
        reverse[ 1] = 0x07;
        reverse[ 2] = 0x06;
        reverse[ 3] = 0x05;
        reverse[ 4] = 0x04;
        reverse[ 5] = 0x03;
        reverse[ 6] = 0x02;
        reverse[ 7] = 0x01;
        //@formatter:on

		BigInteger result1 = BLEUtils.createBigInteger(data, 0, 8, false);
		assertEquals(new BigInteger(-1, reverse), result1);
	}

	@Test
	public void test_createLittleEndianByteArrayFromBigInteger_001() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;

        byte[] reverse = new byte[8];
        reverse[ 0] = 0x08;
        reverse[ 1] = 0x07;
        reverse[ 2] = 0x06;
        reverse[ 3] = 0x05;
        reverse[ 4] = 0x04;
        reverse[ 5] = 0x03;
        reverse[ 6] = 0x02;
        reverse[ 7] = 0x01;
        //@formatter:on

		byte[] result1 = BLEUtils.createLittleEndianByteArrayFromBigInteger(new BigInteger(reverse), 8);
		assertArrayEquals(data, result1);
	}

	@Test
	public void test_createLittleEndianByteArrayFromBigInteger_002() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = (byte) 0xff;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;

        byte[] reverse = new byte[8];
        reverse[ 0] = 0x08;
        reverse[ 1] = 0x07;
        reverse[ 2] = 0x06;
        reverse[ 3] = 0x05;
        reverse[ 4] = 0x04;
        reverse[ 5] = 0x03;
        reverse[ 6] = 0x02;
        reverse[ 7] = (byte) 0xff;
        //@formatter:on

		byte[] result1 = BLEUtils.createLittleEndianByteArrayFromBigInteger(new BigInteger(1, reverse), 8);
		assertArrayEquals(data, result1);
	}

	@Test
	public void test_createLittleEndianByteArrayFromBigInteger_003() {
		//@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;

        byte[] reverse = new byte[4];
        reverse[ 0] = 0x04;
        reverse[ 1] = 0x03;
        reverse[ 2] = 0x02;
        reverse[ 3] = 0x01;
        //@formatter:on

		byte[] result1 = BLEUtils.createLittleEndianByteArrayFromBigInteger(new BigInteger(reverse), 4);
		assertArrayEquals(data, result1);
	}

	@Test
	public void test_createCrc_001() {
		//@formatter:off
        byte[] data = new byte[10];
        data[ 0] = 0x3e;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data[ 8] = 0x08;
        data[ 9] = 0x09;
        //@formatter:on

		int result1 = BLEUtils.createCrc(data, 0, data.length);
		assertEquals(0x2F01, result1);
	}

	@Test
	public void test_createCrc_002() {
		//@formatter:off
        byte[] data = new byte[11];
        data[ 0] = 0x3e;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data[ 8] = 0x08;
        data[ 9] = 0x09;
        data[10] = 0x0a;
        //@formatter:on

		int result1 = BLEUtils.createCrc(data, 0, data.length - 1);
		assertEquals(0x2F01, result1);
	}

	@Test
	public void test_createCrc_042() {
		//@formatter:off
        byte[] data = new byte[11];
        data[ 0] = 0x0a;
        data[ 1] = 0x3e;
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data[ 7] = 0x06;
        data[ 8] = 0x07;
        data[ 9] = 0x08;
        data[10] = 0x09;
        //@formatter:on

		int result1 = BLEUtils.createCrc(data, 1, data.length - 1);
		assertEquals(0x2F01, result1);
	}

	@Test
	public void test_convert128to16_001() {
		UUID uuid = UUID.randomUUID();
		int uuid16bit = (int) ((uuid.getMostSignificantBits() >> 32) & 0xffff);

		int result1 = BLEUtils.convert128to16(uuid);
		assertEquals(uuid16bit, result1);
	}

	@Test
	public void test_convert16to128_001() {
		int uuid16bit = 0x01;
		long msb = BLEUtils.BASE_UUID.getMostSignificantBits();
		long lsb = BLEUtils.BASE_UUID.getLeastSignificantBits();
		msb |= ((long) uuid16bit) << 32;
		UUID uuid128bit = new UUID(msb, lsb);

		UUID result1 = BLEUtils.convert16to128(uuid16bit);
		assertEquals(uuid128bit, result1);
	}

}
