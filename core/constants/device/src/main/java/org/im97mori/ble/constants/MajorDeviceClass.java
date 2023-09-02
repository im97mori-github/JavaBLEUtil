package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Bluetooth Core Specification [Vol 2] Part B, Section 6.5.1.4
 * Supplement to the Bluetooth Core Specification Part A, Section 1.6.2
 * Assigned Numbers 2.8.2
 * <p>
 * https://bitbucket.org/bluetooth-SIG/public/src/main/
 * commit 6557f28af8b95de6b09d6e0d96cf51651fba32ff
 */
public class MajorDeviceClass {

    private static final class MapMajorDeviceClass extends HashMap<Integer, String> {

        private MapMajorDeviceClass() {
            super();
            //@formatter:off
            put(0b00000000_00000000_00000000, "Miscellaneous");
            put(0b00000000_00000001_00000000, "Computer (desktop, notebook, PDA, organizer, ...)");
            put(0b00000000_00000010_00000000, "Phone (cellular, cordless, pay phone, modem, ...)");
            put(0b00000000_00000011_00000000, "LAN/Network Access point");
            put(0b00000000_00000100_00000000, "Audio/Video (headset, speaker, stereo, video display, VCR, ...)");
            put(0b00000000_00000101_00000000, "Peripheral (mouse, joystick, keyboard, ...)");
            put(0b00000000_00000110_00000000, "Imaging (printer, scanner, camera, display, ...)");
            put(0b00000000_00000111_00000000, "Wearable");
            put(0b00000000_00001000_00000000, "Toy");
            put(0b00000000_00001001_00000000, "Health");
            put(0b00000000_00011111_00000000, "Uncategorized: device code not specified");
            //@formatter:on
        }
    }

    /**
     * Major Device Class map
     */
    public static final Map<Integer, String> MAJOR_DEVICE_CLASS_MAPPING = Collections
            .synchronizedMap(Collections.unmodifiableMap(new MapMajorDeviceClass()));

    /**
     * Major Device Class : Miscellaneous
     */
    public static final int MISCELLANEOUS_MAJOR_DEVICE_CLASS = 0b00000000_00000000_00000000;

    /**
     * Major Device Class : Computer (desktop, notebook, PDA, organizer, ...)
     */
    public static final int COMPUTER_MAJOR_DEVICE_CLASS = 0b00000000_00000001_00000000;

    /**
     * Major Device Class : Phone (cellular, cordless, pay phone, modem, ...)
     */
    public static final int PHONE_MAJOR_DEVICE_CLASS = 0b00000000_00000010_00000000;

    /**
     * Major Device Class : LAN/Network Access point
     */
    public static final int LAN_NETWORK_ACCESS_POINT_MAJOR_DEVICE_CLASS = 0b00000000_00000011_00000000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display,
     * VCR, ...)
     */
    public static final int AUDIO_VIDEO_MAJOR_DEVICE_CLASS = 0b00000000_00000100_00000000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     */
    public static final int PERIPHERAL_MAJOR_DEVICE_CLASS = 0b00000000_00000101_00000000;

    /**
     * Major Device Class : Imaging (printer, scanner, camera, display, ...)
     */
    public static final int IMAGING_MAJOR_DEVICE_CLASS = 0b00000000_00000110_00000000;

    /**
     * Major Device Class : Wearable
     */
    public static final int WEARABLE_MAJOR_DEVICE_CLASS = 0b00000000_00000111_00000000;

    /**
     * Major Device Class : Toy
     */
    public static final int TOY_MAJOR_DEVICE_CLASS = 0b00000000_00001000_00000000;

    /**
     * Major Device Class : Health
     */
    public static final int HEALTH_MAJOR_DEVICE_CLASS = 0b00000000_00001001_00000000;

    /**
     * Major Device Class : Uncategorized: device code not specified
     */
    public static final int UNCATEGORIZED_MAJOR_DEVICE_CLASS = 0b00000000_00011111_00000000;

}