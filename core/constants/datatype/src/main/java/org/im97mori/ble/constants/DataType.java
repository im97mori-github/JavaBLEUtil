package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * BLE GATT Data Type
 * <p>
 * Generic Access Profile.pdf
 * Revision Date: 2021-07-13
 */
public class DataType {

    private static final class DataTypeMap extends HashMap<Integer, String> {

        private DataTypeMap() {
            super();
            put(0x01, "Flags");
            put(0x02, "Incomplete List of 16-bit Service Class UUIDs");
            put(0x03, "Complete List of 16-bit Service Class UUIDs");
            put(0x04, "Incomplete List of 32-bit Service Class UUIDs");
            put(0x05, "Complete List of 32-bit Service Class UUIDs");
            put(0x06, "Incomplete List of 128-bit Service Class UUIDs");
            put(0x07, "Complete List of 128-bit Service Class UUIDs");
            put(0x08, "Shortened Local Name");
            put(0x09, "Complete Local Name");
            put(0x0a, "Tx Power Level");
            put(0x0b, "Class of Device");
            put(0x0c, "Simple Pairing Hash C");
            put(0x0e, "Simple Pairing Hash C-192");
            put(0x0f, "Simple Pairing Randomizer R / Simple Pairing Randomizer R-192");
            put(0x10, "Device ID / Security Manager TK Value");
            put(0x11, "Security Manager Out of Band Flags");
            put(0x12, "Peripheral Connection Interval Range(Slave Connection Interval Range)");
            put(0x14, "List of 16-bit Service Solicitation UUIDs");
            put(0x15, "List of 128-bit Service Solicitation UUIDs");
            put(0x16, "Service Data / Service Data - 16-bit UUID");
            put(0x17, "Public Target Address");
            put(0x18, "Random Target Address");
            put(0x19, "Appearance");
            put(0x1a, "Advertising Interval");
            put(0x1b, "LE Bluetooth Device Address");
            put(0x1c, "LE Role");
            put(0x1d, "Simple Pairing Hash C-256");
            put(0x1e, "Simple Pairing Randomizer R-256");
            put(0x1f, "List of 32-bit Service Solicitation UUIDs");
            put(0x20, "Service Data - 32-bit UUID");
            put(0x21, "Service Data - 128-bit UUID");
            put(0x22, "LE Secure Connections Confirmation Value");
            put(0x23, "LE Secure Connections Random Value");
            put(0x24, "URI");
            put(0x25, "Indoor Positioning");
            put(0x26, "Transport Discovery Data");
            put(0x27, "LE Supported Features");
            put(0x28, "Channel Map Update Indication");
            put(0x29, "PB-ADV");
            put(0x2a, "Mesh Message");
            put(0x2b, "Mesh Beacon");
            put(0x2c, "BIGInfo");
            put(0x2d, "Broadcast_Code");
            put(0x2e, "Resolvable Set Identifier");
            put(0x2f, "Advertising Interval - long");
            put(0x3d, "3D Information Data");
            put(0xff, "Manufacturer Specific Data");
        }

    }

    /**
     * Generic Access Profile.pdf
     */
    public static final Map<Integer, String> DATA_TYPE_MAPPING = Collections.synchronizedMap(Collections.unmodifiableMap(new DataTypeMap()));
   
    /**
     * Flags (Data Type Value: 0x01)
     */
    public static final int FLAGS_DATA_TYPE = 0x01;

    /**
     * Incomplete List of 16-bit Service Class UUIDs (Data Type Value: 0x02)
     */
    public static final int INCOMPLETE_LIST_OF_16_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE = 0x02;

    /**
     * Complete List of 16-bit Service Class UUIDs (Data Type Value: 0x03)
     */
    public static final int COMPLETE_LIST_OF_16_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE = 0x03;

    /**
     * Incomplete List of 32-bit Service Class UUIDs (Data Type Value: 0x04)
     */
    public static final int INCOMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE = 0x04;

