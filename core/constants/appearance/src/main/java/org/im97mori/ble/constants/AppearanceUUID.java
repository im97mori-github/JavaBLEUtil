package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT Appearance UUID
 */
public class AppearanceUUID {

    @SuppressWarnings("serial")
    private static final class CategoryMap128 extends HashMap<UUID, String> {

        private CategoryMap128() {
            super();
            put(UUID.fromString("0000000-0000-1000-8000-00805f9b34fb"), "Unknown");
            put(UUID.fromString("0000001-0000-1000-8000-00805f9b34fb"), "Phone");
            put(UUID.fromString("0000002-0000-1000-8000-00805f9b34fb"), "Computer");
            put(UUID.fromString("0000003-0000-1000-8000-00805f9b34fb"), "Watch");
            put(UUID.fromString("0000004-0000-1000-8000-00805f9b34fb"), "Clock");
            put(UUID.fromString("0000005-0000-1000-8000-00805f9b34fb"), "Display");
            put(UUID.fromString("0000006-0000-1000-8000-00805f9b34fb"), "Remote Control");
            put(UUID.fromString("0000007-0000-1000-8000-00805f9b34fb"), "Eye­glasses");
            put(UUID.fromString("0000008-0000-1000-8000-00805f9b34fb"), "Tag");
            put(UUID.fromString("0000009-0000-1000-8000-00805f9b34fb"), "Keyring");
            put(UUID.fromString("000000a-0000-1000-8000-00805f9b34fb"), "Media Player");
            put(UUID.fromString("000000b-0000-1000-8000-00805f9b34fb"), "Barcode Scanner");
            put(UUID.fromString("000000c-0000-1000-8000-00805f9b34fb"), "Thermometer");
            put(UUID.fromString("000000d-0000-1000-8000-00805f9b34fb"), "Heart Rate Sensor");
            put(UUID.fromString("000000e-0000-1000-8000-00805f9b34fb"), "Blood Pressure");
            put(UUID.fromString("000000f-0000-1000-8000-00805f9b34fb"), "Human Interface Device");
            put(UUID.fromString("0000010-0000-1000-8000-00805f9b34fb"), "Glucose Meter");
            put(UUID.fromString("0000011-0000-1000-8000-00805f9b34fb"), "Running Walking Sensor");
            put(UUID.fromString("0000012-0000-1000-8000-00805f9b34fb"), "Cycling");
            put(UUID.fromString("0000013-0000-1000-8000-00805f9b34fb"), "Control Device");
            put(UUID.fromString("0000014-0000-1000-8000-00805f9b34fb"), "Network Device");
            put(UUID.fromString("0000015-0000-1000-8000-00805f9b34fb"), "Sensor");
            put(UUID.fromString("0000016-0000-1000-8000-00805f9b34fb"), "Light Fixtures");
            put(UUID.fromString("0000017-0000-1000-8000-00805f9b34fb"), "Fan");
            put(UUID.fromString("0000018-0000-1000-8000-00805f9b34fb"), "HVAC");
            put(UUID.fromString("0000019-0000-1000-8000-00805f9b34fb"), "Air Conditioning");
            put(UUID.fromString("000001a-0000-1000-8000-00805f9b34fb"), "Humidifier");
            put(UUID.fromString("000001b-0000-1000-8000-00805f9b34fb"), "Heating");
            put(UUID.fromString("000001c-0000-1000-8000-00805f9b34fb"), "Access Control");
            put(UUID.fromString("000001d-0000-1000-8000-00805f9b34fb"), "Motorized Device");
            put(UUID.fromString("000001e-0000-1000-8000-00805f9b34fb"), "Power Device");
            put(UUID.fromString("000001f-0000-1000-8000-00805f9b34fb"), "Light Source");
            put(UUID.fromString("0000020-0000-1000-8000-00805f9b34fb"), "Window Covering");
            put(UUID.fromString("0000021-0000-1000-8000-00805f9b34fb"), "Audio Sink");
            put(UUID.fromString("0000022-0000-1000-8000-00805f9b34fb"), "Audio Source");
            put(UUID.fromString("0000023-0000-1000-8000-00805f9b34fb"), "Motorized Vehicle");
            put(UUID.fromString("0000024-0000-1000-8000-00805f9b34fb"), "Domestic Appliance");
            put(UUID.fromString("0000025-0000-1000-8000-00805f9b34fb"), "Wearable Audio Device");
            put(UUID.fromString("0000026-0000-1000-8000-00805f9b34fb"), "Aircraft");
            put(UUID.fromString("0000027-0000-1000-8000-00805f9b34fb"), "AV Equipment");
            put(UUID.fromString("0000028-0000-1000-8000-00805f9b34fb"), "Display Equipment");
            put(UUID.fromString("0000029-0000-1000-8000-00805f9b34fb"), "Hearing aid");
            put(UUID.fromString("000002a-0000-1000-8000-00805f9b34fb"), "Gaming");
            put(UUID.fromString("000002b-0000-1000-8000-00805f9b34fb"), "Signage");
            put(UUID.fromString("0000031-0000-1000-8000-00805f9b34fb"), "Pulse Oximeter");
            put(UUID.fromString("0000032-0000-1000-8000-00805f9b34fb"), "Weight Scale");
            put(UUID.fromString("0000033-0000-1000-8000-00805f9b34fb"), "Personal Mobility Device");
            put(UUID.fromString("0000034-0000-1000-8000-00805f9b34fb"), "Continuous Glucose Monitor");
            put(UUID.fromString("0000035-0000-1000-8000-00805f9b34fb"), "Insulin Pump");
            put(UUID.fromString("0000036-0000-1000-8000-00805f9b34fb"), "Medication Delivery");
            put(UUID.fromString("0000051-0000-1000-8000-00805f9b34fb"), "Outdoor Sports Activity");

        }
    }

