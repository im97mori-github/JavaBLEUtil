package org.im97mori.ble;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

import com.github.snksoft.crc.CRC;
import com.github.snksoft.crc.CRC.Parameters;

import androidx.annotation.NonNull;

/**
 * BLE Core Utilities
 */
public class BLEUtils {

	/**
	 * ISO/IEEE Std. 11073-20601™-2008 FLOAT NaN (Not a Number)
	 */
	public static final int FLOAT_NAN = 0x007FFFFF;

	/**
	 * ISO/IEEE Std. 11073-20601™-2008 FLOAT NRes (Not at this Resolution)
	 */
	public static final int FLOAT_NRES = 0x00800000;

	/**
	 * ISO/IEEE Std. 11073-20601™-2008 FLOAT + INFINITY
	 */
	public static final int FLOAT_POSITIVE_INFINITY = 0x007FFFFE;

	/**
	 * ISO/IEEE Std. 11073-20601™-2008 FLOAT – INFINITY
	 */
	public static final int FLOAT_NEGATIVE_INFINITY = 0x00800002;

	/**
	 * ISO/IEEE Std. 11073-20601™-2008 FLOAT Reserved for future use
	 */
	public static final int FLOAT_RFU = 0x00800001;

	/**
	 * ISO/IEEE Std. 11073-20601™-2008 SFLOAT NaN (Not a Number)
	 */
	public static final int SFLOAT_NAN = 0x07ff;

	/**
	 * ISO/IEEE Std. 11073-20601™-2008 SFLOAT NRes (Not at this Resolution)
	 */
	public static final int SFLOAT_NRES = 0x0800;

	/**
	 * ISO/IEEE Std. 11073-20601™-2008 SFLOAT + INFINITY
	 */
	public static final int SFLOAT_POSITIVE_INFINITY = 0x07fe;

	/**
	 * ISO/IEEE Std. 11073-20601™-2008 SFLOAT – INFINITY
	 */
	public static final int SFLOAT_NEGATIVE_INFINITY = 0x0802;

	/**
	 * ISO/IEEE Std. 11073-20601™-2008 SFLOAT Reserved for future use
	 */
	public static final int SFLOAT_RFU = 0x0801;

	/**
	 * CRC Parameters
	 */
	public static final Parameters CRC_PARAMETERS = new Parameters(16, 0x1021, 0x00FFFF, true, true, 0x0);

	/**
	 * <p>
	 * BASE UUID
	 * <p>
	 * Core Specification v5.3 Vol 3 Part B 2.5.1
	 * </p>
	 */
	public static final UUID BASE_UUID = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

	// Format Types Revision Date: 2021-05-14

