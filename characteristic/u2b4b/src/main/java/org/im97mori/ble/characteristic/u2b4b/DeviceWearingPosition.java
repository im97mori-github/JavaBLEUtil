package org.im97mori.ble.characteristic.u2b4b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Device Wearing Position (Characteristics UUID: 0x2B4B)
 */
public class DeviceWearingPosition implements ByteArrayInterface {

	/**
	 * Other
	 */
	public static final int DEVICE_WEARING_POSITION_OTHER = 0x00;

	/**
	 * Head
	 */
	public static final int DEVICE_WEARING_POSITION_HEAD = 0x01;

	/**
	 * Head_Ear
	 */
	public static final int DEVICE_WEARING_POSITION_HEAD_EAR = 0x02;

	/**
	 * Head_Ear_Right
	 */
	public static final int DEVICE_WEARING_POSITION_HEAD_EAR_RIGHT = 0x03;

	/**
	 * Head_Ear_Left
	 */
	public static final int DEVICE_WEARING_POSITION_HEAD_EAR_LEFT = 0x04;

	/**
	 * Head_Neck
	 */
	public static final int DEVICE_WEARING_POSITION_HEAD_NECK = 0x05;

	/**
	 * Trunk
	 */
	public static final int DEVICE_WEARING_POSITION_TRUNK = 0x06;

	/**
	 * Trunk_Pelvis
	 */
	public static final int DEVICE_WEARING_POSITION_TRUNK_PELVIS = 0x07;

	/**
	 * Trunk_Pelvis_Right
	 */
	public static final int DEVICE_WEARING_POSITION_TRUNK_PELVIS_RIGHT = 0x08;

	/**
	 * Trunk_Pelvis_Left
	 */
	public static final int DEVICE_WEARING_POSITION_TRUNK_PELVIS_LEFT = 0x09;

	/**
	 * Trunk_Thorax
	 */
	public static final int DEVICE_WEARING_POSITION_TRUNK_THORAX = 0x0a;

	/**
	 * Trunk_Thorax_Right
	 */
	public static final int DEVICE_WEARING_POSITION_TRUNK_THORAX_RIGHT = 0x0b;

	/**
	 * Trunk_Thorax_Left
	 */
	public static final int DEVICE_WEARING_POSITION_TRUNK_THORAX_LEFT = 0x0c;

	/**
	 * Trunk_Back
	 */
	public static final int DEVICE_WEARING_POSITION_TRUNK_BACK = 0x0d;

	/**
	 * UpperExtremity
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY = 0x0e;

	/**
	 * UpperExtremity_Right
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_RIGHT = 0x0f;

	/**
	 * UpperExtremity_Left
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_LEFT = 0x10;

	/**
	 * UpperExtremity_Wrist
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_WRIST = 0x11;

	/**
	 * UpperExtremity_Wrist_Right
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_WRIST_RIGHT = 0x12;

	/**
	 * UpperExtremity_Wrist_Left
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_WRIST_LEFT = 0x13;

	/**
	 * UpperExtremity_Finger
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_FINGER = 0x14;

	/**
	 * UpperExtremity_Finger_Right
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_FINGER_RIGHT = 0x15;

	/**
	 * UpperExtremity_Finger_Left
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_FINGER_LEFT = 0x16;

	/**
	 * UpperExtremity_Hand
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_HAND = 0x17;

	/**
	 * UpperExtremity_Hand_Right
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_HAND_RIGHT = 0x18;

	/**
	 * UpperExtremity_Hand_Left
	 */
	public static final int DEVICE_WEARING_POSITION_UPPER_EXTREMITY_HAND_LEFT = 0x19;

	/**
	 * LowerExtremity
	 */
	public static final int DEVICE_WEARING_POSITION_LOWER_EXTREMITY = 0x1a;

	/**
	 * LowerExtremity_Right
	 */
	public static final int DEVICE_WEARING_POSITION_LOWER_EXTREMITY_RIGHT = 0x1b;

	/**
	 * LowerExtremity_Left
	 */
	public static final int DEVICE_WEARING_POSITION_LOWER_EXTREMITY_LEFT = 0x1c;

