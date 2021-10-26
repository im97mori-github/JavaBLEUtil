package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT Service UUID
 * <p>
 * 16-bit UUID Numbers Document.pdf Revision Date: 2021-10-01
 */
public class ServiceUUID {

	@SuppressWarnings("serial")
	private static final class Map128 extends HashMap<UUID, String> {

		private Map128() {
			super();
			put(UUID.fromString("00001800-0000-1000-8000-00805f9b34fb"), "Generic Access");
			put(UUID.fromString("00001801-0000-1000-8000-00805f9b34fb"), "Generic Attribute");
			put(UUID.fromString("00001802-0000-1000-8000-00805f9b34fb"), "Immediate Alert");
			put(UUID.fromString("00001803-0000-1000-8000-00805f9b34fb"), "Link Loss");
			put(UUID.fromString("00001804-0000-1000-8000-00805f9b34fb"), "Tx Power");
			put(UUID.fromString("00001805-0000-1000-8000-00805f9b34fb"), "Current Time");
			put(UUID.fromString("00001806-0000-1000-8000-00805f9b34fb"), "Reference Time Update");
			put(UUID.fromString("00001807-0000-1000-8000-00805f9b34fb"), "Next Dst Change");
			put(UUID.fromString("00001808-0000-1000-8000-00805f9b34fb"), "Glucose");
			put(UUID.fromString("00001809-0000-1000-8000-00805f9b34fb"), "Health Thermometer");
			put(UUID.fromString("0000180a-0000-1000-8000-00805f9b34fb"), "Device Information");
			put(UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb"), "Heart Rate");
			put(UUID.fromString("0000180e-0000-1000-8000-00805f9b34fb"), "Phone Alert Status");
			put(UUID.fromString("0000180f-0000-1000-8000-00805f9b34fb"), "Battery");
			put(UUID.fromString("00001810-0000-1000-8000-00805f9b34fb"), "Blood Pressure");
			put(UUID.fromString("00001811-0000-1000-8000-00805f9b34fb"), "Alert Notification");
			put(UUID.fromString("00001812-0000-1000-8000-00805f9b34fb"), "Human Interface Device");
			put(UUID.fromString("00001813-0000-1000-8000-00805f9b34fb"), "Scan Parameters");
			put(UUID.fromString("00001814-0000-1000-8000-00805f9b34fb"), "Running Speed and Cadence");
			put(UUID.fromString("00001815-0000-1000-8000-00805f9b34fb"), "Automation Io");
			put(UUID.fromString("00001816-0000-1000-8000-00805f9b34fb"), "Cycling Speed and Cadence");
			put(UUID.fromString("00001818-0000-1000-8000-00805f9b34fb"), "Cycling Power");
			put(UUID.fromString("00001819-0000-1000-8000-00805f9b34fb"), "Location and Navigation");
			put(UUID.fromString("0000181a-0000-1000-8000-00805f9b34fb"), "Environmental Sensing");
			put(UUID.fromString("0000181b-0000-1000-8000-00805f9b34fb"), "Body Composition");
			put(UUID.fromString("0000181c-0000-1000-8000-00805f9b34fb"), "User Data");
			put(UUID.fromString("0000181d-0000-1000-8000-00805f9b34fb"), "Weight Scale");
			put(UUID.fromString("0000181e-0000-1000-8000-00805f9b34fb"), "Bond Management");
			put(UUID.fromString("0000181f-0000-1000-8000-00805f9b34fb"), "Continuous Glucose Monitoring");
			put(UUID.fromString("00001820-0000-1000-8000-00805f9b34fb"), "Internet Protocol Support");
			put(UUID.fromString("00001821-0000-1000-8000-00805f9b34fb"), "Indoor Positioning");
			put(UUID.fromString("00001822-0000-1000-8000-00805f9b34fb"), "Pulse Oximeter");
			put(UUID.fromString("00001823-0000-1000-8000-00805f9b34fb"), "Http Proxy");
			put(UUID.fromString("00001824-0000-1000-8000-00805f9b34fb"), "Transport Discovery");
			put(UUID.fromString("00001825-0000-1000-8000-00805f9b34fb"), "Object Transfer");
			put(UUID.fromString("00001826-0000-1000-8000-00805f9b34fb"), "Fitness Machine");
			put(UUID.fromString("00001827-0000-1000-8000-00805f9b34fb"), "Mesh Provisioning");
			put(UUID.fromString("00001828-0000-1000-8000-00805f9b34fb"), "Mesh Proxy");
			put(UUID.fromString("00001829-0000-1000-8000-00805f9b34fb"), "Reconnection Configuration");
			put(UUID.fromString("0000183a-0000-1000-8000-00805f9b34fb"), "Insulin Delivery");
			put(UUID.fromString("0000183b-0000-1000-8000-00805f9b34fb"), "Binary Sensor");
			put(UUID.fromString("0000183c-0000-1000-8000-00805f9b34fb"), "Emergency Configuration");
			put(UUID.fromString("0000183e-0000-1000-8000-00805f9b34fb"), "Physical Activity Monitor");
			put(UUID.fromString("00001843-0000-1000-8000-00805f9b34fb"), "Audio Input Control");
			put(UUID.fromString("00001844-0000-1000-8000-00805f9b34fb"), "Volume Control");
			put(UUID.fromString("00001845-0000-1000-8000-00805f9b34fb"), "Volume Offset Control");
			put(UUID.fromString("00001846-0000-1000-8000-00805f9b34fb"), "Coordinated Set Identification");
			put(UUID.fromString("00001847-0000-1000-8000-00805f9b34fb"), "Device Time");
			put(UUID.fromString("00001848-0000-1000-8000-00805f9b34fb"), "Media Control");
			put(UUID.fromString("00001849-0000-1000-8000-00805f9b34fb"), "Generic Media Control");
			put(UUID.fromString("0000184a-0000-1000-8000-00805f9b34fb"), "Constant Tone Extension");
			put(UUID.fromString("0000184b-0000-1000-8000-00805f9b34fb"), "Telephone Bearer");
			put(UUID.fromString("0000184c-0000-1000-8000-00805f9b34fb"), "Generic Telephone Bearer");
			put(UUID.fromString("0000184d-0000-1000-8000-00805f9b34fb"), "Microphone Control");
			put(UUID.fromString("0000184e-0000-1000-8000-00805f9b34fb"), "Audio Stream Control Service");
			put(UUID.fromString("0000184f-0000-1000-8000-00805f9b34fb"), "Broadcast Audio Scan Service");
			put(UUID.fromString("00001850-0000-1000-8000-00805f9b34fb"), "Published Audio Capabilities Service");
			put(UUID.fromString("00001851-0000-1000-8000-00805f9b34fb"), "Basic Audio Announcement Service");
			put(UUID.fromString("00001852-0000-1000-8000-00805f9b34fb"), "Broadcast Audio Announcement Service");
		}

	}