	/**
	 * create boolean (0x01)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 1-bit; 0 = false, 1 = true
	 */
	public static int createBoolean(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 1, Byte.SIZE / 8).get() & 0x00000001;
	}

	/**
	 * create unsigned 2-bit integer (0x02)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 2-bit integer
	 */
	public static int createUInt2(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 1, Byte.SIZE / 8).get() & 0x00000003;
	}

	/**
	 * create unsigned 4-bit integer (0x03)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 4-bit integer
	 */
	public static int createUInt4(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 1, Byte.SIZE / 8).get() & 0x0000000f;
	}

	/**
	 * create unsigned 8-bit integer (0x04)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 8-bit integer
	 */
	public static int createUInt8(@NonNull byte[] data, int offset) {
		return createSInt8(data, offset) & 0x000000ff;
	}

	/**
	 * create unsigned 12-bit integer (0x05)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 12-bit integer
	 * 
	 * @see #createUInt12(byte[], int, int)
	 */
	public static int createUInt12(@NonNull byte[] data, int offset) {
		return createUInt12(data, offset, 0);
	}

	/**
	 * create unsigned 12-bit integer (0x05)
	 *
	 * @param data        byte array from <a href=
	 *                    "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *                    or <a href=
	 *                    "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset      data offset
	 * @param shiftOffset shift offset
	 * @return unsigned 12-bit integer
	 */
	public static int createUInt12(@NonNull byte[] data, int offset, int shiftOffset) {
		return createSInt12(data, offset, shiftOffset) & 0x00000fff;
	}

	/**
	 * create unsigned 16-bit integer (0x06)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 16-bit integer
	 */
	public static int createUInt16(@NonNull byte[] data, int offset) {
		return createSInt16(data, offset) & 0x0000ffff;
	}

	/**
	 * create unsigned 24-bit integer (0x07)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 24-bit integer
	 */
	public static int createUInt24(@NonNull byte[] data, int offset) {
		return createSInt24(data, offset) & 0x00ffffff;
	}

	/**
	 * create unsigned 32-bit integer (0x08)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 32-bit integer
	 */
	public static long createUInt32(@NonNull byte[] data, int offset) {
		return createSInt32(data, offset) & 0xffffffffL;
	}

	/**
	 * <p>
	 * create unsigned 40-bit integer
	 * <p>
	 * Supplement to the Bluetooth Core Specification v10 1.21 BIG INFO
	 * </p>
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 40-bit integer
	 */
	public static long createUInt40(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 5, Long.SIZE / 8).getLong() & 0xffffffffffL;
	}

	/**
	 * create unsigned 48-bit integer (0x09)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 48-bit integer
	 */
	public static long createUInt48(@NonNull byte[] data, int offset) {
		return createSInt48(data, offset) & 0xffffffffffffL;
	}

	/**
	 * create unsigned 64-bit integer (0x0A)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 64-bit integer
	 */
	public static BigInteger createUInt64(@NonNull byte[] data, int offset) {
		return createBigInteger(data, offset, 8, true);
	}

	/**
	 * create unsigned 128-bit integer (0x0B)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return unsigned 128-bit {@link BigInteger}
	 */
	public static BigInteger createUInt128(@NonNull byte[] data, int offset) {
		return createBigInteger(data, offset, 16, true);
	}

	/**
	 * create signed 8-bit integer (0x0C)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return signed 8-bit integer
	 */
	public static int createSInt8(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 1, Byte.SIZE / 8).get();
	}

	/**
	 * create signed 12-bit integer (0x0D)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return signed 12-bit integer
	 * 
	 * @see #createSInt12(byte[], int, int)
	 */
	public static int createSInt12(@NonNull byte[] data, int offset) {
		return createSInt12(data, offset, 0);
	}

	/**
	 * create signed 12-bit integer (0x0D)
	 *
	 * @param data        byte array from <a href=
	 *                    "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *                    or <a href=
	 *                    "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset      data offset
	 * @param shiftOffset shift offset
	 * @return signed 12-bit integer
	 */
	public static int createSInt12(@NonNull byte[] data, int offset, int shiftOffset) {
		return createByteBuffer(data, offset + (shiftOffset / 8), 2, Short.SIZE / 8)
				.getShort() << (20 - shiftOffset % 8) >> 20;
	}

	/**
	 * create signed 16-bit integer (0x0E)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return signed 16-bit integer
	 */
	public static int createSInt16(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 2, Short.SIZE / 8).getShort();
	}

	/**
	 * create signed 24-bit integer (0x0F)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return signed 24-bit integer
	 */
	public static int createSInt24(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 3, Integer.SIZE / 8).getInt() << 8 >> 8;
	}

	/**
	 * create signed 32-bit integer (0x10)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return signed 32-bit integer
	 */
	public static int createSInt32(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 4, Integer.SIZE / 8).getInt();
	}

	/**
	 * create signed 48-bit integer (0x11)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return signed 48-bit integer
	 */
	public static long createSInt48(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 6, Long.SIZE / 8).getLong() << 16 >> 16;
	}

	/**
	 * create signed 64-bit integer (0x12)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return signed 64-bit integer
	 */
	public static long createSInt64(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 8, Long.SIZE / 8).getLong();
	}

	/**
	 * create signed 128-bit integer (0x13)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return signed 128-bit {@link BigInteger}
	 */
	public static BigInteger createSInt128(@NonNull byte[] data, int offset) {
		return createBigInteger(data, offset, 16, false);
	}

	/**
	 * create IEEE-754 32-bit floating point (0x14)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return IEEE-754 32-bit floating point
	 */
	public static float createFloat32(@NonNull byte[] data, int offset) {
		return Float.intBitsToFloat(createSInt32(data, offset));
	}

	/**
	 * create IEEE-754 64-bit floating point (0x14)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return IEEE-754 64-bit floating point
	 */
	public static double createFloat64(@NonNull byte[] data, int offset) {
		return Double.longBitsToDouble(createSInt64(data, offset));
	}

	/**
	 * create IEEE-11073 32-bit FLOAT mantissa
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return IEEE-11073 32-bit FLOAT mantissa
	 */
	public static int createFloatMantissa(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 3, Integer.SIZE / 8).getInt() << 8 >> 8;
	}

	/**
	 * create IEEE-11073 32-bit FLOAT exponent
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return IEEE-11073 32-bit SFLOAT exponent
	 */
	public static int createFloatExponent(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset + 3, 1, Integer.SIZE / 8).getInt() << 24 >> 24;
	}

	/**
	 * create IEEE-11073 32-bit FLOAT (0x17)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return IEEE-11073 32-bit FLOAT
	 */
	public static double createFloat(@NonNull byte[] data, int offset) {
		BigDecimal bd = BigDecimal
				.valueOf(createFloatMantissa(data, offset) * Math.pow(10, createFloatExponent(data, offset)));
		bd = bd.round(new MathContext(8, RoundingMode.DOWN));
		return bd.doubleValue();
	}

	/**
	 * convert double value to IEEE-11073 32-bit FLOAT
	 * 
	 * @param value target value
	 * @return IEEE-11073 32-bit FLOAT byte array
	 */
	// TODO need more test pattern
	public static byte[] floatToByteArray(double value) {
		ByteBuffer bb = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
		if (Double.isNaN(value)) {
			bb.putInt(FLOAT_NAN);
		} else if (Double.POSITIVE_INFINITY == value) {
			bb.putInt(FLOAT_POSITIVE_INFINITY);
		} else if (Double.NEGATIVE_INFINITY == value) {
			bb.putInt(FLOAT_NEGATIVE_INFINITY);
		} else {
			DecimalFormat formatter = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
			formatter.setGroupingUsed(false);
			formatter.setMaximumFractionDigits(129);
			formatter.setMinimumFractionDigits(0);
			formatter.setMaximumIntegerDigits(128);
			formatter.setMinimumIntegerDigits(1);
			formatter.setDecimalSeparatorAlwaysShown(false);
			formatter.setNegativePrefix("");

			String formattedValue = formatter.format(value);

			int length = formattedValue.length();
			int decimalSeparatorIndex = formattedValue.indexOf('.');

			int exponent10;
			if (decimalSeparatorIndex == -1) {
				int firstZeroIndex = formattedValue.indexOf('0');
				if (firstZeroIndex == -1) {
					exponent10 = 0;
				} else {
					exponent10 = length - firstZeroIndex;
				}
			} else {
				exponent10 = decimalSeparatorIndex - length + 1;
			}
			if (exponent10 > 127 || exponent10 < -128) {
				bb.putInt(FLOAT_NRES);
			} else {
				double multipiler = Math.pow(10, exponent10);
				value /= multipiler;
				value = Math.round(value);
				int mantissa = (int) value;
				if (mantissa > 0x7FFFFE) {
					bb.putInt(FLOAT_NRES);
				} else if (mantissa < 0xFF800000) {
					bb.putInt(FLOAT_NRES);
				} else {
					bb.put((byte) mantissa);
					bb.put((byte) (mantissa >> 8));
					bb.put((byte) (mantissa >> 16));
					bb.put((byte) exponent10);
				}
			}
		}
		return bb.array();
	}

	/**
	 * convert double value to IEEE-11073 16-bit SFLOAT
	 * 
	 * @param value target value
	 * @return IEEE-11073 16-bit SFLOAT byte array
	 */
	// TODO need more test pattern
	public static byte[] sfloatToByteArray(double value) {
		ByteBuffer bb = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
		if (Double.isNaN(value)) {
			bb.putShort((short) SFLOAT_NAN);
		} else if (Double.POSITIVE_INFINITY == value) {
			bb.putShort((short) SFLOAT_POSITIVE_INFINITY);
		} else if (Double.NEGATIVE_INFINITY == value) {
			bb.putShort((short) SFLOAT_NEGATIVE_INFINITY);
		} else {
			DecimalFormat formatter = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
			formatter.setGroupingUsed(false);
			formatter.setMaximumFractionDigits(9);
			formatter.setMinimumFractionDigits(0);
			formatter.setMaximumIntegerDigits(8);
			formatter.setMinimumIntegerDigits(1);
			formatter.setDecimalSeparatorAlwaysShown(false);
			formatter.setNegativePrefix("");

			String formattedValue = formatter.format(value);

			int length = formattedValue.length();
			int decimalSeparatorIndex = formattedValue.indexOf('.');

			int exponent10;
			if (decimalSeparatorIndex == -1) {
				int firstZeroIndex = formattedValue.indexOf('0');
				if (firstZeroIndex == -1) {
					exponent10 = 0;
				} else {
					exponent10 = length - firstZeroIndex;
				}
			} else {
				exponent10 = decimalSeparatorIndex - length + 1;
			}
			if (exponent10 > 7 || exponent10 < -8) {
				bb.putShort((short) SFLOAT_NRES);
			} else {
				double multipiler = Math.pow(10, exponent10);
				value /= multipiler;
				value = Math.round(value);
				int mantissa = (int) value;
				if (mantissa > 0x07FE) {
					bb.putShort((short) SFLOAT_NRES);
				} else if (mantissa < 0xFFFFF800) {
					bb.putShort((short) SFLOAT_NRES);
				} else {
					bb.put((byte) mantissa);
					int combine = (int) exponent10;
					combine &= 0xF;
					combine <<= 4;
					combine |= ((mantissa >> 8) & 0xF);
					bb.put((byte) combine);
				}
			}
		}
		return bb.array();
	}

	/**
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 FLOAT NaN (Not a
	 *         Number), {@code false}:not ISO/IEEE Std. 11073-20601™-2008 FLOAT NaN
	 *         (Not a Number)
	 */
	public static boolean isFloatNan(@NonNull byte[] data, int offset) {
		int sfloat = createByteBuffer(data, offset, 4, Integer.SIZE / 8).getInt();
		return FLOAT_NAN == sfloat;
	}

	/**
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 FLOAT NRes (Not at this
	 *         Resolution), {@code false}:not ISO/IEEE Std. 11073-20601™-2008 FLOAT
	 *         NRes (Not at this Resolution)
	 */
	public static boolean isFloatNres(@NonNull byte[] data, int offset) {
		int sfloat = createByteBuffer(data, offset, 4, Integer.SIZE / 8).getInt();
		return FLOAT_NRES == sfloat;
	}

	/**
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 FLOAT + INFINITY,
	 *         {@code false}:not ISO/IEEE Std. 11073-20601™-2008 FLOAT + INFINITY
	 */
	public static boolean isFloatPositiveInfinity(@NonNull byte[] data, int offset) {
		int sfloat = createByteBuffer(data, offset, 4, Integer.SIZE / 8).getInt();
		return FLOAT_POSITIVE_INFINITY == sfloat;
	}

	/**
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 FLOAT – INFINITY,
	 *         {@code false}:not ISO/IEEE Std. 11073-20601™-2008 FLOAT – INFINITY
	 */
	public static boolean isFloatNegativeInfinity(@NonNull byte[] data, int offset) {
		int sfloat = createByteBuffer(data, offset, 4, Integer.SIZE / 8).getInt();
		return FLOAT_NEGATIVE_INFINITY == sfloat;
	}

	/**
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 FLOAT Reserved for
	 *         future use, {@code false}:not ISO/IEEE Std. 11073-20601™-2008 FLOAT
	 *         Reserved for future use
	 */
	public static boolean isFloatRfu(@NonNull byte[] data, int offset) {
		int sfloat = createByteBuffer(data, offset, 4, Integer.SIZE / 8).getInt();
		return FLOAT_RFU == sfloat;
	}

	/**
	 * create IEEE-11073 16-bit SFLOAT mantissa
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return IEEE-11073 16-bit SFLOAT mantissa
	 */
	public static int createSfloatMantissa(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset, 2, Integer.SIZE / 8).getInt() << 20 >> 20;
	}

	/**
	 * create IEEE-11073 16-bit SFLOAT exponent
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return IEEE-11073 16-bit SFLOAT exponent
	 */
	public static int createSfloatExponent(@NonNull byte[] data, int offset) {
		return createByteBuffer(data, offset + 1, 1, Integer.SIZE / 8).getInt() << 24 >> 28;
	}

	/**
	 * create IEEE-11073 16-bit SFLOAT (0x16)
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return IEEE-11073 16-bit SFLOAT
	 */
	public static double createSfloat(@NonNull byte[] data, int offset) {
		BigDecimal bd = BigDecimal
				.valueOf(createSfloatMantissa(data, offset) * Math.pow(10, createSfloatExponent(data, offset)));
		bd = bd.round(new MathContext(5, RoundingMode.DOWN));
		return bd.doubleValue();
	}

	/**
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 SFLOAT NaN (Not a
	 *         Number), {@code false}:not ISO/IEEE Std. 11073-20601™-2008 SFLOAT NaN
	 *         (Not a Number)
	 */
	public static boolean isSfloatNan(@NonNull byte[] data, int offset) {
		int sfloat = createByteBuffer(data, offset, 2, Integer.SIZE / 8).getInt();
		return SFLOAT_NAN == sfloat;
	}

	/**
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 SFLOAT NRes (Not at this
	 *         Resolution), {@code false}:not ISO/IEEE Std. 11073-20601™-2008 SFLOAT
	 *         NRes (Not at this Resolution)
	 */
	public static boolean isSfloatNres(@NonNull byte[] data, int offset) {
		int sfloat = createByteBuffer(data, offset, 2, Integer.SIZE / 8).getInt();
		return SFLOAT_NRES == sfloat;
	}

	/**
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 SFLOAT + INFINITY,
	 *         {@code false}:not ISO/IEEE Std. 11073-20601™-2008 SFLOAT + INFINITY
	 */
	public static boolean isSfloatPositiveInfinity(@NonNull byte[] data, int offset) {
		int sfloat = createByteBuffer(data, offset, 2, Integer.SIZE / 8).getInt();
		return SFLOAT_POSITIVE_INFINITY == sfloat;
	}

	/**
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 SFLOAT – INFINITY,
	 *         {@code false}:not ISO/IEEE Std. 11073-20601™-2008 SFLOAT – INFINITY
	 */
	public static boolean isSfloatNegativeInfinity(@NonNull byte[] data, int offset) {
		int sfloat = createByteBuffer(data, offset, 2, Integer.SIZE / 8).getInt();
		return SFLOAT_NEGATIVE_INFINITY == sfloat;
	}

	/**
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *               or <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset data offset
	 * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 SFLOAT Reserved for
	 *         future use, {@code false}:not ISO/IEEE Std. 11073-20601™-2008 SFLOAT
	 *         Reserved for future use
	 */
	public static boolean isSfloatRfu(@NonNull byte[] data, int offset) {
		int sfloat = createByteBuffer(data, offset, 2, Integer.SIZE / 8).getInt();
		return SFLOAT_RFU == sfloat;
	}

	/**
	 * Create {@link BigInteger} instance
	 *
	 * @param data     byte array from <a href=
	 *                 "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 *                 or <a href=
	 *                 "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 * @param offset   offset for time counter 8bytes data
	 * @param length   second parameter length of
	 *                 {@link BigInteger#BigInteger(int, byte[])}
	 * @param unsigned {@code true}:unsigned, {@code false}:signed
	 * @return {@link BigInteger} instance
	 */
	public static BigInteger createBigInteger(@NonNull byte[] data, int offset, int length, boolean unsigned) {
		// little to big endian
		byte[] reversed = new byte[length];
		for (int i = 0; i < length; i++) {
			reversed[i] = data[length - i - 1 + offset];
		}
		BigInteger result;
		if (unsigned) {
			result = new BigInteger(1, reversed);
		} else {
			if ((reversed[0] & 0b10000000) == 0) {
				result = new BigInteger(1, reversed);
			} else {
				result = new BigInteger(-1, reversed);
			}
		}
		return result;
	}

	/**
	 * Create little-endian byte array from {@link BigInteger}
	 *
	 * @param bigInteger original BigInteger instance
	 * @param length     byte array length
	 * @return little-endian byte array
	 */
	public static byte[] createLittleEndianByteArrayFromBigInteger(@NonNull BigInteger bigInteger, int length) {
		byte[] original = bigInteger.toByteArray();
		byte[] data = new byte[length];
		if (bigInteger.signum() == -1) {
			Arrays.fill(data, (byte) -1);
		}
		for (int i = 0; i < original.length; i++) {
			data[i] = original[original.length - i - 1];
		}
		return data;
	}

	/**
	 * Create CRC
	 * 
	 * @param data   original data array
	 * @param offset data offset
	 * @param length data length
	 * @return crc
	 */
	public static int createCrc(@NonNull byte[] data, int offset, int length) {
		return (int) CRC.calculateCRC(CRC_PARAMETERS, Arrays.copyOfRange(data, offset, offset + length));
	}

	/**
	 * convert 128bit UUID to 16bit UUID
	 * 
	 * @param uuid 128bit UUID
	 * @return 16bit UUID
	 */
	public static int convert128to16(UUID uuid) {
		long msb = uuid.getMostSignificantBits();
		return (int) ((msb >> 32) & 0xffff);
	}

	/**
	 * convert 16bit UUID to 128bit UUID
	 * 
	 * @param uuid 16bit UUID
	 * @return 128bit UUID
	 */
	public static UUID convert16to128(int uuid) {
		long msb = BASE_UUID.getMostSignificantBits();
		return new UUID(msb | (((long) uuid) << 32), BASE_UUID.getLeastSignificantBits());
	}

	/**
	 * create int from byte array
	 *
	 * @param data         byte array
	 * @param offset       data offset
	 * @param inputLength  input length from offset
	 * @param outputLength output length
	 * @return {@link ByteOrder#LITTLE_ENDIAN} {@link ByteBuffer} instance
	 */
	private static ByteBuffer createByteBuffer(@NonNull byte[] data, int offset, int inputLength, int outputLength) {
		ByteBuffer buffer = ByteBuffer.allocate(outputLength).order(ByteOrder.LITTLE_ENDIAN).put(data, offset,
				inputLength);
		((Buffer) buffer).position(0); // for android
		return buffer;
	}

}
