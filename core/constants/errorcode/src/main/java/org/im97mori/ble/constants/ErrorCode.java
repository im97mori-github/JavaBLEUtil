package org.im97mori.ble.constants;

/**
 * <p>
 * Core Specification v5.3 Vol 3 Part F 3.4.1 Revision Date: 2021-07-13
 * Supplement to the Bluetooth Core Specification v10 Part B 1.2
 * </p>
 */
public class ErrorCode {

	/**
	 * The attribute handle given was not valid on this server.
	 */
	public static final int INVALID_HANDLE = 0x01;

	/**
	 * The attribute cannot be read.
	 *
	 * <a href=
	 * "https://developer.android.com/reference/android/bluetooth/BluetoothGatt#GATT_READ_NOT_PERMITTED">BluetoothGatt#GATT_READ_NOT_PERMITTED</a>
	 */
	public static final int READ_NOT_PERMITTED = 0x02;

	/**
	 * The attribute cannot be written
	 *
	 * <a href=
	 * "https://developer.android.com/reference/android/bluetooth/BluetoothGatt#GATT_WRITE_NOT_PERMITTED">BluetoothGatt#GATT_WRITE_NOT_PERMITTED</a>
	 */
	public static final int WRITE_NOT_PERMITTED = 0x03;

	/**
	 * The attribute PDU was invalid.
	 */
	public static final int INVALID_PDU = 0x04;

	/**
	 * The attribute requires authentication before it can be read or written.
	 *
	 * <a href=
	 * "https://developer.android.com/reference/android/bluetooth/BluetoothGatt#GATT_INSUFFICIENT_AUTHENTICATION">BluetoothGatt#GATT_INSUFFICIENT_AUTHENTICATION</a>
	 */
	public static final int INSUFFICIENT_AUTHENTICATION = 0x05;

	/**
	 * Attribute server does not support the request received from the client.
	 *
	 * <a href=
	 * "https://developer.android.com/reference/android/bluetooth/BluetoothGatt#GATT_REQUEST_NOT_SUPPORTED">BluetoothGatt#GATT_REQUEST_NOT_SUPPORTED</a>
	 */
	public static final int REQUEST_NOT_SUPPORTED = 0x06;

	/**
	 * Offset specified was past the end of the attribute.
	 *
	 * <a href=
	 * "https://developer.android.com/reference/android/bluetooth/BluetoothGatt#GATT_INVALID_OFFSET">BluetoothGatt#GATT_INVALID_OFFSET</a>
	 */
	public static final int INVALID_OFFSET = 0x07;

	/**
	 * The attribute requires authorization before it can be read or written.
	 */
	public static final int INSUFFICIENT_AUTHORIZATION = 0x08;

	/**
	 * Too many prepare writes have been queued.
	 */
	public static final int PREPARE_QUEUE_FULL = 0x09;

	/**
	 * No attribute found within the given attri-bute handle range.
	 */
	public static final int ATTRIBUTE_NOT_FOUND = 0x0a;

	/**
	 * The attribute cannot be read using the Read Blob Request.
	 */
	public static final int ATTRIBUTE_NOT_LONG = 0x0b;

	/**
	 * The Encryption Key Size used for encrypting this link is too short. This was
	 * previously "Insufficient Encryption Key Size".
	 */
	public static final int ENCRYPTION_KEY_SIZE_TOO_SHORT = 0x0c;

	/**
	 * The attribute value length is invalid for the operation.
	 *
	 * <a href=
	 * "https://developer.android.com/reference/android/bluetooth/BluetoothGatt#GATT_INVALID_ATTRIBUTE_LENGTH">BluetoothGatt#GATT_INVALID_ATTRIBUTE_LENGTH</a>
	 */
	public static final int INVALID_ATTRIBUTE_VALUE_LENGTH = 0x0d;

	/**
	 * The attribute request that was requested has encountered an error that was
	 * unlikely, and therefore could not be completed as requested.
	 */
	public static final int UNLIKELY_ERROR = 0x0e;

	/**
	 * The attribute requires encryption before it can be read or written.
	 *
	 * <a href=
	 * "https://developer.android.com/reference/android/bluetooth/BluetoothGatt#GATT_INVALID_ATTRIBUTE_LENGTH">BluetoothGatt#GATT_INVALID_ATTRIBUTE_LENGTH</a>
	 */
	public static final int INSUFFICIENT_ENCRYPTION = 0x0f;

	/**
	 * The attribute type is not a supported grouping attribute as defined by a
	 * higher layer specification.
	 */
	public static final int UNSUPPORTED_GROUP_TYPE = 0x10;

	/**
	 * Insufficient Resources to complete the request.
	 */
	public static final int INSUFFICIENT_RESOURCES = 0x11;

