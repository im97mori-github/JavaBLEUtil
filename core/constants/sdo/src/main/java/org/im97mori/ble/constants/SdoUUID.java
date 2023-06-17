package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT SDO GATT Service UUID
 * <p>
 * https://bitbucket.org/bluetooth-SIG/public/src/main/
 * commit 6557f28af8b95de6b09d6e0d96cf51651fba32ff
 */
public class SdoUUID {

    private static final class Map128 extends HashMap<UUID, String> {

        private Map128() {
            super();
            //@formatter:off
            put(UUID.fromString("0000fff3-0000-1000-8000-00805f9b34fb"), "FiRa Consortium");
            put(UUID.fromString("0000fff4-0000-1000-8000-00805f9b34fb"), "FiRa Consortium");
            put(UUID.fromString("0000fff5-0000-1000-8000-00805f9b34fb"), "Car Connectivity Consortium, LLC");
            put(UUID.fromString("0000fff6-0000-1000-8000-00805f9b34fb"), "ZigBee Alliance");
            put(UUID.fromString("0000fff7-0000-1000-8000-00805f9b34fb"), "ZigBee Alliance");
            put(UUID.fromString("0000fff8-0000-1000-8000-00805f9b34fb"), "Mopria Alliance BLE Service");
            put(UUID.fromString("0000fff9-0000-1000-8000-00805f9b34fb"), "FIDO2 secure client-to-authenticator transport");
            put(UUID.fromString("0000fffa-0000-1000-8000-00805f9b34fb"), "ASTM Remote ID");
            put(UUID.fromString("0000fffb-0000-1000-8000-00805f9b34fb"), "Direct Thread Commissioning");
            put(UUID.fromString("0000fffc-0000-1000-8000-00805f9b34fb"), "Wireless Power Transfer (WPT) Service");
            put(UUID.fromString("0000fffd-0000-1000-8000-00805f9b34fb"), "Universal Second Factor Authenticator Service");
            put(UUID.fromString("0000fffe-0000-1000-8000-00805f9b34fb"), "Wireless Power Transfer Service");
            //@formatter:on
        }

    }

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> SDO_MAPPING_128 = Collections
            .synchronizedMap(Collections.unmodifiableMap(new Map128()));

}