	/**
	 * LowerExtremity_Ankle
	 */
	public static final int DEVICE_WEARING_POSITION_LOWER_EXTREMITY_ANKLE = 0x1d;

	/**
	 * LowerExtremity_Ankle_Right
	 */
	public static final int DEVICE_WEARING_POSITION_LOWER_EXTREMITY_ANKLE_RIGHT = 0x1e;

	/**
	 * LowerExtremity_Ankle_Left
	 */
	public static final int DEVICE_WEARING_POSITION_LOWER_EXTREMITY_ANKLE_LEFT = 0x1f;

	/**
	 * LowerExtremity_Foot
	 */
	public static final int DEVICE_WEARING_POSITION_LOWER_EXTREMITY_FOOT = 0x20;

	/**
	 * LowerExtremity_Foot_Right
	 */
	public static final int DEVICE_WEARING_POSITION_LOWER_EXTREMITY_FOOT_RIGHT = 0x21;

	/**
	 * LowerExtremity_Foot_Left
	 */
	public static final int DEVICE_WEARING_POSITION_LOWER_EXTREMITY_FOOT_LEFT = 0x22;

	/**
	 * Pants_Pocket
	 */
	public static final int DEVICE_WEARING_POSITION_PANTS_POCKET = 0x23;

	/**
	 * Pants_Pocket_Right
	 */
	public static final int DEVICE_WEARING_POSITION_PANTS_POCKET_RIGHT = 0x24;

	/**
	 * Pants_Pocket_Left
	 */
	public static final int DEVICE_WEARING_POSITION_PANTS_POCKET_LEFT = 0x25;

	/**
	 * Chest_Pocket
	 */
	public static final int DEVICE_WEARING_POSITION_CHEST_POCKET = 0x26;

	/**
	 * Chest_Pocket_Right
	 */
	public static final int DEVICE_WEARING_POSITION_CHEST_POCKET_RIGHT = 0x27;

	/**
	 * Chest_Pocket_Left
	 */
	public static final int DEVICE_WEARING_POSITION_CHEST_POCKET_LEFT = 0x28;

	/**
	 * Device Wearing Position
	 */
	private final int mDeviceWearingPosition;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public DeviceWearingPosition(@NonNull byte[] values) {
		mDeviceWearingPosition = BLEUtils.createUInt8(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param deviceWearingPosition Device Wearing Position
	 */
	public DeviceWearingPosition(int deviceWearingPosition) {
		mDeviceWearingPosition = deviceWearingPosition;
	}

	/**
	 * @return Device Wearing Position
	 */
	public int getDeviceWearingPosition() {
		return mDeviceWearingPosition;
	}

	/**
	 * @return {@code true}:Other, {@code false}:not Other
	 */
	public boolean isDeviceWearingPositionOther() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_OTHER;
	}

	/**
	 * @return {@code true}:Head, {@code false}:not Head
	 */
	public boolean isDeviceWearingPositionHead() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_HEAD;
	}