	/**
	 * The server requests the client to redis-cover the database.
	 */
	public static final int DATABASE_OUT_OF_SYNC = 0x12;

	/**
	 * The attribute parameter value was not allowed.
	 */
	public static final int VALUE_NOT_ALLOWED = 0x13;

	// Application Error

	/**
	 * <p>
	 * Data field ignored(Current Time Service v1.1.0 1.6) User Data Access Not
	 * Permitted(User Data Service v1.1 1.6) Control Point value not supported(Heart
	 * Rate Service v1.0 1.6) Out of Range(Health Thermometer Service v1.0 1.6)
	 * Trigger condition value not supported(Automation IO Service v1.0.0 1.6)
	 * Inappropriate Connection Parameters(Cycling Power Service v1.1 1.6) Procedure
	 * Already in Progress(Cycling Speed and Cadence Service v1.1 1.6) Procedure
	 * Already in Progress(Running Speed and Cadence Service v1.1 1.6) Invalid
	 * Value(Indoor Positioning Service v1.0.0 1.6) Op Code not supported(Bond
	 * Management Service v1.0.0 1.7) Missing CRC(Reconnection Configuration Service
	 * v1.0 1.7) Write Request Rejected(Environmental Sensing Service v1.0.0 1.6)
	 * Write Request Rejected(Object Transfer Service v10 1.10)
	 * </p>
	 */
	public static final int APPLICATION_ERROR_80 = 0x80;

	/**
	 * <p>
	 * Client Characteristic Configuration descriptor improperly configured(Cycling
	 * Speed and Cadence Service v1.1 1.6) Client Characteristic Configuration
	 * descriptor improperly configured(Running Speed and Cadence Service v1.1 1.6)
	 * Invalid Request(HTTP Proxy Service v1.0 1.6) Operation failed(Bond Management
	 * Service v1.0.0 1.7) Invalid CRC(Reconnection Configuration Service v1.0 1.7)
	 * Condition not supported(Environmental Sensing Service v1.0.0 1.6) Object Not
	 * Selected(Object Transfer Service v10 1.10)
	 * </p>
	 */
	public static final int APPLICATION_ERROR_81 = 0x81;

	/**
	 * <p>
	 * Network Not Available(HTTP Proxy Service v1.0 1.6) Concurrency Limit
	 * Exceeded(Object Transfer Service v10 1.10)
	 * </p>
	 */
	public static final int APPLICATION_ERROR_82 = 0x82;

	/**
	 * Object Name Already Exists(Object Transfer Service v10 1.10)
	 */
	public static final int APPLICATION_ERROR_83 = 0x83;

	/**
	 * Application Error 0x84
	 */
	public static final int APPLICATION_ERROR_84 = 0x84;

	/**
	 * Application Error 0x85
	 */
	public static final int APPLICATION_ERROR_85 = 0x85;

	/**
	 * Application Error 0x86
	 */
	public static final int APPLICATION_ERROR_86 = 0x86;

	/**
	 * Application Error 0x87
	 */
	public static final int APPLICATION_ERROR_87 = 0x87;

	/**
	 * Application Error 0x88
	 */
	public static final int APPLICATION_ERROR_88 = 0x88;

	/**
	 * Application Error 0x89
	 */
	public static final int APPLICATION_ERROR_89 = 0x89;

	/**
	 * Application Error 0x8a
	 */
	public static final int APPLICATION_ERROR_8A = 0x8a;

	/**
	 * Application Error 0x8b
	 */
	public static final int APPLICATION_ERROR_8B = 0x8b;

	/**
	 * Application Error 0x8c
	 */
	public static final int APPLICATION_ERROR_8C = 0x8c;

	/**
	 * Application Error 0x8d
	 */
	public static final int APPLICATION_ERROR_8D = 0x8d;

	/**
	 * Application Error 0x8e
	 */
	public static final int APPLICATION_ERROR_8E = 0x8e;

	/**
	 * <a href=
	 * "https://developer.android.com/reference/android/bluetooth/BluetoothGatt#GATT_CONNECTION_CONGESTED">BluetoothGatt#GATT_CONNECTION_CONGESTED</a>
	 */
	public static final int APPLICATION_ERROR_8F = 0x8f;

	/**
	 * Application Error 0x90
	 */
	public static final int APPLICATION_ERROR_90 = 0x90;

	/**
	 * Application Error 0x91
	 */
	public static final int APPLICATION_ERROR_91 = 0x91;

	/**
	 * Application Error 0x92
	 */
	public static final int APPLICATION_ERROR_92 = 0x92;

	/**
	 * Application Error 0x93
	 */
	public static final int APPLICATION_ERROR_93 = 0x93;

	/**
	 * Application Error 0x94
	 */
	public static final int APPLICATION_ERROR_94 = 0x94;

	/**
	 * Application Error 0x95
	 */
	public static final int APPLICATION_ERROR_95 = 0x95;

