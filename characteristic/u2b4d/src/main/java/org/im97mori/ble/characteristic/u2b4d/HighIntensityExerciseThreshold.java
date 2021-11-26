package org.im97mori.ble.characteristic.u2b4d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * High Intensity Exercise Threshold (Characteristics UUID: 0x2B4D)
 */
public class HighIntensityExerciseThreshold implements ByteArrayInterface {

	/**
	 * No field is selected
	 */
	public static final int FIELD_SELECTOR_NO_FIELD_IS_SELECTED = 0;

	/**
	 * The Threshold as Energy Expenditure per Hour field is selected
	 */
	public static final int FIELD_SELECTOR_ENERGY_EXPEDITURE_PER_HOUR_FIELD = 1;

	/**
	 * The Threshold as Metabolic Equivalent field is selected
	 */
	public static final int FIELD_SELECTOR_METABOLIC_EQUIVALENT_FILED = 2;

	/**
	 * The Threshold as Percentage of Maximum Heart Rate field is selected
	 */
	public static final int FIELD_SELECTOR_PERCENTAGE_OF_MAXIMUM_HEART_RATE_FIELD = 3;

	/**
	 * The Threshold as Heart Rate field is selected
	 */
	public static final int FIELD_SELECTOR_HEART_RATE_FIELD = 4;

	/**
	 * Field Selector
	 */
	private final int mFieldSelector;

	/**
	 * Threshold as Energy Expenditure per Hour
	 */
	private final int mThresholdAsEnergyExpenditurePerHour;

	/**
	 * Threshold as Metabolic Equivalent
	 */
	private final int mThresholdAsMetabolicEquivalent;

	/**
	 * Threshold as Percentage of Maximum Heart Rate
	 */
	private final int mThresholdAsPercentageOfMaximumHeartRate;

