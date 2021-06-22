package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.DATA_TYPE_LE_SUPPORTED_FEATURES;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * <p>
 * LE Supported Features
 * <p>
 * Core Specification v5.2 Vol 6 Part B 4.6
 * </p>
 */
public class LeSupportedFeatures extends AbstractAdvertisingData {

    /**
     * LE Encryption
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_SUPPORTED_FEATURE_LE_ENCRYPTION = new SimpleImmutableEntry<>(0, 0b00000001);

    /**
     * Connection Parameters Request Procedure
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTION_PARAMETERS_REQUEST_PROCEDURE = new SimpleImmutableEntry<>(0, 0b00000010);

    /**
     * Extended Reject Indication
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_EXTENDED_REJECT_INDICATION = new SimpleImmutableEntry<>(0, 0b00000100);

    /**
     * Slave-initiated Features Exchange
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_SLAVE_INITIATED_FEATURES_EXCHANGE = new SimpleImmutableEntry<>(0, 0b00001000);

    /**
     * LE Ping
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_PING = new SimpleImmutableEntry<>(0, 0b00010000);

    /**
     * LE Data Packet Length Extension
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_DATA_PACKET_LENGTH_EXTENSION = new SimpleImmutableEntry<>(0, 0b00100000);

    /**
     * LL Privacy
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LL_PRIVACY = new SimpleImmutableEntry<>(0, 0b01000000);

    /**
     * Extended Scanner Filter Policies
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_EXTENDED_SCANNER_FILTER_POLICIES = new SimpleImmutableEntry<>(0, 0b10000000);

    /**
     * LE 2M PHY
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_2M_PHY = new SimpleImmutableEntry<>(1, 0b00000001);

    /**
     * Stable Modulation Index - Transmitter
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_STABLE_MODULATION_INDEX_TRANSMITTER = new SimpleImmutableEntry<>(1, 0b00000010);

    /**
     * Stable Modulation Index - Receiver
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_STABLE_MODULATION_INDEX_RECEIVER = new SimpleImmutableEntry<>(1, 0b00000100);

    /**
     * LE Coded PHY
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_CODED_PHY = new SimpleImmutableEntry<>(1, 0b00001000);

    /**
     * LE Extended Advertising
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_EXTENDED_ADVERTISING = new SimpleImmutableEntry<>(1, 0b00010000);

    /**
     * LE Periodic Advertising
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_PERIODIC_ADVERTISING = new SimpleImmutableEntry<>(1, 0b00100000);

    /**
     * Channel Selection Algorithm #2
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CHANNEL_SELCTION_ALGORITHM_2 = new SimpleImmutableEntry<>(1, 0b01000000);

    /**
     * LE Power Class 1
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_POWER_CLASS_1 = new SimpleImmutableEntry<>(1, 0b10000000);

    /**
     * Minimum Number of Used Channels Procedure
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_MINIMUM_NUMBER_OF_USED_CHANNELS_PROCEDURE = new SimpleImmutableEntry<>(2, 0b00000001);

    /**
     * Connection CTE Request
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTION_CTE_REQUEST = new SimpleImmutableEntry<>(2, 0b00000010);

    /**
     * Connection CTE Response
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTION_CTE_RESPONSE = new SimpleImmutableEntry<>(2, 0b00000100);

    /**
     * Connectionless CTE Transmitter
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTIONLESS_CTE_TRANSMITTER = new SimpleImmutableEntry<>(2, 0b00001000);

    /**
     * Connectionless CTE Receiver
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTIONLESS_CTE_RECEIVER = new SimpleImmutableEntry<>(2, 0b00010000);

    /**
     * Antenna Switching During CTE Transmission (AoD)
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_ANTENNA_SWITCHING_DURING_CTE_TRANSMISSION_AOD = new SimpleImmutableEntry<>(2, 0b00100000);

    /**
     * Antenna Switching During CTE Reception (AoA)
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_ANTENNA_SWITCHING_DURING_CTE_RECEPTION_AOA = new SimpleImmutableEntry<>(2, 0b01000000);

    /**
     * Receiving Constant Tone Extensions
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_RECEIVING_CONSTANT_TONE_EXTENSIONS = new SimpleImmutableEntry<>(2, 0b10000000);

    /**
     * Periodic Advertising Sync Transfer - Sender
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_PERIODIC_ADVERTISING_SYNC_TRANSFER_SENDER = new SimpleImmutableEntry<>(3, 0b00000001);

    /**
     * Periodic Advertising Sync Transfer - Recipient
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_PERIODIC_ADVERTISING_SYNC_TRANSFER_RECIPIENT = new SimpleImmutableEntry<>(3, 0b00000010);

    /**
     * Sleep Clock Accuracy Updates
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_SLEEP_CLOCK_ACCURACY_UPDATES = new SimpleImmutableEntry<>(3, 0b00000100);

    /**
     * Remote Public Key Validation
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_REMOTE_PUBLIC_KEY_VALIDATION = new SimpleImmutableEntry<>(3, 0b00001000);

    /**
     * Connected Isochronous Stream – Master
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTED_ISOCHRONOUS_STREAM_MASTER = new SimpleImmutableEntry<>(3, 0b00010000);

    /**
     * Connected Isochronous Stream – Slave
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_CONNECTED_ISOCHRONOUS_STREAM_SLAVE = new SimpleImmutableEntry<>(3, 0b00100000);

    /**
     * Isochronous Broadcaster
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_ISOCHRONOUS_BROADCASTER = new SimpleImmutableEntry<>(3, 0b01000000);

    /**
     * Synchronized Receiver
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_ISOCHRONOUS_RECEIVER = new SimpleImmutableEntry<>(3, 0b10000000);

    /**
     * Isochronous Channels (Host Sup-port)
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_ISOCHRONOUS_CHANNELS = new SimpleImmutableEntry<>(4, 0b00000001);

    /**
     * LE Power Control Request
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_POWER_CONTROL_REQUEST = new SimpleImmutableEntry<>(4, 0b00000010);

    /**
     * LE Power Change Indication
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_POWER_CHANGE_INDICATION = new SimpleImmutableEntry<>(4, 0b00000100);

    /**
     * LE Path Loss Monitoring
     */
    public static final SimpleImmutableEntry<Integer, Integer> FEATURE_LE_PATH_LOSS_MONITORING = new SimpleImmutableEntry<>(4, 0b00001000);

