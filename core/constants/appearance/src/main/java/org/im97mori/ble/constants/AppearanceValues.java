package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * BLE GATT Characteristic UUID
 * <p>
 * https://bitbucket.org/bluetooth-SIG/public/src/main/
 * commit 6557f28af8b95de6b09d6e0d96cf51651fba32ff
 */
public class AppearanceValues {

    private static final class CategoryMap128 extends HashMap<Integer, String> {

        private CategoryMap128() {
            super();
            put(0x0000, "Unknown");
            put(0x0040, "Phone");
            put(0x0080, "Computer");
            put(0x00c0, "Watch");
            put(0x0100, "Clock");
            put(0x0140, "Display");
            put(0x0180, "Remote Control");
            put(0x01c0, "Eye-glasses");
            put(0x0200, "Tag");
            put(0x0240, "Keyring");
            put(0x0280, "Media Player");
            put(0x02c0, "Barcode Scanner");
            put(0x0300, "Thermometer");
            put(0x0340, "Heart Rate Sensor");
            put(0x0380, "Blood Pressure");
            put(0x03c0, "Human Interface Device");
            put(0x0400, "Glucose Meter");
            put(0x0440, "Running Walking Sensor");
            put(0x0480, "Cycling");
            put(0x04c0, "Control Device");
            put(0x0500, "Network Device");
            put(0x0540, "Sensor");
            put(0x0580, "Light Fixtures");
            put(0x05c0, "Fan");
            put(0x0600, "HVAC");
            put(0x0640, "Air Conditioning");
            put(0x0680, "Humidifier");
            put(0x06c0, "Heating");
            put(0x0700, "Access Control");
            put(0x0740, "Motorized Device");
            put(0x0780, "Power Device");
            put(0x07c0, "Light Source");
            put(0x0800, "Window Covering");
            put(0x0840, "Audio Sink");
            put(0x0880, "Audio Source");
            put(0x08c0, "Motorized Vehicle");
            put(0x0900, "Domestic Appliance");
            put(0x0940, "Wearable Audio Device");
            put(0x0980, "Aircraft");
            put(0x09c0, "AV Equipment");
            put(0x0a00, "Display Equipment");
            put(0x0a40, "Hearing aid");
            put(0x0a80, "Gaming");
            put(0x0c40, "Pulse Oximeter");
            put(0x0c80, "Weight Scale");
            put(0x0cc0, "Personal Mobility Device");
            put(0x0d00, "Continuous Glucose Monitor");
            put(0x0d40, "Insulin Pump");
            put(0x0d80, "Medication Delivery");
            put(0x0dc0, "Spirometer");
            put(0x1440, "Outdoor Sports Activity");
        }
    }

    private static final class SubCategoryMap128 extends HashMap<Integer, String> {

        private SubCategoryMap128() {
            super();
            put(0x0000, "Generic Unknown");
            put(0x0040, "Generic Phone");
            put(0x0080, "Generic Computer");
            put(0x0081, "Desktop Workstation");
            put(0x0082, "Server-class Computer");
            put(0x0083, "Laptop");
            put(0x0084, "Handheld PC/PDA (clamshell)");
            put(0x0085, "Palm-size PC/PDA");
            put(0x0086, "Wearable computer (watch size)");
            put(0x0087, "Tablet");
            put(0x0088, "Docking Station");
            put(0x0089, "All in One");
            put(0x008a, "Blade Server");
            put(0x008b, "Convertible");
            put(0x008c, "Detachable");
            put(0x008d, "IoT Gateway");
            put(0x008e, "Mini PC");
            put(0x008f, "Stick PC");
            put(0x00c0, "Generic Watch");
            put(0x00c1, "Sports Watch");
            put(0x00c2, "Smartwatch");
            put(0x0100, "Generic Clock");
            put(0x0140, "Generic Display");
            put(0x0180, "Generic Remote Control");
            put(0x01c0, "Generic Eye-glasses");
            put(0x0200, "Generic Tag");
            put(0x0240, "Generic Keyring");
            put(0x0280, "Generic Media Player");
            put(0x02c0, "Generic Barcode Scanner");
            put(0x0300, "Generic Thermometer");
            put(0x0301, "Ear Thermometer");
            put(0x0340, "Generic Heart Rate Sensor");
            put(0x0341, "Heart Rate Belt");
            put(0x0380, "Generic Blood Pressure");
            put(0x0381, "Arm Blood Pressure");
            put(0x0382, "Wrist Blood Pressure");
            put(0x03c0, "Generic Human Interface Device");
            put(0x03c1, "Keyboard");
            put(0x03c2, "Mouse");
            put(0x03c3, "Joystick");
            put(0x03c4, "Gamepad");
            put(0x03c5, "Digitizer Tablet");
            put(0x03c6, "Card Reader");
            put(0x03c7, "Digital Pen");
            put(0x03c8, "Barcode Scanner");
            put(0x03c9, "Touchpad");
            put(0x03ca, "Presentation Remote");
            put(0x0400, "Generic Glucose Meter");
            put(0x0440, "Generic Running Walking Sensor");
            put(0x0441, "In-Shoe Running Walking Sensor");
            put(0x0442, "On-Shoe Running Walking Sensor");
            put(0x0443, "On-Hip Running Walking Sensor");
            put(0x0480, "Generic Cycling");
            put(0x0481, "Cycling Computer");
            put(0x0482, "Speed Sensor");
            put(0x0483, "Cadence Sensor");
            put(0x0484, "Power Sensor");
            put(0x0485, "Speed and Cadence Sensor");
            put(0x04c0, "Generic Control Device");
            put(0x04c1, "Switch");
            put(0x04c2, "Multi-switch");
            put(0x04c3, "Button");
            put(0x04c4, "Slider");
            put(0x04c5, "Rotary Switch");
            put(0x04c6, "Touch Panel");
            put(0x04c7, "Single Switch");
            put(0x04c8, "Double Switch");
            put(0x04c9, "Triple Switch");
            put(0x04ca, "Battery Switch");
            put(0x04cb, "Energy Harvesting Switch");
            put(0x04cc, "Push Button");
            put(0x0500, "Generic Network Device");
            put(0x0501, "Access Point");
            put(0x0502, "Mesh Device");
            put(0x0503, "Mesh Network Proxy");
            put(0x0540, "Generic Sensor");
            put(0x0541, "Motion Sensor");
            put(0x0542, "Air quality Sensor");
            put(0x0543, "Temperature Sensor");
            put(0x0544, "Humidity Sensor");
            put(0x0545, "Leak Sensor");
            put(0x0546, "Smoke Sensor");
            put(0x0547, "Occupancy Sensor");
            put(0x0548, "Contact Sensor");
            put(0x0549, "Carbon Monoxide Sensor");
            put(0x054a, "Carbon Dioxide Sensor");
            put(0x054b, "Ambient Light Sensor");
            put(0x054c, "Energy Sensor");
            put(0x054d, "Color Light Sensor");
            put(0x054e, "Rain Sensor");
            put(0x054f, "Fire Sensor");
            put(0x0550, "Wind Sensor");
            put(0x0551, "Proximity Sensor");
            put(0x0552, "Multi-Sensor");
            put(0x0553, "Flush Mounted Sensor");
            put(0x0554, "Ceiling Mounted Sensor");
            put(0x0555, "Wall Mounted Sensor");
            put(0x0556, "Multisensor");
            put(0x0557, "Energy Meter");
            put(0x0558, "Flame Detector");
            put(0x0559, "Vehicle Tire Pressure Sensor");
            put(0x0580, "Generic Light Fixtures");
            put(0x0581, "Wall Light");
            put(0x0582, "Ceiling Light");
            put(0x0583, "Floor Light");
            put(0x0584, "Cabinet Light");
            put(0x0585, "Desk Light");
            put(0x0586, "Troffer Light");
            put(0x0587, "Pendant Light");
            put(0x0588, "In-ground Light");
            put(0x0589, "Flood Light");
            put(0x058a, "Underwater Light");
            put(0x058b, "Bollard with Light");
            put(0x058c, "Pathway Light");
            put(0x058d, "Garden Light");
            put(0x058e, "Pole-top Light");
            put(0x058f, "Spotlight");
            put(0x0590, "Linear Light");
            put(0x0591, "Street Light");
            put(0x0592, "Shelves Light");
            put(0x0593, "Bay Light");
            put(0x0594, "Emergency Exit Light");
            put(0x0595, "Light Controller");
            put(0x0596, "Light Driver");
            put(0x0597, "Bulb");
            put(0x0598, "Low-bay Light");
            put(0x0599, "High-bay Light");
            put(0x05c0, "Generic Fan");
            put(0x05c1, "Ceiling Fan");
            put(0x05c2, "Axial Fan");
            put(0x05c3, "Exhaust Fan");
            put(0x05c4, "Pedestal Fan");
            put(0x05c5, "Desk Fan");
            put(0x05c6, "Wall Fan");
            put(0x0600, "Generic HVAC");
            put(0x0601, "Thermostat");
            put(0x0602, "Humidifier");
            put(0x0603, "De-humidifier");
            put(0x0604, "Heater");
            put(0x0605, "Radiator");
            put(0x0606, "Boiler");
            put(0x0607, "Heat Pump");
            put(0x0608, "Infrared Heater");
            put(0x0609, "Radiant Panel Heater");
            put(0x060a, "Fan Heater");
            put(0x060b, "Air Curtain");
            put(0x0640, "Generic Air Conditioning");
            put(0x0680, "Generic Humidifier");
            put(0x06c0, "Generic Heating");
            put(0x06c1, "Radiator");
            put(0x06c2, "Boiler");
            put(0x06c3, "Heat Pump");
            put(0x06c4, "Infrared Heater");
            put(0x06c5, "Radiant Panel Heater");
            put(0x06c6, "Fan Heater");
            put(0x06c7, "Air Curtain");
            put(0x0700, "Generic Access Control");
            put(0x0701, "Access Door");
            put(0x0702, "Garage Door");
            put(0x0703, "Emergency Exit Door");
            put(0x0704, "Access Lock");
            put(0x0705, "Elevator");
            put(0x0706, "Window");
            put(0x0707, "Entrance Gate");
            put(0x0708, "Door Lock");
            put(0x0709, "Locker");
            put(0x0740, "Generic Motorized Device");
            put(0x0741, "Motorized Gate");
            put(0x0742, "Awning");
            put(0x0743, "Blinds or Shades");
            put(0x0744, "Curtains");
            put(0x0745, "Screen");
            put(0x0780, "Generic Power Device");
            put(0x0781, "Power Outlet");
            put(0x0782, "Power Strip");
            put(0x0783, "Plug");
            put(0x0784, "Power Supply");
            put(0x0785, "LED Driver");
            put(0x0786, "Fluorescent Lamp Gear");
            put(0x0787, "HID Lamp Gear");
            put(0x0788, "Charge Case");
            put(0x0789, "Power Bank");
            put(0x07c0, "Generic Light Source");
            put(0x07c1, "Incandescent Light Bulb");
            put(0x07c2, "LED Lamp");
            put(0x07c3, "HID Lamp");
            put(0x07c4, "Fluorescent Lamp");
            put(0x07c5, "LED Array");
            put(0x07c6, "Multi-Color LED Array");
            put(0x07c7, "Low voltage halogen");
            put(0x07c8, "Organic light emitting diode (OLED)");
            put(0x0800, "Generic Window Covering");
            put(0x0801, "Window Shades");
            put(0x0802, "Window Blinds");
            put(0x0803, "Window Awning");
            put(0x0804, "Window Curtain");
            put(0x0805, "Exterior Shutter");
            put(0x0806, "Exterior Screen");
            put(0x0840, "Generic Audio Sink");
            put(0x0841, "Standalone Speaker");
            put(0x0842, "Soundbar");
            put(0x0843, "Bookshelf Speaker");
            put(0x0844, "Standmounted Speaker");
            put(0x0845, "Speakerphone");
            put(0x0880, "Generic Audio Source");
            put(0x0881, "Microphone");
            put(0x0882, "Alarm");
            put(0x0883, "Bell");
            put(0x0884, "Horn");
            put(0x0885, "Broadcasting Device");
            put(0x0886, "Service Desk");
            put(0x0887, "Kiosk");
            put(0x0888, "Broadcasting Room");
            put(0x0889, "Auditorium");
            put(0x08c0, "Generic Motorized Vehicle");
            put(0x08c1, "Car");
            put(0x08c2, "Large Goods Vehicle");
            put(0x08c3, "2-Wheeled Vehicle");
            put(0x08c4, "Motorbike");
            put(0x08c5, "Scooter");
            put(0x08c6, "Moped");
            put(0x08c7, "3-Wheeled Vehicle");
            put(0x08c8, "Light Vehicle");
            put(0x08c9, "Quad Bike");
            put(0x08ca, "Minibus");
            put(0x08cb, "Bus");
            put(0x08cc, "Trolley");
            put(0x08cd, "Agricultural Vehicle");
            put(0x08ce, "Camper / Caravan");
            put(0x08cf, "Recreational Vehicle / Motor Home");
            put(0x0900, "Generic Domestic Appliance");
            put(0x0901, "Refrigerator");
            put(0x0902, "Freezer");
            put(0x0903, "Oven");
            put(0x0904, "Microwave");
            put(0x0905, "Toaster");
            put(0x0906, "Washing Machine");
            put(0x0907, "Dryer");
            put(0x0908, "Coffee maker");
            put(0x0909, "Clothes iron");
            put(0x090a, "Curling iron");
            put(0x090b, "Hair dryer");
            put(0x090c, "Vacuum cleaner");
            put(0x090d, "Robotic vacuum cleaner");
            put(0x090e, "Rice cooker");
            put(0x090f, "Clothes steamer");
            put(0x0940, "Generic Wearable Audio Device");
            put(0x0941, "Earbud");
            put(0x0942, "Headset");
            put(0x0943, "Headphones");
            put(0x0944, "Neck Band");
            put(0x0980, "Generic Aircraft");
            put(0x0981, "Light Aircraft");
            put(0x0982, "Microlight");
            put(0x0983, "Paraglider");
            put(0x0984, "Large Passenger Aircraft");
            put(0x09c0, "Generic AV Equipment");
            put(0x09c1, "Amplifier");
            put(0x09c2, "Receiver");
            put(0x09c3, "Radio");
            put(0x09c4, "Tuner");
            put(0x09c5, "Turntable");
            put(0x09c6, "CD Player");
            put(0x09c7, "DVD Player");
            put(0x09c8, "Bluray Player");
            put(0x09c9, "Optical Disc Player");
            put(0x09ca, "Set-Top Box");
            put(0x0a00, "Generic Display Equipment");
            put(0x0a01, "Television");
            put(0x0a02, "Monitor");
            put(0x0a03, "Projector");
            put(0x0a40, "Generic Hearing aid");
            put(0x0a41, "In-ear hearing aid");
            put(0x0a42, "Behind-ear hearing aid");
            put(0x0a43, "Cochlear Implant");
            put(0x0a80, "Generic Gaming");
            put(0x0a81, "Home Video Game Console");
            put(0x0a82, "Portable handheld console");
            put(0x0c40, "Generic Pulse Oximeter");
            put(0x0c41, "Fingertip Pulse Oximeter");
            put(0x0c42, "Wrist Worn Pulse Oximeter");
            put(0x0c80, "Generic Weight Scale");
            put(0x0cc0, "Generic Personal Mobility Device");
            put(0x0cc1, "Powered Wheelchair");
            put(0x0cc2, "Mobility Scooter");
            put(0x0d00, "Generic Continuous Glucose Monitor");
            put(0x0d40, "Generic Insulin Pump");
            put(0x0d41, "Insulin Pump, durable pump");
            put(0x0d44, "Insulin Pump, patch pump");
            put(0x0d48, "Insulin Pen");
            put(0x0d80, "Generic Medication Delivery");
            put(0x0dc0, "Generic Spirometer");
            put(0x0dc1, "Handheld Spirometer");
            put(0x1440, "Generic Outdoor Sports Activity");
            put(0x1441, "Location Display");
            put(0x1442, "Location and Navigation Display");
            put(0x1443, "Location Pod");
            put(0x1444, "Location and Navigation Pod");
        }
    }

