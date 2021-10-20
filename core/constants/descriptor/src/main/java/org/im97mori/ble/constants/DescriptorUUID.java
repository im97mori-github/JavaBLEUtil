package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT Descriptor UUID
 * <p>
 * Generic Access Profile
 * Revision Date: 2021-07-13
 */
public class DescriptorUUID {

    @SuppressWarnings("serial")
    private static final class Map128 extends HashMap<UUID, String> {

        private Map128() {
            super();
            put(CHARACTERISTIC_EXTENDED_PROPERTIES_DESCRIPTOR, "Characteristic Extended Properties");
            put(CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTOR, "Characteristic User Description");
            put(CLIENT_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR, "Client Characteristic Configuration");
            put(SERVER_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR, "Server Characteristic Configuration");
            put(CHARACTERISTIC_PRESENTATION_FORMAT_DESCRIPTOR, "Characteristic Presentation Format");
            put(CHARACTERISTIC_AGGREGATE_FORMAT_DESCRIPTOR, "Characteristic Aggregate Format");
            put(VALID_RANGE_DESCRIPTOR, "Valid Range");
            put(EXTERNAL_REPORT_REFERENCE_DESCRIPTOR, "External Report Reference");
            put(REPORT_REFERENCE_DESCRIPTOR, "Report Reference");
            put(NUMBER_OF_DIGITALS_DESCRIPTOR, "Number Of Digitals");
            put(VALUE_TRIGGER_SETTING_DESCRIPTOR, "Value Trigger Setting");
            put(ENVIRONMENTAL_SENSING_CONFIGURATION_DESCRIPTOR, "Environmental Sensing Configuration");
            put(ENVIRONMENTAL_SENSING_MEASUREMENT_DESCRIPTOR, "Environmental Sensing Measurement");
            put(ENVIRONMENTAL_SENSING_TRIGGER_SETTING_DESCRIPTOR, "Environmental Sensing Trigger Setting");
            put(TIME_TRIGGER_SETTING_DESCRIPTOR, "Time Trigger Setting");
            put(COMPLETE_BR_EDR_TRANSPORT_BLOCK_DATA_DESCRIPTOR, "Complete BR-EDR Transport Block Data");
        }

    }

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> DESCRIPTOR_MAPPING_128 = Collections.synchronizedMap(Collections.unmodifiableMap(new Map128()));

    /**
     * Characteristic Extended Properties (Descriptor UUID: 0x2900)
     */
    public static final UUID CHARACTERISTIC_EXTENDED_PROPERTIES_DESCRIPTOR = UUID.fromString("00002900-0000-1000-8000-00805f9b34fb");

    /**
     * Characteristic User Description (Descriptor UUID: 0x2901)
     */
    public static final UUID CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTOR = UUID.fromString("00002901-0000-1000-8000-00805f9b34fb");

    /**
     * Client Characteristic Configuration (Descriptor UUID: 0x2902)
     */
    public static final UUID CLIENT_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /**
     * Server Characteristic Configuration (Descriptor UUID: 0x2903)
     */
    public static final UUID SERVER_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR = UUID.fromString("00002903-0000-1000-8000-00805f9b34fb");

    /**
     * Characteristic Presentation Format (Descriptor UUID: 0x2904)
     */
    public static final UUID CHARACTERISTIC_PRESENTATION_FORMAT_DESCRIPTOR = UUID.fromString("00002904-0000-1000-8000-00805f9b34fb");

    /**
     * Characteristic Aggregate Format (Descriptor UUID: 0x2905)
     */
    public static final UUID CHARACTERISTIC_AGGREGATE_FORMAT_DESCRIPTOR = UUID.fromString("00002905-0000-1000-8000-00805f9b34fb");

    /**
     * Valid Range (Descriptor UUID: 0x2906)
     */
    public static final UUID VALID_RANGE_DESCRIPTOR = UUID.fromString("00002906-0000-1000-8000-00805f9b34fb");

    /**
     * External Report Reference (Descriptor UUID: 0x2907)
     */
    public static final UUID EXTERNAL_REPORT_REFERENCE_DESCRIPTOR = UUID.fromString("00002907-0000-1000-8000-00805f9b34fb");

    /**
     * Report Reference (Descriptor UUID: 0x2908)
     */
    public static final UUID REPORT_REFERENCE_DESCRIPTOR = UUID.fromString("00002908-0000-1000-8000-00805f9b34fb");

    /**
     * Number Of Digitals (Descriptor UUID: 0x2909)
     */
    public static final UUID NUMBER_OF_DIGITALS_DESCRIPTOR = UUID.fromString("00002909-0000-1000-8000-00805f9b34fb");

    /**
     * Value Trigger Setting (Descriptor UUID: 0x290a)
     */
    public static final UUID VALUE_TRIGGER_SETTING_DESCRIPTOR = UUID.fromString("0000290a-0000-1000-8000-00805f9b34fb");

    /**
     * Environmental Sensing Configuration (Descriptor UUID: 0x290b)
     */
    public static final UUID ENVIRONMENTAL_SENSING_CONFIGURATION_DESCRIPTOR = UUID.fromString("0000290b-0000-1000-8000-00805f9b34fb");

    /**
     * Environmental Sensing Measurement (Descriptor UUID: 0x290c)
     */
    public static final UUID ENVIRONMENTAL_SENSING_MEASUREMENT_DESCRIPTOR = UUID.fromString("0000290c-0000-1000-8000-00805f9b34fb");

    /**
     * Environmental Sensing Trigger Setting (Descriptor UUID: 0x290d)
     */
    public static final UUID ENVIRONMENTAL_SENSING_TRIGGER_SETTING_DESCRIPTOR = UUID.fromString("0000290d-0000-1000-8000-00805f9b34fb");

    /**
     * Time Trigger Setting (Descriptor UUID: 0x290e)
     */
    public static final UUID TIME_TRIGGER_SETTING_DESCRIPTOR = UUID.fromString("0000290e-0000-1000-8000-00805f9b34fb");

    /**
     * Complete BR-EDR Transport Block Data (Descriptor UUID: 0x290f)
     */
    public static final UUID COMPLETE_BR_EDR_TRANSPORT_BLOCK_DATA_DESCRIPTOR = UUID.fromString("0000290f-0000-1000-8000-00805f9b34fb");

}