    /**
     * LE Supported Features list
     */
    private final List<Integer> mLeSupportedFeaturesList;

    /**
     * Constructor for LE Supported Features
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public LeSupportedFeatures(@NonNull byte[] data, int offset, int length) {
        super(length);

        List<Integer> leSupportedFeaturesList = new ArrayList<>();
        for (int i = offset + 2; i < offset + length + 1; i++) {
            leSupportedFeaturesList.add(data[i] & 0xff);
        }
        mLeSupportedFeaturesList = Collections.synchronizedList(Collections.unmodifiableList(leSupportedFeaturesList));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_LE_SUPPORTED_FEATURES;
    }

    /**
     * @return LE Supported Features list
     */
    @NonNull
    public List<Integer> getLeSupportedFeaturesList() {
        return mLeSupportedFeaturesList;
    }

    /**
     * check LE Encryption
     *
     * @return {@code true}:LE Encryption bit is 1, {@code false}:bit is 0;
     */
    public boolean isLeEncryptionSupported() {
        return check(FEATURE_SUPPORTED_FEATURE_LE_ENCRYPTION);
    }

    /**
     * check Connection Parameters Request Procedure
     *
     * @return {@code true}:Connection Parameters Request Procedure bit is 1, {@code false}:bit is 0;
     */
    public boolean isConnectionParametersRequestProcedureSupported() {
        return check(FEATURE_CONNECTION_PARAMETERS_REQUEST_PROCEDURE);
    }