    /**
     * Appearance Values.pdf
     */
    public static final Map<Integer, String> APPEARANCE_CATEGORY_MAPPING = Collections
            .synchronizedMap(Collections.unmodifiableMap(new CategoryMap128()));

    /**
     * Appearance Values.pdf
     */
    public static final Map<Integer, String> APPEARANCE_SUB_CATEGORY_MAPPING = Collections
            .synchronizedMap(Collections.unmodifiableMap(new SubCategoryMap128()));

    /**
     * Unknown
     * (Appearance Category : 0x0000)
     * (Appearance Category(bits 15 to 6) : 0x000)
     */
    public static final int UNKNOWN_APPEARANCE_CATEGORY = 0x0000;

    /**
     * Phone
     * (Appearance Category : 0x0040)
     * (Appearance Category(bits 15 to 6) : 0x001)
     */
    public static final int PHONE_APPEARANCE_CATEGORY = 0x0040;

    /**
     * Computer
     * (Appearance Category : 0x0080)
     * (Appearance Category(bits 15 to 6) : 0x002)
     */
    public static final int COMPUTER_APPEARANCE_CATEGORY = 0x0080;

    /**
     * Watch
     * (Appearance Category : 0x00c0)
     * (Appearance Category(bits 15 to 6) : 0x003)
     */
    public static final int WATCH_APPEARANCE_CATEGORY = 0x00c0;

    /**
     * Clock
     * (Appearance Category : 0x0100)
     * (Appearance Category(bits 15 to 6) : 0x004)
     */
    public static final int CLOCK_APPEARANCE_CATEGORY = 0x0100;

    /**
     * Display
     * (Appearance Category : 0x0140)
     * (Appearance Category(bits 15 to 6) : 0x005)
     */
    public static final int DISPLAY_APPEARANCE_CATEGORY = 0x0140;

    /**
     * Remote Control
     * (Appearance Category : 0x0180)
     * (Appearance Category(bits 15 to 6) : 0x006)
     */
    public static final int REMOTE_CONTROL_APPEARANCE_CATEGORY = 0x0180;

    /**
     * Eye-glasses
     * (Appearance Category : 0x01c0)
     * (Appearance Category(bits 15 to 6) : 0x007)
     */
    public static final int EYE_GLASSES_APPEARANCE_CATEGORY = 0x01c0;

    /**
     * Tag
     * (Appearance Category : 0x0200)
     * (Appearance Category(bits 15 to 6) : 0x008)
     */
    public static final int TAG_APPEARANCE_CATEGORY = 0x0200;

    /**
     * Keyring
     * (Appearance Category : 0x0240)
     * (Appearance Category(bits 15 to 6) : 0x009)
     */
    public static final int KEYRING_APPEARANCE_CATEGORY = 0x0240;

    /**
     * Media Player
     * (Appearance Category : 0x0280)
     * (Appearance Category(bits 15 to 6) : 0x00a)
     */
    public static final int MEDIA_PLAYER_APPEARANCE_CATEGORY = 0x0280;

    /**
     * Barcode Scanner
     * (Appearance Category : 0x02c0)
     * (Appearance Category(bits 15 to 6) : 0x00b)
     */
    public static final int BARCODE_SCANNER_APPEARANCE_CATEGORY = 0x02c0;

    /**
     * Thermometer
     * (Appearance Category : 0x0300)
     * (Appearance Category(bits 15 to 6) : 0x00c)
     */
    public static final int THERMOMETER_APPEARANCE_CATEGORY = 0x0300;

    /**
     * Heart Rate Sensor
     * (Appearance Category : 0x0340)
     * (Appearance Category(bits 15 to 6) : 0x00d)
     */
    public static final int HEART_RATE_SENSOR_APPEARANCE_CATEGORY = 0x0340;

    /**
     * Blood Pressure
     * (Appearance Category : 0x0380)
     * (Appearance Category(bits 15 to 6) : 0x00e)
     */
    public static final int BLOOD_PRESSURE_APPEARANCE_CATEGORY = 0x0380;

    /**
     * Human Interface Device
     * (Appearance Category : 0x03c0)
     * (Appearance Category(bits 15 to 6) : 0x00f)
     */
    public static final int HUMAN_INTERFACE_DEVICE_APPEARANCE_CATEGORY = 0x03c0;

    /**
     * Glucose Meter
     * (Appearance Category : 0x0400)
     * (Appearance Category(bits 15 to 6) : 0x010)
     */
    public static final int GLUCOSE_METER_APPEARANCE_CATEGORY = 0x0400;

    /**
     * Running Walking Sensor
     * (Appearance Category : 0x0440)
     * (Appearance Category(bits 15 to 6) : 0x011)
     */
    public static final int RUNNING_WALKING_SENSOR_APPEARANCE_CATEGORY = 0x0440;

    /**
     * Cycling
     * (Appearance Category : 0x0480)
     * (Appearance Category(bits 15 to 6) : 0x012)
     */
    public static final int CYCLING_APPEARANCE_CATEGORY = 0x0480;

