package org.im97mori.ble;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE Constants
 */
public class BLEConstants {

    /**
     * <p>
     * BASE UUID
     * <p>
     * Core Specification v5.1 Vol 3 Part B 2.5.1
     * </p>
     */
    public static final UUID BASE_UUID = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /**
     * <p>
     * Appearance value
     * <p>
     * https://www.bluetooth.com/wp-content/uploads/Sitecore-Media-Library/Gatt/Xml/Characteristics/org.bluetooth.characteristic.gap.appearance.xml
     * </p>
     */
    public static final Map<Integer, String> APPEARANCE_VALUE_MAP;

    /**
     * <p>
     * Appearance description
     * <p>
     * https://www.bluetooth.com/wp-content/uploads/Sitecore-Media-Library/Gatt/Xml/Characteristics/org.bluetooth.characteristic.gap.appearance.xml
     * </p>
     */
    public static final Map<Integer, String> APPEARANCE_DESCRIPTION_MAP;

    static {
        Map<Integer, String> map = new HashMap<>();
        map.put(0x0, "Unknown");
        map.put(0x64, "Generic Phone");
        map.put(0x128, "Generic Computer");
        map.put(0x192, "Generic Watch");
        map.put(0x193, "Watch: Sports Watch");
        map.put(0x256, "Generic Clock");
        map.put(0x320, "Generic Display");
        map.put(0x384, "Generic Remote Control");
        map.put(0x448, "Generic Eye-glasses");
        map.put(0x512, "Generic Tag");
        map.put(0x576, "Generic Keyring");
        map.put(0x640, "Generic Media Player");
        map.put(0x704, "Generic Barcode Scanner");
        map.put(0x768, "Generic Thermometer");
        map.put(0x769, "Thermometer: Ear");
        map.put(0x832, "Generic Heart rate Sensor");
        map.put(0x833, "Heart Rate Sensor: Heart Rate Belt");
        map.put(0x896, "Generic Blood Pressure");
        map.put(0x897, "Blood Pressure: Arm");
        map.put(0x898, "Blood Pressure: Wrist");
        map.put(0x960, "Human Interface Device (HID)");
        map.put(0x961, "Keyboard");
        map.put(0x962, "Mouse");
        map.put(0x963, "Joystick");
        map.put(0x964, "Gamepad");
        map.put(0x965, "Digitizer Tablet");
        map.put(0x966, "Card Reader");
        map.put(0x967, "Digital Pen");
        map.put(0x968, "Barcode Scanner");
        map.put(0x1024, "Generic Glucose Meter");
        map.put(0x1088, "Generic: Running Walking Sensor");
        map.put(0x1089, "Running Walking Sensor: In-Shoe");
        map.put(0x1090, "Running Walking Sensor: On-Shoe");
        map.put(0x1091, "Running Walking Sensor: On-Hip");
        map.put(0x1152, "Generic: Cycling");
        map.put(0x1153, "Cycling: Cycling Computer");
        map.put(0x1154, "Cycling: Speed Sensor");
        map.put(0x1155, "Cycling: Cadence Sensor");
        map.put(0x1156, "Cycling: Power Sensor");
        map.put(0x1157, "Cycling: Speed and Cadence Sensor");
        map.put(0x3136, "Generic: Pulse Oximeter");
        map.put(0x3137, "Fingertip");
        map.put(0x3138, "Wrist Worn");
        map.put(0x3200, "Generic: Weight Scale");
        map.put(0x3264, "Generic Personal Mobility Device");
        map.put(0x3265, "Powered Wheelchair");
        map.put(0x3266, "Mobility Scooter");
        map.put(0x3328, "Generic Continuous Glucose Monitor");
        map.put(0x3392, "Generic Insulin Pump");
        map.put(0x3393, "Insulin Pump, durable pump");
        map.put(0x3396, "Insulin Pump, patch pump");
        map.put(0x3400, "Insulin Pen");
        map.put(0x3456, "Generic Medication Delivery");
        map.put(0x5184, "Generic: Outdoor Sports Activity");
        map.put(0x5185, "Location Display Device");
        map.put(0x5186, "Location and Navigation Display Device");
        map.put(0x5187, "Location Pod");
        map.put(0x5188, "Location and Navigation Pod");
        APPEARANCE_VALUE_MAP = Collections.synchronizedMap(Collections.unmodifiableMap(map));

        map = new HashMap<>();
        map.put(0x0, "Unknown");
        map.put(0x64, "Generic Phone");
        map.put(0x128, "Generic Computer");
        map.put(0x192, "Generic Watch");
        map.put(0x193, "Watch: Sports Watch");
        map.put(0x256, "Generic Clock");
        map.put(0x320, "Generic Display");
        map.put(0x384, "Generic Remote Control");
        map.put(0x448, "Generic Eye-glasses");
        map.put(0x512, "Generic Tag");
        map.put(0x576, "Generic Keyring");
        map.put(0x640, "Generic Media Player");
        map.put(0x704, "Generic Barcode Scanner");
        map.put(0x768, "Generic Thermometer");
        map.put(0x769, "Thermometer: Ear");
        map.put(0x832, "Generic Heart rate Sensor");
        map.put(0x833, "Heart Rate Sensor: Heart Rate Belt");
        map.put(0x896, "Generic Blood Pressure");
        map.put(0x897, "Blood Pressure: Arm");
        map.put(0x898, "Blood Pressure: Wrist");
        map.put(0x960, "Human Interface Device (HID)");
        map.put(0x961, "Keyboard");
        map.put(0x962, "Mouse");
        map.put(0x963, "Joystick");
        map.put(0x964, "Gamepad");
        map.put(0x965, "Digitizer Tablet");
        map.put(0x966, "Card Reader");
        map.put(0x967, "Digital Pen");
        map.put(0x968, "Barcode Scanner");
        map.put(0x1024, "Generic Glucose Meter");
        map.put(0x1088, "Generic: Running Walking Sensor");
        map.put(0x1089, "Running Walking Sensor: In-Shoe");
        map.put(0x1090, "Running Walking Sensor: On-Shoe");
        map.put(0x1091, "Running Walking Sensor: On-Hip");
        map.put(0x1152, "Generic: Cycling");
        map.put(0x1153, "Cycling: Cycling Computer");
        map.put(0x1154, "Cycling: Speed Sensor");
        map.put(0x1155, "Cycling: Cadence Sensor");
        map.put(0x1156, "Cycling: Power Sensor");
        map.put(0x1157, "Cycling: Speed and Cadence Sensor");
        map.put(0x3136, "Generic: Pulse Oximeter");
        map.put(0x3137, "Fingertip");
        map.put(0x3138, "Wrist Worn");
        map.put(0x3200, "Generic: Weight Scale");
        map.put(0x3264, "Generic Personal Mobility Device");
        map.put(0x3265, "Powered Wheelchair");
        map.put(0x3266, "Mobility Scooter");
        map.put(0x3328, "Generic Continuous Glucose Monitor");
        map.put(0x3392, "Generic Insulin Pump");
        map.put(0x3393, "Insulin Pump, durable pump");
        map.put(0x3396, "Insulin Pump, patch pump");
        map.put(0x3400, "Insulin Pen");
        map.put(0x3456, "Generic Medication Delivery");
        map.put(0x5184, "Generic: Outdoor Sports Activity");
        map.put(0x5185, "Location Display Device");
        map.put(0x5186, "Location and Navigation Display Device");
        map.put(0x5187, "Location Pod");
        map.put(0x5188, "Location and Navigation Pod");
        APPEARANCE_DESCRIPTION_MAP = Collections.synchronizedMap(Collections.unmodifiableMap(map));
    }

    /**
     * https://www.bluetooth.com/specifications/assigned-numbers/uri-scheme-name-string-mapping/
     */
    public static final Map<Integer, String> URI_SCHEME_NAME_STRING_MAPPING;

    static {
        Map<Integer, String> map = new HashMap<>();
        map.put(0x000001, "");
        map.put(0x000002, "aaa:");
        map.put(0x000003, "aaas:");
        map.put(0x000004, "about:");
        map.put(0x000005, "acap:");
        map.put(0x000006, "acct:");
        map.put(0x000007, "cap:");
        map.put(0x000008, "cid:");
        map.put(0x000009, "coap:");
        map.put(0x00000A, "coaps:");
        map.put(0x00000B, "crid:");
        map.put(0x00000C, "data:");
        map.put(0x00000D, "dav:");
        map.put(0x00000E, "dict:");
        map.put(0x00000F, "dns:");
        map.put(0x000010, "file:");
        map.put(0x000011, "ftp:");
        map.put(0x000012, "geo:");
        map.put(0x000013, "go:");
        map.put(0x000014, "gopher:");
        map.put(0x000015, "h323:");
        map.put(0x000016, "http:");
        map.put(0x000017, "https:");
        map.put(0x000018, "iax:");
        map.put(0x000019, "icap:");
        map.put(0x00001A, "im:");
        map.put(0x00001B, "imap:");
        map.put(0x00001C, "info:");
        map.put(0x00001D, "ipp:");
        map.put(0x00001E, "ipps:");
        map.put(0x00001F, "iris:");
        map.put(0x000020, "iris.beep:");
        map.put(0x000021, "iris.xpc:");
        map.put(0x000022, "iris.xpcs:");
        map.put(0x000023, "iris.lwz:");
        map.put(0x000024, "jabber:");
        map.put(0x000025, "ldap:");
        map.put(0x000026, "mailto:");
        map.put(0x000027, "mid:");
        map.put(0x000028, "msrp:");
        map.put(0x000029, "msrps:");
        map.put(0x00002A, "mtqp:");
        map.put(0x00002B, "mupdate:");
        map.put(0x00002C, "news:");
        map.put(0x00002D, "nfs:");
        map.put(0x00002E, "ni:");
        map.put(0x00002F, "nih:");
        map.put(0x000030, "nntp:");
        map.put(0x000031, "opaquelocktoken:");
        map.put(0x000032, "pop:");
        map.put(0x000033, "pres:");
        map.put(0x000034, "reload:");
        map.put(0x000035, "rtsp:");
        map.put(0x000036, "rtsps:");
        map.put(0x000037, "rtspu:");
        map.put(0x000038, "service:");
        map.put(0x000039, "session:");
        map.put(0x00003A, "shttp:");
        map.put(0x00003B, "sieve:");
        map.put(0x00003C, "sip:");
        map.put(0x00003D, "sips:");
        map.put(0x00003E, "sms:");
        map.put(0x00003F, "snmp:");
        map.put(0x000040, "soap.beep:");
        map.put(0x000041, "soap.beeps:");
        map.put(0x000042, "stun:");
        map.put(0x000043, "stuns:");
        map.put(0x000044, "tag:");
        map.put(0x000045, "tel:");
        map.put(0x000046, "telnet:");
        map.put(0x000047, "tftp:");
        map.put(0x000048, "thismessage:");
        map.put(0x000049, "tn3270:");
        map.put(0x00004A, "tip:");
        map.put(0x00004B, "turn:");
        map.put(0x00004C, "turns:");
        map.put(0x00004D, "tv:");
        map.put(0x00004E, "urn:");
        map.put(0x00004F, "vemmi:");
        map.put(0x000050, "ws:");
        map.put(0x000051, "wss:");
        map.put(0x000052, "xcon:");
        map.put(0x000053, "xcon-userid:");
        map.put(0x000054, "xmlrpc.beep:");
        map.put(0x000055, "xmlrpc.beeps:");
        map.put(0x000056, "xmpp:");
        map.put(0x000057, "z39.50r:");
        map.put(0x000058, "z39.50s:");
        map.put(0x000059, "acr:");
        map.put(0x00005A, "adiumxtra:");
        map.put(0x00005B, "afp:");
        map.put(0x00005C, "afs:");
        map.put(0x00005D, "aim:");
        map.put(0x00005E, "apt:");
        map.put(0x00005F, "attachment:");
        map.put(0x000060, "aw:");
        map.put(0x000061, "barion:");
        map.put(0x000062, "beshare:");
        map.put(0x000063, "bitcoin:");
        map.put(0x000064, "bolo:");
        map.put(0x000065, "callto:");
        map.put(0x000066, "chrome:");
        map.put(0x000067, "chrome-extension:");
        map.put(0x000068, "com-eventbrite-attendee:");
        map.put(0x000069, "content:");
        map.put(0x00006A, "cvs:");
        map.put(0x00006B, "dlna-playsingle:");
        map.put(0x00006C, "dlna-playcontainer:");
        map.put(0x00006D, "dtn:");
        map.put(0x00006E, "dvb:");
        map.put(0x00006F, "ed2k:");
        map.put(0x000070, "facetime:");
        map.put(0x000071, "feed:");
        map.put(0x000072, "feedready:");
        map.put(0x000073, "finger:");
        map.put(0x000074, "fish:");
        map.put(0x000075, "gg:");
        map.put(0x000076, "git:");
        map.put(0x000077, "gizmoproject:");
        map.put(0x000078, "gtalk:");
        map.put(0x000079, "ham:");
        map.put(0x00007A, "hcp:");
        map.put(0x00007B, "icon:");
        map.put(0x00007C, "ipn:");
        map.put(0x00007D, "irc:");
        map.put(0x00007E, "irc6:");
        map.put(0x00007F, "ircs:");
        map.put(0x000080, "itms:");
        map.put(0x000081, "jar:");
        map.put(0x000082, "jms:");
        map.put(0x000083, "keyparc:");
        map.put(0x000084, "lastfm:");
        map.put(0x000085, "ldaps:");
        map.put(0x000086, "magnet:");
        map.put(0x000087, "maps:");
        map.put(0x000088, "market:");
        map.put(0x000089, "message:");
        map.put(0x00008A, "mms:");
        map.put(0x00008B, "ms-help:");
        map.put(0x00008C, "ms-settings-power:");
        map.put(0x00008D, "msnim:");
        map.put(0x00008E, "mumble:");
        map.put(0x00008F, "mvn:");
        map.put(0x000090, "notes:");
        map.put(0x000091, "oid:");
        map.put(0x000092, "palm:");
        map.put(0x000093, "paparazzi:");
        map.put(0x000094, "pkcs11:");
        map.put(0x000095, "platform:");
        map.put(0x000096, "proxy:");
        map.put(0x000097, "psyc:");
        map.put(0x000098, "query:");
        map.put(0x000099, "res:");
        map.put(0x00009A, "resource:");
        map.put(0x00009B, "rmi:");
        map.put(0x00009C, "rsync:");
        map.put(0x00009D, "rtmfp:");
        map.put(0x00009E, "rtmp:");
        map.put(0x00009F, "secondlife:");
        map.put(0x0000A0, "sftp:");
        map.put(0x0000A1, "sgn:");
        map.put(0x0000A2, "skype:");
        map.put(0x0000A3, "smb:");
        map.put(0x0000A4, "smtp:");
        map.put(0x0000A5, "soldat:");
        map.put(0x0000A6, "spotify:");
        map.put(0x0000A7, "ssh:");
        map.put(0x0000A8, "steam:");
        map.put(0x0000A9, "submit:");
        map.put(0x0000AA, "svn:");
        map.put(0x0000AB, "teamspeak:");
        map.put(0x0000AC, "teliaeid:");
        map.put(0x0000AD, "things:");
        map.put(0x0000AE, "udp:");
        map.put(0x0000AF, "unreal:");
        map.put(0x0000B0, "ut2004:");
        map.put(0x0000B1, "ventrilo:");
        map.put(0x0000B2, "view-source:");
        map.put(0x0000B3, "webcal:");
        map.put(0x0000B4, "wtai:");
        map.put(0x0000B5, "wyciwyg:");
        map.put(0x0000B6, "xfire:");
        map.put(0x0000B7, "xri:");
        map.put(0x0000B8, "ymsgr:");
        map.put(0x0000B9, "example:");
        map.put(0x0000BA, "ms-settings-cloudstorage:");

        URI_SCHEME_NAME_STRING_MAPPING = Collections.synchronizedMap(Collections.unmodifiableMap(map));
    }

    /**
     * <p>
     * https://www.bluetooth.com/specifications/assigned-numbers/company-identifiers/
     * <p>
     * key:Company Identifier Code, value:Company Name
     * </p>
     */
    public static final Map<Integer, String> COMPANY_MAPPING;

