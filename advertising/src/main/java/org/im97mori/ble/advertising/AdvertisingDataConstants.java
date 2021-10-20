package org.im97mori.ble.advertising;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map;

import org.im97mori.ble.constants.DataType;

/**
 * BLE Advertising Data Constants
 */
@Deprecated
public class AdvertisingDataConstants {

    /**
     * <p>
     * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
     * Core Specification Supplement v10 Part A DATA TYPESSPECIFICATION
     * </p>
     */
    @Deprecated
    public static final class AdvertisingDataTypes extends DataType {
    }

    /**
     * <p>
     * Flags Constants
     * <p>
     * Core Specification Supplement v10 Part A 1.3
     * <p>
     * {@link SimpleImmutableEntry#getKey()}:offset, {@link SimpleImmutableEntry#getValue()}:bitmask
     * </p>
     */
    @Deprecated
    public static final class FlagsDataType {

        /**
         * LE Limited Discoverable Mode
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FLAG_LE_LIMITED_DISCOVERABLE_MODE = Flags.FLAG_LE_LIMITED_DISCOVERABLE_MODE;

        /**
         * LE General Discoverable Mode
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FLAG_LE_GENERAL_DISCOVERABLE_MODE = Flags.FLAG_LE_GENERAL_DISCOVERABLE_MODE;

        /**
         * BR/EDR Not Supported
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FLAG_BR_EDR_NOT_SUPPORTED = Flags.FLAG_BR_EDR_NOT_SUPPORTED;

        /**
         * Simultaneous LE and BR/EDR to Same Device Capable (Controller)
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FLAG_SIMULTANEOUS_LE_AND_BR_EDR_TO_SAME_DEVICE_CAPABLE_CONTROLLER = Flags.FLAG_SIMULTANEOUS_LE_AND_BR_EDR_TO_SAME_DEVICE_CAPABLE_CONTROLLER;

        /**
         * Simultaneous LE and BR/EDR to Same Device Capable (Host)
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FLAG_SIMULTANEOUS_LE_AND_BR_EDR_TO_SAME_DEVICE_CAPABLE_HOST = Flags.FLAG_PREVIOUSLY_USED;

    }

    /**
     * Core Specification Supplement v10 Part A 1.9.2 Unit of Connection Interval Range(millis)
     */
    @Deprecated
    public static final double PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS = PeripheralConnectionIntervalRange.PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS;

    /**
     * Core Specification Supplement v10 Part A 1.9.2 no specific minimum / maximum values
     */
    @Deprecated
    public static final int PERIPHERAL_CONNECTION_INTERVAL_NO_SPECIFIC_VALUE = PeripheralConnectionIntervalRange.PERIPHERAL_CONNECTION_INTERVAL_NO_SPECIFIC_VALUE;

    /**
     * Core Specification Supplement v10 Part A 1.15.2 Unit of Advertising Interval(millis)
     */
    @Deprecated
    public static final double ADVERTISING_INTERVAL_UNIT_MILLIS = AdvertisingInterval.ADVERTISING_INTERVAL_UNIT_MILLIS;

    /**
     * <p>
     * LE Supported Features Constants
     * <p>
     * Core Specification Supplement v10 Part A 1.19
     * Core Specification v5.3 Vol 6 Part B 4.6
     * <p>
     * {@link SimpleImmutableEntry#getKey()}:offset, {@link SimpleImmutableEntry#getValue()}:bitmask
     * </p>
     */
    @Deprecated
    public static final class LeSupportedFeatures {