    /**
     * Control Device
     * (Appearance Category : 0x04c0)
     * (Appearance Category(bits 15 to 6) : 0x013)
     */
    public static final int CONTROL_DEVICE_APPEARANCE_CATEGORY = 0x04c0;

    /**
     * Network Device
     * (Appearance Category : 0x0500)
     * (Appearance Category(bits 15 to 6) : 0x014)
     */
    public static final int NETWORK_DEVICE_APPEARANCE_CATEGORY = 0x0500;

    /**
     * Sensor
     * (Appearance Category : 0x0540)
     * (Appearance Category(bits 15 to 6) : 0x015)
     */
    public static final int SENSOR_APPEARANCE_CATEGORY = 0x0540;

    /**
     * Light Fixtures
     * (Appearance Category : 0x0580)
     * (Appearance Category(bits 15 to 6) : 0x016)
     */
    public static final int LIGHT_FIXTURES_APPEARANCE_CATEGORY = 0x0580;

    /**
     * Fan
     * (Appearance Category : 0x05c0)
     * (Appearance Category(bits 15 to 6) : 0x017)
     */
    public static final int FAN_APPEARANCE_CATEGORY = 0x05c0;

    /**
     * HVAC
     * (Appearance Category : 0x0600)
     * (Appearance Category(bits 15 to 6) : 0x018)
     */
    public static final int HVAC_APPEARANCE_CATEGORY = 0x0600;

    /**
     * Air Conditioning
     * (Appearance Category : 0x0640)
     * (Appearance Category(bits 15 to 6) : 0x019)
     */
    public static final int AIR_CONDITIONING_APPEARANCE_CATEGORY = 0x0640;

    /**
     * Humidifier
     * (Appearance Category : 0x0680)
     * (Appearance Category(bits 15 to 6) : 0x01a)
     */
    public static final int HUMIDIFIER_APPEARANCE_CATEGORY = 0x0680;

    /**
     * Heating
     * (Appearance Category : 0x06c0)
     * (Appearance Category(bits 15 to 6) : 0x01b)
     */
    public static final int HEATING_APPEARANCE_CATEGORY = 0x06c0;

    /**
     * Access Control
     * (Appearance Category : 0x0700)
     * (Appearance Category(bits 15 to 6) : 0x01c)
     */
    public static final int ACCESS_CONTROL_APPEARANCE_CATEGORY = 0x0700;

    /**
     * Motorized Device
     * (Appearance Category : 0x0740)
     * (Appearance Category(bits 15 to 6) : 0x01d)
     */
    public static final int MOTORIZED_DEVICE_APPEARANCE_CATEGORY = 0x0740;

    /**
     * Power Device
     * (Appearance Category : 0x0780)
     * (Appearance Category(bits 15 to 6) : 0x01e)
     */
    public static final int POWER_DEVICE_APPEARANCE_CATEGORY = 0x0780;

    /**
     * Light Source
     * (Appearance Category : 0x07c0)
     * (Appearance Category(bits 15 to 6) : 0x01f)
     */
    public static final int LIGHT_SOURCE_APPEARANCE_CATEGORY = 0x07c0;

    /**
     * Window Covering
     * (Appearance Category : 0x0800)
     * (Appearance Category(bits 15 to 6) : 0x020)
     */
    public static final int WINDOW_COVERING_APPEARANCE_CATEGORY = 0x0800;

    /**
     * Audio Sink
     * (Appearance Category : 0x0840)
     * (Appearance Category(bits 15 to 6) : 0x021)
     */
    public static final int AUDIO_SINK_APPEARANCE_CATEGORY = 0x0840;

    /**
     * Audio Source
     * (Appearance Category : 0x0880)
     * (Appearance Category(bits 15 to 6) : 0x022)
     */
    public static final int AUDIO_SOURCE_APPEARANCE_CATEGORY = 0x0880;

    /**
     * Motorized Vehicle
     * (Appearance Category : 0x08c0)
     * (Appearance Category(bits 15 to 6) : 0x023)
     */
    public static final int MOTORIZED_VEHICLE_APPEARANCE_CATEGORY = 0x08c0;

    /**
     * Domestic Appliance
     * (Appearance Category : 0x0900)
     * (Appearance Category(bits 15 to 6) : 0x024)
     */
    public static final int DOMESTIC_APPLIANCE_APPEARANCE_CATEGORY = 0x0900;

    /**
     * Wearable Audio Device
     * (Appearance Category : 0x0940)
     * (Appearance Category(bits 15 to 6) : 0x025)
     */
    public static final int WEARABLE_AUDIO_DEVICE_APPEARANCE_CATEGORY = 0x0940;

    /**
     * Aircraft
     * (Appearance Category : 0x0980)
     * (Appearance Category(bits 15 to 6) : 0x026)
     */
    public static final int AIRCRAFT_APPEARANCE_CATEGORY = 0x0980;

    /**
     * AV Equipment
     * (Appearance Category : 0x09c0)
     * (Appearance Category(bits 15 to 6) : 0x027)
     */
    public static final int AV_EQUIPMENT_APPEARANCE_CATEGORY = 0x09c0;

    /**
     * Display Equipment
     * (Appearance Category : 0x0a00)
     * (Appearance Category(bits 15 to 6) : 0x028)
     */
    public static final int DISPLAY_EQUIPMENT_APPEARANCE_CATEGORY = 0x0a00;

    /**
     * Hearing aid
     * (Appearance Category : 0x0a40)
     * (Appearance Category(bits 15 to 6) : 0x029)
     */
    public static final int HEARING_AID_APPEARANCE_CATEGORY = 0x0a40;

    /**
     * Gaming
     * (Appearance Category : 0x0a80)
     * (Appearance Category(bits 15 to 6) : 0x02a)
     */
    public static final int GAMING_APPEARANCE_CATEGORY = 0x0a80;

    /**
     * Pulse Oximeter
     * (Appearance Category : 0x0c40)
     * (Appearance Category(bits 15 to 6) : 0x031)
     */
    public static final int PULSE_OXIMETER_APPEARANCE_CATEGORY = 0x0c40;

    /**
     * Weight Scale
     * (Appearance Category : 0x0c80)
     * (Appearance Category(bits 15 to 6) : 0x032)
     */
    public static final int WEIGHT_SCALE_APPEARANCE_CATEGORY = 0x0c80;

    /**
     * Personal Mobility Device
     * (Appearance Category : 0x0cc0)
     * (Appearance Category(bits 15 to 6) : 0x033)
     */
    public static final int PERSONAL_MOBILITY_DEVICE_APPEARANCE_CATEGORY = 0x0cc0;

    /**
     * Continuous Glucose Monitor
     * (Appearance Category : 0x0d00)
     * (Appearance Category(bits 15 to 6) : 0x034)
     */
    public static final int CONTINUOUS_GLUCOSE_MONITOR_APPEARANCE_CATEGORY = 0x0d00;

    /**
     * Insulin Pump
     * (Appearance Category : 0x0d40)
     * (Appearance Category(bits 15 to 6) : 0x035)
     */
    public static final int INSULIN_PUMP_APPEARANCE_CATEGORY = 0x0d40;

    /**
     * Medication Delivery
     * (Appearance Category : 0x0d80)
     * (Appearance Category(bits 15 to 6) : 0x036)
     */
    public static final int MEDICATION_DELIVERY_APPEARANCE_CATEGORY = 0x0d80;

    /**
     * Spirometer
     * (Appearance Category : 0x0dc0)
     * (Appearance Category(bits 15 to 6) : 0x037)
     */
    public static final int SPIROMETER_APPEARANCE_CATEGORY = 0x0dc0;

    /**
     * Outdoor Sports Activity
     * (Appearance Category : 0x1440)
     * (Appearance Category(bits 15 to 6) : 0x051)
     */
    public static final int OUTDOOR_SPORTS_ACTIVITY_APPEARANCE_CATEGORY = 0x1440;

    /**
     * Generic Unknown
     * (Appearance Sub-Category : 0x0000)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_UNKNOWN_APPEARANCE_SUB_CATEGORY = 0x0000;

    /**
     * Generic Phone
     * (Appearance Sub-Category : 0x0040)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_PHONE_APPEARANCE_SUB_CATEGORY = 0x0040;

    /**
     * Generic Computer
     * (Appearance Sub-Category : 0x0080)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_COMPUTER_APPEARANCE_SUB_CATEGORY = 0x0080;

    /**
     * Desktop Workstation
     * (Appearance Sub-Category : 0x0081)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int DESKTOP_WORKSTATION_APPEARANCE_SUB_CATEGORY = 0x0081;

    /**
     * Server-class Computer
     * (Appearance Sub-Category : 0x0082)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int SERVER_CLASS_COMPUTER_APPEARANCE_SUB_CATEGORY = 0x0082;

    /**
     * Laptop
     * (Appearance Sub-Category : 0x0083)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int LAPTOP_APPEARANCE_SUB_CATEGORY = 0x0083;

    /**
     * Handheld PC/PDA (clamshell)
     * (Appearance Sub-Category : 0x0084)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int HANDHELD_PC_PDA_CLAMSHELL_APPEARANCE_SUB_CATEGORY = 0x0084;

    /**
     * Palm-size PC/PDA
     * (Appearance Sub-Category : 0x0085)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int PALM_SIZE_PC_PDA_APPEARANCE_SUB_CATEGORY = 0x0085;

    /**
     * Wearable computer (watch size)
     * (Appearance Sub-Category : 0x0086)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int WEARABLECOMPUTER_WATCH_SIZE_APPEARANCE_SUB_CATEGORY = 0x0086;

    /**
     * Tablet
     * (Appearance Sub-Category : 0x0087)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int TABLET_APPEARANCE_SUB_CATEGORY = 0x0087;

    /**
     * Docking Station
     * (Appearance Sub-Category : 0x0088)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int DOCKING_STATION_APPEARANCE_SUB_CATEGORY = 0x0088;

    /**
     * All in One
     * (Appearance Sub-Category : 0x0089)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int ALL_IN_ONE_APPEARANCE_SUB_CATEGORY = 0x0089;

    /**
     * Blade Server
     * (Appearance Sub-Category : 0x008a)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0a)
     */
    public static final int BLADE_SERVER_APPEARANCE_SUB_CATEGORY = 0x008a;

    /**
     * Convertible
     * (Appearance Sub-Category : 0x008b)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0b)
     */
    public static final int CONVERTIBLE_APPEARANCE_SUB_CATEGORY = 0x008b;

    /**
     * Detachable
     * (Appearance Sub-Category : 0x008c)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0c)
     */
    public static final int DETACHABLE_APPEARANCE_SUB_CATEGORY = 0x008c;

