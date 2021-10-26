package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT Protocol Identifier UUID
 * <p>
 * 16-bit UUID Numbers Document.pdf
 * Revision Date: 2021-10-01
 */
public class ProtocolUUID {

    @SuppressWarnings("serial")
    private static final class Map128 extends HashMap<UUID, String> {

        private Map128() {
            super();
            put(UUID.fromString("00000001-0000-1000-8000-00805f9b34fb"), "SDP");
            put(UUID.fromString("00000002-0000-1000-8000-00805f9b34fb"), "UDP");
            put(UUID.fromString("00000003-0000-1000-8000-00805f9b34fb"), "RFCOMM");
            put(UUID.fromString("00000004-0000-1000-8000-00805f9b34fb"), "TCP");
            put(UUID.fromString("00000005-0000-1000-8000-00805f9b34fb"), "TCS-BIN");
            put(UUID.fromString("00000006-0000-1000-8000-00805f9b34fb"), "TCS-AT");
            put(UUID.fromString("00000007-0000-1000-8000-00805f9b34fb"), "ATT");
            put(UUID.fromString("00000008-0000-1000-8000-00805f9b34fb"), "OBEX");
            put(UUID.fromString("00000009-0000-1000-8000-00805f9b34fb"), "IP");
            put(UUID.fromString("0000000a-0000-1000-8000-00805f9b34fb"), "FTP");
            put(UUID.fromString("0000000c-0000-1000-8000-00805f9b34fb"), "HTTP");
            put(UUID.fromString("0000000e-0000-1000-8000-00805f9b34fb"), "WSP");
            put(UUID.fromString("0000000f-0000-1000-8000-00805f9b34fb"), "BNEP");
            put(UUID.fromString("00000010-0000-1000-8000-00805f9b34fb"), "UPNP");
            put(UUID.fromString("00000011-0000-1000-8000-00805f9b34fb"), "HIDP");
            put(UUID.fromString("00000012-0000-1000-8000-00805f9b34fb"), "HardcopyControlChannel");
            put(UUID.fromString("00000014-0000-1000-8000-00805f9b34fb"), "HardcopyDataChannel");
            put(UUID.fromString("00000016-0000-1000-8000-00805f9b34fb"), "HardcopyNotification");
            put(UUID.fromString("00000017-0000-1000-8000-00805f9b34fb"), "AVCTP");
            put(UUID.fromString("00000019-0000-1000-8000-00805f9b34fb"), "AVDTP");
            put(UUID.fromString("0000001b-0000-1000-8000-00805f9b34fb"), "CMTP");
            put(UUID.fromString("0000001e-0000-1000-8000-00805f9b34fb"), "MCAPControlChannel");
            put(UUID.fromString("0000001f-0000-1000-8000-00805f9b34fb"), "MCAPDataChannel");
            put(UUID.fromString("00000100-0000-1000-8000-00805f9b34fb"), "L2CAP");
        }

    }

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> PROTOCOL_MAPPING_128 = Collections.synchronizedMap(Collections.unmodifiableMap(new Map128()));

}