    static {
        Map<Integer, String> map = new HashMap<>();
        map.put(0x00000000, "Ericsson Technology Licensing");
        map.put(0x00000001, "Nokia Mobile Phones");
        map.put(0x00000002, "Intel Corp.");
        map.put(0x00000003, "IBM Corp.");
        map.put(0x00000004, "Toshiba Corp.");
        map.put(0x00000005, "3Com");
        map.put(0x00000006, "Microsoft");
        map.put(0x00000007, "Lucent");
        map.put(0x00000008, "Motorola");
        map.put(0x00000009, "Infineon Technologies AG");
        map.put(0x0000000A, "Qualcomm Technologies International, Ltd. (QTIL)");
        map.put(0x0000000B, "Silicon Wave");
        map.put(0x0000000C, "Digianswer A/S");
        map.put(0x0000000D, "Texas Instruments Inc.");
        map.put(0x0000000E, "Parthus Technologies Inc.");
        map.put(0x0000000F, "Broadcom Corporation");
        map.put(0x00000010, "Mitel Semiconductor");
        map.put(0x00000011, "Widcomm, Inc.");
        map.put(0x00000012, "Zeevo, Inc.");
        map.put(0x00000013, "Atmel Corporation");
        map.put(0x00000014, "Mitsubishi Electric Corporation");
        map.put(0x00000015, "RTX Telecom A/S");
        map.put(0x00000016, "KC Technology Inc.");
        map.put(0x00000017, "Newlogic");
        map.put(0x00000018, "Transilica, Inc.");
        map.put(0x00000019, "Rohde & Schwarz GmbH & Co. KG");
        map.put(0x0000001A, "TTPCom Limited");
        map.put(0x0000001B, "Signia Technologies, Inc.");
        map.put(0x0000001C, "Conexant Systems Inc.");
        map.put(0x0000001D, "Qualcomm");
        map.put(0x0000001E, "Inventel");
        map.put(0x0000001F, "AVM Berlin");
        map.put(0x00000020, "BandSpeed, Inc.");
        map.put(0x00000021, "Mansella Ltd");
        map.put(0x00000022, "NEC Corporation");
        map.put(0x00000023, "WavePlus Technology Co., Ltd.");
        map.put(0x00000024, "Alcatel");
        map.put(0x00000025, "NXP Semiconductors (formerly Philips Semiconductors)");
        map.put(0x00000026, "C Technologies");
        map.put(0x00000027, "Open Interface");
        map.put(0x00000028, "R F Micro Devices");
        map.put(0x00000029, "Hitachi Ltd");
        map.put(0x0000002A, "Symbol Technologies, Inc.");
        map.put(0x0000002B, "Tenovis");
        map.put(0x0000002C, "Macronix International Co. Ltd.");
        map.put(0x0000002D, "GCT Semiconductor");
        map.put(0x0000002E, "Norwood Systems");
        map.put(0x0000002F, "MewTel Technology Inc.");
        map.put(0x00000030, "ST Microelectronics");
        map.put(0x00000031, "Synopsys, Inc.");
        map.put(0x00000032, "Red-M (Communications) Ltd");
        map.put(0x00000033, "Commil Ltd");
        map.put(0x00000034, "Computer Access Technology Corporation (CATC)");
        map.put(0x00000035, "Eclipse (HQ Espana) S.L.");
        map.put(0x00000036, "Renesas Electronics Corporation");
        map.put(0x00000037, "Mobilian Corporation");
        map.put(0x00000038, "Syntronix Corporation");
        map.put(0x00000039, "Integrated System Solution Corp.");
        map.put(0x0000003A, "Panasonic Corporation (formerly Matsushita Electric Industrial Co., Ltd.)");
        map.put(0x0000003B, "Gennum Corporation");
        map.put(0x0000003C, "BlackBerry Limited (formerly Research In Motion)");
        map.put(0x0000003D, "IPextreme, Inc.");
        map.put(0x0000003E, "Systems and Chips, Inc");
        map.put(0x0000003F, "Bluetooth SIG, Inc");
        map.put(0x00000040, "Seiko Epson Corporation");
        map.put(0x00000041, "Integrated Silicon Solution Taiwan, Inc.");
        map.put(0x00000042, "CONWISE Technology Corporation Ltd");
        map.put(0x00000043, "PARROT AUTOMOTIVE SAS");
        map.put(0x00000044, "Socket Mobile");
        map.put(0x00000045, "Atheros Communications, Inc.");
        map.put(0x00000046, "MediaTek, Inc.");
        map.put(0x00000047, "Bluegiga");
        map.put(0x00000048, "Marvell Technology Group Ltd.");
        map.put(0x00000049, "3DSP Corporation");
        map.put(0x0000004A, "Accel Semiconductor Ltd.");
        map.put(0x0000004B, "Continental Automotive Systems");
        map.put(0x0000004C, "Apple, Inc.");
        map.put(0x0000004D, "Staccato Communications, Inc.");
        map.put(0x0000004E, "Avago Technologies");
        map.put(0x0000004F, "APT Ltd.");
        map.put(0x00000050, "SiRF Technology, Inc.");
        map.put(0x00000051, "Tzero Technologies, Inc.");
        map.put(0x00000052, "J&M Corporation");
        map.put(0x00000053, "Free2move AB");
        map.put(0x00000054, "3DiJoy Corporation");
        map.put(0x00000055, "Plantronics, Inc.");
        map.put(0x00000056, "Sony Ericsson Mobile Communications");
        map.put(0x00000057, "Harman International Industries, Inc.");
        map.put(0x00000058, "Vizio, Inc.");
        map.put(0x00000059, "Nordic Semiconductor ASA");
        map.put(0x0000005A, "EM Microelectronic-Marin SA");
        map.put(0x0000005B, "Ralink Technology Corporation");
        map.put(0x0000005C, "Belkin International, Inc.");
        map.put(0x0000005D, "Realtek Semiconductor Corporation");
        map.put(0x0000005E, "Stonestreet One, LLC");
        map.put(0x0000005F, "Wicentric, Inc.");
        map.put(0x00000060, "RivieraWaves S.A.S");
        map.put(0x00000061, "RDA Microelectronics");
        map.put(0x00000062, "Gibson Guitars");
        map.put(0x00000063, "MiCommand Inc.");
        map.put(0x00000064, "Band XI International, LLC");
        map.put(0x00000065, "Hewlett-Packard Company");
        map.put(0x00000066, "9Solutions Oy");
        map.put(0x00000067, "GN Netcom A/S");
        map.put(0x00000068, "General Motors");
        map.put(0x00000069, "A&D Engineering, Inc.");
        map.put(0x0000006A, "MindTree Ltd.");
        map.put(0x0000006B, "Polar Electro OY");
        map.put(0x0000006C, "Beautiful Enterprise Co., Ltd.");
        map.put(0x0000006D, "BriarTek, Inc");
        map.put(0x0000006E, "Summit Data Communications, Inc.");
        map.put(0x0000006F, "Sound ID");
        map.put(0x00000070, "Monster, LLC");
        map.put(0x00000071, "connectBlue AB");
        map.put(0x00000072, "ShangHai Super Smart Electronics Co. Ltd.");
        map.put(0x00000073, "Group Sense Ltd.");
        map.put(0x00000074, "Zomm, LLC");
        map.put(0x00000075, "Samsung Electronics Co. Ltd.");
        map.put(0x00000076, "Creative Technology Ltd.");
        map.put(0x00000077, "Laird Technologies");
        map.put(0x00000078, "Nike, Inc.");
        map.put(0x00000079, "lesswire AG");
        map.put(0x0000007A, "MStar Semiconductor, Inc.");
        map.put(0x0000007B, "Hanlynn Technologies");
        map.put(0x0000007C, "A & R Cambridge");
        map.put(0x0000007D, "Seers Technology Co., Ltd.");
        map.put(0x0000007E, "Sports Tracking Technologies Ltd.");
        map.put(0x0000007F, "Autonet Mobile");
        map.put(0x00000080, "DeLorme Publishing Company, Inc.");
        map.put(0x00000081, "WuXi Vimicro");
        map.put(0x00000082, "Sennheiser Communications A/S");
        map.put(0x00000083, "TimeKeeping Systems, Inc.");
        map.put(0x00000084, "Ludus Helsinki Ltd.");
        map.put(0x00000085, "BlueRadios, Inc.");
        map.put(0x00000086, "Equinux AG");
        map.put(0x00000087, "Garmin International, Inc.");
        map.put(0x00000088, "Ecotest");
        map.put(0x00000089, "GN ReSound A/S");
        map.put(0x0000008A, "Jawbone");
        map.put(0x0000008B, "Topcon Positioning Systems, LLC");
        map.put(0x0000008C, "Gimbal Inc. (formerly Qualcomm Labs, Inc. and Qualcomm Retail Solutions, Inc.)");
        map.put(0x0000008D, "Zscan Software");
        map.put(0x0000008E, "Quintic Corp");
        map.put(0x0000008F, "Telit Wireless Solutions GmbH (formerly Stollmann E+V GmbH)");
        map.put(0x00000090, "Funai Electric Co., Ltd.");
        map.put(0x00000091, "Advanced PANMOBIL systems GmbH & Co. KG");
        map.put(0x00000092, "ThinkOptics, Inc.");
        map.put(0x00000093, "Universal Electronics, Inc.");
        map.put(0x00000094, "Airoha Technology Corp.");
        map.put(0x00000095, "NEC Lighting, Ltd.");
        map.put(0x00000096, "ODM Technology, Inc.");
        map.put(0x00000097, "ConnecteDevice Ltd.");
        map.put(0x00000098, "zero1.tv GmbH");
        map.put(0x00000099, "i.Tech Dynamic Global Distribution Ltd.");
        map.put(0x0000009A, "Alpwise");
        map.put(0x0000009B, "Jiangsu Toppower Automotive Electronics Co., Ltd.");
        map.put(0x0000009C, "Colorfy, Inc.");
        map.put(0x0000009D, "Geoforce Inc.");
        map.put(0x0000009E, "Bose Corporation");
        map.put(0x0000009F, "Suunto Oy");
        map.put(0x000000A0, "Kensington Computer Products Group");
        map.put(0x000000A1, "SR-Medizinelektronik");
        map.put(0x000000A2, "Vertu Corporation Limited");
        map.put(0x000000A3, "Meta Watch Ltd.");
        map.put(0x000000A4, "LINAK A/S");
        map.put(0x000000A5, "OTL Dynamics LLC");
        map.put(0x000000A6, "Panda Ocean Inc.");
        map.put(0x000000A7, "Visteon Corporation");
        map.put(0x000000A8, "ARP Devices Limited");
        map.put(0x000000A9, "Magneti Marelli S.p.A");
        map.put(0x000000AA, "CAEN RFID srl");
        map.put(0x000000AB, "Ingenieur-Systemgruppe Zahn GmbH");
        map.put(0x000000AC, "Green Throttle Games");
        map.put(0x000000AD, "Peter Systemtechnik GmbH");
        map.put(0x000000AE, "Omegawave Oy");
        map.put(0x000000AF, "Cinetix");
        map.put(0x000000B0, "Passif Semiconductor Corp");
        map.put(0x000000B1, "Saris Cycling Group, Inc");
        map.put(0x000000B2, "?Bekey A/S");
        map.put(0x000000B3, "?Clarinox Technologies Pty. Ltd.");
        map.put(0x000000B4, "?BDE Technology Co., Ltd.");
        map.put(0x000000B5, "Swirl Networks");
        map.put(0x000000B6, "?Meso international");
        map.put(0x000000B7, "?TreLab Ltd");
        map.put(0x000000B8, "?Qualcomm Innovation Center, Inc. (QuIC)");
        map.put(0x000000B9, "??Johnson Controls, Inc.");
        map.put(0x000000BA, "?Starkey Laboratories Inc.");
        map.put(0x000000BB, "??S-Power Electronics Limited");
        map.put(0x000000BC, "??Ace Sensor Inc");
        map.put(0x000000BD, "??Aplix Corporation");
        map.put(0x000000BE, "??AAMP of America");
        map.put(0x000000BF, "??Stalmart Technology Limited");
        map.put(0x000000C0, "??AMICCOM Electronics Corporation");
        map.put(0x000000C1, "??Shenzhen Excelsecu Data Technology Co.,Ltd");
        map.put(0x000000C2, "??Geneq Inc.");
        map.put(0x000000C3, "??adidas AG");
        map.put(0x000000C4, "??LG Electronics?");
        map.put(0x000000C5, "?Onset Computer Corporation");
        map.put(0x000000C6, "?Selfly BV");
        map.put(0x000000C7, "?Quuppa Oy.");
        map.put(0x000000C8, "GeLo Inc");
        map.put(0x000000C9, "Evluma");
        map.put(0x000000CA, "MC10");
        map.put(0x000000CB, "Binauric SE");
        map.put(0x000000CC, "Beats Electronics");
        map.put(0x000000CD, "Microchip Technology Inc.");
        map.put(0x000000CE, "Elgato Systems GmbH");
        map.put(0x000000CF, "ARCHOS SA");
        map.put(0x000000D0, "Dexcom, Inc.");
        map.put(0x000000D1, "Polar Electro Europe B.V.");
        map.put(0x000000D2, "Dialog Semiconductor B.V.");
        map.put(0x000000D3, "Taixingbang Technology (HK) Co,. LTD.");
        map.put(0x000000D4, "Kawantech");
        map.put(0x000000D5, "Austco Communication Systems");
        map.put(0x000000D6, "Timex Group USA, Inc.");
        map.put(0x000000D7, "Qualcomm Technologies, Inc.");
        map.put(0x000000D8, "Qualcomm Connected Experiences, Inc.");
        map.put(0x000000D9, "Voyetra Turtle Beach");
        map.put(0x000000DA, "txtr GmbH");
        map.put(0x000000DB, "Biosentronics");
        map.put(0x000000DC, "Procter & Gamble");
        map.put(0x000000DD, "Hosiden Corporation");
        map.put(0x000000DE, "Muzik LLC");
        map.put(0x000000DF, "Misfit Wearables Corp");
        map.put(0x000000E0, "Google");
        map.put(0x000000E1, "Danlers Ltd");
        map.put(0x000000E2, "Semilink Inc");
        map.put(0x000000E3, "inMusic Brands, Inc");
        map.put(0x000000E4, "L.S. Research Inc.");
        map.put(0x000000E5, "Eden Software Consultants Ltd.");
        map.put(0x000000E6, "Freshtemp");
        map.put(0x000000E7, "?KS Technologies");
        map.put(0x000000E8, "?ACTS Technologies");
        map.put(0x000000E9, "?Vtrack Systems");
        map.put(0x000000EA, "?Nielsen-Kellerman Company");
        map.put(0x000000EB, "Server Technology Inc.");
        map.put(0x000000EC, "BioResearch Associates");
        map.put(0x000000ED, "Jolly Logic, LLC");
        map.put(0x000000EE, "Above Average Outcomes, Inc.");
        map.put(0x000000EF, "Bitsplitters GmbH");
        map.put(0x000000F0, "PayPal, Inc.");
        map.put(0x000000F1, "Witron Technology Limited");
        map.put(0x000000F2, "Morse Project Inc.");
        map.put(0x000000F3, "Kent Displays Inc.");
        map.put(0x000000F4, "Nautilus Inc.");
        map.put(0x000000F5, "Smartifier Oy");
        map.put(0x000000F6, "Elcometer Limited");
        map.put(0x000000F7, "VSN Technologies, Inc.");
        map.put(0x000000F8, "AceUni Corp., Ltd.");
        map.put(0x000000F9, "StickNFind");
        map.put(0x000000FA, "Crystal Code AB");
        map.put(0x000000FB, "KOUKAAM a.s.");
        map.put(0x000000FC, "Delphi Corporation");
        map.put(0x000000FD, "ValenceTech Limited");
        map.put(0x000000FE, "Stanley Black and Decker");
        map.put(0x000000FF, "Typo Products, LLC");
        map.put(0x00000100, "TomTom International BV");
        map.put(0x00000101, "Fugoo, Inc.");
        map.put(0x00000102, "Keiser Corporation");
        map.put(0x00000103, "Bang & Olufsen A/S");
        map.put(0x00000104, "PLUS Location Systems Pty Ltd");
        map.put(0x00000105, "Ubiquitous Computing Technology Corporation");
        map.put(0x00000106, "Innovative Yachtter Solutions");
        map.put(0x00000107, "William Demant Holding A/S");
        map.put(0x00000108, "Chicony Electronics Co., Ltd.");
        map.put(0x00000109, "Atus BV");
        map.put(0x0000010A, "Codegate Ltd");
        map.put(0x0000010B, "ERi, Inc");
        map.put(0x0000010C, "Transducers Direct, LLC");
        map.put(0x0000010D, "DENSO TEN LIMITED (formerly Fujitsu Ten LImited)");
        map.put(0x0000010E, "Audi AG");
        map.put(0x0000010F, "HiSilicon Technologies Col, Ltd.");
        map.put(0x00000110, "Nippon Seiki Co., Ltd.");
        map.put(0x00000111, "Steelseries ApS");
        map.put(0x00000112, "Visybl Inc.");
        map.put(0x00000113, "Openbrain Technologies, Co., Ltd.");
        map.put(0x00000114, "Xensr");
        map.put(0x00000115, "e.solutions");
        map.put(0x00000116, "10AK Technologies");
        map.put(0x00000117, "Wimoto Technologies Inc");
        map.put(0x00000118, "Radius Networks, Inc.");
        map.put(0x00000119, "Wize Technology Co., Ltd.");
        map.put(0x0000011A, "Qualcomm Labs, Inc.");
        map.put(0x0000011B, "Hewlett Packard Enterprise");
        map.put(0x0000011C, "Baidu");
        map.put(0x0000011D, "Arendi AG");
        map.put(0x0000011E, "Skoda Auto a.s.");
        map.put(0x0000011F, "Volkswagen AG");
        map.put(0x00000120, "Porsche AG");
        map.put(0x00000121, "Sino Wealth Electronic Ltd.");
        map.put(0x00000122, "AirTurn, Inc.");
        map.put(0x00000123, "Kinsa, Inc");
        map.put(0x00000124, "HID Global");
        map.put(0x00000125, "SEAT es");
        map.put(0x00000126, "Promethean Ltd.");
        map.put(0x00000127, "Salutica Allied Solutions");
        map.put(0x00000128, "GPSI Group Pty Ltd");
        map.put(0x00000129, "Nimble Devices Oy");
        map.put(0x0000012A, "Changzhou Yongse Infotech Co., Ltd.");
        map.put(0x0000012B, "SportIQ");
        map.put(0x0000012C, "TEMEC Instruments B.V.");
        map.put(0x0000012D, "Sony Corporation");
        map.put(0x0000012E, "ASSA ABLOY");
        map.put(0x0000012F, "Clarion Co. Inc.");
        map.put(0x00000130, "Warehouse Innovations");
        map.put(0x00000131, "Cypress Semiconductor");
        map.put(0x00000132, "MADS Inc");
        map.put(0x00000133, "Blue Maestro Limited");
        map.put(0x00000134, "Resolution Products, Ltd.");
        map.put(0x00000135, "Aireware LLC");
        map.put(0x00000136, "Silvair, Inc.");
        map.put(0x00000137, "Prestigio Plaza Ltd.");
        map.put(0x00000138, "NTEO Inc.");
        map.put(0x00000139, "Focus Systems Corporation");
        map.put(0x0000013A, "Tencent Holdings Ltd.");
        map.put(0x0000013B, "Allegion");
        map.put(0x0000013C, "Murata Manufacturing Co., Ltd.");
        map.put(0x0000013D, "WirelessWERX");
        map.put(0x0000013E, "Nod, Inc.");
        map.put(0x0000013F, "B&B Manufacturing Company");
        map.put(0x00000140, "Alpine Electronics (China) Co., Ltd");
        map.put(0x00000141, "FedEx Services");
        map.put(0x00000142, "Grape Systems Inc.");
        map.put(0x00000143, "Bkon Connect");
        map.put(0x00000144, "Lintech GmbH");
        map.put(0x00000145, "Novatel Wireless");
        map.put(0x00000146, "Ciright");
        map.put(0x00000147, "Mighty Cast, Inc.");
        map.put(0x00000148, "Ambimat Electronics");
        map.put(0x00000149, "Perytons Ltd.");
        map.put(0x0000014A, "Tivoli Audio, LLC");
        map.put(0x0000014B, "Master Lock");
        map.put(0x0000014C, "Mesh-Net Ltd");
        map.put(0x0000014D, "HUIZHOU DESAY SV AUTOMOTIVE CO., LTD.");
        map.put(0x0000014E, "Tangerine, Inc.");
        map.put(0x0000014F, "B&W Group Ltd.");
        map.put(0x00000150, "Pioneer Corporation");
        map.put(0x00000151, "OnBeep");
        map.put(0x00000152, "Vernier Software & Technology");
        map.put(0x00000153, "ROL Ergo");
        map.put(0x00000154, "Pebble Technology");
        map.put(0x00000155, "NETATMO");
        map.put(0x00000156, "Accumulate AB");
        map.put(0x00000157, "Anhui Huami Information Technology Co., Ltd.");
        map.put(0x00000158, "Inmite s.r.o.");
        map.put(0x00000159, "ChefSteps, Inc.");
        map.put(0x0000015A, "micas AG");
        map.put(0x0000015B, "Biomedical Research Ltd.");
        map.put(0x0000015C, "Pitius Tec S.L.");
        map.put(0x0000015D, "Estimote, Inc.");
        map.put(0x0000015E, "Unikey Technologies, Inc.");
        map.put(0x0000015F, "Timer Cap Co.");
        map.put(0x00000160, "AwoX");
        map.put(0x00000161, "yikes");
        map.put(0x00000162, "MADSGlobalNZ Ltd.");
        map.put(0x00000163, "PCH International");
        map.put(0x00000164, "Qingdao Yeelink Information Technology Co., Ltd.");
        map.put(0x00000165, "Milwaukee Tool (Formally Milwaukee Electric Tools)");
        map.put(0x00000166, "MISHIK Pte Ltd");
        map.put(0x00000167, "Ascensia Diabetes Care US Inc.");
        map.put(0x00000168, "Spicebox LLC");
        map.put(0x00000169, "emberlight");
        map.put(0x0000016A, "Cooper-Atkins Corporation");
        map.put(0x0000016B, "Qblinks");
        map.put(0x0000016C, "MYSPHERA");
        map.put(0x0000016D, "LifeScan Inc");
        map.put(0x0000016E, "Volantic AB");
        map.put(0x0000016F, "Podo Labs, Inc");
        map.put(0x00000170, "Roche Diabetes Care AG");
        map.put(0x00000171, "Amazon Fulfillment Service");
        map.put(0x00000172, "Connovate Technology Private Limited");
        map.put(0x00000173, "Kocomojo, LLC");
        map.put(0x00000174, "Everykey Inc.");
        map.put(0x00000175, "Dynamic Controls");
        map.put(0x00000176, "SentriLock");
        map.put(0x00000177, "I-SYST inc.");
        map.put(0x00000178, "CASIO COMPUTER CO., LTD.");
        map.put(0x00000179, "LAPIS Semiconductor Co., Ltd.");
        map.put(0x0000017A, "Telemonitor, Inc.");
        map.put(0x0000017B, "taskit GmbH");
        map.put(0x0000017C, "Daimler AG");
        map.put(0x0000017D, "BatAndCat");
        map.put(0x0000017E, "BluDotz Ltd");
        map.put(0x0000017F, "XTel Wireless ApS");
        map.put(0x00000180, "Gigaset Communications GmbH");
        map.put(0x00000181, "Gecko Health Innovations, Inc.");
        map.put(0x00000182, "HOP Ubiquitous");
        map.put(0x00000183, "Walt Disney");
        map.put(0x00000184, "Nectar");
        map.put(0x00000185, "bel'apps LLC");
        map.put(0x00000186, "CORE Lighting Ltd");
        map.put(0x00000187, "Seraphim Sense Ltd");
        map.put(0x00000188, "Unico RBC");
        map.put(0x00000189, "Physical Enterprises Inc.");
        map.put(0x0000018A, "Able Trend Technology Limited");
        map.put(0x0000018B, "Konica Minolta, Inc.");
        map.put(0x0000018C, "Wilo SE");
        map.put(0x0000018D, "Extron Design Services");
        map.put(0x0000018E, "Fitbit, Inc.");
        map.put(0x0000018F, "Fireflies Systems");
        map.put(0x00000190, "Intelletto Technologies Inc.");
        map.put(0x00000191, "FDK CORPORATION");
        map.put(0x00000192, "Cloudleaf, Inc");
        map.put(0x00000193, "Maveric Automation LLC");
        map.put(0x00000194, "Acoustic Stream Corporation");
        map.put(0x00000195, "Zuli");
        map.put(0x00000196, "Paxton Access Ltd");
        map.put(0x00000197, "WiSilica Inc.");
        map.put(0x00000198, "VENGIT Korlatolt Felelossegu Tarsasag");
        map.put(0x00000199, "SALTO SYSTEMS S.L.");
        map.put(0x0000019A, "TRON Forum (formerly T-Engine Forum)");
        map.put(0x0000019B, "CUBETECH s.r.o.");
        map.put(0x0000019C, "Cokiya Incorporated");
        map.put(0x0000019D, "CVS Health");
        map.put(0x0000019E, "Ceruus");
        map.put(0x0000019F, "Strainstall Ltd");
        map.put(0x000001A0, "Channel Enterprises (HK) Ltd.");
        map.put(0x000001A1, "FIAMM");
        map.put(0x000001A2, "GIGALANE.CO.,LTD");
        map.put(0x000001A3, "EROAD");
        map.put(0x000001A4, "Mine Safety Appliances");
        map.put(0x000001A5, "Icon Health and Fitness");
        map.put(0x000001A6, "Wille Engineering (formely as Asandoo GmbH)");
        map.put(0x000001A7, "ENERGOUS CORPORATION");
        map.put(0x000001A8, "Taobao");
        map.put(0x000001A9, "Canon Inc.");
        map.put(0x000001AA, "Geophysical Technology Inc.");
        map.put(0x000001AB, "Facebook, Inc.");
        map.put(0x000001AC, "Trividia Health, Inc.");
        map.put(0x000001AD, "FlightSafety International");
        map.put(0x000001AE, "Earlens Corporation");
        map.put(0x000001AF, "Sunrise Micro Devices, Inc.");
        map.put(0x000001B0, "Star Micronics Co., Ltd.");
        map.put(0x000001B1, "Netizens Sp. z o.o.");
        map.put(0x000001B2, "Nymi Inc.");
        map.put(0x000001B3, "Nytec, Inc.");
        map.put(0x000001B4, "Trineo Sp. z o.o.");
        map.put(0x000001B5, "Nest Labs Inc.");
        map.put(0x000001B6, "LM Technologies Ltd");
        map.put(0x000001B7, "General Electric Company");
        map.put(0x000001B8, "i+D3 S.L.");
        map.put(0x000001B9, "HANA Micron");
        map.put(0x000001BA, "Stages Cycling LLC");
        map.put(0x000001BB, "Cochlear Bone Anchored Solutions AB");
        map.put(0x000001BC, "SenionLab AB");
        map.put(0x000001BD, "Syszone Co., Ltd");
        map.put(0x000001BE, "Pulsate Mobile Ltd.");
        map.put(0x000001BF, "Hong Kong HunterSun Electronic Limited");
        map.put(0x000001C0, "pironex GmbH");
        map.put(0x000001C1, "BRADATECH Corp.");
        map.put(0x000001C2, "Transenergooil AG");
        map.put(0x000001C3, "Bunch");
        map.put(0x000001C4, "DME Microelectronics");
        map.put(0x000001C5, "Bitcraze AB");
        map.put(0x000001C6, "HASWARE Inc.");
        map.put(0x000001C7, "Abiogenix Inc.");
        map.put(0x000001C8, "Poly-Control ApS");
        map.put(0x000001C9, "Avi-on");
        map.put(0x000001CA, "Laerdal Medical AS");
        map.put(0x000001CB, "Fetch My Pet");
        map.put(0x000001CC, "Sam Labs Ltd.");
        map.put(0x000001CD, "Chengdu Synwing Technology Ltd");
        map.put(0x000001CE, "HOUWA SYSTEM DESIGN, k.k.");
        map.put(0x000001CF, "BSH");
        map.put(0x000001D0, "Primus Inter Pares Ltd");
        map.put(0x000001D1, "August Home, Inc");
        map.put(0x000001D2, "Gill Electronics");
        map.put(0x000001D3, "Sky Wave Design");
        map.put(0x000001D4, "Newlab S.r.l.");
        map.put(0x000001D5, "ELAD srl");
        map.put(0x000001D6, "G-wearables inc.");
        map.put(0x000001D7, "Squadrone Systems Inc.");
        map.put(0x000001D8, "Code Corporation");
        map.put(0x000001D9, "Savant Systems LLC");
        map.put(0x000001DA, "Logitech International SA");
        map.put(0x000001DB, "Innblue Consulting");
        map.put(0x000001DC, "iParking Ltd.");
        map.put(0x000001DD, "Koninklijke Philips Electronics N.V.");
        map.put(0x000001DE, "Minelab Electronics Pty Limited");
        map.put(0x000001DF, "Bison Group Ltd.");
        map.put(0x000001E0, "Widex A/S");
        map.put(0x000001E1, "Jolla Ltd");
        map.put(0x000001E2, "Lectronix, Inc.");
        map.put(0x000001E3, "Caterpillar Inc");
        map.put(0x000001E4, "Freedom Innovations");
        map.put(0x000001E5, "Dynamic Devices Ltd");
        map.put(0x000001E6, "Technology Solutions (UK) Ltd");
        map.put(0x000001E7, "IPS Group Inc.");
        map.put(0x000001E8, "STIR");
        map.put(0x000001E9, "Sano, Inc.");
        map.put(0x000001EA, "Advanced Application Design, Inc.");
        map.put(0x000001EB, "AutoMap LLC");
        map.put(0x000001EC, "Spreadtrum Communications Shanghai Ltd");
        map.put(0x000001ED, "CuteCircuit LTD");
        map.put(0x000001EE, "Valeo Service");
        map.put(0x000001EF, "Fullpower Technologies, Inc.");
        map.put(0x000001F0, "KloudNation");
        map.put(0x000001F1, "Zebra Technologies Corporation");
        map.put(0x000001F2, "Itron, Inc.");
        map.put(0x000001F3, "The University of Tokyo");
        map.put(0x000001F4, "UTC Fire and Security");
        map.put(0x000001F5, "Cool Webthings Limited");
        map.put(0x000001F6, "DJO Global");
        map.put(0x000001F7, "Gelliner Limited");
        map.put(0x000001F8, "Anyka (Guangzhou) Microelectronics Technology Co, LTD");
        map.put(0x000001F9, "Medtronic Inc.");
        map.put(0x000001FA, "Gozio Inc.");
        map.put(0x000001FB, "Form Lifting, LLC");
        map.put(0x000001FC, "Wahoo Fitness, LLC");
        map.put(0x000001FD, "Kontakt Micro-Location Sp. z o.o.");
        map.put(0x000001FE, "Radio Systems Corporation");
        map.put(0x000001FF, "Freescale Semiconductor, Inc.");
        map.put(0x00000200, "Verifone Systems Pte Ltd. Taiwan Branch");
        map.put(0x00000201, "AR Timing");
        map.put(0x00000202, "Rigado LLC");
        map.put(0x00000203, "Kemppi Oy");
        map.put(0x00000204, "Tapcentive Inc.");
        map.put(0x00000205, "Smartbotics Inc.");
        map.put(0x00000206, "Otter Products, LLC");
        map.put(0x00000207, "STEMP Inc.");
        map.put(0x00000208, "LumiGeek LLC");
        map.put(0x00000209, "InvisionHeart Inc.");
        map.put(0x0000020A, "Macnica Inc.");
        map.put(0x0000020B, "Jaguar Land Rover Limited");
        map.put(0x0000020C, "CoroWare Technologies, Inc");
        map.put(0x0000020D, "Simplo Technology Co., LTD");
        map.put(0x0000020E, "Omron Healthcare Co., LTD");
        map.put(0x0000020F, "Comodule GMBH");
        map.put(0x00000210, "ikeGPS");
        map.put(0x00000211, "Telink Semiconductor Co. Ltd");
        map.put(0x00000212, "Interplan Co., Ltd");
        map.put(0x00000213, "Wyler AG");
        map.put(0x00000214, "IK Multimedia Production srl");
        map.put(0x00000215, "Lukoton Experience Oy");
        map.put(0x00000216, "MTI Ltd");
        map.put(0x00000217, "Tech4home, Lda");
        map.put(0x00000218, "Hiotech AB");
        map.put(0x00000219, "DOTT Limited");
        map.put(0x0000021A, "Blue Speck Labs, LLC");
        map.put(0x0000021B, "Cisco Systems, Inc");
        map.put(0x0000021C, "Mobicomm Inc");
        map.put(0x0000021D, "Edamic");
        map.put(0x0000021E, "Goodnet, Ltd");
        map.put(0x0000021F, "Luster Leaf Products Inc");
        map.put(0x00000220, "Manus Machina BV");
        map.put(0x00000221, "Mobiquity Networks Inc");
        map.put(0x00000222, "Praxis Dynamics");
        map.put(0x00000223, "Philip Morris Products S.A.");
        map.put(0x00000224, "Comarch SA");
        map.put(0x00000225, "");
        map.put(0x00000226, "Merlinia A/S");
        map.put(0x00000227, "LifeBEAM Technologies");
        map.put(0x00000228, "Twocanoes Labs, LLC");
        map.put(0x00000229, "Muoverti Limited");
        map.put(0x0000022A, "Stamer Musikanlagen GMBH");
        map.put(0x0000022B, "Tesla Motors");
        map.put(0x0000022C, "Pharynks Corporation");
        map.put(0x0000022D, "Lupine");
        map.put(0x0000022E, "Siemens AG");
        map.put(0x0000022F, "Huami (Shanghai) Culture Communication CO., LTD");
        map.put(0x00000230, "Foster Electric Company, Ltd");
        map.put(0x00000231, "ETA SA");
        map.put(0x00000232, "x-Senso Solutions Kft");
        map.put(0x00000233, "Shenzhen SuLong Communication Ltd");
        map.put(0x00000234, "FengFan (BeiJing) Technology Co, Ltd");
        map.put(0x00000235, "Qrio Inc");
        map.put(0x00000236, "Pitpatpet Ltd");
        map.put(0x00000237, "MSHeli s.r.l.");
        map.put(0x00000238, "Trakm8 Ltd");
        map.put(0x00000239, "JIN CO, Ltd");
        map.put(0x0000023A, "Alatech Tehnology");
        map.put(0x0000023B, "Beijing CarePulse Electronic Technology Co, Ltd");
        map.put(0x0000023C, "Awarepoint");
        map.put(0x0000023D, "ViCentra B.V.");
        map.put(0x0000023E, "Raven Industries");
        map.put(0x0000023F, "WaveWare Technologies Inc.");
        map.put(0x00000240, "Argenox Technologies");
        map.put(0x00000241, "Bragi GmbH");
        map.put(0x00000242, "16Lab Inc");
        map.put(0x00000243, "Masimo Corp");
        map.put(0x00000244, "Iotera Inc");
        map.put(0x00000245, "");
        map.put(0x00000246, "ACKme Networks, Inc.");
        map.put(0x00000247, "FiftyThree Inc.");
        map.put(0x00000248, "Parker Hannifin Corp");
        map.put(0x00000249, "Transcranial Ltd");
        map.put(0x0000024A, "Uwatec AG");
        map.put(0x0000024B, "Orlan LLC");
        map.put(0x0000024C, "Blue Clover Devices");
        map.put(0x0000024D, "M-Way Solutions GmbH");
        map.put(0x0000024E, "Microtronics Engineering GmbH");
        map.put(0x0000024F, "");
        map.put(0x00000250, "Sapphire Circuits LLC");
        map.put(0x00000251, "Lumo Bodytech Inc.");
        map.put(0x00000252, "UKC Technosolution");
        map.put(0x00000253, "Xicato Inc.");
        map.put(0x00000254, "Playbrush");
        map.put(0x00000255, "Dai Nippon Printing Co., Ltd.");
        map.put(0x00000256, "G24 Power Limited");
        map.put(0x00000257, "AdBabble Local Commerce Inc.");
        map.put(0x00000258, "Devialet SA");
        map.put(0x00000259, "ALTYOR");
        map.put(0x0000025A, "University of Applied Sciences Valais/Haute Ecole Valaisanne");
        map.put(0x0000025B, "Five Interactive, LLC dba Zendo");
        map.put(0x0000025C, "NetEase?Hangzhou?Network co.Ltd.");
        map.put(0x0000025D, "Lexmark International Inc.");
        map.put(0x0000025E, "Fluke Corporation");
        map.put(0x0000025F, "Yardarm Technologies");
        map.put(0x00000260, "SensaRx");
        map.put(0x00000261, "SECVRE GmbH");
        map.put(0x00000262, "Glacial Ridge Technologies");
        map.put(0x00000263, "Identiv, Inc.");
        map.put(0x00000264, "DDS, Inc.");
        map.put(0x00000265, "SMK Corporation");
        map.put(0x00000266, "Schawbel Technologies LLC");
        map.put(0x00000267, "XMI Systems SA");
        map.put(0x00000268, "Cerevo");
        map.put(0x00000269, "Torrox GmbH & Co KG");
        map.put(0x0000026A, "Gemalto");
        map.put(0x0000026B, "DEKA Research & Development Corp.");
        map.put(0x0000026C, "Domster Tadeusz Szydlowski");
        map.put(0x0000026D, "Technogym SPA");
        map.put(0x0000026E, "FLEURBAEY BVBA");
        map.put(0x0000026F, "Aptcode Solutions");
        map.put(0x00000270, "LSI ADL Technology");
        map.put(0x00000271, "Animas Corp");
        map.put(0x00000272, "Alps Electric Co., Ltd.");
        map.put(0x00000273, "OCEASOFT");
        map.put(0x00000274, "Motsai Research");
        map.put(0x00000275, "Geotab");
        map.put(0x00000276, "E.G.O. Elektro-Geraetebau GmbH");
        map.put(0x00000277, "bewhere inc");
        map.put(0x00000278, "Johnson Outdoors Inc");
        map.put(0x00000279, "steute Schaltgerate GmbH & Co. KG");
        map.put(0x0000027A, "Ekomini inc.");
        map.put(0x0000027B, "DEFA AS");
        map.put(0x0000027C, "Aseptika Ltd");
        map.put(0x0000027D, "HUAWEI Technologies Co., Ltd.");
        map.put(0x0000027E, "HabitAware, LLC");
        map.put(0x0000027F, "ruwido austria gmbh");
        map.put(0x00000280, "ITEC corporation");
        map.put(0x00000281, "StoneL");
        map.put(0x00000282, "Sonova AG");
        map.put(0x00000283, "Maven Machines, Inc.");
        map.put(0x00000284, "Synapse Electronics");
        map.put(0x00000285, "Standard Innovation Inc.");
        map.put(0x00000286, "RF Code, Inc.");
        map.put(0x00000287, "Wally Ventures S.L.");
        map.put(0x00000288, "Willowbank Electronics Ltd");
        map.put(0x00000289, "SK Telecom");
        map.put(0x0000028A, "Jetro AS");
        map.put(0x0000028B, "Code Gears LTD");
        map.put(0x0000028C, "NANOLINK APS");
        map.put(0x0000028D, "IF, LLC");
        map.put(0x0000028E, "RF Digital Corp");
        map.put(0x0000028F, "Church & Dwight Co., Inc");
        map.put(0x00000290, "Multibit Oy");
        map.put(0x00000291, "CliniCloud Inc");
        map.put(0x00000292, "SwiftSensors");
        map.put(0x00000293, "Blue Bite");
        map.put(0x00000294, "ELIAS GmbH");
        map.put(0x00000295, "Sivantos GmbH");
        map.put(0x00000296, "Petzl");
        map.put(0x00000297, "storm power ltd");
        map.put(0x00000298, "EISST Ltd");
        map.put(0x00000299, "Inexess Technology Simma KG");
        map.put(0x0000029A, "Currant, Inc.");
        map.put(0x0000029B, "C2 Development, Inc.");
        map.put(0x0000029C, "Blue Sky Scientific, LLC");
        map.put(0x0000029D, "ALOTTAZS LABS, LLC");
        map.put(0x0000029E, "Kupson spol. s r.o.");
        map.put(0x0000029F, "Areus Engineering GmbH");
        map.put(0x000002A0, "Impossible Camera GmbH");
        map.put(0x000002A1, "InventureTrack Systems");
        map.put(0x000002A2, "LockedUp");
        map.put(0x000002A3, "Itude");
        map.put(0x000002A4, "Pacific Lock Company");
        map.put(0x000002A5, "Tendyron Corporation ( ??????????? )");
        map.put(0x000002A6, "Robert Bosch GmbH");
        map.put(0x000002A7, "Illuxtron international B.V.");
        map.put(0x000002A8, "miSport Ltd.");
        map.put(0x000002A9, "Chargelib");
        map.put(0x000002AA, "Doppler Lab");
        map.put(0x000002AB, "BBPOS Limited");
        map.put(0x000002AC, "RTB Elektronik GmbH & Co. KG");
        map.put(0x000002AD, "Rx Networks, Inc.");
        map.put(0x000002AE, "WeatherFlow, Inc.");
        map.put(0x000002AF, "Technicolor USA Inc.");
        map.put(0x000002B0, "Bestechnic(Shanghai),Ltd");
        map.put(0x000002B1, "Raden Inc");
        map.put(0x000002B2, "JouZen Oy");
        map.put(0x000002B3, "CLABER S.P.A.");
        map.put(0x000002B4, "Hyginex, Inc.");
        map.put(0x000002B5, "HANSHIN ELECTRIC RAILWAY CO.,LTD.");
        map.put(0x000002B6, "Schneider Electric");
        map.put(0x000002B7, "Oort Technologies LLC");
        map.put(0x000002B8, "Chrono Therapeutics");
        map.put(0x000002B9, "Rinnai Corporation");
        map.put(0x000002BA, "Swissprime Technologies AG");
        map.put(0x000002BB, "Koha.,Co.Ltd");
        map.put(0x000002BC, "Genevac Ltd");
        map.put(0x000002BD, "Chemtronics");
        map.put(0x000002BE, "Seguro Technology Sp. z o.o.");
        map.put(0x000002BF, "Redbird Flight Simulations");
        map.put(0x000002C0, "Dash Robotics");
        map.put(0x000002C1, "LINE Corporation");
        map.put(0x000002C2, "Guillemot Corporation");
        map.put(0x000002C3, "Techtronic Power Tools Technology Limited");
        map.put(0x000002C4, "Wilson Sporting Goods");
        map.put(0x000002C5, "Lenovo (Singapore) Pte Ltd. ( ??????? )");
        map.put(0x000002C6, "Ayatan Sensors");
        map.put(0x000002C7, "Electronics Tomorrow Limited");
        map.put(0x000002C8, "VASCO Data Security International, Inc.");
        map.put(0x000002C9, "PayRange Inc.");
        map.put(0x000002CA, "ABOV Semiconductor");
        map.put(0x000002CB, "AINA-Wireless Inc.");
        map.put(0x000002CC, "Eijkelkamp Soil & Water");
        map.put(0x000002CD, "BMA ergonomics b.v.");
        map.put(0x000002CE, "Teva Branded Pharmaceutical Products R&D, Inc.");
        map.put(0x000002CF, "Anima");
        map.put(0x000002D0, "3M");
        map.put(0x000002D1, "Empatica Srl");
        map.put(0x000002D2, "Afero, Inc.");
        map.put(0x000002D3, "Powercast Corporation");
        map.put(0x000002D4, "Secuyou ApS");
        map.put(0x000002D5, "OMRON Corporation");
        map.put(0x000002D6, "Send Solutions");
        map.put(0x000002D7, "NIPPON SYSTEMWARE CO.,LTD.");
        map.put(0x000002D8, "Neosfar");
        map.put(0x000002D9, "Fliegl Agrartechnik GmbH");
        map.put(0x000002DA, "Gilvader");
        map.put(0x000002DB, "Digi International Inc (R)");
        map.put(0x000002DC, "DeWalch Technologies, Inc.");
        map.put(0x000002DD, "Flint Rehabilitation Devices, LLC");
        map.put(0x000002DE, "Samsung SDS Co., Ltd.");
        map.put(0x000002DF, "Blur Product Development");
        map.put(0x000002E0, "University of Michigan");
        map.put(0x000002E1, "Victron Energy BV");
        map.put(0x000002E2, "NTT docomo");
        map.put(0x000002E3, "Carmanah Technologies Corp.");
        map.put(0x000002E4, "Bytestorm Ltd.");
        map.put(0x000002E5, "Espressif Incorporated ( ??????(??)???? )");
        map.put(0x000002E6, "Unwire");
        map.put(0x000002E7, "Connected Yard, Inc.");
        map.put(0x000002E8, "American Music Environments");
        map.put(0x000002E9, "Sensogram Technologies, Inc.");
        map.put(0x000002EA, "Fujitsu Limited");
        map.put(0x000002EB, "Ardic Technology");
        map.put(0x000002EC, "Delta Systems, Inc");
        map.put(0x000002ED, "");
        map.put(0x000002EE, "");
        map.put(0x000002EF, "SMART-INNOVATION.inc");
        map.put(0x000002F0, "");
        map.put(0x000002F1, "The Idea Cave, LLC");
        map.put(0x000002F2, "GoPro, Inc.");
        map.put(0x000002F3, "AuthAir, Inc");
        map.put(0x000002F4, "Vensi, Inc.");
        map.put(0x000002F5, "Indagem Tech LLC");
        map.put(0x000002F6, "Intemo Technologies");
        map.put(0x000002F7, "DreamVisions co., Ltd.");
        map.put(0x000002F8, "Runteq Oy Ltd");
        map.put(0x000002F9, "");
        map.put(0x000002FA, "CoSTAR TEchnologies");
        map.put(0x000002FB, "Clarius Mobile Health Corp.");
        map.put(0x000002FC, "Shanghai Frequen Microelectronics Co., Ltd.");
        map.put(0x000002FD, "Uwanna, Inc.");
        map.put(0x000002FE, "Lierda Science & Technology Group Co., Ltd.");
        map.put(0x000002FF, "Silicon Laboratories");
        map.put(0x00000300, "World Moto Inc.");
        map.put(0x00000301, "Giatec Scientific Inc.");
        map.put(0x00000302, "Loop Devices, Inc");
        map.put(0x00000303, "IACA electronique");
        map.put(0x00000304, "Proxy Technologies, Inc.");
        map.put(0x00000305, "Swipp ApS");
        map.put(0x00000306, "");
        map.put(0x00000307, "FUJI INDUSTRIAL CO.,LTD.");
        map.put(0x00000308, "Surefire, LLC");
        map.put(0x00000309, "Dolby Labs");
        map.put(0x0000030A, "Ellisys");
        map.put(0x0000030B, "Magnitude Lighting Converters");
        map.put(0x0000030C, "Hilti AG");
        map.put(0x0000030D, "Devdata S.r.l.");
        map.put(0x0000030E, "Deviceworx");
        map.put(0x0000030F, "Shortcut Labs");
        map.put(0x00000310, "SGL Italia S.r.l.");
        map.put(0x00000311, "PEEQ DATA");
        map.put(0x00000312, "");
        map.put(0x00000313, "");
        map.put(0x00000314, "RIIG AI Sp. z o.o.");
        map.put(0x00000315, "");
        map.put(0x00000316, "");
        map.put(0x00000317, "");
        map.put(0x00000318, "");
        map.put(0x00000319, "");
        map.put(0x0000031A, "");
        map.put(0x0000031B, "");
        map.put(0x0000031C, "");
        map.put(0x0000031D, "");
        map.put(0x0000031E, "Eyefi, Inc.");
        map.put(0x0000031F, "");
        map.put(0x00000320, "");
        map.put(0x00000321, "");
        map.put(0x00000322, "");
        map.put(0x00000323, "");
        map.put(0x00000324, "");
        map.put(0x00000325, "Amotus Solutions");
        map.put(0x00000326, "");
        map.put(0x00000327, "");
        map.put(0x00000328, "Grundfos A/S");
        map.put(0x00000329, "");
        map.put(0x0000032A, "");
        map.put(0x0000032B, "");
        map.put(0x0000032C, "NIPPON SMT.CO.,Ltd");
        map.put(0x0000032D, "");
        map.put(0x0000032E, "indoormap");
        map.put(0x0000032F, "");
        map.put(0x00000330, "");
        map.put(0x00000331, "3flares Technologies Inc.");
        map.put(0x00000332, "");
        map.put(0x00000333, "Mul-T-Lock");
        map.put(0x00000334, "");
        map.put(0x00000335, "Enlighted Inc");
        map.put(0x00000336, "GISTIC");
        map.put(0x00000337, "AJP2 Holdings, LLC");
        map.put(0x00000338, "");
        map.put(0x00000339, "");
        map.put(0x0000033A, "Appception, Inc.");
        map.put(0x0000033B, "");
        map.put(0x0000033C, "Virtuosys");
        map.put(0x0000033D, "");
        map.put(0x0000033E, "Monitra SA");
        map.put(0x0000033F, "");
        map.put(0x00000340, "");
        map.put(0x00000341, "");
        map.put(0x00000342, "");
        map.put(0x00000343, "Drekker Development Pty. Ltd.");
        map.put(0x00000344, "");
        map.put(0x00000345, "");
        map.put(0x00000346, "");
        map.put(0x00000347, "");
        map.put(0x00000348, "Arioneo");
        map.put(0x00000349, "");
        map.put(0x0000034A, "");
        map.put(0x0000034B, "");
        map.put(0x0000034C, "");
        map.put(0x0000034D, "TASER International, Inc.");
        map.put(0x0000034E, "");
        map.put(0x0000034F, "");
        map.put(0x00000350, "");
        map.put(0x00000351, "");
        map.put(0x00000352, "iRiding(Xiamen)Technology Co.,Ltd.");
        map.put(0x00000353, "");
        map.put(0x00000354, "");
        map.put(0x00000355, "");
        map.put(0x00000356, "");
        map.put(0x00000357, "");
        map.put(0x00000358, "MagniWare Ltd.");
        map.put(0x00000359, "");
        map.put(0x0000035A, "");
        map.put(0x0000035B, "");
        map.put(0x0000035C, "");
        map.put(0x0000035D, "KYS");
        map.put(0x0000035E, "");
        map.put(0x0000035F, "");
        map.put(0x00000360, "");
        map.put(0x00000361, "");
        map.put(0x00000362, "ON Semiconductor");
        map.put(0x00000363, "");
        map.put(0x00000364, "");
        map.put(0x00000365, "");
        map.put(0x00000366, "BOLTT Sports technologies Private limited");
        map.put(0x00000367, "");
        map.put(0x00000368, "");
        map.put(0x00000369, "");
        map.put(0x0000036A, "");
        map.put(0x0000036B, "");
        map.put(0x0000036C, "");
        map.put(0x0000036D, "");
        map.put(0x0000036E, "");
        map.put(0x0000036F, "");
        map.put(0x00000370, "Wazombi Labs Oܠ");
        map.put(0x00000371, "ORBCOMM");
        map.put(0x00000372, "Nixie Labs, Inc.");
        map.put(0x00000373, "AppNearMe Ltd");
        map.put(0x00000374, "Holman Industries");
        map.put(0x00000375, "Expain AS");
        map.put(0x00000376, "Electronic Temperature Instruments Ltd");
        map.put(0x00000377, "Plejd AB");
        map.put(0x00000378, "Propeller Health");
        map.put(0x00000379, "Shenzhen iMCO Electronic Technology Co.,Ltd");
        map.put(0x0000037A, "Algoria");
        map.put(0x0000037B, "Apption Labs Inc.");
        map.put(0x0000037C, "Cronologics Corporation");
        map.put(0x0000037D, "MICRODIA Ltd.");
        map.put(0x0000037E, "lulabytes S.L.");
        map.put(0x0000037F, "Nestec S.A.");
        map.put(0x00000380, "LLC \"MEGA-F service\"");
        map.put(0x00000381, "Sharp Corporation");
        map.put(0x00000382, "Precision Outcomes Ltd");
        map.put(0x00000383, "Kronos Incorporated");
        map.put(0x00000384, "OCOSMOS Co., Ltd.");
        map.put(0x00000385, "Embedded Electronic Solutions Ltd. dba e2Solutions");
        map.put(0x00000386, "Aterica Inc.");
        map.put(0x00000387, "BluStor PMC, Inc.");
        map.put(0x00000388, "Kapsch TrafficCom AB");
        map.put(0x00000389, "ActiveBlu Corporation");
        map.put(0x0000038A, "Kohler Mira Limited");
        map.put(0x0000038B, "Noke");
        map.put(0x0000038C, "Appion Inc.");
        map.put(0x0000038D, "Resmed Ltd");
        map.put(0x0000038E, "Crownstone B.V.");
        map.put(0x0000038F, "Xiaomi Inc.");
        map.put(0x00000390, "INFOTECH s.r.o.");
        map.put(0x00000391, "Thingsquare AB");
        map.put(0x00000392, "T&D");
        map.put(0x00000393, "LAVAZZA S.p.A.");
        map.put(0x00000394, "Netclearance Systems, Inc.");
        map.put(0x00000395, "SDATAWAY");
        map.put(0x00000396, "BLOKS GmbH");
        map.put(0x00000397, "LEGO System A/S");
        map.put(0x00000398, "Thetatronics Ltd");
        map.put(0x00000399, "Nikon Corporation");
        map.put(0x0000039A, "NeST");
        map.put(0x0000039B, "South Silicon Valley Microelectronics");
        map.put(0x0000039C, "ALE International");
        map.put(0x0000039D, "CareView Communications, Inc.");
        map.put(0x0000039E, "SchoolBoard Limited");
        map.put(0x0000039F, "Molex Corporation");
        map.put(0x000003A0, "IVT Wireless Limited");
        map.put(0x000003A1, "Alpine Labs LLC");
        map.put(0x000003A2, "Candura Instruments");
        map.put(0x000003A3, "SmartMovt Technology Co., Ltd");
        map.put(0x000003A4, "Token Zero Ltd");
        map.put(0x000003A5, "ACE CAD Enterprise Co., Ltd. (ACECAD)");
        map.put(0x000003A6, "Medela, Inc");
        map.put(0x000003A7, "AeroScout");
        map.put(0x000003A8, "Esrille Inc.");
        map.put(0x000003A9, "THINKERLY SRL");
        map.put(0x000003AA, "Exon Sp. z o.o.");
        map.put(0x000003AB, "Meizu Technology Co., Ltd.");
        map.put(0x000003AC, "Smablo LTD");
        map.put(0x000003AD, "XiQ");
        map.put(0x000003AE, "Allswell Inc.");
        map.put(0x000003AF, "Comm-N-Sense Corp DBA Verigo");
        map.put(0x000003B0, "VIBRADORM GmbH");
        map.put(0x000003B1, "Otodata Wireless Network Inc.");
        map.put(0x000003B2, "Propagation Systems Limited");
        map.put(0x000003B3, "Midwest Instruments & Controls");
        map.put(0x000003B4, "Alpha Nodus, inc.");
        map.put(0x000003B5, "petPOMM, Inc");
        map.put(0x000003B6, "Mattel");
        map.put(0x000003B7, "Airbly Inc.");
        map.put(0x000003B8, "A-Safe Limited");
        map.put(0x000003B9, "FREDERIQUE CONSTANT SA");
        map.put(0x000003BA, "Maxscend Microelectronics Company Limited");
        map.put(0x000003BB, "Abbott Diabetes Care");
        map.put(0x000003BC, "ASB Bank Ltd");
        map.put(0x000003BD, "amadas");
        map.put(0x000003BE, "Applied Science, Inc.");
        map.put(0x000003BF, "iLumi Solutions Inc.");
        map.put(0x000003C0, "Arch Systems Inc.");
        map.put(0x000003C1, "Ember Technologies, Inc.");
        map.put(0x000003C2, "Snapchat Inc");
        map.put(0x000003C3, "Casambi Technologies Oy");
        map.put(0x000003C4, "Pico Technology Inc.");
        map.put(0x000003C5, "St. Jude Medical, Inc.");
        map.put(0x000003C6, "Intricon");
        map.put(0x000003C7, "Structural Health Systems, Inc.");
        map.put(0x000003C8, "Avvel International");
        map.put(0x000003C9, "Gallagher Group");
        map.put(0x000003CA, "In2things Automation Pvt. Ltd.");
        map.put(0x000003CB, "SYSDEV Srl");
        map.put(0x000003CC, "Vonkil Technologies Ltd");
        map.put(0x000003CD, "Wynd Technologies, Inc.");
        map.put(0x000003CE, "CONTRINEX S.A.");
        map.put(0x000003CF, "MIRA, Inc.");
        map.put(0x000003D0, "Watteam Ltd");
        map.put(0x000003D1, "Density Inc.");
        map.put(0x000003D2, "IOT Pot India Private Limited");
        map.put(0x000003D3, "Sigma Connectivity AB");
        map.put(0x000003D4, "PEG PEREGO SPA");
        map.put(0x000003D5, "Wyzelink Systems Inc.");
        map.put(0x000003D6, "Yota Devices LTD");
        map.put(0x000003D7, "FINSECUR");
        map.put(0x000003D8, "Zen-Me Labs Ltd");
        map.put(0x000003D9, "3IWare Co., Ltd.");
        map.put(0x000003DA, "EnOcean GmbH");
        map.put(0x000003DB, "Instabeat, Inc");
        map.put(0x000003DC, "Nima Labs");
        map.put(0x000003DD, "Andreas Stihl AG & Co. KG");
        map.put(0x000003DE, "Nathan Rhoades LLC");
        map.put(0x000003DF, "Grob Technologies, LLC");
        map.put(0x000003E0, "Actions (Zhuhai) Technology Co., Limited");
        map.put(0x000003E1, "SPD Development Company Ltd");
        map.put(0x000003E2, "Sensoan Oy");
        map.put(0x000003E3, "Qualcomm Life Inc");
        map.put(0x000003E4, "Chip-ing AG");
        map.put(0x000003E5, "ffly4u");
        map.put(0x000003E6, "IoT Instruments Oy");
        map.put(0x000003E7, "TRUE Fitness Technology");
        map.put(0x000003E8, "Reiner Kartengeraete GmbH & Co. KG.");
        map.put(0x000003E9, "SHENZHEN LEMONJOY TECHNOLOGY CO., LTD.");
        map.put(0x000003EA, "Hello Inc.");
        map.put(0x000003EB, "Evollve Inc.");
        map.put(0x000003EC, "Jigowatts Inc.");
        map.put(0x000003ED, "BASIC MICRO.COM,INC.");
        map.put(0x000003EE, "CUBE TECHNOLOGIES");
        map.put(0x000003EF, "foolography GmbH");
        map.put(0x000003F0, "CLINK");
        map.put(0x000003F1, "Hestan Smart Cooking Inc.");
        map.put(0x000003F2, "WindowMaster A/S");
        map.put(0x000003F3, "Flowscape AB");
        map.put(0x000003F4, "PAL Technologies Ltd");
        map.put(0x000003F5, "WHERE, Inc.");
        map.put(0x000003F6, "Iton Technology Corp.");
        map.put(0x000003F7, "Owl Labs Inc.");
        map.put(0x000003F8, "Rockford Corp.");
        map.put(0x000003F9, "Becon Technologies Co.,Ltd.");
        map.put(0x000003FA, "Vyassoft Technologies Inc");
        map.put(0x000003FB, "Nox Medical");
        map.put(0x000003FC, "Kimberly-Clark");
        map.put(0x000003FD, "Trimble Navigation Ltd.");
        map.put(0x000003FE, "Littelfuse");
        map.put(0x000003FF, "Withings");
        map.put(0x00000400, "i-developer IT Beratung UG");
        map.put(0x00000401, "???????????");
        map.put(0x00000402, "Sears Holdings Corporation");
        map.put(0x00000403, "Gantner Electronic GmbH");
        map.put(0x00000404, "Authomate Inc");
        map.put(0x00000405, "Vertex International, Inc.");
        map.put(0x00000406, "Airtago");
        map.put(0x00000407, "Swiss Audio SA");
        map.put(0x00000408, "ToGetHome Inc.");
        map.put(0x00000409, "AXIS");
        map.put(0x0000040A, "Openmatics");
        map.put(0x0000040B, "Jana Care Inc.");
        map.put(0x0000040C, "Senix Corporation");
        map.put(0x0000040D, "NorthStar Battery Company, LLC");
        map.put(0x0000040E, "SKF (U.K.) Limited");
        map.put(0x0000040F, "CO-AX Technology, Inc.");
        map.put(0x00000410, "Fender Musical Instruments");
        map.put(0x00000411, "Luidia Inc");
        map.put(0x00000412, "SEFAM");
        map.put(0x00000413, "Wireless Cables Inc");
        map.put(0x00000414, "Lightning Protection International Pty Ltd");
        map.put(0x00000415, "Uber Technologies Inc");
        map.put(0x00000416, "SODA GmbH");
        map.put(0x00000417, "Fatigue Science");
        map.put(0x00000418, "Alpine Electronics Inc.");
        map.put(0x00000419, "Novalogy LTD");
        map.put(0x0000041A, "Friday Labs Limited");
        map.put(0x0000041B, "OrthoAccel Technologies");
        map.put(0x0000041C, "WaterGuru, Inc.");
        map.put(0x0000041D, "Benning Elektrotechnik und Elektronik GmbH & Co. KG");
        map.put(0x0000041E, "Dell Computer Corporation");
        map.put(0x0000041F, "Kopin Corporation");
        map.put(0x00000420, "TecBakery GmbH");
        map.put(0x00000421, "Backbone Labs, Inc.");
        map.put(0x00000422, "DELSEY SA");
        map.put(0x00000423, "Chargifi Limited");
        map.put(0x00000424, "Trainesense Ltd.");
        map.put(0x00000425, "Unify Software and Solutions GmbH & Co. KG");
        map.put(0x00000426, "Husqvarna AB");
        map.put(0x00000427, "Focus fleet and fuel management inc");
        map.put(0x00000428, "SmallLoop, LLC");
        map.put(0x00000429, "Prolon Inc.");
        map.put(0x0000042A, "BD Medical");
        map.put(0x0000042B, "iMicroMed Incorporated");
        map.put(0x0000042C, "Ticto N.V.");
        map.put(0x0000042D, "Meshtech AS");
        map.put(0x0000042E, "MemCachier Inc.");
        map.put(0x0000042F, "Danfoss A/S");
        map.put(0x00000430, "SnapStyk Inc.");
        map.put(0x00000431, "Amway Corporation");
        map.put(0x00000432, "Silk Labs, Inc.");
        map.put(0x00000433, "Pillsy Inc.");
        map.put(0x00000434, "Hatch Baby, Inc.");
        map.put(0x00000435, "Blocks Wearables Ltd.");
        map.put(0x00000436, "Drayson Technologies (Europe) Limited");
        map.put(0x00000437, "eBest IOT Inc.");
        map.put(0x00000438, "Helvar Ltd");
        map.put(0x00000439, "Radiance Technologies");
        map.put(0x0000043A, "Nuheara Limited");
        map.put(0x0000043B, "Appside co., ltd.");
        map.put(0x0000043C, "DeLaval");
        map.put(0x0000043D, "Coiler Corporation");
        map.put(0x0000043E, "Thermomedics, Inc.");
        map.put(0x0000043F, "Tentacle Sync GmbH");
        map.put(0x00000440, "Valencell, Inc.");
        map.put(0x00000441, "iProtoXi Oy");
        map.put(0x00000442, "SECOM CO., LTD.");
        map.put(0x00000443, "Tucker International LLC");
        map.put(0x00000444, "Metanate Limited");
        map.put(0x00000445, "Kobian Canada Inc.");
        map.put(0x00000446, "NETGEAR, Inc.");
        map.put(0x00000447, "Fabtronics Australia Pty Ltd");
        map.put(0x00000448, "Grand Centrix GmbH");
        map.put(0x00000449, "1UP USA.com llc");
        map.put(0x0000044A, "SHIMANO INC.");
        map.put(0x0000044B, "Nain Inc.");
        map.put(0x0000044C, "LifeStyle Lock, LLC");
        map.put(0x0000044D, "VEGA Grieshaber KG");
        map.put(0x0000044E, "Xtrava Inc.");
        map.put(0x0000044F, "TTS Tooltechnic Systems AG & Co. KG");
        map.put(0x00000450, "Teenage Engineering AB");
        map.put(0x00000451, "Tunstall Nordic AB");
        map.put(0x00000452, "Svep Design Center AB");
        map.put(0x00000453, "GreenPeak Technologies BV");
        map.put(0x00000454, "Sphinx Electronics GmbH & Co KG");
        map.put(0x00000455, "Atomation");
        map.put(0x00000456, "Nemik Consulting Inc");
        map.put(0x00000457, "RF INNOVATION");
        map.put(0x00000458, "Mini Solution Co., Ltd.");
        map.put(0x00000459, "Lumenetix, Inc");
        map.put(0x0000045A, "2048450 Ontario Inc");
        map.put(0x0000045B, "SPACEEK LTD");
        map.put(0x0000045C, "Delta T Corporation");
        map.put(0x0000045D, "Boston Scientific Corporation");
        map.put(0x0000045E, "Nuviz, Inc.");
        map.put(0x0000045F, "Real Time Automation, Inc.");
        map.put(0x00000460, "Kolibree");
        map.put(0x00000461, "vhf elektronik GmbH");
        map.put(0x00000462, "Bonsai Systems GmbH");
        map.put(0x00000463, "Fathom Systems Inc.");
        map.put(0x00000464, "Bellman & Symfon");
        map.put(0x00000465, "International Forte Group LLC");
        map.put(0x00000466, "CycleLabs Solutions inc.");
        map.put(0x00000467, "Codenex Oy");
        map.put(0x00000468, "Kynesim Ltd");
        map.put(0x00000469, "Palago AB");
        map.put(0x0000046A, "INSIGMA INC.");
        map.put(0x0000046B, "PMD Solutions");
        map.put(0x0000046C, "Qingdao Realtime Technology Co., Ltd.");
        map.put(0x0000046D, "BEGA Gantenbrink-Leuchten KG");
        map.put(0x0000046E, "Pambor Ltd.");
        map.put(0x0000046F, "Develco Products A/S");
        map.put(0x00000470, "iDesign s.r.l.");
        map.put(0x00000471, "TiVo Corp");
        map.put(0x00000472, "Control-J Pty Ltd");
        map.put(0x00000473, "Steelcase, Inc.");
        map.put(0x00000474, "iApartment co., ltd.");
        map.put(0x00000475, "Icom inc.");
        map.put(0x00000476, "Oxstren Wearable Technologies Private Limited");
        map.put(0x00000477, "Blue Spark Technologies");
        map.put(0x00000478, "FarSite Communications Limited");
        map.put(0x00000479, "mywerk system GmbH");
        map.put(0x0000047A, "Sinosun Technology Co., Ltd.");
        map.put(0x0000047B, "MIYOSHI ELECTRONICS CORPORATION");
        map.put(0x0000047C, "POWERMAT LTD");
        map.put(0x0000047D, "Occly LLC");
        map.put(0x0000047E, "OurHub Dev IvS");
        map.put(0x0000047F, "Pro-Mark, Inc.");
        map.put(0x00000480, "Dynometrics Inc.");
        map.put(0x00000481, "Quintrax Limited");
        map.put(0x00000482, "POS Tuning Udo Vosshenrich GmbH & Co. KG");
        map.put(0x00000483, "Multi Care Systems B.V.");
        map.put(0x00000484, "Revol Technologies Inc");
        map.put(0x00000485, "SKIDATA AG");
        map.put(0x00000486, "DEV TECNOLOGIA INDUSTRIA, COMERCIO E MANUTENCAO DE EQUIPAMENTOS LTDA. - ME");
        map.put(0x00000487, "Centrica Connected Home");
        map.put(0x00000488, "Automotive Data Solutions Inc");
        map.put(0x00000489, "Igarashi Engineering");
        map.put(0x0000048A, "Taelek Oy");
        map.put(0x0000048B, "CP Electronics Limited");
        map.put(0x0000048C, "Vectronix AG");
        map.put(0x0000048D, "S-Labs Sp. z o.o.");
        map.put(0x0000048E, "Companion Medical, Inc.");
        map.put(0x0000048F, "BlueKitchen GmbH");
        map.put(0x00000490, "Matting AB");
        map.put(0x00000491, "SOREX - Wireless Solutions GmbH");
        map.put(0x00000492, "ADC Technology, Inc.");
        map.put(0x00000493, "Lynxemi Pte Ltd");
        map.put(0x00000494, "SENNHEISER electronic GmbH & Co. KG");
        map.put(0x00000495, "LMT Mercer Group, Inc");
        map.put(0x00000496, "Polymorphic Labs LLC");
        map.put(0x00000497, "Cochlear Limited");
        map.put(0x00000498, "METER Group, Inc. USA");
        map.put(0x00000499, "Ruuvi Innovations Ltd.");
        map.put(0x0000049A, "Situne AS");
        map.put(0x0000049B, "nVisti, LLC");
        map.put(0x0000049C, "DyOcean");
        map.put(0x0000049D, "Uhlmann & Zacher GmbH");
        map.put(0x0000049E, "AND!XOR LLC");
        map.put(0x0000049F, "tictote AB");
        map.put(0x000004A0, "Vypin, LLC");
        map.put(0x000004A1, "PNI Sensor Corporation");
        map.put(0x000004A2, "ovrEngineered, LLC");
        map.put(0x000004A3, "GT-tronics HK Ltd");
        map.put(0x000004A4, "Herbert Waldmann GmbH & Co. KG");
        map.put(0x000004A5, "Guangzhou FiiO Electronics Technology Co.,Ltd");
        map.put(0x000004A6, "Vinetech Co., Ltd");
        map.put(0x000004A7, "Dallas Logic Corporation");
        map.put(0x000004A8, "BioTex, Inc.");
        map.put(0x000004A9, "DISCOVERY SOUND TECHNOLOGY, LLC");
        map.put(0x000004AA, "LINKIO SAS");
        map.put(0x000004AB, "Harbortronics, Inc.");
        map.put(0x000004AC, "Undagrid B.V.");
        map.put(0x000004AD, "Shure Inc");
        map.put(0x000004AE, "ERM Electronic Systems LTD");
        map.put(0x000004AF, "BIOROWER Handelsagentur GmbH");
        map.put(0x000004B0, "Weba Sport und Med. Artikel GmbH");
        map.put(0x000004B1, "Kartographers Technologies Pvt. Ltd.");
        map.put(0x000004B2, "The Shadow on the Moon");
        map.put(0x000004B3, "mobike (Hong Kong) Limited");
        map.put(0x000004B4, "Inuheat Group AB");
        map.put(0x000004B5, "Swiftronix AB");
        map.put(0x000004B6, "Diagnoptics Technologies");
        map.put(0x000004B7, "Analog Devices, Inc.");
        map.put(0x000004B8, "Soraa Inc.");
        map.put(0x000004B9, "CSR Building Products Limited");
        map.put(0x000004BA, "Crestron Electronics, Inc.");
        map.put(0x000004BB, "Neatebox Ltd");
        map.put(0x000004BC, "Draegerwerk AG & Co. KGaA");
        map.put(0x000004BD, "AlbynMedical");
        map.put(0x000004BE, "Averos FZCO");
        map.put(0x000004BF, "VIT Initiative, LLC");
        map.put(0x000004C0, "Statsports International");
        map.put(0x000004C1, "Sospitas, s.r.o.");
        map.put(0x000004C2, "Dmet Products Corp.");
        map.put(0x000004C3, "Mantracourt Electronics Limited");
        map.put(0x000004C4, "TeAM Hutchins AB");
        map.put(0x000004C5, "Seibert Williams Glass, LLC");
        map.put(0x000004C6, "Insta GmbH");
        map.put(0x000004C7, "Svantek Sp. z o.o.");
        map.put(0x000004C8, "Shanghai Flyco Electrical Appliance Co., Ltd.");
        map.put(0x000004C9, "Thornwave Labs Inc");
        map.put(0x000004CA, "Steiner-Optik GmbH");
        map.put(0x000004CB, "Novo Nordisk A/S");
        map.put(0x000004CC, "Enflux Inc.");
        map.put(0x000004CD, "Safetech Products LLC");
        map.put(0x000004CE, "GOOOLED S.R.L.");
        map.put(0x000004CF, "DOM Sicherheitstechnik GmbH & Co. KG");
        map.put(0x000004D0, "Olympus Corporation");
        map.put(0x000004D1, "KTS GmbH");
        map.put(0x000004D2, "Anloq Technologies Inc.");
        map.put(0x000004D3, "Queercon, Inc");
        map.put(0x000004D4, "5th Element Ltd");
        map.put(0x000004D5, "Gooee Limited");
        map.put(0x000004D6, "LUGLOC LLC");
        map.put(0x000004D7, "Blincam, Inc.");
        map.put(0x000004D8, "FUJIFILM Corporation");
        map.put(0x000004D9, "RandMcNally");
        map.put(0x000004DA, "Franceschi Marina snc");
        map.put(0x000004DB, "Engineered Audio, LLC.");
        map.put(0x000004DC, "IOTTIVE (OPC) PRIVATE LIMITED");
        map.put(0x000004DD, "4MOD Technology");
        map.put(0x000004DE, "Lutron Electronics Co., Inc.");
        map.put(0x000004DF, "Emerson");
        map.put(0x000004E0, "Guardtec, Inc.");
        map.put(0x000004E1, "REACTEC LIMITED");
        map.put(0x000004E2, "EllieGrid");
        map.put(0x000004E3, "Under Armour");
        map.put(0x000004E4, "Woodenshark");
        map.put(0x000004E5, "Avack Oy");
        map.put(0x000004E6, "Smart Solution Technology, Inc.");
        map.put(0x000004E7, "REHABTRONICS INC.");
        map.put(0x000004E8, "STABILO International");
        map.put(0x000004E9, "Busch Jaeger Elektro GmbH");
        map.put(0x000004EA, "Pacific Bioscience Laboratories, Inc");
        map.put(0x000004EB, "Bird Home Automation GmbH");
        map.put(0x000004EC, "Motorola Solutions");
        map.put(0x000004ED, "R9 Technology, Inc.");
        map.put(0x000004EE, "Auxivia");
        map.put(0x000004EF, "DaisyWorks, Inc");
        map.put(0x000004F0, "Kosi Limited");
        map.put(0x000004F1, "Theben AG");
        map.put(0x000004F2, "InDreamer Techsol Private Limited");
        map.put(0x000004F3, "Cerevast Medical");
        map.put(0x000004F4, "ZanCompute Inc.");
        map.put(0x000004F5, "Pirelli Tyre S.P.A.");
        map.put(0x000004F6, "McLear Limited");
        map.put(0x000004F7, "Shenzhen Huiding Technology Co.,Ltd.");
        map.put(0x000004F8, "Convergence Systems Limited");
        map.put(0x000004F9, "Interactio");
        map.put(0x000004FA, "Androtec GmbH");
        map.put(0x000004FB, "Benchmark Drives GmbH & Co. KG");
        map.put(0x000004FC, "SwingLync L. L. C.");
        map.put(0x000004FD, "Tapkey GmbH");
        map.put(0x000004FE, "Woosim Systems Inc.");
        map.put(0x000004FF, "Microsemi Corporation");
        map.put(0x00000500, "Wiliot LTD.");
        map.put(0x00000501, "Polaris IND");
        map.put(0x00000502, "Specifi-Kali LLC");
        map.put(0x00000503, "Locoroll, Inc");
        map.put(0x00000504, "PHYPLUS Inc");
        map.put(0x00000505, "Inplay Technologies LLC");
        map.put(0x00000506, "Hager");
        map.put(0x00000507, "Yellowcog");
        map.put(0x00000508, "Axes System sp. z o. o.");
        map.put(0x00000509, "myLIFTER Inc.");
        map.put(0x0000050A, "Shake-on B.V.");
        map.put(0x0000050B, "Vibrissa Inc.");
        map.put(0x0000050C, "OSRAM GmbH");
        map.put(0x0000050D, "TRSystems GmbH");
        map.put(0x0000050E, "Yichip Microelectronics (Hangzhou) Co.,Ltd.");
        map.put(0x0000050F, "Foundation Engineering LLC");
        map.put(0x00000510, "UNI-ELECTRONICS, INC.");
        map.put(0x00000511, "Brookfield Equinox LLC");
        map.put(0x00000512, "Soprod SA");
        map.put(0x00000513, "9974091 Canada Inc.");
        map.put(0x00000514, "FIBRO GmbH");
        map.put(0x00000515, "RB Controls Co., Ltd.");
        map.put(0x00000516, "Footmarks");
        map.put(0x00000517, "Amtronic Sverige AB (formerly Amcore AB)");
        map.put(0x00000518, "MAMORIO.inc");
        map.put(0x00000519, "Tyto Life LLC");
        map.put(0x0000051A, "Leica Camera AG");
        map.put(0x0000051B, "Angee Technologies Ltd.");
        map.put(0x0000051C, "EDPS");
        map.put(0x0000051D, "OFF Line Co., Ltd.");
        map.put(0x0000051E, "Detect Blue Limited");
        map.put(0x0000051F, "Setec Pty Ltd");
        map.put(0x00000520, "Target Corporation");
        map.put(0x00000521, "IAI Corporation");
        map.put(0x00000522, "NS Tech, Inc.");
        map.put(0x00000523, "MTG Co., Ltd.");
        map.put(0x00000524, "Hangzhou iMagic Technology Co., Ltd");
        map.put(0x00000525, "HONGKONG NANO IC TECHNOLOGIES CO., LIMITED");
        map.put(0x00000526, "Honeywell International Inc.");
        map.put(0x00000527, "Albrecht JUNG");
        map.put(0x00000528, "Lunera Lighting Inc.");
        map.put(0x00000529, "Lumen UAB");
        map.put(0x0000052A, "Keynes Controls Ltd");
        map.put(0x0000052B, "Novartis AG");
        map.put(0x0000052C, "Geosatis SA");
        map.put(0x0000052D, "EXFO, Inc.");
        map.put(0x0000052E, "LEDVANCE GmbH");
        map.put(0x0000052F, "Center ID Corp.");
        map.put(0x00000530, "Adolene, Inc.");
        map.put(0x00000531, "D&M Holdings Inc.");
        map.put(0x00000532, "CRESCO Wireless, Inc.");
        map.put(0x00000533, "Nura Operations Pty Ltd");
        map.put(0x00000534, "Frontiergadget, Inc.");
        map.put(0x00000535, "Smart Component Technologies Limited");
        map.put(0x00000536, "ZTR Control Systems LLC");
        map.put(0x00000537, "MetaLogics Corporation");
        map.put(0x00000538, "Medela AG");
        map.put(0x00000539, "OPPLE Lighting Co., Ltd");
        map.put(0x0000053A, "Savitech Corp.,");
        map.put(0x0000053B, "prodigy");
        map.put(0x0000053C, "Screenovate Technologies Ltd");
        map.put(0x0000053D, "TESA SA");
        map.put(0x0000053E, "CLIM8 LIMITED");
        map.put(0x0000053F, "Silergy Corp");
        map.put(0x00000540, "SilverPlus, Inc");
        map.put(0x00000541, "Sharknet srl");
        map.put(0x00000542, "Mist Systems, Inc.");
        map.put(0x00000543, "MIWA LOCK CO.,Ltd");
        map.put(0x00000544, "OrthoSensor, Inc.");
        map.put(0x00000545, "Candy Hoover Group s.r.l");
        map.put(0x00000546, "Apexar Technologies S.A.");
        map.put(0x00000547, "LOGICDATA d.o.o.");
        map.put(0x00000548, "Knick Elektronische Messgeraete GmbH & Co. KG");
        map.put(0x00000549, "Smart Technologies and Investment Limited");
        map.put(0x0000054A, "Linough Inc.");
        map.put(0x0000054B, "Advanced Electronic Designs, Inc.");
        map.put(0x0000054C, "Carefree Scott Fetzer Co Inc");
        map.put(0x0000054D, "Sensome");
        map.put(0x0000054E, "FORTRONIK storitve d.o.o.");
        map.put(0x0000054F, "Sinnoz");
        map.put(0x00000550, "Versa Networks, Inc.");
        map.put(0x00000551, "Sylero");
        map.put(0x00000552, "Avempace SARL");
        map.put(0x00000553, "Nintendo Co., Ltd.");
        map.put(0x00000554, "National Instruments");
        map.put(0x00000555, "KROHNE Messtechnik GmbH");
        map.put(0x00000556, "Otodynamics Ltd");
        map.put(0x00000557, "Arwin Technology Limited");
        map.put(0x00000558, "benegear, inc.");
        map.put(0x00000559, "Newcon Optik");
        map.put(0x0000055A, "CANDY HOUSE, Inc.");
        map.put(0x0000055B, "FRANKLIN TECHNOLOGY INC");
        map.put(0x0000055C, "Lely");
        map.put(0x0000055D, "Valve Corporation");
        map.put(0x0000055E, "Hekatron Vertriebs GmbH");
        map.put(0x0000055F, "PROTECH S.A.S. DI GIRARDI ANDREA & C.");
        map.put(0x00000560, "Sarita CareTech APS (formerly Sarita CareTech IVS)");
        map.put(0x00000561, "Finder S.p.A.");
        map.put(0x00000562, "Thalmic Labs Inc.");
        map.put(0x00000563, "Steinel Vertrieb GmbH");
        map.put(0x00000564, "Beghelli Spa");
        map.put(0x00000565, "Beijing Smartspace Technologies Inc.");
        map.put(0x00000566, "CORE TRANSPORT TECHNOLOGIES NZ LIMITED");
        map.put(0x00000567, "Xiamen Everesports Goods Co., Ltd");
        map.put(0x00000568, "Bodyport Inc.");
        map.put(0x00000569, "Audionics System, INC.");
        map.put(0x0000056A, "Flipnavi Co.,Ltd.");
        map.put(0x0000056B, "Rion Co., Ltd.");
        map.put(0x0000056C, "Long Range Systems, LLC");
        map.put(0x0000056D, "Redmond Industrial Group LLC");
        map.put(0x0000056E, "VIZPIN INC.");
        map.put(0x0000056F, "BikeFinder AS");
        map.put(0x00000570, "Consumer Sleep Solutions LLC");
        map.put(0x00000571, "PSIKICK, INC.");
        map.put(0x00000572, "AntTail.com");
        map.put(0x00000573, "Lighting Science Group Corp.");
        map.put(0x00000574, "AFFORDABLE ELECTRONICS INC");
        map.put(0x00000575, "Integral Memroy Plc");
        map.put(0x00000576, "Globalstar, Inc.");
        map.put(0x00000577, "True Wearables, Inc.");
        map.put(0x00000578, "Wellington Drive Technologies Ltd");
        map.put(0x00000579, "Ensemble Tech Private Limited");
        map.put(0x0000057A, "OMNI Remotes");
        map.put(0x0000057B, "Duracell U.S. Operations Inc.");
        map.put(0x0000057C, "Toor Technologies LLC");
        map.put(0x0000057D, "Instinct Performance");
        map.put(0x0000057E, "Beco, Inc");
        map.put(0x0000057F, "Scuf Gaming International, LLC");
        map.put(0x00000580, "ARANZ Medical Limited");
        map.put(0x00000581, "LYS TECHNOLOGIES LTD");
        map.put(0x00000582, "Breakwall Analytics, LLC");
        map.put(0x00000583, "Code Blue Communications");
        map.put(0x00000584, "Gira Giersiepen GmbH & Co. KG");
        map.put(0x00000585, "Hearing Lab Technology");
        map.put(0x00000586, "LEGRAND");
        map.put(0x00000587, "Derichs GmbH");
        map.put(0x00000588, "ALT-TEKNIK LLC");
        map.put(0x00000589, "Star Technologies");
        map.put(0x0000058A, "START TODAY CO.,LTD.");
        map.put(0x0000058B, "Maxim Integrated Products");
        map.put(0x0000058C, "MERCK Kommanditgesellschaft auf Aktien");
        map.put(0x0000058D, "Jungheinrich Aktiengesellschaft");
        map.put(0x0000058E, "Oculus VR, LLC");
        map.put(0x0000058F, "HENDON SEMICONDUCTORS PTY LTD");
        map.put(0x00000590, "Pur3 Ltd");
        map.put(0x00000591, "Viasat Group S.p.A.");
        map.put(0x00000592, "IZITHERM");
        map.put(0x00000593, "Spaulding Clinical Research");
        map.put(0x00000594, "Kohler Company");
        map.put(0x00000595, "Inor Process AB");
        map.put(0x00000596, "My Smart Blinds");
        map.put(0x00000597, "RadioPulse Inc");
        map.put(0x00000598, "rapitag GmbH");
        map.put(0x00000599, "Lazlo326, LLC.");
        map.put(0x0000059A, "Teledyne Lecroy, Inc.");
        map.put(0x0000059B, "Dataflow Systems Limited");
        map.put(0x0000059C, "Macrogiga Electronics");
        map.put(0x0000059D, "Tandem Diabetes Care");
        map.put(0x0000059E, "Polycom, Inc.");
        map.put(0x0000059F, "Fisher & Paykel Healthcare");
        map.put(0x000005A0, "RCP Software Oy");
        map.put(0x000005A1, "Shanghai Xiaoyi Technology Co.,Ltd.");
        map.put(0x000005A2, "ADHERIUM(NZ) LIMITED");
        map.put(0x000005A3, "Axiomware Systems Incorporated");
        map.put(0x000005A4, "O. E. M. Controls, Inc.");
        map.put(0x000005A5, "Kiiroo BV");
        map.put(0x000005A6, "Telecon Mobile Limited");
        map.put(0x000005A7, "Sonos Inc");
        map.put(0x000005A8, "Tom Allebrandi Consulting");
        map.put(0x000005A9, "Monidor");
        map.put(0x000005AA, "Tramex Limited");
        map.put(0x000005AB, "Nofence AS");
        map.put(0x000005AC, "GoerTek Dynaudio Co., Ltd.");
        map.put(0x000005AD, "INIA");
        map.put(0x000005AE, "CARMATE MFG.CO.,LTD");
        map.put(0x000005AF, "ONvocal");
        map.put(0x000005B0, "NewTec GmbH");
        map.put(0x000005B1, "Medallion Instrumentation Systems");
        map.put(0x000005B2, "CAREL INDUSTRIES S.P.A.");
        map.put(0x000005B3, "Parabit Systems, Inc.");
        map.put(0x000005B4, "White Horse Scientific ltd");
        map.put(0x000005B5, "verisilicon");
        map.put(0x000005B6, "Elecs Industry Co.,Ltd.");
        map.put(0x000005B7, "Beijing Pinecone Electronics Co.,Ltd.");
        map.put(0x000005B8, "Ambystoma Labs Inc.");
        map.put(0x000005B9, "Suzhou Pairlink Network Technology");
        map.put(0x000005BA, "igloohome");
        map.put(0x000005BB, "Oxford Metrics plc");
        map.put(0x000005BC, "Leviton Mfg. Co., Inc.");
        map.put(0x000005BD, "ULC Robotics Inc.");
        map.put(0x000005BE, "RFID Global by Softwork SrL");
        map.put(0x000005BF, "Real-World-Systems Corporation");
        map.put(0x000005C0, "Nalu Medical, Inc.");
        map.put(0x000005C1, "P.I.Engineering");
        map.put(0x000005C2, "Grote Industries");
        map.put(0x000005C3, "Runtime, Inc.");
        map.put(0x000005C4, "Codecoup sp. z o.o. sp. k.");
        map.put(0x000005C5, "SELVE GmbH & Co. KG");
        map.put(0x000005C6, "Smart Animal Training Systems, LLC");
        map.put(0x000005C7, "Lippert Components, INC");
        map.put(0x000005C8, "SOMFY SAS");
        map.put(0x000005C9, "TBS Electronics B.V.");
        map.put(0x000005CA, "MHL Custom Inc");
        map.put(0x000005CB, "LucentWear LLC");
        map.put(0x000005CC, "WATTS ELECTRONICS");
        map.put(0x000005CD, "RJ Brands LLC");
        map.put(0x000005CE, "V-ZUG Ltd");
        map.put(0x000005CF, "Biowatch SA");
        map.put(0x000005D0, "Anova Applied Electronics");
        map.put(0x000005D1, "Lindab AB");
        map.put(0x000005D2, "frogblue TECHNOLOGY GmbH");
        map.put(0x000005D3, "Acurable Limited");
        map.put(0x000005D4, "LAMPLIGHT Co., Ltd.");
        map.put(0x000005D5, "TEGAM, Inc.");
        map.put(0x000005D6, "Zhuhai Jieli technology Co.,Ltd");
        map.put(0x000005D7, "modum.io AG");
        map.put(0x000005D8, "Farm Jenny LLC");
        map.put(0x000005D9, "Toyo Electronics Corporation");
        map.put(0x000005DA, "Applied Neural Research Corp");
        map.put(0x000005DB, "Avid Identification Systems, Inc.");
        map.put(0x000005DC, "Petronics Inc.");
        map.put(0x000005DD, "essentim GmbH");
        map.put(0x000005DE, "QT Medical INC.");
        map.put(0x000005DF, "VIRTUALCLINIC.DIRECT LIMITED");
        map.put(0x000005E0, "Viper Design LLC");
        map.put(0x000005E1, "Human, Incorporated");
        map.put(0x000005E2, "stAPPtronics GmbH");
        map.put(0x000005E3, "Elemental Machines, Inc.");
        map.put(0x000005E4, "Taiyo Yuden Co., Ltd");
        map.put(0x000005E5, "INEO ENERGY& SYSTEMS");
        map.put(0x000005E6, "Motion Instruments Inc.");
        map.put(0x000005E7, "PressurePro");
        map.put(0x000005E8, "COWBOY");
        map.put(0x000005E9, "iconmobile GmbH");
        map.put(0x000005EA, "ACS-Control-System GmbH");
        map.put(0x000005EB, "Bayerische Motoren Werke AG");
        map.put(0x000005EC, "Gycom Svenska AB");
        map.put(0x000005ED, "Fuji Xerox Co., Ltd");
        map.put(0x000005EE, "Glide Inc.");
        map.put(0x000005EF, "SIKOM AS");
        map.put(0x000005F0, "beken");
        map.put(0x000005F1, "The Linux Foundation");
        map.put(0x000005F2, "Try and E CO.,LTD.");
        map.put(0x000005F3, "SeeScan");
        map.put(0x000005F4, "Clearity, LLC");
        map.put(0x000005F5, "GS TAG");
        map.put(0x000005F6, "DPTechnics");
        map.put(0x000005F7, "TRACMO, INC.");
        map.put(0x000005F8, "Anki Inc.");
        map.put(0x000005F9, "Hagleitner Hygiene International GmbH");
        map.put(0x000005FA, "Konami Sports Life Co., Ltd.");
        map.put(0x000005FB, "Arblet Inc.");
        map.put(0x000005FC, "Masbando GmbH");
        map.put(0x000005FD, "Innoseis");
        map.put(0x000005FE, "Niko");
        map.put(0x000005FF, "Wellnomics Ltd");
        map.put(0x00000600, "iRobot Corporation");
        map.put(0x00000601, "Schrader Electronics");
        map.put(0x00000602, "Geberit International AG");
        map.put(0x00000603, "Fourth Evolution Inc");
        map.put(0x00000604, "Cell2Jack LLC");
        map.put(0x00000605, "FMW electronic Futterer u. Maier-Wolf OHG");
        map.put(0x00000606, "John Deere");
        map.put(0x00000607, "Rookery Technology Ltd");
        map.put(0x00000608, "KeySafe-Cloud");
        map.put(0x00000609, "BUCHI Labortechnik AG");
        map.put(0x0000060A, "IQAir AG");
        map.put(0x0000060B, "Triax Technologies Inc");
        map.put(0x0000060C, "Vuzix Corporation");
        map.put(0x0000060D, "TDK Corporation");
        map.put(0x0000060E, "Blueair AB");
        map.put(0x0000060F, "Signify Netherlands");
        map.put(0x00000610, "ADH GUARDIAN USA LLC");
        map.put(0x00000611, "Beurer GmbH");
        map.put(0x00000612, "Playfinity AS");
        map.put(0x00000613, "Hans Dinslage GmbH");
        map.put(0x00000614, "OnAsset Intelligence, Inc.");
        map.put(0x00000615, "INTER ACTION Corporation");
        map.put(0x00000616, "OS42 UG (haftungsbeschraenkt)");
        map.put(0x00000617, "WIZCONNECTED COMPANY LIMITED");
        map.put(0x00000618, "Audio-Technica Corporation");
        map.put(0x00000619, "Six Guys Labs, s.r.o.");
        map.put(0x0000061A, "R.W. Beckett Corporation");
        map.put(0x0000061B, "silex technology, inc.");
        map.put(0x0000061C, "Univations Limited");
        map.put(0x0000061D, "SENS Innovation ApS");
        map.put(0x0000061E, "Diamond Kinetics, Inc.");
        map.put(0x0000061F, "Phrame Inc.");
        map.put(0x00000620, "Forciot Oy");
        map.put(0x00000621, "Noordung d.o.o.");
        map.put(0x00000622, "Beam Labs, LLC");
        map.put(0x00000623, "Philadelphia Scientific (U.K.) Limited");
        map.put(0x00000624, "Biovotion AG");
        map.put(0x00000625, "Square Panda, Inc.");
        map.put(0x00000626, "Amplifico");
        map.put(0x00000627, "WEG S.A.");
        map.put(0x00000628, "Ensto Oy");
        map.put(0x00000629, "PHONEPE PVT LTD");
        map.put(0x0000062A, "Lunatico Astronomia SL");
        map.put(0x0000062B, "MinebeaMitsumi Inc.");
        map.put(0x0000062C, "ASPion GmbH");
        map.put(0x0000062D, "Vossloh-Schwabe Deutschland GmbH");
        map.put(0x0000062E, "Procept");
        map.put(0x0000062F, "ONKYO Corporation");
        map.put(0x00000630, "Asthrea D.O.O.");
        map.put(0x00000631, "Fortiori Design LLC");
        map.put(0x00000632, "Hugo Muller GmbH & Co KG");
        map.put(0x00000633, "Wangi Lai PLT");
        map.put(0x00000634, "Fanstel Corp");
        map.put(0x00000635, "Crookwood");
        map.put(0x00000636, "ELECTRONICA INTEGRAL DE SONIDO S.A.");
        map.put(0x00000637, "GiP Innovation Tools GmbH");
        map.put(0x00000638, "LX SOLUTIONS PTY LIMITED");
        map.put(0x00000639, "Shenzhen Minew Technologies Co., Ltd.");
        map.put(0x0000063A, "Prolojik Limited");
        map.put(0x0000063B, "Kromek Group Plc");
        map.put(0x0000063C, "Contec Medical Systems Co., Ltd.");
        map.put(0x0000063D, "Xradio Technology Co.,Ltd.");
        map.put(0x0000063E, "The Indoor Lab, LLC");
        map.put(0x0000063F, "LDL TECHNOLOGY");
        map.put(0x00000640, "Parkifi");
        map.put(0x00000641, "Revenue Collection Systems FRANCE SAS");
        map.put(0x00000642, "Bluetrum Technology Co.,Ltd");
        map.put(0x00000643, "makita corporation");
        map.put(0x00000644, "Apogee Instruments");
        map.put(0x00000645, "BM3");
        map.put(0x00000646, "SGV Group Holding GmbH & Co. KG");
        map.put(0x00000647, "MED-EL");
        map.put(0x00000648, "Ultune Technologies");
        map.put(0x00000649, "Ryeex Technology Co.,Ltd.");
        map.put(0x0000064A, "Open Research Institute, Inc.");
        map.put(0x0000064B, "Scale-Tec, Ltd");
        map.put(0x0000064C, "Zumtobel Group AG");
        map.put(0x0000064D, "iLOQ Oy");
        map.put(0x0000064E, "KRUXWorks Technologies Private Limited");
        map.put(0x0000064F, "Digital Matter Pty Ltd");
        map.put(0x00000650, "Coravin, Inc.");
        map.put(0x00000651, "Stasis Labs, Inc.");
        map.put(0x00000652, "ITZ Innovations- und Technologiezentrum GmbH");
        map.put(0x00000653, "Meggitt SA");
        map.put(0x00000654, "Ledlenser GmbH & Co. KG");
        map.put(0x00000655, "Renishaw PLC");
        map.put(0x00000656, "ZhuHai AdvanPro Technology Company Limited");
        map.put(0x00000657, "Meshtronix Limited");
        map.put(0x00000658, "Payex Norge AS");
        map.put(0x00000659, "UnSeen Technologies Oy");
        map.put(0x0000065A, "Zound Industries International AB");
        map.put(0x0000065B, "Sesam Solutions BV");
        map.put(0x0000065C, "PixArt Imaging Inc.");
        map.put(0x0000065D, "Panduit Corp.");
        map.put(0x0000065E, "Alo AB");
        map.put(0x0000065F, "Ricoh Company Ltd");
        map.put(0x00000660, "RTC Industries, Inc.");
        map.put(0x00000661, "Mode Lighting Limited");
        map.put(0x00000662, "Particle Industries, Inc.");
        map.put(0x00000663, "Advanced Telemetry Systems, Inc.");
        map.put(0x00000664, "RHA TECHNOLOGIES LTD");
        map.put(0x00000665, "Pure International Limited");
        map.put(0x00000666, "WTO Werkzeug-Einrichtungen GmbH");
        map.put(0x00000667, "Spark Technology Labs Inc.");
        map.put(0x00000668, "Bleb Technology srl");
        map.put(0x00000669, "Livanova USA, Inc.");
        map.put(0x0000066A, "Brady Worldwide Inc.");
        map.put(0x0000066B, "DewertOkin GmbH");
        map.put(0x0000066C, "Ztove ApS");
        map.put(0x0000066D, "Venso EcoSolutions AB");
        map.put(0x0000066E, "Eurotronik Kranj d.o.o.");
        map.put(0x0000066F, "Hug Technology Ltd");
        map.put(0x00000670, "Gema Switzerland GmbH");
        map.put(0x00000671, "Buzz Products Ltd.");
        map.put(0x00000672, "Kopi");
        map.put(0x00000673, "Innova Ideas Limited");
        map.put(0x00000674, "BeSpoon");
        map.put(0x00000675, "Deco Enterprises, Inc.");
        map.put(0x00000676, "Expai Solutions Private Limited");
        map.put(0x00000677, "Innovation First, Inc.");
        map.put(0x00000678, "SABIK Offshore GmbH");
        map.put(0x00000679, "4iiii Innovations Inc.");
        map.put(0x0000067A, "The Energy Conservatory, Inc.");
        map.put(0x0000067B, "I.FARM, INC.");
        map.put(0x0000067C, "Tile, Inc.");
        map.put(0x0000067D, "Form Athletica Inc.");
        map.put(0x0000067E, "MbientLab Inc");
        map.put(0x0000067F, "NETGRID S.N.C. DI BISSOLI MATTEO, CAMPOREALE SIMONE, TOGNETTI FEDERICO");
        map.put(0x00000680, "Mannkind Corporation");
        map.put(0x00000681, "Trade FIDES a.s.");
        map.put(0x00000682, "Photron Limited");
        map.put(0x00000683, "Eltako GmbH");
        map.put(0x00000684, "Dermalapps, LLC");
        map.put(0x00000685, "Greenwald Industries");
        map.put(0x00000686, "inQs Co., Ltd.");
        map.put(0x00000687, "Cherry GmbH");
        map.put(0x00000688, "Amsted Digital Solutions Inc.");
        map.put(0x00000689, "Tacx b.v.");
        map.put(0x0000068A, "Raytac Corporation");
        map.put(0x0000068B, "Jiangsu Teranovo Tech Co., Ltd.");
        map.put(0x0000068C, "Changzhou Sound Dragon Electronics and Acoustics Co., Ltd");
        map.put(0x0000068D, "JetBeep Inc.");
        map.put(0x0000068E, "Razer Inc.");
        map.put(0x0000068F, "JRM Group Limited");
        map.put(0x00000690, "Eccrine Systems, Inc.");
        map.put(0x00000691, "Curie Point AB");
        map.put(0x00000692, "Georg Fischer AG");
        map.put(0x00000693, "Hach - Danaher");
        map.put(0x00000694, "T&A Laboratories LLC");
        map.put(0x00000695, "Koki Holdings Co., Ltd.");
        map.put(0x00000696, "Gunakar Private Limited");
        map.put(0x00000697, "Stemco Products Inc");
        map.put(0x00000698, "Wood IT Security, LLC");
        map.put(0x00000699, "RandomLab SAS");
        map.put(0x0000069A, "Adero, Inc. (formerly as TrackR, Inc.)");
        map.put(0x0000069B, "Dragonchip Limited");
        map.put(0x0000069C, "Noomi AB");
        map.put(0x0000069D, "Vakaros LLC");
        map.put(0x0000069E, "Delta Electronics, Inc.");
        map.put(0x0000069F, "FlowMotion Technologies AS");
        map.put(0x000006A0, "OBIQ Location Technology Inc.");
        map.put(0x000006A1, "Cardo Systems, Ltd");
        map.put(0x000006A2, "Globalworx GmbH");
        map.put(0x000006A3, "Nymbus, LLC");
        map.put(0x000006A4, "Sanyo Techno Solutions Tottori Co., Ltd.");
        map.put(0x000006A5, "TEKZITEL PTY LTD");
        map.put(0x000006A6, "Roambee Corporation");
        map.put(0x000006A7, "Chipsea Technologies (ShenZhen) Corp.");
        map.put(0x000006A8, "GD Midea Air-Conditioning Equipment Co., Ltd.");
        map.put(0x000006A9, "Soundmax Electronics Limited");
        map.put(0x000006AA, "Produal Oy");
        map.put(0x000006AB, "HMS Industrial Networks AB");
        map.put(0x000006AC, "Ingchips Technology Co., Ltd.");
        map.put(0x000006AD, "InnovaSea Systems Inc.");
        map.put(0x000006AE, "SenseQ Inc.");
        map.put(0x000006AF, "Shoof Technologies");
        map.put(0x000006B0, "BRK Brands, Inc.");
        map.put(0x000006B1, "SimpliSafe, Inc.");
        map.put(0x000006B2, "Tussock Innovation 2013 Limited");
        map.put(0x000006B3, "The Hablab ApS");
        map.put(0x000006B4, "Sencilion Oy");
        map.put(0x000006B5, "Wabilogic Ltd.");
        map.put(0x000006B6, "Sociometric Solutions, Inc.");
        map.put(0x000006B7, "iCOGNIZE GmbH");
        map.put(0x000006B8, "ShadeCraft, Inc");
        map.put(0x000006B9, "Beflex Inc.");
        map.put(0x000006BA, "Beaconzone Ltd");
        map.put(0x000006BB, "Leaftronix Analogic Solutions Private Limited");
        map.put(0x000006BC, "TWS Srl");
        map.put(0x000006BD, "ABB Oy");
        map.put(0x000006BE, "HitSeed Oy");
        map.put(0x000006BF, "Delcom Products Inc.");
        map.put(0x000006C0, "CAME S.p.A.");
        map.put(0x000006C1, "Alarm.com Holdings, Inc");
        map.put(0x000006C2, "Measurlogic Inc.");
        map.put(0x000006C3, "King I Electronics.Co.,Ltd");
        map.put(0x000006C4, "Dream Labs GmbH");
        map.put(0x000006C5, "Urban Compass, Inc");
        map.put(0x000006C6, "Simm Tronic Limited");
        map.put(0x000006C7, "Somatix Inc");
        map.put(0x000006C8, "Storz & Bickel GmbH & Co. KG");
        map.put(0x000006C9, "MYLAPS B.V.");
        map.put(0x000006CA, "Shenzhen Zhongguang Infotech Technology Development Co., Ltd");
        map.put(0x000006CB, "Dyeware, LLC");
        map.put(0x000006CC, "Dongguan SmartAction Technology Co.,Ltd.");
        map.put(0x000006CD, "DIG Corporation");
        map.put(0x000006CE, "FIOR & GENTZ");
        map.put(0x000006CF, "Belparts N.V.");
        map.put(0x000006D0, "Etekcity Corporation");
        map.put(0x000006D1, "Meyer Sound Laboratories, Incorporated");
        map.put(0x000006D2, "CeoTronics AG");
        map.put(0x000006D3, "TriTeq Lock and Security, LLC");
        map.put(0x000006D4, "DYNAKODE TECHNOLOGY PRIVATE LIMITED");
        map.put(0x000006D5, "Sensirion AG");
        map.put(0x000006D6, "JCT Healthcare Pty Ltd");
        map.put(0x000006D7, "FUBA Automotive Electronics GmbH");
        map.put(0x000006D8, "AW Company");
        map.put(0x000006D9, "Shanghai Mountain View Silicon Co.,Ltd.");
        map.put(0x000006DA, "Zliide Technologies ApS");
        map.put(0x000006DB, "Automatic Labs, Inc.");
        map.put(0x000006DC, "Industrial Network Controls, LLC");
        map.put(0x000006DD, "Intellithings Ltd.");
        map.put(0x000006DE, "Navcast, Inc.");
        map.put(0x000006DF, "Hubbell Lighting, Inc.");
        map.put(0x000006E0, "");
        map.put(0x000006E1, "Milestone AV Technologies LLC");
        map.put(0x000006E2, "Alango Technologies Ltd");
        map.put(0x000006E3, "Spinlock Ltd");
        map.put(0x000006E4, "Aluna");
        map.put(0x000006E5, "OPTEX CO.,LTD.");
        map.put(0x000006E6, "NIHON DENGYO KOUSAKU");
        map.put(0x000006E7, "VELUX A/S");
        map.put(0x000006E8, "Almendo Technologies GmbH");
        map.put(0x000006E9, "Zmartfun Electronics, Inc.");
        map.put(0x000006EA, "SafeLine Sweden AB");
        map.put(0x000006EB, "Houston Radar LLC");
        map.put(0x000006EC, "Sigur");
        map.put(0x000006ED, "J Neades Ltd");
        map.put(0x000006EE, "Avantis Systems Limited");
        map.put(0x000006EF, "ALCARE Co., Ltd.");
        map.put(0x000006F0, "Chargy Technologies, SL");
        map.put(0x000006F1, "Shibutani Co., Ltd.");
        map.put(0x000006F2, "Trapper Data AB");
        map.put(0x000006F3, "Alfred International Inc.");
        map.put(0x000006F4, "Near Field Solutions Ltd");
        map.put(0x000006F5, "Vigil Technologies Inc.");
        map.put(0x000006F6, "Vitulo Plus BV");
        map.put(0x000006F7, "WILKA Schliesstechnik GmbH");
        map.put(0x000006F8, "BodyPlus Technology Co.,Ltd");
        map.put(0x000006F9, "happybrush GmbH");
        map.put(0x000006FA, "Enequi AB");
        map.put(0x000006FB, "Sartorius AG");
        map.put(0x000006FC, "Tom Communication Industrial Co.,Ltd.");
        map.put(0x000006FD, "ESS Embedded System Solutions Inc.");
        map.put(0x000006FE, "Mahr GmbH");
        map.put(0x000006FF, "Redpine Signals Inc");
        map.put(0x00000700, "TraqFreq LLC");
        map.put(0x00000701, "PAFERS TECH");
        map.put(0x00000702, "Akciju sabiedriba \"SAF TEHNIKA\"");
        map.put(0x00000703, "Beijing Jingdong Century Trading Co., Ltd.");
        map.put(0x00000704, "JBX Designs Inc.");
        map.put(0x00000705, "AB Electrolux");
        map.put(0x00000706, "Wernher von Braun Center for ASdvanced Research");
        map.put(0x00000707, "Essity Hygiene and Health Aktiebolag");
        map.put(0x00000708, "Be Interactive Co., Ltd");
        map.put(0x00000709, "Carewear Corp.");
        map.put(0x0000070A, "");
        map.put(0x0000070B, "Element Products, Inc.");
        map.put(0x0000070C, "Beijing Winner Microelectronics Co.,Ltd");
        map.put(0x0000070D, "SmartSnugg Pty Ltd");
        map.put(0x0000070E, "FiveCo Sarl");
        map.put(0x0000070F, "California Things Inc.");
        map.put(0x00000710, "Audiodo AB");
        map.put(0x00000711, "ABAX AS");
        map.put(0x00000712, "Bull Group Company Limited");
        map.put(0x00000713, "Respiri Limited");
        map.put(0x00000714, "MindPeace Safety LLC");
        map.put(0x00000715, "Vgyan Solutions");
        map.put(0x00000716, "Altonics");
        map.put(0x00000717, "iQsquare BV");
        map.put(0x00000718, "IDIBAIX enginneering");
        map.put(0x00000719, "ECSG");
        map.put(0x0000071A, "REVSMART WEARABLE HK CO LTD");
        map.put(0x0000071B, "Precor");
        map.put(0x0000071C, "F5 Sports, Inc");
        map.put(0x0000071D, "exoTIC Systems");
        map.put(0x0000071E, "DONGGUAN HELE ELECTRONICS CO., LTD");
        map.put(0x0000071F, "Dongguan Liesheng Electronic Co.Ltd");
        map.put(0x00000720, "Oculeve, Inc.");
        map.put(0x00000721, "Clover Network, Inc.");
        map.put(0x00000722, "Xiamen Eholder Electronics Co.Ltd");
        map.put(0x00000723, "Ford Motor Company");
        map.put(0x00000724, "Guangzhou SuperSound Information Technology Co.,Ltd");
        map.put(0x00000725, "Tedee Sp. z o.o.");
        map.put(0x00000726, "PHC Corporation");
        map.put(0x00000727, "STALKIT AS");
        map.put(0x00000728, "Eli Lilly and Company");
        map.put(0x00000729, "SwaraLink Technologies");
        map.put(0x0000072A, "JMR embedded systems GmbH");
        map.put(0x0000072B, "Bitkey Inc.");
        map.put(0x0000072C, "GWA Hygiene GmbH");
        map.put(0x0000072D, "Safera Oy");
        map.put(0x0000072E, "Open Platform Systems LLC");
        map.put(0x0000072F, "OnePlus Electronics (Shenzhen) Co., Ltd.");
        map.put(0x00000730, "Wildlife Acoustics, Inc.");
        map.put(0x00000731, "ABLIC Inc.");
        map.put(0x00000732, "Dairy Tech, Inc.");
        map.put(0x00000733, "Iguanavation, Inc.");
        map.put(0x00000734, "DiUS Computing Pty Ltd");
        map.put(0x00000735, "UpRight Technologies LTD");
        map.put(0x00000736, "FrancisFund, LLC");
        map.put(0x00000737, "LLC Navitek");
        map.put(0x00000738, "Glass Security Pte Ltd");
        map.put(0x00000739, "Jiangsu Qinheng Co., Ltd.");
        map.put(0x0000073A, "Chandler Systems Inc.");
        map.put(0x0000073B, "Fantini Cosmi s.p.a.");
        map.put(0x0000073C, "Acubit ApS");
        map.put(0x0000073D, "Beijing Hao Heng Tian Tech Co., Ltd.");
        map.put(0x0000073E, "Bluepack S.R.L.");
        map.put(0x0000073F, "Beijing Unisoc Technologies Co., Ltd.");
        map.put(0x00000740, "HITIQ LIMITED");
        map.put(0x00000741, "MAC SRL");
        map.put(0x00000742, "DML LLC");
        map.put(0x00000743, "Sanofi");
        map.put(0x00000744, "SOCOMEC");
        map.put(0x00000745, "WIZNOVA, Inc.");
        map.put(0x00000746, "Seitec Elektronik GmbH");
        map.put(0x00000747, "OR Technologies Pty Ltd");
        map.put(0x00000748, "GuangZhou KuGou Computer Technology Co.Ltd");
        map.put(0x00000749, "DIAODIAO (Beijing) Technology Co., Ltd.");
        map.put(0x0000074A, "Illusory Studios LLC");
        map.put(0x0000074B, "Sarvavid Software Solutions LLP");
        map.put(0x0000074C, "iopool s.a.");
        map.put(0x0000074D, "Amtech Systems, LLC");
        map.put(0x0000074E, "EAGLE DETECTION SA");
        map.put(0x0000074F, "MEDIATECH S.R.L.");
        map.put(0x00000750, "Hamilton Professional Services of Canada Incorporated");
        map.put(0x00000751, "Changsha JEMO IC Design Co.,Ltd");
        map.put(0x00000752, "Elatec GmbH");
        map.put(0x00000753, "JLG Industries, Inc.");
        map.put(0x00000754, "Michael Parkin");
        map.put(0x00000755, "Brother Industries, Ltd");
        map.put(0x00000756, "Lumens For Less, Inc");
        map.put(0x00000757, "ELA Innovation");
        map.put(0x00000758, "umanSense AB");
        map.put(0x00000759, "Shanghai InGeek Cyber Security Co., Ltd.");
        map.put(0x0000075A, "HARMAN CO.,LTD.");
        map.put(0x0000075B, "Smart Sensor Devices AB");
        map.put(0x0000075C, "Antitronics Inc.");
        map.put(0x0000075D, "RHOMBUS SYSTEMS, INC.");
        map.put(0x0000075E, "Katerra Inc.");
        map.put(0x0000075F, "Remote Solution Co., LTD.");
        map.put(0x00000760, "Vimar SpA");
        map.put(0x00000761, "Mantis Tech LLC");
        map.put(0x00000762, "TerOpta Ltd");
        map.put(0x00000763, "PIKOLIN S.L.");
        map.put(0x00000764, "WWZN Information Technology Company Limited");
        map.put(0x00000765, "Voxx International");
        map.put(0x00000766, "ART AND PROGRAM, INC.");
        map.put(0x00000767, "NITTO DENKO ASIA TECHNICAL CENTRE PTE. LTD.");
        map.put(0x00000768, "Peloton Interactive Inc.");
        map.put(0x00000769, "Force Impact Technologies");
        map.put(0x0000076A, "Dmac Mobile Developments, LLC");
        map.put(0x0000076B, "Engineered Medical Technologies");
        map.put(0x0000076C, "Noodle Technology inc");
        map.put(0x0000076D, "Graesslin GmbH");
        map.put(0x0000076E, "WuQi technologies, Inc.");
        map.put(0x0000076F, "Successful Endeavours Pty Ltd");
        map.put(0x00000770, "InnoCon Medical ApS");
        map.put(0x00000771, "Corvex Connected Safety");
        map.put(0x00000772, "Thirdwayv Inc.");
        map.put(0x00000773, "Echoflex Solutions Inc.");
        map.put(0x00000774, "C-MAX Asia Limited");
        map.put(0x00000775, "4eBusiness GmbH");
        map.put(0x00000776, "Cyber Transport Control GmbH");
        map.put(0x00000777, "Cue");
        map.put(0x00000778, "KOAMTAC INC.");
        map.put(0x00000779, "Loopshore Oy");
        map.put(0x0000077A, "Niruha Systems Private Limited");
        map.put(0x0000077B, "AmaterZ, Inc.");
        map.put(0x0000077C, "radius co., ltd.");
        map.put(0x0000077D, "Sensority, s.r.o.");
        map.put(0x0000077E, "Sparkage Inc.");
        map.put(0x0000077F, "Glenview Software Corporation");
        map.put(0x00000780, "Finch Technologies Ltd.");
        map.put(0x00000781, "Qingping Technology (Beijing) Co., Ltd.");
        map.put(0x00000782, "DeviceDrive AS");
        map.put(0x00000783, "ESEMBER LIMITED LIABILITY COMPANY");
        map.put(0x00000784, "audifon GmbH & Co. KG");
        map.put(0x00000785, "O2 Micro, Inc.");
        map.put(0x00000786, "HLP Controls Pty Limited");
        map.put(0x00000787, "Pangaea Solution");
        map.put(0x00000788, "BubblyNet, LLC");
        map.put(0x0000078A, "The Wildflower Foundation");
        map.put(0x0000078B, "Optikam Tech Inc.");
        map.put(0x0000078C, "MINIBREW HOLDING B.V");
        map.put(0x0000078D, "Cybex GmbH");
        map.put(0x0000078E, "FUJIMIC NIIGATA, INC.");
        map.put(0x0000078F, "Hanna Instruments, Inc.");
        map.put(0x00000790, "KOMPAN A/S");
        map.put(0x00000791, "Scosche Industries, Inc.");
        map.put(0x00000792, "Provo Craft");
        map.put(0x00000793, "AEV spol. s r.o.");
        map.put(0x00000794, "The Coca-Cola Company");
        map.put(0x00000795, "GASTEC CORPORATION");
        map.put(0x00000796, "StarLeaf Ltd");
        map.put(0x00000797, "Water-i.d. GmbH");
        map.put(0x00000798, "HoloKit, Inc.");
        map.put(0x00000799, "PlantChoir Inc.");
        map.put(0x0000079A, "GuangDong Oppo Mobile Telecommunications Corp., Ltd.");
        map.put(0x0000079B, "CST ELECTRONICS (PROPRIETARY) LIMITED");
        map.put(0x0000079C, "Sky UK Limited");
        map.put(0x0000079D, "Digibale Pty Ltd");
        map.put(0x0000079E, "Smartloxx GmbH");
        map.put(0x0000079F, "Pune Scientific LLP");
        map.put(0x000007A0, "Regent Beleuchtungskorper AG");
        map.put(0x000007A1, "Apollo Neuroscience, Inc.");
        map.put(0x000007A2, "Roku, Inc.");
        map.put(0x000007A3, "Comcast Cable");
        map.put(0x000007A4, "Xiamen Mage Information Technology Co., Ltd.");
        map.put(0x000007A5, "RAB Lighting, Inc.");
        map.put(0x000007A6, "Musen Connect, Inc.");
        map.put(0x000007A7, "Zume, Inc.");
        map.put(0x000007A8, "conbee GmbH");
        map.put(0x000007A9, "Bruel & Kjaer Sound & Vibration");
        map.put(0x000007AA, "The Kroger Co.");
        map.put(0x000007AB, "Granite River Solutions, Inc.");
        map.put(0x000007AC, "LoupeDeck Oy");
        map.put(0x000007AD, "New H3C Technologies Co.,Ltd");
        map.put(0x000007AE, "Aurea Solucoes Tecnologicas Ltda.");
        map.put(0x000007AF, "Hong Kong Bouffalo Lab Limited");
        map.put(0x000007B0, "GV Concepts Inc.");
        map.put(0x000007B1, "Thomas Dynamics, LLC");
        map.put(0x000007B2, "Moeco IOT Inc.");
        map.put(0x000007B3, "2N TELEKOMUNIKACE a.s.");
        map.put(0x000007B4, "Hormann KG Antriebstechnik");
        map.put(0x000007B5, "CRONO CHIP, S.L.");
        map.put(0x000007B6, "Soundbrenner Limited");
        map.put(0x000007B7, "ETABLISSEMENTS GEORGES RENAULT");
        map.put(0x000007B8, "iSwip");
        map.put(0x000007B9, "Epona Biotec Limited");
        map.put(0x000007BA, "Battery-Biz Inc.");
        map.put(0x000007BB, "EPIC S.R.L.");
        map.put(0x000007BC, "KD CIRCUITS LLC");
        map.put(0x000007BD, "Genedrive Diagnostics Ltd");
        map.put(0x000007BE, "Axentia Technologies AB");
        map.put(0x000007BF, "REGULA Ltd.");
        map.put(0x000007C0, "Biral AG");
        map.put(0x000007C1, "A.W. Chesterton Company");
        map.put(0x000007C2, "Radinn AB");
        map.put(0x000007C3, "CIMTechniques, Inc.");
        map.put(0x000007C4, "Johnson Health Tech NA");
        map.put(0x000007C5, "June Life, Inc.");
        map.put(0x000007C6, "Bluenetics GmbH");
        map.put(0x000007C7, "iaconicDesign Inc.");
        map.put(0x000007C8, "WRLDS Creations AB");
        map.put(0x000007C9, "Skullcandy, Inc.");
        map.put(0x000007CA, "Modul-System HH AB");
        map.put(0x000007CB, "West Pharmaceutical Services, Inc.");
        map.put(0x000007CC, "Barnacle Systems Inc.");
        map.put(0x000007CD, "Smart Wave Technologies Canada Inc");
        map.put(0x000007CE, "Shanghai Top-Chip Microelectronics Tech. Co., LTD");
        map.put(0x000007CF, "NeoSensory, Inc.");

        COMPANY_MAPPING = Collections.synchronizedMap(Collections.unmodifiableMap(map));
    }

