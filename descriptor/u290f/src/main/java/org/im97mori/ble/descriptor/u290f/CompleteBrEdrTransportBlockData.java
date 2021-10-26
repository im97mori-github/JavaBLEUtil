package org.im97mori.ble.descriptor.u290f;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Complete BR-EDR Transport Block Data (Descriptor UUID: 0x290F)
 */
public class CompleteBrEdrTransportBlockData implements ByteArrayInterface {

	/**
	 * Transport Data
	 */
	private final byte[] mTransportData;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 */
	public CompleteBrEdrTransportBlockData(@NonNull byte[] values) {
		mTransportData = values;
	}

	/**
	 * @return Transport Data
	 */
	public byte[] getTransportData() {
		return mTransportData;
	}

	/**
	 * {@inheritDoc}
	 */
	@NonNull
	@Override
	public byte[] getBytes() {
		return mTransportData;
	}

}