package org.im97mori.ble.constants;

import static org.im97mori.ble.constants.SdoUUID.SDO_MAPPING_128;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;

public class SdoUUIDTest {

    @Test
    public void test_map_00001() {
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fff3-0000-1000-8000-00805f9b34fb")));
        assertEquals("FiRa Consortium", SDO_MAPPING_128.get(UUID.fromString("0000fff3-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fff4-0000-1000-8000-00805f9b34fb")));
        assertEquals("FiRa Consortium", SDO_MAPPING_128.get(UUID.fromString("0000fff4-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fff5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Car Connectivity Consortium, LLC",
                SDO_MAPPING_128.get(UUID.fromString("0000fff5-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fff6-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZigBee Alliance", SDO_MAPPING_128.get(UUID.fromString("0000fff6-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fff7-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZigBee Alliance", SDO_MAPPING_128.get(UUID.fromString("0000fff7-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fff8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mopria Alliance BLE Service",
                SDO_MAPPING_128.get(UUID.fromString("0000fff8-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fff9-0000-1000-8000-00805f9b34fb")));
        assertEquals("FIDO2 secure client-to-authenticator transport",
                SDO_MAPPING_128.get(UUID.fromString("0000fff9-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fffa-0000-1000-8000-00805f9b34fb")));
        assertEquals("ASTM Remote ID", SDO_MAPPING_128.get(UUID.fromString("0000fffa-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fffb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Direct Thread Commissioning",
                SDO_MAPPING_128.get(UUID.fromString("0000fffb-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fffc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wireless Power Transfer (WPT) Service",
                SDO_MAPPING_128.get(UUID.fromString("0000fffc-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fffd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Universal Second Factor Authenticator Service",
                SDO_MAPPING_128.get(UUID.fromString("0000fffd-0000-1000-8000-00805f9b34fb")));
        assertTrue(SDO_MAPPING_128.containsKey(UUID.fromString("0000fffe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wireless Power Transfer Service",
                SDO_MAPPING_128.get(UUID.fromString("0000fffe-0000-1000-8000-00805f9b34fb")));
    }
}