	/**
	 * @return {@code true}:Head_Ear, {@code false}:not Head_Ear
	 */
	public boolean isDeviceWearingPositionHeadEar() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_HEAD_EAR;
	}

	/**
	 * @return {@code true}:Head_Ear_Right, {@code false}:not Head_Ear_Right
	 */
	public boolean isDeviceWearingPositionHeadEarRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_HEAD_EAR_RIGHT;
	}

	/**
	 * @return {@code true}:Head_Ear_Left, {@code false}:not Head_Ear_Left
	 */
	public boolean isDeviceWearingPositionHeadEarLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_HEAD_EAR_LEFT;
	}

	/**
	 * @return {@code true}:Head_Neck, {@code false}:not Head_Neck
	 */
	public boolean isDeviceWearingPositionHeadNeck() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_HEAD_NECK;
	}

	/**
	 * @return {@code true}:Trunk, {@code false}:not Trunk
	 */
	public boolean isDeviceWearingPositionTrunk() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_TRUNK;
	}

	/**
	 * @return {@code true}:Trunk_Pelvis, {@code false}:not Trunk_Pelvis
	 */
	public boolean isDeviceWearingPositionTrunkPelvis() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_TRUNK_PELVIS;
	}

	/**
	 * @return {@code true}:Trunk_Pelvis_Right, {@code false}:not Trunk_Pelvis_Right
	 */
	public boolean isDeviceWearingPositionTrunkPelvisRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_TRUNK_PELVIS_RIGHT;
	}

	/**
	 * @return {@code true}:Trunk_Pelvis_Left, {@code false}:not Trunk_Pelvis_Left
	 */
	public boolean isDeviceWearingPositionTrunkPelvisLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_TRUNK_PELVIS_LEFT;
	}

	/**
	 * @return {@code true}:Trunk_Thorax, {@code false}:not Trunk_Thorax
	 */
	public boolean isDeviceWearingPositionTrunkThorax() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_TRUNK_THORAX;
	}

	/**
	 * @return {@code true}:Trunk_Thorax_Right, {@code false}:not Trunk_Thorax_Right
	 */
	public boolean isDeviceWearingPositionTrunkThoraxRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_TRUNK_THORAX_RIGHT;
	}

	/**
	 * @return {@code true}:Trunk_Thorax_Left, {@code false}:not Trunk_Thorax_Left
	 */
	public boolean isDeviceWearingPositionTrunkThoraxLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_TRUNK_THORAX_LEFT;
	}

	/**
	 * @return {@code true}:Trunk_Back, {@code false}:not Trunk_Back
	 */
	public boolean isDeviceWearingPositionTrunkThoraxBack() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_TRUNK_BACK;
	}

	/**
	 * @return {@code true}:UpperExtremity, {@code false}:not UpperExtremity
	 */
	public boolean isDeviceWearingPositionUpperExtremity() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY;
	}

	/**
	 * @return {@code true}:UpperExtremity_Right, {@code false}:not
	 *         UpperExtremity_Right
	 */
	public boolean isDeviceWearingPositionUpperExtremityRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_RIGHT;
	}

	/**
	 * @return {@code true}:UpperExtremity_Left, {@code false}:not
	 *         UpperExtremity_Left
	 */
	public boolean isDeviceWearingPositionUpperExtremityLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_LEFT;
	}

	/**
	 * @return {@code true}:UpperExtremity_Wrist, {@code false}:not
	 *         UpperExtremity_Wrist
	 */
	public boolean isDeviceWearingPositionUpperExtremityWrist() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_WRIST;
	}

	/**
	 * @return {@code true}:UpperExtremity_Wrist_Right, {@code false}:not
	 *         UpperExtremity_Wrist_Right
	 */
	public boolean isDeviceWearingPositionUpperExtremityWristRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_WRIST_RIGHT;
	}

	/**
	 * @return {@code true}:UpperExtremity_Wrist_Left, {@code false}:not
	 *         UpperExtremity_Wrist_Left
	 */
	public boolean isDeviceWearingPositionUpperExtremityWristLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_WRIST_LEFT;
	}

	/**
	 * @return {@code true}:UpperExtremity_Finger, {@code false}:not
	 *         UpperExtremity_Finger
	 */
	public boolean isDeviceWearingPositionUpperExtremityFinger() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_FINGER;
	}

	/**
	 * @return {@code true}:UpperExtremity_Finger_Right, {@code false}:not
	 *         UpperExtremity_Finger_Right
	 */
	public boolean isDeviceWearingPositionUpperExtremityFingerRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_FINGER_RIGHT;
	}

	/**
	 * @return {@code true}:UpperExtremity_Finger_Left, {@code false}:not
	 *         UpperExtremity_Finger_Left
	 */
	public boolean isDeviceWearingPositionUpperExtremityFingerLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_FINGER_LEFT;
	}

	/**
	 * @return {@code true}:UpperExtremity_Hand, {@code false}:not
	 *         UpperExtremity_Hand
	 */
	public boolean isDeviceWearingPositionUpperExtremityHand() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_HAND;
	}

	/**
	 * @return {@code true}:UpperExtremity_Hand_Right, {@code false}:not
	 *         UpperExtremity_Hand_Right
	 */
	public boolean isDeviceWearingPositionUpperExtremityHandRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_HAND_RIGHT;
	}

	/**
	 * @return {@code true}:UpperExtremity_Hand_Left, {@code false}:not
	 *         UpperExtremity_Hand_Left
	 */
	public boolean isDeviceWearingPositionUpperExtremityHandLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_UPPER_EXTREMITY_HAND_LEFT;
	}

	/**
	 * @return {@code true}:LowerExtremity, {@code false}:not LowerExtremity
	 */
	public boolean isDeviceWearingPositionLowerExtremity() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_LOWER_EXTREMITY;
	}

	/**
	 * @return {@code true}:LowerExtremity_Right, {@code false}:not
	 *         LowerExtremity_Right
	 */
	public boolean isDeviceWearingPositionLowerExtremityRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_LOWER_EXTREMITY_RIGHT;
	}

	/**
	 * @return {@code true}:LowerExtremity_Left, {@code false}:not
	 *         LowerExtremity_Left
	 */
	public boolean isDeviceWearingPositionLowerExtremityLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_LOWER_EXTREMITY_LEFT;
	}

	/**
	 * @return {@code true}:LowerExtremity_Ankle, {@code false}:not
	 *         LowerExtremity_Ankle
	 */
	public boolean isDeviceWearingPositionLowerExtremityAnkle() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_LOWER_EXTREMITY_ANKLE;
	}

	/**
	 * @return {@code true}:LowerExtremity_Ankle_Right, {@code false}:not
	 *         LowerExtremity_Ankle_Right
	 */
	public boolean isDeviceWearingPositionLowerExtremityAnkleRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_LOWER_EXTREMITY_ANKLE_RIGHT;
	}

	/**
	 * @return {@code true}:LowerExtremity_Ankle_Left, {@code false}:not
	 *         LowerExtremity_Ankle_Left
	 */
	public boolean isDeviceWearingPositionLowerExtremityAnkleLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_LOWER_EXTREMITY_ANKLE_LEFT;
	}

	/**
	 * @return {@code true}:LowerExtremity_Foot, {@code false}:not
	 *         LowerExtremity_Foot
	 */
	public boolean isDeviceWearingPositionLowerExtremityFoot() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_LOWER_EXTREMITY_FOOT;
	}

	/**
	 * @return {@code true}:LowerExtremity_Foot_Right, {@code false}:not
	 *         LowerExtremity_Foot_Right
	 */
	public boolean isDeviceWearingPositionLowerExtremityFootRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_LOWER_EXTREMITY_FOOT_RIGHT;
	}

	/**
	 * @return {@code true}:LowerExtremity_Foot_Left, {@code false}:not
	 *         LowerExtremity_Foot_Left
	 */
	public boolean isDeviceWearingPositionLowerExtremityFootLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_LOWER_EXTREMITY_FOOT_LEFT;
	}

	/**
	 * @return {@code true}:Pants_Pocket, {@code false}:not Pants_Pocket
	 */
	public boolean isDeviceWearingPositionPantsPocket() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_PANTS_POCKET;
	}

	/**
	 * @return {@code true}:Pants_Pocket_Right, {@code false}:not Pants_Pocket_Right
	 */
	public boolean isDeviceWearingPositionPantsPocketRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_PANTS_POCKET_RIGHT;
	}

	/**
	 * @return {@code true}:Pants_Pocket_Left, {@code false}:not Pants_Pocket_Left
	 */
	public boolean isDeviceWearingPositionPantsPocketLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_PANTS_POCKET_LEFT;
	}

	/**
	 * @return {@code true}:Chest_Pocket, {@code false}:not Chest_Pocket
	 */
	public boolean isDeviceWearingPositionChestPocket() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_CHEST_POCKET;
	}

	/**
	 * @return {@code true}:Chest_Pocket_Right, {@code false}:not Chest_Pocket_Right
	 */
	public boolean isDeviceWearingPositionChestPocketRight() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_CHEST_POCKET_RIGHT;
	}

	/**
	 * @return {@code true}:Chest_Pocket_Left, {@code false}:not Chest_Pocket_Left
	 */
	public boolean isDeviceWearingPositionChestPocketLeft() {
		return mDeviceWearingPosition == DEVICE_WEARING_POSITION_CHEST_POCKET_LEFT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[1];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mDeviceWearingPosition);
		return data;
	}

}
