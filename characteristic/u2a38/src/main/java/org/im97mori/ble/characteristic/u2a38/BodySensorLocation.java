package org.im97mori.ble.characteristic.u2a38;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Body Sensor Location (Characteristics UUID: 0x2A38)
 */
public class BodySensorLocation implements ByteArrayInterface {

    /**
     * 0: Other
     */
    public static final int BODY_SENSOR_LOCATION_OTHER = 0;

    /**
     * 1: Chest
     */
    public static final int BODY_SENSOR_LOCATION_CHEST = 1;

    /**
     * 2: Wrist
     */
    public static final int BODY_SENSOR_LOCATION_WRIST = 2;

    /**
     * 3: Finger
     */
    public static final int BODY_SENSOR_LOCATION_FINGER = 3;

    /**
     * 4: Hand
     */
    public static final int BODY_SENSOR_LOCATION_HAND = 4;

    /**
     * 5: Ear Lobe
     */
    public static final int BODY_SENSOR_LOCATION_EAR_LOBE = 5;

    /**
     * 6: Foot
     */
    public static final int BODY_SENSOR_LOCATION_FOOT = 6;

    /**
     * Body Sensor Location
     */
    private final int mBodySensorLocation;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public BodySensorLocation(@NonNull byte[] values) {
        mBodySensorLocation = values[0];
    }

    /**
     * Constructor from parameters
     * 
     * @param bodySensorLocation Body Sensor Location
     */
    public BodySensorLocation(int bodySensorLocation) {
        mBodySensorLocation = bodySensorLocation;
    }

    /**
     * @return Body Sensor Location
     */
    public int getBodySensorLocation() {
        return mBodySensorLocation;
    }

    /**
     * @return {@code true}:Other, {@code false}:not Other
     */
    public boolean isBodySensorLocationOhter() {
        return BODY_SENSOR_LOCATION_OTHER == mBodySensorLocation;
    }

    /**
     * @return {@code true}:Chest, {@code false}:not Chest
     */
    public boolean isBodySensorLocationChest() {
        return BODY_SENSOR_LOCATION_CHEST == mBodySensorLocation;
    }

    /**
     * @return {@code true}:Wrist, {@code false}:not Wrist
     */
    public boolean isBodySensorLocationWrist() {
        return BODY_SENSOR_LOCATION_WRIST == mBodySensorLocation;
    }

    /**
     * @return {@code true}:Finger, {@code false}:not Finger
     */
    public boolean isBodySensorLocationFinger() {
        return BODY_SENSOR_LOCATION_FINGER == mBodySensorLocation;
    }

    /**
     * @return {@code true}:Hand, {@code false}:not Hand
     */
    public boolean isBodySensorLocationHand() {
        return BODY_SENSOR_LOCATION_HAND == mBodySensorLocation;
    }

    /**
     * @return {@code true}:Ear Lobe, {@code false}:not Ear Lobe
     */
    public boolean isBodySensorLocationEarLobe() {
        return BODY_SENSOR_LOCATION_EAR_LOBE == mBodySensorLocation;
    }

    /**
     * @return {@code true}:Foot, {@code false}:not Foot
     */
    public boolean isBodySensorLocationFoot() {
        return BODY_SENSOR_LOCATION_FOOT == mBodySensorLocation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mBodySensorLocation);
        return data;
    }

}
