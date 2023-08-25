package org.im97mori.ble.characteristic.u2a38;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class BodySensorLocationTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = BodySensorLocation.BODY_SENSOR_LOCATION_OTHER;
        //@formatter:on

        BodySensorLocation result1 = new BodySensorLocation(data);
        assertEquals(BodySensorLocation.BODY_SENSOR_LOCATION_OTHER, result1.getBodySensorLocation());
        assertTrue(result1.isBodySensorLocationOhter());
        assertFalse(result1.isBodySensorLocationChest());
        assertFalse(result1.isBodySensorLocationWrist());
        assertFalse(result1.isBodySensorLocationFinger());
        assertFalse(result1.isBodySensorLocationHand());
        assertFalse(result1.isBodySensorLocationEarLobe());
        assertFalse(result1.isBodySensorLocationFoot());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = BodySensorLocation.BODY_SENSOR_LOCATION_CHEST;
        //@formatter:on

        BodySensorLocation result1 = new BodySensorLocation(data);
        assertEquals(BodySensorLocation.BODY_SENSOR_LOCATION_CHEST, result1.getBodySensorLocation());
        assertFalse(result1.isBodySensorLocationOhter());
        assertTrue(result1.isBodySensorLocationChest());
        assertFalse(result1.isBodySensorLocationWrist());
        assertFalse(result1.isBodySensorLocationFinger());
        assertFalse(result1.isBodySensorLocationHand());
        assertFalse(result1.isBodySensorLocationEarLobe());
        assertFalse(result1.isBodySensorLocationFoot());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = BodySensorLocation.BODY_SENSOR_LOCATION_WRIST;
        //@formatter:on

        BodySensorLocation result1 = new BodySensorLocation(data);
        assertEquals(BodySensorLocation.BODY_SENSOR_LOCATION_WRIST, result1.getBodySensorLocation());
        assertFalse(result1.isBodySensorLocationOhter());
        assertFalse(result1.isBodySensorLocationChest());
        assertTrue(result1.isBodySensorLocationWrist());
        assertFalse(result1.isBodySensorLocationFinger());
        assertFalse(result1.isBodySensorLocationHand());
        assertFalse(result1.isBodySensorLocationEarLobe());
        assertFalse(result1.isBodySensorLocationFoot());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = BodySensorLocation.BODY_SENSOR_LOCATION_FINGER;
        //@formatter:on

        BodySensorLocation result1 = new BodySensorLocation(data);
        assertEquals(BodySensorLocation.BODY_SENSOR_LOCATION_FINGER, result1.getBodySensorLocation());
        assertFalse(result1.isBodySensorLocationOhter());
        assertFalse(result1.isBodySensorLocationChest());
        assertFalse(result1.isBodySensorLocationWrist());
        assertTrue(result1.isBodySensorLocationFinger());
        assertFalse(result1.isBodySensorLocationHand());
        assertFalse(result1.isBodySensorLocationEarLobe());
        assertFalse(result1.isBodySensorLocationFoot());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = BodySensorLocation.BODY_SENSOR_LOCATION_HAND;
        //@formatter:on

        BodySensorLocation result1 = new BodySensorLocation(data);
        assertEquals(BodySensorLocation.BODY_SENSOR_LOCATION_HAND, result1.getBodySensorLocation());
        assertFalse(result1.isBodySensorLocationOhter());
        assertFalse(result1.isBodySensorLocationChest());
        assertFalse(result1.isBodySensorLocationWrist());
        assertFalse(result1.isBodySensorLocationFinger());
        assertTrue(result1.isBodySensorLocationHand());
        assertFalse(result1.isBodySensorLocationEarLobe());
        assertFalse(result1.isBodySensorLocationFoot());
    }

    @Test
    public void test_constructor006() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = BodySensorLocation.BODY_SENSOR_LOCATION_EAR_LOBE;
        //@formatter:on

        BodySensorLocation result1 = new BodySensorLocation(data);
        assertEquals(BodySensorLocation.BODY_SENSOR_LOCATION_EAR_LOBE, result1.getBodySensorLocation());
        assertFalse(result1.isBodySensorLocationOhter());
        assertFalse(result1.isBodySensorLocationChest());
        assertFalse(result1.isBodySensorLocationWrist());
        assertFalse(result1.isBodySensorLocationFinger());
        assertFalse(result1.isBodySensorLocationHand());
        assertTrue(result1.isBodySensorLocationEarLobe());
        assertFalse(result1.isBodySensorLocationFoot());
    }

    @Test
    public void test_constructor007() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = BodySensorLocation.BODY_SENSOR_LOCATION_FOOT;
        //@formatter:on

        BodySensorLocation result1 = new BodySensorLocation(data);
        assertEquals(BodySensorLocation.BODY_SENSOR_LOCATION_FOOT, result1.getBodySensorLocation());
        assertFalse(result1.isBodySensorLocationOhter());
        assertFalse(result1.isBodySensorLocationChest());
        assertFalse(result1.isBodySensorLocationWrist());
        assertFalse(result1.isBodySensorLocationFinger());
        assertFalse(result1.isBodySensorLocationHand());
        assertFalse(result1.isBodySensorLocationEarLobe());
        assertTrue(result1.isBodySensorLocationFoot());
    }

    @Test
    public void test_constructor008() {
        int bodySensorLocation = 1;

        BodySensorLocation result1 = new BodySensorLocation(bodySensorLocation);
        assertEquals(bodySensorLocation, result1.getBodySensorLocation());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = BodySensorLocation.BODY_SENSOR_LOCATION_CHEST;
        //@formatter:on

        BodySensorLocation result1 = new BodySensorLocation(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
