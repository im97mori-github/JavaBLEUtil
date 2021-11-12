package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.INDOOR_POSITIONING_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.IndoorPositioningUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * Indoor Positioning
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class IndoorPositioning extends AbstractAdvertisingData {

    /**
     * Indoor Positioning Configuration
     */
    private final int mIndoorPositioningConfiguration;

    /**
     * Global Coordinates (Latitude)
     */
    private final int mGlobalCoorinatesLatitude;

    /**
     * Global Coordinates (Longitude)
     */
    private final int mGlobalCoorinatesLongitude;

    /**
     * Local Coordinates (North)
     */
    private final int mLocalCoordinatesNorth;

    /**
     * Local Coordinates (East)
     */
    private final int mLocalCoordinatesEast;

    /**
     * Tx Power
     */
    private final int mTxPower;

    /**
     * Floor Number
     */
    private final int mFloorNumber;

    /**
     * Altitude
     */
    private final int mAltitude;

    /**
     * Uncertainty
     */
    private final int mUncertainty;

	/**
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
	 * @see #IndoorPositioning(byte[], int, int)
	 */
	public IndoorPositioning(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}

    /**
     * Constructor for Indoor Positioning
     *
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
     * @param length 1st octet of Advertising Data
     */
    public IndoorPositioning(@NonNull byte[] data, int offset, int length) {
        super(length);
        int index = offset + 2;
        if (length > 1) {
            mIndoorPositioningConfiguration = (data[index++] & 0xff);
        } else {
            mIndoorPositioningConfiguration = 0;
        }

        if (IndoorPositioningUtils.isIndoorPositioningConfigurationPresenceOfCoordinatesInAdvertisingPacketsCoordinatesArePresent(mIndoorPositioningConfiguration)) {
            if (IndoorPositioningUtils.isIndoorPositioningConfigurationCoordinateSystemUsedInAdvertisingPacketsWgs84CoordinateSystem(mIndoorPositioningConfiguration)) {
                mGlobalCoorinatesLatitude = BLEUtils.createSInt32(data, index);
                index += 4;
                mGlobalCoorinatesLongitude = BLEUtils.createSInt32(data, index);
                index += 4;
                mLocalCoordinatesNorth = 0;
                mLocalCoordinatesEast = 0;
            } else {
                mGlobalCoorinatesLatitude = 0;
                mGlobalCoorinatesLongitude = 0;
                mLocalCoordinatesNorth = BLEUtils.createSInt16(data, index);
                index += 2;
                mLocalCoordinatesEast = BLEUtils.createSInt16(data, index);
                index += 2;
            }
        } else {
            mGlobalCoorinatesLatitude = 0;
            mGlobalCoorinatesLongitude = 0;
            mLocalCoordinatesNorth = 0;
            mLocalCoordinatesEast = 0;
        }

        if (IndoorPositioningUtils.isIndoorPositioningConfigurationPresenceOfTxPowerFieldInAdvertisingPacketsTxPowerIsPresent(mIndoorPositioningConfiguration)) {
            mTxPower = BLEUtils.createSInt8(data, index++);
        } else {
            mTxPower = 0;
        }

        if (IndoorPositioningUtils.isIndoorPositioningConfigurationPresenceOfFloorNumberInAdvertisingPacketsFloorNumberIsPresent(mIndoorPositioningConfiguration)) {
            mFloorNumber = BLEUtils.createUInt8(data, index++);
        } else {
            mFloorNumber = 0;
        }

        if (IndoorPositioningUtils.isIndoorPositioningConfigurationPresenceOfAltitudeFieldInAdvertisingPacketsAltitudeIsPresent(mIndoorPositioningConfiguration)) {
            mAltitude = BLEUtils.createUInt16(data, index);
            index += 2;
        } else {
            mAltitude = 0;
        }

        if (IndoorPositioningUtils.isIndoorPositioningConfigurationPresenceOfUncertaintyInAdvertisingPacketsUncertaintyIsPresent(mIndoorPositioningConfiguration)) {
            mUncertainty = BLEUtils.createUInt8(data, index);
        } else {
            mUncertainty = 0;
        }
    }

	/**
	 * Constructor from parameters
	 * 
	 * @param indoorPositioningConfiguration Indoor Positioning Configuration
	 * @param globalCoorinatesLatitude       Global Coordinates (Latitude)
	 * @param globalCoorinatesLongitude      Global Coordinates (Longitude)
	 * @param localCoordinatesNorth          Local Coordinates (North)
	 * @param localCoordinatesEast           Local Coordinates (East)
	 * @param txPower                        Tx Power
	 * @param floorNumber                    Floor Number
	 * @param altitude                       Altitude
	 * @param uncertainty                    Uncertainty
	 */
	public IndoorPositioning(int indoorPositioningConfiguration
			, int globalCoorinatesLatitude
			, int globalCoorinatesLongitude
			, int localCoordinatesNorth
			, int localCoordinatesEast
			, int txPower
			, int floorNumber
			, int altitude
			, int uncertainty) {
		super(calculateLength(indoorPositioningConfiguration));

		mIndoorPositioningConfiguration = indoorPositioningConfiguration;
		mGlobalCoorinatesLatitude = globalCoorinatesLatitude;
		mGlobalCoorinatesLongitude = globalCoorinatesLongitude;
		mLocalCoordinatesNorth = localCoordinatesNorth;
		mLocalCoordinatesEast = localCoordinatesEast;
		mTxPower = txPower;
		mFloorNumber = floorNumber;
		mAltitude = altitude;
		mUncertainty = uncertainty;
	}
	
	/**
	 * Calculate data length
	 * 
	 * @param indoorPositioningConfiguration Indoor Positioning Configuration
	 * @return data length
	 */
	private static int calculateLength(int indoorPositioningConfiguration) {
		int length = 1;
		if (indoorPositioningConfiguration != 0) {
			length++;
			if (IndoorPositioningUtils
					.isIndoorPositioningConfigurationPresenceOfCoordinatesInAdvertisingPacketsCoordinatesArePresent(
							indoorPositioningConfiguration)) {
				if (IndoorPositioningUtils
						.isIndoorPositioningConfigurationCoordinateSystemUsedInAdvertisingPacketsWgs84CoordinateSystem(
								indoorPositioningConfiguration)) {
					length += 8;
				} else {
					length += 4;
				}
			}

			if (IndoorPositioningUtils
					.isIndoorPositioningConfigurationPresenceOfTxPowerFieldInAdvertisingPacketsTxPowerIsPresent(
							indoorPositioningConfiguration)) {
				length++;
			}
			if (IndoorPositioningUtils
					.isIndoorPositioningConfigurationPresenceOfFloorNumberInAdvertisingPacketsFloorNumberIsPresent(
							indoorPositioningConfiguration)) {
				length++;
			}
			if (IndoorPositioningUtils
					.isIndoorPositioningConfigurationPresenceOfAltitudeFieldInAdvertisingPacketsAltitudeIsPresent(
							indoorPositioningConfiguration)) {
				length += 2;
			}
			if (IndoorPositioningUtils
					.isIndoorPositioningConfigurationPresenceOfUncertaintyInAdvertisingPacketsUncertaintyIsPresent(
							indoorPositioningConfiguration)) {
				length++;
			}
		}
		return length;
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return INDOOR_POSITIONING_DATA_TYPE;
    }

    /**
     * @return Indoor Positioning Configuration
     */
    public int getIndoorPositioningConfiguration() {
        return mIndoorPositioningConfiguration;
    }

    /**
     * @return Global Coordinates (Latitude)
     */
    public int getGlobalCoorinatesLatitude() {
        return mGlobalCoorinatesLatitude;
    }

    /**
     * @return Global Coordinates (Longitude)
     */
    public int getGlobalCoorinatesLongitude() {
        return mGlobalCoorinatesLongitude;
    }

    /**
     * @return Local Coordinates (North)
     */
    public int getLocalCoordinatesNorth() {
        return mLocalCoordinatesNorth;
    }

    /**
     * @return Local Coordinates (East)
     */
    public int getLocalCoordinatesEast() {
        return mLocalCoordinatesEast;
    }

    /**
     * @return Tx Power
     */
    public int getTxPower() {
        return mTxPower;
    }

    /**
     * @return Floor Number
     */
    public int getFloorNumber() {
        return mFloorNumber;
    }

    /**
     * @return Altitude
     */
    public int getAltitude() {
        return mAltitude;
    }

    /**
     * @return Uncertainty
     */
    public int getUncertainty() {
        return mUncertainty;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[1 + getLength()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) getLength());
        byteBuffer.put((byte) getDataType());
        if (data.length > 2) {
            byteBuffer.put((byte) mIndoorPositioningConfiguration);
            if (IndoorPositioningUtils.isIndoorPositioningConfigurationPresenceOfCoordinatesInAdvertisingPacketsCoordinatesArePresent(mIndoorPositioningConfiguration)) {
                if (IndoorPositioningUtils.isIndoorPositioningConfigurationCoordinateSystemUsedInAdvertisingPacketsWgs84CoordinateSystem(mIndoorPositioningConfiguration)) {
                    byteBuffer.putInt(mGlobalCoorinatesLatitude);
                    byteBuffer.putInt(mGlobalCoorinatesLongitude);
                } else {
                    byteBuffer.putShort((short) mLocalCoordinatesNorth);
                    byteBuffer.putShort((short) mLocalCoordinatesEast);
                }
            }

            if (IndoorPositioningUtils.isIndoorPositioningConfigurationPresenceOfTxPowerFieldInAdvertisingPacketsTxPowerIsPresent(mIndoorPositioningConfiguration)) {
                byteBuffer.put((byte) mTxPower);
            }

            if (IndoorPositioningUtils.isIndoorPositioningConfigurationPresenceOfFloorNumberInAdvertisingPacketsFloorNumberIsPresent(mIndoorPositioningConfiguration)) {
                byteBuffer.put((byte) mFloorNumber);
            }

            if (IndoorPositioningUtils.isIndoorPositioningConfigurationPresenceOfAltitudeFieldInAdvertisingPacketsAltitudeIsPresent(mIndoorPositioningConfiguration)) {
                byteBuffer.putShort((short) mAltitude);
            }

            if (IndoorPositioningUtils.isIndoorPositioningConfigurationPresenceOfUncertaintyInAdvertisingPacketsUncertaintyIsPresent(mIndoorPositioningConfiguration)) {
                byteBuffer.put((byte) mUncertainty);
            }
        }
        return data;
    }

}