    /**
     * Complete List of 32-bit Service Class UUIDs (Data Type Value: 0x05)
     */
    public static final int COMPLETE_LIST_OF_32_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE = 0x05;

    /**
     * Incomplete List of 128-bit Service Class UUIDs (Data Type Value: 0x06)
     */
    public static final int INCOMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE = 0x06;

    /**
     * Complete List of 128-bit Service Class UUIDs (Data Type Value: 0x07)
     */
    public static final int COMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE = 0x07;

    /**
     * Shortened Local Name (Data Type Value: 0x08)
     */
    public static final int SHORTENED_LOCAL_NAME_DATA_TYPE = 0x08;

    /**
     * Complete Local Name (Data Type Value: 0x09)
     */
    public static final int COMPLETE_LOCAL_NAME_DATA_TYPE = 0x09;

    /**
     * Tx Power Level (Data Type Value: 0x0a)
     */
    public static final int TX_POWER_LEVEL_DATA_TYPE = 0x0a;

    /**
     * Class of Device (Data Type Value: 0x0b)
     */
    public static final int CLASSOF_DEVICE_DATA_TYPE = 0x0b;

    /**
     * Simple Pairing Hash C (Data Type Value: 0x0c)
     */
    public static final int SIMPLE_PAIRING_HASH_C_DATA_TYPE = 0x0c;

    /**
     * Simple Pairing Hash C-192 (Data Type Value: 0x0e)
     */
    public static final int SIMPLE_PAIRING_HASH_C192_DATA_TYPE = 0x0e;

    /**
     * Simple Pairing Randomizer R (Data Type Value: 0x0f)
     */
    public static final int SIMPLE_PAIRING_RANDOMIZER_R_DATA_TYPE = 0x0f;

    /**
     * Simple Pairing Randomizer R-192 (Data Type Value: 0x0f)
     */
    public static final int SIMPLE_PAIRING_RANDOMIZER_R192_DATA_TYPE = 0x0f;

    /**
     * Device ID (Data Type Value: 0x10)
     */
    public static final int DEVICE_ID_DATA_TYPE = 0x10;

    /**
     * Security Manager TK Value (Data Type Value: 0x10)
     */
    public static final int SECURITY_MANAGER_TK_VALUE_DATA_TYPE = 0x10;

    /**
     * Security Manager Out of Band Flags (Data Type Value: 0x11)
     */
    public static final int SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE = 0x11;

    /**
     * Peripheral Connection Interval Range(Slave Connection Interval Range) (Data Type Value: 0x12)
     */
    public static final int PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE = 0x12;

    /**
     * List of 16-bit Service Solicitation UUIDs (Data Type Value: 0x14)
     */
    public static final int LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE = 0x14;

    /**
     * List of 128-bit Service Solicitation UUIDs (Data Type Value: 0x15)
     */
    public static final int LIST_OF_128_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE = 0x15;

    /**
     * Service Data (Data Type Value: 0x16)
     */
    public static final int SERVICE_DATA_DATA_TYPE = 0x16;

    /**
     * Service Data - 16-bit UUID (Data Type Value: 0x16)
     */
    public static final int SERVICE_DATA_16_BIT_UUID_DATA_TYPE = 0x16;

    /**
     * Public Target Address (Data Type Value: 0x17)
     */
    public static final int PUBLIC_TARGET_ADDRESS_DATA_TYPE = 0x17;

    /**
     * Random Target Address (Data Type Value: 0x18)
     */
    public static final int RANDOM_TARGET_ADDRESS_DATA_TYPE = 0x18;

    /**
     * Appearance (Data Type Value: 0x19)
     */
    public static final int APPEARANCE_DATA_TYPE = 0x19;

    /**
     * Advertising Interval (Data Type Value: 0x1a)
     */
    public static final int ADVERTISING_INTERVAL_DATA_TYPE = 0x1a;

    /**
     * LE Bluetooth Device Address (Data Type Value: 0x1b)
     */
    public static final int LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE = 0x1b;