    @SuppressWarnings("serial")
    private static final class SubCategoryMap128 extends HashMap<UUID, String> {

        private SubCategoryMap128() {
            super();
            put(UUID.fromString("00000000-0000-1000-8000-00805f9b34fb"), "Generic Unknown");
            put(UUID.fromString("00000040-0000-1000-8000-00805f9b34fb"), "Generic Phone");
            put(UUID.fromString("00000080-0000-1000-8000-00805f9b34fb"), "Generic Computer");
            put(UUID.fromString("00000081-0000-1000-8000-00805f9b34fb"), "Desktop Workstation");
            put(UUID.fromString("00000082-0000-1000-8000-00805f9b34fb"), "Server­class Computer");
            put(UUID.fromString("00000083-0000-1000-8000-00805f9b34fb"), "Laptop");
            put(UUID.fromString("00000084-0000-1000-8000-00805f9b34fb"), "Handheld PC/PDA (clamshell)");
            put(UUID.fromString("00000085-0000-1000-8000-00805f9b34fb"), "Palm­size PC/PDA");
            put(UUID.fromString("00000086-0000-1000-8000-00805f9b34fb"), "Wearable computer (watch size)");
            put(UUID.fromString("00000087-0000-1000-8000-00805f9b34fb"), "Tablet");
            put(UUID.fromString("00000088-0000-1000-8000-00805f9b34fb"), "Docking Station");
            put(UUID.fromString("00000089-0000-1000-8000-00805f9b34fb"), "All in One");
            put(UUID.fromString("0000008a-0000-1000-8000-00805f9b34fb"), "Blade Server");
            put(UUID.fromString("0000008b-0000-1000-8000-00805f9b34fb"), "Convertible");
            put(UUID.fromString("0000008c-0000-1000-8000-00805f9b34fb"), "Detachable");
            put(UUID.fromString("0000008d-0000-1000-8000-00805f9b34fb"), "IoT Gateway");
            put(UUID.fromString("0000008e-0000-1000-8000-00805f9b34fb"), "Mini PC");
            put(UUID.fromString("0000008f-0000-1000-8000-00805f9b34fb"), "Stick PC");
            put(UUID.fromString("000000c0-0000-1000-8000-00805f9b34fb"), "Generic Watch");
            put(UUID.fromString("000000c1-0000-1000-8000-00805f9b34fb"), "Sports Watch");
            put(UUID.fromString("000000c2-0000-1000-8000-00805f9b34fb"), "Smartwatch");
            put(UUID.fromString("00000100-0000-1000-8000-00805f9b34fb"), "Generic Clock");
            put(UUID.fromString("00000140-0000-1000-8000-00805f9b34fb"), "Generic Display");
            put(UUID.fromString("00000180-0000-1000-8000-00805f9b34fb"), "Generic Remote Control");
            put(UUID.fromString("000001c0-0000-1000-8000-00805f9b34fb"), "Generic Eye­glasses");
            put(UUID.fromString("00000200-0000-1000-8000-00805f9b34fb"), "Generic Tag");
            put(UUID.fromString("00000240-0000-1000-8000-00805f9b34fb"), "Generic Keyring");
            put(UUID.fromString("00000280-0000-1000-8000-00805f9b34fb"), "Generic Media Player");
            put(UUID.fromString("000002c0-0000-1000-8000-00805f9b34fb"), "Generic Barcode Scanner");
            put(UUID.fromString("00000300-0000-1000-8000-00805f9b34fb"), "Generic Thermometer");
            put(UUID.fromString("00000301-0000-1000-8000-00805f9b34fb"), "Ear Thermometer");
            put(UUID.fromString("00000340-0000-1000-8000-00805f9b34fb"), "Generic Heart Rate Sensor");
            put(UUID.fromString("00000341-0000-1000-8000-00805f9b34fb"), "Heart Rate Belt");
            put(UUID.fromString("00000380-0000-1000-8000-00805f9b34fb"), "Generic Blood Pressure");
            put(UUID.fromString("00000381-0000-1000-8000-00805f9b34fb"), "Arm Blood Pressure");
            put(UUID.fromString("00000382-0000-1000-8000-00805f9b34fb"), "Wrist Blood Pressure");
            put(UUID.fromString("000003c0-0000-1000-8000-00805f9b34fb"), "Generic Human Interface Device");
            put(UUID.fromString("000003c1-0000-1000-8000-00805f9b34fb"), "Keyboard");
            put(UUID.fromString("000003c2-0000-1000-8000-00805f9b34fb"), "Mouse");
            put(UUID.fromString("000003c3-0000-1000-8000-00805f9b34fb"), "Joystick");
            put(UUID.fromString("000003c4-0000-1000-8000-00805f9b34fb"), "Gamepad");
            put(UUID.fromString("000003c5-0000-1000-8000-00805f9b34fb"), "Digitizer Tablet");
            put(UUID.fromString("000003c6-0000-1000-8000-00805f9b34fb"), "Card Reader");
            put(UUID.fromString("000003c7-0000-1000-8000-00805f9b34fb"), "Digital Pen");
            put(UUID.fromString("000003c8-0000-1000-8000-00805f9b34fb"), "Barcode Scanner");
            put(UUID.fromString("00000400-0000-1000-8000-00805f9b34fb"), "Generic Glucose Meter");
            put(UUID.fromString("00000440-0000-1000-8000-00805f9b34fb"), "Generic Running Walking Sensor");
            put(UUID.fromString("00000441-0000-1000-8000-00805f9b34fb"), "In­Shoe Running Walking Sensor");
            put(UUID.fromString("00000442-0000-1000-8000-00805f9b34fb"), "On­Shoe Running Walking Sensor");
            put(UUID.fromString("00000443-0000-1000-8000-00805f9b34fb"), "On­Hip Running Walking Sensor");
            put(UUID.fromString("00000480-0000-1000-8000-00805f9b34fb"), "Generic Cycling");
            put(UUID.fromString("00000481-0000-1000-8000-00805f9b34fb"), "Cycling Computer");
            put(UUID.fromString("00000482-0000-1000-8000-00805f9b34fb"), "Speed Sensor");
            put(UUID.fromString("00000483-0000-1000-8000-00805f9b34fb"), "Cadence Sensor");
            put(UUID.fromString("00000484-0000-1000-8000-00805f9b34fb"), "Power Sensor");
            put(UUID.fromString("00000485-0000-1000-8000-00805f9b34fb"), "Speed and Cadence Sensor");
            put(UUID.fromString("000004c0-0000-1000-8000-00805f9b34fb"), "Generic Control Device");
            put(UUID.fromString("000004c1-0000-1000-8000-00805f9b34fb"), "Switch");
            put(UUID.fromString("000004c2-0000-1000-8000-00805f9b34fb"), "Multi­switch");
            put(UUID.fromString("000004c3-0000-1000-8000-00805f9b34fb"), "Button");
            put(UUID.fromString("000004c4-0000-1000-8000-00805f9b34fb"), "Slider");
            put(UUID.fromString("000004c5-0000-1000-8000-00805f9b34fb"), "Rotary Switch");
            put(UUID.fromString("000004c6-0000-1000-8000-00805f9b34fb"), "Touch Panel");
            put(UUID.fromString("000004c7-0000-1000-8000-00805f9b34fb"), "Single Switch");
            put(UUID.fromString("000004c8-0000-1000-8000-00805f9b34fb"), "Double Switch");
            put(UUID.fromString("000004c9-0000-1000-8000-00805f9b34fb"), "Triple Switch");
            put(UUID.fromString("000004ca-0000-1000-8000-00805f9b34fb"), "Battery Switch");
            put(UUID.fromString("000004cb-0000-1000-8000-00805f9b34fb"), "Energy Harvesting Switch");
            put(UUID.fromString("000004cc-0000-1000-8000-00805f9b34fb"), "Push Button");
            put(UUID.fromString("00000500-0000-1000-8000-00805f9b34fb"), "Generic Network Device");
            put(UUID.fromString("00000501-0000-1000-8000-00805f9b34fb"), "Access Point");
            put(UUID.fromString("00000502-0000-1000-8000-00805f9b34fb"), "Mesh Device");
            put(UUID.fromString("00000503-0000-1000-8000-00805f9b34fb"), "Mesh Network Proxy");
            put(UUID.fromString("00000540-0000-1000-8000-00805f9b34fb"), "Generic Sensor");
            put(UUID.fromString("00000541-0000-1000-8000-00805f9b34fb"), "Motion Sensor");
            put(UUID.fromString("00000542-0000-1000-8000-00805f9b34fb"), "Air quality Sensor");
            put(UUID.fromString("00000543-0000-1000-8000-00805f9b34fb"), "Temperature Sensor");
            put(UUID.fromString("00000544-0000-1000-8000-00805f9b34fb"), "Humidity Sensor");
            put(UUID.fromString("00000545-0000-1000-8000-00805f9b34fb"), "Leak Sensor");
            put(UUID.fromString("00000546-0000-1000-8000-00805f9b34fb"), "Smoke Sensor");
            put(UUID.fromString("00000547-0000-1000-8000-00805f9b34fb"), "Occupancy Sensor");
            put(UUID.fromString("00000548-0000-1000-8000-00805f9b34fb"), "Contact Sensor");
            put(UUID.fromString("00000549-0000-1000-8000-00805f9b34fb"), "Carbon Monoxide Sensor");
            put(UUID.fromString("0000054a-0000-1000-8000-00805f9b34fb"), "Carbon Dioxide Sensor");
            put(UUID.fromString("0000054b-0000-1000-8000-00805f9b34fb"), "Ambient Light Sensor");
            put(UUID.fromString("0000054c-0000-1000-8000-00805f9b34fb"), "Energy Sensor");
            put(UUID.fromString("0000054d-0000-1000-8000-00805f9b34fb"), "Color Light Sensor");
            put(UUID.fromString("0000054e-0000-1000-8000-00805f9b34fb"), "Rain Sensor");
            put(UUID.fromString("0000054f-0000-1000-8000-00805f9b34fb"), "Fire Sensor");
            put(UUID.fromString("00000550-0000-1000-8000-00805f9b34fb"), "Wind Sensor");
            put(UUID.fromString("00000551-0000-1000-8000-00805f9b34fb"), "Proximity Sensor");
            put(UUID.fromString("00000552-0000-1000-8000-00805f9b34fb"), "Multi­Sensor");
            put(UUID.fromString("00000553-0000-1000-8000-00805f9b34fb"), "Flush mounted sensor");
            put(UUID.fromString("00000554-0000-1000-8000-00805f9b34fb"), "Ceiling mounted sensor");
            put(UUID.fromString("00000555-0000-1000-8000-00805f9b34fb"), "Wall mounted sensor");
            put(UUID.fromString("00000556-0000-1000-8000-00805f9b34fb"), "Multisensor");
            put(UUID.fromString("00000557-0000-1000-8000-00805f9b34fb"), "Energy Meter");
            put(UUID.fromString("00000558-0000-1000-8000-00805f9b34fb"), "Flame Detector");
            put(UUID.fromString("00000559-0000-1000-8000-00805f9b34fb"), "Vehicle Tire Pressure Sensor");
            put(UUID.fromString("00000580-0000-1000-8000-00805f9b34fb"), "Generic Light Fixtures");
            put(UUID.fromString("00000581-0000-1000-8000-00805f9b34fb"), "Wall Light");
            put(UUID.fromString("00000582-0000-1000-8000-00805f9b34fb"), "Ceiling Light");
            put(UUID.fromString("00000583-0000-1000-8000-00805f9b34fb"), "Floor Light");
            put(UUID.fromString("00000584-0000-1000-8000-00805f9b34fb"), "Cabinet Light");
            put(UUID.fromString("00000585-0000-1000-8000-00805f9b34fb"), "Desk Light");
            put(UUID.fromString("00000586-0000-1000-8000-00805f9b34fb"), "Troffer Light");
            put(UUID.fromString("00000587-0000-1000-8000-00805f9b34fb"), "Pendant Light");
            put(UUID.fromString("00000588-0000-1000-8000-00805f9b34fb"), "In­ground Light");
            put(UUID.fromString("00000589-0000-1000-8000-00805f9b34fb"), "Flood Light");
            put(UUID.fromString("0000058a-0000-1000-8000-00805f9b34fb"), "Underwater Light");
            put(UUID.fromString("0000058b-0000-1000-8000-00805f9b34fb"), "Bollard with Light");
            put(UUID.fromString("0000058c-0000-1000-8000-00805f9b34fb"), "Pathway Light");
            put(UUID.fromString("0000058d-0000-1000-8000-00805f9b34fb"), "Garden Light");
            put(UUID.fromString("0000058e-0000-1000-8000-00805f9b34fb"), "Pole­top Light");
            put(UUID.fromString("0000058f-0000-1000-8000-00805f9b34fb"), "Spotlight");
            put(UUID.fromString("00000590-0000-1000-8000-00805f9b34fb"), "Linear Light");
            put(UUID.fromString("00000591-0000-1000-8000-00805f9b34fb"), "Street Light");
            put(UUID.fromString("00000592-0000-1000-8000-00805f9b34fb"), "Shelves Light");
            put(UUID.fromString("00000593-0000-1000-8000-00805f9b34fb"), "Bay Light");
            put(UUID.fromString("00000594-0000-1000-8000-00805f9b34fb"), "Emergency Exit Light");
            put(UUID.fromString("00000595-0000-1000-8000-00805f9b34fb"), "Light controller");
            put(UUID.fromString("00000596-0000-1000-8000-00805f9b34fb"), "Light driver");
            put(UUID.fromString("00000597-0000-1000-8000-00805f9b34fb"), "Bulb");
            put(UUID.fromString("00000598-0000-1000-8000-00805f9b34fb"), "Low­bay Light");
            put(UUID.fromString("00000599-0000-1000-8000-00805f9b34fb"), "High­bay Light");
            put(UUID.fromString("000005c0-0000-1000-8000-00805f9b34fb"), "Generic Fan");
            put(UUID.fromString("000005c1-0000-1000-8000-00805f9b34fb"), "Ceiling Fan");
            put(UUID.fromString("000005c2-0000-1000-8000-00805f9b34fb"), "Axial Fan");
            put(UUID.fromString("000005c3-0000-1000-8000-00805f9b34fb"), "Exhaust Fan");
            put(UUID.fromString("000005c4-0000-1000-8000-00805f9b34fb"), "Pedestal Fan");
            put(UUID.fromString("000005c5-0000-1000-8000-00805f9b34fb"), "Desk Fan");
            put(UUID.fromString("000005c6-0000-1000-8000-00805f9b34fb"), "Wall Fan");
            put(UUID.fromString("00000600-0000-1000-8000-00805f9b34fb"), "Generic HVAC");
            put(UUID.fromString("00000601-0000-1000-8000-00805f9b34fb"), "Thermostat");
            put(UUID.fromString("00000602-0000-1000-8000-00805f9b34fb"), "Humidifier");
            put(UUID.fromString("00000603-0000-1000-8000-00805f9b34fb"), "De­humidifier");
            put(UUID.fromString("00000604-0000-1000-8000-00805f9b34fb"), "Heater");
            put(UUID.fromString("00000605-0000-1000-8000-00805f9b34fb"), "Radiator");
            put(UUID.fromString("00000606-0000-1000-8000-00805f9b34fb"), "Boiler");
            put(UUID.fromString("00000607-0000-1000-8000-00805f9b34fb"), "Heat pump");
            put(UUID.fromString("00000608-0000-1000-8000-00805f9b34fb"), "Infrared heater");
            put(UUID.fromString("00000609-0000-1000-8000-00805f9b34fb"), "Radiant panel heater");
            put(UUID.fromString("0000060a-0000-1000-8000-00805f9b34fb"), "Fan heater");
            put(UUID.fromString("0000060b-0000-1000-8000-00805f9b34fb"), "Air curtain");
            put(UUID.fromString("00000640-0000-1000-8000-00805f9b34fb"), "Generic Air Conditioning");
            put(UUID.fromString("00000680-0000-1000-8000-00805f9b34fb"), "Generic Humidifier");
            put(UUID.fromString("000006c0-0000-1000-8000-00805f9b34fb"), "Generic Heating");
            put(UUID.fromString("000006c1-0000-1000-8000-00805f9b34fb"), "Radiator");
            put(UUID.fromString("000006c2-0000-1000-8000-00805f9b34fb"), "Boiler");
            put(UUID.fromString("000006c3-0000-1000-8000-00805f9b34fb"), "Heat Pump");
            put(UUID.fromString("000006c4-0000-1000-8000-00805f9b34fb"), "Infrared Heater");
            put(UUID.fromString("000006c5-0000-1000-8000-00805f9b34fb"), "Radiant Panel Heater");
            put(UUID.fromString("000006c6-0000-1000-8000-00805f9b34fb"), "Fan Heater");
            put(UUID.fromString("000006c7-0000-1000-8000-00805f9b34fb"), "Air Curtain");
            put(UUID.fromString("00000700-0000-1000-8000-00805f9b34fb"), "Generic Access Control");
            put(UUID.fromString("00000701-0000-1000-8000-00805f9b34fb"), "Access Door");
            put(UUID.fromString("00000702-0000-1000-8000-00805f9b34fb"), "Garage Door");
            put(UUID.fromString("00000703-0000-1000-8000-00805f9b34fb"), "Emergency Exit Door");
            put(UUID.fromString("00000704-0000-1000-8000-00805f9b34fb"), "Access Lock");
            put(UUID.fromString("00000705-0000-1000-8000-00805f9b34fb"), "Elevator");
            put(UUID.fromString("00000706-0000-1000-8000-00805f9b34fb"), "Window");
            put(UUID.fromString("00000707-0000-1000-8000-00805f9b34fb"), "Entrance Gate");
            put(UUID.fromString("00000708-0000-1000-8000-00805f9b34fb"), "Door Lock");
            put(UUID.fromString("00000709-0000-1000-8000-00805f9b34fb"), "Locker");
            put(UUID.fromString("00000740-0000-1000-8000-00805f9b34fb"), "Generic Motorized Device");
            put(UUID.fromString("00000741-0000-1000-8000-00805f9b34fb"), "Motorized Gate");
            put(UUID.fromString("00000742-0000-1000-8000-00805f9b34fb"), "Awning");
            put(UUID.fromString("00000743-0000-1000-8000-00805f9b34fb"), "Blinds or Shades");
            put(UUID.fromString("00000744-0000-1000-8000-00805f9b34fb"), "Curtains");
            put(UUID.fromString("00000745-0000-1000-8000-00805f9b34fb"), "Screen");
            put(UUID.fromString("00000780-0000-1000-8000-00805f9b34fb"), "Generic Power Device");
            put(UUID.fromString("00000781-0000-1000-8000-00805f9b34fb"), "Power Outlet");
            put(UUID.fromString("00000782-0000-1000-8000-00805f9b34fb"), "Power Strip");
            put(UUID.fromString("00000783-0000-1000-8000-00805f9b34fb"), "Plug");
            put(UUID.fromString("00000784-0000-1000-8000-00805f9b34fb"), "Power Supply");
            put(UUID.fromString("00000785-0000-1000-8000-00805f9b34fb"), "LED Driver");
            put(UUID.fromString("00000786-0000-1000-8000-00805f9b34fb"), "Fluorescent Lamp Gear");
            put(UUID.fromString("00000787-0000-1000-8000-00805f9b34fb"), "HID Lamp Gear");
            put(UUID.fromString("00000788-0000-1000-8000-00805f9b34fb"), "Charge Case");
            put(UUID.fromString("00000789-0000-1000-8000-00805f9b34fb"), "Power Bank");
            put(UUID.fromString("000007c0-0000-1000-8000-00805f9b34fb"), "Generic Light Source");
            put(UUID.fromString("000007c1-0000-1000-8000-00805f9b34fb"), "Incandescent Light Bulb");
            put(UUID.fromString("000007c2-0000-1000-8000-00805f9b34fb"), "LED Lamp");
            put(UUID.fromString("000007c3-0000-1000-8000-00805f9b34fb"), "HID Lamp");
            put(UUID.fromString("000007c4-0000-1000-8000-00805f9b34fb"), "Fluorescent Lamp");
            put(UUID.fromString("000007c5-0000-1000-8000-00805f9b34fb"), "LED Array");
            put(UUID.fromString("000007c6-0000-1000-8000-00805f9b34fb"), "Multi­Color LED Array");
            put(UUID.fromString("00000800-0000-1000-8000-00805f9b34fb"), "Generic Window Covering");
            put(UUID.fromString("00000801-0000-1000-8000-00805f9b34fb"), "Window Shades");
            put(UUID.fromString("00000802-0000-1000-8000-00805f9b34fb"), "Window Blinds");
            put(UUID.fromString("00000803-0000-1000-8000-00805f9b34fb"), "Window Awning");
            put(UUID.fromString("00000804-0000-1000-8000-00805f9b34fb"), "Window Curtain");
            put(UUID.fromString("00000805-0000-1000-8000-00805f9b34fb"), "Exterior Shutter");
            put(UUID.fromString("00000806-0000-1000-8000-00805f9b34fb"), "Exterior Screen");
            put(UUID.fromString("00000840-0000-1000-8000-00805f9b34fb"), "Generic Audio Sink");
            put(UUID.fromString("00000841-0000-1000-8000-00805f9b34fb"), "Standalone Speaker");
            put(UUID.fromString("00000842-0000-1000-8000-00805f9b34fb"), "Soundbar");
            put(UUID.fromString("00000843-0000-1000-8000-00805f9b34fb"), "Bookshelf Speaker");
            put(UUID.fromString("00000844-0000-1000-8000-00805f9b34fb"), "Standmounted Speaker");
            put(UUID.fromString("00000845-0000-1000-8000-00805f9b34fb"), "Speakerphone");
            put(UUID.fromString("00000880-0000-1000-8000-00805f9b34fb"), "Generic Audio Source");
            put(UUID.fromString("00000881-0000-1000-8000-00805f9b34fb"), "Microphone");
            put(UUID.fromString("00000882-0000-1000-8000-00805f9b34fb"), "Alarm");
            put(UUID.fromString("00000883-0000-1000-8000-00805f9b34fb"), "Bell");
            put(UUID.fromString("00000884-0000-1000-8000-00805f9b34fb"), "Horn");
            put(UUID.fromString("00000885-0000-1000-8000-00805f9b34fb"), "Broadcasting Device");
            put(UUID.fromString("00000886-0000-1000-8000-00805f9b34fb"), "Service Desk");
            put(UUID.fromString("00000887-0000-1000-8000-00805f9b34fb"), "Kiosk");
            put(UUID.fromString("00000888-0000-1000-8000-00805f9b34fb"), "Broadcasting Room");
            put(UUID.fromString("00000889-0000-1000-8000-00805f9b34fb"), "Auditorium");
            put(UUID.fromString("000008c0-0000-1000-8000-00805f9b34fb"), "Generic Motorized Vehicle");
            put(UUID.fromString("000008c1-0000-1000-8000-00805f9b34fb"), "Car");
            put(UUID.fromString("000008c2-0000-1000-8000-00805f9b34fb"), "Large Goods Vehicle");
            put(UUID.fromString("000008c3-0000-1000-8000-00805f9b34fb"), "2­Wheeled Vehicle");
            put(UUID.fromString("000008c4-0000-1000-8000-00805f9b34fb"), "Motorbike");
            put(UUID.fromString("000008c5-0000-1000-8000-00805f9b34fb"), "Scooter");
            put(UUID.fromString("000008c6-0000-1000-8000-00805f9b34fb"), "Moped");
            put(UUID.fromString("000008c7-0000-1000-8000-00805f9b34fb"), "3­Wheeled Vehicle");
            put(UUID.fromString("000008c8-0000-1000-8000-00805f9b34fb"), "Light Vehicle");
            put(UUID.fromString("000008c9-0000-1000-8000-00805f9b34fb"), "Quad Bike");
            put(UUID.fromString("000008ca-0000-1000-8000-00805f9b34fb"), "Minibus");
            put(UUID.fromString("000008cb-0000-1000-8000-00805f9b34fb"), "Bus");
            put(UUID.fromString("000008cc-0000-1000-8000-00805f9b34fb"), "Trolley");
            put(UUID.fromString("000008cd-0000-1000-8000-00805f9b34fb"), "Agricultural Vehicle");
            put(UUID.fromString("000008ce-0000-1000-8000-00805f9b34fb"), "Camper / Caravan");
            put(UUID.fromString("000008cf-0000-1000-8000-00805f9b34fb"), "Recreational Vehicle / Motor Home");
            put(UUID.fromString("00000900-0000-1000-8000-00805f9b34fb"), "Generic Domestic Appliance");
            put(UUID.fromString("00000901-0000-1000-8000-00805f9b34fb"), "Refrigerator");
            put(UUID.fromString("00000902-0000-1000-8000-00805f9b34fb"), "Freezer");
            put(UUID.fromString("00000903-0000-1000-8000-00805f9b34fb"), "Oven");
            put(UUID.fromString("00000904-0000-1000-8000-00805f9b34fb"), "Microwave");
            put(UUID.fromString("00000905-0000-1000-8000-00805f9b34fb"), "Toaster");
            put(UUID.fromString("00000906-0000-1000-8000-00805f9b34fb"), "Washing Machine");
            put(UUID.fromString("00000907-0000-1000-8000-00805f9b34fb"), "Dryer");
            put(UUID.fromString("00000908-0000-1000-8000-00805f9b34fb"), "Coffee maker");
            put(UUID.fromString("00000909-0000-1000-8000-00805f9b34fb"), "Clothes iron");
            put(UUID.fromString("0000090a-0000-1000-8000-00805f9b34fb"), "Curling iron");
            put(UUID.fromString("0000090b-0000-1000-8000-00805f9b34fb"), "Hair dryer");
            put(UUID.fromString("0000090c-0000-1000-8000-00805f9b34fb"), "Vacuum cleaner");
            put(UUID.fromString("0000090d-0000-1000-8000-00805f9b34fb"), "Robotic vacuum cleaner");
            put(UUID.fromString("0000090e-0000-1000-8000-00805f9b34fb"), "Rice cooker");
            put(UUID.fromString("0000090f-0000-1000-8000-00805f9b34fb"), "Clothes steamer");
            put(UUID.fromString("00000940-0000-1000-8000-00805f9b34fb"), "Generic Wearable Audio Device");
            put(UUID.fromString("00000941-0000-1000-8000-00805f9b34fb"), "Earbud");
            put(UUID.fromString("00000942-0000-1000-8000-00805f9b34fb"), "Headset");
            put(UUID.fromString("00000943-0000-1000-8000-00805f9b34fb"), "Headphones");
            put(UUID.fromString("00000944-0000-1000-8000-00805f9b34fb"), "Neck Band");
            put(UUID.fromString("00000980-0000-1000-8000-00805f9b34fb"), "Generic Aircraft");
            put(UUID.fromString("00000981-0000-1000-8000-00805f9b34fb"), "Light Aircraft");
            put(UUID.fromString("00000982-0000-1000-8000-00805f9b34fb"), "Microlight");
            put(UUID.fromString("00000983-0000-1000-8000-00805f9b34fb"), "Paraglider");
            put(UUID.fromString("00000984-0000-1000-8000-00805f9b34fb"), "Large Passenger Aircraft");
            put(UUID.fromString("000009c0-0000-1000-8000-00805f9b34fb"), "Generic AV Equipment");
            put(UUID.fromString("000009c1-0000-1000-8000-00805f9b34fb"), "Amplifier");
            put(UUID.fromString("000009c2-0000-1000-8000-00805f9b34fb"), "Receiver");
            put(UUID.fromString("000009c3-0000-1000-8000-00805f9b34fb"), "Radio");
            put(UUID.fromString("000009c4-0000-1000-8000-00805f9b34fb"), "Tuner");
            put(UUID.fromString("000009c5-0000-1000-8000-00805f9b34fb"), "Turntable");
            put(UUID.fromString("000009c6-0000-1000-8000-00805f9b34fb"), "CD Player");
            put(UUID.fromString("000009c7-0000-1000-8000-00805f9b34fb"), "DVD Player");
            put(UUID.fromString("000009c8-0000-1000-8000-00805f9b34fb"), "Bluray Player");
            put(UUID.fromString("000009c9-0000-1000-8000-00805f9b34fb"), "Optical Disc Player");
            put(UUID.fromString("000009ca-0000-1000-8000-00805f9b34fb"), "Set­Top Box");
            put(UUID.fromString("00000a00-0000-1000-8000-00805f9b34fb"), "Generic Display Equipment");
            put(UUID.fromString("00000a01-0000-1000-8000-00805f9b34fb"), "Television");
            put(UUID.fromString("00000a02-0000-1000-8000-00805f9b34fb"), "Monitor");
            put(UUID.fromString("00000a03-0000-1000-8000-00805f9b34fb"), "Projector");
            put(UUID.fromString("00000a40-0000-1000-8000-00805f9b34fb"), "Generic Hearing aid");
            put(UUID.fromString("00000a41-0000-1000-8000-00805f9b34fb"), "In­ear hearing aid");
            put(UUID.fromString("00000a42-0000-1000-8000-00805f9b34fb"), "Behind­ear hearing aid");
            put(UUID.fromString("00000a43-0000-1000-8000-00805f9b34fb"), "Cochlear Implant");
            put(UUID.fromString("00000a80-0000-1000-8000-00805f9b34fb"), "Generic Gaming");
            put(UUID.fromString("00000a81-0000-1000-8000-00805f9b34fb"), "Home Video Game Console");
            put(UUID.fromString("00000a82-0000-1000-8000-00805f9b34fb"), "Portable handheld console");
            put(UUID.fromString("00000ac0-0000-1000-8000-00805f9b34fb"), "Generic Signage");
            put(UUID.fromString("00000ac1-0000-1000-8000-00805f9b34fb"), "Digital Signage");
            put(UUID.fromString("00000ac2-0000-1000-8000-00805f9b34fb"), "Electronic Label");
            put(UUID.fromString("00000c40-0000-1000-8000-00805f9b34fb"), "Generic Pulse Oximeter");
            put(UUID.fromString("00000c41-0000-1000-8000-00805f9b34fb"), "Fingertip Pulse Oximeter");
            put(UUID.fromString("00000c42-0000-1000-8000-00805f9b34fb"), "Wrist Worn Pulse Oximeter");
            put(UUID.fromString("00000c80-0000-1000-8000-00805f9b34fb"), "Generic Weight Scale");
            put(UUID.fromString("00000cc0-0000-1000-8000-00805f9b34fb"), "Generic Personal Mobility Device");
            put(UUID.fromString("00000cc1-0000-1000-8000-00805f9b34fb"), "Powered Wheelchair");
            put(UUID.fromString("00000cc2-0000-1000-8000-00805f9b34fb"), "Mobility Scooter");
            put(UUID.fromString("00000d00-0000-1000-8000-00805f9b34fb"), "Generic Continuous Glucose Monitor");
            put(UUID.fromString("00000d40-0000-1000-8000-00805f9b34fb"), "Generic Insulin Pump");
            put(UUID.fromString("00000d41-0000-1000-8000-00805f9b34fb"), "Insulin Pump, durable pump");
            put(UUID.fromString("00000d44-0000-1000-8000-00805f9b34fb"), "Insulin Pump, patch pump");
            put(UUID.fromString("00000d48-0000-1000-8000-00805f9b34fb"), "Insulin Pen");
            put(UUID.fromString("00000d80-0000-1000-8000-00805f9b34fb"), "Generic Medication Delivery");
            put(UUID.fromString("00001440-0000-1000-8000-00805f9b34fb"), "Generic Outdoor Sports Activity");
            put(UUID.fromString("00001441-0000-1000-8000-00805f9b34fb"), "Location Display");
            put(UUID.fromString("00001442-0000-1000-8000-00805f9b34fb"), "Location and Navigation Display");
            put(UUID.fromString("00001443-0000-1000-8000-00805f9b34fb"), "Location Pod");
            put(UUID.fromString("00001444-0000-1000-8000-00805f9b34fb"), "Location and Navigation Pod");
        }
    }

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> APPEARANCE_CATEGORY_MAPPING_128 = Collections.synchronizedMap(Collections.unmodifiableMap(new CategoryMap128()));

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> APPEARANCE_SUB_CATEGORY_MAPPING_128 = Collections.synchronizedMap(Collections.unmodifiableMap(new SubCategoryMap128()));

}