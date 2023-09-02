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
public class MinorDeviceClass {

    private static final class MapMinorDeviceClass extends HashMap<Integer, String> {

        private MapMinorDeviceClass() {
            super();
            //@formatter:off
            put(0b00000000_00000001_00000000, "Uncategorized, code for device not assigned");
            put(0b00000000_00000001_00000100, "Desktop workstation");
            put(0b00000000_00000001_00001000, "Server-class computer");
            put(0b00000000_00000001_00001100, "Laptop");
            put(0b00000000_00000001_00010000, "Handheld PC/PDA (clamshell)");
            put(0b00000000_00000001_00010100, "Palm-size PC/PDA");
            put(0b00000000_00000001_00011000, "Wearable computer (watch size)");
            put(0b00000000_00000001_00011100, "Tablet");
            put(0b00000000_00000010_00000000, "Uncategorized, code for device not assigned");
            put(0b00000000_00000010_00000100, "Cellular");
            put(0b00000000_00000010_00001000, "Cordless");
            put(0b00000000_00000010_00001100, "Smartphone");
            put(0b00000000_00000010_00010000, "Wired modem or voice gateway");
            put(0b00000000_00000010_00010100, "Common ISDN access");
            put(0b00000000_00000011_00000000, "Fully available : Uncategorized (use this value if no others apply)");
            put(0b00000000_00000011_00100000, "1% to 17% utilized : Uncategorized (use this value if no others apply)");
            put(0b00000000_00000011_01000000, "17% to 33% utilized : Uncategorized (use this value if no others apply)");
            put(0b00000000_00000011_01100000, "33% to 50% utilized : Uncategorized (use this value if no others apply)");
            put(0b00000000_00000011_10000000, "50% to 67% utilized : Uncategorized (use this value if no others apply)");
            put(0b00000000_00000011_10100000, "67% to 83% utilized : Uncategorized (use this value if no others apply)");
            put(0b00000000_00000011_11000000, "83% to 99% utilized : Uncategorized (use this value if no others apply)");
            put(0b00000000_00000011_11100000, "No service available : Uncategorized (use this value if no others apply)");
            put(0b00000000_00000100_00000000, "Uncategorized, code not assigned");
            put(0b00000000_00000100_00000100, "Wearable Headset Device");
            put(0b00000000_00000100_00001000, "Hands-free Device");
            put(0b00000000_00000100_00001100, "(Reserved)");
            put(0b00000000_00000100_00010000, "Microphone");
            put(0b00000000_00000100_00010100, "Loudspeaker");
            put(0b00000000_00000100_00011000, "Headphones");
            put(0b00000000_00000100_00011100, "Portable Audio");
            put(0b00000000_00000100_00100000, "Car Audio");
            put(0b00000000_00000100_00100100, "Set-top box");
            put(0b00000000_00000100_00101000, "HiFi Audio Device");
            put(0b00000000_00000100_00101100, "VCR");
            put(0b00000000_00000100_00110000, "Video Camera");
            put(0b00000000_00000100_00110100, "Camcorder");
            put(0b00000000_00000100_00111000, "Video Monitor");
            put(0b00000000_00000100_00111100, "Video Display and Loudspeaker");
            put(0b00000000_00000100_01000000, "Video Conferencing");
            put(0b00000000_00000100_01000100, "(Reserved)");
            put(0b00000000_00000100_01001000, "Gaming/Toy");
            put(0b00000000_00000101_00000000, "Uncategorized, code not assigned : Uncategorized, code not assigned");
            put(0b00000000_00000101_00000100, "Uncategorized, code not assigned : Joystick");
            put(0b00000000_00000101_00001000, "Uncategorized, code not assigned : Gamepad");
            put(0b00000000_00000101_00001100, "Uncategorized, code not assigned : Remote control");
            put(0b00000000_00000101_00010000, "Uncategorized, code not assigned : Sensing device");
            put(0b00000000_00000101_00010100, "Uncategorized, code not assigned : Digitizer tablet");
            put(0b00000000_00000101_00011000, "Uncategorized, code not assigned : Card Reader (e.g. SIM Card Reader)");
            put(0b00000000_00000101_00011100, "Uncategorized, code not assigned : Digital Pen");
            put(0b00000000_00000101_00100000, "Uncategorized, code not assigned : Handheld scanner for barcodes, RFID, etc.");
            put(0b00000000_00000101_00100100, "Uncategorized, code not assigned : Handheld gestural input device (e.g., “wand” form factor)");
            put(0b00000000_00000101_01000000, "Keyboard : Uncategorized, code not assigned");
            put(0b00000000_00000101_01000100, "Keyboard : Joystick");
            put(0b00000000_00000101_01001000, "Keyboard : Gamepad");
            put(0b00000000_00000101_01001100, "Keyboard : Remote control");
            put(0b00000000_00000101_01010000, "Keyboard : Sensing device");
            put(0b00000000_00000101_01010100, "Keyboard : Digitizer tablet");
            put(0b00000000_00000101_01011000, "Keyboard : Card Reader (e.g. SIM Card Reader)");
            put(0b00000000_00000101_01011100, "Keyboard : Digital Pen");
            put(0b00000000_00000101_01100000, "Keyboard : Handheld scanner for barcodes, RFID, etc.");
            put(0b00000000_00000101_01100100, "Keyboard : Handheld gestural input device (e.g., “wand” form factor)");
            put(0b00000000_00000101_10000000, "Pointing device : Uncategorized, code not assigned");
            put(0b00000000_00000101_10000100, "Pointing device : Joystick");
            put(0b00000000_00000101_10001000, "Pointing device : Gamepad");
            put(0b00000000_00000101_10001100, "Pointing device : Remote control");
            put(0b00000000_00000101_10010000, "Pointing device : Sensing device");
            put(0b00000000_00000101_10010100, "Pointing device : Digitizer tablet");
            put(0b00000000_00000101_10011000, "Pointing device : Card Reader (e.g. SIM Card Reader)");
            put(0b00000000_00000101_10011100, "Pointing device : Digital Pen");
            put(0b00000000_00000101_10100000, "Pointing device : Handheld scanner for barcodes, RFID, etc.");
            put(0b00000000_00000101_10100100, "Pointing device : Handheld gestural input device (e.g., “wand” form factor)");
            put(0b00000000_00000101_11000000, "Combo Keyboard/Pointing device : Uncategorized, code not assigned");
            put(0b00000000_00000101_11000100, "Combo Keyboard/Pointing device : Joystick");
            put(0b00000000_00000101_11001000, "Combo Keyboard/Pointing device : Gamepad");
            put(0b00000000_00000101_11001100, "Combo Keyboard/Pointing device : Remote control");
            put(0b00000000_00000101_11010000, "Combo Keyboard/Pointing device : Sensing device");
            put(0b00000000_00000101_11010100, "Combo Keyboard/Pointing device : Digitizer tablet");
            put(0b00000000_00000101_11011000, "Combo Keyboard/Pointing device : Card Reader (e.g. SIM Card Reader)");
            put(0b00000000_00000101_11011100, "Combo Keyboard/Pointing device : Digital Pen");
            put(0b00000000_00000101_11100000, "Combo Keyboard/Pointing device : Handheld scanner for barcodes, RFID, etc.");
            put(0b00000000_00000101_11100100, "Combo Keyboard/Pointing device : Handheld gestural input device (e.g., “wand” form factor)");
            put(0b00000000_00000110_00010000, "Display : Uncategorized, default");
            put(0b00000000_00000110_00100000, "Camera : Uncategorized, default");
            put(0b00000000_00000110_01000000, "Scanner : Uncategorized, default");
            put(0b00000000_00000110_10000000, "Printer : Uncategorized, default");
            put(0b00000000_00000111_00000100, "Wristwatch");
            put(0b00000000_00000111_00001000, "Pager");
            put(0b00000000_00000111_00001100, "Jacket");
            put(0b00000000_00000111_00010000, "Helmet");
            put(0b00000000_00000111_00010100, "Glasses");
            put(0b00000000_00001000_00000100, "Robot");
            put(0b00000000_00001000_00001000, "Vehicle");
            put(0b00000000_00001000_00001100, "Doll/Action figure");
            put(0b00000000_00001000_00010000, "Controller");
            put(0b00000000_00001000_00010100, "Game");
            put(0b00000000_00001001_00000000, "Undefined");
            put(0b00000000_00001001_00000100, "Blood Pressure Monitor");
            put(0b00000000_00001001_00001000, "Thermometer");
            put(0b00000000_00001001_00001100, "Weighing Scale");
            put(0b00000000_00001001_00010000, "Glucose Meter");
            put(0b00000000_00001001_00010100, "Pulse Oximeter");
            put(0b00000000_00001001_00011000, "Heart/Pulse Rate Monitor");
            put(0b00000000_00001001_00011100, "Health Data Display");
            put(0b00000000_00001001_00100000, "Step Counter");
            put(0b00000000_00001001_00100100, "Body Composition Analyzer");
            put(0b00000000_00001001_00101000, "Peak Flow Monitor");
            put(0b00000000_00001001_00101100, "Medication Monitor");
            put(0b00000000_00001001_00110000, "Knee Prosthesis");
            put(0b00000000_00001001_00110100, "Ankle Prosthesis");
            put(0b00000000_00001001_00111000, "Generic Health Manager");
            put(0b00000000_00001001_00111100, "Personal Mobility Device");
            //@formatter:on
        }
    }