    /**
     * https://www.bluetooth.com/specifications/assigned-numbers/units/
     */
    public static final Map<UUID, String> UNITS_MAPPING;

    static {
        Map<UUID, String> map = new HashMap<>();
        map.put(UnitsUUID.UNITLESS_UNITS, "unitless");
        map.put(UnitsUUID.LENGTH_METRE_UNITS, "length (metre)");
        map.put(UnitsUUID.MASS_KILOGRAM_UNITS, "mass (kilogram)");
        map.put(UnitsUUID.TIME_SECOND_UNITS, "time (second)");
        map.put(UnitsUUID.ELECTRIC_CURRENT_AMPERE_UNITS, "electric current (ampere)");
        map.put(UnitsUUID.THERMODYNAMIC_TEMPERATURE_KELVIN_UNITS, "thermodynamic temperature (kelvin)");
        map.put(UnitsUUID.AMOUNT_OF_SUBSTANCE_MOLE_UNITS, "amount of substance (mole)");
        map.put(UnitsUUID.LUMINOUS_INTENSITY_CANDELA_UNITS, "luminous intensity (candela)");
        map.put(UnitsUUID.AREA_SQUARE_METRES_UNITS, "area (square metres)");
        map.put(UnitsUUID.VOLUME_CUBIC_METRES_UNITS, "volume (cubic metres)");
        map.put(UnitsUUID.VELOCITY_METRES_PER_SECOND_UNITS, "velocity (metres per second)");
        map.put(UnitsUUID.ACCELERATION_METRES_PER_SECOND_SQUARED_UNITS, "acceleration (metres per second squared)");
        map.put(UnitsUUID.WAVENUMBER_RECIPROCAL_METRE_UNITS, "wavenumber (reciprocal metre)");
        map.put(UnitsUUID.DENSITY_KILOGRAM_PER_CUBIC_METRE_UNITS, "density (kilogram per cubic metre)");
        map.put(UnitsUUID.SURFACE_DENSITY_KILOGRAM_PER_SQUARE_METRE_UNITS, "surface density (kilogram per square metre)");
        map.put(UnitsUUID.SPECIFIC_VOLUME_CUBIC_METRE_PER_KILOGRAM_UNITS, "specific volume (cubic metre per kilogram)");
        map.put(UnitsUUID.CURRENT_DENSITY_AMPERE_PER_SQUARE_METRE_UNITS, "current density (ampere per square metre)");
        map.put(UnitsUUID.MAGNETIC_FIELD_STRENGTH_AMPERE_PER_METRE_UNITS, "magnetic field strength (ampere per metre)");
        map.put(UnitsUUID.AMOUNT_CONCENTRATION_MOLE_PER_CUBIC_METRE_UNITS, "amount concentration (mole per cubic metre)");
        map.put(UnitsUUID.MASS_CONCENTRATION_KILOGRAM_PER_CUBIC_METRE_UNITS, "mass concentration (kilogram per cubic metre)");
        map.put(UnitsUUID.LUMINANCE_CANDELA_PER_SQUARE_METRE_UNITS, "luminance (candela per square metre)");
        map.put(UnitsUUID.REFRACTIVE_INDEX_UNITS, "refractive index");
        map.put(UnitsUUID.RELATIVE_PERMEABILITY_UNITS, "relative permeability");
        map.put(UnitsUUID.PLANE_ANGLE_RADIAN_UNITS, "plane angle (radian)");
        map.put(UnitsUUID.SOLID_ANGLE_STERADIAN_UNITS, "solid angle (steradian)");
        map.put(UnitsUUID.FREQUENCY_HERTZ_UNITS, "frequency (hertz)");
        map.put(UnitsUUID.FORCE_NEWTON_UNITS, "force (newton)");
        map.put(UnitsUUID.PRESSURE_PASCAL_UNITS, "pressure (pascal)");
        map.put(UnitsUUID.ENERGY_JOULE_UNITS, "energy (joule)");
        map.put(UnitsUUID.POWER_WATT_UNITS, "power (watt)");
        map.put(UnitsUUID.ELECTRIC_CHARGE_COULOMB_UNITS, "electric charge (coulomb)");
        map.put(UnitsUUID.ELECTRIC_POTENTIAL_DIFFERENCE_VOLT_UNITS, "electric potential difference (volt)");
        map.put(UnitsUUID.CAPACITANCE_FARAD_UNITS, "capacitance (farad)");
        map.put(UnitsUUID.ELECTRIC_RESISTANCE_OHM_UNITS, "electric resistance (ohm)");
        map.put(UnitsUUID.ELECTRIC_CONDUCTANCE_SIEMENS_UNITS, "electric conductance (siemens)");
        map.put(UnitsUUID.MAGNETIC_FLUX_WEBER_UNITS, "magnetic flux (weber)");
        map.put(UnitsUUID.MAGNETIC_FLUX_DENSITY_TESLA_UNITS, "magnetic flux density (tesla)");
        map.put(UnitsUUID.INDUCTANCE_HENRY_UNITS, "inductance (henry)");
        map.put(UnitsUUID.THERMODYNAMIC_TEMPERATURE_DEGREE_CELSIUS_UNITS, "Celsius temperature (degree Celsius)");
        map.put(UnitsUUID.LUMINOUS_FLUX_LUMEN_UNITS, "luminous flux (lumen)");
        map.put(UnitsUUID.ILLUMINANCE_LUX_UNITS, "illuminance (lux)");
        map.put(UnitsUUID.ACTIVITY_REFERRED_TO_A_RADIONUCLIDE_BECQUEREL_UNITS, "activity referred to a radionuclide (becquerel)");
        map.put(UnitsUUID.ABSORBED_DOSE_GRAY_UNITS, "absorbed dose (gray)");
        map.put(UnitsUUID.DOSE_EQUIVALENT_SIEVERT_UNITS, "dose equivalent (sievert)");
        map.put(UnitsUUID.CATALYTIC_ACTIVITY_KATAL_UNITS, "catalytic activity (katal)");
        map.put(UnitsUUID.DYNAMIC_VISCOSITY_PASCAL_SECOND_UNITS, "dynamic viscosity (pascal second)");
        map.put(UnitsUUID.MOMENT_OF_FORCE_NEWTON_METRE_UNITS, "moment of force (newton metre)");
        map.put(UnitsUUID.SURFACE_TENSION_NEWTON_PER_METRE_UNITS, "surface tension (newton per metre)");
        map.put(UnitsUUID.ANGULAR_VELOCITY_RADIAN_PER_SECOND_UNITS, "angular velocity (radian per second)");
        map.put(UnitsUUID.ANGULAR_ACCELERATION_RADIAN_PER_SECOND_SQUARED_UNITS, "angular acceleration (radian per second squared)");
        map.put(UnitsUUID.HEAT_FLUX_DENSITY_WATT_PER_SQUARE_METRE_UNITS, "heat flux density (watt per square metre)");
        map.put(UnitsUUID.HEAT_CAPACITY_JOULE_PER_KELVIN_UNITS, "heat capacity (joule per kelvin)");
        map.put(UnitsUUID.SPECIFIC_HEAT_CAPACITY_JOULE_PER_KILOGRAM_KELVIN_UNITS, "specific heat capacity (joule per kilogram kelvin)");
        map.put(UnitsUUID.SPECIFIC_ENERGY_JOULE_PER_KILOGRAM_UNITS, "specific energy (joule per kilogram)");
        map.put(UnitsUUID.THERMAL_CONDUCTIVITY_WATT_PER_METRE_KELVIN_UNITS, "thermal conductivity (watt per metre kelvin)");
        map.put(UnitsUUID.ENERGY_DENSITY_JOULE_PER_CUBIC_METRE_UNITS, "energy density (joule per cubic metre)");
        map.put(UnitsUUID.ELECTRIC_FIELD_STRENGTH_VOLT_PER_METRE_UNITS, "electric field strength (volt per metre)");
        map.put(UnitsUUID.ELECTRIC_CHARGE_DENSITY_COULOMB_PER_CUBIC_METRE_UNITS, "electric charge density (coulomb per cubic metre)");
        map.put(UnitsUUID.SURFACE_CHARGE_DENSITY_COULOMB_PER_SQUARE_METRE_UNITS, "surface charge density (coulomb per square metre)");
        map.put(UnitsUUID.ELECTRIC_FLUX_DENSITY_COULOMB_PER_SQUARE_METRE_UNITS, "electric flux density (coulomb per square metre)");
        map.put(UnitsUUID.PERMITTIVITY_FARAD_PER_METRE_UNITS, "permittivity (farad per metre)");
        map.put(UnitsUUID.PERMEABILITY_HENRY_PER_METRE_UNITS, "permeability (henry per metre)");
        map.put(UnitsUUID.MOLAR_ENERGY_JOULE_PER_MOLE_UNITS, "molar energy (joule per mole)");
        map.put(UnitsUUID.MOLAR_ENTROPY_JOULE_PER_MOLE_KELVIN_UNITS, "molar entropy (joule per mole kelvin)");
        map.put(UnitsUUID.EXPOSURE_COULOMB_PER_KILOGRAM_UNITS, "exposure (coulomb per kilogram)");
        map.put(UnitsUUID.ABSORBED_DOSE_RATE_GRAY_PER_SECOND_UNITS, "absorbed dose rate (gray per second)");
        map.put(UnitsUUID.RADIANT_INTENSITY_WATT_PER_STERADIAN_UNITS, "radiant intensity (watt per steradian)");
        map.put(UnitsUUID.RADIANCE_WATT_PER_SQUARE_METRE_STERADIAN_UNITS, "radiance (watt per square metre steradian)");
        map.put(UnitsUUID.CATALYTIC_ACTIVITY_CONCENTRATION_KATAL_PER_CUBIC_METRE_UNITS, "catalytic activity concentration (katal per cubic metre)");
        map.put(UnitsUUID.TIME_MINUTE_UNITS, "time (minute)");
        map.put(UnitsUUID.TIME_HOUR_UNITS, "time (hour)");
        map.put(UnitsUUID.TIME_DAY_UNITS, "time (day)");
        map.put(UnitsUUID.PLANE_ANGLE_DEGREE_UNITS, "plane angle (degree)");
        map.put(UnitsUUID.PLANE_ANGLE_MINUTE_UNITS, "plane angle (minute)");
        map.put(UnitsUUID.PLANE_ANGLE_SECOND_UNITS, "plane angle (second)");
        map.put(UnitsUUID.AREA_HECTARE_UNITS, "area (hectare)");
        map.put(UnitsUUID.VOLUME_LITRE_UNITS, "volume (litre)");
        map.put(UnitsUUID.MASS_TONNE_UNITS, "mass (tonne)");
        map.put(UnitsUUID.PRESSURE_BAR_UNITS, "pressure (bar)");
        map.put(UnitsUUID.PRESSURE_MILLIMETRE_OF_MERCURY_UNITS, "pressure (millimetre of mercury)");
        map.put(UnitsUUID.LENGTH_ÅNGSTRÖM_UNITS, "length (ångström)");
        map.put(UnitsUUID.LENGTH_NAUTICAL_MILE_UNITS, "length (nautical mile)");
        map.put(UnitsUUID.AREA_BARN_UNITS, "area (barn)");
        map.put(UnitsUUID.VELOCITY_KNOT_UNITS, "velocity (knot)");
        map.put(UnitsUUID.LOGARITHMIC_RADIO_QUANTITY_NEPER_UNITS, "logarithmic radio quantity (neper)");
        map.put(UnitsUUID.LOGARITHMIC_RADIO_QUANTITY_BEL_UNITS, "logarithmic radio quantity (bel)");
        map.put(UnitsUUID.LENGTH_YARD_UNITS, "length (yard)");
        map.put(UnitsUUID.LENGTH_PARSEC_UNITS, "length (parsec)");
        map.put(UnitsUUID.LENGTH_INCH_UNITS, "length (inch)");
        map.put(UnitsUUID.LENGTH_FOOT_UNITS, "length (foot)");
        map.put(UnitsUUID.LENGTH_MILE_UNITS, "length (mile)");
        map.put(UnitsUUID.PRESSURE_POUND_FORCE_PER_SQUARE_INCH_UNITS, "pressure (pound-force per square inch)");
        map.put(UnitsUUID.VELOCITY_KILOMETRE_PER_HOUR_UNITS, "velocity (kilometre per hour)");
        map.put(UnitsUUID.VELOCITY_MILE_PER_HOUR_UNITS, "velocity (mile per hour)");
        map.put(UnitsUUID.ANGULAR_VELOCITY_REVOLUTION_PER_MINUTE_UNITS, "angular velocity (revolution per minute)");
        map.put(UnitsUUID.ENERGY_GRAM_CALORIE_UNITS, "energy (gram calorie)");
        map.put(UnitsUUID.ENERGY_KILOGRAM_CALORIE_UNITS, "energy (kilogram calorie)");
        map.put(UnitsUUID.ENERGY_KILOWATT_HOUR_UNITS, "energy (kilowatt hour)");
        map.put(UnitsUUID.THERMODYNAMIC_TEMPERATURE_DEGREE_FAHRENHEIT_UNITS, "thermodynamic temperature (degree Fahrenheit)");
        map.put(UnitsUUID.PERCENTAGE_UNITS, "percentage");
        map.put(UnitsUUID.PER_MILLE_UNITS, "per mille");
        map.put(UnitsUUID.PERIOD_BEATS_PER_MINUTE_UNITS, "period (beats per minute)");
        map.put(UnitsUUID.ELECTRIC_CHARGE_AMPERE_HOURS_UNITS, "electric charge (ampere hours)");
        map.put(UnitsUUID.MASS_DENSITY_MILLIGRAM_PER_DECILITRE_UNITS, "mass density (milligram per decilitre)");
        map.put(UnitsUUID.MASS_DENSITY_MILLIMOLE_PER_LITRE_UNITS, "mass density (millimole per litre)");
        map.put(UnitsUUID.TIME_YEAR_UNITS, "time (year)");
        map.put(UnitsUUID.TIME_MONTH_UNITS, "time (month)");
        map.put(UnitsUUID.CONCENTRATION_COUNT_PER_CUBIC_METRE_UNITS, "concentration (count per cubic metre)");
        map.put(UnitsUUID.IRRADIANCE_WATT_PER_SQUARE_METRE_UNITS, "irradiance (watt per square metre)");
        map.put(UnitsUUID.TRANSFER_RATE_MILLILITER_PER_KILOGRAM_PER_MINUTE_UNITS, "milliliter (per kilogram per minute)");
        map.put(UnitsUUID.MASS_POUND_UNITS, "mass (pound)");
        map.put(UnitsUUID.METABOLIC_EQUIVALENT_UNITS, "metabolic equivalent");
        map.put(UnitsUUID.STEP_PER_MINUTE_UNITS, "step (per minute)");
        map.put(UnitsUUID.STROKE_PER_MINUTE_UNITS, "stroke (per minute)");
        map.put(UnitsUUID.VELOCITY_KILOMETER_PER_MINUTE_UNITS, "pace (kilometre per minute)");
        map.put(UnitsUUID.LUMINOUS_EFFICACY_LUMEN_PER_WATT_UNITS, "luminous efficacy (lumen per watt)");
        map.put(UnitsUUID.LUMINOUS_ENERGY_LUMEN_HOUR_UNITS, "luminous energy (lumen hour)");
        map.put(UnitsUUID.LUMINOUS_EXPOSURE_LUX_HOUR_UNITS, "luminous exposure (lux hour)");
        map.put(UnitsUUID.MASS_FLOW_GRAM_PER_SECOND_UNITS, "mass flow (gram per second)");
        map.put(UnitsUUID.VOLUME_FLOW_LITRE_PER_SECOND_UNITS, "volume flow (litre per second)");
        map.put(UnitsUUID.SOUND_PRESSURE_DECIBEL_SPL_UNITS, "sound pressure (decibel)");
        map.put(UnitsUUID.CONCENTRATION_PARTS_PER_MILLION_UNITS, "concentration (parts per million)");
        map.put(UnitsUUID.CONCENTRATION_PARTS_PER_BILLION_UNITS, "concentration (parts per billion)");

        UNITS_MAPPING = Collections.synchronizedMap(Collections.unmodifiableMap(map));
    }

