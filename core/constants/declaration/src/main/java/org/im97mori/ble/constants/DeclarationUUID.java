package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT Declaration UUID
 * <p>
 * Generic Access Profile
 * Revision Date: 2021-07-13
 */
public class DeclarationUUID {

    @SuppressWarnings("serial")
    private static final class Map128 extends HashMap<UUID, String> {

        private Map128() {
            super();
            put(UUID.fromString("00002800-0000-1000-8000-00805f9b34fb"), "Primary Service");
            put(UUID.fromString("00002801-0000-1000-8000-00805f9b34fb"), "Secondary Service");
            put(UUID.fromString("00002802-0000-1000-8000-00805f9b34fb"), "Include");
            put(UUID.fromString("00002803-0000-1000-8000-00805f9b34fb"), "Characteristic");
        }

    }

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> DECLARATION_MAPPING_128 = Collections.synchronizedMap(Collections.unmodifiableMap(new Map128()));

}