    /**
     * Minor Device Class map
     */
    public static final Map<Integer, String> MINOR_DEVICE_CLASS_MAPPING = Collections
            .synchronizedMap(Collections.unmodifiableMap(new MapMinorDeviceClass()));

    /**
     * Major Device Class : Computer (desktop, notebook, PDA, organizer, ...)
     * Minor Device Class : Uncategorized, code for device not assigned
     */
    public static final int COMPUTER_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000001_00000000;

    /**
     * Major Device Class : Computer (desktop, notebook, PDA, organizer, ...)
     * Minor Device Class : Desktop workstation
     */
    public static final int COMPUTER_DESKTOP_WORKSTATION_MINOR_DEVICE_CLASS = 0b00000000_00000001_00000100;

    /**
     * Major Device Class : Computer (desktop, notebook, PDA, organizer, ...)
     * Minor Device Class : Server-class computer
     */
    public static final int COMPUTER_SERVER_CLASS_COMPUTER_MINOR_DEVICE_CLASS = 0b00000000_00000001_00001000;

    /**
     * Major Device Class : Computer (desktop, notebook, PDA, organizer, ...)
     * Minor Device Class : Laptop
     */
    public static final int COMPUTER_LAPTOP_MINOR_DEVICE_CLASS = 0b00000000_00000001_00001100;