	/**
	 * Threshold as Heart Rate
	 */
	private final int mThresholdAsHeartRate;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public HighIntensityExerciseThreshold(@NonNull byte[] values) {
		mFieldSelector = BLEUtils.createUInt8(values, 0);
		if (isFieldSelectorNoFieldIsSelected()) {
			mThresholdAsEnergyExpenditurePerHour = 0;
			mThresholdAsMetabolicEquivalent = 0;
			mThresholdAsPercentageOfMaximumHeartRate = 0;
			mThresholdAsHeartRate = 0;
		} else if (isFieldSelectorEnergyExpediturePerHourField()) {
			mThresholdAsEnergyExpenditurePerHour = BLEUtils.createUInt16(values, 1);
			mThresholdAsMetabolicEquivalent = 0;
			mThresholdAsPercentageOfMaximumHeartRate = 0;
			mThresholdAsHeartRate = 0;
		} else if (isFieldSelectorMetabolicEquivalentField()) {
			mThresholdAsEnergyExpenditurePerHour = 0;
			mThresholdAsMetabolicEquivalent = BLEUtils.createUInt8(values, 1);
			mThresholdAsPercentageOfMaximumHeartRate = 0;
			mThresholdAsHeartRate = 0;
		} else if (isFieldSelectorPercentageOfMaximumHeartRateField()) {
			mThresholdAsEnergyExpenditurePerHour = 0;
			mThresholdAsMetabolicEquivalent = 0;
			mThresholdAsPercentageOfMaximumHeartRate = BLEUtils.createUInt8(values, 1);
			mThresholdAsHeartRate = 0;
		} else if (isFieldSelectorHeartRateField()) {
			mThresholdAsEnergyExpenditurePerHour = 0;
			mThresholdAsMetabolicEquivalent = 0;
			mThresholdAsPercentageOfMaximumHeartRate = 0;
			mThresholdAsHeartRate = BLEUtils.createUInt8(values, 1);
		} else {
			mThresholdAsEnergyExpenditurePerHour = 0;
			mThresholdAsMetabolicEquivalent = 0;
			mThresholdAsPercentageOfMaximumHeartRate = 0;
			mThresholdAsHeartRate = 0;
		}
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param fieldSelector                           Field Selector
	 * @param thresholdAsEnergyExpenditurePerHour     Threshold as Energy
	 *                                                Expenditure per Hour
	 * @param thresholdAsMetabolicEquivalent          Threshold as Metabolic
	 *                                                Equivalent
	 * @param thresholdAsPercentageOfMaximumHeartRate Threshold as Percentage of
	 *                                                Maximum Heart Rate
	 * @param thresholdAsHeartRate                    Threshold as Heart Rate
	 */
	public HighIntensityExerciseThreshold(int fieldSelector, int thresholdAsEnergyExpenditurePerHour,
			int thresholdAsMetabolicEquivalent, int thresholdAsPercentageOfMaximumHeartRate, int thresholdAsHeartRate) {
		mFieldSelector = fieldSelector;
		mThresholdAsEnergyExpenditurePerHour = thresholdAsEnergyExpenditurePerHour;
		mThresholdAsMetabolicEquivalent = thresholdAsMetabolicEquivalent;
		mThresholdAsPercentageOfMaximumHeartRate = thresholdAsPercentageOfMaximumHeartRate;
		mThresholdAsHeartRate = thresholdAsHeartRate;
	}

	/**
	 * @return Field Selector
	 */
	public int getFieldSelector() {
		return mFieldSelector;
	}

	/**
	 * @return {@code true}:No field is selected, {@code false}:not No field is
	 *         selected
	 */
	public boolean isFieldSelectorNoFieldIsSelected() {
		return mFieldSelector == FIELD_SELECTOR_NO_FIELD_IS_SELECTED;
	}

	/**
	 * @return {@code true}:Metabolic Equivalent field is selected,
	 *         {@code false}:not Metabolic Equivalent field is selected
	 */
	public boolean isFieldSelectorEnergyExpediturePerHourField() {
		return mFieldSelector == FIELD_SELECTOR_ENERGY_EXPEDITURE_PER_HOUR_FIELD;
	}

	/**
	 * @return {@code true}:The Threshold as Metabolic Equivalent field is selected,
	 *         {@code false}:not The Threshold as Metabolic Equivalent field is
	 *         selected
	 */
	public boolean isFieldSelectorMetabolicEquivalentField() {
		return mFieldSelector == FIELD_SELECTOR_METABOLIC_EQUIVALENT_FILED;
	}

	/**
	 * @return {@code true}:The Threshold as Percentage of Maximum Heart Rate field
	 *         is selected, {@code false}:not The Threshold as Percentage of Maximum
	 *         Heart Rate field is selected
	 */
	public boolean isFieldSelectorPercentageOfMaximumHeartRateField() {
		return mFieldSelector == FIELD_SELECTOR_PERCENTAGE_OF_MAXIMUM_HEART_RATE_FIELD;
	}

	/**
	 * @return {@code true}:The Threshold as Heart Rate field is selected,
	 *         {@code false}:not The Threshold as Heart Rate field is selected
	 */
	public boolean isFieldSelectorHeartRateField() {
		return mFieldSelector == FIELD_SELECTOR_HEART_RATE_FIELD;
	}

	/**
	 * @return Threshold as Energy Expenditure per Hour
	 */
	public int getThresholdAsEnergyExpenditurePerHour() {
		return mThresholdAsEnergyExpenditurePerHour;
	}

	/**
	 * @return Threshold as Metabolic Equivalent
	 */
	public int getThresholdAsMetabolicEquivalent() {
		return mThresholdAsMetabolicEquivalent;
	}

	/**
	 * @return Threshold as Percentage of Maximum Heart Rate
	 */
	public int getThresholdAsPercentageOfMaximumHeartRate() {
		return mThresholdAsPercentageOfMaximumHeartRate;
	}

	/**
	 * @return Threshold as Heart Rate
	 */
	public int getThresholdAsHeartRate() {
		return mThresholdAsHeartRate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		int length = 1;
		byte[] data = new byte[3];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mFieldSelector);
		if (isFieldSelectorEnergyExpediturePerHourField()) {
			byteBuffer.putShort((short) mThresholdAsEnergyExpenditurePerHour);
			length += 2;
		} else if (isFieldSelectorMetabolicEquivalentField()) {
			byteBuffer.put((byte) mThresholdAsMetabolicEquivalent);
			length++;
		} else if (isFieldSelectorPercentageOfMaximumHeartRateField()) {
			byteBuffer.put((byte) mThresholdAsPercentageOfMaximumHeartRate);
			length++;
		} else if (isFieldSelectorHeartRateField()) {
			byteBuffer.put((byte) mThresholdAsHeartRate);
			length++;
		}
		return Arrays.copyOfRange(data, 0, length);
	}

}
