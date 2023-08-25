package org.im97mori.ble.constants;

import static org.im97mori.ble.constants.ProfileUUID.PROFILE_MAPPING_128;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ProfileUUIDTest extends TestBase {

    @Test
    public void test_map_00001() {
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001000-0000-1000-8000-00805f9b34fb")));
        assertEquals("ServiceDiscoveryServerServiceClassID",
                PROFILE_MAPPING_128.get(UUID.fromString("00001000-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001001-0000-1000-8000-00805f9b34fb")));
        assertEquals("BrowseGroupDescriptorServiceClassID",
                PROFILE_MAPPING_128.get(UUID.fromString("00001001-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001101-0000-1000-8000-00805f9b34fb")));
        assertEquals("SerialPort", PROFILE_MAPPING_128.get(UUID.fromString("00001101-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001102-0000-1000-8000-00805f9b34fb")));
        assertEquals("LANAccessUsingPPP",
                PROFILE_MAPPING_128.get(UUID.fromString("00001102-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001103-0000-1000-8000-00805f9b34fb")));
        assertEquals("DialupNetworking",
                PROFILE_MAPPING_128.get(UUID.fromString("00001103-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001104-0000-1000-8000-00805f9b34fb")));
        assertEquals("IrMCSync", PROFILE_MAPPING_128.get(UUID.fromString("00001104-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001105-0000-1000-8000-00805f9b34fb")));
        assertEquals("OBEXObjectPush",
                PROFILE_MAPPING_128.get(UUID.fromString("00001105-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001106-0000-1000-8000-00805f9b34fb")));
        assertEquals("OBEXFileTransfer",
                PROFILE_MAPPING_128.get(UUID.fromString("00001106-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001107-0000-1000-8000-00805f9b34fb")));
        assertEquals("IrMCSyncCommand",
                PROFILE_MAPPING_128.get(UUID.fromString("00001107-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001108-0000-1000-8000-00805f9b34fb")));
        assertEquals("Headset", PROFILE_MAPPING_128.get(UUID.fromString("00001108-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001109-0000-1000-8000-00805f9b34fb")));
        assertEquals("CordlessTelephony",
                PROFILE_MAPPING_128.get(UUID.fromString("00001109-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000110a-0000-1000-8000-00805f9b34fb")));
        assertEquals("AudioSource", PROFILE_MAPPING_128.get(UUID.fromString("0000110a-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000110b-0000-1000-8000-00805f9b34fb")));
        assertEquals("AudioSink", PROFILE_MAPPING_128.get(UUID.fromString("0000110b-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000110c-0000-1000-8000-00805f9b34fb")));
        assertEquals("A/V_RemoteControlTarget",
                PROFILE_MAPPING_128.get(UUID.fromString("0000110c-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000110d-0000-1000-8000-00805f9b34fb")));
        assertEquals("AdvancedAudioDistribution",
                PROFILE_MAPPING_128.get(UUID.fromString("0000110d-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000110e-0000-1000-8000-00805f9b34fb")));
        assertEquals("A/V_RemoteControl",
                PROFILE_MAPPING_128.get(UUID.fromString("0000110e-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000110f-0000-1000-8000-00805f9b34fb")));
        assertEquals("A/V_RemoteControlController",
                PROFILE_MAPPING_128.get(UUID.fromString("0000110f-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001110-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intercom", PROFILE_MAPPING_128.get(UUID.fromString("00001110-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001111-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fax", PROFILE_MAPPING_128.get(UUID.fromString("00001111-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001112-0000-1000-8000-00805f9b34fb")));
        assertEquals("Headset - Audio Gateway",
                PROFILE_MAPPING_128.get(UUID.fromString("00001112-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001113-0000-1000-8000-00805f9b34fb")));
        assertEquals("WAP", PROFILE_MAPPING_128.get(UUID.fromString("00001113-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001114-0000-1000-8000-00805f9b34fb")));
        assertEquals("WAP_CLIENT", PROFILE_MAPPING_128.get(UUID.fromString("00001114-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001115-0000-1000-8000-00805f9b34fb")));
        assertEquals("PANU", PROFILE_MAPPING_128.get(UUID.fromString("00001115-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001116-0000-1000-8000-00805f9b34fb")));
        assertEquals("NAP", PROFILE_MAPPING_128.get(UUID.fromString("00001116-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001117-0000-1000-8000-00805f9b34fb")));
        assertEquals("GN", PROFILE_MAPPING_128.get(UUID.fromString("00001117-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001118-0000-1000-8000-00805f9b34fb")));
        assertEquals("DirectPrinting",
                PROFILE_MAPPING_128.get(UUID.fromString("00001118-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001119-0000-1000-8000-00805f9b34fb")));
        assertEquals("ReferencePrinting",
                PROFILE_MAPPING_128.get(UUID.fromString("00001119-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000111a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Basic Imaging Profile",
                PROFILE_MAPPING_128.get(UUID.fromString("0000111a-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000111b-0000-1000-8000-00805f9b34fb")));
        assertEquals("ImagingResponder",
                PROFILE_MAPPING_128.get(UUID.fromString("0000111b-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000111c-0000-1000-8000-00805f9b34fb")));
        assertEquals("ImagingAutomaticArchive",
                PROFILE_MAPPING_128.get(UUID.fromString("0000111c-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000111d-0000-1000-8000-00805f9b34fb")));
        assertEquals("ImagingReferencedObjects",
                PROFILE_MAPPING_128.get(UUID.fromString("0000111d-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000111e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Handsfree", PROFILE_MAPPING_128.get(UUID.fromString("0000111e-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000111f-0000-1000-8000-00805f9b34fb")));
        assertEquals("HandsfreeAudioGateway",
                PROFILE_MAPPING_128.get(UUID.fromString("0000111f-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001120-0000-1000-8000-00805f9b34fb")));
        assertEquals("DirectPrintingReferenceObjectsService",
                PROFILE_MAPPING_128.get(UUID.fromString("00001120-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001121-0000-1000-8000-00805f9b34fb")));
        assertEquals("ReflectedUI", PROFILE_MAPPING_128.get(UUID.fromString("00001121-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001122-0000-1000-8000-00805f9b34fb")));
        assertEquals("BasicPrinting", PROFILE_MAPPING_128.get(UUID.fromString("00001122-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001123-0000-1000-8000-00805f9b34fb")));
        assertEquals("PrintingStatus",
                PROFILE_MAPPING_128.get(UUID.fromString("00001123-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001124-0000-1000-8000-00805f9b34fb")));
        assertEquals("HumanInterfaceDeviceService",
                PROFILE_MAPPING_128.get(UUID.fromString("00001124-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001125-0000-1000-8000-00805f9b34fb")));
        assertEquals("HardcopyCableReplacement",
                PROFILE_MAPPING_128.get(UUID.fromString("00001125-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001126-0000-1000-8000-00805f9b34fb")));
        assertEquals("HCR_Print", PROFILE_MAPPING_128.get(UUID.fromString("00001126-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001127-0000-1000-8000-00805f9b34fb")));
        assertEquals("HCR_Scan", PROFILE_MAPPING_128.get(UUID.fromString("00001127-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001128-0000-1000-8000-00805f9b34fb")));
        assertEquals("Common_ISDN_Access",
                PROFILE_MAPPING_128.get(UUID.fromString("00001128-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000112d-0000-1000-8000-00805f9b34fb")));
        assertEquals("SIM_Access", PROFILE_MAPPING_128.get(UUID.fromString("0000112d-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000112e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Phonebook Access - PCE",
                PROFILE_MAPPING_128.get(UUID.fromString("0000112e-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000112f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Phonebook Access - PSE",
                PROFILE_MAPPING_128.get(UUID.fromString("0000112f-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001130-0000-1000-8000-00805f9b34fb")));
        assertEquals("Phonebook Access",
                PROFILE_MAPPING_128.get(UUID.fromString("00001130-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001131-0000-1000-8000-00805f9b34fb")));
        assertEquals("Headset - HS", PROFILE_MAPPING_128.get(UUID.fromString("00001131-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001132-0000-1000-8000-00805f9b34fb")));
        assertEquals("Message Access Server",
                PROFILE_MAPPING_128.get(UUID.fromString("00001132-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001133-0000-1000-8000-00805f9b34fb")));
        assertEquals("Message Notification Server",
                PROFILE_MAPPING_128.get(UUID.fromString("00001133-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001134-0000-1000-8000-00805f9b34fb")));
        assertEquals("Message Access Profile",
                PROFILE_MAPPING_128.get(UUID.fromString("00001134-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001135-0000-1000-8000-00805f9b34fb")));
        assertEquals("GNSS", PROFILE_MAPPING_128.get(UUID.fromString("00001135-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001136-0000-1000-8000-00805f9b34fb")));
        assertEquals("GNSS_Server", PROFILE_MAPPING_128.get(UUID.fromString("00001136-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001137-0000-1000-8000-00805f9b34fb")));
        assertEquals("3D Display", PROFILE_MAPPING_128.get(UUID.fromString("00001137-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001138-0000-1000-8000-00805f9b34fb")));
        assertEquals("3D Glasses", PROFILE_MAPPING_128.get(UUID.fromString("00001138-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001139-0000-1000-8000-00805f9b34fb")));
        assertEquals("3D Synchronization",
                PROFILE_MAPPING_128.get(UUID.fromString("00001139-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000113a-0000-1000-8000-00805f9b34fb")));
        assertEquals("MPS Profile", PROFILE_MAPPING_128.get(UUID.fromString("0000113a-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000113b-0000-1000-8000-00805f9b34fb")));
        assertEquals("MPS SC", PROFILE_MAPPING_128.get(UUID.fromString("0000113b-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000113c-0000-1000-8000-00805f9b34fb")));
        assertEquals("CTN Access Service",
                PROFILE_MAPPING_128.get(UUID.fromString("0000113c-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000113d-0000-1000-8000-00805f9b34fb")));
        assertEquals("CTN Notification Service",
                PROFILE_MAPPING_128.get(UUID.fromString("0000113d-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("0000113e-0000-1000-8000-00805f9b34fb")));
        assertEquals("CTN Profile", PROFILE_MAPPING_128.get(UUID.fromString("0000113e-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001200-0000-1000-8000-00805f9b34fb")));
        assertEquals("PnPInformation",
                PROFILE_MAPPING_128.get(UUID.fromString("00001200-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001201-0000-1000-8000-00805f9b34fb")));
        assertEquals("GenericNetworking",
                PROFILE_MAPPING_128.get(UUID.fromString("00001201-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001202-0000-1000-8000-00805f9b34fb")));
        assertEquals("GenericFileTransfer",
                PROFILE_MAPPING_128.get(UUID.fromString("00001202-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001203-0000-1000-8000-00805f9b34fb")));
        assertEquals("GenericAudio", PROFILE_MAPPING_128.get(UUID.fromString("00001203-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001204-0000-1000-8000-00805f9b34fb")));
        assertEquals("GenericTelephony",
                PROFILE_MAPPING_128.get(UUID.fromString("00001204-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001205-0000-1000-8000-00805f9b34fb")));
        assertEquals("UPNP_Service", PROFILE_MAPPING_128.get(UUID.fromString("00001205-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001206-0000-1000-8000-00805f9b34fb")));
        assertEquals("UPNP_IP_Service",
                PROFILE_MAPPING_128.get(UUID.fromString("00001206-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001300-0000-1000-8000-00805f9b34fb")));
        assertEquals("ESDP_UPNP_IP_PAN",
                PROFILE_MAPPING_128.get(UUID.fromString("00001300-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001301-0000-1000-8000-00805f9b34fb")));
        assertEquals("ESDP_UPNP_IP_LAP",
                PROFILE_MAPPING_128.get(UUID.fromString("00001301-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001302-0000-1000-8000-00805f9b34fb")));
        assertEquals("ESDP_UPNP_L2CAP",
                PROFILE_MAPPING_128.get(UUID.fromString("00001302-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001303-0000-1000-8000-00805f9b34fb")));
        assertEquals("VideoSource", PROFILE_MAPPING_128.get(UUID.fromString("00001303-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001304-0000-1000-8000-00805f9b34fb")));
        assertEquals("VideoSink", PROFILE_MAPPING_128.get(UUID.fromString("00001304-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001305-0000-1000-8000-00805f9b34fb")));
        assertEquals("VideoDistribution",
                PROFILE_MAPPING_128.get(UUID.fromString("00001305-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001400-0000-1000-8000-00805f9b34fb")));
        assertEquals("HDP", PROFILE_MAPPING_128.get(UUID.fromString("00001400-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001401-0000-1000-8000-00805f9b34fb")));
        assertEquals("HDP Source", PROFILE_MAPPING_128.get(UUID.fromString("00001401-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROFILE_MAPPING_128.containsKey(UUID.fromString("00001402-0000-1000-8000-00805f9b34fb")));
        assertEquals("HDP Sink", PROFILE_MAPPING_128.get(UUID.fromString("00001402-0000-1000-8000-00805f9b34fb")));
    }
}
