package org.im97mori.ble.constants;

/**
 * BLE GATT Data Type
 * <p>
 * Generic Access Profile
 * Revision Date: 2021-07-13
 */
public class DataType {

    // Supplement to the Bluetooth Core Specification v10

    // 1.1 SERVICE UUID

    /**
     * Incomplete List of 16-bit Service Class UUIDs
     */
    public static final int DATA_TYPE_INCOMPLETE_LIST_OF_16_BIT_SERVICE_UUIDS = 0x02;

    /**
     * Complete List of 16-bit Service Class UUIDs
     */
    public static final int DATA_TYPE_COMPLETE_LIST_OF_16_BIT_SERVICE_UUIDS = 0x03;

    /**
     * Incomplete List of 32-bit Service Class UUIDs
     */
    public static final int DATA_TYPE_INCOMPLETE_LIST_OF_32_BIT_SERVICE_UUIDS = 0x04;

    /**
     * Complete List of 32-bit Service Class UUIDs
     */
    public static final int DATA_TYPE_COMPLETE_LIST_OF_32_BIT_SERVICE_UUIDS = 0x05;

    /**
     * Incomplete List of 128-bit Service Class UUIDs
     */
    public static final int DATA_TYPE_INCOMPLETE_LIST_OF_128_BIT_SERVICE_UUIDS = 0x06;

    /**
     * Complete List of 128-bit Service Class UUIDs
     */
    public static final int DATA_TYPE_COMPLETE_LIST_OF_128_BIT_SERVICE_UUIDS = 0x07;

    // 1.2 LOCAL NAME

    /**
     * Shortened Local Name
     */
    public static final int DATA_TYPE_SHORTENED_LOCAL_NAME = 0x08;

    /**
     * Complete Local Name
     */
    public static final int DATA_TYPE_COMPLETE_LOCAL_NAME = 0x09;

    // 1.3 FLAGS

    /**
     * Flags
     * 
     */
    public static final int DATA_TYPE_FLAGS = 0x01;

    // 1.4 MANUFACTURER SPECIFIC DATA

    /**
     * Manufacturer Specific Data
     */
    public static final int DATA_TYPE_MANUFACTURER_SPECIFIC_DATA = 0xff;

    // 1.5 TX POWER LEVEL

    /**
     * Tx Power Level
     */
    public static final int DATA_TYPE_TX_POWER_LEVEL = 0x0a;

    // 1.6 SECURE SIMPLE PAIRING OUT OF BAND (OOB)

    /**
     * Class of Device
     */
    public static final int DATA_TYPE_CLASS_OF_DEVICE = 0x0d;

    /**
     * Simple Pairing Hash C
     */
    public static final int DATA_TYPE_SIMPLE_PAIRING_HASH_C = 0x0e;

    /**
     * Simple Pairing Hash C-192
     */
    public static final int DATA_TYPE_SIMPLE_PAIRING_HASH_C_192 = 0x0e;

    /**
     * Simple Pairing Randomizer R
     */
    public static final int DATA_TYPE_SIMPLE_PAIRING_RANDOMIZER_R = 0x0f;

    /**
     * Simple Pairing Randomizer R-192
     */
    public static final int DATA_TYPE_SIMPLE_PAIRING_RANDOMIZER_R_192 = 0x0f;

    /**
     * Simple Pairing Hash C-256
     */
    public static final int DATA_TYPE_SIMPLE_PAIRING_HASH_C_256 = 0x1d;

    /**
     * LE Secure Connections Confirmation Value
     */
    public static final int DATA_TYPE_LE_SECURE_CONNECTIONS_CONFIRMATION_VALUE = 0x22;

    /**
     * Simple Pairing Randomizer R-256
     */
    public static final int DATA_TYPE_SIMPLE_PAIRING_RANDOMIZER_R_256 = 0x1e;

    /**
     * LE Secure Connections Random Value
     */
    public static final int DATA_TYPE_LE_SECURE_CONNECTIONS_RANDOM_VALUE = 0x23;

    // 1.7 SECURITY MANAGER OUT OF BAND (OOB)

    /**
     * Security Manager Out of Band Flag
     */
    public static final int DATA_TYPE_SECURITY_MANAGER_OUT_OF_BAND_FLAG = 0x11;

    // 1.8 SECURITY MANAGER TK VALUE

    /**
     * Security Manager TK Value
     */
    public static final int DATA_TYPE_SECURITY_MANAGER_TK_VALUE = 0x10;

    // 1.9 PERIPHERAL CONNECTION INTERVAL RANGE(SLAVE CONNECTION INTERVAL RANGE)

    /**
     * Peripheral Connection Interval Range(Slave Connection Interval Range)
     */
    public static final int DATA_TYPE_PERIPHERAL_CONNECTION_INTERVAL_RANGE = 0x12;