    /**
     * BLE GATT Servies UUID
     */
    public static final class ServiceUUID {

        /**
         * Generic Access Service (Service UUID: 0x1800)
         */
        public static final UUID GENERIC_ACCESS_SERVICE = UUID.fromString("00001800-0000-1000-8000-00805f9b34fb");

        /**
         * Generic Attribute Service (Service UUID: 0x1801)
         */
        public static final UUID GENERIC_ATTRIBUTE_SERVICE = UUID.fromString("00001801-0000-1000-8000-00805f9b34fb");

        /**
         * Device Information Service (Service UUID: 0x180A)
         */
        public static final UUID DEVICE_INFORMATION_SERVICE = UUID.fromString("0000180a-0000-1000-8000-00805f9b34fb");

        /**
         * Battery Service (Service UUID: 0x180f)
         */
        public static final UUID BATTERY_SERVICE = UUID.fromString("0000180f-0000-1000-8000-00805f9b34fb");

        /**
         * Current Time Service (Service UUID: 0x1805)
         */
        public static final UUID CURRENT_TIME_SERVICE = UUID.fromString("00001805-0000-1000-8000-00805f9b34fb");

        /**
         * Weight Scale Service (Service UUID: 0x180d)
         */
        public static final UUID WEIGHT_SCALE_SERVICE = UUID.fromString("0000181d-0000-1000-8000-00805f9b34fb");