    /**
     * Major Device Class : Computer (desktop, notebook, PDA, organizer, ...)
     * Minor Device Class : Handheld PC/PDA (clamshell)
     */
    public static final int COMPUTER_HANDHELD_PC_PDA_MINOR_DEVICE_CLASS = 0b00000000_00000001_00010000;

    /**
     * Major Device Class : Computer (desktop, notebook, PDA, organizer, ...)
     * Minor Device Class : Palm-size PC/PDA
     */
    public static final int COMPUTER_PALM_SIZE_PC_PDA_MINOR_DEVICE_CLASS = 0b00000000_00000001_00010100;

    /**
     * Major Device Class : Computer (desktop, notebook, PDA, organizer, ...)
     * Minor Device Class : Wearable computer (watch size)
     */
    public static final int COMPUTER_WEARABLE_COMPUTER_MINOR_DEVICE_CLASS = 0b00000000_00000001_00011000;

    /**
     * Major Device Class : Computer (desktop, notebook, PDA, organizer, ...)
     * Minor Device Class : Tablet
     */
    public static final int COMPUTER_TABLET_MINOR_DEVICE_CLASS = 0b00000000_00000001_00011100;

    /**
     * Major Device Class : Phone (cellular, cordless, pay phone, modem, ...)
     * Minor Device Class : Uncategorized, code for device not assigned
     */
    public static final int PHONE_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000010_00000000;

    /**
     * Major Device Class : Phone (cellular, cordless, pay phone, modem, ...)
     * Minor Device Class : Cellular
     */
    public static final int PHONE_CELLULAR_MINOR_DEVICE_CLASS = 0b00000000_00000010_00000100;

    /**
     * Major Device Class : Phone (cellular, cordless, pay phone, modem, ...)
     * Minor Device Class : Cordless
     */
    public static final int PHONE_CORDLESS_MINOR_DEVICE_CLASS = 0b00000000_00000010_00001000;

    /**
     * Major Device Class : Phone (cellular, cordless, pay phone, modem, ...)
     * Minor Device Class : Smartphone
     */
    public static final int PHONE_SMARTPHONE_MINOR_DEVICE_CLASS = 0b00000000_00000010_00001100;

    /**
     * Major Device Class : Phone (cellular, cordless, pay phone, modem, ...)
     * Minor Device Class : Wired modem or voice gateway
     */
    public static final int PHONE_WIRED_MODEM_OR_VOICE_GATEWAY_MINOR_DEVICE_CLASS = 0b00000000_00000010_00010000;

    /**
     * Major Device Class : Phone (cellular, cordless, pay phone, modem, ...)
     * Minor Device Class : Common ISDN access
     */
    public static final int PHONE_COMMON_ISDN_ACCESS_MINOR_DEVICE_CLASS = 0b00000000_00000010_00010100;