    /**
     * check Extended Reject Indication
     *
     * @return {@code true}:Extended Reject Indication bit is 1, {@code false}:bit is 0;
     */
    public boolean isExtendedRejectIndicationSupported() {
        return check(FEATURE_EXTENDED_REJECT_INDICATION);
    }

    /**
     * check Slave-initiated Features Exchange
     *
     * @return {@code true}:Slave-initiated Features Exchange bit is 1, {@code false}:bit is 0;
     */
    public boolean isSlaveInitiatedFeaturesExchangeSupported() {
        return check(FEATURE_SLAVE_INITIATED_FEATURES_EXCHANGE);
    }

    /**
     * check LE Ping
     *
     * @return {@code true}:LE Ping bit is 1, {@code false}:bit is 0;
     */
    public boolean isLePingSupported() {
        return check(FEATURE_LE_PING);
    }

    /**
     * check LE Data Packet Length Extension
     *
     * @return {@code true}:LE Data Packet Length Extension bit is 1, {@code false}:bit is 0;
     */
    public boolean isLeDataPacketLengthExtensionSupported() {
        return check(FEATURE_LE_DATA_PACKET_LENGTH_EXTENSION);
    }

    /**
     * check LL Privacy
     *
     * @return {@code true}:LL Privacy bit is 1, {@code false}:bit is 0;
     */
    public boolean isLlPrivacySupported() {
        return check(FEATURE_LL_PRIVACY);
    }

    /**
     * check Extended Scanner Filter Policies
     *
     * @return {@code true}:Extended Scanner Filter Policies bit is 1, {@code false}:bit is 0;
     */
    public boolean isExtendedScannerFilterPoliciesSupported() {
        return check(FEATURE_EXTENDED_SCANNER_FILTER_POLICIES);
    }

    /**
     * check LE 2M PHY
     *
     * @return {@code true}:LE 2M PHY bit is 1, {@code false}:bit is 0;
     */
    public boolean isLe2mPhySupported() {
        return check(FEATURE_LE_2M_PHY);
    }

    /**
     * check Stable Modulation Index - Transmitter
     *
     * @return {@code true}:Stable Modulation Index - Transmitter bit is 1, {@code false}:bit is 0;
     */
    public boolean isStableModulationIndexTransmitterSupported() {
        return check(FEATURE_STABLE_MODULATION_INDEX_TRANSMITTER);
    }

    /**
     * check Stable Modulation Index - Receiver
     *
     * @return {@code true}:Stable Modulation Index - Receiver bit is 1, {@code false}:bit is 0;
     */
    public boolean isStableModulationIndexReceiverSupported() {
        return check(FEATURE_STABLE_MODULATION_INDEX_RECEIVER);
    }

    /**
     * check LE Coded PHY
     *
     * @return {@code true}:LE Coded PHY bit is 1, {@code false}:bit is 0;
     */
    public boolean isLeCodedPhySupported() {
        return check(FEATURE_LE_CODED_PHY);
    }

    /**
     * check LE Extended Advertising
     *
     * @return {@code true}:LE Extended Advertising bit is 1, {@code false}:bit is 0;
     */
    public boolean isLeExtendedAdvertisingSupported() {
        return check(FEATURE_LE_EXTENDED_ADVERTISING);
    }

    /**
     * check LE Periodic Advertising
     *
     * @return {@code true}:LE Periodic Advertising bit is 1, {@code false}:bit is 0;
     */
    public boolean isLePeriodicAdvertisingSupported() {
        return check(FEATURE_LE_PERIODIC_ADVERTISING);
    }

    /**
     * check Channel Selection Algorithm #2
     *
     * @return {@code true}:Channel Selection Algorithm #2 bit is 1, {@code false}:bit is 0;
     */
    public boolean isChannelSelectionAlgorithm2Supported() {
        return check(FEATURE_CHANNEL_SELCTION_ALGORITHM_2);
    }