    /**
     * IoT Gateway
     * (Appearance Sub-Category : 0x008d)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0d)
     */
    public static final int IOT_GATEWAY_APPEARANCE_SUB_CATEGORY = 0x008d;

    /**
     * Mini PC
     * (Appearance Sub-Category : 0x008e)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0e)
     */
    public static final int MINI_P_C_APPEARANCE_SUB_CATEGORY = 0x008e;

    /**
     * Stick PC
     * (Appearance Sub-Category : 0x008f)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0f)
     */
    public static final int STICK_PC_APPEARANCE_SUB_CATEGORY = 0x008f;

    /**
     * Generic Watch
     * (Appearance Sub-Category : 0x00c0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_WATCH_APPEARANCE_SUB_CATEGORY = 0x00c0;

    /**
     * Sports Watch
     * (Appearance Sub-Category : 0x00c1)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int SPORTS_WATCH_APPEARANCE_SUB_CATEGORY = 0x00c1;

    /**
     * Smartwatch
     * (Appearance Sub-Category : 0x00c2)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int SMARTWATCH_APPEARANCE_SUB_CATEGORY = 0x00c2;

    /**
     * Generic Clock
     * (Appearance Sub-Category : 0x0100)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_CLOCK_APPEARANCE_SUB_CATEGORY = 0x0100;

    /**
     * Generic Display
     * (Appearance Sub-Category : 0x0140)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_DISPLAY_APPEARANCE_SUB_CATEGORY = 0x0140;

    /**
     * Generic Remote Control
     * (Appearance Sub-Category : 0x0180)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_REMOTE_CONTROL_APPEARANCE_SUB_CATEGORY = 0x0180;

    /**
     * Generic Eye-glasses
     * (Appearance Sub-Category : 0x01c0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_EYE_GLASSES_APPEARANCE_SUB_CATEGORY = 0x01c0;

    /**
     * Generic Tag
     * (Appearance Sub-Category : 0x0200)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_TAG_APPEARANCE_SUB_CATEGORY = 0x0200;

    /**
     * Generic Keyring
     * (Appearance Sub-Category : 0x0240)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_KEYRING_APPEARANCE_SUB_CATEGORY = 0x0240;

    /**
     * Generic Media Player
     * (Appearance Sub-Category : 0x0280)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_MEDIA_PLAYER_APPEARANCE_SUB_CATEGORY = 0x0280;

    /**
     * Generic Barcode Scanner
     * (Appearance Sub-Category : 0x02c0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_BARCODE_SCANNER_APPEARANCE_SUB_CATEGORY = 0x02c0;

    /**
     * Generic Thermometer
     * (Appearance Sub-Category : 0x0300)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_THERMOMETER_APPEARANCE_SUB_CATEGORY = 0x0300;

    /**
     * Ear Thermometer
     * (Appearance Sub-Category : 0x0301)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int EAR_THERMOMETER_APPEARANCE_SUB_CATEGORY = 0x0301;

    /**
     * Generic Heart Rate Sensor
     * (Appearance Sub-Category : 0x0340)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_HEART_RATE_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0340;

    /**
     * Heart Rate Belt
     * (Appearance Sub-Category : 0x0341)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int HEART_RATE_BELT_APPEARANCE_SUB_CATEGORY = 0x0341;

    /**
     * Generic Blood Pressure
     * (Appearance Sub-Category : 0x0380)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_BLOOD_PRESSURE_APPEARANCE_SUB_CATEGORY = 0x0380;

    /**
     * Arm Blood Pressure
     * (Appearance Sub-Category : 0x0381)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int ARM_BLOOD_PRESSURE_APPEARANCE_SUB_CATEGORY = 0x0381;

    /**
     * Wrist Blood Pressure
     * (Appearance Sub-Category : 0x0382)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int WRIST_BLOOD_PRESSURE_APPEARANCE_SUB_CATEGORY = 0x0382;

    /**
     * Generic Human Interface Device
     * (Appearance Sub-Category : 0x03c0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_HUMAN_INTERFACE_DEVICE_APPEARANCE_SUB_CATEGORY = 0x03c0;

    /**
     * Keyboard
     * (Appearance Sub-Category : 0x03c1)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int KEYBOARD_APPEARANCE_SUB_CATEGORY = 0x03c1;

    /**
     * Mouse
     * (Appearance Sub-Category : 0x03c2)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int MOUSE_APPEARANCE_SUB_CATEGORY = 0x03c2;

    /**
     * Joystick
     * (Appearance Sub-Category : 0x03c3)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int JOYSTICK_APPEARANCE_SUB_CATEGORY = 0x03c3;

    /**
     * Gamepad
     * (Appearance Sub-Category : 0x03c4)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int GAMEPAD_APPEARANCE_SUB_CATEGORY = 0x03c4;

    /**
     * Digitizer Tablet
     * (Appearance Sub-Category : 0x03c5)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int DIGITIZER_TABLET_APPEARANCE_SUB_CATEGORY = 0x03c5;

    /**
     * Card Reader
     * (Appearance Sub-Category : 0x03c6)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int CARD_READER_APPEARANCE_SUB_CATEGORY = 0x03c6;

    /**
     * Digital Pen
     * (Appearance Sub-Category : 0x03c7)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int DIGITAL_PEN_APPEARANCE_SUB_CATEGORY = 0x03c7;

    /**
     * Barcode Scanner
     * (Appearance Sub-Category : 0x03c8)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int BARCODE_SCANNER_APPEARANCE_SUB_CATEGORY = 0x03c8;

    /**
     * Touchpad
     * (Appearance Sub-Category : 0x03c9)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int TOUCHPAD_APPEARANCE_SUB_CATEGORY = 0x03c9;

    /**
     * Presentation Remote
     * (Appearance Sub-Category : 0x03ca)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0a)
     */
    public static final int PRESENTATION_REMOTE_APPEARANCE_SUB_CATEGORY = 0x03ca;

    /**
     * Generic Glucose Meter
     * (Appearance Sub-Category : 0x0400)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_GLUCOSE_METER_APPEARANCE_SUB_CATEGORY = 0x0400;

    /**
     * Generic Running Walking Sensor
     * (Appearance Sub-Category : 0x0440)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_RUNNING_WALKING_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0440;

    /**
     * In-Shoe Running Walking Sensor
     * (Appearance Sub-Category : 0x0441)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int IN_SHOE_RUNNING_WALKING_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0441;

    /**
     * On-Shoe Running Walking Sensor
     * (Appearance Sub-Category : 0x0442)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int ON_SHOE_RUNNING_WALKING_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0442;

    /**
     * On-Hip Running Walking Sensor
     * (Appearance Sub-Category : 0x0443)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int ON_HIP_RUNNING_WALKING_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0443;

    /**
     * Generic Cycling
     * (Appearance Sub-Category : 0x0480)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_CYCLING_APPEARANCE_SUB_CATEGORY = 0x0480;

    /**
     * Cycling Computer
     * (Appearance Sub-Category : 0x0481)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int CYCLING_COMPUTER_APPEARANCE_SUB_CATEGORY = 0x0481;

    /**
     * Speed Sensor
     * (Appearance Sub-Category : 0x0482)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int SPEED_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0482;

    /**
     * Cadence Sensor
     * (Appearance Sub-Category : 0x0483)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int CADENCE_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0483;

    /**
     * Power Sensor
     * (Appearance Sub-Category : 0x0484)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int POWER_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0484;

    /**
     * Speed and Cadence Sensor
     * (Appearance Sub-Category : 0x0485)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int SPEED_AND_CADENCE_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0485;

    /**
     * Generic Control Device
     * (Appearance Sub-Category : 0x04c0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_CONTROL_DEVICE_APPEARANCE_SUB_CATEGORY = 0x04c0;

    /**
     * Switch
     * (Appearance Sub-Category : 0x04c1)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int SWITCH_APPEARANCE_SUB_CATEGORY = 0x04c1;

    /**
     * Multi-switch
     * (Appearance Sub-Category : 0x04c2)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int MULTI_SWITCH_APPEARANCE_SUB_CATEGORY = 0x04c2;

    /**
     * Button
     * (Appearance Sub-Category : 0x04c3)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int BUTTON_APPEARANCE_SUB_CATEGORY = 0x04c3;

    /**
     * Slider
     * (Appearance Sub-Category : 0x04c4)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int SLIDER_APPEARANCE_SUB_CATEGORY = 0x04c4;

    /**
     * Rotary Switch
     * (Appearance Sub-Category : 0x04c5)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int ROTARY_SWITCH_APPEARANCE_SUB_CATEGORY = 0x04c5;

    /**
     * Touch Panel
     * (Appearance Sub-Category : 0x04c6)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int TOUCH_PANEL_APPEARANCE_SUB_CATEGORY = 0x04c6;

    /**
     * Single Switch
     * (Appearance Sub-Category : 0x04c7)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int SINGLE_SWITCH_APPEARANCE_SUB_CATEGORY = 0x04c7;

    /**
     * Double Switch
     * (Appearance Sub-Category : 0x04c8)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int DOUBLE_SWITCH_APPEARANCE_SUB_CATEGORY = 0x04c8;

    /**
     * Triple Switch
     * (Appearance Sub-Category : 0x04c9)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int TRIPLE_SWITCH_APPEARANCE_SUB_CATEGORY = 0x04c9;

    /**
     * Battery Switch
     * (Appearance Sub-Category : 0x04ca)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0a)
     */
    public static final int BATTERY_SWITCH_APPEARANCE_SUB_CATEGORY = 0x04ca;

    /**
     * Energy Harvesting Switch
     * (Appearance Sub-Category : 0x04cb)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0b)
     */
    public static final int ENERGY_HARVESTING_SWITCH_APPEARANCE_SUB_CATEGORY = 0x04cb;

    /**
     * Push Button
     * (Appearance Sub-Category : 0x04cc)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0c)
     */
    public static final int PUSH_BUTTON_APPEARANCE_SUB_CATEGORY = 0x04cc;

