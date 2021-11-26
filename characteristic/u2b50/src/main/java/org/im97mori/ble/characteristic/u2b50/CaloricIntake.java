package org.im97mori.ble.characteristic.u2b50;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Caloric Intake (Characteristics UUID: 0x2B50)
 */
public class CaloricIntake implements ByteArrayInterface {

	/**
	 * Caloric Intake
	 */
	private final int mCaloricIntake;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public CaloricIntake(@NonNull byte[] values) {
		mCaloricIntake = BLEUtils.createUInt16(values, 0);
	}
	
	/**
	 * Constructor from parameters
	 * 
	 * @param caloricIntake Caloric Intake
	 */
	public CaloricIntake(int caloricIntake) {
		mCaloricIntake = caloricIntake;
	}

	/**
	 * @return Caloric Intake
	 */
	public int getCaloricIntake() {
		return mCaloricIntake;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.putShort((short) mCaloricIntake);
		return data;
	}

}
