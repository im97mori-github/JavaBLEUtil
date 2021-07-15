package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

public class IEEE_11073_20601_FLOATest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0x7f;
        data[ 3] = (byte) 0x00;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(data, 0);

        assertTrue(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x00;
        data[ 1] = (byte) 0x00;
        data[ 2] = (byte) 0x80;
        data[ 3] = (byte) 0x00;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(data, 0);

        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertTrue(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xfe;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0x7f;
        data[ 3] = (byte) 0x00;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(data, 0);

        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertTrue(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x02;
        data[ 1] = (byte) 0x00;
        data[ 2] = (byte) 0x80;
        data[ 3] = (byte) 0x00;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(data, 0);

        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertTrue(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x01;
        data[ 1] = (byte) 0x00;
        data[ 2] = (byte) 0x80;
        data[ 3] = (byte) 0x00;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(data, 0);

        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertTrue(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor006() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x00;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(data, 0);

        BigDecimal bd = BigDecimal.valueOf(0x030201);
        bd = bd.round(new MathContext(8, RoundingMode.DOWN));
        assertEquals(bd.doubleValue(), BLEUtils.createFloat(result1.getData(), 0), 0);
        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor007() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(data, 0);

        BigDecimal bd = BigDecimal.valueOf(0x030201);
        bd = bd.scaleByPowerOfTen(4);
        bd = bd.round(new MathContext(8, RoundingMode.DOWN));
        assertEquals(bd.doubleValue(), BLEUtils.createFloat(result1.getData(), 0), 0);
        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor008() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = (byte) 0xff;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(data, 0);

        BigDecimal bd = BigDecimal.valueOf(0x030201);
        bd = bd.scaleByPowerOfTen(-1);
        bd = bd.round(new MathContext(8, RoundingMode.DOWN));
        assertEquals(bd.doubleValue(), BLEUtils.createFloat(result1.getData(), 0), 0);
        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor009() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x00;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(data, 1);

        BigDecimal bd = BigDecimal.valueOf(0x040302);
        bd = bd.round(new MathContext(8, RoundingMode.DOWN));
        assertEquals(bd.doubleValue(), BLEUtils.createFloat(result1.getData(), 0), 0);
        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor101() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xff;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0x7f;
        data[ 3] = (byte) 0x00;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(Double.NaN);

        assertTrue(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor103() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0xfe;
        data[ 1] = (byte) 0xff;
        data[ 2] = (byte) 0x7f;
        data[ 3] = (byte) 0x00;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(Double.POSITIVE_INFINITY);

        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertTrue(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor104() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 0x02;
        data[ 1] = (byte) 0x00;
        data[ 2] = (byte) 0x80;
        data[ 3] = (byte) 0x00;
        //@formatter:on

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(Double.NEGATIVE_INFINITY);

        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertTrue(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor106() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x00;
        //@formatter:on

        BigDecimal bd = BigDecimal.valueOf(0x030201);
        bd = bd.round(new MathContext(8, RoundingMode.DOWN));

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(bd.doubleValue());

        assertEquals(bd.doubleValue(), result1.getFloat(), 0);
        assertArrayEquals(data, result1.getData());
        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor107() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        BigDecimal bd = BigDecimal.valueOf(0x030201);
        bd = bd.scaleByPowerOfTen(4);
        bd = bd.round(new MathContext(8, RoundingMode.DOWN));

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(bd.doubleValue());

        assertEquals(bd.doubleValue(), result1.getFloat(), 0);
        assertArrayEquals(data, result1.getData());
        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor108() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = (byte) 0xff;
        //@formatter:on

        BigDecimal bd = BigDecimal.valueOf(0x030201);
        bd = bd.scaleByPowerOfTen(-1);
        bd = bd.round(new MathContext(8, RoundingMode.DOWN));

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(bd.doubleValue());

        assertEquals(bd.doubleValue(), result1.getFloat(), 0);
        assertArrayEquals(data, result1.getData());
        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

    @Test
    public void test_constructor109() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x00;
        //@formatter:on

        BigDecimal bd = BigDecimal.valueOf(0x040302);
        bd = bd.round(new MathContext(8, RoundingMode.DOWN));

        IEEE_11073_20601_FLOAT result1 = new IEEE_11073_20601_FLOAT(bd.doubleValue());

        assertEquals(bd.doubleValue(), result1.getFloat(), 0);
        assertArrayEquals(Arrays.copyOfRange(data, 1, 5), result1.getData());
        assertFalse(BLEUtils.isFloatNan(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNres(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatPositiveInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatNegativeInfinity(result1.getData(), 0));
        assertFalse(BLEUtils.isFloatRfu(result1.getData(), 0));
    }

}