        /**
         * User Data Service (Service UUID: 0x180c)
         */
        public static final UUID USER_DATA_SERVICE = UUID.fromString("0000181c-0000-1000-8000-00805f9b34fb");

        /**
         * Body Composition Service (Service UUID: 0x181b)
         */
        public static final UUID BODY_COMPOSITION_SERVICE = UUID.fromString("0000181b-0000-1000-8000-00805f9b34fb");

        /**
         * Blood Pressure Service (Service UUID: 0x1810)
         */
        public static final UUID BLOOD_PRESSURE_SERVICE = UUID.fromString("00001810-0000-1000-8000-00805f9b34fb");

        /**
         * Heart Rate Service (Service UUID: 0x181d)
         */
        public static final UUID HEART_RATE_SERVICE = UUID.fromString("0000181d-0000-1000-8000-00805f9b34fb");

        /**
         * Health Thermometer Service (Service UUID: 0x1809)
         */
        public static final UUID HEALTH_THERMOMETER_SERVICE = UUID.fromString("00001809-0000-1000-8000-00805f9b34fb");

        /**
         * Link Loss Service (Service UUID: 0x1803)
         */
        public static final UUID LINK_LOSS_SERVICE = UUID.fromString("00001803-0000-1000-8000-00805f9b34fb");