	/**
	 * 16-bit UUID Numbers Document.pdf
	 */
	public static final Map<UUID, String> SERVICE_MAPPING_128 = Collections
			.synchronizedMap(Collections.unmodifiableMap(new Map128()));

	/**
	 * Generic Access (Service UUID: 0x1800)
	 */
	public static final UUID GENERIC_ACCESS_SERVICE = UUID.fromString("00001800-0000-1000-8000-00805f9b34fb");

	/**
	 * Generic Attribute (Service UUID: 0x1801)
	 */
	public static final UUID GENERIC_ATTRIBUTE_SERVICE = UUID.fromString("00001801-0000-1000-8000-00805f9b34fb");

	/**
	 * Immediate Alert (Service UUID: 0x1802)
	 */
	public static final UUID IMMEDIATE_ALERT_SERVICE = UUID.fromString("00001802-0000-1000-8000-00805f9b34fb");

	/**
	 * Link Loss (Service UUID: 0x1803)
	 */
	public static final UUID LINK_LOSS_SERVICE = UUID.fromString("00001803-0000-1000-8000-00805f9b34fb");

	/**
	 * Tx Power (Service UUID: 0x1804)
	 */
	public static final UUID TX_POWER_SERVICE = UUID.fromString("00001804-0000-1000-8000-00805f9b34fb");