        /**
         * LE Encryption
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_SUPPORTED_FEATURE_LE_ENCRYPTION = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_SUPPORTED_FEATURE_LE_ENCRYPTION;

        /**
         * Connection Parameters Request Procedure
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTION_PARAMETERS_REQUEST_PROCEDURE = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_CONNECTION_PARAMETERS_REQUEST_PROCEDURE;

        /**
         * Extended Reject Indication
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_EXTENDED_REJECT_INDICATION = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_EXTENDED_REJECT_INDICATION;

        /**
         * Peripheral-initiated Features Exchange
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_PERIPHERAL_INITIATED_FEATURES_EXCHANGE = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_PERIPHERAL_INITIATED_FEATURES_EXCHANGE;

        /**
         * LE Ping
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_PING = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_LE_PING;

        /**
         * LE Data Packet Length Extension
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_DATA_PACKET_LENGTH_EXTENSION = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_LE_DATA_PACKET_LENGTH_EXTENSION;

        /**
         * LL Privacy
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LL_PRIVACY = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_LL_PRIVACY;

        /**
         * Extended Scanner Filter Policies
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_EXTENDED_SCANNER_FILTER_POLICIES = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_EXTENDED_SCANNER_FILTER_POLICIES;

        /**
         * LE 2M PHY
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_2M_PHY = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_LE_2M_PHY;

        /**
         * Stable Modulation Index - Transmitter
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_STABLE_MODULATION_INDEX_TRANSMITTER = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_STABLE_MODULATION_INDEX_TRANSMITTER;

        /**
         * Stable Modulation Index - Receiver
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_STABLE_MODULATION_INDEX_RECEIVER = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_STABLE_MODULATION_INDEX_RECEIVER;

        /**
         * LE Coded PHY
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_CODED_PHY = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_LE_CODED_PHY;

        /**
         * LE Extended Advertising
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_EXTENDED_ADVERTISING = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_LE_EXTENDED_ADVERTISING;

        /**
         * LE Periodic Advertising
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_PERIODIC_ADVERTISING = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_LE_PERIODIC_ADVERTISING;

        /**
         * Channel Selection Algorithm #2
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CHANNEL_SELCTION_ALGORITHM_2 = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_CHANNEL_SELCTION_ALGORITHM_2;

        /**
         * LE Power Class 1
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_POWER_CLASS_1 = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_LE_POWER_CLASS_1;

        /**
         * Minimum Number of Used Channels Procedure
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_MINIMUM_NUMBER_OF_USED_CHANNELS_PROCEDURE = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_MINIMUM_NUMBER_OF_USED_CHANNELS_PROCEDURE;

        /**
         * Connection CTE Request
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTION_CTE_REQUEST = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_CONNECTION_CTE_REQUEST;

        /**
         * Connection CTE Response
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTION_CTE_RESPONSE = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_CONNECTION_CTE_RESPONSE;

        /**
         * Connectionless CTE Transmitter
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTIONLESS_CTE_TRANSMITTER = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_CONNECTIONLESS_CTE_TRANSMITTER;

        /**
         * Connectionless CTE Receiver
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTIONLESS_CTE_RECEIVER = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_CONNECTIONLESS_CTE_RECEIVER;

        /**
         * Antenna Switching During CTE Transmission (AoD)
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_ANTENNA_SWITCHING_DURING_CTE_TRANSMISSION_AOD = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_ANTENNA_SWITCHING_DURING_CTE_TRANSMISSION_AOD;

        /**
         * Antenna Switching During CTE Reception (AoA)
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_ANTENNA_SWITCHING_DURING_CTE_RECEPTION_AOA = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_ANTENNA_SWITCHING_DURING_CTE_RECEPTION_AOA;

        /**
         * Receiving Constant Tone Extensions
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_RECEIVING_CONSTANT_TONE_EXTENSIONS = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_RECEIVING_CONSTANT_TONE_EXTENSIONS;

        /**
         * Periodic Advertising Sync Transfer - Sender
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_PERIODIC_ADVERTISING_SYNC_TRANSFER_SENDER = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_PERIODIC_ADVERTISING_SYNC_TRANSFER_SENDER;

        /**
         * Periodic Advertising Sync Transfer - Recipient
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_PERIODIC_ADVERTISING_SYNC_TRANSFER_RECIPIENT = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_PERIODIC_ADVERTISING_SYNC_TRANSFER_RECIPIENT;

        /**
         * Sleep Clock Accuracy Updates
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_SLEEP_CLOCK_ACCURACY_UPDATES = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_SLEEP_CLOCK_ACCURACY_UPDATES;

        /**
         * Remote Public Key Validation
         */
        @Deprecated
        public static final SimpleImmutableEntry<Integer, Integer> FEATURE_REMOTE_PUBLIC_KEY_VALIDATION = org.im97mori.ble.advertising.LeSupportedFeatures.FEATURE_REMOTE_PUBLIC_KEY_VALIDATION;

    }

    /**
     * <p>
     * Physical channel indices
     * <p>
     * Core Specification v5.3 Vol 6 Part B 1.4.1
     * <p>
     * key:PHY Channel, value:Channel Index
     * </p>
     */
    @Deprecated
    public static final Map<Integer, Integer> PHYSICAL_CHANNEL_INDICES_MAP = ChannelMapUpdateIndication.PHYSICAL_CHANNEL_INDICES_MAP;

}