    /**
     * Generic Network Device
     * (Appearance Sub-Category : 0x0500)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_NETWORK_DEVICE_APPEARANCE_SUB_CATEGORY = 0x0500;

    /**
     * Access Point
     * (Appearance Sub-Category : 0x0501)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int ACCESS_POINT_APPEARANCE_SUB_CATEGORY = 0x0501;

    /**
     * Mesh Device
     * (Appearance Sub-Category : 0x0502)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int MESH_DEVICE_APPEARANCE_SUB_CATEGORY = 0x0502;

    /**
     * Mesh Network Proxy
     * (Appearance Sub-Category : 0x0503)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int MESH_NETWORK_PROXY_APPEARANCE_SUB_CATEGORY = 0x0503;

    /**
     * Generic Sensor
     * (Appearance Sub-Category : 0x0540)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0540;

    /**
     * Motion Sensor
     * (Appearance Sub-Category : 0x0541)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int MOTION_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0541;

    /**
     * Air quality Sensor
     * (Appearance Sub-Category : 0x0542)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int AIR_QUALITY_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0542;

    /**
     * Temperature Sensor
     * (Appearance Sub-Category : 0x0543)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int TEMPERATURE_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0543;

    /**
     * Humidity Sensor
     * (Appearance Sub-Category : 0x0544)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int HUMIDITY_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0544;

    /**
     * Leak Sensor
     * (Appearance Sub-Category : 0x0545)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int LEAK_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0545;

    /**
     * Smoke Sensor
     * (Appearance Sub-Category : 0x0546)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int SMOKE_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0546;

    /**
     * Occupancy Sensor
     * (Appearance Sub-Category : 0x0547)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int OCCUPANCY_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0547;

    /**
     * Contact Sensor
     * (Appearance Sub-Category : 0x0548)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int CONTACT_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0548;

    /**
     * Carbon Monoxide Sensor
     * (Appearance Sub-Category : 0x0549)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int CARBON_MONOXIDE_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0549;

    /**
     * Carbon Dioxide Sensor
     * (Appearance Sub-Category : 0x054a)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0a)
     */
    public static final int CARBON_DIOXIDE_SENSOR_APPEARANCE_SUB_CATEGORY = 0x054a;

    /**
     * Ambient Light Sensor
     * (Appearance Sub-Category : 0x054b)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0b)
     */
    public static final int AMBIENT_LIGHT_SENSOR_APPEARANCE_SUB_CATEGORY = 0x054b;

    /**
     * Energy Sensor
     * (Appearance Sub-Category : 0x054c)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0c)
     */
    public static final int ENERGY_SENSOR_APPEARANCE_SUB_CATEGORY = 0x054c;

    /**
     * Color Light Sensor
     * (Appearance Sub-Category : 0x054d)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0d)
     */
    public static final int COLOR_LIGHT_SENSOR_APPEARANCE_SUB_CATEGORY = 0x054d;

    /**
     * Rain Sensor
     * (Appearance Sub-Category : 0x054e)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0e)
     */
    public static final int RAIN_SENSOR_APPEARANCE_SUB_CATEGORY = 0x054e;

    /**
     * Fire Sensor
     * (Appearance Sub-Category : 0x054f)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0f)
     */
    public static final int FIRE_SENSOR_APPEARANCE_SUB_CATEGORY = 0x054f;

    /**
     * Wind Sensor
     * (Appearance Sub-Category : 0x0550)
     * (Appearance Sub-Category(bits 5 to 0) : 0x10)
     */
    public static final int WIND_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0550;

    /**
     * Proximity Sensor
     * (Appearance Sub-Category : 0x0551)
     * (Appearance Sub-Category(bits 5 to 0) : 0x11)
     */
    public static final int PROXIMITY_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0551;

    /**
     * Multi-Sensor
     * (Appearance Sub-Category : 0x0552)
     * (Appearance Sub-Category(bits 5 to 0) : 0x12)
     */
    public static final int MULTI_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0552;

    /**
     * Flush Mounted Sensor
     * (Appearance Sub-Category : 0x0553)
     * (Appearance Sub-Category(bits 5 to 0) : 0x13)
     */
    public static final int FLUSH_MOUNTED_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0553;

    /**
     * Ceiling Mounted Sensor
     * (Appearance Sub-Category : 0x0554)
     * (Appearance Sub-Category(bits 5 to 0) : 0x14)
     */
    public static final int CEILING_MOUNTED_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0554;

    /**
     * Wall Mounted Sensor
     * (Appearance Sub-Category : 0x0555)
     * (Appearance Sub-Category(bits 5 to 0) : 0x15)
     */
    public static final int WALL_MOUNTED_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0555;

    /**
     * Multisensor
     * (Appearance Sub-Category : 0x0556)
     * (Appearance Sub-Category(bits 5 to 0) : 0x16)
     */
    public static final int MULTISENSOR_APPEARANCE_SUB_CATEGORY = 0x0556;

    /**
     * Energy Meter
     * (Appearance Sub-Category : 0x0557)
     * (Appearance Sub-Category(bits 5 to 0) : 0x17)
     */
    public static final int ENERGY_METER_APPEARANCE_SUB_CATEGORY = 0x0557;

    /**
     * Flame Detector
     * (Appearance Sub-Category : 0x0558)
     * (Appearance Sub-Category(bits 5 to 0) : 0x18)
     */
    public static final int FLAME_DETECTOR_APPEARANCE_SUB_CATEGORY = 0x0558;

    /**
     * Vehicle Tire Pressure Sensor
     * (Appearance Sub-Category : 0x0559)
     * (Appearance Sub-Category(bits 5 to 0) : 0x19)
     */
    public static final int VEHICLE_TIRE_PRESSURE_SENSOR_APPEARANCE_SUB_CATEGORY = 0x0559;

    /**
     * Generic Light Fixtures
     * (Appearance Sub-Category : 0x0580)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_LIGHT_FIXTURES_APPEARANCE_SUB_CATEGORY = 0x0580;

    /**
     * Wall Light
     * (Appearance Sub-Category : 0x0581)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int WALL_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0581;

    /**
     * Ceiling Light
     * (Appearance Sub-Category : 0x0582)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int CEILING_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0582;

    /**
     * Floor Light
     * (Appearance Sub-Category : 0x0583)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int FLOOR_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0583;

    /**
     * Cabinet Light
     * (Appearance Sub-Category : 0x0584)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int CABINET_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0584;

    /**
     * Desk Light
     * (Appearance Sub-Category : 0x0585)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int DESK_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0585;

    /**
     * Troffer Light
     * (Appearance Sub-Category : 0x0586)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int TROFFER_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0586;

    /**
     * Pendant Light
     * (Appearance Sub-Category : 0x0587)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int PENDANT_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0587;

    /**
     * In-ground Light
     * (Appearance Sub-Category : 0x0588)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int IN_GROUND_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0588;

    /**
     * Flood Light
     * (Appearance Sub-Category : 0x0589)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int FLOOD_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0589;

    /**
     * Underwater Light
     * (Appearance Sub-Category : 0x058a)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0a)
     */
    public static final int UNDERWATER_LIGHT_APPEARANCE_SUB_CATEGORY = 0x058a;

    /**
     * Bollard with Light
     * (Appearance Sub-Category : 0x058b)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0b)
     */
    public static final int BOLLARD_WITH_LIGHT_APPEARANCE_SUB_CATEGORY = 0x058b;

    /**
     * Pathway Light
     * (Appearance Sub-Category : 0x058c)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0c)
     */
    public static final int PATHWAY_LIGHT_APPEARANCE_SUB_CATEGORY = 0x058c;

    /**
     * Garden Light
     * (Appearance Sub-Category : 0x058d)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0d)
     */
    public static final int GARDEN_LIGHT_APPEARANCE_SUB_CATEGORY = 0x058d;

    /**
     * Pole-top Light
     * (Appearance Sub-Category : 0x058e)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0e)
     */
    public static final int POLE_TOP_LIGHT_APPEARANCE_SUB_CATEGORY = 0x058e;

    /**
     * Spotlight
     * (Appearance Sub-Category : 0x058f)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0f)
     */
    public static final int SPOTLIGHT_APPEARANCE_SUB_CATEGORY = 0x058f;

    /**
     * Linear Light
     * (Appearance Sub-Category : 0x0590)
     * (Appearance Sub-Category(bits 5 to 0) : 0x10)
     */
    public static final int LINEAR_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0590;

    /**
     * Street Light
     * (Appearance Sub-Category : 0x0591)
     * (Appearance Sub-Category(bits 5 to 0) : 0x11)
     */
    public static final int STREET_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0591;

    /**
     * Shelves Light
     * (Appearance Sub-Category : 0x0592)
     * (Appearance Sub-Category(bits 5 to 0) : 0x12)
     */
    public static final int SHELVES_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0592;

    /**
     * Bay Light
     * (Appearance Sub-Category : 0x0593)
     * (Appearance Sub-Category(bits 5 to 0) : 0x13)
     */
    public static final int BAY_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0593;

    /**
     * Emergency Exit Light
     * (Appearance Sub-Category : 0x0594)
     * (Appearance Sub-Category(bits 5 to 0) : 0x14)
     */
    public static final int EMERGENCY_EXIT_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0594;

    /**
     * Light Controller
     * (Appearance Sub-Category : 0x0595)
     * (Appearance Sub-Category(bits 5 to 0) : 0x15)
     */
    public static final int LIGHT_CONTROLLER_APPEARANCE_SUB_CATEGORY = 0x0595;

    /**
     * Light Driver
     * (Appearance Sub-Category : 0x0596)
     * (Appearance Sub-Category(bits 5 to 0) : 0x16)
     */
    public static final int LIGHT_DRIVER_APPEARANCE_SUB_CATEGORY = 0x0596;

    /**
     * Bulb
     * (Appearance Sub-Category : 0x0597)
     * (Appearance Sub-Category(bits 5 to 0) : 0x17)
     */
    public static final int BULB_APPEARANCE_SUB_CATEGORY = 0x0597;

    /**
     * Low-bay Light
     * (Appearance Sub-Category : 0x0598)
     * (Appearance Sub-Category(bits 5 to 0) : 0x18)
     */
    public static final int LOW_BAY_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0598;

    /**
     * High-bay Light
     * (Appearance Sub-Category : 0x0599)
     * (Appearance Sub-Category(bits 5 to 0) : 0x19)
     */
    public static final int HIGH_BAY_LIGHT_APPEARANCE_SUB_CATEGORY = 0x0599;