	/**
	 * Application Error 0x96
	 */
	public static final int APPLICATION_ERROR_96 = 0x96;

	/**
	 * Application Error 0x97
	 */
	public static final int APPLICATION_ERROR_97 = 0x97;

	/**
	 * Application Error 0x98
	 */
	public static final int APPLICATION_ERROR_98 = 0x98;

	/**
	 * Application Error 0x99
	 */
	public static final int APPLICATION_ERROR_99 = 0x99;

	/**
	 * Application Error 0x9a
	 */
	public static final int APPLICATION_ERROR_9A = 0x9a;

	/**
	 * Application Error 0x9b
	 */
	public static final int APPLICATION_ERROR_9B = 0x9b;

	/**
	 * Application Error 0x9c
	 */
	public static final int APPLICATION_ERROR_9C = 0x9c;

	/**
	 * Application Error 0x9d
	 */
	public static final int APPLICATION_ERROR_9D = 0x9d;

	/**
	 * Application Error 0x9e
	 */
	public static final int APPLICATION_ERROR_9E = 0x9e;

	/**
	 * Application Error 0x9f
	 */
	public static final int APPLICATION_ERROR_9F = 0x9f;

	/**
	 * Command not supported(Alert Notification Service v1.0 1.6)
	 */
	public static final int COMMAND_NOT_SUPPORTED = 0xa0;

	// Common Profile and Service Error Codes

	/**
	 * Common Profile and Service Error Codes 0xe0
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_E0 = 0xe0;

	/**
	 * Common Profile and Service Error Codes 0xe1
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_E1 = 0xe1;

	/**
	 * Common Profile and Service Error Codes 0xe2
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_E2 = 0xe2;

	/**
	 * Common Profile and Service Error Codes 0xe3
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_E3 = 0xe3;

	/**
	 * Common Profile and Service Error Codes 0xe4
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_E4 = 0xe4;

	/**
	 * Common Profile and Service Error Codes 0xe5
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_E5 = 0xe5;

	/**
	 * Common Profile and Service Error Codes 0xe6
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_E6 = 0xe6;

	/**
	 * Common Profile and Service Error Codes 0xe7
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_E7 = 0xe7;

	/**
	 * Common Profile and Service Error Codes 0xe8
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_E8 = 0xe8;

	/**
	 * Common Profile and Service Error Codes 0xe9
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_E9 = 0xe9;

	/**
	 * Common Profile and Service Error Codes 0xea
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_EA = 0xea;

	/**
	 * Common Profile and Service Error Codes 0xeb
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_EB = 0xeb;

	/**
	 * Common Profile and Service Error Codes 0xec
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_EC = 0xec;

	/**
	 * Common Profile and Service Error Codes 0xed
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_ED = 0xed;

	/**
	 * Common Profile and Service Error Codes 0xee
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_EE = 0xee;

	/**
	 * Common Profile and Service Error Codes 0xef
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_EF = 0xef;

	/**
	 * Common Profile and Service Error Codes 0xf0
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_F0 = 0xf0;

	/**
	 * Common Profile and Service Error Codes 0xf1
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_F1 = 0xf1;

	/**
	 * Common Profile and Service Error Codes 0xf2
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_F2 = 0xf2;

	/**
	 * Common Profile and Service Error Codes 0xf3
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_F3 = 0xf3;

	/**
	 * Common Profile and Service Error Codes 0xf4
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_F4 = 0xf4;

	/**
	 * Common Profile and Service Error Codes 0xf5
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_F5 = 0xf5;

	/**
	 * Common Profile and Service Error Codes 0xf6
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_F6 = 0xf6;

	/**
	 * Common Profile and Service Error Codes 0xf7
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_F7 = 0xf7;

	/**
	 * Common Profile and Service Error Codes 0xf8
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_F8 = 0xf8;

	/**
	 * Common Profile and Service Error Codes 0xf9
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_F9 = 0xf9;

	/**
	 * Common Profile and Service Error Codes 0xfa
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_FA = 0xfa;

	/**
	 * Common Profile and Service Error Codes 0xfb
	 */
	public static final int COMMON_PROFILE_AND_SERVICE_ERROR_CODES_FB = 0xfb;

	/**
	 * Write Request Rejected
	 */
	public static final int WRITE_REQUEST_REJECTED = 0xfc;

	/**
	 * Client Characteristic Configuration Descriptor Improperly Configured
	 */
	public static final int CLIENT_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR_IMPROPERLY_CONFIGURED = 0xfd;

	/**
	 * Procedure Already in Progress
	 */
	public static final int PROCEDURE_ALREADY_IN_PROGRESS = 0xfe;

	/**
	 * Out of Range
	 */
	public static final int OUT_OF_RANGE = 0xff;

}