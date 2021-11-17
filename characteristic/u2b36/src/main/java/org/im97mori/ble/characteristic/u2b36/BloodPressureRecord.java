package org.im97mori.ble.characteristic.u2b36;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Blood Pressure Record (Characteristics UUID: 0x2B36)
 */
public class BloodPressureRecord implements ByteArrayInterface {

	/**
	 * Sequence Number
	 */
	private final int mSequenceNumber;
	
	/**
	 * UUID
	 */
	private final int mUuid;
	
	/**
	 * Recorded Characteristic with E2E-CRC
	 */
	private final byte[] mRecordedCharacteristic;

    /**
     * Constructor from BloodPressureRecordPacket array
     *
     * @param bloodPressureRecordPackets first to last BloodPressureRecordPacket array
     */
    public BloodPressureRecord(@NonNull BloodPressureRecordPacket... bloodPressureRecordPackets) {
        List<byte[]> dataList = new LinkedList<>();
        int length = 0;
        
        mSequenceNumber = bloodPressureRecordPackets[0].getSequenceNumber();
        mUuid = bloodPressureRecordPackets[0].getUuid();

        for (BloodPressureRecordPacket bloodPressureRecordPacket : bloodPressureRecordPackets) {
            dataList.add(bloodPressureRecordPacket.getRecordedCharacteristicWithCrc());
            length += dataList.get(dataList.size() - 1).length;
        }

        mRecordedCharacteristic = new byte[length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(mRecordedCharacteristic).order(ByteOrder.LITTLE_ENDIAN);
        for (byte[] data : dataList) {
            byteBuffer.put(data);
        }
    }

    /**
	 * Constructor from parameters
	 * 
	 * @param sequenceNumber         Sequence Number
	 * @param uuid                   UUID
	 * @param recordedCharacteristic Recorded Characteristic
	 * @param crc                    E2E-CRC
	 */
	public BloodPressureRecord(int sequenceNumber
			, int uuid
			, @NonNull byte[] recordedCharacteristic
			, @Nullable byte[] crc) {
		mSequenceNumber = sequenceNumber;
		mUuid = uuid;
		if (crc == null || crc.length == 0) {
			mRecordedCharacteristic = recordedCharacteristic;
		} else {
			mRecordedCharacteristic = new byte[recordedCharacteristic.length + crc.length];
			System.arraycopy(recordedCharacteristic, 0, mRecordedCharacteristic, 0, recordedCharacteristic.length);
			System.arraycopy(crc, 0, mRecordedCharacteristic, recordedCharacteristic.length, crc.length);
		}
	}

    /**
	 * @return Sequence Number
	 */
	public int getSequenceNumber() {
		return mSequenceNumber;
	}

	/**
	 * @return UUID
	 */
	public int getUuid() {
		return mUuid;
	}

	/**
	 * @return Recorded Characteristic with E2E-CRC
	 */
	public byte[] getRecordedCharacteristicWithCrc() {
		return mRecordedCharacteristic;
	}

	/**
	 * @return Recorded Characteristic with no E2E-CRC
	 */
	public byte[] getRecordedCharacteristicWithNoCrc() {
		return Arrays.copyOfRange(mRecordedCharacteristic, 0, mRecordedCharacteristic.length - 2);
	}

	/**
	 * @return E2E-CRC
	 */
	public byte[] getCrc() {
		return Arrays.copyOfRange(mRecordedCharacteristic, mRecordedCharacteristic.length - 2, mRecordedCharacteristic.length);
	}

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4 + mRecordedCharacteristic.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mSequenceNumber);
        byteBuffer.putShort((short) mUuid);
        byteBuffer.put(mRecordedCharacteristic);
        return data;
    }

}