    /**
     * Major Device Class : LAN/Network Access point
     * Minor Device Class : Fully available
     * Sub Minor : Uncategorized (use this value if no others apply)
     */
    public static final int LAN_NETWORK_ACCESS_POINT_FULLYAVAILABLE_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000011_00000000;

    /**
     * Major Device Class : LAN/Network Access point
     * Minor Device Class : 1% to 17% utilized
     * Sub Minor : Uncategorized (use this value if no others apply)
     */
    public static final int LAN_NETWORK_ACCESS_POINT_ONE_PERCENT_TO_SEVENTEEN_PERCENT_UTILIZED_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000011_00100000;

    /**
     * Major Device Class : LAN/Network Access point
     * Minor Device Class : 17% to 33% utilized
     * Sub Minor : Uncategorized (use this value if no others apply)
     */
    public static final int LAN_NETWORK_ACCESS_POINT_SEVENTEEN_PERCENT_TO_THIRTY_THREE_PERCENT_UTILIZED_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000011_01000000;

    /**
     * Major Device Class : LAN/Network Access point
     * Minor Device Class : 33% to 50% utilized
     * Sub Minor : Uncategorized (use this value if no others apply)
     */
    public static final int LAN_NETWORK_ACCESS_POINT_THIRTY_THREE_PERCENT_TO_FIFTY_PERCENT_UTILIZED_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000011_01100000;

    /**
     * Major Device Class : LAN/Network Access point
     * Minor Device Class : 50% to 67% utilized
     * Sub Minor : Uncategorized (use this value if no others apply)
     */
    public static final int LAN_NETWORK_ACCESS_POINT_FIFTY_PERCENT_TO_SIXTY_SEVEN_PERCENT_UTILIZED_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000011_10000000;

    /**
     * Major Device Class : LAN/Network Access point
     * Minor Device Class : 67% to 83% utilized
     * Sub Minor : Uncategorized (use this value if no others apply)
     */
    public static final int LAN_NETWORK_ACCESS_POINT_SIXTY_SEVEN_PERCENT_TO_EIGHTY_THREE_PERCENT_UTILIZED_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000011_10100000;

    /**
     * Major Device Class : LAN/Network Access point
     * Minor Device Class : 83% to 99% utilized
     * Sub Minor : Uncategorized (use this value if no others apply)
     */
    public static final int LAN_NETWORK_ACCESS_POINT_EIGHTY_THREE_PERCENT_TO_NINETY_NINE_PERCENT_UTILIZED_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000011_11000000;

    /**
     * Major Device Class : LAN/Network Access point
     * Minor Device Class : No service available
     * Sub Minor : Uncategorized (use this value if no others apply)
     */
    public static final int LAN_NETWORK_ACCESS_POINT_NO_SERVICE_AVAILABLE_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000011_11100000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Uncategorized, code not assigned
     */
    public static final int AUDIO_VIDEO_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000100_00000000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Wearable Headset Device
     */
    public static final int AUDIO_VIDEO_WEARABLE_HEADSET_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000100_00000100;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Hands-free Device
     */
    public static final int AUDIO_VIDEO_HANDS_FREE_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000100_00001000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : (Reserved)
     */
    public static final int AUDIO_VIDEO_RESERVED1036_MINOR_DEVICE_CLASS = 0b00000000_00000100_00001100;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Microphone
     */
    public static final int AUDIO_VIDEO_MICROPHONE_MINOR_DEVICE_CLASS = 0b00000000_00000100_00010000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Loudspeaker
     */
    public static final int AUDIO_VIDEO_LOUDSPEAKER_MINOR_DEVICE_CLASS = 0b00000000_00000100_00010100;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Headphones
     */
    public static final int AUDIO_VIDEO_HEADPHONES_MINOR_DEVICE_CLASS = 0b00000000_00000100_00011000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Portable Audio
     */
    public static final int AUDIO_VIDEO_PORTABLE_AUDIO_MINOR_DEVICE_CLASS = 0b00000000_00000100_00011100;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Car Audio
     */
    public static final int AUDIO_VIDEO_CAR_AUDIO_MINOR_DEVICE_CLASS = 0b00000000_00000100_00100000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Set-top box
     */
    public static final int AUDIO_VIDEO_SET_TOP_BOX_MINOR_DEVICE_CLASS = 0b00000000_00000100_00100100;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : HiFi Audio Device
     */
    public static final int AUDIO_VIDEO_HI_FI_AUDIO_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000100_00101000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : VCR
     */
    public static final int AUDIO_VIDEO_VCR_MINOR_DEVICE_CLASS = 0b00000000_00000100_00101100;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Video Camera
     */
    public static final int AUDIO_VIDEO_VIDEO_CAMERA_MINOR_DEVICE_CLASS = 0b00000000_00000100_00110000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Camcorder
     */
    public static final int AUDIO_VIDEO_CAMCORDER_MINOR_DEVICE_CLASS = 0b00000000_00000100_00110100;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Video Monitor
     */
    public static final int AUDIO_VIDEO_VIDEO_MONITOR_MINOR_DEVICE_CLASS = 0b00000000_00000100_00111000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Video Display and Loudspeaker
     */
    public static final int AUDIO_VIDEO_VIDEO_DISPLAY_AND_LOUDSPEAKER_MINOR_DEVICE_CLASS = 0b00000000_00000100_00111100;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Video Conferencing
     */
    public static final int AUDIO_VIDEO_VIDEO_CONFERENCING_MINOR_DEVICE_CLASS = 0b00000000_00000100_01000000;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : (Reserved)
     */
    public static final int AUDIO_VIDEO_RESERVED1092_MINOR_DEVICE_CLASS = 0b00000000_00000100_01000100;