	/**
	 * Current Time (Service UUID: 0x1805)
	 */
	public static final UUID CURRENT_TIME_SERVICE = UUID.fromString("00001805-0000-1000-8000-00805f9b34fb");

	/**
	 * Reference Time Update (Service UUID: 0x1806)
	 */
	public static final UUID REFERENCE_TIME_UPDATE_SERVICE = UUID.fromString("00001806-0000-1000-8000-00805f9b34fb");

	/**
	 * Next Dst Change (Service UUID: 0x1807)
	 */
	public static final UUID NEXT_DST_CHANGE_SERVICE = UUID.fromString("00001807-0000-1000-8000-00805f9b34fb");

	/**
	 * Glucose (Service UUID: 0x1808)
	 */
	public static final UUID GLUCOSE_SERVICE = UUID.fromString("00001808-0000-1000-8000-00805f9b34fb");

	/**
	 * Health Thermometer (Service UUID: 0x1809)
	 */
	public static final UUID HEALTH_THERMOMETER_SERVICE = UUID.fromString("00001809-0000-1000-8000-00805f9b34fb");

	/**
	 * Device Information (Service UUID: 0x180a)
	 */
	public static final UUID DEVICE_INFORMATION_SERVICE = UUID.fromString("0000180a-0000-1000-8000-00805f9b34fb");

	/**
	 * Heart Rate (Service UUID: 0x180d)
	 */
	public static final UUID HEART_RATE_SERVICE = UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb");

	/**
	 * Phone Alert Status (Service UUID: 0x180e)
	 */
	public static final UUID PHONE_ALERT_STATUS_SERVICE = UUID.fromString("0000180e-0000-1000-8000-00805f9b34fb");

	/**
	 * Battery (Service UUID: 0x180f)
	 */
	public static final UUID BATTERY_SERVICE = UUID.fromString("0000180f-0000-1000-8000-00805f9b34fb");

	/**
	 * Blood Pressure (Service UUID: 0x1810)
	 */
	public static final UUID BLOOD_PRESSURE_SERVICE = UUID.fromString("00001810-0000-1000-8000-00805f9b34fb");

	/**
	 * Alert Notification (Service UUID: 0x1811)
	 */
	public static final UUID ALERT_NOTIFICATION_SERVICE = UUID.fromString("00001811-0000-1000-8000-00805f9b34fb");

	/**
	 * Human Interface Device (Service UUID: 0x1812)
	 */
	public static final UUID HUMAN_INTERFACE_DEVICE_SERVICE = UUID.fromString("00001812-0000-1000-8000-00805f9b34fb");

	/**
	 * Scan Parameters (Service UUID: 0x1813)
	 */
	public static final UUID SCAN_PARAMETERS_SERVICE = UUID.fromString("00001813-0000-1000-8000-00805f9b34fb");

	/**
	 * Running Speed and Cadence (Service UUID: 0x1814)
	 */
	public static final UUID RUNNING_SPEED_AND_CADENCE_SERVICE = UUID
			.fromString("00001814-0000-1000-8000-00805f9b34fb");

	/**
	 * Automation Io (Service UUID: 0x1815)
	 */
	public static final UUID AUTOMATION_IO_SERVICE = UUID.fromString("00001815-0000-1000-8000-00805f9b34fb");

	/**
	 * Cycling Speed and Cadence (Service UUID: 0x1816)
	 */
	public static final UUID CYCLING_SPEED_AND_CADENCE_SERVICE = UUID
			.fromString("00001816-0000-1000-8000-00805f9b34fb");

	/**
	 * Cycling Power (Service UUID: 0x1818)
	 */
	public static final UUID CYCLING_POWER_SERVICE = UUID.fromString("00001818-0000-1000-8000-00805f9b34fb");

	/**
	 * Location and Navigation (Service UUID: 0x1819)
	 */
	public static final UUID LOCATION_AND_NAVIGATION_SERVICE = UUID.fromString("00001819-0000-1000-8000-00805f9b34fb");

	/**
	 * Environmental Sensing (Service UUID: 0x181a)
	 */
	public static final UUID ENVIRONMENTAL_SENSING_SERVICE = UUID.fromString("0000181a-0000-1000-8000-00805f9b34fb");