    /**
     * Generic Fan
     * (Appearance Sub-Category : 0x05c0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_FAN_APPEARANCE_SUB_CATEGORY = 0x05c0;

    /**
     * Ceiling Fan
     * (Appearance Sub-Category : 0x05c1)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int CEILING_FAN_APPEARANCE_SUB_CATEGORY = 0x05c1;

    /**
     * Axial Fan
     * (Appearance Sub-Category : 0x05c2)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int AXIAL_FAN_APPEARANCE_SUB_CATEGORY = 0x05c2;

    /**
     * Exhaust Fan
     * (Appearance Sub-Category : 0x05c3)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int EXHAUST_FAN_APPEARANCE_SUB_CATEGORY = 0x05c3;

    /**
     * Pedestal Fan
     * (Appearance Sub-Category : 0x05c4)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int PEDESTAL_FAN_APPEARANCE_SUB_CATEGORY = 0x05c4;

    /**
     * Desk Fan
     * (Appearance Sub-Category : 0x05c5)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int DESK_FAN_APPEARANCE_SUB_CATEGORY = 0x05c5;

    /**
     * Wall Fan
     * (Appearance Sub-Category : 0x05c6)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int WALL_FAN_APPEARANCE_SUB_CATEGORY = 0x05c6;

    /**
     * Generic HVAC
     * (Appearance Sub-Category : 0x0600)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_HVAC_APPEARANCE_SUB_CATEGORY = 0x0600;

    /**
     * Thermostat
     * (Appearance Sub-Category : 0x0601)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int THERMOSTAT_APPEARANCE_SUB_CATEGORY = 0x0601;

    /**
     * Humidifier
     * (Appearance Sub-Category : 0x0602)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int HUMIDIFIER_APPEARANCE_SUB_CATEGORY = 0x0602;

    /**
     * De-humidifier
     * (Appearance Sub-Category : 0x0603)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int DE_HUMIDIFIER_APPEARANCE_SUB_CATEGORY = 0x0603;

    /**
     * Heater
     * (Appearance Sub-Category : 0x0604)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int HEATER_APPEARANCE_SUB_CATEGORY = 0x0604;

    /**
     * Radiator
     * (Appearance Sub-Category : 0x0605)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int RADIATOR_0605_APPEARANCE_SUB_CATEGORY = 0x0605;

    /**
     * Boiler
     * (Appearance Sub-Category : 0x0606)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int BOILER_0606_APPEARANCE_SUB_CATEGORY = 0x0606;

    /**
     * Heat Pump
     * (Appearance Sub-Category : 0x0607)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int HEAT_PUMP_0607_APPEARANCE_SUB_CATEGORY = 0x0607;

    /**
     * Infrared Heater
     * (Appearance Sub-Category : 0x0608)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int INFRARED_HEATER_0608_APPEARANCE_SUB_CATEGORY = 0x0608;

    /**
     * Radiant Panel Heater
     * (Appearance Sub-Category : 0x0609)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int RADIANT_PANEL_HEATER_0609_APPEARANCE_SUB_CATEGORY = 0x0609;

    /**
     * Fan Heater
     * (Appearance Sub-Category : 0x060a)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0a)
     */
    public static final int FAN_HEATER_060A_APPEARANCE_SUB_CATEGORY = 0x060a;

    /**
     * Air Curtain
     * (Appearance Sub-Category : 0x060b)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0b)
     */
    public static final int AIR_CURTAIN_060B_APPEARANCE_SUB_CATEGORY = 0x060b;

    /**
     * Generic Air Conditioning
     * (Appearance Sub-Category : 0x0640)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_AIR_CONDITIONING_APPEARANCE_SUB_CATEGORY = 0x0640;

    /**
     * Generic Humidifier
     * (Appearance Sub-Category : 0x0680)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_HUMIDIFIER_APPEARANCE_SUB_CATEGORY = 0x0680;

    /**
     * Generic Heating
     * (Appearance Sub-Category : 0x06c0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_HEATING_APPEARANCE_SUB_CATEGORY = 0x06c0;

    /**
     * Radiator
     * (Appearance Sub-Category : 0x06c1)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int RADIATOR_06C1_APPEARANCE_SUB_CATEGORY = 0x06c1;

    /**
     * Boiler
     * (Appearance Sub-Category : 0x06c2)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int BOILER_06C2_APPEARANCE_SUB_CATEGORY = 0x06c2;

    /**
     * Heat Pump
     * (Appearance Sub-Category : 0x06c3)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int HEAT_PUMP_06C3_APPEARANCE_SUB_CATEGORY = 0x06c3;

    /**
     * Infrared Heater
     * (Appearance Sub-Category : 0x06c4)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int INFRARED_HEATER_06C4_APPEARANCE_SUB_CATEGORY = 0x06c4;

    /**
     * Radiant Panel Heater
     * (Appearance Sub-Category : 0x06c5)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int RADIANT_PANEL_HEATER_06C5_APPEARANCE_SUB_CATEGORY = 0x06c5;

    /**
     * Fan Heater
     * (Appearance Sub-Category : 0x06c6)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int FAN_HEATER_06C6_APPEARANCE_SUB_CATEGORY = 0x06c6;

    /**
     * Air Curtain
     * (Appearance Sub-Category : 0x06c7)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int AIR_CURTAIN_06C7_APPEARANCE_SUB_CATEGORY = 0x06c7;

    /**
     * Generic Access Control
     * (Appearance Sub-Category : 0x0700)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_ACCESS_CONTROL_APPEARANCE_SUB_CATEGORY = 0x0700;

    /**
     * Access Door
     * (Appearance Sub-Category : 0x0701)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int ACCESS_DOOR_APPEARANCE_SUB_CATEGORY = 0x0701;

    /**
     * Garage Door
     * (Appearance Sub-Category : 0x0702)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int GARAGE_DOOR_APPEARANCE_SUB_CATEGORY = 0x0702;

    /**
     * Emergency Exit Door
     * (Appearance Sub-Category : 0x0703)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int EMERGENCY_EXIT_DOOR_APPEARANCE_SUB_CATEGORY = 0x0703;

    /**
     * Access Lock
     * (Appearance Sub-Category : 0x0704)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int ACCESS_LOCK_APPEARANCE_SUB_CATEGORY = 0x0704;

    /**
     * Elevator
     * (Appearance Sub-Category : 0x0705)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int ELEVATOR_APPEARANCE_SUB_CATEGORY = 0x0705;

    /**
     * Window
     * (Appearance Sub-Category : 0x0706)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int WINDOW_APPEARANCE_SUB_CATEGORY = 0x0706;

    /**
     * Entrance Gate
     * (Appearance Sub-Category : 0x0707)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int ENTRANCE_GATE_APPEARANCE_SUB_CATEGORY = 0x0707;

    /**
     * Door Lock
     * (Appearance Sub-Category : 0x0708)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int DOOR_LOCK_APPEARANCE_SUB_CATEGORY = 0x0708;

    /**
     * Locker
     * (Appearance Sub-Category : 0x0709)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int LOCKER_APPEARANCE_SUB_CATEGORY = 0x0709;

    /**
     * Generic Motorized Device
     * (Appearance Sub-Category : 0x0740)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_MOTORIZED_DEVICE_APPEARANCE_SUB_CATEGORY = 0x0740;

    /**
     * Motorized Gate
     * (Appearance Sub-Category : 0x0741)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int MOTORIZED_GATE_APPEARANCE_SUB_CATEGORY = 0x0741;

    /**
     * Awning
     * (Appearance Sub-Category : 0x0742)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int AWNING_APPEARANCE_SUB_CATEGORY = 0x0742;

    /**
     * Blinds or Shades
     * (Appearance Sub-Category : 0x0743)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int BLINDS_OR_SHADES_APPEARANCE_SUB_CATEGORY = 0x0743;

    /**
     * Curtains
     * (Appearance Sub-Category : 0x0744)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int CURTAINS_APPEARANCE_SUB_CATEGORY = 0x0744;

    /**
     * Screen
     * (Appearance Sub-Category : 0x0745)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int SCREEN_APPEARANCE_SUB_CATEGORY = 0x0745;

    /**
     * Generic Power Device
     * (Appearance Sub-Category : 0x0780)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_POWER_DEVICE_APPEARANCE_SUB_CATEGORY = 0x0780;

    /**
     * Power Outlet
     * (Appearance Sub-Category : 0x0781)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int POWER_OUTLET_APPEARANCE_SUB_CATEGORY = 0x0781;

    /**
     * Power Strip
     * (Appearance Sub-Category : 0x0782)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int POWER_STRIP_APPEARANCE_SUB_CATEGORY = 0x0782;

    /**
     * Plug
     * (Appearance Sub-Category : 0x0783)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int PLUG_APPEARANCE_SUB_CATEGORY = 0x0783;

    /**
     * Power Supply
     * (Appearance Sub-Category : 0x0784)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int POWER_SUPPLY_APPEARANCE_SUB_CATEGORY = 0x0784;

    /**
     * LED Driver
     * (Appearance Sub-Category : 0x0785)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int L_E_D_DRIVER_APPEARANCE_SUB_CATEGORY = 0x0785;

    /**
     * Fluorescent Lamp Gear
     * (Appearance Sub-Category : 0x0786)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int FLUORESCENT_LAMP_GEAR_APPEARANCE_SUB_CATEGORY = 0x0786;

    /**
     * HID Lamp Gear
     * (Appearance Sub-Category : 0x0787)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int H_I_D_LAMP_GEAR_APPEARANCE_SUB_CATEGORY = 0x0787;

    /**
     * Charge Case
     * (Appearance Sub-Category : 0x0788)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int CHARGE_CASE_APPEARANCE_SUB_CATEGORY = 0x0788;

    /**
     * Power Bank
     * (Appearance Sub-Category : 0x0789)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int POWER_BANK_APPEARANCE_SUB_CATEGORY = 0x0789;

    /**
     * Generic Light Source
     * (Appearance Sub-Category : 0x07c0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_LIGHT_SOURCE_APPEARANCE_SUB_CATEGORY = 0x07c0;

    /**
     * Incandescent Light Bulb
     * (Appearance Sub-Category : 0x07c1)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int INCANDESCENT_LIGHT_BULB_APPEARANCE_SUB_CATEGORY = 0x07c1;

    /**
     * LED Lamp
     * (Appearance Sub-Category : 0x07c2)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int LED_LAMP_APPEARANCE_SUB_CATEGORY = 0x07c2;

    /**
     * HID Lamp
     * (Appearance Sub-Category : 0x07c3)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int HID_LAMP_APPEARANCE_SUB_CATEGORY = 0x07c3;

    /**
     * Fluorescent Lamp
     * (Appearance Sub-Category : 0x07c4)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int FLUORESCENT_LAMP_APPEARANCE_SUB_CATEGORY = 0x07c4;

    /**
     * LED Array
     * (Appearance Sub-Category : 0x07c5)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int LED_ARRAY_APPEARANCE_SUB_CATEGORY = 0x07c5;

    /**
     * Multi-Color LED Array
     * (Appearance Sub-Category : 0x07c6)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int MULTI_COLOR_LED_ARRAY_APPEARANCE_SUB_CATEGORY = 0x07c6;

    /**
     * Low voltage halogen
     * (Appearance Sub-Category : 0x07c7)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int LOW_VOLTAGE_HALOGEN_APPEARANCE_SUB_CATEGORY = 0x07c7;

    /**
     * Organic light emitting diode (OLED)
     * (Appearance Sub-Category : 0x07c8)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int ORGANIC_LIGHT_EMITTING_DIODE_OLED_APPEARANCE_SUB_CATEGORY = 0x07c8;

    /**
     * Generic Window Covering
     * (Appearance Sub-Category : 0x0800)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_WINDOW_COVERING_APPEARANCE_SUB_CATEGORY = 0x0800;

    /**
     * Window Shades
     * (Appearance Sub-Category : 0x0801)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int WINDOW_SHADES_APPEARANCE_SUB_CATEGORY = 0x0801;

    /**
     * Window Blinds
     * (Appearance Sub-Category : 0x0802)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int WINDOW_BLINDS_APPEARANCE_SUB_CATEGORY = 0x0802;

    /**
     * Window Awning
     * (Appearance Sub-Category : 0x0803)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int WINDOW_AWNING_APPEARANCE_SUB_CATEGORY = 0x0803;

    /**
     * Window Curtain
     * (Appearance Sub-Category : 0x0804)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int WINDOW_CURTAIN_APPEARANCE_SUB_CATEGORY = 0x0804;

    /**
     * Exterior Shutter
     * (Appearance Sub-Category : 0x0805)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int EXTERIOR_SHUTTER_APPEARANCE_SUB_CATEGORY = 0x0805;

    /**
     * Exterior Screen
     * (Appearance Sub-Category : 0x0806)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int EXTERIOR_SCREEN_APPEARANCE_SUB_CATEGORY = 0x0806;

    /**
     * Generic Audio Sink
     * (Appearance Sub-Category : 0x0840)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_AUDIO_SINK_APPEARANCE_SUB_CATEGORY = 0x0840;

    /**
     * Standalone Speaker
     * (Appearance Sub-Category : 0x0841)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int STANDALONE_SPEAKER_APPEARANCE_SUB_CATEGORY = 0x0841;

    /**
     * Soundbar
     * (Appearance Sub-Category : 0x0842)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int SOUNDBAR_APPEARANCE_SUB_CATEGORY = 0x0842;

    /**
     * Bookshelf Speaker
     * (Appearance Sub-Category : 0x0843)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int BOOKSHELF_SPEAKER_APPEARANCE_SUB_CATEGORY = 0x0843;

    /**
     * Standmounted Speaker
     * (Appearance Sub-Category : 0x0844)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int STANDMOUNTED_SPEAKER_APPEARANCE_SUB_CATEGORY = 0x0844;

    /**
     * Speakerphone
     * (Appearance Sub-Category : 0x0845)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int SPEAKERPHONE_APPEARANCE_SUB_CATEGORY = 0x0845;

    /**
     * Generic Audio Source
     * (Appearance Sub-Category : 0x0880)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_AUDIO_SOURCE_APPEARANCE_SUB_CATEGORY = 0x0880;

    /**
     * Microphone
     * (Appearance Sub-Category : 0x0881)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int MICROPHONE_APPEARANCE_SUB_CATEGORY = 0x0881;

    /**
     * Alarm
     * (Appearance Sub-Category : 0x0882)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int ALARM_APPEARANCE_SUB_CATEGORY = 0x0882;

    /**
     * Bell
     * (Appearance Sub-Category : 0x0883)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int BELL_APPEARANCE_SUB_CATEGORY = 0x0883;

    /**
     * Horn
     * (Appearance Sub-Category : 0x0884)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int HORN_APPEARANCE_SUB_CATEGORY = 0x0884;

    /**
     * Broadcasting Device
     * (Appearance Sub-Category : 0x0885)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int BROADCASTING_DEVICE_APPEARANCE_SUB_CATEGORY = 0x0885;

    /**
     * Service Desk
     * (Appearance Sub-Category : 0x0886)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int SERVICE_DESK_APPEARANCE_SUB_CATEGORY = 0x0886;

    /**
     * Kiosk
     * (Appearance Sub-Category : 0x0887)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int KIOSK_APPEARANCE_SUB_CATEGORY = 0x0887;

    /**
     * Broadcasting Room
     * (Appearance Sub-Category : 0x0888)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int BROADCASTING_ROOM_APPEARANCE_SUB_CATEGORY = 0x0888;

    /**
     * Auditorium
     * (Appearance Sub-Category : 0x0889)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int AUDITORIUM_APPEARANCE_SUB_CATEGORY = 0x0889;

    /**
     * Generic Motorized Vehicle
     * (Appearance Sub-Category : 0x08c0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_MOTORIZED_VEHICLE_APPEARANCE_SUB_CATEGORY = 0x08c0;

    /**
     * Car
     * (Appearance Sub-Category : 0x08c1)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int CAR_APPEARANCE_SUB_CATEGORY = 0x08c1;

    /**
     * Large Goods Vehicle
     * (Appearance Sub-Category : 0x08c2)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int LARGE_GOODS_VEHICLE_APPEARANCE_SUB_CATEGORY = 0x08c2;

    /**
     * 2-Wheeled Vehicle
     * (Appearance Sub-Category : 0x08c3)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int TWO_WHEELED_VEHICLE_APPEARANCE_SUB_CATEGORY = 0x08c3;

    /**
     * Motorbike
     * (Appearance Sub-Category : 0x08c4)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int MOTORBIKE_APPEARANCE_SUB_CATEGORY = 0x08c4;

    /**
     * Scooter
     * (Appearance Sub-Category : 0x08c5)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int SCOOTER_APPEARANCE_SUB_CATEGORY = 0x08c5;

    /**
     * Moped
     * (Appearance Sub-Category : 0x08c6)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int MOPED_APPEARANCE_SUB_CATEGORY = 0x08c6;

    /**
     * 3-Wheeled Vehicle
     * (Appearance Sub-Category : 0x08c7)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int THREE_WHEELED_VEHICLE_APPEARANCE_SUB_CATEGORY = 0x08c7;

    /**
     * Light Vehicle
     * (Appearance Sub-Category : 0x08c8)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int LIGHT_VEHICLE_APPEARANCE_SUB_CATEGORY = 0x08c8;

    /**
     * Quad Bike
     * (Appearance Sub-Category : 0x08c9)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int QUAD_BIKE_APPEARANCE_SUB_CATEGORY = 0x08c9;

    /**
     * Minibus
     * (Appearance Sub-Category : 0x08ca)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0a)
     */
    public static final int MINIBUS_APPEARANCE_SUB_CATEGORY = 0x08ca;