    /**
     * Major Device Class : Audio/Video (headset, speaker, stereo, video display, VCR, ...)
     * Minor Device Class : Gaming/Toy
     */
    public static final int AUDIO_VIDEO_GAMING_TOY_MINOR_DEVICE_CLASS = 0b00000000_00000100_01001000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Uncategorized, code not assigned
     * Sub Minor : Uncategorized, code not assigned
     */
    public static final int PERIPHERAL_UNCATEGORIZED_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000101_00000000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Uncategorized, code not assigned
     * Sub Minor : Joystick
     */
    public static final int PERIPHERAL_UNCATEGORIZED_JOYSTICK_MINOR_DEVICE_CLASS = 0b00000000_00000101_00000100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Uncategorized, code not assigned
     * Sub Minor : Gamepad
     */
    public static final int PERIPHERAL_UNCATEGORIZED_GAMEPAD_MINOR_DEVICE_CLASS = 0b00000000_00000101_00001000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Uncategorized, code not assigned
     * Sub Minor : Remote control
     */
    public static final int PERIPHERAL_UNCATEGORIZED_REMOTE_CONTROL_MINOR_DEVICE_CLASS = 0b00000000_00000101_00001100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Uncategorized, code not assigned
     * Sub Minor : Sensing device
     */
    public static final int PERIPHERAL_UNCATEGORIZED_SENSING_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000101_00010000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Uncategorized, code not assigned
     * Sub Minor : Digitizer tablet
     */
    public static final int PERIPHERAL_UNCATEGORIZED_DIGITIZER_TABLET_MINOR_DEVICE_CLASS = 0b00000000_00000101_00010100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Uncategorized, code not assigned
     * Sub Minor : Card Reader (e.g. SIM Card Reader)
     */
    public static final int PERIPHERAL_UNCATEGORIZED_CARD_READER_MINOR_DEVICE_CLASS = 0b00000000_00000101_00011000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Uncategorized, code not assigned
     * Sub Minor : Digital Pen
     */
    public static final int PERIPHERAL_UNCATEGORIZED_DIGITAL_PEN_MINOR_DEVICE_CLASS = 0b00000000_00000101_00011100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Uncategorized, code not assigned
     * Sub Minor : Handheld scanner for barcodes, RFID, etc.
     */
    public static final int PERIPHERAL_UNCATEGORIZED_HANDHELD_SCANNER_FOR_BARCODES_RFID_MINOR_DEVICE_CLASS = 0b00000000_00000101_00100000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Uncategorized, code not assigned
     * Sub Minor : Handheld gestural input device (e.g., “wand” form factor)
     */
    public static final int PERIPHERAL_UNCATEGORIZED_HANDHELD_GESTURAL_INPUT_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000101_00100100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Keyboard
     * Sub Minor : Uncategorized, code not assigned
     */
    public static final int PERIPHERAL_KEYBOARD_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000101_01000000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Keyboard
     * Sub Minor : Joystick
     */
    public static final int PERIPHERAL_KEYBOARD_JOYSTICK_MINOR_DEVICE_CLASS = 0b00000000_00000101_01000100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Keyboard
     * Sub Minor : Gamepad
     */
    public static final int PERIPHERAL_KEYBOARD_GAMEPAD_MINOR_DEVICE_CLASS = 0b00000000_00000101_01001000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Keyboard
     * Sub Minor : Remote control
     */
    public static final int PERIPHERAL_KEYBOARD_REMOTE_CONTROL_MINOR_DEVICE_CLASS = 0b00000000_00000101_01001100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Keyboard
     * Sub Minor : Sensing device
     */
    public static final int PERIPHERAL_KEYBOARD_SENSING_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000101_01010000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Keyboard
     * Sub Minor : Digitizer tablet
     */
    public static final int PERIPHERAL_KEYBOARD_DIGITIZER_TABLET_MINOR_DEVICE_CLASS = 0b00000000_00000101_01010100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Keyboard
     * Sub Minor : Card Reader (e.g. SIM Card Reader)
     */
    public static final int PERIPHERAL_KEYBOARD_CARD_READER_MINOR_DEVICE_CLASS = 0b00000000_00000101_01011000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Keyboard
     * Sub Minor : Digital Pen
     */
    public static final int PERIPHERAL_KEYBOARD_DIGITAL_PEN_MINOR_DEVICE_CLASS = 0b00000000_00000101_01011100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Keyboard
     * Sub Minor : Handheld scanner for barcodes, RFID, etc.
     */
    public static final int PERIPHERAL_KEYBOARD_HANDHELD_SCANNER_FOR_BARCODES_RFID_MINOR_DEVICE_CLASS = 0b00000000_00000101_01100000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Keyboard
     * Sub Minor : Handheld gestural input device (e.g., “wand” form factor)
     */
    public static final int PERIPHERAL_KEYBOARD_HANDHELD_GESTURAL_INPUT_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000101_01100100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Pointing device
     * Sub Minor : Uncategorized, code not assigned
     */
    public static final int PERIPHERAL_POINTING_DEVICE_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000101_10000000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Pointing device
     * Sub Minor : Joystick
     */
    public static final int PERIPHERAL_POINTING_DEVICE_JOYSTICK_MINOR_DEVICE_CLASS = 0b00000000_00000101_10000100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Pointing device
     * Sub Minor : Gamepad
     */
    public static final int PERIPHERAL_POINTING_DEVICE_GAMEPAD_MINOR_DEVICE_CLASS = 0b00000000_00000101_10001000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Pointing device
     * Sub Minor : Remote control
     */
    public static final int PERIPHERAL_POINTING_DEVICE_REMOTE_CONTROL_MINOR_DEVICE_CLASS = 0b00000000_00000101_10001100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Pointing device
     * Sub Minor : Sensing device
     */
    public static final int PERIPHERAL_POINTING_DEVICE_SENSING_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000101_10010000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Pointing device
     * Sub Minor : Digitizer tablet
     */
    public static final int PERIPHERAL_POINTING_DEVICE_DIGITIZER_TABLET_MINOR_DEVICE_CLASS = 0b00000000_00000101_10010100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Pointing device
     * Sub Minor : Card Reader (e.g. SIM Card Reader)
     */
    public static final int PERIPHERAL_POINTING_DEVICE_CARD_READER_MINOR_DEVICE_CLASS = 0b00000000_00000101_10011000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Pointing device
     * Sub Minor : Digital Pen
     */
    public static final int PERIPHERAL_POINTING_DEVICE_DIGITAL_PEN_MINOR_DEVICE_CLASS = 0b00000000_00000101_10011100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Pointing device
     * Sub Minor : Handheld scanner for barcodes, RFID, etc.
     */
    public static final int PERIPHERAL_POINTING_DEVICE_HANDHELD_SCANNER_FOR_BARCODES_RFID_MINOR_DEVICE_CLASS = 0b00000000_00000101_10100000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Pointing device
     * Sub Minor : Handheld gestural input device (e.g., “wand” form factor)
     */
    public static final int PERIPHERAL_POINTING_DEVICE_HANDHELD_GESTURAL_INPUT_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000101_10100100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Combo Keyboard/Pointing device
     * Sub Minor : Uncategorized, code not assigned
     */
    public static final int PERIPHERAL_COMBO_KEYBOARD_POINTING_DEVICE_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000101_11000000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Combo Keyboard/Pointing device
     * Sub Minor : Joystick
     */
    public static final int PERIPHERAL_COMBO_KEYBOARD_POINTING_DEVICE_JOYSTICK_MINOR_DEVICE_CLASS = 0b00000000_00000101_11000100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Combo Keyboard/Pointing device
     * Sub Minor : Gamepad
     */
    public static final int PERIPHERAL_COMBO_KEYBOARD_POINTING_DEVICE_GAMEPAD_MINOR_DEVICE_CLASS = 0b00000000_00000101_11001000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Combo Keyboard/Pointing device
     * Sub Minor : Remote control
     */
    public static final int PERIPHERAL_COMBO_KEYBOARD_POINTING_DEVICE_REMOTE_CONTROL_MINOR_DEVICE_CLASS = 0b00000000_00000101_11001100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Combo Keyboard/Pointing device
     * Sub Minor : Sensing device
     */
    public static final int PERIPHERAL_COMBO_KEYBOARD_POINTING_DEVICE_SENSING_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000101_11010000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Combo Keyboard/Pointing device
     * Sub Minor : Digitizer tablet
     */
    public static final int PERIPHERAL_COMBO_KEYBOARD_POINTING_DEVICE_DIGITIZER_TABLET_MINOR_DEVICE_CLASS = 0b00000000_00000101_11010100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Combo Keyboard/Pointing device
     * Sub Minor : Card Reader (e.g. SIM Card Reader)
     */
    public static final int PERIPHERAL_COMBO_KEYBOARD_POINTING_DEVICE_CARD_READER_MINOR_DEVICE_CLASS = 0b00000000_00000101_11011000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Combo Keyboard/Pointing device
     * Sub Minor : Digital Pen
     */
    public static final int PERIPHERAL_COMBO_KEYBOARD_POINTING_DEVICE_DIGITAL_PEN_MINOR_DEVICE_CLASS = 0b00000000_00000101_11011100;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Combo Keyboard/Pointing device
     * Sub Minor : Handheld scanner for barcodes, RFID, etc.
     */
    public static final int PERIPHERAL_COMBO_KEYBOARD_POINTING_DEVICE_HANDHELD_SCANNER_FOR_BARCODES_RFID_MINOR_DEVICE_CLASS = 0b00000000_00000101_11100000;