        /**
         * Immediate Alert Service (Service UUID: 0x1802)
         */
        public static final UUID IMMEDIATE_ALERT_SERVICE = UUID.fromString("00001802-0000-1000-8000-00805f9b34fb");

        /**
         * Tx Power Service (Service UUID: 0x1804)
         */
        public static final UUID TX_POWER_SERVICE = UUID.fromString("00001804-0000-1000-8000-00805f9b34fb");

        /**
         * Next DST Change Service (Service UUID: 0x1807)
         */
        public static final UUID NEXT_DST_CHANGE_SERVICE = UUID.fromString("00001807-0000-1000-8000-00805f9b34fb");

        /**
         * Reference Time Update Service (Service UUID: 0x1806)
         */
        public static final UUID REFERENCE_TIME_UPDATE_SERVICE = UUID.fromString("00001806-0000-1000-8000-00805f9b34fb");

        /**
         * Location and Navigation (Service UUID: 0x1819)
         */
        public static final UUID LOCATION_AND_NAVIGATION_SERVICE = UUID.fromString("00001819-0000-1000-8000-00805f9b34fb");

        /**
         * Phone Alert Status Service (Service UUID: 0x180E)
         */
        public static final UUID PHONE_ALERT_STATUS_SERVICE = UUID.fromString("0000180e-0000-1000-8000-00805f9b34fb");

        /**
         * Alert Notification Service (Service UUID: 0x1811)
         */
        public static final UUID ALERT_NOTIFICATION_SERVICE = UUID.fromString("00001811-0000-1000-8000-00805f9b34fb");

        /**
         * Automation IO (Service UUID: 0x1815)
         */
        public static final UUID AUTOMATION_IO_SERVICE = UUID.fromString("00001815-0000-1000-8000-00805f9b34fb");

        /**
         * Cycling Power (Service UUID: 0x1818)
         */
        public static final UUID CYCLING_POWER_SERVICE = UUID.fromString("00001818-0000-1000-8000-00805f9b34fb");

        /**
         * Cycling Speed and Cadence (Service UUID: 0x1816)
         */
        public static final UUID CYCLING_SPEED_AND_CADENCE_SERVICE = UUID.fromString("00001816-0000-1000-8000-00805f9b34fb");

        /**
         * Running Speed and Cadence (Service UUID: 0x1814)
         */
        public static final UUID RUNNING_SPEED_AND_CADENCE_SERVICE = UUID.fromString("00001814-0000-1000-8000-00805f9b34fb");

        /**
         * Fitness Machine (Service UUID: 0x1826)
         */
        public static final UUID FITNESS_MACHINE_SERVICE = UUID.fromString("00001826-0000-1000-8000-00805f9b34fb");

        /**
         * Human Interface Device (Service UUID: 0x1812)
         */
        public static final UUID HUMAN_INTERFACE_DEVICE_SERVICE = UUID.fromString("00001812-0000-1000-8000-00805f9b34fb");

        /**
         * Scan Parameters (Service UUID: 0x1813)
         */
        public static final UUID SCAN_PARAMETERS_SERVICE = UUID.fromString("00001813-0000-1000-8000-00805f9b34fb");

        /**
         * Indoor Positioning (Service UUID: 0x1821)
         */
        public static final UUID INDOOR_POSITIONING_SERVICE = UUID.fromString("00001821-0000-1000-8000-00805f9b34fb");

        /**
         * HTTP Proxy (Service UUID: 0x1823)
         */
        public static final UUID HTTP_PROXY_SERVICE = UUID.fromString("00001823-0000-1000-8000-00805f9b34fb");

        /**
         * Bond Management Service (Service UUID: 0x181E)
         */
        public static final UUID BOND_MANAGEMENT_SERVICE = UUID.fromString("0000181E-0000-1000-8000-00805f9b34fb");

        /**
         * Reconnection Configuration (Service UUID: 0x1829)
         */
        public static final UUID RECONNECTION_CONFIGURATION_SERVICE = UUID.fromString("00001829-0000-1000-8000-00805f9b34fb");

        /**
         * Transport Discovery (Service UUID: 0x1824)
         */
        public static final UUID TRANSPORT_DISCOVERY_SERVICE = UUID.fromString("00001824-0000-1000-8000-00805f9b34fb");

        /**
         * Environmental Sensing (Service UUID: 0x181A)
         */
        public static final UUID ENVIRONMENTAL_SENSING_SERVICE = UUID.fromString("0000181A-0000-1000-8000-00805f9b34fb");
    }

    /**
     * BLE GATT Characteristics UUID
     */
    public static final class CharacteristicUUID {

        // Generic Access (Service UUID: 0x1800)

        /**
         * Device Name (Characteristic UUID: 0x2A00)
         */
        public static final UUID DEVICE_NAME_CHARACTERISTIC = UUID.fromString("00002A00-0000-1000-8000-00805f9b34fb");

        /**
         * Appearance (Characteristic UUID: 0x2A01)
         */
        public static final UUID APPEARANCE_CHARACTERISTIC = UUID.fromString("00002A01-0000-1000-8000-00805f9b34fb");

        /**
         * Peripheral Preferred Connection Parameters (Characteristic UUID: 0x2A04)
         */
        public static final UUID PERIPHERAL_PREFERRED_CONNECTION_PARAMETERS_CHARACTERISTIC = UUID.fromString("00002A04-0000-1000-8000-00805f9b34fb");

        /**
         * Central Address Resolution (Characteristic UUID: 0x2AA6)
         */
        public static final UUID CENTRAL_ADDRESS_RESOLUTION_CHARACTERISTIC = UUID.fromString("00002AA6-0000-1000-8000-00805f9b34fb");

        /**
         * Resolvable Private Address Only (Characteristic UUID: 0x2AC9)
         */
        public static final UUID RESOLVABLE_PRIVATE_ADDRESS_ONLY_CHARACTERISTIC = UUID.fromString("00002AC9-0000-1000-8000-00805f9b34fb");

        /**
         * Reconnection Address (Characteristic UUID: 0x2A03)
         */
        public static final UUID RECONNECTION_ADDRESS_CHARACTERISTIC = UUID.fromString("00002A03-0000-1000-8000-00805f9b34fb");

        /**
         * Peripheral Privacy Flag (Characteristic UUID: 0x2A02)
         */
        public static final UUID PERIPHERAL_PRIVACY_FLAG_CHARACTERISTIC = UUID.fromString("00002A02-0000-1000-8000-00805f9b34fb");

        // Generic Attribute (Service UUID: 0x1801)

        /**
         * Service Changed (Characteristic UUID: 0x2A05)
         */
        public static final UUID SERVICE_CHANGED_CHARACTERISTIC = UUID.fromString("00002A05-0000-1000-8000-00805f9b34fb");

        /**
         * Client Supported Features (Characteristic UUID: 0x2B29)
         */
        public static final UUID CLIENT_SUPPORTED_FEATURES_CHARACTERISTIC = UUID.fromString("00002B29-0000-1000-8000-00805f9b34fb");

        /**
         * Database Hash (Characteristic UUID: 0x2B29)
         */
        public static final UUID DATABASE_HASH_CHARACTERISTIC = UUID.fromString("00002B29-0000-1000-8000-00805f9b34fb");

        // Device Information (Service UUID: 0x180A)

        /**
         * Manufacturer Name String (Characteristic UUID: 0x2A29)
         */
        public static final UUID MANUFACTURER_NAME_STRING_CHARACTERISTIC = UUID.fromString("00002A29-0000-1000-8000-00805f9b34fb");

        /**
         * Model Number String (Characteristic UUID: 0x2A24)
         */
        public static final UUID MODEL_NUMBER_STRING_CHARACTERISTIC = UUID.fromString("00002A24-0000-1000-8000-00805f9b34fb");

        /**
         * Serial Number String (Characteristic UUID: 0x2A25)
         */
        public static final UUID SERIAL_NUMBER_STRING_CHARACTERISTIC = UUID.fromString("00002A25-0000-1000-8000-00805f9b34fb");

        /**
         * Hardware Revision String (Characteristic UUID: 0x2A27)
         */
        public static final UUID HARDWARE_REVISION_STRING_CHARACTERISTIC = UUID.fromString("00002A27-0000-1000-8000-00805f9b34fb");

        /**
         * Firmware Revision String (Characteristic UUID: 0x2A26)
         */
        public static final UUID FIRMWARE_REVISION_STRING_CHARACTERISTIC = UUID.fromString("00002A26-0000-1000-8000-00805f9b34fb");

        /**
         * Software Revision String (Characteristic UUID: 0x2A28)
         */
        public static final UUID SOFTWARE_REVISION_STRING_CHARACTERISTIC = UUID.fromString("00002A28-0000-1000-8000-00805f9b34fb");

        /**
         * System ID (Characteristic UUID: 0x2A23)
         */
        public static final UUID SYSTEM_ID_CHARACTERISTIC = UUID.fromString("00002A23-0000-1000-8000-00805f9b34fb");

        /**
         * IEEE 11073-20601 Regulatory Certification Data List (Characteristic UUID: 0x2A2A)
         */
        public static final UUID IEEE_11073_20601_REGULATORY_CERTIFICATION_DATA_LIST_CHARACTERISTIC = UUID.fromString("00002A2A-0000-1000-8000-00805f9b34fb");

        /**
         * PnP ID (Characteristic UUID: 0x2A50)
         */
        public static final UUID PNP_ID_CHARACTERISTIC = UUID.fromString("00002A50-0000-1000-8000-00805f9b34fb");

        // Battery Service (Service UUID: 0x180F)

        /**
         * Battery Level (Characteristic UUID: 0x2A19)
         */
        public static final UUID BATTERY_LEVEL_CHARACTERISTIC = UUID.fromString("00002A19-0000-1000-8000-00805f9b34fb");

        // Current Time Service (Service UUID: 0x1805)

        /**
         * Current Time (Characteristic UUID: 0x2A2B)
         */
        public static final UUID CURRENT_TIME_CHARACTERISTIC = UUID.fromString("00002A2B-0000-1000-8000-00805f9b34fb");

        /**
         * Local Time Information (Characteristic UUID: 0x2A0F)
         */
        public static final UUID LOCAL_TIME_INFORMATION_CHARACTERISTIC = UUID.fromString("00002A0F-0000-1000-8000-00805f9b34fb");

        /**
         * Reference Time Information (Characteristic UUID: 0x2A14)
         */
        public static final UUID REFERENCE_TIME_INFORMATION_CHARACTERISTIC = UUID.fromString("00002A14-0000-1000-8000-00805f9b34fb");

        // Weight Scale (Service UUID: 0x181D)

        /**
         * Weight Scale Feature (Characteristic UUID: 0x2A9E)
         */
        public static final UUID WEIGHT_SCALE_FEATURE_CHARACTERISTIC = UUID.fromString("00002A9E-0000-1000-8000-00805f9b34fb");

        /**
         * Weight Measurement (Characteristic UUID: 0x2A9D)
         */
        public static final UUID WEIGHT_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002A9D-0000-1000-8000-00805f9b34fb");

        // User Data (Service UUID: 0x181C)

        /**
         * First Name (Characteristic UUID: 0x2A8A)
         */
        public static final UUID FIRST_NAME_CHARACTERISTIC = UUID.fromString("00002A8A-0000-1000-8000-00805f9b34fb");

        /**
         * Last Name (Characteristic UUID: 0x2A90)
         */
        public static final UUID LAST_NAME_CHARACTERISTIC = UUID.fromString("00002A90-0000-1000-8000-00805f9b34fb");

        /**
         * Email Address (Characteristic UUID: 0x2A87)
         */
        public static final UUID EMAIL_ADDRESS_CHARACTERISTIC = UUID.fromString("00002A87-0000-1000-8000-00805f9b34fb");

        /**
         * Age (Characteristic UUID: 0x2A80)
         */
        public static final UUID AGE_CHARACTERISTIC = UUID.fromString("00002A80-0000-1000-8000-00805f9b34fb");

        /**
         * Date of Birth (Characteristic UUID: 0x2A85)
         */
        public static final UUID DATE_OF_BIRTH_CHARACTERISTIC = UUID.fromString("00002A85-0000-1000-8000-00805f9b34fb");

        /**
         * Gender (Characteristic UUID: 0x2A8C)
         */
        public static final UUID GENDER_CHARACTERISTIC = UUID.fromString("00002A8C-0000-1000-8000-00805f9b34fb");

        /**
         * Weight (Characteristic UUID: 0x2A98)
         */
        public static final UUID WEIGHT_CHARACTERISTIC = UUID.fromString("00002A98-0000-1000-8000-00805f9b34fb");

        /**
         * Height (Characteristic UUID: 0x2A8E)
         */
        public static final UUID HEIGHT_CHARACTERISTIC = UUID.fromString("00002A8E-0000-1000-8000-00805f9b34fb");

        /**
         * VO2 Max (Characteristic UUID: 0x2A96)
         */
        public static final UUID V_O2_MAX_CHARACTERISTIC = UUID.fromString("00002A96-0000-1000-8000-00805f9b34fb");

        /**
         * Heart Rate Max (Characteristic UUID: 0x2A8D)
         */
        public static final UUID HEART_RATE_MAX_CHARACTERISTIC = UUID.fromString("00002A8D-0000-1000-8000-00805f9b34fb");

        /**
         * Resting Heart Rate (Characteristic UUID: 0x2A92)
         */
        public static final UUID RESTING_HEART_RATE_CHARACTERISTIC = UUID.fromString("00002A92-0000-1000-8000-00805f9b34fb");

        /**
         * Maximum Recommended Heart Rate (Characteristic UUID: 0x2A91)
         */
        public static final UUID MAXIMUM_RECOMMENDED_HEART_RATE_CHARACTERISTIC = UUID.fromString("00002A91-0000-1000-8000-00805f9b34fb");

        /**
         * Aerobic Threshold (Characteristic UUID: 0x2A7F)
         */
        public static final UUID AEROBIC_THRESHOLD_CHARACTERISTIC = UUID.fromString("00002A7F-0000-1000-8000-00805f9b34fb");

        /**
         * Anaerobic Threshold (Characteristic UUID: 0x2A83)
         */
        public static final UUID ANAEROBIC_THRESHOLD_CHARACTERISTIC = UUID.fromString("00002A83-0000-1000-8000-00805f9b34fb");

        /**
         * Sport Type for Aerobic and Anaerobic Thresholds (Characteristic UUID: 0x2A93)
         */
        public static final UUID SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CHARACTERISTIC = UUID.fromString("00002A93-0000-1000-8000-00805f9b34fb");

        /**
         * Date of Threshold Assessment (Characteristic UUID: 0x2A86)
         */
        public static final UUID DATE_OF_THRESHOLD_ASSESSMENT_CHARACTERISTIC = UUID.fromString("00002A86-0000-1000-8000-00805f9b34fb");

        /**
         * Waist Circumference (Characteristic UUID: 0x2A97)
         */
        public static final UUID WAIST_CIRCUMFERENCE_CHARACTERISTIC = UUID.fromString("00002A97-0000-1000-8000-00805f9b34fb");

        /**
         * Hip Circumference (Characteristic UUID: 0x2A8F)
         */
        public static final UUID HIP_CIRCUMFERENCE_CHARACTERISTIC = UUID.fromString("00002A8F-0000-1000-8000-00805f9b34fb");

        /**
         * Fat Burn Heart Rate Lower Limit (Characteristic UUID: 0x2A88)
         */
        public static final UUID FAT_BURN_HEART_RATE_LOWER_LIMIT_CHARACTERISTIC = UUID.fromString("00002A88-0000-1000-8000-00805f9b34fb");

        /**
         * Fat Burn Heart Rate Upper Limit (Characteristic UUID: 0x2A89)
         */
        public static final UUID FAT_BURN_HEART_RATE_UPPER_LIMIT_CHARACTERISTIC = UUID.fromString("00002A89-0000-1000-8000-00805f9b34fb");

        /**
         * Aerobic Heart Rate Lower Limit (Characteristic UUID: 0x2A7E)
         */
        public static final UUID AEROBIC_HEART_RATE_LOWER_LIMIT_CHARACTERISTIC = UUID.fromString("00002A7E-0000-1000-8000-00805f9b34fb");

        /**
         * Aerobic Heart Rate Upper Limit (Characteristic UUID: 0x2A84)
         */
        public static final UUID AEROBIC_HEART_RATE_UPPER_LIMIT_CHARACTERISTIC = UUID.fromString("00002A84-0000-1000-8000-00805f9b34fb");

        /**
         * Anaerobic Heart Rate Lower Limit (Characteristic UUID: 0x2A81)
         */
        public static final UUID ANAEROBIC_HEART_RATE_LOWER_LIMIT_CHARACTERISTIC = UUID.fromString("00002A81-0000-1000-8000-00805f9b34fb");

        /**
         * Anaerobic Heart Rate Upper Limit (Characteristic UUID: 0x2A82)
         */
        public static final UUID ANAEROBIC_HEART_RATE_UPPER_LIMIT_CHARACTERISTIC = UUID.fromString("00002A82-0000-1000-8000-00805f9b34fb");

        /**
         * Five Zone Heart Rate Limits (Characteristic UUID: 0x2A8B)
         */
        public static final UUID FIVE_ZONE_HEART_RATE_LIMITS_CHARACTERISTIC = UUID.fromString("00002A8B-0000-1000-8000-00805f9b34fb");

        /**
         * Three Zone Heart Rate Limits (Characteristic UUID: 0x2A94)
         */
        public static final UUID THREE_ZONE_HEART_RATE_LIMITS_CHARACTERISTIC = UUID.fromString("00002A94-0000-1000-8000-00805f9b34fb");

        /**
         * Two Zone Heart Rate Limit (Characteristic UUID: 0x2A95)
         */
        public static final UUID TWO_ZONE_HEART_RATE_LIMIT_CHARACTERISTIC = UUID.fromString("00002A95-0000-1000-8000-00805f9b34fb");

        /**
         * Database Change Increment (Characteristic UUID: 0x2A99)
         */
        public static final UUID DATABASE_CHANGE_INCREMENT_CHARACTERISTIC = UUID.fromString("00002A99-0000-1000-8000-00805f9b34fb");

        /**
         * User Index (Characteristic UUID: 0x2A9A)
         */
        public static final UUID USER_INDEX_CHARACTERISTIC = UUID.fromString("00002A9A-0000-1000-8000-00805f9b34fb");

        /**
         * User Control Point (Characteristic UUID: 0x2A9F)
         */
        public static final UUID USER_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002A9F-0000-1000-8000-00805f9b34fb");

        /**
         * Language (Characteristic UUID: 0x2AA2)
         */
        public static final UUID LANGUAGE_CHARACTERISTIC = UUID.fromString("00002AA2-0000-1000-8000-00805f9b34fb");

        // Body Composition (Service UUID: 0x181B)

        /**
         * Body Composition Feature (Characteristic UUID: 0x2A9B)
         */
        public static final UUID BODY_COMPOSITION_FEATURE_CHARACTERISTIC = UUID.fromString("00002A9B-0000-1000-8000-00805f9b34fb");

        /**
         * Body Composition Measurement (Characteristic UUID: 0x2A9C)
         */
        public static final UUID BODY_COMPOSITION_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002A9C-0000-1000-8000-00805f9b34fb");

        // Blood Pressure (Service UUID: 0x1810)

        /**
         * Blood Pressure Measurement (Characteristic UUID: 0x2A35)
         */
        public static final UUID BLOOD_PRESSURE_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002A35-0000-1000-8000-00805f9b34fb");

        /**
         * Intermediate Cuff Pressure (Characteristic UUID: 0x2A36)
         */
        public static final UUID INTERMEDIATE_CUFF_PRESSURE_CHARACTERISTIC = UUID.fromString("00002A36-0000-1000-8000-00805f9b34fb");

        /**
         * Blood Pressure Feature (Characteristic UUID: 0x2A49)
         */
        public static final UUID BLOOD_PRESSURE_FEATURE_CHARACTERISTIC = UUID.fromString("00002A49-0000-1000-8000-00805f9b34fb");

        // Heart Rate (Service UUID: 0x180D)

        /**
         * Heart Rate Measurement (Characteristic UUID: 0x2A37)
         */
        public static final UUID HEART_RATE_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002A37-0000-1000-8000-00805f9b34fb");

        /**
         * Body Sensor Location (Characteristic UUID: 0x2A38)
         */
        public static final UUID BODY_SENSOR_LOCATION_CHARACTERISTIC = UUID.fromString("00002A38-0000-1000-8000-00805f9b34fb");

        /**
         * Heart Rate Control Point (Characteristic UUID: 0x2A39)
         */
        public static final UUID HEART_RATE_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002A39-0000-1000-8000-00805f9b34fb");

        // Health Thermometer (Service UUID: 0x1809)

        /**
         * Temperature Measurement (Characteristic UUID: 0x2A1C)
         */
        public static final UUID TEMPERATURE_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002A1C-0000-1000-8000-00805f9b34fb");

        /**
         * Temperature Type (Characteristic UUID: 0x2A1D)
         */
        public static final UUID TEMPERATURE_TYPE_CHARACTERISTIC = UUID.fromString("00002A1D-0000-1000-8000-00805f9b34fb");

        /**
         * Intermediate Temperature (Characteristic UUID: 0x2A1E)
         */
        public static final UUID INTERMEDIATE_TEMPERATURE_CHARACTERISTIC = UUID.fromString("00002A1E-0000-1000-8000-00805f9b34fb");

        /**
         * Measurement Interval (Characteristic UUID: 0x2A21)
         */
        public static final UUID MEASUREMENT_INTERVAL_CHARACTERISTIC = UUID.fromString("00002A21-0000-1000-8000-00805f9b34fb");

        // Immediate Alert (Service UUID: 0x1802)
        // Link Loss (Service UUID: 0x1803)

        /**
         * Alert Level (Characteristic UUID: 0x2A06)
         */
        public static final UUID ALERT_LEVEL_CHARACTERISTIC = UUID.fromString("00002A06-0000-1000-8000-00805f9b34fb");

        // Tx Power (Service UUID: 0x1804)

        /**
         * Tx Power Level (Characteristic UUID: 0x2A07)
         */
        public static final UUID TX_POWER_LEVEL_CHARACTERISTIC = UUID.fromString("00002A07-0000-1000-8000-00805f9b34fb");

        // Next DST Change Service (Service UUID: 0x1807)

        /**
         * Time with DST (Characteristic UUID: 0x2A11)
         */
        public static final UUID TIME_WITH_DST_CHARACTERISTIC = UUID.fromString("00002A11-0000-1000-8000-00805f9b34fb");

        // Reference Time Update Service (Service UUID: 0x1806)

        /**
         * Time Update Control Point (Characteristic UUID: 0x2A16)
         */
        public static final UUID TIME_UPDATE_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002A16-0000-1000-8000-00805f9b34fb");

        /**
         * Time Update State (Characteristic UUID: 0x2A17)
         */
        public static final UUID TIME_UPDATE_STATE_CHARACTERISTIC = UUID.fromString("00002A17-0000-1000-8000-00805f9b34fb");

        // Location and Navigation (Service UUID: 0x1819)

        /**
         * LN Feature (Characteristic UUID: 0x2A6A)
         */
        public static final UUID LN_FEATURE_CHARACTERISTIC = UUID.fromString("00002A6A-0000-1000-8000-00805f9b34fb");

        /**
         * Location and Speed Characteristic (Characteristic UUID: 0x2A67)
         */
        public static final UUID LOCATION_AND_SPEED_CHARACTERISTIC = UUID.fromString("00002A67-0000-1000-8000-00805f9b34fb");

        /**
         * Position Quality (Characteristic UUID: 0x2A69)
         */
        public static final UUID POSITION_QUALITY_CHARACTERISTIC = UUID.fromString("00002A69-0000-1000-8000-00805f9b34fb");

        /**
         * LN Control Point (Characteristic UUID: 0x2A6B)
         */
        public static final UUID LN_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002A6B-0000-1000-8000-00805f9b34fb");

        /**
         * Navigation (Characteristic UUID: 0x2A68)
         */
        public static final UUID NAVIGATION_CHARACTERISTIC = UUID.fromString("00002A68-0000-1000-8000-00805f9b34fb");

        // Phone Alert Status Service (Service UUID: 0x180E)

        /**
         * Alert Status (Characteristic UUID: 0x2A3F)
         */
        public static final UUID ALERT_STATUS_CHARACTERISTIC = UUID.fromString("00002A3F-0000-1000-8000-00805f9b34fb");

        /**
         * Ringer Setting (Characteristic UUID: 0x2A41)
         */
        public static final UUID RINGER_SETTING_CHARACTERISTIC = UUID.fromString("00002A41-0000-1000-8000-00805f9b34fb");

        /**
         * Ringer Control point (Characteristic UUID: 0x2A40)
         */
        public static final UUID RINGER_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002A40-0000-1000-8000-00805f9b34fb");

        // Alert Notification Service (Service UUID: 0x1811)

        /**
         * Supported New Alert Category (Characteristic UUID: 0x2A47)
         */
        public static final UUID SUPPORTED_NEW_ALERT_CATEGORY_CHARACTERISTIC = UUID.fromString("00002A47-0000-1000-8000-00805f9b34fb");

        /**
         * New Alert (Characteristic UUID: 0x2A46)
         */
        public static final UUID NEW_ALERT_CHARACTERISTIC = UUID.fromString("00002A46-0000-1000-8000-00805f9b34fb");

        /**
         * Supported Unread Alert Category (Characteristic UUID: 0x2A48)
         */
        public static final UUID SUPPORTED_UNREAD_ALERT_CATEGORY_CHARACTERISTIC = UUID.fromString("00002A48-0000-1000-8000-00805f9b34fb");

        /**
         * Unread Alert Status (Characteristic UUID: 0x2A45)
         */
        public static final UUID UNREAD_ALERT_STATUS_CHARACTERISTIC = UUID.fromString("00002A45-0000-1000-8000-00805f9b34fb");

        /**
         * Alert Notification Control Point (Characteristic UUID: 0x2A44)
         */
        public static final UUID ALERT_NOTIFICATION_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002A44-0000-1000-8000-00805f9b34fb");

        // Automation IO (Service UUID: 0x1815)

        /**
         * Digital (Characteristic UUID: 0x2A56)
         */
        public static final UUID DIGITAL_CHARACTERISTIC = UUID.fromString("00002A56-0000-1000-8000-00805f9b34fb");

        /**
         * Analog (Characteristic UUID: 0x2A58)
         */
        public static final UUID ANALOG_CHARACTERISTIC = UUID.fromString("00002A58-0000-1000-8000-00805f9b34fb");

        /**
         * Aggregate (Characteristic UUID: 0x2A5A)
         */
        public static final UUID AGGREGATE_CHARACTERISTIC = UUID.fromString("00002A5A-0000-1000-8000-00805f9b34fb");

        // Cycling Power (Service UUID: 0x1818)

        /**
         * Cycling Power Measurement (Characteristic UUID: 0x2A63)
         */
        public static final UUID CYCLING_POWER_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002A63-0000-1000-8000-00805f9b34fb");

        /**
         * Cycling Power Feature (Characteristic UUID: 0x2A65)
         */
        public static final UUID CYCLING_POWER_FEATURE_CHARACTERISTIC = UUID.fromString("00002A65-0000-1000-8000-00805f9b34fb");

        /**
         * Sensor Location (Characteristic UUID: 0x2A5D)
         */
        public static final UUID SENSOR_LOCATION_CHARACTERISTIC = UUID.fromString("00002A5D-0000-1000-8000-00805f9b34fb");

        /**
         * Cycling Power Vector (Characteristic UUID: 0x2A64)
         */
        public static final UUID CYCLING_POWER_VECTOR_CHARACTERISTIC = UUID.fromString("00002A64-0000-1000-8000-00805f9b34fb");

        /**
         * Cycling Power Control Point (Characteristic UUID: 0x2A66)
         */
        public static final UUID CYCLING_POWER_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002A66-0000-1000-8000-00805f9b34fb");

        // Cycling Speed and Cadence (Service UUID: 0x1816)

        /**
         * CSC Measurement (Characteristic UUID: 0x2A5B)
         */
        public static final UUID CSC_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002A5B-0000-1000-8000-00805f9b34fb");

        /**
         * CSC Feature (Characteristic UUID: 0x2A5C)
         */
        public static final UUID CSC_FEATURE_CHARACTERISTIC = UUID.fromString("00002A5C-0000-1000-8000-00805f9b34fb");

        /**
         * SC Control Point (Characteristic UUID: 0x2A55)
         */
        public static final UUID SC_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002A55-0000-1000-8000-00805f9b34fb");