    /**
     * check LE Power Class 1
     *
     * @return {@code true}:LE Power Class 1 bit is 1, {@code false}:bit is 0;
     */
    public boolean isLePowerClass1Supported() {
        return check(FEATURE_LE_POWER_CLASS_1);
    }

    /**
     * check Minimum Number of Used Channels Procedure
     *
     * @return {@code true}:Minimum Number of Used Channels Procedure bit is 1, {@code false}:bit is 0;
     */
    public boolean isMinimumNumberOfUsedChannelsProcedureSupported() {
        return check(FEATURE_MINIMUM_NUMBER_OF_USED_CHANNELS_PROCEDURE);
    }

    /**
     * check Connection CTE Request
     *
     * @return {@code true}:Connection CTE Request bit is 1, {@code false}:bit is 0;
     */
    public boolean isConnectionCteRequestSupported() {
        return check(FEATURE_CONNECTION_CTE_REQUEST);
    }

    /**
     * check Connection CTE Response
     *
     * @return {@code true}:Connection CTE Response bit is 1, {@code false}:bit is 0;
     */
    public boolean isConnectionCteResponseSupported() {
        return check(FEATURE_CONNECTION_CTE_RESPONSE);
    }

    /**
     * check Connectionless CTE Transmitter
     *
     * @return {@code true}:Connectionless CTE Transmitter bit is 1, {@code false}:bit is 0;
     */
    public boolean isConnectionlessCteTransmitterSupported() {
        return check(FEATURE_CONNECTIONLESS_CTE_TRANSMITTER);
    }

    /**
     * check Connectionless CTE Receiver
     *
     * @return {@code true}:Connectionless CTE Receiver bit is 1, {@code false}:bit is 0;
     */
    public boolean isConnectionlessCteReceiverSupported() {
        return check(FEATURE_CONNECTIONLESS_CTE_RECEIVER);
    }

    /**
     * check Antenna Switching During CTE Transmission (AoD)
     *
     * @return {@code true}:Antenna Switching During CTE Transmission (AoD) bit is 1, {@code false}:bit is 0;
     */
    public boolean isAntennaSwitchingDuringCteTransmissionAodSupported() {
        return check(FEATURE_ANTENNA_SWITCHING_DURING_CTE_TRANSMISSION_AOD);
    }

    /**
     * check Antenna Switching During CTE Reception (AoA)
     *
     * @return {@code true}:Antenna Switching During CTE Transmission (AoD) bit is 1, {@code false}:bit is 0;
     */
    public boolean isAntennaSwitchingDuringCteReceptionAoaSupported() {
        return check(FEATURE_ANTENNA_SWITCHING_DURING_CTE_RECEPTION_AOA);
    }

    /**
     * check Receiving Constant Tone Extensions
     *
     * @return {@code true}:Receiving Constant Tone Extensions bit is 1, {@code false}:bit is 0;
     */
    public boolean isReceivingConstantToneExtensionsSupported() {
        return check(FEATURE_RECEIVING_CONSTANT_TONE_EXTENSIONS);
    }

    /**
     * check Periodic Advertising Sync Transfer - Sender
     *
     * @return {@code true}:Periodic Advertising Sync Transfer - Sender bit is 1, {@code false}:bit is 0;
     */
    public boolean isPeriodicAdvertisingSyncTransferSenderSupported() {
        return check(FEATURE_PERIODIC_ADVERTISING_SYNC_TRANSFER_SENDER);
    }

    /**
     * check Periodic Advertising Sync Transfer - Recipient
     *
     * @return {@code true}:Periodic Advertising Sync Transfer - Recipient bit is 1, {@code false}:bit is 0;
     */
    public boolean isPeriodicAdvertisingSyncTransferRecipientSupported() {
        return check(FEATURE_PERIODIC_ADVERTISING_SYNC_TRANSFER_RECIPIENT);
    }