    /**
     * Major Device Class : Peripheral (mouse, joystick, keyboard, ...)
     * Minor Device Class : Combo Keyboard/Pointing device
     * Sub Minor : Handheld gestural input device (e.g., “wand” form factor)
     */
    public static final int PERIPHERAL_COMBO_KEYBOARD_POINTING_DEVICE_HANDHELD_GESTURAL_INPUT_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00000101_11100100;

    /**
     * Major Device Class : Imaging (printer, scanner, camera, display, ...)
     * Minor Device Class : Display
     * Minor Bits : Uncategorized, default
     */
    public static final int IMAGING_DISPLAY_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000110_00010000;

    /**
     * Major Device Class : Imaging (printer, scanner, camera, display, ...)
     * Minor Device Class : Camera
     * Minor Bits : Uncategorized, default
     */
    public static final int IMAGING_CAMERA_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000110_00100000;

    /**
     * Major Device Class : Imaging (printer, scanner, camera, display, ...)
     * Minor Device Class : Scanner
     * Minor Bits : Uncategorized, default
     */
    public static final int IMAGING_SCANNER_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000110_01000000;

    /**
     * Major Device Class : Imaging (printer, scanner, camera, display, ...)
     * Minor Device Class : Printer
     * Minor Bits : Uncategorized, default
     */
    public static final int IMAGING_PRINTER_UNCATEGORIZED_MINOR_DEVICE_CLASS = 0b00000000_00000110_10000000;

