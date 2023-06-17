package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT Profile UUID
 * <p>
 * 16-bit UUID Numbers Document.pdf
 * Revision Date: 2021-10-01
 */
public class ProfileUUID {

    private static final class Map128 extends HashMap<UUID, String> {

        private Map128() {
            super();
            put(UUID.fromString("00001000-0000-1000-8000-00805f9b34fb"), "ServiceDiscoveryServerServiceClassID");
            put(UUID.fromString("00001001-0000-1000-8000-00805f9b34fb"), "BrowseGroupDescriptorServiceClassID");
            put(UUID.fromString("00001101-0000-1000-8000-00805f9b34fb"), "SerialPort");
            put(UUID.fromString("00001102-0000-1000-8000-00805f9b34fb"), "LANAccessUsingPPP");
            put(UUID.fromString("00001103-0000-1000-8000-00805f9b34fb"), "DialupNetworking");
            put(UUID.fromString("00001104-0000-1000-8000-00805f9b34fb"), "IrMCSync");
            put(UUID.fromString("00001105-0000-1000-8000-00805f9b34fb"), "OBEXObjectPush");
            put(UUID.fromString("00001106-0000-1000-8000-00805f9b34fb"), "OBEXFileTransfer");
            put(UUID.fromString("00001107-0000-1000-8000-00805f9b34fb"), "IrMCSyncCommand");
            put(UUID.fromString("00001108-0000-1000-8000-00805f9b34fb"), "Headset");
            put(UUID.fromString("00001109-0000-1000-8000-00805f9b34fb"), "CordlessTelephony");
            put(UUID.fromString("0000110a-0000-1000-8000-00805f9b34fb"), "AudioSource");
            put(UUID.fromString("0000110b-0000-1000-8000-00805f9b34fb"), "AudioSink");
            put(UUID.fromString("0000110c-0000-1000-8000-00805f9b34fb"), "A/V_RemoteControlTarget");
            put(UUID.fromString("0000110d-0000-1000-8000-00805f9b34fb"), "AdvancedAudioDistribution");
            put(UUID.fromString("0000110e-0000-1000-8000-00805f9b34fb"), "A/V_RemoteControl");
            put(UUID.fromString("0000110f-0000-1000-8000-00805f9b34fb"), "A/V_RemoteControlController");
            put(UUID.fromString("00001110-0000-1000-8000-00805f9b34fb"), "Intercom");
            put(UUID.fromString("00001111-0000-1000-8000-00805f9b34fb"), "Fax");
            put(UUID.fromString("00001112-0000-1000-8000-00805f9b34fb"), "Headset - Audio Gateway");
            put(UUID.fromString("00001113-0000-1000-8000-00805f9b34fb"), "WAP");
            put(UUID.fromString("00001114-0000-1000-8000-00805f9b34fb"), "WAP_CLIENT");
            put(UUID.fromString("00001115-0000-1000-8000-00805f9b34fb"), "PANU");
            put(UUID.fromString("00001116-0000-1000-8000-00805f9b34fb"), "NAP");
            put(UUID.fromString("00001117-0000-1000-8000-00805f9b34fb"), "GN");
            put(UUID.fromString("00001118-0000-1000-8000-00805f9b34fb"), "DirectPrinting");
            put(UUID.fromString("00001119-0000-1000-8000-00805f9b34fb"), "ReferencePrinting");
            put(UUID.fromString("0000111a-0000-1000-8000-00805f9b34fb"), "Basic Imaging Profile");
            put(UUID.fromString("0000111b-0000-1000-8000-00805f9b34fb"), "ImagingResponder");
            put(UUID.fromString("0000111c-0000-1000-8000-00805f9b34fb"), "ImagingAutomaticArchive");
            put(UUID.fromString("0000111d-0000-1000-8000-00805f9b34fb"), "ImagingReferencedObjects");
            put(UUID.fromString("0000111e-0000-1000-8000-00805f9b34fb"), "Handsfree");
            put(UUID.fromString("0000111f-0000-1000-8000-00805f9b34fb"), "HandsfreeAudioGateway");
            put(UUID.fromString("00001120-0000-1000-8000-00805f9b34fb"), "DirectPrintingReferenceObjectsService");
            put(UUID.fromString("00001121-0000-1000-8000-00805f9b34fb"), "ReflectedUI");
            put(UUID.fromString("00001122-0000-1000-8000-00805f9b34fb"), "BasicPrinting");
            put(UUID.fromString("00001123-0000-1000-8000-00805f9b34fb"), "PrintingStatus");
            put(UUID.fromString("00001124-0000-1000-8000-00805f9b34fb"), "HumanInterfaceDeviceService");
            put(UUID.fromString("00001125-0000-1000-8000-00805f9b34fb"), "HardcopyCableReplacement");
            put(UUID.fromString("00001126-0000-1000-8000-00805f9b34fb"), "HCR_Print");
            put(UUID.fromString("00001127-0000-1000-8000-00805f9b34fb"), "HCR_Scan");
            put(UUID.fromString("00001128-0000-1000-8000-00805f9b34fb"), "Common_ISDN_Access");
            put(UUID.fromString("0000112d-0000-1000-8000-00805f9b34fb"), "SIM_Access");
            put(UUID.fromString("0000112e-0000-1000-8000-00805f9b34fb"), "Phonebook Access - PCE");
            put(UUID.fromString("0000112f-0000-1000-8000-00805f9b34fb"), "Phonebook Access - PSE");
            put(UUID.fromString("00001130-0000-1000-8000-00805f9b34fb"), "Phonebook Access");
            put(UUID.fromString("00001131-0000-1000-8000-00805f9b34fb"), "Headset - HS");
            put(UUID.fromString("00001132-0000-1000-8000-00805f9b34fb"), "Message Access Server");
            put(UUID.fromString("00001133-0000-1000-8000-00805f9b34fb"), "Message Notification Server");
            put(UUID.fromString("00001134-0000-1000-8000-00805f9b34fb"), "Message Access Profile");
            put(UUID.fromString("00001135-0000-1000-8000-00805f9b34fb"), "GNSS");
            put(UUID.fromString("00001136-0000-1000-8000-00805f9b34fb"), "GNSS_Server");
            put(UUID.fromString("00001137-0000-1000-8000-00805f9b34fb"), "3D Display");
            put(UUID.fromString("00001138-0000-1000-8000-00805f9b34fb"), "3D Glasses");
            put(UUID.fromString("00001139-0000-1000-8000-00805f9b34fb"), "3D Synchronization");
            put(UUID.fromString("0000113a-0000-1000-8000-00805f9b34fb"), "MPS Profile");
            put(UUID.fromString("0000113b-0000-1000-8000-00805f9b34fb"), "MPS SC");
            put(UUID.fromString("0000113c-0000-1000-8000-00805f9b34fb"), "CTN Access Service");
            put(UUID.fromString("0000113d-0000-1000-8000-00805f9b34fb"), "CTN Notification Service");
            put(UUID.fromString("0000113e-0000-1000-8000-00805f9b34fb"), "CTN Profile");
            put(UUID.fromString("00001200-0000-1000-8000-00805f9b34fb"), "PnPInformation");
            put(UUID.fromString("00001201-0000-1000-8000-00805f9b34fb"), "GenericNetworking");
            put(UUID.fromString("00001202-0000-1000-8000-00805f9b34fb"), "GenericFileTransfer");
            put(UUID.fromString("00001203-0000-1000-8000-00805f9b34fb"), "GenericAudio");
            put(UUID.fromString("00001204-0000-1000-8000-00805f9b34fb"), "GenericTelephony");
            put(UUID.fromString("00001205-0000-1000-8000-00805f9b34fb"), "UPNP_Service");
            put(UUID.fromString("00001206-0000-1000-8000-00805f9b34fb"), "UPNP_IP_Service");
            put(UUID.fromString("00001300-0000-1000-8000-00805f9b34fb"), "ESDP_UPNP_IP_PAN");
            put(UUID.fromString("00001301-0000-1000-8000-00805f9b34fb"), "ESDP_UPNP_IP_LAP");
            put(UUID.fromString("00001302-0000-1000-8000-00805f9b34fb"), "ESDP_UPNP_L2CAP");
            put(UUID.fromString("00001303-0000-1000-8000-00805f9b34fb"), "VideoSource");
            put(UUID.fromString("00001304-0000-1000-8000-00805f9b34fb"), "VideoSink");
            put(UUID.fromString("00001305-0000-1000-8000-00805f9b34fb"), "VideoDistribution");
            put(UUID.fromString("00001400-0000-1000-8000-00805f9b34fb"), "HDP");
            put(UUID.fromString("00001401-0000-1000-8000-00805f9b34fb"), "HDP Source");
            put(UUID.fromString("00001402-0000-1000-8000-00805f9b34fb"), "HDP Sink");
        }

    }

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> PROFILE_MAPPING_128 = Collections
            .synchronizedMap(Collections.unmodifiableMap(new Map128()));

}