    /**
     * LE Role (Data Type Value: 0x1c)
     */
    public static final int LE_ROLE_DATA_TYPE = 0x1c;

    /**
     * Simple Pairing Hash C-256 (Data Type Value: 0x1d)
     */
    public static final int SIMPLE_PAIRING_HASH_C_256_DATA_TYPE = 0x1d;

    /**
     * Simple Pairing Randomizer R-256 (Data Type Value: 0x1e)
     */
    public static final int SIMPLE_PAIRING_RANDOMIZER_R_256_DATA_TYPE = 0x1e;

    /**
     * List of 32-bit Service Solicitation UUIDs (Data Type Value: 0x1f)
     */
    public static final int LIST_OF_32_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE = 0x1f;

    /**
     * Service Data - 32-bit UUID (Data Type Value: 0x20)
     */
    public static final int SERVICE_DATA_32_BIT_UUID_DATA_TYPE = 0x20;

    /**
     * Service Data - 128-bit UUID (Data Type Value: 0x21)
     */
    public static final int SERVICE_DATA_128_BIT_UUID_DATA_TYPE = 0x21;

    /**
     * LE Secure Connections Confirmation Value (Data Type Value: 0x22)
     */
    public static final int LE_SECURE_CONNECTIONS_CONFIRMATION_VALUE_DATA_TYPE = 0x22;

    /**
     * LE Secure Connections Random Value (Data Type Value: 0x23)
     */
    public static final int LE_SECURE_CONNECTIONS_RANDOM_VALUE_DATA_TYPE = 0x23;

    /**
     * URI (Data Type Value: 0x24)
     */
    public static final int URI_DATA_TYPE = 0x24;

    /**
     * Indoor Positioning (Data Type Value: 0x25)
     */
    public static final int INDOOR_POSITIONING_DATA_TYPE = 0x25;

    /**
     * Transport Discovery Data (Data Type Value: 0x26)
     */
    public static final int TRANSPORT_DISCOVERY_DATA_DATA_TYPE = 0x26;

    /**
     * LE Supported Features (Data Type Value: 0x27)
     */
    public static final int LE_SUPPORTED_FEATURES_DATA_TYPE = 0x27;

    /**
     * Channel Map Update Indication (Data Type Value: 0x28)
     */
    public static final int CHANNEL_MAP_UPDATE_INDICATION_DATA_TYPE = 0x28;

    /**
     * PB-ADV (Data Type Value: 0x29)
     */
    public static final int PB_ADV_DATA_TYPE = 0x29;

    /**
     * Mesh Message (Data Type Value: 0x2a)
     */
    public static final int MESH_MESSAGE_DATA_TYPE = 0x2a;

    /**
     * Mesh Beacon (Data Type Value: 0x2b)
     */
    public static final int MESH_BEACON_DATA_TYPE = 0x2b;

    /**
     * BIGInfo (Data Type Value: 0x2c)
     */
    public static final int BIG_INFO_DATA_TYPE = 0x2c;

    /**
     * Broadcast_Code (Data Type Value: 0x2d)
     */
    public static final int BROADCAST_CODE_DATA_TYPE = 0x2d;

    /**
     * Resolvable Set Identifier (Data Type Value: 0x2e)
     */
    public static final int RESOLVABLE_SET_IDENTIFIER_DATA_TYPE = 0x2e;

    /**
     * Advertising Interval - long (Data Type Value: 0x2f)
     */
    public static final int ADVERTISING_INTERVAL_LONG_DATA_TYPE = 0x2f;

    /**
     * 3D Information Data (Data Type Value: 0x3d)
     */
    public static final int THREE_D_INFORMATION_DATA_DATA_TYPE = 0x3d;

    /**
     * Manufacturer Specific Data (Data Type Value: 0xff)
     */
    public static final int MANUFACTURER_SPECIFIC_DATA_DATA_TYPE = 0xff;

}