	/**
	 * Body Composition (Service UUID: 0x181b)
	 */
	public static final UUID BODY_COMPOSITION_SERVICE = UUID.fromString("0000181b-0000-1000-8000-00805f9b34fb");

	/**
	 * User Data (Service UUID: 0x181c)
	 */
	public static final UUID USER_DATA_SERVICE = UUID.fromString("0000181c-0000-1000-8000-00805f9b34fb");

	/**
	 * Weight Scale (Service UUID: 0x181d)
	 */
	public static final UUID WEIGHT_SCALE_SERVICE = UUID.fromString("0000181d-0000-1000-8000-00805f9b34fb");

	/**
	 * Bond Management (Service UUID: 0x181e)
	 */
	public static final UUID BOND_MANAGEMENT_SERVICE = UUID.fromString("0000181e-0000-1000-8000-00805f9b34fb");

	/**
	 * Continuous Glucose Monitoring (Service UUID: 0x181f)
	 */
	public static final UUID CONTINUOUS_GLUCOSE_MONITORING_SERVICE = UUID
			.fromString("0000181f-0000-1000-8000-00805f9b34fb");

	/**
	 * Internet Protocol Support (Service UUID: 0x1820)
	 */
	public static final UUID INTERNET_PROTOCOL_SUPPORT_SERVICE = UUID
			.fromString("00001820-0000-1000-8000-00805f9b34fb");

	/**
	 * Indoor Positioning (Service UUID: 0x1821)
	 */
	public static final UUID INDOOR_POSITIONING_SERVICE = UUID.fromString("00001821-0000-1000-8000-00805f9b34fb");

	/**
	 * Pulse Oximeter (Service UUID: 0x1822)
	 */
	public static final UUID PULSE_OXIMETER_SERVICE = UUID.fromString("00001822-0000-1000-8000-00805f9b34fb");

	/**
	 * Http Proxy (Service UUID: 0x1823)
	 */
	public static final UUID HTTP_PROXY_SERVICE = UUID.fromString("00001823-0000-1000-8000-00805f9b34fb");

	/**
	 * Transport Discovery (Service UUID: 0x1824)
	 */
	public static final UUID TRANSPORT_DISCOVERY_SERVICE = UUID.fromString("00001824-0000-1000-8000-00805f9b34fb");

	/**
	 * Object Transfer (Service UUID: 0x1825)
	 */
	public static final UUID OBJECT_TRANSFER_SERVICE = UUID.fromString("00001825-0000-1000-8000-00805f9b34fb");

	/**
	 * Fitness Machine (Service UUID: 0x1826)
	 */
	public static final UUID FITNESS_MACHINE_SERVICE = UUID.fromString("00001826-0000-1000-8000-00805f9b34fb");

	/**
	 * Mesh Provisioning (Service UUID: 0x1827)
	 */
	public static final UUID MESH_PROVISIONING_SERVICE = UUID.fromString("00001827-0000-1000-8000-00805f9b34fb");

	/**
	 * Mesh Proxy (Service UUID: 0x1828)
	 */
	public static final UUID MESH_PROXY_SERVICE = UUID.fromString("00001828-0000-1000-8000-00805f9b34fb");

	/**
	 * Reconnection Configuration (Service UUID: 0x1829)
	 */
	public static final UUID RECONNECTION_CONFIGURATION_SERVICE = UUID
			.fromString("00001829-0000-1000-8000-00805f9b34fb");

	/**
	 * Insulin Delivery (Service UUID: 0x183a)
	 */
	public static final UUID INSULIN_DELIVERY_SERVICE = UUID.fromString("0000183a-0000-1000-8000-00805f9b34fb");

	/**
	 * Binary Sensor (Service UUID: 0x183b)
	 */
	public static final UUID BINARY_SENSOR_SERVICE = UUID.fromString("0000183b-0000-1000-8000-00805f9b34fb");

	/**
	 * Emergency Configuration (Service UUID: 0x183c)
	 */
	public static final UUID EMERGENCY_CONFIGURATION_SERVICE = UUID.fromString("0000183c-0000-1000-8000-00805f9b34fb");

