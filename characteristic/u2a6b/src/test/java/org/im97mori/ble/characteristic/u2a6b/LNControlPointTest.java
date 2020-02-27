package org.im97mori.ble.characteristic.u2a6b;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class LNControlPointTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 4), result1.getParameterValue());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_INSTANCE_SPEED_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_INSTANCE_SPEED_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentInstantaneousSpeedLeaveAsDefault());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentInstantaneousSpeedSpeedTurnOff());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_INSTANCE_SPEED_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_INSTANCE_SPEED_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentInstantaneousSpeedLeaveAsDefault());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentInstantaneousSpeedSpeedTurnOff());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_TOTAL_DISTANCE_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_TOTAL_DISTANCE_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentTotalDistanceLeaveAsDefault());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentITotalDistanceSpeedTurnOff());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_TOTAL_DISTANCE_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_TOTAL_DISTANCE_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentTotalDistanceLeaveAsDefault());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentITotalDistanceSpeedTurnOff());
    }

    @Test
    public void test_constructor006() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_LOCATION_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_LOCATION_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentLocationLeaveAsDefault());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentLocationSpeedSpeedTurnOff());
    }

    @Test
    public void test_constructor007() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_LOCATION_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_LOCATION_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentLocationLeaveAsDefault());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentLocationSpeedSpeedTurnOff());
    }

    @Test
    public void test_constructor008() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ELEVATION_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ELEVATION_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentElevationLeaveAsDefault());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentElevationSpeedTurnOff());
    }

    @Test
    public void test_constructor009() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ELEVATION_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ELEVATION_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentElevationLeaveAsDefault());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentElevationSpeedTurnOff());
    }

    @Test
    public void test_constructor010() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_HEADING_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_HEADING_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentHeadingLeaveAsDefault());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentHeadingSpeedTurnOff());
    }

    @Test
    public void test_constructor011() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_HEADING_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_HEADING_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentHeadingLeaveAsDefault());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentHeadingSpeedTurnOff());
    }

    @Test
    public void test_constructor012() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ROLLING_TIME_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ROLLING_TIME_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentRollingTimeLeaveAsDefault());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentRollingTimeTurnOff());
    }

    @Test
    public void test_constructor013() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ROLLING_TIME_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ROLLING_TIME_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentRollingTimeLeaveAsDefault());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentRollingTimeTurnOff());
    }

    @Test
    public void test_constructor014() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_UTC_TIME_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_UTC_TIME_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentUtcTimeLeaveAsDefault());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentUtcTimeSpeedTurnOff());
    }

    @Test
    public void test_constructor015() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_UTC_TIME_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_UTC_TIME_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
        assertFalse(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentUtcTimeLeaveAsDefault());
        assertTrue(result1.isParameterValueMaskLocationAndSpeedCharacteristicContentUtcTimeSpeedTurnOff());
    }

    @Test
    public void test_constructor016() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_00;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_NAVIGATION_CONTROL, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 2), result1.getParameterValue());
    }

    @Test
    public void test_constructor017() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_01;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_NAVIGATION_CONTROL, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 2), result1.getParameterValue());
    }

    @Test
    public void test_constructor018() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_NAVIGATION_CONTROL, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 2), result1.getParameterValue());
    }

    @Test
    public void test_constructor019() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_03;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_NAVIGATION_CONTROL, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 2), result1.getParameterValue());
    }

    @Test
    public void test_constructor020() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_04;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_NAVIGATION_CONTROL, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 2), result1.getParameterValue());
    }

    @Test
    public void test_constructor021() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_05;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_NAVIGATION_CONTROL, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 2), result1.getParameterValue());
    }

    @Test
    public void test_constructor022() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
    }

    @Test
    public void test_constructor023() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
    }

    @Test
    public void test_constructor024() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_SELECT_ROUTE, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 3), result1.getParameterValue());
    }

    @Test
    public void test_constructor025() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 1] = 0x01;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_SET_FIX_RATE, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 2), result1.getParameterValue());
    }

    @Test
    public void test_constructor026() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_SET_ELEVATION, result1.getOpCodes());
        assertArrayEquals(Arrays.copyOfRange(data, 1, 4), result1.getParameterValue());
    }

    @Test
    public void test_constructor027() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_SUCCESS, result1.getResponseValue());
    }

    @Test
    public void test_constructor028() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED, result1.getResponseValue());
    }

    @Test
    public void test_constructor029() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER, result1.getResponseValue());
    }

    @Test
    public void test_constructor030() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED, result1.getResponseValue());
    }

    @Test
    public void test_constructor031() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_SUCCESS, result1.getResponseValue());
    }

    @Test
    public void test_constructor032() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED, result1.getResponseValue());
    }

    @Test
    public void test_constructor033() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER, result1.getResponseValue());
    }

    @Test
    public void test_constructor034() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED, result1.getResponseValue());
    }

    @Test
    public void test_constructor035() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_NAVIGATION_CONTROL, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_SUCCESS, result1.getResponseValue());
    }

    @Test
    public void test_constructor036() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_NAVIGATION_CONTROL, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED, result1.getResponseValue());
    }

    @Test
    public void test_constructor037() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_NAVIGATION_CONTROL, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER, result1.getResponseValue());
    }

    @Test
    public void test_constructor038() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        data[ 3] = 0x01;
        data[ 4] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_SUCCESS, result1.getResponseValue());
        assertArrayEquals(Arrays.copyOfRange(data, 3, 5), result1.getResponseParameter());
    }

    @Test
    public void test_constructor039() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED, result1.getResponseValue());
    }

    @Test
    public void test_constructor040() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER, result1.getResponseValue());
    }

    @Test
    public void test_constructor041() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED, result1.getResponseValue());
    }

    @Test
    public void test_constructor042() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        data[ 3] = 'a';
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_SUCCESS, result1.getResponseValue());
        assertArrayEquals(Arrays.copyOfRange(data, 3, 4), result1.getResponseParameter());
    }

    @Test
    public void test_constructor043() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED, result1.getResponseValue());
    }

    @Test
    public void test_constructor044() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER, result1.getResponseValue());
    }

    @Test
    public void test_constructor045() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED, result1.getResponseValue());
    }

    @Test
    public void test_constructor046() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SELECT_ROUTE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_SUCCESS, result1.getResponseValue());
    }

    @Test
    public void test_constructor047() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SELECT_ROUTE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED, result1.getResponseValue());
    }

    @Test
    public void test_constructor048() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SELECT_ROUTE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER, result1.getResponseValue());
    }

    @Test
    public void test_constructor049() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SELECT_ROUTE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED, result1.getResponseValue());
    }

    @Test
    public void test_constructor050() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_FIX_RATE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_SUCCESS, result1.getResponseValue());
    }

    @Test
    public void test_constructor051() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_FIX_RATE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED, result1.getResponseValue());
    }

    @Test
    public void test_constructor052() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_FIX_RATE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER, result1.getResponseValue());
    }

    @Test
    public void test_constructor053() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_FIX_RATE, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED, result1.getResponseValue());
    }

    @Test
    public void test_constructor054() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_ELEVATION, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_SUCCESS, result1.getResponseValue());
    }

    @Test
    public void test_constructor055() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_ELEVATION, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED, result1.getResponseValue());
    }

    @Test
    public void test_constructor056() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_ELEVATION, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER, result1.getResponseValue());
    }

    @Test
    public void test_constructor057() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertEquals(LNControlPoint.OP_CODES_RESPONSE_CODE, result1.getOpCodes());
        assertEquals(LNControlPoint.OP_CODES_SET_ELEVATION, result1.getRequestOpCode());
        assertEquals(LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED, result1.getResponseValue());
    }

    @Test
    public void test_opCodes001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertTrue(result1.isOpCodesSetCumulativeValue(result1.getOpCodes()));
        assertFalse(result1.isOpCodesMaskLocationAndSpeedCharacteristicContent(result1.getOpCodes()));
        assertFalse(result1.isOpCodesNavigationControl(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNumberOfRoutes(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNameOfRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSelectRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetFixRate(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetElevation(result1.getOpCodes()));
        assertFalse(result1.isOpCodesResponseCode(result1.getOpCodes()));
    }

    @Test
    public void test_opCodes002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_INSTANCE_SPEED_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_INSTANCE_SPEED_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isOpCodesSetCumulativeValue(result1.getOpCodes()));
        assertTrue(result1.isOpCodesMaskLocationAndSpeedCharacteristicContent(result1.getOpCodes()));
        assertFalse(result1.isOpCodesNavigationControl(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNumberOfRoutes(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNameOfRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSelectRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetFixRate(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetElevation(result1.getOpCodes()));
        assertFalse(result1.isOpCodesResponseCode(result1.getOpCodes()));
    }

    @Test
    public void test_opCodes003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_00;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isOpCodesSetCumulativeValue(result1.getOpCodes()));
        assertFalse(result1.isOpCodesMaskLocationAndSpeedCharacteristicContent(result1.getOpCodes()));
        assertTrue(result1.isOpCodesNavigationControl(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNumberOfRoutes(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNameOfRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSelectRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetFixRate(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetElevation(result1.getOpCodes()));
        assertFalse(result1.isOpCodesResponseCode(result1.getOpCodes()));
    }

    @Test
    public void test_opCodes004() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isOpCodesSetCumulativeValue(result1.getOpCodes()));
        assertFalse(result1.isOpCodesMaskLocationAndSpeedCharacteristicContent(result1.getOpCodes()));
        assertFalse(result1.isOpCodesNavigationControl(result1.getOpCodes()));
        assertTrue(result1.isOpCodesRequestNumberOfRoutes(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNameOfRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSelectRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetFixRate(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetElevation(result1.getOpCodes()));
        assertFalse(result1.isOpCodesResponseCode(result1.getOpCodes()));
    }

    @Test
    public void test_opCodes005() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isOpCodesSetCumulativeValue(result1.getOpCodes()));
        assertFalse(result1.isOpCodesMaskLocationAndSpeedCharacteristicContent(result1.getOpCodes()));
        assertFalse(result1.isOpCodesNavigationControl(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNumberOfRoutes(result1.getOpCodes()));
        assertTrue(result1.isOpCodesRequestNameOfRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSelectRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetFixRate(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetElevation(result1.getOpCodes()));
        assertFalse(result1.isOpCodesResponseCode(result1.getOpCodes()));
    }

    @Test
    public void test_opCodes006() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isOpCodesSetCumulativeValue(result1.getOpCodes()));
        assertFalse(result1.isOpCodesMaskLocationAndSpeedCharacteristicContent(result1.getOpCodes()));
        assertFalse(result1.isOpCodesNavigationControl(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNumberOfRoutes(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNameOfRoute(result1.getOpCodes()));
        assertTrue(result1.isOpCodesSelectRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetFixRate(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetElevation(result1.getOpCodes()));
        assertFalse(result1.isOpCodesResponseCode(result1.getOpCodes()));
    }

    @Test
    public void test_opCodes007() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 1] = 0x01;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isOpCodesSetCumulativeValue(result1.getOpCodes()));
        assertFalse(result1.isOpCodesMaskLocationAndSpeedCharacteristicContent(result1.getOpCodes()));
        assertFalse(result1.isOpCodesNavigationControl(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNumberOfRoutes(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNameOfRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSelectRoute(result1.getOpCodes()));
        assertTrue(result1.isOpCodesSetFixRate(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetElevation(result1.getOpCodes()));
        assertFalse(result1.isOpCodesResponseCode(result1.getOpCodes()));
    }

    @Test
    public void test_opCodes008() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isOpCodesSetCumulativeValue(result1.getOpCodes()));
        assertFalse(result1.isOpCodesMaskLocationAndSpeedCharacteristicContent(result1.getOpCodes()));
        assertFalse(result1.isOpCodesNavigationControl(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNumberOfRoutes(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNameOfRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSelectRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetFixRate(result1.getOpCodes()));
        assertTrue(result1.isOpCodesSetElevation(result1.getOpCodes()));
        assertFalse(result1.isOpCodesResponseCode(result1.getOpCodes()));
    }

    @Test
    public void test_opCodes009() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isOpCodesSetCumulativeValue(result1.getOpCodes()));
        assertFalse(result1.isOpCodesMaskLocationAndSpeedCharacteristicContent(result1.getOpCodes()));
        assertFalse(result1.isOpCodesNavigationControl(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNumberOfRoutes(result1.getOpCodes()));
        assertFalse(result1.isOpCodesRequestNameOfRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSelectRoute(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetFixRate(result1.getOpCodes()));
        assertFalse(result1.isOpCodesSetElevation(result1.getOpCodes()));
        assertTrue(result1.isOpCodesResponseCode(result1.getOpCodes()));
    }

    @Test
    public void test_responseValue001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertTrue(result1.isResponseValueSuccess(result1.getResponseValue()));
        assertFalse(result1.isResponseValueOpCodeNotSupported(result1.getResponseValue()));
        assertFalse(result1.isResponseValueInvalidParameter(result1.getResponseValue()));
        assertFalse(result1.isResponseValueOperationFailed(result1.getResponseValue()));
    }

    @Test
    public void test_responseValue002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isResponseValueSuccess(result1.getResponseValue()));
        assertTrue(result1.isResponseValueOpCodeNotSupported(result1.getResponseValue()));
        assertFalse(result1.isResponseValueInvalidParameter(result1.getResponseValue()));
        assertFalse(result1.isResponseValueOperationFailed(result1.getResponseValue()));
    }

    @Test
    public void test_responseValue003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isResponseValueSuccess(result1.getResponseValue()));
        assertFalse(result1.isResponseValueOpCodeNotSupported(result1.getResponseValue()));
        assertTrue(result1.isResponseValueInvalidParameter(result1.getResponseValue()));
        assertFalse(result1.isResponseValueOperationFailed(result1.getResponseValue()));
    }

    @Test
    public void test_responseValue004() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertFalse(result1.isResponseValueSuccess(result1.getResponseValue()));
        assertFalse(result1.isResponseValueOpCodeNotSupported(result1.getResponseValue()));
        assertFalse(result1.isResponseValueInvalidParameter(result1.getResponseValue()));
        assertTrue(result1.isResponseValueOperationFailed(result1.getResponseValue()));
    }

    @Test
    public void test_parcelable101() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_INSTANCE_SPEED_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_INSTANCE_SPEED_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable103() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_INSTANCE_SPEED_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_INSTANCE_SPEED_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable104() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_TOTAL_DISTANCE_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_TOTAL_DISTANCE_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable105() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_TOTAL_DISTANCE_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_TOTAL_DISTANCE_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable106() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_LOCATION_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_LOCATION_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable107() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_LOCATION_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_LOCATION_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable108() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ELEVATION_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ELEVATION_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable109() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ELEVATION_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ELEVATION_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable110() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_HEADING_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_HEADING_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable111() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_HEADING_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_HEADING_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable112() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ROLLING_TIME_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ROLLING_TIME_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable113() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ROLLING_TIME_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_ROLLING_TIME_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable114() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_UTC_TIME_LEAVE_AS_DEFAULT;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_UTC_TIME_LEAVE_AS_DEFAULT >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable115() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_UTC_TIME_TURN_OFF;
        data[ 2] = LNControlPoint.PARAMETER_VALUE_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_UTC_TIME_TURN_OFF >> 8;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable116() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_00;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable117() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_01;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable118() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable119() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_03;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable120() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_04;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable121() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 1] = LNControlPoint.PARAMETER_VALUE_NAVIGATION_CONTROL_05;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable122() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable123() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable124() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable125() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 1] = 0x01;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable126() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable127() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable128() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable129() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable130() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_CUMULATIVE_VALUE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable131() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable132() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable133() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable134() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_MASK_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable135() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable136() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable137() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_NAVIGATION_CONTROL;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable138() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        data[ 3] = 0x01;
        data[ 4] = 0x02;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable139() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable140() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable141() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NUMBER_OF_ROUTES;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable142() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        data[ 3] = 'a';
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable143() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable144() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable145() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_REQUEST_NAME_OF_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable146() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable147() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable148() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable149() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SELECT_ROUTE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable150() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable151() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable152() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable153() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_FIX_RATE;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable154() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_SUCCESS;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable155() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable156() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_INVALID_PARAMETER;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable157() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = LNControlPoint.OP_CODES_RESPONSE_CODE;
        data[ 1] = LNControlPoint.OP_CODES_SET_ELEVATION;
        data[ 2] = LNControlPoint.RESPONSE_VALUE_OPERATION_FAILED;
        //@formatter:on

        LNControlPoint result1 = new LNControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