    // 1.10 SERVICE SOLICITATION

    /**
     * List of 16-bit Service Solicitation UUIDs
     */
    public static final int DATA_TYPE_LIST_OF_16_BIT_SERVICE_SOLICITATION_UUIDS = 0x14;

    /**
     * List of 32-bit Service Solicitation UUIDs
     */
    public static final int DATA_TYPE_LIST_OF_32_BIT_SERVICE_SOLICITATION_UUIDS = 0x1f;

    /**
     * List of 128-bit Service Solicitation UUIDs
     */
    public static final int DATA_TYPE_LIST_OF_128_BIT_SERVICE_SOLICITATION_UUIDS = 0x15;

    // 1.11 SERVICE DATA

    /**
     * Service Data
     */
    public static final int DATA_TYPE_SERVICE_DATA = 0x16;

    /**
     * Service Data - 16-bit UUID
     */
    public static final int DATA_TYPE_SERVICE_DATA_16_BIT_UUID = 0x16;

    /**
     * Service Data - 32-bit UUID
     */
    public static final int DATA_TYPE_SERVICE_DATA_32_BIT_UUID = 0x20;

    /**
     * Service Data - 128-bit UUID
     */
    public static final int DATA_TYPE_SERVICE_DATA_128_BIT_UUID = 0x21;

    // 1.12 APPEARANCE

    /**
     * Appearance
     */
    public static final int DATA_TYPE_APPEARANCE = 0x19;

    // 1.13 PUBLIC TARGET ADDRESS

    /**
     * Public Target Address
     */
    public static final int DATA_TYPE_PUBLIC_TARGET_ADDRESS = 0x17;

    // 1.14 RANDOM TARGET ADDRESS

    /**
     * Random Target Address
     */
    public static final int DATA_TYPE_RANDOM_TARGET_ADDRESS = 0x18;

    // 1.15 ADVERTISING INTERVAL

    /**
     * Advertising Interval
     */
    public static final int DATA_TYPE_ADVERTISING_INTERVAL = 0x1a;

    /**
     * Advertising Interval - long
     */
    public static final int DATA_TYPE_ADVERTISING_INTERVAL_LONG = 0x2f;

    // 1.16 LE BLUETOOTH DEVICE ADDRESS

    /**
     * LE Bluetooth Device Address
     */
    public static final int DATA_TYPE_LE_BLUETOOTH_DEVICE_ADDRESS = 0x1b;

    // 1.17 LE ROLE

    /**
     * LE Role
     */
    public static final int DATA_TYPE_LE_ROLE = 0x1c;

    // 1.18 UNIFORM RESOURCE IDENTIFIER (URI)

    /**
     * URI
     */
    public static final int DATA_TYPE_UNIFORM_RESOURCE_IDENTIFIER = 0x24;

    // 1.19 LE SUPPORTED FEATURES

    /**
     * LE Supported Features
     */
    public static final int DATA_TYPE_LE_SUPPORTED_FEATURES = 0x27;

    // 1.20 CHANNEL MAP UPDATE INDICATION

    /**
     * Channel Map Update Indication
     */
    public static final int DATA_TYPE_CHANNEL_MAP_UPDATE_INDICATION = 0x28;

    // 1.21 BIG INFO

    /**
     * BIGInfo
     */
    public static final int DATA_TYPE_BIG_INFO = 0x2c;

    // 1.21 BROADCAST_CODE

    /**
     * Broadcast_Code
     */
    public static final int DATA_TYPE_BROADCAST_CODE = 0x2d;

    // Indoor Positioning Service

    /**
     * Indoor Positioning
     */
    public static final int DATA_TYPE_INDOOR_POSITIONING = 0x25;

    // Transport Discovery Service

    /**
     * Transport Discovery Data
     */
    public static final int DATA_TYPE_TRANSPORT_DISCOVERY_DATA = 0x26;

    // Device ID Profile

    /**
     * Device ID
     */
    public static final int DATA_TYPE_DEVICE_ID = 0x10;

    // Mesh Profile

    /**
     * PB-ADV
     */
    public static final int DATA_TYPE_PB_ADV = 0x29;

    /**
     * Mesh Message
     */
    public static final int DATA_TYPE_MESH_MESSAGE = 0x2a;

    /**
     * Mesh BEACON
     */
    public static final int DATA_TYPE_MESH_BEACON = 0x2b;

    // Coordinated Set Identification Profile

    /**
     * Resolvable Set Identifier
     */
    public static final int DATA_TYPE_RESOLVABLE_SET_IDENTIFIER = 0x2e;

    // 3D Synchronization Profile

    /**
     * 3D Information Data
     */
    public static final int DATA_TYPE_3D_INFORMATION_DATA = 0x3d;

}