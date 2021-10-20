package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT SDO GATT Service UUID
 * <p>
 * Generic Access Profile
 * Revision Date: 2021-07-13
 */
public class SdoUUID {

    @SuppressWarnings("serial")
    private static final class Map128 extends HashMap<UUID, String> {

        private Map128() {
            super();
            put(UUID.fromString("0000fff3-0000-1000-8000-00805f9b34fb"), "FiRa Consortium");
            put(UUID.fromString("0000fff4-0000-1000-8000-00805f9b34fb"), "FiRa Consortium");
            put(UUID.fromString("0000fff5-0000-1000-8000-00805f9b34fb"), "Car Connectivity Consortium, LLC");
            put(UUID.fromString("0000fff6-0000-1000-8000-00805f9b34fb"), "ZigBee Alliance");
            put(UUID.fromString("0000fff7-0000-1000-8000-00805f9b34fb"), "ZigBee Alliance");
            put(UUID.fromString("0000fff8-0000-1000-8000-00805f9b34fb"), "Mopria Alliance");
            put(UUID.fromString("0000fff9-0000-1000-8000-00805f9b34fb"), "Fast IDentity Online Alliance (FIDO)");
            put(UUID.fromString("0000fffa-0000-1000-8000-00805f9b34fb"), "ASTM International");
            put(UUID.fromString("0000fffb-0000-1000-8000-00805f9b34fb"), "Thread Group, Inc.");
            put(UUID.fromString("0000fffc-0000-1000-8000-00805f9b34fb"), "AirFuel Alliance");
            put(UUID.fromString("0000fffd-0000-1000-8000-00805f9b34fb"), "Fast IDentity Online Alliance (FIDO)");
            put(UUID.fromString("0000fffe-0000-1000-8000-00805f9b34fb"), "AirFuel Alliance (formerly Alliance for Wireless Power)");
        }

    }

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> SDO_MAPPING_128 = Collections.synchronizedMap(Collections.unmodifiableMap(new Map128()));

}