package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Bluetooth Core Specification [Vol 2] Part B, Section 6.5.1.4
 * Supplement to the Bluetooth Core Specification Part A, Section 1.6.2
 * Assigned Numbers 2.8.1
 * <p>
 * https://bitbucket.org/bluetooth-SIG/public/src/main/
 * commit 6557f28af8b95de6b09d6e0d96cf51651fba32ff
 */
public class MajorServiceClasses {

    private static final class MapMajorServiceClasses extends HashMap<Integer, String> {

        private MapMajorServiceClasses() {
            super();
            //@formatter:off
            put(0b00000000_00100000_00000000, "Limited Discoverable Mode");
            put(0b00000000_01000000_00000000, "LE audio");
            put(0b00000000_10000000_00000000, "Reserved for future use");
            put(0b00000001_00000000_00000000, "Positioning (Location identification)");
            put(0b00000010_00000000_00000000, "Networking (LAN, Ad hoc, ...)");
            put(0b00000100_00000000_00000000, "Rendering (Printing, Speakers, ...)");
            put(0b00001000_00000000_00000000, "Capturing (Scanner, Microphone, ...)");
            put(0b00010000_00000000_00000000, "Object Transfer (v-Inbox, v-Folder, ...)");
            put(0b00100000_00000000_00000000, "Audio (Speaker, Microphone, Headset service, ...)");
            put(0b01000000_00000000_00000000, "Telephony (Cordless telephony, Modem, Headset service, ...)");
            put(0b10000000_00000000_00000000, "Information (WEB-server, WAP-server, ...)");
            //@formatter:on
        }
    }

    /**
     * Major Service Classes map
     */
    public static final Map<Integer, String> MAJOR_SERVICE_CLASSES_MAPPING = Collections
            .synchronizedMap(Collections.unmodifiableMap(new MapMajorServiceClasses()));

    /**
     * Major Service Class : Limited Discoverable Mode
     * (Bit : 13)
     */
    public static final int LIMITED_DISCOVERABLE_MODE_MAJOR_SERVICE_CLASSES = 0b00000000_00100000_00000000;

    /**
     * Major Service Class : LE audio
     * (Bit : 14)
     */
    public static final int LE_AUDIO_MAJOR_SERVICE_CLASSES = 0b00000000_01000000_00000000;

    /**
     * Major Service Class : Reserved for future use
     * (Bit : 15)
     */
    public static final int RESERVED_FOR_FUTURE_USE_MAJOR_SERVICE_CLASSES = 0b00000000_10000000_00000000;

    /**
     * Major Service Class : Positioning (Location identification)
     * (Bit : 16)
     */
    public static final int POSITIONING_MAJOR_SERVICE_CLASSES = 0b00000001_00000000_00000000;

    /**
     * Major Service Class : Networking (LAN, Ad hoc, ...)
     * (Bit : 17)
     */
    public static final int NETWORKING_MAJOR_SERVICE_CLASSES = 0b00000010_00000000_00000000;

    /**
     * Major Service Class : Rendering (Printing, Speakers, ...)
     * (Bit : 18)
     */
    public static final int RENDERING_MAJOR_SERVICE_CLASSES = 0b00000100_00000000_00000000;

    /**
     * Major Service Class : Capturing (Scanner, Microphone, ...)
     * (Bit : 19)
     */
    public static final int CAPTURING_MAJOR_SERVICE_CLASSES = 0b00001000_00000000_00000000;

    /**
     * Major Service Class : Object Transfer (v-Inbox, v-Folder, ...)
     * (Bit : 20)
     */
    public static final int OBJECT_TRANSFER_MAJOR_SERVICE_CLASSES = 0b00010000_00000000_00000000;

    /**
     * Major Service Class : Audio (Speaker, Microphone, Headset service, ...)
     * (Bit : 21)
     */
    public static final int AUDIO_MAJOR_SERVICE_CLASSES = 0b00100000_00000000_00000000;

    /**
     * Major Service Class : Telephony (Cordless telephony, Modem, Headset service, ...)
     * (Bit : 22)
     */
    public static final int TELEPHONY_MAJOR_SERVICE_CLASSES = 0b01000000_00000000_00000000;

    /**
     * Major Service Class : Information (WEB-server, WAP-server, ...)
     * (Bit : 23)
     */
    public static final int INFORMATION_MAJOR_SERVICE_CLASSES = 0b10000000_00000000_00000000;

}