        // Running Speed and Cadence (Service UUID: 0x1814)

        /**
         * RSC Measurement (Characteristic UUID: 0x2A53)
         */
        public static final UUID R_S_C_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002A53-0000-1000-8000-00805f9b34fb");

        /**
         * RSC Feature (Characteristic UUID: 0x2A54)
         */
        public static final UUID R_S_C_FEATURE_CHARACTERISTIC = UUID.fromString("00002A54-0000-1000-8000-00805f9b34fb");

        // Fitness Machine (Service UUID: 0x1826)

        /**
         * Fitness Machine Feature (Characteristic UUID: 0x2ACC)
         */
        public static final UUID FITNESS_MACHINE_FEATURE_CHARACTERISTIC = UUID.fromString("00002ACC-0000-1000-8000-00805f9b34fb");

        /**
         * Treadmill Data (Characteristic UUID: 0x2ACD)
         */
        public static final UUID TREADMILL_DATA_CHARACTERISTIC = UUID.fromString("00002ACD-0000-1000-8000-00805f9b34fb");

        /**
         * Cross Trainer Data (Characteristic UUID: 0x2ACE)
         */
        public static final UUID CROSS_TRAINER_DATA_CHARACTERISTIC = UUID.fromString("00002ACE-0000-1000-8000-00805f9b34fb");

        /**
         * Step Climber Data (Characteristic UUID: 0x2ACF)
         */
        public static final UUID STEP_CLIMBER_DATA_CHARACTERISTIC = UUID.fromString("00002ACF-0000-1000-8000-00805f9b34fb");

        /**
         * Stair Climber Data (Characteristic UUID: 0x2AD0)
         */
        public static final UUID STAIR_CLIMBER_DATA_CHARACTERISTIC = UUID.fromString("00002AD0-0000-1000-8000-00805f9b34fb");

        /**
         * Rower Data (Characteristic UUID: 0x2AD1)
         */
        public static final UUID ROWER_DATA_CHARACTERISTIC = UUID.fromString("00002AD1-0000-1000-8000-00805f9b34fb");

        /**
         * Indoor Bike Data (Characteristic UUID: 0x2AD2)
         */
        public static final UUID INDOOR_BIKE_DATA_CHARACTERISTIC = UUID.fromString("00002AD2-0000-1000-8000-00805f9b34fb");

        /**
         * Training Status (Characteristic UUID: 0x2AD3)
         */
        public static final UUID TRAINING_STATUS_CHARACTERISTIC = UUID.fromString("00002AD3-0000-1000-8000-00805f9b34fb");

        /**
         * Supported Speed Range (Characteristic UUID: 0x2AD4)
         */
        public static final UUID SUPPORTED_SPEED_RANGE_CHARACTERISTIC = UUID.fromString("00002AD4-0000-1000-8000-00805f9b34fb");

        /**
         * Supported Inclination Range (Characteristic UUID: 0x2AD5)
         */
        public static final UUID SUPPORTED_INCLINATION_RANGE_CHARACTERISTIC = UUID.fromString("00002AD5-0000-1000-8000-00805f9b34fb");

        /**
         * Supported Resistance Level Range (Characteristic UUID: 0x2AD6)
         */
        public static final UUID SUPPORTED_RESISTANCE_LEVEL_RANGE_CHARACTERISTIC = UUID.fromString("00002AD6-0000-1000-8000-00805f9b34fb");

        /**
         * Supported Power Range (Characteristic UUID: 0x2AD8)
         */
        public static final UUID SUPPORTED_POWER_RANGE_CHARACTERISTIC = UUID.fromString("00002AD8-0000-1000-8000-00805f9b34fb");

        /**
         * Supported Heart Rate Range (Characteristic UUID: 0x2AD7)
         */
        public static final UUID SUPPORTED_HEART_RATE_RANGE_CHARACTERISTIC = UUID.fromString("00002AD7-0000-1000-8000-00805f9b34fb");

        /**
         * Fitness Machine Control Point (Characteristic UUID: 0x2AD9)
         */
        public static final UUID FITNESS_MACHINE_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002AD9-0000-1000-8000-00805f9b34fb");

        /**
         * Fitness Machine Status (Characteristic UUID: 0x2ADA)
         */
        public static final UUID FITNESS_MACHINE_STATUS_CHARACTERISTIC = UUID.fromString("00002ADA-0000-1000-8000-00805f9b34fb");

        // Human Interface Device (Service UUID: 0x1812)

        /**
         * Protocol Mode (Characteristic UUID: 0x2A4E)
         */
        public static final UUID PROTOCOL_MODE_CHARACTERISTIC = UUID.fromString("00002A4E-0000-1000-8000-00805f9b34fb");

        /**
         * Report (Characteristic UUID: 0x2A4D)
         */
        public static final UUID REPORT_CHARACTERISTIC = UUID.fromString("00002A4D-0000-1000-8000-00805f9b34fb");

        /**
         * Report Map (Characteristic UUID: 0x2A4B)
         */
        public static final UUID REPORT_MAP_CHARACTERISTIC = UUID.fromString("00002A4B-0000-1000-8000-00805f9b34fb");

        /**
         * Boot Keyboard Input Report (Characteristic UUID: 0x2A22)
         */
        public static final UUID BOOT_KEYBOARD_INPUT_REPORT_CHARACTERISTIC = UUID.fromString("00002A22-0000-1000-8000-00805f9b34fb");

        /**
         * Boot Keyboard Output Report (Characteristic UUID: 0x2A32)
         */
        public static final UUID BOOT_KEYBOARD_OUTPUT_REPORT_CHARACTERISTIC = UUID.fromString("00002A32-0000-1000-8000-00805f9b34fb");

        /**
         * Boot Mouse Input Report (Characteristic UUID: 0x2A33)
         */
        public static final UUID BOOT_MOUSE_INPUT_REPORT_CHARACTERISTIC = UUID.fromString("00002A33-0000-1000-8000-00805f9b34fb");

        /**
         * HID Information (Characteristic UUID: 0x2A4A)
         */
        public static final UUID HID_INFORMATION_CHARACTERISTIC = UUID.fromString("00002A4A-0000-1000-8000-00805f9b34fb");

        /**
         * HID Control Point (Characteristic UUID: 0x2A4C)
         */
        public static final UUID HID_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002A4C-0000-1000-8000-00805f9b34fb");

        // Scan Parameters (Service UUID: 0x1813)

        /**
         * Scan Interval Window (Characteristic UUID: 0x2A4F)
         */
        public static final UUID SCAN_INTERVAL_WINDOW_CHARACTERISTIC = UUID.fromString("00002A4F-0000-1000-8000-00805f9b34fb");

        /**
         * Scan Refresh (Characteristic UUID: 0x2A31)
         */
        public static final UUID SCAN_REFRESH_CHARACTERISTIC = UUID.fromString("00002A31-0000-1000-8000-00805f9b34fb");

        // Indoor Positioning (Service UUID: 0x1821)

        /**
         * Indoor Positioning Configuration (Characteristic UUID: 0x2AAD)
         */
        public static final UUID INDOOR_POSITIONING_CONFIGURATION_CHARACTERISTIC = UUID.fromString("00002AAD-0000-1000-8000-00805f9b34fb");

        /**
         * Latitude (Characteristic UUID: 0x2AAE)
         */
        public static final UUID LATITUDE_CHARACTERISTIC = UUID.fromString("00002AAE-0000-1000-8000-00805f9b34fb");

        /**
         * Longitude (Characteristic UUID: 0x2AAF)
         */
        public static final UUID LONGITUDE_CHARACTERISTIC = UUID.fromString("00002AAF-0000-1000-8000-00805f9b34fb");

        /**
         * Local North Coordinate (Characteristic UUID: 0x2AB0)
         */
        public static final UUID LOCAL_NORTH_COORDINATE_CHARACTERISTIC = UUID.fromString("00002AB0-0000-1000-8000-00805f9b34fb");

        /**
         * Local East Coordinate (Characteristic UUID: 0x2AB1)
         */
        public static final UUID LOCAL_EAST_COORDINATE_CHARACTERISTIC = UUID.fromString("00002AB1-0000-1000-8000-00805f9b34fb");

        /**
         * Floor Number (Characteristic UUID: 0x2AB2)
         */
        public static final UUID FLOOR_NUMBER_CHARACTERISTIC = UUID.fromString("00002AB2-0000-1000-8000-00805f9b34fb");

        /**
         * Altitude (Characteristic UUID: 0x2AB3)
         */
        public static final UUID ALTITUDE_CHARACTERISTIC = UUID.fromString("00002AB3-0000-1000-8000-00805f9b34fb");

        /**
         * Uncertainty (Characteristic UUID: 0x2AB4)
         */
        public static final UUID UNCERTAINTY_CHARACTERISTIC = UUID.fromString("00002AB4-0000-1000-8000-00805f9b34fb");

        /**
         * Location Name (Characteristic UUID: 0x2AB5)
         */
        public static final UUID LOCATION_NAME_CHARACTERISTIC = UUID.fromString("00002AB5-0000-1000-8000-00805f9b34fb");

        // HTTP Proxy (Service UUID: 0x1823)

        /**
         * URI (Characteristic UUID: 0x2AB6)
         */
        public static final UUID URI_CHARACTERISTIC = UUID.fromString("00002AB6-0000-1000-8000-00805f9b34fb");

        /**
         * HTTP Headers (Characteristic UUID: 0x2AB7)
         */
        public static final UUID HTTP_HEADERS_CHARACTERISTIC = UUID.fromString("00002AB7-0000-1000-8000-00805f9b34fb");

        /**
         * HTTP Entity Body (Characteristic UUID: 0x2AB9)
         */
        public static final UUID HTTP_ENTITY_BODY_CHARACTERISTIC = UUID.fromString("00002AB9-0000-1000-8000-00805f9b34fb");

        /**
         * HTTP Control Point (Characteristic UUID: 0x2ABA)
         */
        public static final UUID HTTP_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002ABA-0000-1000-8000-00805f9b34fb");

        /**
         * HTTP Status Code (Characteristic UUID: 0x2AB8)
         */
        public static final UUID HTTP_STATUS_CODE_CHARACTERISTIC = UUID.fromString("00002AB8-0000-1000-8000-00805f9b34fb");

        /**
         * HTTPS Security (Characteristic UUID: 0x2ABB)
         */
        public static final UUID HTTPS_SECURITY_CHARACTERISTIC = UUID.fromString("00002ABB-0000-1000-8000-00805f9b34fb");

        // Bond Management Service (Service UUID: 0x181E)

        /**
         * Bond Management Control Point (Characteristic UUID: 0x2AA4)
         */
        public static final UUID BOND_MANAGEMENT_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002AA4-0000-1000-8000-00805f9b34fb");

        /**
         * Bond Management Features (Characteristic UUID: 0x2AA5)
         */
        public static final UUID BOND_MANAGEMENT_FEATURES_CHARACTERISTIC = UUID.fromString("00002AA5-0000-1000-8000-00805f9b34fb");

        // Reconnection Configuration (Service UUID: 0x1829)

        /**
         * RC Feature (Characteristic UUID: 0x2B1D)
         */
        public static final UUID R_C_FEATURE_CHARACTERISTIC = UUID.fromString("00002B1D-0000-1000-8000-00805f9b34fb");

        /**
         * RC Settings (Characteristic UUID: 0x2B1E)
         */
        public static final UUID R_C_SETTINGS_CHARACTERISTIC = UUID.fromString("00002B1E-0000-1000-8000-00805f9b34fb");

        /**
         * Reconnection Configuration Control Point (Characteristic UUID: 0x2B1F)
         */
        public static final UUID RECONNECTION_CONFIGURATION_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002B1F-0000-1000-8000-00805f9b34fb");

        // Transport Discovery (Service UUID: 0x1824)

        /**
         * TDS Control Point (Characteristic UUID: 0x2ABC)
         */
        public static final UUID TDS_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002ABC-0000-1000-8000-00805f9b34fb");

        // Environmental Sensing (Service UUID: 0x181A)

        /**
         * Descriptor Value Changed (Characteristic UUID: 0x2A7D)
         */
        public static final UUID DESCRIPTOR_VALUE_CHANGED_CHARACTERISTIC = UUID.fromString("00002A7D-0000-1000-8000-00805f9b34fb");

        /**
         * Apparent Wind Direction (Characteristic UUID: 0x2A73)
         */
        public static final UUID APPARENT_WIND_DIRECTION_CHARACTERISTIC = UUID.fromString("00002A73-0000-1000-8000-00805f9b34fb");

        /**
         * Apparent Wind Speed (Characteristic UUID: 0x2A72)
         */
        public static final UUID APPARENT_WIND_SPEED_CHARACTERISTIC = UUID.fromString("00002A72-0000-1000-8000-00805f9b34fb");

        /**
         * Dew Point (Characteristic UUID: 0x2A7B)
         */
        public static final UUID DEW_POINT_CHARACTERISTIC = UUID.fromString("00002A7B-0000-1000-8000-00805f9b34fb");

        /**
         * Elevation (Characteristic UUID: 0x2A6C)
         */
        public static final UUID ELEVATION_CHARACTERISTIC = UUID.fromString("00002A6C-0000-1000-8000-00805f9b34fb");

        /**
         * Gust Factor (Characteristic UUID: 0x2A74)
         */
        public static final UUID GUST_FACTOR_CHARACTERISTIC = UUID.fromString("00002A74-0000-1000-8000-00805f9b34fb");

        /**
         * Heat Index (Characteristic UUID: 0x2A7A)
         */
        public static final UUID HEAT_INDEX_CHARACTERISTIC = UUID.fromString("00002A7A-0000-1000-8000-00805f9b34fb");

        /**
         * Humidity (Characteristic UUID: 0x2A6F)
         */
        public static final UUID HUMIDITY_CHARACTERISTIC = UUID.fromString("00002A6F-0000-1000-8000-00805f9b34fb");

        /**
         * Irradiance (Characteristic UUID: 0x2A77)
         */
        public static final UUID IRRADIANCE_CHARACTERISTIC = UUID.fromString("00002A77-0000-1000-8000-00805f9b34fb");

        /**
         * Pollen Concentration (Characteristic UUID: 0x2A75)
         */
        public static final UUID POLLEN_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002A75-0000-1000-8000-00805f9b34fb");

        /**
         * Rainfall (Characteristic UUID: 0x2A78)
         */
        public static final UUID RAINFALL_CHARACTERISTIC = UUID.fromString("00002A78-0000-1000-8000-00805f9b34fb");

        /**
         * Pressure (Characteristic UUID: 0x2A6D)
         */
        public static final UUID PRESSURE_CHARACTERISTIC = UUID.fromString("00002A6D-0000-1000-8000-00805f9b34fb");

        /**
         * Temperature (Characteristic UUID: 0x2A6E)
         */
        public static final UUID TEMPERATURE_CHARACTERISTIC = UUID.fromString("00002A6E-0000-1000-8000-00805f9b34fb");

        /**
         * True Wind Direction (Characteristic UUID: 0x2A71)
         */
        public static final UUID TRUE_WIND_DIRECTION_CHARACTERISTIC = UUID.fromString("00002A71-0000-1000-8000-00805f9b34fb");

        /**
         * True Wind Speed (Characteristic UUID: 0x2A70)
         */
        public static final UUID TRUE_WIND_SPEED_CHARACTERISTIC = UUID.fromString("00002A70-0000-1000-8000-00805f9b34fb");

        /**
         * UV Index (Characteristic UUID: 0x2A76)
         */
        public static final UUID UV_INDEX_CHARACTERISTIC = UUID.fromString("00002A76-0000-1000-8000-00805f9b34fb");

        /**
         * Wind Chill (Characteristic UUID: 0x2A79)
         */
        public static final UUID WIND_CHILL_CHARACTERISTIC = UUID.fromString("00002A79-0000-1000-8000-00805f9b34fb");

        /**
         * Barometric Pressure Trend (Characteristic UUID: 0x2AA3)
         */
        public static final UUID BAROMETRIC_PRESSURE_TREND_CHARACTERISTIC = UUID.fromString("00002AA3-0000-1000-8000-00805f9b34fb");

        /**
         * Magnetic Declination (Characteristic UUID: 0x2A2C)
         */
        public static final UUID MAGNETIC_DECLINATION_CHARACTERISTIC = UUID.fromString("00002A2C-0000-1000-8000-00805f9b34fb");

        /**
         * Magnetic Flux Density - 2D (Characteristic UUID: 0x2AA0)
         */
        public static final UUID MAGNETIC_FLUX_DENSITY_2D_CHARACTERISTIC = UUID.fromString("00002AA0-0000-1000-8000-00805f9b34fb");

        /**
         * Magnetic Flux Density - 3D (Characteristic UUID: 0x2AA1)
         */
        public static final UUID MAGNETIC_FLUX_DENSITY_3D_CHARACTERISTIC = UUID.fromString("00002AA1-0000-1000-8000-00805f9b34fb");

    }

    /**
     * BLE GATT Descriptors UUID
     */
    public static final class DescriptorUUID {

        /**
         * Environmental Sensing Configuration (Descriptor UUID: 0x290B)
         */
        public static final UUID ENVIRONMENTAL_SENSING_CONFIGURATION_DESCRIPTOR = UUID.fromString("0000290B-0000-1000-8000-00805f9b34fb");

        /**
         * Environmental Sensing Measurement (Descriptor UUID: 0x290C)
         */
        public static final UUID ENVIRONMENTAL_SENSING_MEASUREMENT_DESCRIPTOR = UUID.fromString("0000290C-0000-1000-8000-00805f9b34fb");

        /**
         * Environmental Sensing Trigger Setting (Descriptor UUID: 0x290D)
         */
        public static final UUID ENVIRONMENTAL_SENSING_TRIGGER_SETTING_DESCRIPTOR = UUID.fromString("0000290D-0000-1000-8000-00805f9b34fb");

        /**
         * External Report Reference (Descriptor UUID: 0x2907)
         */
        public static final UUID EXTERNAL_REPORT_REFERENCE_DESCRIPTOR = UUID.fromString("00002907-0000-1000-8000-00805f9b34fb");

        /**
         * Characteristic Aggregate Format (Descriptor UUID: 0x2905)
         */
        public static final UUID CHARACTERISTIC_AGGREGATE_FORMAT_DESCRIPTOR = UUID.fromString("00002905-0000-1000-8000-00805f9b34fb");

        /**
         * Characteristic Extended Properties (Descriptor UUID: 0x2900)
         */
        public static final UUID CHARACTERISTIC_EXTENDED_PROPERTIES_DESCRIPTOR = UUID.fromString("00002900-0000-1000-8000-00805f9b34fb");

        /**
         * Characteristic Presentation Format (Descriptor UUID: 0x2904)
         */
        public static final UUID CHARACTERISTIC_PRESENTATION_FORMAT_DESCRIPTOR = UUID.fromString("00002904-0000-1000-8000-00805f9b34fb");

        /**
         * Characteristic User Description (Descriptor UUID: 0x2901)
         */
        public static final UUID CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTOR = UUID.fromString("00002901-0000-1000-8000-00805f9b34fb");

        /**
         * Client Characteristic Configuration (Descriptor UUID: 0x2902)
         */
        public static final UUID CLIENT_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

        /**
         * Server Characteristic Configuration (Descriptor UUID: 0x2903)
         */
        public static final UUID SERVER_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR = UUID.fromString("00002903-0000-1000-8000-00805f9b34fb");

        /**
         * Number of Digitals (Descriptor UUID: 0x2909)
         */
        public static final UUID NUMBEROF_DIGITALS_DESCRIPTOR = UUID.fromString("00002909-0000-1000-8000-00805f9b34fb");

        /**
         * Report Reference (Descriptor UUID: 0x2908)
         */
        public static final UUID REPORT_REFERENCE_DESCRIPTOR = UUID.fromString("00002908-0000-1000-8000-00805f9b34fb");

        /**
         * Time Trigger Setting (Descriptor UUID: 0x290E)
         */
        public static final UUID TIME_TRIGGER_SETTING_DESCRIPTOR = UUID.fromString("0000290E-0000-1000-8000-00805f9b34fb");

        /**
         * Valid Range (Descriptor UUID: 0x2906)
         */
        public static final UUID VALID_RANGE_DESCRIPTOR = UUID.fromString("00002906-0000-1000-8000-00805f9b34fb");

        /**
         * Value Trigger Setting (Descriptor UUID: 0x290A)
         */
        public static final UUID VALUE_TRIGGER_SETTING_DESCRIPTOR = UUID.fromString("0000290A-0000-1000-8000-00805f9b34fb");

    }

    /**
     * <p>
     * BLE GATT Units UUID
     * <p>
     * https://www.bluetooth.com/specifications/assigned-numbers/units/
     * </p>
     */
    public static final class UnitsUUID {

        /**
         * unitless (Units UUID: 0x2700)
         */
        public static final UUID UNITLESS_UNITS = UUID.fromString("00002700-0000-1000-8000-00805f9b34fb");

        /**
         * length (metre) (Units UUID: 0x2701)
         */
        public static final UUID LENGTH_METRE_UNITS = UUID.fromString("00002701-0000-1000-8000-00805f9b34fb");

        /**
         * mass (kilogram) (Units UUID: 0x2702)
         */
        public static final UUID MASS_KILOGRAM_UNITS = UUID.fromString("00002702-0000-1000-8000-00805f9b34fb");

        /**
         * time (second) (Units UUID: 0x2703)
         */
        public static final UUID TIME_SECOND_UNITS = UUID.fromString("00002703-0000-1000-8000-00805f9b34fb");

        /**
         * electric current (ampere) (Units UUID: 0x2704)
         */
        public static final UUID ELECTRIC_CURRENT_AMPERE_UNITS = UUID.fromString("00002704-0000-1000-8000-00805f9b34fb");

        /**
         * thermodynamic temperature (kelvin) (Units UUID: 0x2705)
         */
        public static final UUID THERMODYNAMIC_TEMPERATURE_KELVIN_UNITS = UUID.fromString("00002705-0000-1000-8000-00805f9b34fb");

        /**
         * amount of substance (mole) (Units UUID: 0x2706)
         */
        public static final UUID AMOUNT_OF_SUBSTANCE_MOLE_UNITS = UUID.fromString("00002706-0000-1000-8000-00805f9b34fb");

        /**
         * luminous intensity (candela) (Units UUID: 0x2707)
         */
        public static final UUID LUMINOUS_INTENSITY_CANDELA_UNITS = UUID.fromString("00002707-0000-1000-8000-00805f9b34fb");

        /**
         * area (square metres) (Units UUID: 0x2710)
         */
        public static final UUID AREA_SQUARE_METRES_UNITS = UUID.fromString("00002710-0000-1000-8000-00805f9b34fb");

        /**
         * volume (cubic metres) (Units UUID: 0x2711)
         */
        public static final UUID VOLUME_CUBIC_METRES_UNITS = UUID.fromString("00002711-0000-1000-8000-00805f9b34fb");

        /**
         * velocity (metres per second) (Units UUID: 0x2712)
         */
        public static final UUID VELOCITY_METRES_PER_SECOND_UNITS = UUID.fromString("00002712-0000-1000-8000-00805f9b34fb");

        /**
         * acceleration (metres per second squared) (Units UUID: 0x2713)
         */
        public static final UUID ACCELERATION_METRES_PER_SECOND_SQUARED_UNITS = UUID.fromString("00002713-0000-1000-8000-00805f9b34fb");

        /**
         * wavenumber (reciprocal metre) (Units UUID: 0x2714)
         */
        public static final UUID WAVENUMBER_RECIPROCAL_METRE_UNITS = UUID.fromString("00002714-0000-1000-8000-00805f9b34fb");

        /**
         * density (kilogram per cubic metre) (Units UUID: 0x2715)
         */
        public static final UUID DENSITY_KILOGRAM_PER_CUBIC_METRE_UNITS = UUID.fromString("00002715-0000-1000-8000-00805f9b34fb");

        /**
         * surface density (kilogram per square metre) (Units UUID: 0x2716)
         */
        public static final UUID SURFACE_DENSITY_KILOGRAM_PER_SQUARE_METRE_UNITS = UUID.fromString("00002716-0000-1000-8000-00805f9b34fb");

        /**
         * specific volume (cubic metre per kilogram) (Units UUID: 0x2717)
         */
        public static final UUID SPECIFIC_VOLUME_CUBIC_METRE_PER_KILOGRAM_UNITS = UUID.fromString("00002717-0000-1000-8000-00805f9b34fb");

        /**
         * current density (ampere per square metre) (Units UUID: 0x2718)
         */
        public static final UUID CURRENT_DENSITY_AMPERE_PER_SQUARE_METRE_UNITS = UUID.fromString("00002718-0000-1000-8000-00805f9b34fb");

        /**
         * magnetic field strength (ampere per metre) (Units UUID: 0x2719)
         */
        public static final UUID MAGNETIC_FIELD_STRENGTH_AMPERE_PER_METRE_UNITS = UUID.fromString("00002719-0000-1000-8000-00805f9b34fb");

        /**
         * amount concentration (mole per cubic metre) (Units UUID: 0x271A)
         */
        public static final UUID AMOUNT_CONCENTRATION_MOLE_PER_CUBIC_METRE_UNITS = UUID.fromString("0000271A-0000-1000-8000-00805f9b34fb");

        /**
         * mass concentration (kilogram per cubic metre) (Units UUID: 0x271B)
         */
        public static final UUID MASS_CONCENTRATION_KILOGRAM_PER_CUBIC_METRE_UNITS = UUID.fromString("0000271B-0000-1000-8000-00805f9b34fb");

        /**
         * luminance (candela per square metre) (Units UUID: 0x271C)
         */
        public static final UUID LUMINANCE_CANDELA_PER_SQUARE_METRE_UNITS = UUID.fromString("0000271C-0000-1000-8000-00805f9b34fb");

        /**
         * refractive index (Units UUID: 0x271D)
         */
        public static final UUID REFRACTIVE_INDEX_UNITS = UUID.fromString("0000271D-0000-1000-8000-00805f9b34fb");

        /**
         * relative permeability (Units UUID: 0x271E)
         */
        public static final UUID RELATIVE_PERMEABILITY_UNITS = UUID.fromString("0000271E-0000-1000-8000-00805f9b34fb");

        /**
         * plane angle (radian) (Units UUID: 0x2720)
         */
        public static final UUID PLANE_ANGLE_RADIAN_UNITS = UUID.fromString("00002720-0000-1000-8000-00805f9b34fb");

        /**
         * solid angle (steradian) (Units UUID: 0x2721)
         */
        public static final UUID SOLID_ANGLE_STERADIAN_UNITS = UUID.fromString("00002721-0000-1000-8000-00805f9b34fb");

        /**
         * frequency (hertz) (Units UUID: 0x2722)
         */
        public static final UUID FREQUENCY_HERTZ_UNITS = UUID.fromString("00002722-0000-1000-8000-00805f9b34fb");

        /**
         * force (newton) (Units UUID: 0x2723)
         */
        public static final UUID FORCE_NEWTON_UNITS = UUID.fromString("00002723-0000-1000-8000-00805f9b34fb");

        /**
         * pressure (pascal) (Units UUID: 0x2724)
         */
        public static final UUID PRESSURE_PASCAL_UNITS = UUID.fromString("00002724-0000-1000-8000-00805f9b34fb");

        /**
         * energy (joule) (Units UUID: 0x2725)
         */
        public static final UUID ENERGY_JOULE_UNITS = UUID.fromString("00002725-0000-1000-8000-00805f9b34fb");

        /**
         * power (watt) (Units UUID: 0x2726)
         */
        public static final UUID POWER_WATT_UNITS = UUID.fromString("00002726-0000-1000-8000-00805f9b34fb");

        /**
         * electric charge (coulomb) (Units UUID: 0x2727)
         */
        public static final UUID ELECTRIC_CHARGE_COULOMB_UNITS = UUID.fromString("00002727-0000-1000-8000-00805f9b34fb");

        /**
         * electric potential difference (volt) (Units UUID: 0x2728)
         */
        public static final UUID ELECTRIC_POTENTIAL_DIFFERENCE_VOLT_UNITS = UUID.fromString("00002728-0000-1000-8000-00805f9b34fb");

        /**
         * capacitance (farad) (Units UUID: 0x2729)
         */
        public static final UUID CAPACITANCE_FARAD_UNITS = UUID.fromString("00002729-0000-1000-8000-00805f9b34fb");

        /**
         * electric resistance (ohm) (Units UUID: 0x272A)
         */
        public static final UUID ELECTRIC_RESISTANCE_OHM_UNITS = UUID.fromString("0000272A-0000-1000-8000-00805f9b34fb");

        /**
         * electric conductance (siemens) (Units UUID: 0x272B)
         */
        public static final UUID ELECTRIC_CONDUCTANCE_SIEMENS_UNITS = UUID.fromString("0000272B-0000-1000-8000-00805f9b34fb");

        /**
         * magnetic flux (weber) (Units UUID: 0x272C)
         */
        public static final UUID MAGNETIC_FLUX_WEBER_UNITS = UUID.fromString("0000272C-0000-1000-8000-00805f9b34fb");

        /**
         * magnetic flux density (tesla) (Units UUID: 0x272D)
         */
        public static final UUID MAGNETIC_FLUX_DENSITY_TESLA_UNITS = UUID.fromString("0000272D-0000-1000-8000-00805f9b34fb");

        /**
         * inductance (henry) (Units UUID: 0x272E)
         */
        public static final UUID INDUCTANCE_HENRY_UNITS = UUID.fromString("0000272E-0000-1000-8000-00805f9b34fb");

        /**
         * Celsius temperature (degree Celsius) (Units UUID: 0x272F)
         */
        public static final UUID THERMODYNAMIC_TEMPERATURE_DEGREE_CELSIUS_UNITS = UUID.fromString("0000272F-0000-1000-8000-00805f9b34fb");

        /**
         * luminous flux (lumen) (Units UUID: 0x2730)
         */
        public static final UUID LUMINOUS_FLUX_LUMEN_UNITS = UUID.fromString("00002730-0000-1000-8000-00805f9b34fb");

        /**
         * illuminance (lux) (Units UUID: 0x2731)
         */
        public static final UUID ILLUMINANCE_LUX_UNITS = UUID.fromString("00002731-0000-1000-8000-00805f9b34fb");

        /**
         * activity referred to a radionuclide (becquerel) (Units UUID: 0x2732)
         */
        public static final UUID ACTIVITY_REFERRED_TO_A_RADIONUCLIDE_BECQUEREL_UNITS = UUID.fromString("00002732-0000-1000-8000-00805f9b34fb");

        /**
         * absorbed dose (gray) (Units UUID: 0x2733)
         */
        public static final UUID ABSORBED_DOSE_GRAY_UNITS = UUID.fromString("00002733-0000-1000-8000-00805f9b34fb");