    /**
     * Bus
     * (Appearance Sub-Category : 0x08cb)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0b)
     */
    public static final int BUS_APPEARANCE_SUB_CATEGORY = 0x08cb;

    /**
     * Trolley
     * (Appearance Sub-Category : 0x08cc)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0c)
     */
    public static final int TROLLEY_APPEARANCE_SUB_CATEGORY = 0x08cc;

    /**
     * Agricultural Vehicle
     * (Appearance Sub-Category : 0x08cd)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0d)
     */
    public static final int AGRICULTURAL_VEHICLE_APPEARANCE_SUB_CATEGORY = 0x08cd;

    /**
     * Camper / Caravan
     * (Appearance Sub-Category : 0x08ce)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0e)
     */
    public static final int CAMPER_CARAVAN_APPEARANCE_SUB_CATEGORY = 0x08ce;

    /**
     * Recreational Vehicle / Motor Home
     * (Appearance Sub-Category : 0x08cf)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0f)
     */
    public static final int RECREATIONAL_VEHICLE_MOTOR_HOME_APPEARANCE_SUB_CATEGORY = 0x08cf;

    /**
     * Generic Domestic Appliance
     * (Appearance Sub-Category : 0x0900)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_DOMESTIC_APPLIANCE_APPEARANCE_SUB_CATEGORY = 0x0900;

    /**
     * Refrigerator
     * (Appearance Sub-Category : 0x0901)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int REFRIGERATOR_APPEARANCE_SUB_CATEGORY = 0x0901;

    /**
     * Freezer
     * (Appearance Sub-Category : 0x0902)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int FREEZER_APPEARANCE_SUB_CATEGORY = 0x0902;

    /**
     * Oven
     * (Appearance Sub-Category : 0x0903)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int OVEN_APPEARANCE_SUB_CATEGORY = 0x0903;

    /**
     * Microwave
     * (Appearance Sub-Category : 0x0904)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int MICROWAVE_APPEARANCE_SUB_CATEGORY = 0x0904;

    /**
     * Toaster
     * (Appearance Sub-Category : 0x0905)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int TOASTER_APPEARANCE_SUB_CATEGORY = 0x0905;

    /**
     * Washing Machine
     * (Appearance Sub-Category : 0x0906)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int WASHING_MACHINE_APPEARANCE_SUB_CATEGORY = 0x0906;

    /**
     * Dryer
     * (Appearance Sub-Category : 0x0907)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int DRYER_APPEARANCE_SUB_CATEGORY = 0x0907;

    /**
     * Coffee maker
     * (Appearance Sub-Category : 0x0908)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int COFFEE_MAKER_APPEARANCE_SUB_CATEGORY = 0x0908;

    /**
     * Clothes iron
     * (Appearance Sub-Category : 0x0909)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int CLOTHES_IRON_APPEARANCE_SUB_CATEGORY = 0x0909;

    /**
     * Curling iron
     * (Appearance Sub-Category : 0x090a)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0a)
     */
    public static final int CURLING_IRON_APPEARANCE_SUB_CATEGORY = 0x090a;

    /**
     * Hair dryer
     * (Appearance Sub-Category : 0x090b)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0b)
     */
    public static final int HAIR_DRYER_APPEARANCE_SUB_CATEGORY = 0x090b;

    /**
     * Vacuum cleaner
     * (Appearance Sub-Category : 0x090c)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0c)
     */
    public static final int VACUUM_CLEANER_APPEARANCE_SUB_CATEGORY = 0x090c;

    /**
     * Robotic vacuum cleaner
     * (Appearance Sub-Category : 0x090d)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0d)
     */
    public static final int ROBOTIC_VACUUM_CLEANER_APPEARANCE_SUB_CATEGORY = 0x090d;

    /**
     * Rice cooker
     * (Appearance Sub-Category : 0x090e)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0e)
     */
    public static final int RICE_COOKER_APPEARANCE_SUB_CATEGORY = 0x090e;

    /**
     * Clothes steamer
     * (Appearance Sub-Category : 0x090f)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0f)
     */
    public static final int CLOTHES_STEAMER_APPEARANCE_SUB_CATEGORY = 0x090f;