	/**
	 * Physical Activity Monitor (Service UUID: 0x183e)
	 */
	public static final UUID PHYSICAL_ACTIVITY_MONITOR_SERVICE = UUID
			.fromString("0000183e-0000-1000-8000-00805f9b34fb");

	/**
	 * Audio Input Control (Service UUID: 0x1843)
	 */
	public static final UUID AUDIO_INPUT_CONTROL_SERVICE = UUID.fromString("00001843-0000-1000-8000-00805f9b34fb");

	/**
	 * Volume Control (Service UUID: 0x1844)
	 */
	public static final UUID VOLUME_CONTROL_SERVICE = UUID.fromString("00001844-0000-1000-8000-00805f9b34fb");

	/**
	 * Volume Offset Control (Service UUID: 0x1845)
	 */
	public static final UUID VOLUME_OFFSET_CONTROL_SERVICE = UUID.fromString("00001845-0000-1000-8000-00805f9b34fb");

	/**
	 * Coordinated Set Identification (Service UUID: 0x1846)
	 */
	public static final UUID COORDINATED_SET_IDENTIFICATION_SERVICE = UUID
			.fromString("00001846-0000-1000-8000-00805f9b34fb");

	/**
	 * Device Time (Service UUID: 0x1847)
	 */
	public static final UUID DEVICE_TIME_SERVICE = UUID.fromString("00001847-0000-1000-8000-00805f9b34fb");

	/**
	 * Media Control (Service UUID: 0x1848)
	 */
	public static final UUID MEDIA_CONTROL_SERVICE = UUID.fromString("00001848-0000-1000-8000-00805f9b34fb");

	/**
	 * Generic Media Control (Service UUID: 0x1849)
	 */
	public static final UUID GENERIC_MEDIA_CONTROL_SERVICE = UUID.fromString("00001849-0000-1000-8000-00805f9b34fb");

	/**
	 * Constant Tone Extension (Service UUID: 0x184a)
	 */
	public static final UUID CONSTANT_TONE_EXTENSION_SERVICE = UUID.fromString("0000184a-0000-1000-8000-00805f9b34fb");

	/**
	 * Telephone Bearer (Service UUID: 0x184b)
	 */
	public static final UUID TELEPHONE_BEARER_SERVICE = UUID.fromString("0000184b-0000-1000-8000-00805f9b34fb");

	/**
	 * Generic Telephone Bearer (Service UUID: 0x184c)
	 */
	public static final UUID GENERIC_TELEPHONE_BEARER_SERVICE = UUID.fromString("0000184c-0000-1000-8000-00805f9b34fb");

	/**
	 * Microphone Control (Service UUID: 0x184d)
	 */
	public static final UUID MICROPHONE_CONTROL_SERVICE = UUID.fromString("0000184d-0000-1000-8000-00805f9b34fb");

	/**
	 * Audio Stream Control Service (Service UUID: 0x184e)
	 */
	public static final UUID AUDIO_STREAM_CONTROL_SERVICE = UUID.fromString("0000184e-0000-1000-8000-00805f9b34fb");

	/**
	 * Broadcast Audio Scan Service (Service UUID: 0x184f)
	 */
	public static final UUID BROADCAST_AUDIO_SCAN_SERVICE = UUID.fromString("0000184f-0000-1000-8000-00805f9b34fb");

	/**
	 * Published Audio Capabilities Service (Service UUID: 0x1850)
	 */
	public static final UUID PUBLISHED_AUDIO_CAPABILITIES_SERVICE = UUID
			.fromString("00001850-0000-1000-8000-00805f9b34fb");

	/**
	 * Basic Audio Announcement Service (Service UUID: 0x1851)
	 */
	public static final UUID BASIC_AUDIO_ANNOUNCEMENT_SERVICE = UUID.fromString("00001851-0000-1000-8000-00805f9b34fb");

	/**
	 * Broadcast Audio Announcement Service (Service UUID: 0x1852)
	 */
	public static final UUID BROADCAST_AUDIO_ANNOUNCEMENT_SERVICE = UUID
			.fromString("00001852-0000-1000-8000-00805f9b34fb");

}