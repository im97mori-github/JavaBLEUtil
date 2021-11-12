package org.im97mori.ble;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.im97mori.ble.constants.AppearanceValues;

import com.github.snksoft.crc.CRC.Parameters;

/**
 * BLE Constants
 */
public class BLEConstants {

	/**
	 * <p>
	 * BASE UUID
	 * <p>
	 * Core Specification v5.3 Vol 3 Part B 2.5.1
	 * </p>
	 */
	@Deprecated
	public static final UUID BASE_UUID = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

	/**
	 * CRC Parameters
	 */
	@Deprecated
	public static final Parameters CRC_PARAMETERS = new Parameters(16, 0x1021, 0x00FFFF, true, true, 0x0);

	/**
	 * use {@link org.im97mori.ble.constants.AppearanceValues#APPEARANCE_SUB_CATEGORY_MAPPING}
	 */
	@Deprecated
	public static final Map<Integer, String> APPEARANCE_VALUE_MAP = AppearanceValues.APPEARANCE_SUB_CATEGORY_MAPPING;

	/**
	 * use {@link org.im97mori.ble.constants.Scheme#SCHEME_MAPPING}
	 */
	@Deprecated
	public static final Map<Integer, String> URI_SCHEME_NAME_STRING_MAPPING;

	static {
		Map<Integer, String> map = new HashMap<>();
		for (Map.Entry<Character, String> entry : org.im97mori.ble.constants.Scheme.SCHEME_MAPPING.entrySet()) {
			map.put(entry.getKey().charValue() & 0xff, entry.getValue());
		}
		URI_SCHEME_NAME_STRING_MAPPING = Collections.synchronizedMap(Collections.unmodifiableMap(map));
	}

	/**
	 * use {@link org.im97mori.ble.constants.CompanyUUID#COMPANY_MAPPING_128}
	 */
	@Deprecated
	public static final Map<Integer, String> COMPANY_MAPPING;

	static {
		Map<Integer, String> map = new HashMap<>();
		for (Map.Entry<UUID, String> entry : org.im97mori.ble.constants.CompanyUUID.COMPANY_MAPPING_128.entrySet()) {
			long msb = entry.getKey().getMostSignificantBits();
			map.put((int) ((msb >> 32) & 0xffff), entry.getValue());
		}
		COMPANY_MAPPING = Collections.synchronizedMap(Collections.unmodifiableMap(map));
	}

	/**
	 * use {@link org.im97mori.ble.constants.UnitUUID#UNIT_MAPPING_128}
	 */
	@Deprecated
	public static final Map<UUID, String> UNITS_MAPPING = org.im97mori.ble.constants.UnitUUID.UNIT_MAPPING_128;

	/**
	 * use {@link org.im97mori.ble.constants.ServiceUUID}
	 */
	@Deprecated
	public static final class ServiceUUID extends org.im97mori.ble.constants.ServiceUUID {
	}

	/**
	 * use {@link org.im97mori.ble.constants.CharacteristicUUID}
	 */
	@Deprecated
	public static final class CharacteristicUUID extends org.im97mori.ble.constants.CharacteristicUUID {
	}

	/**
	 * use {@link org.im97mori.ble.constants.UnitUUID}
	 */
	@Deprecated
	public static final class UnitUUID extends org.im97mori.ble.constants.UnitUUID {
	}

	/**
	 * use {@link org.im97mori.ble.constants.ErrorCode}
	 */
	@Deprecated
	public static final class ErrorCodes extends org.im97mori.ble.constants.ErrorCode {
	}

	/**
	 * Maximum MTU size
	 * <p>
	 * Core Specification v5.3 Vol 3 Part F 3.2.9
	 */
	public static final int MAXIMUM_MTU = 512;

}