    /**
     * Major Device Class : Wearable
     * Minor Device Class : Wristwatch
     */
    public static final int WEARABLE_WRISTWATCH_MINOR_DEVICE_CLASS = 0b00000000_00000111_00000100;

    /**
     * Major Device Class : Wearable
     * Minor Device Class : Pager
     */
    public static final int WEARABLE_PAGER_MINOR_DEVICE_CLASS = 0b00000000_00000111_00001000;

    /**
     * Major Device Class : Wearable
     * Minor Device Class : Jacket
     */
    public static final int WEARABLE_JACKET_MINOR_DEVICE_CLASS = 0b00000000_00000111_00001100;

    /**
     * Major Device Class : Wearable
     * Minor Device Class : Helmet
     */
    public static final int WEARABLE_HELMET_MINOR_DEVICE_CLASS = 0b00000000_00000111_00010000;

    /**
     * Major Device Class : Wearable
     * Minor Device Class : Glasses
     */
    public static final int WEARABLE_GLASSES_MINOR_DEVICE_CLASS = 0b00000000_00000111_00010100;

    /**
     * Major Device Class : Toy
     * Minor Device Class : Robot
     */
    public static final int TOY_ROBOT_MINOR_DEVICE_CLASS = 0b00000000_00001000_00000100;

    /**
     * Major Device Class : Toy
     * Minor Device Class : Vehicle
     */
    public static final int TOY_VEHICLE_MINOR_DEVICE_CLASS = 0b00000000_00001000_00001000;