    /**
     * check Sleep Clock Accuracy Updates
     *
     * @return {@code true}:Sleep Clock Accuracy Updates bit is 1, {@code false}:bit is 0;
     */
    public boolean isSleepClockAccuracyUpdatesSupported() {
        return check(FEATURE_SLEEP_CLOCK_ACCURACY_UPDATES);
    }

    /**
     * check Remote Public Key Validation
     *
     * @return {@code true}:Remote Public Key Validation bit is 1, {@code false}:bit is 0;
     */
    public boolean isRemotePublicKeyValidationSupported() {
        return check(FEATURE_REMOTE_PUBLIC_KEY_VALIDATION);
    }

    /**
     * check Connected Isochronous Stream – Master
     *
     * @return {@code true}:Connected Isochronous Stream – Master bit is 1, {@code false}:bit is 0;
     */
    public boolean isConnectedIsochronousStreamMasterSupported() {
        return check(FEATURE_CONNECTED_ISOCHRONOUS_STREAM_MASTER);
    }

    /**
     * check Connected Isochronous Stream – Slave
     *
     * @return {@code true}:Connected Isochronous Stream – Slave bit is 1, {@code false}:bit is 0;
     */
    public boolean isConnectedIsochronousStreamSlaveSupported() {
        return check(FEATURE_CONNECTED_ISOCHRONOUS_STREAM_SLAVE);
    }

    /**
     * check Isochronous Broadcaster
     *
     * @return {@code true}:Isochronous Broadcaster bit is 1, {@code false}:bit is 0;
     */
    public boolean isIsochronousBroadcasterSupported() {
        return check(FEATURE_ISOCHRONOUS_BROADCASTER);
    }

    /**
     * check Synchronized Receiver
     *
     * @return {@code true}:Synchronized Receiver bit is 1, {@code false}:bit is 0;
     */
    public boolean isSynchronizedReceiverSupported() {
        return check(FEATURE_ISOCHRONOUS_RECEIVER);
    }

    /**
     * check Isochronous Channels (Host Sup-port)
     *
     * @return {@code true}:Isochronous Channels (Host Sup-port) bit is 1, {@code false}:bit is 0;
     */
    public boolean isIsochronousChannelsSupported() {
        return check(FEATURE_ISOCHRONOUS_CHANNELS);
    }

    /**
     * check LE Power Control Request
     *
     * @return {@code true}:LE Power Control Request bit is 1, {@code false}:bit is 0;
     */
    public boolean isLePowerControlRequestSupported() {
        return check(FEATURE_LE_POWER_CONTROL_REQUEST);
    }

    /**
     * check LE Power Change Indication
     *
     * @return {@code true}:LE Power Change Indication bit is 1, {@code false}:bit is 0;
     */
    public boolean isLePowerChangeIndicationSupported() {
        return check(FEATURE_LE_POWER_CHANGE_INDICATION);
    }

    /**
     * check LE Path Loss Monitoring
     *
     * @return {@code true}:LE Path Loss Monitoring bit is 1, {@code false}:bit is 0;
     */
    public boolean isLePathLossMonitoringSupported() {
        return check(FEATURE_LE_PATH_LOSS_MONITORING);
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[1 + getLength()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) getLength());
        byteBuffer.put((byte) getDataType());
        for (int leSupportedFeatures : mLeSupportedFeaturesList) {
            byteBuffer.put((byte) leSupportedFeatures);
        }
        return data;
    }

    /**
     * check flag
     *
     * @param target one of {@link AdvertisingDataConstants.LeSupportedFeatures}
     * @return {@code true}:target bit is 1, {@code false}:target bit is 0
     */
    private boolean check(@NonNull SimpleImmutableEntry<Integer, Integer> target) {
        boolean result;
        int index = target.getKey();
        if (mLeSupportedFeaturesList.size() > index) {
            result = (mLeSupportedFeaturesList.get(index) & target.getValue()) != 0;
        } else {
            result = false;
        }
        return result;
    }

}