        /**
         * dose equivalent (sievert) (Units UUID: 0x2734)
         */
        public static final UUID DOSE_EQUIVALENT_SIEVERT_UNITS = UUID.fromString("00002734-0000-1000-8000-00805f9b34fb");

        /**
         * catalytic activity (katal) (Units UUID: 0x2735)
         */
        public static final UUID CATALYTIC_ACTIVITY_KATAL_UNITS = UUID.fromString("00002735-0000-1000-8000-00805f9b34fb");

        /**
         * dynamic viscosity (pascal second) (Units UUID: 0x2740)
         */
        public static final UUID DYNAMIC_VISCOSITY_PASCAL_SECOND_UNITS = UUID.fromString("00002740-0000-1000-8000-00805f9b34fb");

        /**
         * moment of force (newton metre) (Units UUID: 0x2741)
         */
        public static final UUID MOMENT_OF_FORCE_NEWTON_METRE_UNITS = UUID.fromString("00002741-0000-1000-8000-00805f9b34fb");

        /**
         * surface tension (newton per metre) (Units UUID: 0x2742)
         */
        public static final UUID SURFACE_TENSION_NEWTON_PER_METRE_UNITS = UUID.fromString("00002742-0000-1000-8000-00805f9b34fb");

        /**
         * angular velocity (radian per second) (Units UUID: 0x2743)
         */
        public static final UUID ANGULAR_VELOCITY_RADIAN_PER_SECOND_UNITS = UUID.fromString("00002743-0000-1000-8000-00805f9b34fb");

        /**
         * angular acceleration (radian per second squared) (Units UUID: 0x2744)
         */
        public static final UUID ANGULAR_ACCELERATION_RADIAN_PER_SECOND_SQUARED_UNITS = UUID.fromString("00002744-0000-1000-8000-00805f9b34fb");

        /**
         * heat flux density (watt per square metre) (Units UUID: 0x2745)
         */
        public static final UUID HEAT_FLUX_DENSITY_WATT_PER_SQUARE_METRE_UNITS = UUID.fromString("00002745-0000-1000-8000-00805f9b34fb");

        /**
         * heat capacity (joule per kelvin) (Units UUID: 0x2746)
         */
        public static final UUID HEAT_CAPACITY_JOULE_PER_KELVIN_UNITS = UUID.fromString("00002746-0000-1000-8000-00805f9b34fb");

        /**
         * specific heat capacity (joule per kilogram kelvin) (Units UUID: 0x2747)
         */
        public static final UUID SPECIFIC_HEAT_CAPACITY_JOULE_PER_KILOGRAM_KELVIN_UNITS = UUID.fromString("00002747-0000-1000-8000-00805f9b34fb");

        /**
         * specific energy (joule per kilogram) (Units UUID: 0x2748)
         */
        public static final UUID SPECIFIC_ENERGY_JOULE_PER_KILOGRAM_UNITS = UUID.fromString("00002748-0000-1000-8000-00805f9b34fb");

        /**
         * thermal conductivity (watt per metre kelvin) (Units UUID: 0x2749)
         */
        public static final UUID THERMAL_CONDUCTIVITY_WATT_PER_METRE_KELVIN_UNITS = UUID.fromString("00002749-0000-1000-8000-00805f9b34fb");

        /**
         * energy density (joule per cubic metre) (Units UUID: 0x274A)
         */
        public static final UUID ENERGY_DENSITY_JOULE_PER_CUBIC_METRE_UNITS = UUID.fromString("0000274A-0000-1000-8000-00805f9b34fb");

        /**
         * electric field strength (volt per metre) (Units UUID: 0x274B)
         */
        public static final UUID ELECTRIC_FIELD_STRENGTH_VOLT_PER_METRE_UNITS = UUID.fromString("0000274B-0000-1000-8000-00805f9b34fb");

        /**
         * electric charge density (coulomb per cubic metre) (Units UUID: 0x274C)
         */
        public static final UUID ELECTRIC_CHARGE_DENSITY_COULOMB_PER_CUBIC_METRE_UNITS = UUID.fromString("0000274C-0000-1000-8000-00805f9b34fb");

        /**
         * surface charge density (coulomb per square metre) (Units UUID: 0x274D)
         */
        public static final UUID SURFACE_CHARGE_DENSITY_COULOMB_PER_SQUARE_METRE_UNITS = UUID.fromString("0000274D-0000-1000-8000-00805f9b34fb");

        /**
         * electric flux density (coulomb per square metre) (Units UUID: 0x274E)
         */
        public static final UUID ELECTRIC_FLUX_DENSITY_COULOMB_PER_SQUARE_METRE_UNITS = UUID.fromString("0000274E-0000-1000-8000-00805f9b34fb");

        /**
         * permittivity (farad per metre) (Units UUID: 0x274F)
         */
        public static final UUID PERMITTIVITY_FARAD_PER_METRE_UNITS = UUID.fromString("0000274F-0000-1000-8000-00805f9b34fb");

        /**
         * permeability (henry per metre) (Units UUID: 0x2750)
         */
        public static final UUID PERMEABILITY_HENRY_PER_METRE_UNITS = UUID.fromString("00002750-0000-1000-8000-00805f9b34fb");

        /**
         * molar energy (joule per mole) (Units UUID: 0x2751)
         */
        public static final UUID MOLAR_ENERGY_JOULE_PER_MOLE_UNITS = UUID.fromString("00002751-0000-1000-8000-00805f9b34fb");

        /**
         * molar entropy (joule per mole kelvin) (Units UUID: 0x2752)
         */
        public static final UUID MOLAR_ENTROPY_JOULE_PER_MOLE_KELVIN_UNITS = UUID.fromString("00002752-0000-1000-8000-00805f9b34fb");

        /**
         * exposure (coulomb per kilogram) (Units UUID: 0x2753)
         */
        public static final UUID EXPOSURE_COULOMB_PER_KILOGRAM_UNITS = UUID.fromString("00002753-0000-1000-8000-00805f9b34fb");

        /**
         * absorbed dose rate (gray per second) (Units UUID: 0x2754)
         */
        public static final UUID ABSORBED_DOSE_RATE_GRAY_PER_SECOND_UNITS = UUID.fromString("00002754-0000-1000-8000-00805f9b34fb");

        /**
         * radiant intensity (watt per steradian) (Units UUID: 0x2755)
         */
        public static final UUID RADIANT_INTENSITY_WATT_PER_STERADIAN_UNITS = UUID.fromString("00002755-0000-1000-8000-00805f9b34fb");

        /**
         * radiance (watt per square metre steradian) (Units UUID: 0x2756)
         */
        public static final UUID RADIANCE_WATT_PER_SQUARE_METRE_STERADIAN_UNITS = UUID.fromString("00002756-0000-1000-8000-00805f9b34fb");

        /**
         * catalytic activity concentration (katal per cubic metre) (Units UUID: 0x2757)
         */
        public static final UUID CATALYTIC_ACTIVITY_CONCENTRATION_KATAL_PER_CUBIC_METRE_UNITS = UUID.fromString("00002757-0000-1000-8000-00805f9b34fb");

        /**
         * time (minute) (Units UUID: 0x2760)
         */
        public static final UUID TIME_MINUTE_UNITS = UUID.fromString("00002760-0000-1000-8000-00805f9b34fb");

        /**
         * time (hour) (Units UUID: 0x2761)
         */
        public static final UUID TIME_HOUR_UNITS = UUID.fromString("00002761-0000-1000-8000-00805f9b34fb");

        /**
         * time (day) (Units UUID: 0x2762)
         */
        public static final UUID TIME_DAY_UNITS = UUID.fromString("00002762-0000-1000-8000-00805f9b34fb");

        /**
         * plane angle (degree) (Units UUID: 0x2763)
         */
        public static final UUID PLANE_ANGLE_DEGREE_UNITS = UUID.fromString("00002763-0000-1000-8000-00805f9b34fb");

        /**
         * plane angle (minute) (Units UUID: 0x2764)
         */
        public static final UUID PLANE_ANGLE_MINUTE_UNITS = UUID.fromString("00002764-0000-1000-8000-00805f9b34fb");

        /**
         * plane angle (second) (Units UUID: 0x2765)
         */
        public static final UUID PLANE_ANGLE_SECOND_UNITS = UUID.fromString("00002765-0000-1000-8000-00805f9b34fb");

        /**
         * area (hectare) (Units UUID: 0x2766)
         */
        public static final UUID AREA_HECTARE_UNITS = UUID.fromString("00002766-0000-1000-8000-00805f9b34fb");

        /**
         * volume (litre) (Units UUID: 0x2767)
         */
        public static final UUID VOLUME_LITRE_UNITS = UUID.fromString("00002767-0000-1000-8000-00805f9b34fb");

        /**
         * mass (tonne) (Units UUID: 0x2768)
         */
        public static final UUID MASS_TONNE_UNITS = UUID.fromString("00002768-0000-1000-8000-00805f9b34fb");

        /**
         * pressure (bar) (Units UUID: 0x2780)
         */
        public static final UUID PRESSURE_BAR_UNITS = UUID.fromString("00002780-0000-1000-8000-00805f9b34fb");

        /**
         * pressure (millimetre of mercury) (Units UUID: 0x2781)
         */
        public static final UUID PRESSURE_MILLIMETRE_OF_MERCURY_UNITS = UUID.fromString("00002781-0000-1000-8000-00805f9b34fb");

        /**
         * length (ångström) (Units UUID: 0x2782)
         */
        public static final UUID LENGTH_ÅNGSTRÖM_UNITS = UUID.fromString("00002782-0000-1000-8000-00805f9b34fb");

        /**
         * length (nautical mile) (Units UUID: 0x2783)
         */
        public static final UUID LENGTH_NAUTICAL_MILE_UNITS = UUID.fromString("00002783-0000-1000-8000-00805f9b34fb");

        /**
         * area (barn) (Units UUID: 0x2784)
         */
        public static final UUID AREA_BARN_UNITS = UUID.fromString("00002784-0000-1000-8000-00805f9b34fb");

        /**
         * velocity (knot) (Units UUID: 0x2785)
         */
        public static final UUID VELOCITY_KNOT_UNITS = UUID.fromString("00002785-0000-1000-8000-00805f9b34fb");

        /**
         * logarithmic radio quantity (neper) (Units UUID: 0x2786)
         */
        public static final UUID LOGARITHMIC_RADIO_QUANTITY_NEPER_UNITS = UUID.fromString("00002786-0000-1000-8000-00805f9b34fb");

        /**
         * logarithmic radio quantity (bel) (Units UUID: 0x2787)
         */
        public static final UUID LOGARITHMIC_RADIO_QUANTITY_BEL_UNITS = UUID.fromString("00002787-0000-1000-8000-00805f9b34fb");

        /**
         * length (yard) (Units UUID: 0x27A0)
         */
        public static final UUID LENGTH_YARD_UNITS = UUID.fromString("000027A0-0000-1000-8000-00805f9b34fb");

        /**
         * length (parsec) (Units UUID: 0x27A1)
         */
        public static final UUID LENGTH_PARSEC_UNITS = UUID.fromString("000027A1-0000-1000-8000-00805f9b34fb");

        /**
         * length (inch) (Units UUID: 0x27A2)
         */
        public static final UUID LENGTH_INCH_UNITS = UUID.fromString("000027A2-0000-1000-8000-00805f9b34fb");

        /**
         * length (foot) (Units UUID: 0x27A3)
         */
        public static final UUID LENGTH_FOOT_UNITS = UUID.fromString("000027A3-0000-1000-8000-00805f9b34fb");

        /**
         * length (mile) (Units UUID: 0x27A4)
         */
        public static final UUID LENGTH_MILE_UNITS = UUID.fromString("000027A4-0000-1000-8000-00805f9b34fb");

        /**
         * pressure (pound-force per square inch) (Units UUID: 0x27A5)
         */
        public static final UUID PRESSURE_POUND_FORCE_PER_SQUARE_INCH_UNITS = UUID.fromString("000027A5-0000-1000-8000-00805f9b34fb");

        /**
         * velocity (kilometre per hour) (Units UUID: 0x27A6)
         */
        public static final UUID VELOCITY_KILOMETRE_PER_HOUR_UNITS = UUID.fromString("000027A6-0000-1000-8000-00805f9b34fb");

        /**
         * velocity (mile per hour) (Units UUID: 0x27A7)
         */
        public static final UUID VELOCITY_MILE_PER_HOUR_UNITS = UUID.fromString("000027A7-0000-1000-8000-00805f9b34fb");

        /**
         * angular velocity (revolution per minute) (Units UUID: 0x27A8)
         */
        public static final UUID ANGULAR_VELOCITY_REVOLUTION_PER_MINUTE_UNITS = UUID.fromString("000027A8-0000-1000-8000-00805f9b34fb");

        /**
         * energy (gram calorie) (Units UUID: 0x27A9)
         */
        public static final UUID ENERGY_GRAM_CALORIE_UNITS = UUID.fromString("000027A9-0000-1000-8000-00805f9b34fb");

        /**
         * energy (kilogram calorie) (Units UUID: 0x27AA)
         */
        public static final UUID ENERGY_KILOGRAM_CALORIE_UNITS = UUID.fromString("000027AA-0000-1000-8000-00805f9b34fb");

        /**
         * energy (kilowatt hour) (Units UUID: 0x27AB)
         */
        public static final UUID ENERGY_KILOWATT_HOUR_UNITS = UUID.fromString("000027AB-0000-1000-8000-00805f9b34fb");

        /**
         * thermodynamic temperature (degree Fahrenheit) (Units UUID: 0x27AC)
         */
        public static final UUID THERMODYNAMIC_TEMPERATURE_DEGREE_FAHRENHEIT_UNITS = UUID.fromString("000027AC-0000-1000-8000-00805f9b34fb");

        /**
         * percentage (Units UUID: 0x27AD)
         */
        public static final UUID PERCENTAGE_UNITS = UUID.fromString("000027AD-0000-1000-8000-00805f9b34fb");

        /**
         * per mille (Units UUID: 0x27AE)
         */
        public static final UUID PER_MILLE_UNITS = UUID.fromString("000027AE-0000-1000-8000-00805f9b34fb");

        /**
         * period (beats per minute) (Units UUID: 0x27AF)
         */
        public static final UUID PERIOD_BEATS_PER_MINUTE_UNITS = UUID.fromString("000027AF-0000-1000-8000-00805f9b34fb");

        /**
         * electric charge (ampere hours) (Units UUID: 0x27B0)
         */
        public static final UUID ELECTRIC_CHARGE_AMPERE_HOURS_UNITS = UUID.fromString("000027B0-0000-1000-8000-00805f9b34fb");

        /**
         * mass density (milligram per decilitre) (Units UUID: 0x27B1)
         */
        public static final UUID MASS_DENSITY_MILLIGRAM_PER_DECILITRE_UNITS = UUID.fromString("000027B1-0000-1000-8000-00805f9b34fb");

        /**
         * mass density (millimole per litre) (Units UUID: 0x27B2)
         */
        public static final UUID MASS_DENSITY_MILLIMOLE_PER_LITRE_UNITS = UUID.fromString("000027B2-0000-1000-8000-00805f9b34fb");

        /**
         * time (year) (Units UUID: 0x27B3)
         */
        public static final UUID TIME_YEAR_UNITS = UUID.fromString("000027B3-0000-1000-8000-00805f9b34fb");

        /**
         * time (month) (Units UUID: 0x27B4)
         */
        public static final UUID TIME_MONTH_UNITS = UUID.fromString("000027B4-0000-1000-8000-00805f9b34fb");

        /**
         * concentration (count per cubic metre) (Units UUID: 0x27B5)
         */
        public static final UUID CONCENTRATION_COUNT_PER_CUBIC_METRE_UNITS = UUID.fromString("000027B5-0000-1000-8000-00805f9b34fb");

        /**
         * irradiance (watt per square metre) (Units UUID: 0x27B6)
         */
        public static final UUID IRRADIANCE_WATT_PER_SQUARE_METRE_UNITS = UUID.fromString("000027B6-0000-1000-8000-00805f9b34fb");

        /**
         * milliliter (per kilogram per minute) (Units UUID: 0x27B7)
         */
        public static final UUID TRANSFER_RATE_MILLILITER_PER_KILOGRAM_PER_MINUTE_UNITS = UUID.fromString("000027B7-0000-1000-8000-00805f9b34fb");

        /**
         * mass (pound) (Units UUID: 0x27B8)
         */
        public static final UUID MASS_POUND_UNITS = UUID.fromString("000027B8-0000-1000-8000-00805f9b34fb");

        /**
         * metabolic equivalent (Units UUID: 0x27B9)
         */
        public static final UUID METABOLIC_EQUIVALENT_UNITS = UUID.fromString("000027B9-0000-1000-8000-00805f9b34fb");

        /**
         * step (per minute) (Units UUID: 0x27BA)
         */
        public static final UUID STEP_PER_MINUTE_UNITS = UUID.fromString("000027BA-0000-1000-8000-00805f9b34fb");

        /**
         * stroke (per minute) (Units UUID: 0x27BC)
         */
        public static final UUID STROKE_PER_MINUTE_UNITS = UUID.fromString("000027BC-0000-1000-8000-00805f9b34fb");

        /**
         * pace (kilometre per minute) (Units UUID: 0x27BD)
         */
        public static final UUID VELOCITY_KILOMETER_PER_MINUTE_UNITS = UUID.fromString("000027BD-0000-1000-8000-00805f9b34fb");

        /**
         * luminous efficacy (lumen per watt) (Units UUID: 0x27BE)
         */
        public static final UUID LUMINOUS_EFFICACY_LUMEN_PER_WATT_UNITS = UUID.fromString("000027BE-0000-1000-8000-00805f9b34fb");

        /**
         * luminous energy (lumen hour) (Units UUID: 0x27BF)
         */
        public static final UUID LUMINOUS_ENERGY_LUMEN_HOUR_UNITS = UUID.fromString("000027BF-0000-1000-8000-00805f9b34fb");

        /**
         * luminous exposure (lux hour) (Units UUID: 0x27C0)
         */
        public static final UUID LUMINOUS_EXPOSURE_LUX_HOUR_UNITS = UUID.fromString("000027C0-0000-1000-8000-00805f9b34fb");

        /**
         * mass flow (gram per second) (Units UUID: 0x27C1)
         */
        public static final UUID MASS_FLOW_GRAM_PER_SECOND_UNITS = UUID.fromString("000027C1-0000-1000-8000-00805f9b34fb");

        /**
         * volume flow (litre per second) (Units UUID: 0x27C2)
         */
        public static final UUID VOLUME_FLOW_LITRE_PER_SECOND_UNITS = UUID.fromString("000027C2-0000-1000-8000-00805f9b34fb");

        /**
         * sound pressure (decibel) (Units UUID: 0x27C3)
         */
        public static final UUID SOUND_PRESSURE_DECIBEL_SPL_UNITS = UUID.fromString("000027C3-0000-1000-8000-00805f9b34fb");

        /**
         * concentration (parts per million) (Units UUID: 0x27C4)
         */
        public static final UUID CONCENTRATION_PARTS_PER_MILLION_UNITS = UUID.fromString("000027C4-0000-1000-8000-00805f9b34fb");

        /**
         * concentration (parts per billion) (Units UUID: 0x27C5)
         */
        public static final UUID CONCENTRATION_PARTS_PER_BILLION_UNITS = UUID.fromString("000027C5-0000-1000-8000-00805f9b34fb");

    }

    /**
     * <p>
     * Core Specification v5.1 Vol 3 Part F 3.4.1.1 Supplement to the Bluetooth Core Specification v8 Part B 1.2
     * </p>
     */
    public static final class ErrorCodes {

        /**
         * The attribute handle given was not valid on this server.
         */
        public static final int INVALID_HANDLE = 0x01;

        /**
         * The attribute cannot be read.
         *
         * @see android.bluetooth.BluetoothGatt#GATT_READ_NOT_PERMITTED
         */
        public static final int READ_NOT_PERMITTED = 0x02;

        /**
         * The attribute cannot be written
         *
         * @see android.bluetooth.BluetoothGatt#GATT_WRITE_NOT_PERMITTED
         */
        public static final int WRITE_NOT_PERMITTED = 0x03;

        /**
         * The attribute PDU was invalid.
         */
        public static final int INVALID_PDU = 0x04;

        /**
         * The attribute requires authentication before it can be read or written.
         *
         * @see android.bluetooth.BluetoothGatt#GATT_INSUFFICIENT_AUTHENTICATION
         */
        public static final int INSUFFICIENT_AUTHENTICATION = 0x05;

        /**
         * Attribute server does not support the request received from the client.
         *
         * @see android.bluetooth.BluetoothGatt#GATT_REQUEST_NOT_SUPPORTED
         */
        public static final int REQUEST_NOT_SUPPORTED = 0x06;

        /**
         * Offset specified was past the end of the attribute.
         *
         * @see android.bluetooth.BluetoothGatt#GATT_INVALID_OFFSET
         */
        public static final int INVALID_OFFSET = 0x07;

        /**
         * The attribute requires authorization before it can be read or written.
         */
        public static final int INSUFFICIENT_AUTHORIZATION = 0x08;

        /**
         * Too many prepare writes have been queued.
         */
        public static final int PREPARE_QUEUE_FULL = 0x09;

        /**
         * No attribute found within the given attri-bute handle range.
         */
        public static final int ATTRIBUTE_NOT_FOUND = 0x0a;

        /**
         * The attribute cannot be read using the Read Blob Request.
         */
        public static final int ATTRIBUTE_NOT_LONG = 0x0b;

        /**
         * The Encryption Key Size used for encrypting this link is insufficient.
         */
        public static final int INSUFFICIENT_ENCRYPTION_KEY_SIZE = 0x0c;

        /**
         * The attribute value length is invalid for the operation.
         *
         * @see android.bluetooth.BluetoothGatt#GATT_INVALID_ATTRIBUTE_LENGTH
         */
        public static final int INVALID_ATTRIBUTE_VALUE_LENGTH = 0x0d;

        /**
         * The attribute request that was requested has encountered an error that was unlikely, and therefore could not be completed as requested.
         */
        public static final int UNLIKELY_ERROR = 0x0e;

        /**
         * The attribute requires encryption before it can be read or written.
         *
         * @see android.bluetooth.BluetoothGatt#GATT_INVALID_ATTRIBUTE_LENGTH
         */
        public static final int INSUFFICIENT_ENCRYPTION = 0x0f;

        /**
         * The attribute type is not a supported grouping attribute as defined by a higher layer specification.
         */
        public static final int UNSUPPORTED_GROUP_TYPE = 0x10;

        /**
         * Insufficient Resources to complete the request.
         */
        public static final int INSUFFICIENT_RESOURCES = 0x11;

        /**
         * The server requests the client to redis-cover the database.
         */
        public static final int DATABASE_OUT_OF_SYNC = 0x12;

        /**
         * The attribute parameter value was not allowed.
         */
        public static final int VALUE_NOT_ALLOWED = 0x13;

        // Application Error

        /**
         * <p>
         * Data field ignored(Current Time Service v1.1.0 1.6) User Data Access Not Permitted(User Data Service v1.1 1.6) Control Point value not supported(Heart Rate Service v1.0 1.6) Out of Range(Health Thermometer Service v1.0 1.6) Trigger condition value not supported(Automation IO Service v1.0.0 1.6) Inappropriate Connection Parameters(Cycling Power Service v1.1 1.6) Procedure Already in Progress(Cycling Speed and Cadence Service v1.1 1.6) Procedure Already in Progress(Running Speed and Cadence Service v1.1 1.6) Invalid Value(Indoor Positioning Service v1.0.0 1.6) Op Code not supported(Bond Management Service v1.0.0 1.7) Missing CRC(Reconnection Configuration Service v1.0 1.7) Write Request Rejected(Environmental Sensing Service v1.0.0 1.6) Write Request Rejected(Object Transfer Service v10 1.10)
         * </p>
         */
        public static final int APPLICATION_ERROR_80 = 0x80;

        /**
         * <p>
         * Client Characteristic Configuration descriptor improperly configured(Cycling Speed and Cadence Service v1.1 1.6) Client Characteristic Configuration descriptor improperly configured(Running Speed and Cadence Service v1.1 1.6) Invalid Request(HTTP Proxy Service v1.0 1.6) Operation failed(Bond Management Service v1.0.0 1.7) Invalid CRC(Reconnection Configuration Service v1.0 1.7) Condition not supported(Environmental Sensing Service v1.0.0 1.6) Object Not Selected(Object Transfer Service v10 1.10)
         * </p>
         */
        public static final int APPLICATION_ERROR_81 = 0x81;

        /**
         * <
         * <p>
         * Network Not Available(HTTP Proxy Service v1.0 1.6) Concurrency Limit Exceeded(Object Transfer Service v10 1.10)
         * </p>
         */
        public static final int APPLICATION_ERROR_82 = 0x82;

        /**
         * Object Name Already Exists(Object Transfer Service v10 1.10)
         */
        public static final int APPLICATION_ERROR_83 = 0x83;
        public static final int APPLICATION_ERROR_84 = 0x84;
        public static final int APPLICATION_ERROR_85 = 0x85;
        public static final int APPLICATION_ERROR_86 = 0x86;
        public static final int APPLICATION_ERROR_87 = 0x87;
        public static final int APPLICATION_ERROR_88 = 0x88;
        public static final int APPLICATION_ERROR_89 = 0x89;
        public static final int APPLICATION_ERROR_8A = 0x8a;
        public static final int APPLICATION_ERROR_8B = 0x8b;
        public static final int APPLICATION_ERROR_8C = 0x8c;
        public static final int APPLICATION_ERROR_8D = 0x8d;
        public static final int APPLICATION_ERROR_8E = 0x8e;

        /**
         * @see android.bluetooth.BluetoothGatt#GATT_CONNECTION_CONGESTED
         */
        public static final int APPLICATION_ERROR_8F = 0x8f;
        public static final int APPLICATION_ERROR_90 = 0x90;
        public static final int APPLICATION_ERROR_91 = 0x91;
        public static final int APPLICATION_ERROR_92 = 0x92;
        public static final int APPLICATION_ERROR_93 = 0x93;
        public static final int APPLICATION_ERROR_94 = 0x94;
        public static final int APPLICATION_ERROR_95 = 0x95;
        public static final int APPLICATION_ERROR_96 = 0x96;
        public static final int APPLICATION_ERROR_97 = 0x97;
        public static final int APPLICATION_ERROR_98 = 0x98;
        public static final int APPLICATION_ERROR_99 = 0x99;
        public static final int APPLICATION_ERROR_9A = 0x9a;
        public static final int APPLICATION_ERROR_9B = 0x9b;
        public static final int APPLICATION_ERROR_9C = 0x9c;
        public static final int APPLICATION_ERROR_9D = 0x9d;
        public static final int APPLICATION_ERROR_9E = 0x9e;
        public static final int APPLICATION_ERROR_9F = 0x9f;

        /**
         * Command not supported(Alert Notification Service v1.0 1.6)
         */
        public static final int COMMAND_NOT_SUPPORTED = 0xa0;

        // Reserved for Future Use

        public static final int RESERVED_FOR_FUTURE_USE_E0 = 0xe0;
        public static final int RESERVED_FOR_FUTURE_USE_E1 = 0xe1;
        public static final int RESERVED_FOR_FUTURE_USE_E2 = 0xe2;
        public static final int RESERVED_FOR_FUTURE_USE_E3 = 0xe3;
        public static final int RESERVED_FOR_FUTURE_USE_E4 = 0xe4;
        public static final int RESERVED_FOR_FUTURE_USE_E5 = 0xe5;
        public static final int RESERVED_FOR_FUTURE_USE_E6 = 0xe6;
        public static final int RESERVED_FOR_FUTURE_USE_E7 = 0xe7;
        public static final int RESERVED_FOR_FUTURE_USE_E8 = 0xe8;
        public static final int RESERVED_FOR_FUTURE_USE_E9 = 0xe9;
        public static final int RESERVED_FOR_FUTURE_USE_EA = 0xea;
        public static final int RESERVED_FOR_FUTURE_USE_EB = 0xeb;
        public static final int RESERVED_FOR_FUTURE_USE_EC = 0xec;
        public static final int RESERVED_FOR_FUTURE_USE_ED = 0xed;
        public static final int RESERVED_FOR_FUTURE_USE_EE = 0xee;
        public static final int RESERVED_FOR_FUTURE_USE_EF = 0xef;
        public static final int RESERVED_FOR_FUTURE_USE_F0 = 0xf0;
        public static final int RESERVED_FOR_FUTURE_USE_F1 = 0xf1;
        public static final int RESERVED_FOR_FUTURE_USE_F2 = 0xf2;
        public static final int RESERVED_FOR_FUTURE_USE_F3 = 0xf3;
        public static final int RESERVED_FOR_FUTURE_USE_F4 = 0xf4;
        public static final int RESERVED_FOR_FUTURE_USE_F5 = 0xf5;
        public static final int RESERVED_FOR_FUTURE_USE_F6 = 0xf6;
        public static final int RESERVED_FOR_FUTURE_USE_F7 = 0xf7;
        public static final int RESERVED_FOR_FUTURE_USE_F8 = 0xf8;
        public static final int RESERVED_FOR_FUTURE_USE_F9 = 0xf9;
        public static final int RESERVED_FOR_FUTURE_USE_FA = 0xfa;
        public static final int RESERVED_FOR_FUTURE_USE_FB = 0xfb;

        /**
         * Write Request Rejected
         */
        public static final int WRITE_REQUEST_REJECTED = 0xfc;

        /**
         * Client Characteristic Configuration Descriptor Improperly Configured
         */
        public static final int CLIENT_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR_IMPROPERLY_CONFIGURED = 0xfd;

        /**
         * Procedure Already in Progress
         */
        public static final int PROCEDURE_ALREADY_IN_PROGRESS = 0xfe;

        /**
         * Out of Range
         */
        public static final int OUT_OF_RANGE = 0xff;

        /**
         * error in task
         */
        public static final int UNKNOWN = 0xffffffff;

        /**
         * task canceled
         */
        public static final int CANCEL = 0xfffffffe;

        /**
         * error at read / write
         *
         * @see android.bluetooth.BluetoothGatt#readCharacteristic(BluetoothGattCharacteristic)
         * @see android.bluetooth.BluetoothGatt#writeCharacteristic(BluetoothGattCharacteristic)
         * @see android.bluetooth.BluetoothGatt#readDescriptor(BluetoothGattDescriptor)
         * @see android.bluetooth.BluetoothGatt#writeDescriptor(BluetoothGattDescriptor)
         */
        public static final int BUSY = 0xfffffffd;

    }

    /**
     * Maximum MTU size
     * <p>
     * Core Specification v5.1 Vol 3 Part F 3.2.9
     */
    public static final int MAXIMUM_MTU = 512;

}