    /**
     * Major Device Class : Toy
     * Minor Device Class : Doll/Action figure
     */
    public static final int TOY_DOLL_ACTION_FIGURE_MINOR_DEVICE_CLASS = 0b00000000_00001000_00001100;

    /**
     * Major Device Class : Toy
     * Minor Device Class : Controller
     */
    public static final int TOY_CONTROLLER_MINOR_DEVICE_CLASS = 0b00000000_00001000_00010000;

    /**
     * Major Device Class : Toy
     * Minor Device Class : Game
     */
    public static final int TOY_GAME_MINOR_DEVICE_CLASS = 0b00000000_00001000_00010100;

    /**
     * Major Device Class : Health
     * Minor Device Class : Undefined
     */
    public static final int HEALTH_UNDEFINED_MINOR_DEVICE_CLASS = 0b00000000_00001001_00000000;

    /**
     * Major Device Class : Health
     * Minor Device Class : Blood Pressure Monitor
     */
    public static final int HEALTH_BLOOD_PRESSURE_MONITOR_MINOR_DEVICE_CLASS = 0b00000000_00001001_00000100;

    /**
     * Major Device Class : Health
     * Minor Device Class : Thermometer
     */
    public static final int HEALTH_THERMOMETER_MINOR_DEVICE_CLASS = 0b00000000_00001001_00001000;

    /**
     * Major Device Class : Health
     * Minor Device Class : Weighing Scale
     */
    public static final int HEALTH_WEIGHING_SCALE_MINOR_DEVICE_CLASS = 0b00000000_00001001_00001100;

    /**
     * Major Device Class : Health
     * Minor Device Class : Glucose Meter
     */
    public static final int HEALTH_GLUCOSE_METER_MINOR_DEVICE_CLASS = 0b00000000_00001001_00010000;

    /**
     * Major Device Class : Health
     * Minor Device Class : Pulse Oximeter
     */
    public static final int HEALTH_PULSE_OXIMETER_MINOR_DEVICE_CLASS = 0b00000000_00001001_00010100;

    /**
     * Major Device Class : Health
     * Minor Device Class : Heart/Pulse Rate Monitor
     */
    public static final int HEALTH_HEART_PULSE_RATE_MONITOR_MINOR_DEVICE_CLASS = 0b00000000_00001001_00011000;

    /**
     * Major Device Class : Health
     * Minor Device Class : Health Data Display
     */
    public static final int HEALTH_HEALTH_DATA_DISPLAY_MINOR_DEVICE_CLASS = 0b00000000_00001001_00011100;

    /**
     * Major Device Class : Health
     * Minor Device Class : Step Counter
     */
    public static final int HEALTH_STEP_COUNTER_MINOR_DEVICE_CLASS = 0b00000000_00001001_00100000;

    /**
     * Major Device Class : Health
     * Minor Device Class : Body Composition Analyzer
     */
    public static final int HEALTH_BODY_COMPOSITION_ANALYZER_MINOR_DEVICE_CLASS = 0b00000000_00001001_00100100;

    /**
     * Major Device Class : Health
     * Minor Device Class : Peak Flow Monitor
     */
    public static final int HEALTH_PEAK_FLOW_MONITOR_MINOR_DEVICE_CLASS = 0b00000000_00001001_00101000;

    /**
     * Major Device Class : Health
     * Minor Device Class : Medication Monitor
     */
    public static final int HEALTH_MEDICATION_MONITOR_MINOR_DEVICE_CLASS = 0b00000000_00001001_00101100;

    /**
     * Major Device Class : Health
     * Minor Device Class : Knee Prosthesis
     */
    public static final int HEALTH_KNEE_PROSTHESIS_MINOR_DEVICE_CLASS = 0b00000000_00001001_00110000;

    /**
     * Major Device Class : Health
     * Minor Device Class : Ankle Prosthesis
     */
    public static final int HEALTH_ANKLE_PROSTHESIS_MINOR_DEVICE_CLASS = 0b00000000_00001001_00110100;

    /**
     * Major Device Class : Health
     * Minor Device Class : Generic Health Manager
     */
    public static final int HEALTH_GENERIC_HEALTH_MANAGER_MINOR_DEVICE_CLASS = 0b00000000_00001001_00111000;

    /**
     * Major Device Class : Health
     * Minor Device Class : Personal Mobility Device
     */
    public static final int HEALTH_PERSONAL_MOBILITY_DEVICE_MINOR_DEVICE_CLASS = 0b00000000_00001001_00111100;

}