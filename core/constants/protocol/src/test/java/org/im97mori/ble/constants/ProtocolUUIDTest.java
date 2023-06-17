package org.im97mori.ble.constants;

import static org.im97mori.ble.constants.ProtocolUUID.PROTOCOL_MAPPING_128;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;

public class ProtocolUUIDTest {

    @Test
    public void test_map_00001() {
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00001-0000-1000-8000-00805f9b34fb")));
        assertEquals("SDP", PROTOCOL_MAPPING_128.get(UUID.fromString("00001-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00002-0000-1000-8000-00805f9b34fb")));
        assertEquals("UDP", PROTOCOL_MAPPING_128.get(UUID.fromString("00002-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00003-0000-1000-8000-00805f9b34fb")));
        assertEquals("RFCOMM", PROTOCOL_MAPPING_128.get(UUID.fromString("00003-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00004-0000-1000-8000-00805f9b34fb")));
        assertEquals("TCP", PROTOCOL_MAPPING_128.get(UUID.fromString("00004-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00005-0000-1000-8000-00805f9b34fb")));
        assertEquals("TCS-BIN", PROTOCOL_MAPPING_128.get(UUID.fromString("00005-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00006-0000-1000-8000-00805f9b34fb")));
        assertEquals("TCS-AT", PROTOCOL_MAPPING_128.get(UUID.fromString("00006-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00007-0000-1000-8000-00805f9b34fb")));
        assertEquals("ATT", PROTOCOL_MAPPING_128.get(UUID.fromString("00007-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00008-0000-1000-8000-00805f9b34fb")));
        assertEquals("OBEX", PROTOCOL_MAPPING_128.get(UUID.fromString("00008-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00009-0000-1000-8000-00805f9b34fb")));
        assertEquals("IP", PROTOCOL_MAPPING_128.get(UUID.fromString("00009-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("0000a-0000-1000-8000-00805f9b34fb")));
        assertEquals("FTP", PROTOCOL_MAPPING_128.get(UUID.fromString("0000a-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("0000c-0000-1000-8000-00805f9b34fb")));
        assertEquals("HTTP", PROTOCOL_MAPPING_128.get(UUID.fromString("0000c-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("0000e-0000-1000-8000-00805f9b34fb")));
        assertEquals("WSP", PROTOCOL_MAPPING_128.get(UUID.fromString("0000e-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("0000f-0000-1000-8000-00805f9b34fb")));
        assertEquals("BNEP", PROTOCOL_MAPPING_128.get(UUID.fromString("0000f-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("000010-0000-1000-8000-00805f9b34fb")));
        assertEquals("UPNP", PROTOCOL_MAPPING_128.get(UUID.fromString("000010-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("000011-0000-1000-8000-00805f9b34fb")));
        assertEquals("HIDP", PROTOCOL_MAPPING_128.get(UUID.fromString("000011-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("000012-0000-1000-8000-00805f9b34fb")));
        assertEquals("HardcopyControlChannel",
                PROTOCOL_MAPPING_128.get(UUID.fromString("000012-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("000014-0000-1000-8000-00805f9b34fb")));
        assertEquals("HardcopyDataChannel",
                PROTOCOL_MAPPING_128.get(UUID.fromString("000014-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("000016-0000-1000-8000-00805f9b34fb")));
        assertEquals("HardcopyNotification",
                PROTOCOL_MAPPING_128.get(UUID.fromString("000016-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("000017-0000-1000-8000-00805f9b34fb")));
        assertEquals("AVCTP", PROTOCOL_MAPPING_128.get(UUID.fromString("000017-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("000019-0000-1000-8000-00805f9b34fb")));
        assertEquals("AVDTP", PROTOCOL_MAPPING_128.get(UUID.fromString("000019-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00001b-0000-1000-8000-00805f9b34fb")));
        assertEquals("CMTP", PROTOCOL_MAPPING_128.get(UUID.fromString("00001b-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00001e-0000-1000-8000-00805f9b34fb")));
        assertEquals("MCAPControlChannel",
                PROTOCOL_MAPPING_128.get(UUID.fromString("00001e-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("00001f-0000-1000-8000-00805f9b34fb")));
        assertEquals("MCAPDataChannel",
                PROTOCOL_MAPPING_128.get(UUID.fromString("00001f-0000-1000-8000-00805f9b34fb")));
        assertTrue(PROTOCOL_MAPPING_128.containsKey(UUID.fromString("0000100-0000-1000-8000-00805f9b34fb")));
        assertEquals("L2CAP", PROTOCOL_MAPPING_128.get(UUID.fromString("0000100-0000-1000-8000-00805f9b34fb")));
    }
}