    /**
     * Generic Wearable Audio Device
     * (Appearance Sub-Category : 0x0940)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_WEARABLE_AUDIO_DEVICE_APPEARANCE_SUB_CATEGORY = 0x0940;

    /**
     * Earbud
     * (Appearance Sub-Category : 0x0941)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int EARBUD_APPEARANCE_SUB_CATEGORY = 0x0941;

    /**
     * Headset
     * (Appearance Sub-Category : 0x0942)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int HEADSET_APPEARANCE_SUB_CATEGORY = 0x0942;

    /**
     * Headphones
     * (Appearance Sub-Category : 0x0943)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int HEADPHONES_APPEARANCE_SUB_CATEGORY = 0x0943;

    /**
     * Neck Band
     * (Appearance Sub-Category : 0x0944)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int NECK_BAND_APPEARANCE_SUB_CATEGORY = 0x0944;

    /**
     * Generic Aircraft
     * (Appearance Sub-Category : 0x0980)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_AIRCRAFT_APPEARANCE_SUB_CATEGORY = 0x0980;

    /**
     * Light Aircraft
     * (Appearance Sub-Category : 0x0981)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int LIGHT_AIRCRAFT_APPEARANCE_SUB_CATEGORY = 0x0981;

    /**
     * Microlight
     * (Appearance Sub-Category : 0x0982)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int MICROLIGHT_APPEARANCE_SUB_CATEGORY = 0x0982;

    /**
     * Paraglider
     * (Appearance Sub-Category : 0x0983)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int PARAGLIDER_APPEARANCE_SUB_CATEGORY = 0x0983;

    /**
     * Large Passenger Aircraft
     * (Appearance Sub-Category : 0x0984)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int LARGE_PASSENGER_AIRCRAFT_APPEARANCE_SUB_CATEGORY = 0x0984;

    /**
     * Generic AV Equipment
     * (Appearance Sub-Category : 0x09c0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_AV_EQUIPMENT_APPEARANCE_SUB_CATEGORY = 0x09c0;

    /**
     * Amplifier
     * (Appearance Sub-Category : 0x09c1)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int AMPLIFIER_APPEARANCE_SUB_CATEGORY = 0x09c1;

    /**
     * Receiver
     * (Appearance Sub-Category : 0x09c2)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int RECEIVER_APPEARANCE_SUB_CATEGORY = 0x09c2;

    /**
     * Radio
     * (Appearance Sub-Category : 0x09c3)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int RADIO_APPEARANCE_SUB_CATEGORY = 0x09c3;

    /**
     * Tuner
     * (Appearance Sub-Category : 0x09c4)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int TUNER_APPEARANCE_SUB_CATEGORY = 0x09c4;

    /**
     * Turntable
     * (Appearance Sub-Category : 0x09c5)
     * (Appearance Sub-Category(bits 5 to 0) : 0x05)
     */
    public static final int TURNTABLE_APPEARANCE_SUB_CATEGORY = 0x09c5;

    /**
     * CD Player
     * (Appearance Sub-Category : 0x09c6)
     * (Appearance Sub-Category(bits 5 to 0) : 0x06)
     */
    public static final int CD_PLAYER_APPEARANCE_SUB_CATEGORY = 0x09c6;

    /**
     * DVD Player
     * (Appearance Sub-Category : 0x09c7)
     * (Appearance Sub-Category(bits 5 to 0) : 0x07)
     */
    public static final int DVD_PLAYER_APPEARANCE_SUB_CATEGORY = 0x09c7;

    /**
     * Bluray Player
     * (Appearance Sub-Category : 0x09c8)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int BLURAY_PLAYER_APPEARANCE_SUB_CATEGORY = 0x09c8;

    /**
     * Optical Disc Player
     * (Appearance Sub-Category : 0x09c9)
     * (Appearance Sub-Category(bits 5 to 0) : 0x09)
     */
    public static final int OPTICAL_DISC_PLAYER_APPEARANCE_SUB_CATEGORY = 0x09c9;

    /**
     * Set-Top Box
     * (Appearance Sub-Category : 0x09ca)
     * (Appearance Sub-Category(bits 5 to 0) : 0x0a)
     */
    public static final int SET_TOP_BOX_APPEARANCE_SUB_CATEGORY = 0x09ca;

    /**
     * Generic Display Equipment
     * (Appearance Sub-Category : 0x0a00)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_DISPLAY_EQUIPMENT_APPEARANCE_SUB_CATEGORY = 0x0a00;

    /**
     * Television
     * (Appearance Sub-Category : 0x0a01)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int TELEVISION_APPEARANCE_SUB_CATEGORY = 0x0a01;

    /**
     * Monitor
     * (Appearance Sub-Category : 0x0a02)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int MONITOR_APPEARANCE_SUB_CATEGORY = 0x0a02;

    /**
     * Projector
     * (Appearance Sub-Category : 0x0a03)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int PROJECTOR_APPEARANCE_SUB_CATEGORY = 0x0a03;

    /**
     * Generic Hearing aid
     * (Appearance Sub-Category : 0x0a40)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_HEARINGAID_APPEARANCE_SUB_CATEGORY = 0x0a40;

    /**
     * In-ear hearing aid
     * (Appearance Sub-Category : 0x0a41)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int IN_EAR_HEARING_AID_APPEARANCE_SUB_CATEGORY = 0x0a41;

    /**
     * Behind-ear hearing aid
     * (Appearance Sub-Category : 0x0a42)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int BEHIND_EAR_HEARING_AID_APPEARANCE_SUB_CATEGORY = 0x0a42;

    /**
     * Cochlear Implant
     * (Appearance Sub-Category : 0x0a43)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int COCHLEAR_IMPLANT_APPEARANCE_SUB_CATEGORY = 0x0a43;

    /**
     * Generic Gaming
     * (Appearance Sub-Category : 0x0a80)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_GAMING_APPEARANCE_SUB_CATEGORY = 0x0a80;

    /**
     * Home Video Game Console
     * (Appearance Sub-Category : 0x0a81)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int HOME_VIDEO_GAME_CONSOLE_APPEARANCE_SUB_CATEGORY = 0x0a81;

    /**
     * Portable handheld console
     * (Appearance Sub-Category : 0x0a82)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int PORTABLE_HANDHELD_CONSOLE_APPEARANCE_SUB_CATEGORY = 0x0a82;

    /**
     * Generic Pulse Oximeter
     * (Appearance Sub-Category : 0x0c40)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_PULSE_OXIMETER_APPEARANCE_SUB_CATEGORY = 0x0c40;

    /**
     * Fingertip Pulse Oximeter
     * (Appearance Sub-Category : 0x0c41)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int FINGERTIP_PULSE_OXIMETER_APPEARANCE_SUB_CATEGORY = 0x0c41;

    /**
     * Wrist Worn Pulse Oximeter
     * (Appearance Sub-Category : 0x0c42)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int WRIST_WORN_PULSE_OXIMETER_APPEARANCE_SUB_CATEGORY = 0x0c42;

    /**
     * Generic Weight Scale
     * (Appearance Sub-Category : 0x0c80)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_WEIGHT_SCALE_APPEARANCE_SUB_CATEGORY = 0x0c80;

    /**
     * Generic Personal Mobility Device
     * (Appearance Sub-Category : 0x0cc0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_PERSONAL_MOBILITY_DEVICE_APPEARANCE_SUB_CATEGORY = 0x0cc0;

    /**
     * Powered Wheelchair
     * (Appearance Sub-Category : 0x0cc1)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int POWERED_WHEELCHAIR_APPEARANCE_SUB_CATEGORY = 0x0cc1;

    /**
     * Mobility Scooter
     * (Appearance Sub-Category : 0x0cc2)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int MOBILITY_SCOOTER_APPEARANCE_SUB_CATEGORY = 0x0cc2;

    /**
     * Generic Continuous Glucose Monitor
     * (Appearance Sub-Category : 0x0d00)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_CONTINUOUS_GLUCOSE_MONITOR_APPEARANCE_SUB_CATEGORY = 0x0d00;

    /**
     * Generic Insulin Pump
     * (Appearance Sub-Category : 0x0d40)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_INSULIN_PUMP_APPEARANCE_SUB_CATEGORY = 0x0d40;

    /**
     * Insulin Pump, durable pump
     * (Appearance Sub-Category : 0x0d41)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int INSULIN_PUMP_DURABLE_PUMP_APPEARANCE_SUB_CATEGORY = 0x0d41;

    /**
     * Insulin Pump, patch pump
     * (Appearance Sub-Category : 0x0d44)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int INSULIN_PUMP_PATCH_PUMP_APPEARANCE_SUB_CATEGORY = 0x0d44;

    /**
     * Insulin Pen
     * (Appearance Sub-Category : 0x0d48)
     * (Appearance Sub-Category(bits 5 to 0) : 0x08)
     */
    public static final int INSULIN_PEN_APPEARANCE_SUB_CATEGORY = 0x0d48;

    /**
     * Generic Medication Delivery
     * (Appearance Sub-Category : 0x0d80)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_MEDICATION_DELIVERY_APPEARANCE_SUB_CATEGORY = 0x0d80;

    /**
     * Generic Spirometer
     * (Appearance Sub-Category : 0x0dc0)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_SPIROMETER_APPEARANCE_SUB_CATEGORY = 0x0dc0;

    /**
     * Handheld Spirometer
     * (Appearance Sub-Category : 0x0dc1)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int HANDHELD_SPIROMETER_APPEARANCE_SUB_CATEGORY = 0x0dc1;

    /**
     * Generic Outdoor Sports Activity
     * (Appearance Sub-Category : 0x1440)
     * (Appearance Sub-Category(bits 5 to 0) : 0x00)
     */
    public static final int GENERIC_OUTDOOR_SPORTS_ACTIVITY_APPEARANCE_SUB_CATEGORY = 0x1440;

    /**
     * Location Display
     * (Appearance Sub-Category : 0x1441)
     * (Appearance Sub-Category(bits 5 to 0) : 0x01)
     */
    public static final int LOCATION_DISPLAY_APPEARANCE_SUB_CATEGORY = 0x1441;

    /**
     * Location and Navigation Display
     * (Appearance Sub-Category : 0x1442)
     * (Appearance Sub-Category(bits 5 to 0) : 0x02)
     */
    public static final int LOCATION_AND_NAVIGATION_DISPLAY_APPEARANCE_SUB_CATEGORY = 0x1442;

    /**
     * Location Pod
     * (Appearance Sub-Category : 0x1443)
     * (Appearance Sub-Category(bits 5 to 0) : 0x03)
     */
    public static final int LOCATION_POD_APPEARANCE_SUB_CATEGORY = 0x1443;

    /**
     * Location and Navigation Pod
     * (Appearance Sub-Category : 0x1444)
     * (Appearance Sub-Category(bits 5 to 0) : 0x04)
     */
    public static final int LOCATION_AND_NAVIGATION_POD_APPEARANCE_SUB_CATEGORY = 0x1444;

}