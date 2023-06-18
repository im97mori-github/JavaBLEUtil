package org.im97mori.ble.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * BLE GATT Characteristic UUID
 * <p>
 * https://bitbucket.org/bluetooth-SIG/public/src/main/
 * commit 6557f28af8b95de6b09d6e0d96cf51651fba32ff
 */
public class CharacteristicUUID {

    private static final class Map128 extends HashMap<UUID, String> {

        private Map128() {
            super();
            //@formatter:off
            put(UUID.fromString("00002a00-0000-1000-8000-00805f9b34fb"), "Device Name");
            put(UUID.fromString("00002a01-0000-1000-8000-00805f9b34fb"), "Appearance");
            put(UUID.fromString("00002a02-0000-1000-8000-00805f9b34fb"), "Peripheral Privacy Flag");
            put(UUID.fromString("00002a03-0000-1000-8000-00805f9b34fb"), "Reconnection Address");
            put(UUID.fromString("00002a04-0000-1000-8000-00805f9b34fb"), "Peripheral Preferred Connection Parameters");
            put(UUID.fromString("00002a05-0000-1000-8000-00805f9b34fb"), "Service Changed");
            put(UUID.fromString("00002a06-0000-1000-8000-00805f9b34fb"), "Alert Level");
            put(UUID.fromString("00002a07-0000-1000-8000-00805f9b34fb"), "Tx Power Level");
            put(UUID.fromString("00002a08-0000-1000-8000-00805f9b34fb"), "Date Time");
            put(UUID.fromString("00002a09-0000-1000-8000-00805f9b34fb"), "Day of Week");
            put(UUID.fromString("00002a0a-0000-1000-8000-00805f9b34fb"), "Day Date Time");
            put(UUID.fromString("00002a0c-0000-1000-8000-00805f9b34fb"), "Exact Time 256");
            put(UUID.fromString("00002a0d-0000-1000-8000-00805f9b34fb"), "DST Offset");
            put(UUID.fromString("00002a0e-0000-1000-8000-00805f9b34fb"), "Time Zone");
            put(UUID.fromString("00002a0f-0000-1000-8000-00805f9b34fb"), "Local Time Information");
            put(UUID.fromString("00002a11-0000-1000-8000-00805f9b34fb"), "Time with DST");
            put(UUID.fromString("00002a12-0000-1000-8000-00805f9b34fb"), "Time Accuracy");
            put(UUID.fromString("00002a13-0000-1000-8000-00805f9b34fb"), "Time Source");
            put(UUID.fromString("00002a14-0000-1000-8000-00805f9b34fb"), "Reference Time Information");
            put(UUID.fromString("00002a16-0000-1000-8000-00805f9b34fb"), "Time Update Control Point");
            put(UUID.fromString("00002a17-0000-1000-8000-00805f9b34fb"), "Time Update State");
            put(UUID.fromString("00002a18-0000-1000-8000-00805f9b34fb"), "Glucose Measurement");
            put(UUID.fromString("00002a19-0000-1000-8000-00805f9b34fb"), "Battery Level");
            put(UUID.fromString("00002a1c-0000-1000-8000-00805f9b34fb"), "Temperature Measurement");
            put(UUID.fromString("00002a1d-0000-1000-8000-00805f9b34fb"), "Temperature Type");
            put(UUID.fromString("00002a1e-0000-1000-8000-00805f9b34fb"), "Intermediate Temperature");
            put(UUID.fromString("00002a21-0000-1000-8000-00805f9b34fb"), "Measurement Interval");
            put(UUID.fromString("00002a22-0000-1000-8000-00805f9b34fb"), "Boot Keyboard Input Report");
            put(UUID.fromString("00002a23-0000-1000-8000-00805f9b34fb"), "System ID");
            put(UUID.fromString("00002a24-0000-1000-8000-00805f9b34fb"), "Model Number String");
            put(UUID.fromString("00002a25-0000-1000-8000-00805f9b34fb"), "Serial Number String");
            put(UUID.fromString("00002a26-0000-1000-8000-00805f9b34fb"), "Firmware Revision String");
            put(UUID.fromString("00002a27-0000-1000-8000-00805f9b34fb"), "Hardware Revision String");
            put(UUID.fromString("00002a28-0000-1000-8000-00805f9b34fb"), "Software Revision String");
            put(UUID.fromString("00002a29-0000-1000-8000-00805f9b34fb"), "Manufacturer Name String");
            put(UUID.fromString("00002a2a-0000-1000-8000-00805f9b34fb"), "IEEE 11073-20601 Regulatory Certification Data List");
            put(UUID.fromString("00002a2b-0000-1000-8000-00805f9b34fb"), "Current Time");
            put(UUID.fromString("00002a2c-0000-1000-8000-00805f9b34fb"), "Magnetic Declination");
            put(UUID.fromString("00002a31-0000-1000-8000-00805f9b34fb"), "Scan Refresh");
            put(UUID.fromString("00002a32-0000-1000-8000-00805f9b34fb"), "Boot Keyboard Output Report");
            put(UUID.fromString("00002a33-0000-1000-8000-00805f9b34fb"), "Boot Mouse Input Report");
            put(UUID.fromString("00002a34-0000-1000-8000-00805f9b34fb"), "Glucose Measurement Context");
            put(UUID.fromString("00002a35-0000-1000-8000-00805f9b34fb"), "Blood Pressure Measurement");
            put(UUID.fromString("00002a36-0000-1000-8000-00805f9b34fb"), "Intermediate Cuff Pressure");
            put(UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb"), "Heart Rate Measurement");
            put(UUID.fromString("00002a38-0000-1000-8000-00805f9b34fb"), "Body Sensor Location");
            put(UUID.fromString("00002a39-0000-1000-8000-00805f9b34fb"), "Heart Rate Control Point");
            put(UUID.fromString("00002a3f-0000-1000-8000-00805f9b34fb"), "Alert Status");
            put(UUID.fromString("00002a40-0000-1000-8000-00805f9b34fb"), "Ringer Control Point");
            put(UUID.fromString("00002a41-0000-1000-8000-00805f9b34fb"), "Ringer Setting");
            put(UUID.fromString("00002a42-0000-1000-8000-00805f9b34fb"), "Alert Category ID Bit Mask");
            put(UUID.fromString("00002a43-0000-1000-8000-00805f9b34fb"), "Alert Category ID");
            put(UUID.fromString("00002a44-0000-1000-8000-00805f9b34fb"), "Alert Notification Control Point");
            put(UUID.fromString("00002a45-0000-1000-8000-00805f9b34fb"), "Unread Alert Status");
            put(UUID.fromString("00002a46-0000-1000-8000-00805f9b34fb"), "New Alert");
            put(UUID.fromString("00002a47-0000-1000-8000-00805f9b34fb"), "Supported New Alert Category");
            put(UUID.fromString("00002a48-0000-1000-8000-00805f9b34fb"), "Supported Unread Alert Category");
            put(UUID.fromString("00002a49-0000-1000-8000-00805f9b34fb"), "Blood Pressure Feature");
            put(UUID.fromString("00002a4a-0000-1000-8000-00805f9b34fb"), "HID Information");
            put(UUID.fromString("00002a4b-0000-1000-8000-00805f9b34fb"), "Report Map");
            put(UUID.fromString("00002a4c-0000-1000-8000-00805f9b34fb"), "HID Control Point");
            put(UUID.fromString("00002a4d-0000-1000-8000-00805f9b34fb"), "Report");
            put(UUID.fromString("00002a4e-0000-1000-8000-00805f9b34fb"), "Protocol Mode");
            put(UUID.fromString("00002a4f-0000-1000-8000-00805f9b34fb"), "Scan Interval Window");
            put(UUID.fromString("00002a50-0000-1000-8000-00805f9b34fb"), "PnP ID");
            put(UUID.fromString("00002a51-0000-1000-8000-00805f9b34fb"), "Glucose Feature");
            put(UUID.fromString("00002a52-0000-1000-8000-00805f9b34fb"), "Record Access Control Point");
            put(UUID.fromString("00002a53-0000-1000-8000-00805f9b34fb"), "RSC Measurement");
            put(UUID.fromString("00002a54-0000-1000-8000-00805f9b34fb"), "RSC Feature");
            put(UUID.fromString("00002a55-0000-1000-8000-00805f9b34fb"), "SC Control Point");
            put(UUID.fromString("00002a5a-0000-1000-8000-00805f9b34fb"), "Aggregate");
            put(UUID.fromString("00002a5b-0000-1000-8000-00805f9b34fb"), "CSC Measurement");
            put(UUID.fromString("00002a5c-0000-1000-8000-00805f9b34fb"), "CSC Feature");
            put(UUID.fromString("00002a5d-0000-1000-8000-00805f9b34fb"), "Sensor Location");
            put(UUID.fromString("00002a5e-0000-1000-8000-00805f9b34fb"), "PLX Spot-Check Measurement");
            put(UUID.fromString("00002a5f-0000-1000-8000-00805f9b34fb"), "PLX Continuous Measurement");
            put(UUID.fromString("00002a60-0000-1000-8000-00805f9b34fb"), "PLX Features");
            put(UUID.fromString("00002a63-0000-1000-8000-00805f9b34fb"), "Cycling Power Measurement");
            put(UUID.fromString("00002a64-0000-1000-8000-00805f9b34fb"), "Cycling Power Vector");
            put(UUID.fromString("00002a65-0000-1000-8000-00805f9b34fb"), "Cycling Power Feature");
            put(UUID.fromString("00002a66-0000-1000-8000-00805f9b34fb"), "Cycling Power Control Point");
            put(UUID.fromString("00002a67-0000-1000-8000-00805f9b34fb"), "Location and Speed");
            put(UUID.fromString("00002a68-0000-1000-8000-00805f9b34fb"), "Navigation");
            put(UUID.fromString("00002a69-0000-1000-8000-00805f9b34fb"), "Position Quality");
            put(UUID.fromString("00002a6a-0000-1000-8000-00805f9b34fb"), "LN Feature");
            put(UUID.fromString("00002a6b-0000-1000-8000-00805f9b34fb"), "LN Control Point");
            put(UUID.fromString("00002a6c-0000-1000-8000-00805f9b34fb"), "Elevation");
            put(UUID.fromString("00002a6d-0000-1000-8000-00805f9b34fb"), "Pressure");
            put(UUID.fromString("00002a6e-0000-1000-8000-00805f9b34fb"), "Temperature");
            put(UUID.fromString("00002a6f-0000-1000-8000-00805f9b34fb"), "Humidity");
            put(UUID.fromString("00002a70-0000-1000-8000-00805f9b34fb"), "True Wind Speed");
            put(UUID.fromString("00002a71-0000-1000-8000-00805f9b34fb"), "True Wind Direction");
            put(UUID.fromString("00002a72-0000-1000-8000-00805f9b34fb"), "Apparent Wind Speed");
            put(UUID.fromString("00002a73-0000-1000-8000-00805f9b34fb"), "Apparent Wind Direction");
            put(UUID.fromString("00002a74-0000-1000-8000-00805f9b34fb"), "Gust Factor");
            put(UUID.fromString("00002a75-0000-1000-8000-00805f9b34fb"), "Pollen Concentration");
            put(UUID.fromString("00002a76-0000-1000-8000-00805f9b34fb"), "UV Index");
            put(UUID.fromString("00002a77-0000-1000-8000-00805f9b34fb"), "Irradiance");
            put(UUID.fromString("00002a78-0000-1000-8000-00805f9b34fb"), "Rainfall");
            put(UUID.fromString("00002a79-0000-1000-8000-00805f9b34fb"), "Wind Chill");
            put(UUID.fromString("00002a7a-0000-1000-8000-00805f9b34fb"), "Heat Index");
            put(UUID.fromString("00002a7b-0000-1000-8000-00805f9b34fb"), "Dew Point");
            put(UUID.fromString("00002a7d-0000-1000-8000-00805f9b34fb"), "Descriptor Value Changed");
            put(UUID.fromString("00002a7e-0000-1000-8000-00805f9b34fb"), "Aerobic Heart Rate Lower Limit");
            put(UUID.fromString("00002a7f-0000-1000-8000-00805f9b34fb"), "Aerobic Threshold");
            put(UUID.fromString("00002a80-0000-1000-8000-00805f9b34fb"), "Age");
            put(UUID.fromString("00002a81-0000-1000-8000-00805f9b34fb"), "Anaerobic Heart Rate Lower Limit");
            put(UUID.fromString("00002a82-0000-1000-8000-00805f9b34fb"), "Anaerobic Heart Rate Upper Limit");
            put(UUID.fromString("00002a83-0000-1000-8000-00805f9b34fb"), "Anaerobic Threshold");
            put(UUID.fromString("00002a84-0000-1000-8000-00805f9b34fb"), "Aerobic Heart Rate Upper Limit");
            put(UUID.fromString("00002a85-0000-1000-8000-00805f9b34fb"), "Date of Birth");
            put(UUID.fromString("00002a86-0000-1000-8000-00805f9b34fb"), "Date of Threshold Assessment");
            put(UUID.fromString("00002a87-0000-1000-8000-00805f9b34fb"), "Email Address");
            put(UUID.fromString("00002a88-0000-1000-8000-00805f9b34fb"), "Fat Burn Heart Rate Lower Limit");
            put(UUID.fromString("00002a89-0000-1000-8000-00805f9b34fb"), "Fat Burn Heart Rate Upper Limit");
            put(UUID.fromString("00002a8a-0000-1000-8000-00805f9b34fb"), "First Name");
            put(UUID.fromString("00002a8b-0000-1000-8000-00805f9b34fb"), "Five Zone Heart Rate Limits");
            put(UUID.fromString("00002a8c-0000-1000-8000-00805f9b34fb"), "Gender");
            put(UUID.fromString("00002a8d-0000-1000-8000-00805f9b34fb"), "Heart Rate Max");
            put(UUID.fromString("00002a8e-0000-1000-8000-00805f9b34fb"), "Height");
            put(UUID.fromString("00002a8f-0000-1000-8000-00805f9b34fb"), "Hip Circumference");
            put(UUID.fromString("00002a90-0000-1000-8000-00805f9b34fb"), "Last Name");
            put(UUID.fromString("00002a91-0000-1000-8000-00805f9b34fb"), "Maximum Recommended Heart Rate");
            put(UUID.fromString("00002a92-0000-1000-8000-00805f9b34fb"), "Resting Heart Rate");
            put(UUID.fromString("00002a93-0000-1000-8000-00805f9b34fb"), "Sport Type for Aerobic and Anaerobic Thresholds");
            put(UUID.fromString("00002a94-0000-1000-8000-00805f9b34fb"), "Three Zone Heart Rate Limits");
            put(UUID.fromString("00002a95-0000-1000-8000-00805f9b34fb"), "Two Zone Heart Rate Limits");
            put(UUID.fromString("00002a96-0000-1000-8000-00805f9b34fb"), "VO2 Max");
            put(UUID.fromString("00002a97-0000-1000-8000-00805f9b34fb"), "Waist Circumference");
            put(UUID.fromString("00002a98-0000-1000-8000-00805f9b34fb"), "Weight");
            put(UUID.fromString("00002a99-0000-1000-8000-00805f9b34fb"), "Database Change Increment");
            put(UUID.fromString("00002a9a-0000-1000-8000-00805f9b34fb"), "User Index");
            put(UUID.fromString("00002a9b-0000-1000-8000-00805f9b34fb"), "Body Composition Feature");
            put(UUID.fromString("00002a9c-0000-1000-8000-00805f9b34fb"), "Body Composition Measurement");
            put(UUID.fromString("00002a9d-0000-1000-8000-00805f9b34fb"), "Weight Measurement");
            put(UUID.fromString("00002a9e-0000-1000-8000-00805f9b34fb"), "Weight Scale Feature");
            put(UUID.fromString("00002a9f-0000-1000-8000-00805f9b34fb"), "User Control Point");
            put(UUID.fromString("00002aa0-0000-1000-8000-00805f9b34fb"), "Magnetic Flux Density - 2D");
            put(UUID.fromString("00002aa1-0000-1000-8000-00805f9b34fb"), "Magnetic Flux Density - 3D");
            put(UUID.fromString("00002aa2-0000-1000-8000-00805f9b34fb"), "Language");
            put(UUID.fromString("00002aa3-0000-1000-8000-00805f9b34fb"), "Barometric Pressure Trend");
            put(UUID.fromString("00002aa4-0000-1000-8000-00805f9b34fb"), "Bond Management Control Point");
            put(UUID.fromString("00002aa5-0000-1000-8000-00805f9b34fb"), "Bond Management Feature");
            put(UUID.fromString("00002aa6-0000-1000-8000-00805f9b34fb"), "Central Address Resolution");
            put(UUID.fromString("00002aa7-0000-1000-8000-00805f9b34fb"), "CGM Measurement");
            put(UUID.fromString("00002aa8-0000-1000-8000-00805f9b34fb"), "CGM Feature");
            put(UUID.fromString("00002aa9-0000-1000-8000-00805f9b34fb"), "CGM Status");
            put(UUID.fromString("00002aaa-0000-1000-8000-00805f9b34fb"), "CGM Session Start Time");
            put(UUID.fromString("00002aab-0000-1000-8000-00805f9b34fb"), "CGM Session Run Time");
            put(UUID.fromString("00002aac-0000-1000-8000-00805f9b34fb"), "CGM Specific Ops Control Point");
            put(UUID.fromString("00002aad-0000-1000-8000-00805f9b34fb"), "Indoor Positioning Configuration");
            put(UUID.fromString("00002aae-0000-1000-8000-00805f9b34fb"), "Latitude");
            put(UUID.fromString("00002aaf-0000-1000-8000-00805f9b34fb"), "Longitude");
            put(UUID.fromString("00002ab0-0000-1000-8000-00805f9b34fb"), "Local North Coordinate");
            put(UUID.fromString("00002ab1-0000-1000-8000-00805f9b34fb"), "Local East Coordinate");
            put(UUID.fromString("00002ab2-0000-1000-8000-00805f9b34fb"), "Floor Number");
            put(UUID.fromString("00002ab3-0000-1000-8000-00805f9b34fb"), "Altitude");
            put(UUID.fromString("00002ab4-0000-1000-8000-00805f9b34fb"), "Uncertainty");
            put(UUID.fromString("00002ab5-0000-1000-8000-00805f9b34fb"), "Location Name");
            put(UUID.fromString("00002ab6-0000-1000-8000-00805f9b34fb"), "URI");
            put(UUID.fromString("00002ab7-0000-1000-8000-00805f9b34fb"), "HTTP Headers");
            put(UUID.fromString("00002ab8-0000-1000-8000-00805f9b34fb"), "HTTP Status Code");
            put(UUID.fromString("00002ab9-0000-1000-8000-00805f9b34fb"), "HTTP Entity Body");
            put(UUID.fromString("00002aba-0000-1000-8000-00805f9b34fb"), "HTTP Control Point");
            put(UUID.fromString("00002abb-0000-1000-8000-00805f9b34fb"), "HTTPS Security");
            put(UUID.fromString("00002abc-0000-1000-8000-00805f9b34fb"), "TDS Control Point");
            put(UUID.fromString("00002abd-0000-1000-8000-00805f9b34fb"), "OTS Feature");
            put(UUID.fromString("00002abe-0000-1000-8000-00805f9b34fb"), "Object Name");
            put(UUID.fromString("00002abf-0000-1000-8000-00805f9b34fb"), "Object Type");
            put(UUID.fromString("00002ac0-0000-1000-8000-00805f9b34fb"), "Object Size");
            put(UUID.fromString("00002ac1-0000-1000-8000-00805f9b34fb"), "Object First-Created");
            put(UUID.fromString("00002ac2-0000-1000-8000-00805f9b34fb"), "Object Last-Modified");
            put(UUID.fromString("00002ac3-0000-1000-8000-00805f9b34fb"), "Object ID");
            put(UUID.fromString("00002ac4-0000-1000-8000-00805f9b34fb"), "Object Properties");
            put(UUID.fromString("00002ac5-0000-1000-8000-00805f9b34fb"), "Object Action Control Point");
            put(UUID.fromString("00002ac6-0000-1000-8000-00805f9b34fb"), "Object List Control Point");
            put(UUID.fromString("00002ac7-0000-1000-8000-00805f9b34fb"), "Object List Filter");
            put(UUID.fromString("00002ac8-0000-1000-8000-00805f9b34fb"), "Object Changed");
            put(UUID.fromString("00002ac9-0000-1000-8000-00805f9b34fb"), "Resolvable Private Address Only");
            put(UUID.fromString("00002acc-0000-1000-8000-00805f9b34fb"), "Fitness Machine Feature");
            put(UUID.fromString("00002acd-0000-1000-8000-00805f9b34fb"), "Treadmill Data");
            put(UUID.fromString("00002ace-0000-1000-8000-00805f9b34fb"), "Cross Trainer Data");
            put(UUID.fromString("00002acf-0000-1000-8000-00805f9b34fb"), "Step Climber Data");
            put(UUID.fromString("00002ad0-0000-1000-8000-00805f9b34fb"), "Stair Climber Data");
            put(UUID.fromString("00002ad1-0000-1000-8000-00805f9b34fb"), "Rower Data");
            put(UUID.fromString("00002ad2-0000-1000-8000-00805f9b34fb"), "Indoor Bike Data");
            put(UUID.fromString("00002ad3-0000-1000-8000-00805f9b34fb"), "Training Status");
            put(UUID.fromString("00002ad4-0000-1000-8000-00805f9b34fb"), "Supported Speed Range");
            put(UUID.fromString("00002ad5-0000-1000-8000-00805f9b34fb"), "Supported Inclination Range");
            put(UUID.fromString("00002ad6-0000-1000-8000-00805f9b34fb"), "Supported Resistance Level Range");
            put(UUID.fromString("00002ad7-0000-1000-8000-00805f9b34fb"), "Supported Heart Rate Range");
            put(UUID.fromString("00002ad8-0000-1000-8000-00805f9b34fb"), "Supported Power Range");
            put(UUID.fromString("00002ad9-0000-1000-8000-00805f9b34fb"), "Fitness Machine Control Point");
            put(UUID.fromString("00002ada-0000-1000-8000-00805f9b34fb"), "Fitness Machine Status");
            put(UUID.fromString("00002adb-0000-1000-8000-00805f9b34fb"), "Mesh Provisioning Data In");
            put(UUID.fromString("00002adc-0000-1000-8000-00805f9b34fb"), "Mesh Provisioning Data Out");
            put(UUID.fromString("00002add-0000-1000-8000-00805f9b34fb"), "Mesh Proxy Data In");
            put(UUID.fromString("00002ade-0000-1000-8000-00805f9b34fb"), "Mesh Proxy Data Out");
            put(UUID.fromString("00002ae0-0000-1000-8000-00805f9b34fb"), "Average Current");
            put(UUID.fromString("00002ae1-0000-1000-8000-00805f9b34fb"), "Average Voltage");
            put(UUID.fromString("00002ae2-0000-1000-8000-00805f9b34fb"), "Boolean");
            put(UUID.fromString("00002ae3-0000-1000-8000-00805f9b34fb"), "Chromatic Distance from Planckian");
            put(UUID.fromString("00002ae4-0000-1000-8000-00805f9b34fb"), "Chromaticity Coordinates");
            put(UUID.fromString("00002ae5-0000-1000-8000-00805f9b34fb"), "Chromaticity in CCT and Duv Values");
            put(UUID.fromString("00002ae6-0000-1000-8000-00805f9b34fb"), "Chromaticity Tolerance");
            put(UUID.fromString("00002ae7-0000-1000-8000-00805f9b34fb"), "CIE 13.3-1995 Color Rendering Index");
            put(UUID.fromString("00002ae8-0000-1000-8000-00805f9b34fb"), "Coefficient");
            put(UUID.fromString("00002ae9-0000-1000-8000-00805f9b34fb"), "Correlated Color Temperature");
            put(UUID.fromString("00002aea-0000-1000-8000-00805f9b34fb"), "Count 16");
            put(UUID.fromString("00002aeb-0000-1000-8000-00805f9b34fb"), "Count 24");
            put(UUID.fromString("00002aec-0000-1000-8000-00805f9b34fb"), "Country Code");
            put(UUID.fromString("00002aed-0000-1000-8000-00805f9b34fb"), "Date UTC");
            put(UUID.fromString("00002aee-0000-1000-8000-00805f9b34fb"), "Electric Current");
            put(UUID.fromString("00002aef-0000-1000-8000-00805f9b34fb"), "Electric Current Range");
            put(UUID.fromString("00002af0-0000-1000-8000-00805f9b34fb"), "Electric Current Specification");
            put(UUID.fromString("00002af1-0000-1000-8000-00805f9b34fb"), "Electric Current Statistics");
            put(UUID.fromString("00002af2-0000-1000-8000-00805f9b34fb"), "Energy");
            put(UUID.fromString("00002af3-0000-1000-8000-00805f9b34fb"), "Energy in a Period of Day");
            put(UUID.fromString("00002af4-0000-1000-8000-00805f9b34fb"), "Event Statistics");
            put(UUID.fromString("00002af5-0000-1000-8000-00805f9b34fb"), "Fixed String 16");
            put(UUID.fromString("00002af6-0000-1000-8000-00805f9b34fb"), "Fixed String 24");
            put(UUID.fromString("00002af7-0000-1000-8000-00805f9b34fb"), "Fixed String 36");
            put(UUID.fromString("00002af8-0000-1000-8000-00805f9b34fb"), "Fixed String 8");
            put(UUID.fromString("00002af9-0000-1000-8000-00805f9b34fb"), "Generic Level");
            put(UUID.fromString("00002afa-0000-1000-8000-00805f9b34fb"), "Global Trade Item Number");
            put(UUID.fromString("00002afb-0000-1000-8000-00805f9b34fb"), "Illuminance");
            put(UUID.fromString("00002afc-0000-1000-8000-00805f9b34fb"), "Luminous Efficacy");
            put(UUID.fromString("00002afd-0000-1000-8000-00805f9b34fb"), "Luminous Energy");
            put(UUID.fromString("00002afe-0000-1000-8000-00805f9b34fb"), "Luminous Exposure");
            put(UUID.fromString("00002aff-0000-1000-8000-00805f9b34fb"), "Luminous Flux");
            put(UUID.fromString("00002b00-0000-1000-8000-00805f9b34fb"), "Luminous Flux Range");
            put(UUID.fromString("00002b01-0000-1000-8000-00805f9b34fb"), "Luminous Intensity");
            put(UUID.fromString("00002b02-0000-1000-8000-00805f9b34fb"), "Mass Flow");
            put(UUID.fromString("00002b03-0000-1000-8000-00805f9b34fb"), "Perceived Lightness");
            put(UUID.fromString("00002b04-0000-1000-8000-00805f9b34fb"), "Percentage 8");
            put(UUID.fromString("00002b05-0000-1000-8000-00805f9b34fb"), "Power");
            put(UUID.fromString("00002b06-0000-1000-8000-00805f9b34fb"), "Power Specification");
            put(UUID.fromString("00002b07-0000-1000-8000-00805f9b34fb"), "Relative Runtime in a Current Range");
            put(UUID.fromString("00002b08-0000-1000-8000-00805f9b34fb"), "Relative Runtime in a Generic Level Range");
            put(UUID.fromString("00002b09-0000-1000-8000-00805f9b34fb"), "Relative Value in a Voltage Range");
            put(UUID.fromString("00002b0a-0000-1000-8000-00805f9b34fb"), "Relative Value in an Illuminance Range");
            put(UUID.fromString("00002b0b-0000-1000-8000-00805f9b34fb"), "Relative Value in a Period of Day");
            put(UUID.fromString("00002b0c-0000-1000-8000-00805f9b34fb"), "Relative Value in a Temperature Range");
            put(UUID.fromString("00002b0d-0000-1000-8000-00805f9b34fb"), "Temperature 8");
            put(UUID.fromString("00002b0e-0000-1000-8000-00805f9b34fb"), "Temperature 8 in a Period of Day");
            put(UUID.fromString("00002b0f-0000-1000-8000-00805f9b34fb"), "Temperature 8 Statistics");
            put(UUID.fromString("00002b10-0000-1000-8000-00805f9b34fb"), "Temperature Range");
            put(UUID.fromString("00002b11-0000-1000-8000-00805f9b34fb"), "Temperature Statistics");
            put(UUID.fromString("00002b12-0000-1000-8000-00805f9b34fb"), "Time Decihour 8");
            put(UUID.fromString("00002b13-0000-1000-8000-00805f9b34fb"), "Time Exponential 8");
            put(UUID.fromString("00002b14-0000-1000-8000-00805f9b34fb"), "Time Hour 24");
            put(UUID.fromString("00002b15-0000-1000-8000-00805f9b34fb"), "Time Millisecond 24");
            put(UUID.fromString("00002b16-0000-1000-8000-00805f9b34fb"), "Time Second 16");
            put(UUID.fromString("00002b17-0000-1000-8000-00805f9b34fb"), "Time Second 8");
            put(UUID.fromString("00002b18-0000-1000-8000-00805f9b34fb"), "Voltage");
            put(UUID.fromString("00002b19-0000-1000-8000-00805f9b34fb"), "Voltage Specification");
            put(UUID.fromString("00002b1a-0000-1000-8000-00805f9b34fb"), "Voltage Statistics");
            put(UUID.fromString("00002b1b-0000-1000-8000-00805f9b34fb"), "Volume Flow");
            put(UUID.fromString("00002b1c-0000-1000-8000-00805f9b34fb"), "Chromaticity Coordinate");
            put(UUID.fromString("00002b1d-0000-1000-8000-00805f9b34fb"), "RC Feature");
            put(UUID.fromString("00002b1e-0000-1000-8000-00805f9b34fb"), "RC Settings");
            put(UUID.fromString("00002b1f-0000-1000-8000-00805f9b34fb"), "Reconnection Configuration Control Point");
            put(UUID.fromString("00002b20-0000-1000-8000-00805f9b34fb"), "IDD Status Changed");
            put(UUID.fromString("00002b21-0000-1000-8000-00805f9b34fb"), "IDD Status");
            put(UUID.fromString("00002b22-0000-1000-8000-00805f9b34fb"), "IDD Annunciation Status");
            put(UUID.fromString("00002b23-0000-1000-8000-00805f9b34fb"), "IDD Features");
            put(UUID.fromString("00002b24-0000-1000-8000-00805f9b34fb"), "IDD Status Reader Control Point");
            put(UUID.fromString("00002b25-0000-1000-8000-00805f9b34fb"), "IDD Command Control Point");
            put(UUID.fromString("00002b26-0000-1000-8000-00805f9b34fb"), "IDD Command Data");
            put(UUID.fromString("00002b27-0000-1000-8000-00805f9b34fb"), "IDD Record Access Control Point");
            put(UUID.fromString("00002b28-0000-1000-8000-00805f9b34fb"), "IDD History Data");
            put(UUID.fromString("00002b29-0000-1000-8000-00805f9b34fb"), "Client Supported Features");
            put(UUID.fromString("00002b2a-0000-1000-8000-00805f9b34fb"), "Database Hash");
            put(UUID.fromString("00002b2b-0000-1000-8000-00805f9b34fb"), "BSS Control Point");
            put(UUID.fromString("00002b2c-0000-1000-8000-00805f9b34fb"), "BSS Response");
            put(UUID.fromString("00002b2d-0000-1000-8000-00805f9b34fb"), "Emergency ID");
            put(UUID.fromString("00002b2e-0000-1000-8000-00805f9b34fb"), "Emergency Text");
            put(UUID.fromString("00002b2f-0000-1000-8000-00805f9b34fb"), "ACS Status");
            put(UUID.fromString("00002b30-0000-1000-8000-00805f9b34fb"), "ACS Data In");
            put(UUID.fromString("00002b31-0000-1000-8000-00805f9b34fb"), "ACS Data Out Notify");
            put(UUID.fromString("00002b32-0000-1000-8000-00805f9b34fb"), "ACS Data Out Indicate");
            put(UUID.fromString("00002b33-0000-1000-8000-00805f9b34fb"), "ACS Control Point");
            put(UUID.fromString("00002b34-0000-1000-8000-00805f9b34fb"), "Enhanced Blood Pressure Measurement");
            put(UUID.fromString("00002b35-0000-1000-8000-00805f9b34fb"), "Enhanced Intermediate Cuff Pressure");
            put(UUID.fromString("00002b36-0000-1000-8000-00805f9b34fb"), "Blood Pressure Record");
            put(UUID.fromString("00002b37-0000-1000-8000-00805f9b34fb"), "Registered User");
            put(UUID.fromString("00002b38-0000-1000-8000-00805f9b34fb"), "BR-EDR Handover Data");
            put(UUID.fromString("00002b39-0000-1000-8000-00805f9b34fb"), "Bluetooth SIG Data");
            put(UUID.fromString("00002b3a-0000-1000-8000-00805f9b34fb"), "Server Supported Features");
            put(UUID.fromString("00002b3b-0000-1000-8000-00805f9b34fb"), "Physical Activity Monitor Features");
            put(UUID.fromString("00002b3c-0000-1000-8000-00805f9b34fb"), "General Activity Instantaneous Data");
            put(UUID.fromString("00002b3d-0000-1000-8000-00805f9b34fb"), "General Activity Summary Data");
            put(UUID.fromString("00002b3e-0000-1000-8000-00805f9b34fb"), "CardioRespiratory Activity Instantaneous Data");
            put(UUID.fromString("00002b3f-0000-1000-8000-00805f9b34fb"), "CardioRespiratory Activity Summary Data");
            put(UUID.fromString("00002b40-0000-1000-8000-00805f9b34fb"), "Step Counter Activity Summary Data");
            put(UUID.fromString("00002b41-0000-1000-8000-00805f9b34fb"), "Sleep Activity Instantaneous Data");
            put(UUID.fromString("00002b42-0000-1000-8000-00805f9b34fb"), "Sleep Activity Summary Data");
            put(UUID.fromString("00002b43-0000-1000-8000-00805f9b34fb"), "Physical Activity Monitor Control Point");
            put(UUID.fromString("00002b44-0000-1000-8000-00805f9b34fb"), "Activity Current Session");
            put(UUID.fromString("00002b45-0000-1000-8000-00805f9b34fb"), "Physical Activity Session Descriptor");
            put(UUID.fromString("00002b46-0000-1000-8000-00805f9b34fb"), "Preferred Units");
            put(UUID.fromString("00002b47-0000-1000-8000-00805f9b34fb"), "High Resolution Height");
            put(UUID.fromString("00002b48-0000-1000-8000-00805f9b34fb"), "Middle Name");
            put(UUID.fromString("00002b49-0000-1000-8000-00805f9b34fb"), "Stride Length");
            put(UUID.fromString("00002b4a-0000-1000-8000-00805f9b34fb"), "Handedness");
            put(UUID.fromString("00002b4b-0000-1000-8000-00805f9b34fb"), "Device Wearing Position");
            put(UUID.fromString("00002b4c-0000-1000-8000-00805f9b34fb"), "Four Zone Heart Rate Limits");
            put(UUID.fromString("00002b4d-0000-1000-8000-00805f9b34fb"), "High Intensity Exercise Threshold");
            put(UUID.fromString("00002b4e-0000-1000-8000-00805f9b34fb"), "Activity Goal");
            put(UUID.fromString("00002b4f-0000-1000-8000-00805f9b34fb"), "Sedentary Interval Notification");
            put(UUID.fromString("00002b50-0000-1000-8000-00805f9b34fb"), "Caloric Intake");
            put(UUID.fromString("00002b51-0000-1000-8000-00805f9b34fb"), "TMAP Role");
            put(UUID.fromString("00002b77-0000-1000-8000-00805f9b34fb"), "Audio Input State");
            put(UUID.fromString("00002b78-0000-1000-8000-00805f9b34fb"), "Gain Settings Attribute");
            put(UUID.fromString("00002b79-0000-1000-8000-00805f9b34fb"), "Audio Input Type");
            put(UUID.fromString("00002b7a-0000-1000-8000-00805f9b34fb"), "Audio Input Status");
            put(UUID.fromString("00002b7b-0000-1000-8000-00805f9b34fb"), "Audio Input Control Point");
            put(UUID.fromString("00002b7c-0000-1000-8000-00805f9b34fb"), "Audio Input Description");
            put(UUID.fromString("00002b7d-0000-1000-8000-00805f9b34fb"), "Volume State");
            put(UUID.fromString("00002b7e-0000-1000-8000-00805f9b34fb"), "Volume Control Point");
            put(UUID.fromString("00002b7f-0000-1000-8000-00805f9b34fb"), "Volume Flags");
            put(UUID.fromString("00002b80-0000-1000-8000-00805f9b34fb"), "Volume Offset State");
            put(UUID.fromString("00002b81-0000-1000-8000-00805f9b34fb"), "Audio Location");
            put(UUID.fromString("00002b82-0000-1000-8000-00805f9b34fb"), "Volume Offset Control Point");
            put(UUID.fromString("00002b83-0000-1000-8000-00805f9b34fb"), "Audio Output Description");
            put(UUID.fromString("00002b84-0000-1000-8000-00805f9b34fb"), "Set Identity Resolving Key");
            put(UUID.fromString("00002b85-0000-1000-8000-00805f9b34fb"), "Coordinated Set Size");
            put(UUID.fromString("00002b86-0000-1000-8000-00805f9b34fb"), "Set Member Lock");
            put(UUID.fromString("00002b87-0000-1000-8000-00805f9b34fb"), "Set Member Rank");
            put(UUID.fromString("00002b88-0000-1000-8000-00805f9b34fb"), "Encrypted Data Key Material");
            put(UUID.fromString("00002b89-0000-1000-8000-00805f9b34fb"), "Apparent Energy 32");
            put(UUID.fromString("00002b8a-0000-1000-8000-00805f9b34fb"), "Apparent Power");
            put(UUID.fromString("00002b8c-0000-1000-8000-00805f9b34fb"), "CO2 Concentration");
            put(UUID.fromString("00002b8d-0000-1000-8000-00805f9b34fb"), "Cosine of the Angle");
            put(UUID.fromString("00002b8e-0000-1000-8000-00805f9b34fb"), "Device Time Feature");
            put(UUID.fromString("00002b8f-0000-1000-8000-00805f9b34fb"), "Device Time Parameters");
            put(UUID.fromString("00002b90-0000-1000-8000-00805f9b34fb"), "Device Time");
            put(UUID.fromString("00002b91-0000-1000-8000-00805f9b34fb"), "Device Time Control Point");
            put(UUID.fromString("00002b92-0000-1000-8000-00805f9b34fb"), "Time Change Log Data");
            put(UUID.fromString("00002b93-0000-1000-8000-00805f9b34fb"), "Media Player Name");
            put(UUID.fromString("00002b94-0000-1000-8000-00805f9b34fb"), "Media Player Icon Object ID");
            put(UUID.fromString("00002b95-0000-1000-8000-00805f9b34fb"), "Media Player Icon URL");
            put(UUID.fromString("00002b96-0000-1000-8000-00805f9b34fb"), "Track Changed");
            put(UUID.fromString("00002b97-0000-1000-8000-00805f9b34fb"), "Track Title");
            put(UUID.fromString("00002b98-0000-1000-8000-00805f9b34fb"), "Track Duration");
            put(UUID.fromString("00002b99-0000-1000-8000-00805f9b34fb"), "Track Position");
            put(UUID.fromString("00002b9a-0000-1000-8000-00805f9b34fb"), "Playback Speed");
            put(UUID.fromString("00002b9b-0000-1000-8000-00805f9b34fb"), "Seeking Speed");
            put(UUID.fromString("00002b9c-0000-1000-8000-00805f9b34fb"), "Current Track Segments Object ID");
            put(UUID.fromString("00002b9d-0000-1000-8000-00805f9b34fb"), "Current Track Object ID");
            put(UUID.fromString("00002b9e-0000-1000-8000-00805f9b34fb"), "Next Track Object ID");
            put(UUID.fromString("00002b9f-0000-1000-8000-00805f9b34fb"), "Parent Group Object ID");
            put(UUID.fromString("00002ba0-0000-1000-8000-00805f9b34fb"), "Current Group Object ID");
            put(UUID.fromString("00002ba1-0000-1000-8000-00805f9b34fb"), "Playing Order");
            put(UUID.fromString("00002ba2-0000-1000-8000-00805f9b34fb"), "Playing Orders Supported");
            put(UUID.fromString("00002ba3-0000-1000-8000-00805f9b34fb"), "Media State");
            put(UUID.fromString("00002ba4-0000-1000-8000-00805f9b34fb"), "Media Control Point");
            put(UUID.fromString("00002ba5-0000-1000-8000-00805f9b34fb"), "Media Control Point Opcodes Supported");
            put(UUID.fromString("00002ba6-0000-1000-8000-00805f9b34fb"), "Search Results Object ID");
            put(UUID.fromString("00002ba7-0000-1000-8000-00805f9b34fb"), "Search Control Point");
            put(UUID.fromString("00002ba8-0000-1000-8000-00805f9b34fb"), "Energy 32");
            put(UUID.fromString("00002ba9-0000-1000-8000-00805f9b34fb"), "Media Player Icon Object Type");
            put(UUID.fromString("00002baa-0000-1000-8000-00805f9b34fb"), "Track Segments Object Type");
            put(UUID.fromString("00002bab-0000-1000-8000-00805f9b34fb"), "Track Object Type");
            put(UUID.fromString("00002bac-0000-1000-8000-00805f9b34fb"), "Group Object Type");
            put(UUID.fromString("00002bad-0000-1000-8000-00805f9b34fb"), "Constant Tone Extension Enable");
            put(UUID.fromString("00002bae-0000-1000-8000-00805f9b34fb"), "Advertising Constant Tone Extension Minimum Length");
            put(UUID.fromString("00002baf-0000-1000-8000-00805f9b34fb"), "Advertising Constant Tone Extension Minimum Transmit Count");
            put(UUID.fromString("00002bb0-0000-1000-8000-00805f9b34fb"), "Advertising Constant Tone Extension Transmit Duration");
            put(UUID.fromString("00002bb1-0000-1000-8000-00805f9b34fb"), "Advertising Constant Tone Extension Interval");
            put(UUID.fromString("00002bb2-0000-1000-8000-00805f9b34fb"), "Advertising Constant Tone Extension PHY");
            put(UUID.fromString("00002bb3-0000-1000-8000-00805f9b34fb"), "Bearer Provider Name");
            put(UUID.fromString("00002bb4-0000-1000-8000-00805f9b34fb"), "Bearer UCI");
            put(UUID.fromString("00002bb5-0000-1000-8000-00805f9b34fb"), "Bearer Technology");
            put(UUID.fromString("00002bb6-0000-1000-8000-00805f9b34fb"), "Bearer URI Schemes Supported List");
            put(UUID.fromString("00002bb7-0000-1000-8000-00805f9b34fb"), "Bearer Signal Strength");
            put(UUID.fromString("00002bb8-0000-1000-8000-00805f9b34fb"), "Bearer Signal Strength Reporting Interval");
            put(UUID.fromString("00002bb9-0000-1000-8000-00805f9b34fb"), "Bearer List Current Calls");
            put(UUID.fromString("00002bba-0000-1000-8000-00805f9b34fb"), "Content Control ID");
            put(UUID.fromString("00002bbb-0000-1000-8000-00805f9b34fb"), "Status Flags");
            put(UUID.fromString("00002bbc-0000-1000-8000-00805f9b34fb"), "Incoming Call Target Bearer URI");
            put(UUID.fromString("00002bbd-0000-1000-8000-00805f9b34fb"), "Call State");
            put(UUID.fromString("00002bbe-0000-1000-8000-00805f9b34fb"), "Call Control Point");
            put(UUID.fromString("00002bbf-0000-1000-8000-00805f9b34fb"), "Call Control Point Optional Opcodes");
            put(UUID.fromString("00002bc0-0000-1000-8000-00805f9b34fb"), "Termination Reason");
            put(UUID.fromString("00002bc1-0000-1000-8000-00805f9b34fb"), "Incoming Call");
            put(UUID.fromString("00002bc2-0000-1000-8000-00805f9b34fb"), "Call Friendly Name");
            put(UUID.fromString("00002bc3-0000-1000-8000-00805f9b34fb"), "Mute");
            put(UUID.fromString("00002bc4-0000-1000-8000-00805f9b34fb"), "Sink ASE");
            put(UUID.fromString("00002bc5-0000-1000-8000-00805f9b34fb"), "Source ASE");
            put(UUID.fromString("00002bc6-0000-1000-8000-00805f9b34fb"), "ASE Control Point");
            put(UUID.fromString("00002bc7-0000-1000-8000-00805f9b34fb"), "Broadcast Audio Scan Control Point");
            put(UUID.fromString("00002bc8-0000-1000-8000-00805f9b34fb"), "Broadcast Receive State");
            put(UUID.fromString("00002bc9-0000-1000-8000-00805f9b34fb"), "Sink PAC");
            put(UUID.fromString("00002bca-0000-1000-8000-00805f9b34fb"), "Sink Audio Locations");
            put(UUID.fromString("00002bcb-0000-1000-8000-00805f9b34fb"), "Source PAC");
            put(UUID.fromString("00002bcc-0000-1000-8000-00805f9b34fb"), "Source Audio Locations");
            put(UUID.fromString("00002bcd-0000-1000-8000-00805f9b34fb"), "Available Audio Contexts");
            put(UUID.fromString("00002bce-0000-1000-8000-00805f9b34fb"), "Supported Audio Contexts");
            put(UUID.fromString("00002bcf-0000-1000-8000-00805f9b34fb"), "Ammonia Concentration");
            put(UUID.fromString("00002bd0-0000-1000-8000-00805f9b34fb"), "Carbon Monoxide Concentration");
            put(UUID.fromString("00002bd1-0000-1000-8000-00805f9b34fb"), "Methane Concentration");
            put(UUID.fromString("00002bd2-0000-1000-8000-00805f9b34fb"), "Nitrogen Dioxide Concentration");
            put(UUID.fromString("00002bd3-0000-1000-8000-00805f9b34fb"), "Non-Methane Volatile Organic Compounds Concentration");
            put(UUID.fromString("00002bd4-0000-1000-8000-00805f9b34fb"), "Ozone Concentration");
            put(UUID.fromString("00002bd5-0000-1000-8000-00805f9b34fb"), "Particulate Matter - PM1 Concentration");
            put(UUID.fromString("00002bd6-0000-1000-8000-00805f9b34fb"), "Particulate Matter - PM2.5 Concentration");
            put(UUID.fromString("00002bd7-0000-1000-8000-00805f9b34fb"), "Particulate Matter - PM10 Concentration");
            put(UUID.fromString("00002bd8-0000-1000-8000-00805f9b34fb"), "Sulfur Dioxide Concentration");
            put(UUID.fromString("00002bd9-0000-1000-8000-00805f9b34fb"), "Sulfur Hexafluoride Concentration");
            put(UUID.fromString("00002bda-0000-1000-8000-00805f9b34fb"), "Hearing Aid Features");
            put(UUID.fromString("00002bdb-0000-1000-8000-00805f9b34fb"), "Hearing Aid Preset Control Point");
            put(UUID.fromString("00002bdc-0000-1000-8000-00805f9b34fb"), "Active Preset Index");
            put(UUID.fromString("00002bde-0000-1000-8000-00805f9b34fb"), "Fixed String 64");
            put(UUID.fromString("00002bdf-0000-1000-8000-00805f9b34fb"), "High Temperature");
            put(UUID.fromString("00002be0-0000-1000-8000-00805f9b34fb"), "High Voltage");
            put(UUID.fromString("00002be1-0000-1000-8000-00805f9b34fb"), "Light Distribution");
            put(UUID.fromString("00002be2-0000-1000-8000-00805f9b34fb"), "Light Output");
            put(UUID.fromString("00002be3-0000-1000-8000-00805f9b34fb"), "Light Source Type");
            put(UUID.fromString("00002be4-0000-1000-8000-00805f9b34fb"), "Noise");
            put(UUID.fromString("00002be5-0000-1000-8000-00805f9b34fb"), "Relative Runtime in a Correlated Color Temperature Range");
            put(UUID.fromString("00002be6-0000-1000-8000-00805f9b34fb"), "Time Second 32");
            put(UUID.fromString("00002be7-0000-1000-8000-00805f9b34fb"), "VOC Concentration");
            put(UUID.fromString("00002be8-0000-1000-8000-00805f9b34fb"), "Voltage Frequency");
            put(UUID.fromString("00002be9-0000-1000-8000-00805f9b34fb"), "Battery Critical Status");
            put(UUID.fromString("00002bea-0000-1000-8000-00805f9b34fb"), "Battery Health Status");
            put(UUID.fromString("00002beb-0000-1000-8000-00805f9b34fb"), "Battery Health Information");
            put(UUID.fromString("00002bec-0000-1000-8000-00805f9b34fb"), "Battery Information");
            put(UUID.fromString("00002bed-0000-1000-8000-00805f9b34fb"), "Battery Level Status");
            put(UUID.fromString("00002bee-0000-1000-8000-00805f9b34fb"), "Battery Time Status");
            put(UUID.fromString("00002bef-0000-1000-8000-00805f9b34fb"), "Estimated Service Date");
            put(UUID.fromString("00002bf0-0000-1000-8000-00805f9b34fb"), "Battery Energy Status");
            put(UUID.fromString("00002bf5-0000-1000-8000-00805f9b34fb"), "LE GATT Security Levels");
            put(UUID.fromString("00002bf6-0000-1000-8000-00805f9b34fb"), "ESL Address");
            put(UUID.fromString("00002bf7-0000-1000-8000-00805f9b34fb"), "AP Sync Key Material");
            put(UUID.fromString("00002bf8-0000-1000-8000-00805f9b34fb"), "ESL Response Key Material");
            put(UUID.fromString("00002bf9-0000-1000-8000-00805f9b34fb"), "ESL Current Absolute Time");
            put(UUID.fromString("00002bfa-0000-1000-8000-00805f9b34fb"), "ESL Display Information");
            put(UUID.fromString("00002bfb-0000-1000-8000-00805f9b34fb"), "ESL Image Information");
            put(UUID.fromString("00002bfc-0000-1000-8000-00805f9b34fb"), "ESL Sensor Information");
            put(UUID.fromString("00002bfd-0000-1000-8000-00805f9b34fb"), "ESL LED Information");
            put(UUID.fromString("00002bfe-0000-1000-8000-00805f9b34fb"), "ESL Control Point");
            put(UUID.fromString("00002a56-0000-1000-8000-00805f9b34fb"), "Digital");
            put(UUID.fromString("00002a58-0000-1000-8000-00805f9b34fb"), "Analog");
            put(UUID.fromString("00002aca-0000-1000-8000-00805f9b34fb"), "Unspecified");
            put(UUID.fromString("00002acb-0000-1000-8000-00805f9b34fb"), "Directory Listing");
            //@formatter:on
        }

    }

    /**
     * 16-bit UUID Numbers Document.pdf
     */
    public static final Map<UUID, String> CHARACTERISTIC_MAPPING_128 = Collections.synchronizedMap(Collections.unmodifiableMap(new Map128()));

    /**
     * Device Name (Characteristic UUID: 0x2a00)
     */
    public static final UUID DEVICE_NAME_CHARACTERISTIC = UUID.fromString("00002a00-0000-1000-8000-00805f9b34fb");

    /**
     * Appearance (Characteristic UUID: 0x2a01)
     */
    public static final UUID APPEARANCE_CHARACTERISTIC = UUID.fromString("00002a01-0000-1000-8000-00805f9b34fb");

    /**
     * Peripheral Privacy Flag (Characteristic UUID: 0x2a02)
     */
    public static final UUID PERIPHERAL_PRIVACY_FLAG_CHARACTERISTIC = UUID.fromString("00002a02-0000-1000-8000-00805f9b34fb");

    /**
     * Reconnection Address (Characteristic UUID: 0x2a03)
     */
    public static final UUID RECONNECTION_ADDRESS_CHARACTERISTIC = UUID.fromString("00002a03-0000-1000-8000-00805f9b34fb");

    /**
     * Peripheral Preferred Connection Parameters (Characteristic UUID: 0x2a04)
     */
    public static final UUID PERIPHERAL_PREFERRED_CONNECTION_PARAMETERS_CHARACTERISTIC = UUID.fromString("00002a04-0000-1000-8000-00805f9b34fb");

    /**
     * Service Changed (Characteristic UUID: 0x2a05)
     */
    public static final UUID SERVICE_CHANGED_CHARACTERISTIC = UUID.fromString("00002a05-0000-1000-8000-00805f9b34fb");

    /**
     * Alert Level (Characteristic UUID: 0x2a06)
     */
    public static final UUID ALERT_LEVEL_CHARACTERISTIC = UUID.fromString("00002a06-0000-1000-8000-00805f9b34fb");

    /**
     * Tx Power Level (Characteristic UUID: 0x2a07)
     */
    public static final UUID TX_POWER_LEVEL_CHARACTERISTIC = UUID.fromString("00002a07-0000-1000-8000-00805f9b34fb");

    /**
     * Date Time (Characteristic UUID: 0x2a08)
     */
    public static final UUID DATE_TIME_CHARACTERISTIC = UUID.fromString("00002a08-0000-1000-8000-00805f9b34fb");

    /**
     * Day of Week (Characteristic UUID: 0x2a09)
     */
    public static final UUID DAY_OF_WEEK_CHARACTERISTIC = UUID.fromString("00002a09-0000-1000-8000-00805f9b34fb");

    /**
     * Day Date Time (Characteristic UUID: 0x2a0a)
     */
    public static final UUID DAY_DATE_TIME_CHARACTERISTIC = UUID.fromString("00002a0a-0000-1000-8000-00805f9b34fb");

    /**
     * Exact Time 256 (Characteristic UUID: 0x2a0c)
     */
    public static final UUID EXACT_TIME_256_CHARACTERISTIC = UUID.fromString("00002a0c-0000-1000-8000-00805f9b34fb");

    /**
     * DST Offset (Characteristic UUID: 0x2a0d)
     */
    public static final UUID DST_OFFSET_CHARACTERISTIC = UUID.fromString("00002a0d-0000-1000-8000-00805f9b34fb");

    /**
     * Time Zone (Characteristic UUID: 0x2a0e)
     */
    public static final UUID TIME_ZONE_CHARACTERISTIC = UUID.fromString("00002a0e-0000-1000-8000-00805f9b34fb");

    /**
     * Local Time Information (Characteristic UUID: 0x2a0f)
     */
    public static final UUID LOCAL_TIME_INFORMATION_CHARACTERISTIC = UUID.fromString("00002a0f-0000-1000-8000-00805f9b34fb");

    /**
     * Time with DST (Characteristic UUID: 0x2a11)
     */
    public static final UUID TIME_WITH_DST_CHARACTERISTIC = UUID.fromString("00002a11-0000-1000-8000-00805f9b34fb");

    /**
     * Time Accuracy (Characteristic UUID: 0x2a12)
     */
    public static final UUID TIME_ACCURACY_CHARACTERISTIC = UUID.fromString("00002a12-0000-1000-8000-00805f9b34fb");

    /**
     * Time Source (Characteristic UUID: 0x2a13)
     */
    public static final UUID TIME_SOURCE_CHARACTERISTIC = UUID.fromString("00002a13-0000-1000-8000-00805f9b34fb");

    /**
     * Reference Time Information (Characteristic UUID: 0x2a14)
     */
    public static final UUID REFERENCE_TIME_INFORMATION_CHARACTERISTIC = UUID.fromString("00002a14-0000-1000-8000-00805f9b34fb");

    /**
     * Time Update Control Point (Characteristic UUID: 0x2a16)
     */
    public static final UUID TIME_UPDATE_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002a16-0000-1000-8000-00805f9b34fb");

    /**
     * Time Update State (Characteristic UUID: 0x2a17)
     */
    public static final UUID TIME_UPDATE_STATE_CHARACTERISTIC = UUID.fromString("00002a17-0000-1000-8000-00805f9b34fb");

    /**
     * Glucose Measurement (Characteristic UUID: 0x2a18)
     */
    public static final UUID GLUCOSE_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a18-0000-1000-8000-00805f9b34fb");

    /**
     * Battery Level (Characteristic UUID: 0x2a19)
     */
    public static final UUID BATTERY_LEVEL_CHARACTERISTIC = UUID.fromString("00002a19-0000-1000-8000-00805f9b34fb");

    /**
     * Temperature Measurement (Characteristic UUID: 0x2a1c)
     */
    public static final UUID TEMPERATURE_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a1c-0000-1000-8000-00805f9b34fb");

    /**
     * Temperature Type (Characteristic UUID: 0x2a1d)
     */
    public static final UUID TEMPERATURE_TYPE_CHARACTERISTIC = UUID.fromString("00002a1d-0000-1000-8000-00805f9b34fb");

    /**
     * Intermediate Temperature (Characteristic UUID: 0x2a1e)
     */
    public static final UUID INTERMEDIATE_TEMPERATURE_CHARACTERISTIC = UUID.fromString("00002a1e-0000-1000-8000-00805f9b34fb");

    /**
     * Measurement Interval (Characteristic UUID: 0x2a21)
     */
    public static final UUID MEASUREMENT_INTERVAL_CHARACTERISTIC = UUID.fromString("00002a21-0000-1000-8000-00805f9b34fb");

    /**
     * Boot Keyboard Input Report (Characteristic UUID: 0x2a22)
     */
    public static final UUID BOOT_KEYBOARD_INPUT_REPORT_CHARACTERISTIC = UUID.fromString("00002a22-0000-1000-8000-00805f9b34fb");

    /**
     * System ID (Characteristic UUID: 0x2a23)
     */
    public static final UUID SYSTEM_ID_CHARACTERISTIC = UUID.fromString("00002a23-0000-1000-8000-00805f9b34fb");

    /**
     * Model Number String (Characteristic UUID: 0x2a24)
     */
    public static final UUID MODEL_NUMBER_STRING_CHARACTERISTIC = UUID.fromString("00002a24-0000-1000-8000-00805f9b34fb");

    /**
     * Serial Number String (Characteristic UUID: 0x2a25)
     */
    public static final UUID SERIAL_NUMBER_STRING_CHARACTERISTIC = UUID.fromString("00002a25-0000-1000-8000-00805f9b34fb");

    /**
     * Firmware Revision String (Characteristic UUID: 0x2a26)
     */
    public static final UUID FIRMWARE_REVISION_STRING_CHARACTERISTIC = UUID.fromString("00002a26-0000-1000-8000-00805f9b34fb");

    /**
     * Hardware Revision String (Characteristic UUID: 0x2a27)
     */
    public static final UUID HARDWARE_REVISION_STRING_CHARACTERISTIC = UUID.fromString("00002a27-0000-1000-8000-00805f9b34fb");

    /**
     * Software Revision String (Characteristic UUID: 0x2a28)
     */
    public static final UUID SOFTWARE_REVISION_STRING_CHARACTERISTIC = UUID.fromString("00002a28-0000-1000-8000-00805f9b34fb");

    /**
     * Manufacturer Name String (Characteristic UUID: 0x2a29)
     */
    public static final UUID MANUFACTURER_NAME_STRING_CHARACTERISTIC = UUID.fromString("00002a29-0000-1000-8000-00805f9b34fb");

    /**
     * IEEE 11073-20601 Regulatory Certification Data List (Characteristic UUID: 0x2a2a)
     */
    public static final UUID IEEE_11073_20601_REGULATORY_CERTIFICATION_DATA_LIST_CHARACTERISTIC = UUID.fromString("00002a2a-0000-1000-8000-00805f9b34fb");

    /**
     * Current Time (Characteristic UUID: 0x2a2b)
     */
    public static final UUID CURRENT_TIME_CHARACTERISTIC = UUID.fromString("00002a2b-0000-1000-8000-00805f9b34fb");

    /**
     * Magnetic Declination (Characteristic UUID: 0x2a2c)
     */
    public static final UUID MAGNETIC_DECLINATION_CHARACTERISTIC = UUID.fromString("00002a2c-0000-1000-8000-00805f9b34fb");

    /**
     * Scan Refresh (Characteristic UUID: 0x2a31)
     */
    public static final UUID SCAN_REFRESH_CHARACTERISTIC = UUID.fromString("00002a31-0000-1000-8000-00805f9b34fb");

    /**
     * Boot Keyboard Output Report (Characteristic UUID: 0x2a32)
     */
    public static final UUID BOOT_KEYBOARD_OUTPUT_REPORT_CHARACTERISTIC = UUID.fromString("00002a32-0000-1000-8000-00805f9b34fb");

    /**
     * Boot Mouse Input Report (Characteristic UUID: 0x2a33)
     */
    public static final UUID BOOT_MOUSE_INPUT_REPORT_CHARACTERISTIC = UUID.fromString("00002a33-0000-1000-8000-00805f9b34fb");

    /**
     * Glucose Measurement Context (Characteristic UUID: 0x2a34)
     */
    public static final UUID GLUCOSE_MEASUREMENT_CONTEXT_CHARACTERISTIC = UUID.fromString("00002a34-0000-1000-8000-00805f9b34fb");

    /**
     * Blood Pressure Measurement (Characteristic UUID: 0x2a35)
     */
    public static final UUID BLOOD_PRESSURE_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a35-0000-1000-8000-00805f9b34fb");

    /**
     * Intermediate Cuff Pressure (Characteristic UUID: 0x2a36)
     */
    public static final UUID INTERMEDIATE_CUFF_PRESSURE_CHARACTERISTIC = UUID.fromString("00002a36-0000-1000-8000-00805f9b34fb");

    /**
     * Heart Rate Measurement (Characteristic UUID: 0x2a37)
     */
    public static final UUID HEART_RATE_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb");

    /**
     * Body Sensor Location (Characteristic UUID: 0x2a38)
     */
    public static final UUID BODY_SENSOR_LOCATION_CHARACTERISTIC = UUID.fromString("00002a38-0000-1000-8000-00805f9b34fb");

    /**
     * Heart Rate Control Point (Characteristic UUID: 0x2a39)
     */
    public static final UUID HEART_RATE_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002a39-0000-1000-8000-00805f9b34fb");

    /**
     * Alert Status (Characteristic UUID: 0x2a3f)
     */
    public static final UUID ALERT_STATUS_CHARACTERISTIC = UUID.fromString("00002a3f-0000-1000-8000-00805f9b34fb");

    /**
     * Ringer Control Point (Characteristic UUID: 0x2a40)
     */
    public static final UUID RINGER_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002a40-0000-1000-8000-00805f9b34fb");

    /**
     * Ringer Setting (Characteristic UUID: 0x2a41)
     */
    public static final UUID RINGER_SETTING_CHARACTERISTIC = UUID.fromString("00002a41-0000-1000-8000-00805f9b34fb");

    /**
     * Alert Category ID Bit Mask (Characteristic UUID: 0x2a42)
     */
    public static final UUID ALERT_CATEGORY_ID_BIT_MASK_CHARACTERISTIC = UUID.fromString("00002a42-0000-1000-8000-00805f9b34fb");

    /**
     * Alert Category ID (Characteristic UUID: 0x2a43)
     */
    public static final UUID ALERT_CATEGORY_ID_CHARACTERISTIC = UUID.fromString("00002a43-0000-1000-8000-00805f9b34fb");

    /**
     * Alert Notification Control Point (Characteristic UUID: 0x2a44)
     */
    public static final UUID ALERT_NOTIFICATION_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002a44-0000-1000-8000-00805f9b34fb");

    /**
     * Unread Alert Status (Characteristic UUID: 0x2a45)
     */
    public static final UUID UNREAD_ALERT_STATUS_CHARACTERISTIC = UUID.fromString("00002a45-0000-1000-8000-00805f9b34fb");

    /**
     * New Alert (Characteristic UUID: 0x2a46)
     */
    public static final UUID NEW_ALERT_CHARACTERISTIC = UUID.fromString("00002a46-0000-1000-8000-00805f9b34fb");

    /**
     * Supported New Alert Category (Characteristic UUID: 0x2a47)
     */
    public static final UUID SUPPORTED_NEW_ALERT_CATEGORY_CHARACTERISTIC = UUID.fromString("00002a47-0000-1000-8000-00805f9b34fb");

    /**
     * Supported Unread Alert Category (Characteristic UUID: 0x2a48)
     */
    public static final UUID SUPPORTED_UNREAD_ALERT_CATEGORY_CHARACTERISTIC = UUID.fromString("00002a48-0000-1000-8000-00805f9b34fb");

    /**
     * Blood Pressure Feature (Characteristic UUID: 0x2a49)
     */
    public static final UUID BLOOD_PRESSURE_FEATURE_CHARACTERISTIC = UUID.fromString("00002a49-0000-1000-8000-00805f9b34fb");

    /**
     * HID Information (Characteristic UUID: 0x2a4a)
     */
    public static final UUID HID_INFORMATION_CHARACTERISTIC = UUID.fromString("00002a4a-0000-1000-8000-00805f9b34fb");

    /**
     * Report Map (Characteristic UUID: 0x2a4b)
     */
    public static final UUID REPORT_MAP_CHARACTERISTIC = UUID.fromString("00002a4b-0000-1000-8000-00805f9b34fb");

    /**
     * HID Control Point (Characteristic UUID: 0x2a4c)
     */
    public static final UUID HID_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002a4c-0000-1000-8000-00805f9b34fb");

    /**
     * Report (Characteristic UUID: 0x2a4d)
     */
    public static final UUID REPORT_CHARACTERISTIC = UUID.fromString("00002a4d-0000-1000-8000-00805f9b34fb");

    /**
     * Protocol Mode (Characteristic UUID: 0x2a4e)
     */
    public static final UUID PROTOCOL_MODE_CHARACTERISTIC = UUID.fromString("00002a4e-0000-1000-8000-00805f9b34fb");

    /**
     * Scan Interval Window (Characteristic UUID: 0x2a4f)
     */
    public static final UUID SCAN_INTERVAL_WINDOW_CHARACTERISTIC = UUID.fromString("00002a4f-0000-1000-8000-00805f9b34fb");

    /**
     * PnP ID (Characteristic UUID: 0x2a50)
     */
    public static final UUID PNP_ID_CHARACTERISTIC = UUID.fromString("00002a50-0000-1000-8000-00805f9b34fb");

    /**
     * Glucose Feature (Characteristic UUID: 0x2a51)
     */
    public static final UUID GLUCOSE_FEATURE_CHARACTERISTIC = UUID.fromString("00002a51-0000-1000-8000-00805f9b34fb");

    /**
     * Record Access Control Point (Characteristic UUID: 0x2a52)
     */
    public static final UUID RECORD_ACCESS_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002a52-0000-1000-8000-00805f9b34fb");

    /**
     * RSC Measurement (Characteristic UUID: 0x2a53)
     */
    public static final UUID RSC_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a53-0000-1000-8000-00805f9b34fb");

    /**
     * RSC Feature (Characteristic UUID: 0x2a54)
     */
    public static final UUID RSC_FEATURE_CHARACTERISTIC = UUID.fromString("00002a54-0000-1000-8000-00805f9b34fb");

    /**
     * SC Control Point (Characteristic UUID: 0x2a55)
     */
    public static final UUID SC_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002a55-0000-1000-8000-00805f9b34fb");

    /**
     * Aggregate (Characteristic UUID: 0x2a5a)
     */
    public static final UUID AGGREGATE_CHARACTERISTIC = UUID.fromString("00002a5a-0000-1000-8000-00805f9b34fb");

    /**
     * CSC Measurement (Characteristic UUID: 0x2a5b)
     */
    public static final UUID CSC_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a5b-0000-1000-8000-00805f9b34fb");

    /**
     * CSC Feature (Characteristic UUID: 0x2a5c)
     */
    public static final UUID CSC_FEATURE_CHARACTERISTIC = UUID.fromString("00002a5c-0000-1000-8000-00805f9b34fb");

    /**
     * Sensor Location (Characteristic UUID: 0x2a5d)
     */
    public static final UUID SENSOR_LOCATION_CHARACTERISTIC = UUID.fromString("00002a5d-0000-1000-8000-00805f9b34fb");

    /**
     * PLX Spot-Check Measurement (Characteristic UUID: 0x2a5e)
     */
    public static final UUID PLX_SPOT_CHECK_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a5e-0000-1000-8000-00805f9b34fb");

    /**
     * PLX Continuous Measurement (Characteristic UUID: 0x2a5f)
     */
    public static final UUID PLX_CONTINUOUS_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a5f-0000-1000-8000-00805f9b34fb");

    /**
     * PLX Features (Characteristic UUID: 0x2a60)
     */
    public static final UUID PLX_FEATURES_CHARACTERISTIC = UUID.fromString("00002a60-0000-1000-8000-00805f9b34fb");

    /**
     * Cycling Power Measurement (Characteristic UUID: 0x2a63)
     */
    public static final UUID CYCLING_POWER_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a63-0000-1000-8000-00805f9b34fb");

    /**
     * Cycling Power Vector (Characteristic UUID: 0x2a64)
     */
    public static final UUID CYCLING_POWER_VECTOR_CHARACTERISTIC = UUID.fromString("00002a64-0000-1000-8000-00805f9b34fb");

    /**
     * Cycling Power Feature (Characteristic UUID: 0x2a65)
     */
    public static final UUID CYCLING_POWER_FEATURE_CHARACTERISTIC = UUID.fromString("00002a65-0000-1000-8000-00805f9b34fb");

    /**
     * Cycling Power Control Point (Characteristic UUID: 0x2a66)
     */
    public static final UUID CYCLING_POWER_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002a66-0000-1000-8000-00805f9b34fb");

    /**
     * Location and Speed (Characteristic UUID: 0x2a67)
     */
    public static final UUID LOCATION_AND_SPEED_CHARACTERISTIC = UUID.fromString("00002a67-0000-1000-8000-00805f9b34fb");

    /**
     * Navigation (Characteristic UUID: 0x2a68)
     */
    public static final UUID NAVIGATION_CHARACTERISTIC = UUID.fromString("00002a68-0000-1000-8000-00805f9b34fb");

    /**
     * Position Quality (Characteristic UUID: 0x2a69)
     */
    public static final UUID POSITION_QUALITY_CHARACTERISTIC = UUID.fromString("00002a69-0000-1000-8000-00805f9b34fb");

    /**
     * LN Feature (Characteristic UUID: 0x2a6a)
     */
    public static final UUID LN_FEATURE_CHARACTERISTIC = UUID.fromString("00002a6a-0000-1000-8000-00805f9b34fb");

    /**
     * LN Control Point (Characteristic UUID: 0x2a6b)
     */
    public static final UUID LN_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002a6b-0000-1000-8000-00805f9b34fb");

    /**
     * Elevation (Characteristic UUID: 0x2a6c)
     */
    public static final UUID ELEVATION_CHARACTERISTIC = UUID.fromString("00002a6c-0000-1000-8000-00805f9b34fb");

    /**
     * Pressure (Characteristic UUID: 0x2a6d)
     */
    public static final UUID PRESSURE_CHARACTERISTIC = UUID.fromString("00002a6d-0000-1000-8000-00805f9b34fb");

    /**
     * Temperature (Characteristic UUID: 0x2a6e)
     */
    public static final UUID TEMPERATURE_CHARACTERISTIC = UUID.fromString("00002a6e-0000-1000-8000-00805f9b34fb");

    /**
     * Humidity (Characteristic UUID: 0x2a6f)
     */
    public static final UUID HUMIDITY_CHARACTERISTIC = UUID.fromString("00002a6f-0000-1000-8000-00805f9b34fb");

    /**
     * True Wind Speed (Characteristic UUID: 0x2a70)
     */
    public static final UUID TRUE_WIND_SPEED_CHARACTERISTIC = UUID.fromString("00002a70-0000-1000-8000-00805f9b34fb");

    /**
     * True Wind Direction (Characteristic UUID: 0x2a71)
     */
    public static final UUID TRUE_WIND_DIRECTION_CHARACTERISTIC = UUID.fromString("00002a71-0000-1000-8000-00805f9b34fb");

    /**
     * Apparent Wind Speed (Characteristic UUID: 0x2a72)
     */
    public static final UUID APPARENT_WIND_SPEED_CHARACTERISTIC = UUID.fromString("00002a72-0000-1000-8000-00805f9b34fb");

    /**
     * Apparent Wind Direction (Characteristic UUID: 0x2a73)
     */
    public static final UUID APPARENT_WIND_DIRECTION_CHARACTERISTIC = UUID.fromString("00002a73-0000-1000-8000-00805f9b34fb");

    /**
     * Gust Factor (Characteristic UUID: 0x2a74)
     */
    public static final UUID GUST_FACTOR_CHARACTERISTIC = UUID.fromString("00002a74-0000-1000-8000-00805f9b34fb");

    /**
     * Pollen Concentration (Characteristic UUID: 0x2a75)
     */
    public static final UUID POLLEN_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002a75-0000-1000-8000-00805f9b34fb");

    /**
     * UV Index (Characteristic UUID: 0x2a76)
     */
    public static final UUID UV_INDEX_CHARACTERISTIC = UUID.fromString("00002a76-0000-1000-8000-00805f9b34fb");

    /**
     * Irradiance (Characteristic UUID: 0x2a77)
     */
    public static final UUID IRRADIANCE_CHARACTERISTIC = UUID.fromString("00002a77-0000-1000-8000-00805f9b34fb");

    /**
     * Rainfall (Characteristic UUID: 0x2a78)
     */
    public static final UUID RAINFALL_CHARACTERISTIC = UUID.fromString("00002a78-0000-1000-8000-00805f9b34fb");

    /**
     * Wind Chill (Characteristic UUID: 0x2a79)
     */
    public static final UUID WIND_CHILL_CHARACTERISTIC = UUID.fromString("00002a79-0000-1000-8000-00805f9b34fb");

    /**
     * Heat Index (Characteristic UUID: 0x2a7a)
     */
    public static final UUID HEAT_INDEX_CHARACTERISTIC = UUID.fromString("00002a7a-0000-1000-8000-00805f9b34fb");

    /**
     * Dew Point (Characteristic UUID: 0x2a7b)
     */
    public static final UUID DEW_POINT_CHARACTERISTIC = UUID.fromString("00002a7b-0000-1000-8000-00805f9b34fb");

    /**
     * Descriptor Value Changed (Characteristic UUID: 0x2a7d)
     */
    public static final UUID DESCRIPTOR_VALUE_CHANGED_CHARACTERISTIC = UUID.fromString("00002a7d-0000-1000-8000-00805f9b34fb");

    /**
     * Aerobic Heart Rate Lower Limit (Characteristic UUID: 0x2a7e)
     */
    public static final UUID AEROBIC_HEART_RATE_LOWER_LIMIT_CHARACTERISTIC = UUID.fromString("00002a7e-0000-1000-8000-00805f9b34fb");

    /**
     * Aerobic Threshold (Characteristic UUID: 0x2a7f)
     */
    public static final UUID AEROBIC_THRESHOLD_CHARACTERISTIC = UUID.fromString("00002a7f-0000-1000-8000-00805f9b34fb");

    /**
     * Age (Characteristic UUID: 0x2a80)
     */
    public static final UUID AGE_CHARACTERISTIC = UUID.fromString("00002a80-0000-1000-8000-00805f9b34fb");

    /**
     * Anaerobic Heart Rate Lower Limit (Characteristic UUID: 0x2a81)
     */
    public static final UUID ANAEROBIC_HEART_RATE_LOWER_LIMIT_CHARACTERISTIC = UUID.fromString("00002a81-0000-1000-8000-00805f9b34fb");

    /**
     * Anaerobic Heart Rate Upper Limit (Characteristic UUID: 0x2a82)
     */
    public static final UUID ANAEROBIC_HEART_RATE_UPPER_LIMIT_CHARACTERISTIC = UUID.fromString("00002a82-0000-1000-8000-00805f9b34fb");

    /**
     * Anaerobic Threshold (Characteristic UUID: 0x2a83)
     */
    public static final UUID ANAEROBIC_THRESHOLD_CHARACTERISTIC = UUID.fromString("00002a83-0000-1000-8000-00805f9b34fb");

    /**
     * Aerobic Heart Rate Upper Limit (Characteristic UUID: 0x2a84)
     */
    public static final UUID AEROBIC_HEART_RATE_UPPER_LIMIT_CHARACTERISTIC = UUID.fromString("00002a84-0000-1000-8000-00805f9b34fb");

    /**
     * Date of Birth (Characteristic UUID: 0x2a85)
     */
    public static final UUID DATE_OF_BIRTH_CHARACTERISTIC = UUID.fromString("00002a85-0000-1000-8000-00805f9b34fb");

    /**
     * Date of Threshold Assessment (Characteristic UUID: 0x2a86)
     */
    public static final UUID DATE_OF_THRESHOLD_ASSESSMENT_CHARACTERISTIC = UUID.fromString("00002a86-0000-1000-8000-00805f9b34fb");

    /**
     * Email Address (Characteristic UUID: 0x2a87)
     */
    public static final UUID EMAIL_ADDRESS_CHARACTERISTIC = UUID.fromString("00002a87-0000-1000-8000-00805f9b34fb");

    /**
     * Fat Burn Heart Rate Lower Limit (Characteristic UUID: 0x2a88)
     */
    public static final UUID FAT_BURN_HEART_RATE_LOWER_LIMIT_CHARACTERISTIC = UUID.fromString("00002a88-0000-1000-8000-00805f9b34fb");

    /**
     * Fat Burn Heart Rate Upper Limit (Characteristic UUID: 0x2a89)
     */
    public static final UUID FAT_BURN_HEART_RATE_UPPER_LIMIT_CHARACTERISTIC = UUID.fromString("00002a89-0000-1000-8000-00805f9b34fb");

    /**
     * First Name (Characteristic UUID: 0x2a8a)
     */
    public static final UUID FIRST_NAME_CHARACTERISTIC = UUID.fromString("00002a8a-0000-1000-8000-00805f9b34fb");

    /**
     * Five Zone Heart Rate Limits (Characteristic UUID: 0x2a8b)
     */
    public static final UUID FIVE_ZONE_HEART_RATE_LIMITS_CHARACTERISTIC = UUID.fromString("00002a8b-0000-1000-8000-00805f9b34fb");

    /**
     * Gender (Characteristic UUID: 0x2a8c)
     */
    public static final UUID GENDER_CHARACTERISTIC = UUID.fromString("00002a8c-0000-1000-8000-00805f9b34fb");

    /**
     * Heart Rate Max (Characteristic UUID: 0x2a8d)
     */
    public static final UUID HEART_RATE_MAX_CHARACTERISTIC = UUID.fromString("00002a8d-0000-1000-8000-00805f9b34fb");

    /**
     * Height (Characteristic UUID: 0x2a8e)
     */
    public static final UUID HEIGHT_CHARACTERISTIC = UUID.fromString("00002a8e-0000-1000-8000-00805f9b34fb");

    /**
     * Hip Circumference (Characteristic UUID: 0x2a8f)
     */
    public static final UUID HIP_CIRCUMFERENCE_CHARACTERISTIC = UUID.fromString("00002a8f-0000-1000-8000-00805f9b34fb");

    /**
     * Last Name (Characteristic UUID: 0x2a90)
     */
    public static final UUID LAST_NAME_CHARACTERISTIC = UUID.fromString("00002a90-0000-1000-8000-00805f9b34fb");

    /**
     * Maximum Recommended Heart Rate (Characteristic UUID: 0x2a91)
     */
    public static final UUID MAXIMUM_RECOMMENDED_HEART_RATE_CHARACTERISTIC = UUID.fromString("00002a91-0000-1000-8000-00805f9b34fb");

    /**
     * Resting Heart Rate (Characteristic UUID: 0x2a92)
     */
    public static final UUID RESTING_HEART_RATE_CHARACTERISTIC = UUID.fromString("00002a92-0000-1000-8000-00805f9b34fb");

    /**
     * Sport Type for Aerobic and Anaerobic Thresholds (Characteristic UUID: 0x2a93)
     */
    public static final UUID SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CHARACTERISTIC = UUID.fromString("00002a93-0000-1000-8000-00805f9b34fb");

    /**
     * Three Zone Heart Rate Limits (Characteristic UUID: 0x2a94)
     */
    public static final UUID THREE_ZONE_HEART_RATE_LIMITS_CHARACTERISTIC = UUID.fromString("00002a94-0000-1000-8000-00805f9b34fb");

    /**
     * Two Zone Heart Rate Limits (Characteristic UUID: 0x2a95)
     */
    public static final UUID TWO_ZONE_HEART_RATE_LIMITS_CHARACTERISTIC = UUID.fromString("00002a95-0000-1000-8000-00805f9b34fb");

    /**
     * VO2 Max (Characteristic UUID: 0x2a96)
     */
    public static final UUID VO2_MAX_CHARACTERISTIC = UUID.fromString("00002a96-0000-1000-8000-00805f9b34fb");

    /**
     * Waist Circumference (Characteristic UUID: 0x2a97)
     */
    public static final UUID WAIST_CIRCUMFERENCE_CHARACTERISTIC = UUID.fromString("00002a97-0000-1000-8000-00805f9b34fb");

    /**
     * Weight (Characteristic UUID: 0x2a98)
     */
    public static final UUID WEIGHT_CHARACTERISTIC = UUID.fromString("00002a98-0000-1000-8000-00805f9b34fb");

    /**
     * Database Change Increment (Characteristic UUID: 0x2a99)
     */
    public static final UUID DATABASE_CHANGE_INCREMENT_CHARACTERISTIC = UUID.fromString("00002a99-0000-1000-8000-00805f9b34fb");

    /**
     * User Index (Characteristic UUID: 0x2a9a)
     */
    public static final UUID USER_INDEX_CHARACTERISTIC = UUID.fromString("00002a9a-0000-1000-8000-00805f9b34fb");

    /**
     * Body Composition Feature (Characteristic UUID: 0x2a9b)
     */
    public static final UUID BODY_COMPOSITION_FEATURE_CHARACTERISTIC = UUID.fromString("00002a9b-0000-1000-8000-00805f9b34fb");

    /**
     * Body Composition Measurement (Characteristic UUID: 0x2a9c)
     */
    public static final UUID BODY_COMPOSITION_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a9c-0000-1000-8000-00805f9b34fb");

    /**
     * Weight Measurement (Characteristic UUID: 0x2a9d)
     */
    public static final UUID WEIGHT_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002a9d-0000-1000-8000-00805f9b34fb");

    /**
     * Weight Scale Feature (Characteristic UUID: 0x2a9e)
     */
    public static final UUID WEIGHT_SCALE_FEATURE_CHARACTERISTIC = UUID.fromString("00002a9e-0000-1000-8000-00805f9b34fb");

    /**
     * User Control Point (Characteristic UUID: 0x2a9f)
     */
    public static final UUID USER_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002a9f-0000-1000-8000-00805f9b34fb");

    /**
     * Magnetic Flux Density - 2D (Characteristic UUID: 0x2aa0)
     */
    public static final UUID MAGNETIC_FLUX_DENSITY_2D_CHARACTERISTIC = UUID.fromString("00002aa0-0000-1000-8000-00805f9b34fb");

    /**
     * Magnetic Flux Density - 3D (Characteristic UUID: 0x2aa1)
     */
    public static final UUID MAGNETIC_FLUX_DENSITY_3D_CHARACTERISTIC = UUID.fromString("00002aa1-0000-1000-8000-00805f9b34fb");

    /**
     * Language (Characteristic UUID: 0x2aa2)
     */
    public static final UUID LANGUAGE_CHARACTERISTIC = UUID.fromString("00002aa2-0000-1000-8000-00805f9b34fb");

    /**
     * Barometric Pressure Trend (Characteristic UUID: 0x2aa3)
     */
    public static final UUID BAROMETRIC_PRESSURE_TREND_CHARACTERISTIC = UUID.fromString("00002aa3-0000-1000-8000-00805f9b34fb");

    /**
     * Bond Management Control Point (Characteristic UUID: 0x2aa4)
     */
    public static final UUID BOND_MANAGEMENT_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002aa4-0000-1000-8000-00805f9b34fb");

    /**
     * Bond Management Feature (Characteristic UUID: 0x2aa5)
     */
    public static final UUID BOND_MANAGEMENT_FEATURE_CHARACTERISTIC = UUID.fromString("00002aa5-0000-1000-8000-00805f9b34fb");

    /**
     * Central Address Resolution (Characteristic UUID: 0x2aa6)
     */
    public static final UUID CENTRAL_ADDRESS_RESOLUTION_CHARACTERISTIC = UUID.fromString("00002aa6-0000-1000-8000-00805f9b34fb");

    /**
     * CGM Measurement (Characteristic UUID: 0x2aa7)
     */
    public static final UUID CGM_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002aa7-0000-1000-8000-00805f9b34fb");

    /**
     * CGM Feature (Characteristic UUID: 0x2aa8)
     */
    public static final UUID CGM_FEATURE_CHARACTERISTIC = UUID.fromString("00002aa8-0000-1000-8000-00805f9b34fb");

    /**
     * CGM Status (Characteristic UUID: 0x2aa9)
     */
    public static final UUID CGM_STATUS_CHARACTERISTIC = UUID.fromString("00002aa9-0000-1000-8000-00805f9b34fb");

    /**
     * CGM Session Start Time (Characteristic UUID: 0x2aaa)
     */
    public static final UUID CGM_SESSION_START_TIME_CHARACTERISTIC = UUID.fromString("00002aaa-0000-1000-8000-00805f9b34fb");

    /**
     * CGM Session Run Time (Characteristic UUID: 0x2aab)
     */
    public static final UUID CGM_SESSION_RUN_TIME_CHARACTERISTIC = UUID.fromString("00002aab-0000-1000-8000-00805f9b34fb");

    /**
     * CGM Specific Ops Control Point (Characteristic UUID: 0x2aac)
     */
    public static final UUID CGM_SPECIFIC_OPS_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002aac-0000-1000-8000-00805f9b34fb");

    /**
     * Indoor Positioning Configuration (Characteristic UUID: 0x2aad)
     */
    public static final UUID INDOOR_POSITIONING_CONFIGURATION_CHARACTERISTIC = UUID.fromString("00002aad-0000-1000-8000-00805f9b34fb");

    /**
     * Latitude (Characteristic UUID: 0x2aae)
     */
    public static final UUID LATITUDE_CHARACTERISTIC = UUID.fromString("00002aae-0000-1000-8000-00805f9b34fb");

    /**
     * Longitude (Characteristic UUID: 0x2aaf)
     */
    public static final UUID LONGITUDE_CHARACTERISTIC = UUID.fromString("00002aaf-0000-1000-8000-00805f9b34fb");

    /**
     * Local North Coordinate (Characteristic UUID: 0x2ab0)
     */
    public static final UUID LOCAL_NORTH_COORDINATE_CHARACTERISTIC = UUID.fromString("00002ab0-0000-1000-8000-00805f9b34fb");

    /**
     * Local East Coordinate (Characteristic UUID: 0x2ab1)
     */
    public static final UUID LOCAL_EAST_COORDINATE_CHARACTERISTIC = UUID.fromString("00002ab1-0000-1000-8000-00805f9b34fb");

    /**
     * Floor Number (Characteristic UUID: 0x2ab2)
     */
    public static final UUID FLOOR_NUMBER_CHARACTERISTIC = UUID.fromString("00002ab2-0000-1000-8000-00805f9b34fb");

    /**
     * Altitude (Characteristic UUID: 0x2ab3)
     */
    public static final UUID ALTITUDE_CHARACTERISTIC = UUID.fromString("00002ab3-0000-1000-8000-00805f9b34fb");

    /**
     * Uncertainty (Characteristic UUID: 0x2ab4)
     */
    public static final UUID UNCERTAINTY_CHARACTERISTIC = UUID.fromString("00002ab4-0000-1000-8000-00805f9b34fb");

    /**
     * Location Name (Characteristic UUID: 0x2ab5)
     */
    public static final UUID LOCATION_NAME_CHARACTERISTIC = UUID.fromString("00002ab5-0000-1000-8000-00805f9b34fb");

    /**
     * URI (Characteristic UUID: 0x2ab6)
     */
    public static final UUID URI_CHARACTERISTIC = UUID.fromString("00002ab6-0000-1000-8000-00805f9b34fb");

    /**
     * HTTP Headers (Characteristic UUID: 0x2ab7)
     */
    public static final UUID HTTP_HEADERS_CHARACTERISTIC = UUID.fromString("00002ab7-0000-1000-8000-00805f9b34fb");

    /**
     * HTTP Status Code (Characteristic UUID: 0x2ab8)
     */
    public static final UUID HTTP_STATUS_CODE_CHARACTERISTIC = UUID.fromString("00002ab8-0000-1000-8000-00805f9b34fb");

    /**
     * HTTP Entity Body (Characteristic UUID: 0x2ab9)
     */
    public static final UUID HTTP_ENTITY_BODY_CHARACTERISTIC = UUID.fromString("00002ab9-0000-1000-8000-00805f9b34fb");

    /**
     * HTTP Control Point (Characteristic UUID: 0x2aba)
     */
    public static final UUID HTTP_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002aba-0000-1000-8000-00805f9b34fb");

    /**
     * HTTPS Security (Characteristic UUID: 0x2abb)
     */
    public static final UUID HTTPS_SECURITY_CHARACTERISTIC = UUID.fromString("00002abb-0000-1000-8000-00805f9b34fb");

    /**
     * TDS Control Point (Characteristic UUID: 0x2abc)
     */
    public static final UUID TDS_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002abc-0000-1000-8000-00805f9b34fb");

    /**
     * OTS Feature (Characteristic UUID: 0x2abd)
     */
    public static final UUID OTS_FEATURE_CHARACTERISTIC = UUID.fromString("00002abd-0000-1000-8000-00805f9b34fb");

    /**
     * Object Name (Characteristic UUID: 0x2abe)
     */
    public static final UUID OBJECT_NAME_CHARACTERISTIC = UUID.fromString("00002abe-0000-1000-8000-00805f9b34fb");

    /**
     * Object Type (Characteristic UUID: 0x2abf)
     */
    public static final UUID OBJECT_TYPE_CHARACTERISTIC = UUID.fromString("00002abf-0000-1000-8000-00805f9b34fb");

    /**
     * Object Size (Characteristic UUID: 0x2ac0)
     */
    public static final UUID OBJECT_SIZE_CHARACTERISTIC = UUID.fromString("00002ac0-0000-1000-8000-00805f9b34fb");

    /**
     * Object First-Created (Characteristic UUID: 0x2ac1)
     */
    public static final UUID OBJECT_FIRST_CREATED_CHARACTERISTIC = UUID.fromString("00002ac1-0000-1000-8000-00805f9b34fb");

    /**
     * Object Last-Modified (Characteristic UUID: 0x2ac2)
     */
    public static final UUID OBJECT_LAST_MODIFIED_CHARACTERISTIC = UUID.fromString("00002ac2-0000-1000-8000-00805f9b34fb");

    /**
     * Object ID (Characteristic UUID: 0x2ac3)
     */
    public static final UUID OBJECT_ID_CHARACTERISTIC = UUID.fromString("00002ac3-0000-1000-8000-00805f9b34fb");

    /**
     * Object Properties (Characteristic UUID: 0x2ac4)
     */
    public static final UUID OBJECT_PROPERTIES_CHARACTERISTIC = UUID.fromString("00002ac4-0000-1000-8000-00805f9b34fb");

    /**
     * Object Action Control Point (Characteristic UUID: 0x2ac5)
     */
    public static final UUID OBJECT_ACTION_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002ac5-0000-1000-8000-00805f9b34fb");

    /**
     * Object List Control Point (Characteristic UUID: 0x2ac6)
     */
    public static final UUID OBJECT_LIST_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002ac6-0000-1000-8000-00805f9b34fb");

    /**
     * Object List Filter (Characteristic UUID: 0x2ac7)
     */
    public static final UUID OBJECT_LIST_FILTER_CHARACTERISTIC = UUID.fromString("00002ac7-0000-1000-8000-00805f9b34fb");

    /**
     * Object Changed (Characteristic UUID: 0x2ac8)
     */
    public static final UUID OBJECT_CHANGED_CHARACTERISTIC = UUID.fromString("00002ac8-0000-1000-8000-00805f9b34fb");

    /**
     * Resolvable Private Address Only (Characteristic UUID: 0x2ac9)
     */
    public static final UUID RESOLVABLE_PRIVATE_ADDRESS_ONLY_CHARACTERISTIC = UUID.fromString("00002ac9-0000-1000-8000-00805f9b34fb");

    /**
     * Fitness Machine Feature (Characteristic UUID: 0x2acc)
     */
    public static final UUID FITNESS_MACHINE_FEATURE_CHARACTERISTIC = UUID.fromString("00002acc-0000-1000-8000-00805f9b34fb");

    /**
     * Treadmill Data (Characteristic UUID: 0x2acd)
     */
    public static final UUID TREADMILL_DATA_CHARACTERISTIC = UUID.fromString("00002acd-0000-1000-8000-00805f9b34fb");

    /**
     * Cross Trainer Data (Characteristic UUID: 0x2ace)
     */
    public static final UUID CROSS_TRAINER_DATA_CHARACTERISTIC = UUID.fromString("00002ace-0000-1000-8000-00805f9b34fb");

    /**
     * Step Climber Data (Characteristic UUID: 0x2acf)
     */
    public static final UUID STEP_CLIMBER_DATA_CHARACTERISTIC = UUID.fromString("00002acf-0000-1000-8000-00805f9b34fb");

    /**
     * Stair Climber Data (Characteristic UUID: 0x2ad0)
     */
    public static final UUID STAIR_CLIMBER_DATA_CHARACTERISTIC = UUID.fromString("00002ad0-0000-1000-8000-00805f9b34fb");

    /**
     * Rower Data (Characteristic UUID: 0x2ad1)
     */
    public static final UUID ROWER_DATA_CHARACTERISTIC = UUID.fromString("00002ad1-0000-1000-8000-00805f9b34fb");

    /**
     * Indoor Bike Data (Characteristic UUID: 0x2ad2)
     */
    public static final UUID INDOOR_BIKE_DATA_CHARACTERISTIC = UUID.fromString("00002ad2-0000-1000-8000-00805f9b34fb");

    /**
     * Training Status (Characteristic UUID: 0x2ad3)
     */
    public static final UUID TRAINING_STATUS_CHARACTERISTIC = UUID.fromString("00002ad3-0000-1000-8000-00805f9b34fb");

    /**
     * Supported Speed Range (Characteristic UUID: 0x2ad4)
     */
    public static final UUID SUPPORTED_SPEED_RANGE_CHARACTERISTIC = UUID.fromString("00002ad4-0000-1000-8000-00805f9b34fb");

    /**
     * Supported Inclination Range (Characteristic UUID: 0x2ad5)
     */
    public static final UUID SUPPORTED_INCLINATION_RANGE_CHARACTERISTIC = UUID.fromString("00002ad5-0000-1000-8000-00805f9b34fb");

    /**
     * Supported Resistance Level Range (Characteristic UUID: 0x2ad6)
     */
    public static final UUID SUPPORTED_RESISTANCE_LEVEL_RANGE_CHARACTERISTIC = UUID.fromString("00002ad6-0000-1000-8000-00805f9b34fb");

    /**
     * Supported Heart Rate Range (Characteristic UUID: 0x2ad7)
     */
    public static final UUID SUPPORTED_HEART_RATE_RANGE_CHARACTERISTIC = UUID.fromString("00002ad7-0000-1000-8000-00805f9b34fb");

    /**
     * Supported Power Range (Characteristic UUID: 0x2ad8)
     */
    public static final UUID SUPPORTED_POWER_RANGE_CHARACTERISTIC = UUID.fromString("00002ad8-0000-1000-8000-00805f9b34fb");

    /**
     * Fitness Machine Control Point (Characteristic UUID: 0x2ad9)
     */
    public static final UUID FITNESS_MACHINE_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002ad9-0000-1000-8000-00805f9b34fb");

    /**
     * Fitness Machine Status (Characteristic UUID: 0x2ada)
     */
    public static final UUID FITNESS_MACHINE_STATUS_CHARACTERISTIC = UUID.fromString("00002ada-0000-1000-8000-00805f9b34fb");

    /**
     * Mesh Provisioning Data In (Characteristic UUID: 0x2adb)
     */
    public static final UUID MESH_PROVISIONING_DATA_IN_CHARACTERISTIC = UUID.fromString("00002adb-0000-1000-8000-00805f9b34fb");

    /**
     * Mesh Provisioning Data Out (Characteristic UUID: 0x2adc)
     */
    public static final UUID MESH_PROVISIONING_DATA_OUT_CHARACTERISTIC = UUID.fromString("00002adc-0000-1000-8000-00805f9b34fb");

    /**
     * Mesh Proxy Data In (Characteristic UUID: 0x2add)
     */
    public static final UUID MESH_PROXY_DATA_IN_CHARACTERISTIC = UUID.fromString("00002add-0000-1000-8000-00805f9b34fb");

    /**
     * Mesh Proxy Data Out (Characteristic UUID: 0x2ade)
     */
    public static final UUID MESH_PROXY_DATA_OUT_CHARACTERISTIC = UUID.fromString("00002ade-0000-1000-8000-00805f9b34fb");

    /**
     * Average Current (Characteristic UUID: 0x2ae0)
     */
    public static final UUID AVERAGE_CURRENT_CHARACTERISTIC = UUID.fromString("00002ae0-0000-1000-8000-00805f9b34fb");

    /**
     * Average Voltage (Characteristic UUID: 0x2ae1)
     */
    public static final UUID AVERAGE_VOLTAGE_CHARACTERISTIC = UUID.fromString("00002ae1-0000-1000-8000-00805f9b34fb");

    /**
     * Boolean (Characteristic UUID: 0x2ae2)
     */
    public static final UUID BOOLEAN_CHARACTERISTIC = UUID.fromString("00002ae2-0000-1000-8000-00805f9b34fb");

    /**
     * Chromatic Distance from Planckian (Characteristic UUID: 0x2ae3)
     */
    public static final UUID CHROMATIC_DISTANCE_FROM_PLANCKIAN_CHARACTERISTIC = UUID.fromString("00002ae3-0000-1000-8000-00805f9b34fb");

    /**
     * Chromaticity Coordinates (Characteristic UUID: 0x2ae4)
     */
    public static final UUID CHROMATICITY_COORDINATES_CHARACTERISTIC = UUID.fromString("00002ae4-0000-1000-8000-00805f9b34fb");

    /**
     * Chromaticity in CCT and Duv Values (Characteristic UUID: 0x2ae5)
     */
    public static final UUID CHROMATICITY_IN_CCT_AND_DUV_VALUES_CHARACTERISTIC = UUID.fromString("00002ae5-0000-1000-8000-00805f9b34fb");

    /**
     * Chromaticity Tolerance (Characteristic UUID: 0x2ae6)
     */
    public static final UUID CHROMATICITY_TOLERANCE_CHARACTERISTIC = UUID.fromString("00002ae6-0000-1000-8000-00805f9b34fb");

    /**
     * CIE 13.3-1995 Color Rendering Index (Characteristic UUID: 0x2ae7)
     */
    public static final UUID CIE_13_3_1995_COLOR_RENDERING_INDEX_CHARACTERISTIC = UUID.fromString("00002ae7-0000-1000-8000-00805f9b34fb");

    /**
     * Coefficient (Characteristic UUID: 0x2ae8)
     */
    public static final UUID COEFFICIENT_CHARACTERISTIC = UUID.fromString("00002ae8-0000-1000-8000-00805f9b34fb");

    /**
     * Correlated Color Temperature (Characteristic UUID: 0x2ae9)
     */
    public static final UUID CORRELATED_COLOR_TEMPERATURE_CHARACTERISTIC = UUID.fromString("00002ae9-0000-1000-8000-00805f9b34fb");

    /**
     * Count 16 (Characteristic UUID: 0x2aea)
     */
    public static final UUID COUNT_16_CHARACTERISTIC = UUID.fromString("00002aea-0000-1000-8000-00805f9b34fb");

    /**
     * Count 24 (Characteristic UUID: 0x2aeb)
     */
    public static final UUID COUNT_24_CHARACTERISTIC = UUID.fromString("00002aeb-0000-1000-8000-00805f9b34fb");

    /**
     * Country Code (Characteristic UUID: 0x2aec)
     */
    public static final UUID COUNTRY_CODE_CHARACTERISTIC = UUID.fromString("00002aec-0000-1000-8000-00805f9b34fb");

    /**
     * Date UTC (Characteristic UUID: 0x2aed)
     */
    public static final UUID DATE_UTC_CHARACTERISTIC = UUID.fromString("00002aed-0000-1000-8000-00805f9b34fb");

    /**
     * Electric Current (Characteristic UUID: 0x2aee)
     */
    public static final UUID ELECTRIC_CURRENT_CHARACTERISTIC = UUID.fromString("00002aee-0000-1000-8000-00805f9b34fb");

    /**
     * Electric Current Range (Characteristic UUID: 0x2aef)
     */
    public static final UUID ELECTRIC_CURRENT_RANGE_CHARACTERISTIC = UUID.fromString("00002aef-0000-1000-8000-00805f9b34fb");

    /**
     * Electric Current Specification (Characteristic UUID: 0x2af0)
     */
    public static final UUID ELECTRIC_CURRENT_SPECIFICATION_CHARACTERISTIC = UUID.fromString("00002af0-0000-1000-8000-00805f9b34fb");

    /**
     * Electric Current Statistics (Characteristic UUID: 0x2af1)
     */
    public static final UUID ELECTRIC_CURRENT_STATISTICS_CHARACTERISTIC = UUID.fromString("00002af1-0000-1000-8000-00805f9b34fb");

    /**
     * Energy (Characteristic UUID: 0x2af2)
     */
    public static final UUID ENERGY_CHARACTERISTIC = UUID.fromString("00002af2-0000-1000-8000-00805f9b34fb");

    /**
     * Energy in a Period of Day (Characteristic UUID: 0x2af3)
     */
    public static final UUID ENERGY_IN_A_PERIOD_OF_DAY_CHARACTERISTIC = UUID.fromString("00002af3-0000-1000-8000-00805f9b34fb");

    /**
     * Event Statistics (Characteristic UUID: 0x2af4)
     */
    public static final UUID EVENT_STATISTICS_CHARACTERISTIC = UUID.fromString("00002af4-0000-1000-8000-00805f9b34fb");

    /**
     * Fixed String 16 (Characteristic UUID: 0x2af5)
     */
    public static final UUID FIXED_STRING_16_CHARACTERISTIC = UUID.fromString("00002af5-0000-1000-8000-00805f9b34fb");

    /**
     * Fixed String 24 (Characteristic UUID: 0x2af6)
     */
    public static final UUID FIXED_STRING_24_CHARACTERISTIC = UUID.fromString("00002af6-0000-1000-8000-00805f9b34fb");

    /**
     * Fixed String 36 (Characteristic UUID: 0x2af7)
     */
    public static final UUID FIXED_STRING_36_CHARACTERISTIC = UUID.fromString("00002af7-0000-1000-8000-00805f9b34fb");

    /**
     * Fixed String 8 (Characteristic UUID: 0x2af8)
     */
    public static final UUID FIXED_STRING_8_CHARACTERISTIC = UUID.fromString("00002af8-0000-1000-8000-00805f9b34fb");

    /**
     * Generic Level (Characteristic UUID: 0x2af9)
     */
    public static final UUID GENERIC_LEVEL_CHARACTERISTIC = UUID.fromString("00002af9-0000-1000-8000-00805f9b34fb");

    /**
     * Global Trade Item Number (Characteristic UUID: 0x2afa)
     */
    public static final UUID GLOBAL_TRADE_ITEM_NUMBER_CHARACTERISTIC = UUID.fromString("00002afa-0000-1000-8000-00805f9b34fb");

    /**
     * Illuminance (Characteristic UUID: 0x2afb)
     */
    public static final UUID ILLUMINANCE_CHARACTERISTIC = UUID.fromString("00002afb-0000-1000-8000-00805f9b34fb");

    /**
     * Luminous Efficacy (Characteristic UUID: 0x2afc)
     */
    public static final UUID LUMINOUS_EFFICACY_CHARACTERISTIC = UUID.fromString("00002afc-0000-1000-8000-00805f9b34fb");

    /**
     * Luminous Energy (Characteristic UUID: 0x2afd)
     */
    public static final UUID LUMINOUS_ENERGY_CHARACTERISTIC = UUID.fromString("00002afd-0000-1000-8000-00805f9b34fb");

    /**
     * Luminous Exposure (Characteristic UUID: 0x2afe)
     */
    public static final UUID LUMINOUS_EXPOSURE_CHARACTERISTIC = UUID.fromString("00002afe-0000-1000-8000-00805f9b34fb");

    /**
     * Luminous Flux (Characteristic UUID: 0x2aff)
     */
    public static final UUID LUMINOUS_FLUX_CHARACTERISTIC = UUID.fromString("00002aff-0000-1000-8000-00805f9b34fb");

    /**
     * Luminous Flux Range (Characteristic UUID: 0x2b00)
     */
    public static final UUID LUMINOUS_FLUX_RANGE_CHARACTERISTIC = UUID.fromString("00002b00-0000-1000-8000-00805f9b34fb");

    /**
     * Luminous Intensity (Characteristic UUID: 0x2b01)
     */
    public static final UUID LUMINOUS_INTENSITY_CHARACTERISTIC = UUID.fromString("00002b01-0000-1000-8000-00805f9b34fb");

    /**
     * Mass Flow (Characteristic UUID: 0x2b02)
     */
    public static final UUID MASS_FLOW_CHARACTERISTIC = UUID.fromString("00002b02-0000-1000-8000-00805f9b34fb");

    /**
     * Perceived Lightness (Characteristic UUID: 0x2b03)
     */
    public static final UUID PERCEIVED_LIGHTNESS_CHARACTERISTIC = UUID.fromString("00002b03-0000-1000-8000-00805f9b34fb");

    /**
     * Percentage 8 (Characteristic UUID: 0x2b04)
     */
    public static final UUID PERCENTAGE_8_CHARACTERISTIC = UUID.fromString("00002b04-0000-1000-8000-00805f9b34fb");

    /**
     * Power (Characteristic UUID: 0x2b05)
     */
    public static final UUID POWER_CHARACTERISTIC = UUID.fromString("00002b05-0000-1000-8000-00805f9b34fb");

    /**
     * Power Specification (Characteristic UUID: 0x2b06)
     */
    public static final UUID POWER_SPECIFICATION_CHARACTERISTIC = UUID.fromString("00002b06-0000-1000-8000-00805f9b34fb");

    /**
     * Relative Runtime in a Current Range (Characteristic UUID: 0x2b07)
     */
    public static final UUID RELATIVE_RUNTIME_IN_A_CURRENT_RANGE_CHARACTERISTIC = UUID.fromString("00002b07-0000-1000-8000-00805f9b34fb");

    /**
     * Relative Runtime in a Generic Level Range (Characteristic UUID: 0x2b08)
     */
    public static final UUID RELATIVE_RUNTIME_IN_A_GENERIC_LEVEL_RANGE_CHARACTERISTIC = UUID.fromString("00002b08-0000-1000-8000-00805f9b34fb");

    /**
     * Relative Value in a Voltage Range (Characteristic UUID: 0x2b09)
     */
    public static final UUID RELATIVE_VALUE_IN_A_VOLTAGE_RANGE_CHARACTERISTIC = UUID.fromString("00002b09-0000-1000-8000-00805f9b34fb");

    /**
     * Relative Value in an Illuminance Range (Characteristic UUID: 0x2b0a)
     */
    public static final UUID RELATIVE_VALUE_IN_AN_ILLUMINANCE_RANGE_CHARACTERISTIC = UUID.fromString("00002b0a-0000-1000-8000-00805f9b34fb");

    /**
     * Relative Value in a Period of Day (Characteristic UUID: 0x2b0b)
     */
    public static final UUID RELATIVE_VALUE_IN_A_PERIOD_OF_DAY_CHARACTERISTIC = UUID.fromString("00002b0b-0000-1000-8000-00805f9b34fb");

    /**
     * Relative Value in a Temperature Range (Characteristic UUID: 0x2b0c)
     */
    public static final UUID RELATIVE_VALUE_IN_A_TEMPERATURE_RANGE_CHARACTERISTIC = UUID.fromString("00002b0c-0000-1000-8000-00805f9b34fb");

    /**
     * Temperature 8 (Characteristic UUID: 0x2b0d)
     */
    public static final UUID TEMPERATURE_8_CHARACTERISTIC = UUID.fromString("00002b0d-0000-1000-8000-00805f9b34fb");

    /**
     * Temperature 8 in a Period of Day (Characteristic UUID: 0x2b0e)
     */
    public static final UUID TEMPERATURE_8_IN_A_PERIOD_OF_DAY_CHARACTERISTIC = UUID.fromString("00002b0e-0000-1000-8000-00805f9b34fb");

    /**
     * Temperature 8 Statistics (Characteristic UUID: 0x2b0f)
     */
    public static final UUID TEMPERATURE_8_STATISTICS_CHARACTERISTIC = UUID.fromString("00002b0f-0000-1000-8000-00805f9b34fb");

    /**
     * Temperature Range (Characteristic UUID: 0x2b10)
     */
    public static final UUID TEMPERATURE_RANGE_CHARACTERISTIC = UUID.fromString("00002b10-0000-1000-8000-00805f9b34fb");

    /**
     * Temperature Statistics (Characteristic UUID: 0x2b11)
     */
    public static final UUID TEMPERATURE_STATISTICS_CHARACTERISTIC = UUID.fromString("00002b11-0000-1000-8000-00805f9b34fb");

    /**
     * Time Decihour 8 (Characteristic UUID: 0x2b12)
     */
    public static final UUID TIME_DECIHOUR_8_CHARACTERISTIC = UUID.fromString("00002b12-0000-1000-8000-00805f9b34fb");

    /**
     * Time Exponential 8 (Characteristic UUID: 0x2b13)
     */
    public static final UUID TIME_EXPONENTIAL_8_CHARACTERISTIC = UUID.fromString("00002b13-0000-1000-8000-00805f9b34fb");

    /**
     * Time Hour 24 (Characteristic UUID: 0x2b14)
     */
    public static final UUID TIME_HOUR_24_CHARACTERISTIC = UUID.fromString("00002b14-0000-1000-8000-00805f9b34fb");

    /**
     * Time Millisecond 24 (Characteristic UUID: 0x2b15)
     */
    public static final UUID TIME_MILLISECOND_24_CHARACTERISTIC = UUID.fromString("00002b15-0000-1000-8000-00805f9b34fb");

    /**
     * Time Second 16 (Characteristic UUID: 0x2b16)
     */
    public static final UUID TIME_SECOND_16_CHARACTERISTIC = UUID.fromString("00002b16-0000-1000-8000-00805f9b34fb");

    /**
     * Time Second 8 (Characteristic UUID: 0x2b17)
     */
    public static final UUID TIME_SECOND_8_CHARACTERISTIC = UUID.fromString("00002b17-0000-1000-8000-00805f9b34fb");

    /**
     * Voltage (Characteristic UUID: 0x2b18)
     */
    public static final UUID VOLTAGE_CHARACTERISTIC = UUID.fromString("00002b18-0000-1000-8000-00805f9b34fb");

    /**
     * Voltage Specification (Characteristic UUID: 0x2b19)
     */
    public static final UUID VOLTAGE_SPECIFICATION_CHARACTERISTIC = UUID.fromString("00002b19-0000-1000-8000-00805f9b34fb");

    /**
     * Voltage Statistics (Characteristic UUID: 0x2b1a)
     */
    public static final UUID VOLTAGE_STATISTICS_CHARACTERISTIC = UUID.fromString("00002b1a-0000-1000-8000-00805f9b34fb");

    /**
     * Volume Flow (Characteristic UUID: 0x2b1b)
     */
    public static final UUID VOLUME_FLOW_CHARACTERISTIC = UUID.fromString("00002b1b-0000-1000-8000-00805f9b34fb");

    /**
     * Chromaticity Coordinate (Characteristic UUID: 0x2b1c)
     */
    public static final UUID CHROMATICITY_COORDINATE_CHARACTERISTIC = UUID.fromString("00002b1c-0000-1000-8000-00805f9b34fb");

    /**
     * RC Feature (Characteristic UUID: 0x2b1d)
     */
    public static final UUID RC_FEATURE_CHARACTERISTIC = UUID.fromString("00002b1d-0000-1000-8000-00805f9b34fb");

    /**
     * RC Settings (Characteristic UUID: 0x2b1e)
     */
    public static final UUID RC_SETTINGS_CHARACTERISTIC = UUID.fromString("00002b1e-0000-1000-8000-00805f9b34fb");

    /**
     * Reconnection Configuration Control Point (Characteristic UUID: 0x2b1f)
     */
    public static final UUID RECONNECTION_CONFIGURATION_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b1f-0000-1000-8000-00805f9b34fb");

    /**
     * IDD Status Changed (Characteristic UUID: 0x2b20)
     */
    public static final UUID IDD_STATUS_CHANGED_CHARACTERISTIC = UUID.fromString("00002b20-0000-1000-8000-00805f9b34fb");

    /**
     * IDD Status (Characteristic UUID: 0x2b21)
     */
    public static final UUID IDD_STATUS_CHARACTERISTIC = UUID.fromString("00002b21-0000-1000-8000-00805f9b34fb");

    /**
     * IDD Annunciation Status (Characteristic UUID: 0x2b22)
     */
    public static final UUID IDD_ANNUNCIATION_STATUS_CHARACTERISTIC = UUID.fromString("00002b22-0000-1000-8000-00805f9b34fb");

    /**
     * IDD Features (Characteristic UUID: 0x2b23)
     */
    public static final UUID IDD_FEATURES_CHARACTERISTIC = UUID.fromString("00002b23-0000-1000-8000-00805f9b34fb");

    /**
     * IDD Status Reader Control Point (Characteristic UUID: 0x2b24)
     */
    public static final UUID IDD_STATUS_READER_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b24-0000-1000-8000-00805f9b34fb");

    /**
     * IDD Command Control Point (Characteristic UUID: 0x2b25)
     */
    public static final UUID IDD_COMMAND_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b25-0000-1000-8000-00805f9b34fb");

    /**
     * IDD Command Data (Characteristic UUID: 0x2b26)
     */
    public static final UUID IDD_COMMAND_DATA_CHARACTERISTIC = UUID.fromString("00002b26-0000-1000-8000-00805f9b34fb");

    /**
     * IDD Record Access Control Point (Characteristic UUID: 0x2b27)
     */
    public static final UUID IDD_RECORD_ACCESS_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b27-0000-1000-8000-00805f9b34fb");

    /**
     * IDD History Data (Characteristic UUID: 0x2b28)
     */
    public static final UUID IDD_HISTORY_DATA_CHARACTERISTIC = UUID.fromString("00002b28-0000-1000-8000-00805f9b34fb");

    /**
     * Client Supported Features (Characteristic UUID: 0x2b29)
     */
    public static final UUID CLIENT_SUPPORTED_FEATURES_CHARACTERISTIC = UUID.fromString("00002b29-0000-1000-8000-00805f9b34fb");

    /**
     * Database Hash (Characteristic UUID: 0x2b2a)
     */
    public static final UUID DATABASE_HASH_CHARACTERISTIC = UUID.fromString("00002b2a-0000-1000-8000-00805f9b34fb");

    /**
     * BSS Control Point (Characteristic UUID: 0x2b2b)
     */
    public static final UUID BSS_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b2b-0000-1000-8000-00805f9b34fb");

    /**
     * BSS Response (Characteristic UUID: 0x2b2c)
     */
    public static final UUID BSS_RESPONSE_CHARACTERISTIC = UUID.fromString("00002b2c-0000-1000-8000-00805f9b34fb");

    /**
     * Emergency ID (Characteristic UUID: 0x2b2d)
     */
    public static final UUID EMERGENCY_ID_CHARACTERISTIC = UUID.fromString("00002b2d-0000-1000-8000-00805f9b34fb");

    /**
     * Emergency Text (Characteristic UUID: 0x2b2e)
     */
    public static final UUID EMERGENCY_TEXT_CHARACTERISTIC = UUID.fromString("00002b2e-0000-1000-8000-00805f9b34fb");

    /**
     * ACS Status (Characteristic UUID: 0x2b2f)
     */
    public static final UUID ACS_STATUS_CHARACTERISTIC = UUID.fromString("00002b2f-0000-1000-8000-00805f9b34fb");

    /**
     * ACS Data In (Characteristic UUID: 0x2b30)
     */
    public static final UUID ACS_DATA_IN_CHARACTERISTIC = UUID.fromString("00002b30-0000-1000-8000-00805f9b34fb");

    /**
     * ACS Data Out Notify (Characteristic UUID: 0x2b31)
     */
    public static final UUID A_C_S_DATA_OUT_NOTIFY_CHARACTERISTIC = UUID.fromString("00002b31-0000-1000-8000-00805f9b34fb");

    /**
     * ACS Data Out Indicate (Characteristic UUID: 0x2b32)
     */
    public static final UUID ACS_DATA_OUT_INDICATE_CHARACTERISTIC = UUID.fromString("00002b32-0000-1000-8000-00805f9b34fb");

    /**
     * ACS Control Point (Characteristic UUID: 0x2b33)
     */
    public static final UUID ACS_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b33-0000-1000-8000-00805f9b34fb");

    /**
     * Enhanced Blood Pressure Measurement (Characteristic UUID: 0x2b34)
     */
    public static final UUID ENHANCED_BLOOD_PRESSURE_MEASUREMENT_CHARACTERISTIC = UUID.fromString("00002b34-0000-1000-8000-00805f9b34fb");

    /**
     * Enhanced Intermediate Cuff Pressure (Characteristic UUID: 0x2b35)
     */
    public static final UUID ENHANCED_INTERMEDIATE_CUFF_PRESSURE_CHARACTERISTIC = UUID.fromString("00002b35-0000-1000-8000-00805f9b34fb");

    /**
     * Blood Pressure Record (Characteristic UUID: 0x2b36)
     */
    public static final UUID BLOOD_PRESSURE_RECORD_CHARACTERISTIC = UUID.fromString("00002b36-0000-1000-8000-00805f9b34fb");

    /**
     * Registered User (Characteristic UUID: 0x2b37)
     */
    public static final UUID REGISTERED_USER_CHARACTERISTIC = UUID.fromString("00002b37-0000-1000-8000-00805f9b34fb");

    /**
     * BR-EDR Handover Data (Characteristic UUID: 0x2b38)
     */
    public static final UUID BR_EDR_HANDOVER_DATA_CHARACTERISTIC = UUID.fromString("00002b38-0000-1000-8000-00805f9b34fb");

    /**
     * Bluetooth SIG Data (Characteristic UUID: 0x2b39)
     */
    public static final UUID BLUETOOTH_SIG_DATA_CHARACTERISTIC = UUID.fromString("00002b39-0000-1000-8000-00805f9b34fb");

    /**
     * Server Supported Features (Characteristic UUID: 0x2b3a)
     */
    public static final UUID SERVER_SUPPORTED_FEATURES_CHARACTERISTIC = UUID.fromString("00002b3a-0000-1000-8000-00805f9b34fb");

    /**
     * Physical Activity Monitor Features (Characteristic UUID: 0x2b3b)
     */
    public static final UUID PHYSICAL_ACTIVITY_MONITOR_FEATURES_CHARACTERISTIC = UUID.fromString("00002b3b-0000-1000-8000-00805f9b34fb");

    /**
     * General Activity Instantaneous Data (Characteristic UUID: 0x2b3c)
     */
    public static final UUID GENERAL_ACTIVITY_INSTANTANEOUS_DATA_CHARACTERISTIC = UUID.fromString("00002b3c-0000-1000-8000-00805f9b34fb");

    /**
     * General Activity Summary Data (Characteristic UUID: 0x2b3d)
     */
    public static final UUID GENERAL_ACTIVITY_SUMMARY_DATA_CHARACTERISTIC = UUID.fromString("00002b3d-0000-1000-8000-00805f9b34fb");

    /**
     * CardioRespiratory Activity Instantaneous Data (Characteristic UUID: 0x2b3e)
     */
    public static final UUID CARDIO_RESPIRATORY_ACTIVITY_INSTANTANEOUS_DATA_CHARACTERISTIC = UUID.fromString("00002b3e-0000-1000-8000-00805f9b34fb");

    /**
     * CardioRespiratory Activity Summary Data (Characteristic UUID: 0x2b3f)
     */
    public static final UUID CARDIO_RESPIRATORY_ACTIVITY_SUMMARY_DATA_CHARACTERISTIC = UUID.fromString("00002b3f-0000-1000-8000-00805f9b34fb");

    /**
     * Step Counter Activity Summary Data (Characteristic UUID: 0x2b40)
     */
    public static final UUID STEP_COUNTER_ACTIVITY_SUMMARY_DATA_CHARACTERISTIC = UUID.fromString("00002b40-0000-1000-8000-00805f9b34fb");

    /**
     * Sleep Activity Instantaneous Data (Characteristic UUID: 0x2b41)
     */
    public static final UUID SLEEP_ACTIVITY_INSTANTANEOUS_DATA_CHARACTERISTIC = UUID.fromString("00002b41-0000-1000-8000-00805f9b34fb");

    /**
     * Sleep Activity Summary Data (Characteristic UUID: 0x2b42)
     */
    public static final UUID SLEEP_ACTIVITY_SUMMARY_DATA_CHARACTERISTIC = UUID.fromString("00002b42-0000-1000-8000-00805f9b34fb");

    /**
     * Physical Activity Monitor Control Point (Characteristic UUID: 0x2b43)
     */
    public static final UUID PHYSICAL_ACTIVITY_MONITOR_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b43-0000-1000-8000-00805f9b34fb");

    /**
     * Activity Current Session (Characteristic UUID: 0x2b44)
     */
    public static final UUID ACTIVITY_CURRENT_SESSION_CHARACTERISTIC = UUID.fromString("00002b44-0000-1000-8000-00805f9b34fb");

    /**
     * Physical Activity Session Descriptor (Characteristic UUID: 0x2b45)
     */
    public static final UUID PHYSICAL_ACTIVITY_SESSION_DESCRIPTOR_CHARACTERISTIC = UUID.fromString("00002b45-0000-1000-8000-00805f9b34fb");

    /**
     * Preferred Units (Characteristic UUID: 0x2b46)
     */
    public static final UUID PREFERRED_UNITS_CHARACTERISTIC = UUID.fromString("00002b46-0000-1000-8000-00805f9b34fb");

    /**
     * High Resolution Height (Characteristic UUID: 0x2b47)
     */
    public static final UUID HIGH_RESOLUTION_HEIGHT_CHARACTERISTIC = UUID.fromString("00002b47-0000-1000-8000-00805f9b34fb");

    /**
     * Middle Name (Characteristic UUID: 0x2b48)
     */
    public static final UUID MIDDLE_NAME_CHARACTERISTIC = UUID.fromString("00002b48-0000-1000-8000-00805f9b34fb");

    /**
     * Stride Length (Characteristic UUID: 0x2b49)
     */
    public static final UUID STRIDE_LENGTH_CHARACTERISTIC = UUID.fromString("00002b49-0000-1000-8000-00805f9b34fb");

    /**
     * Handedness (Characteristic UUID: 0x2b4a)
     */
    public static final UUID HANDEDNESS_CHARACTERISTIC = UUID.fromString("00002b4a-0000-1000-8000-00805f9b34fb");

    /**
     * Device Wearing Position (Characteristic UUID: 0x2b4b)
     */
    public static final UUID DEVICE_WEARING_POSITION_CHARACTERISTIC = UUID.fromString("00002b4b-0000-1000-8000-00805f9b34fb");

    /**
     * Four Zone Heart Rate Limits (Characteristic UUID: 0x2b4c)
     */
    public static final UUID FOUR_ZONE_HEART_RATE_LIMITS_CHARACTERISTIC = UUID.fromString("00002b4c-0000-1000-8000-00805f9b34fb");

    /**
     * High Intensity Exercise Threshold (Characteristic UUID: 0x2b4d)
     */
    public static final UUID HIGH_INTENSITY_EXERCISE_THRESHOLD_CHARACTERISTIC = UUID.fromString("00002b4d-0000-1000-8000-00805f9b34fb");

    /**
     * Activity Goal (Characteristic UUID: 0x2b4e)
     */
    public static final UUID ACTIVITY_GOAL_CHARACTERISTIC = UUID.fromString("00002b4e-0000-1000-8000-00805f9b34fb");

    /**
     * Sedentary Interval Notification (Characteristic UUID: 0x2b4f)
     */
    public static final UUID SEDENTARY_INTERVAL_NOTIFICATION_CHARACTERISTIC = UUID.fromString("00002b4f-0000-1000-8000-00805f9b34fb");

    /**
     * Caloric Intake (Characteristic UUID: 0x2b50)
     */
    public static final UUID CALORIC_INTAKE_CHARACTERISTIC = UUID.fromString("00002b50-0000-1000-8000-00805f9b34fb");

    /**
     * TMAP Role (Characteristic UUID: 0x2b51)
     */
    public static final UUID TMAP_ROLE_CHARACTERISTIC = UUID.fromString("00002b51-0000-1000-8000-00805f9b34fb");

    /**
     * Audio Input State (Characteristic UUID: 0x2b77)
     */
    public static final UUID AUDIO_INPUT_STATE_CHARACTERISTIC = UUID.fromString("00002b77-0000-1000-8000-00805f9b34fb");

    /**
     * Gain Settings Attribute (Characteristic UUID: 0x2b78)
     */
    public static final UUID GAIN_SETTINGS_ATTRIBUTE_CHARACTERISTIC = UUID.fromString("00002b78-0000-1000-8000-00805f9b34fb");

    /**
     * Audio Input Type (Characteristic UUID: 0x2b79)
     */
    public static final UUID AUDIO_INPUT_TYPE_CHARACTERISTIC = UUID.fromString("00002b79-0000-1000-8000-00805f9b34fb");

    /**
     * Audio Input Status (Characteristic UUID: 0x2b7a)
     */
    public static final UUID AUDIO_INPUT_STATUS_CHARACTERISTIC = UUID.fromString("00002b7a-0000-1000-8000-00805f9b34fb");

    /**
     * Audio Input Control Point (Characteristic UUID: 0x2b7b)
     */
    public static final UUID AUDIO_INPUT_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b7b-0000-1000-8000-00805f9b34fb");

    /**
     * Audio Input Description (Characteristic UUID: 0x2b7c)
     */
    public static final UUID AUDIO_INPUT_DESCRIPTION_CHARACTERISTIC = UUID.fromString("00002b7c-0000-1000-8000-00805f9b34fb");

    /**
     * Volume State (Characteristic UUID: 0x2b7d)
     */
    public static final UUID VOLUME_STATE_CHARACTERISTIC = UUID.fromString("00002b7d-0000-1000-8000-00805f9b34fb");

    /**
     * Volume Control Point (Characteristic UUID: 0x2b7e)
     */
    public static final UUID VOLUME_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b7e-0000-1000-8000-00805f9b34fb");

    /**
     * Volume Flags (Characteristic UUID: 0x2b7f)
     */
    public static final UUID VOLUME_FLAGS_CHARACTERISTIC = UUID.fromString("00002b7f-0000-1000-8000-00805f9b34fb");

    /**
     * Volume Offset State (Characteristic UUID: 0x2b80)
     */
    public static final UUID VOLUME_OFFSET_STATE_CHARACTERISTIC = UUID.fromString("00002b80-0000-1000-8000-00805f9b34fb");

    /**
     * Audio Location (Characteristic UUID: 0x2b81)
     */
    public static final UUID AUDIO_LOCATION_CHARACTERISTIC = UUID.fromString("00002b81-0000-1000-8000-00805f9b34fb");

    /**
     * Volume Offset Control Point (Characteristic UUID: 0x2b82)
     */
    public static final UUID VOLUME_OFFSET_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b82-0000-1000-8000-00805f9b34fb");

    /**
     * Audio Output Description (Characteristic UUID: 0x2b83)
     */
    public static final UUID AUDIO_OUTPUT_DESCRIPTION_CHARACTERISTIC = UUID.fromString("00002b83-0000-1000-8000-00805f9b34fb");

    /**
     * Set Identity Resolving Key (Characteristic UUID: 0x2b84)
     */
    public static final UUID SET_IDENTITY_RESOLVING_KEY_CHARACTERISTIC = UUID.fromString("00002b84-0000-1000-8000-00805f9b34fb");

    /**
     * Coordinated Set Size (Characteristic UUID: 0x2b85)
     */
    public static final UUID COORDINATED_SET_SIZE_CHARACTERISTIC = UUID.fromString("00002b85-0000-1000-8000-00805f9b34fb");

    /**
     * Set Member Lock (Characteristic UUID: 0x2b86)
     */
    public static final UUID SET_MEMBER_LOCK_CHARACTERISTIC = UUID.fromString("00002b86-0000-1000-8000-00805f9b34fb");

    /**
     * Set Member Rank (Characteristic UUID: 0x2b87)
     */
    public static final UUID SET_MEMBER_RANK_CHARACTERISTIC = UUID.fromString("00002b87-0000-1000-8000-00805f9b34fb");

    /**
     * Encrypted Data Key Material (Characteristic UUID: 0x2b88)
     */
    public static final UUID ENCRYPTED_DATA_KEY_MATERIAL_CHARACTERISTIC = UUID.fromString("00002b88-0000-1000-8000-00805f9b34fb");

    /**
     * Apparent Energy 32 (Characteristic UUID: 0x2b89)
     */
    public static final UUID APPARENT_ENERGY_32_CHARACTERISTIC = UUID.fromString("00002b89-0000-1000-8000-00805f9b34fb");

    /**
     * Apparent Power (Characteristic UUID: 0x2b8a)
     */
    public static final UUID APPARENT_POWER_CHARACTERISTIC = UUID.fromString("00002b8a-0000-1000-8000-00805f9b34fb");

    /**
     * CO2 Concentration (Characteristic UUID: 0x2b8c)
     */
    public static final UUID CO2_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002b8c-0000-1000-8000-00805f9b34fb");

    /**
     * Cosine of the Angle (Characteristic UUID: 0x2b8d)
     */
    public static final UUID COSINE_OF_THE_ANGLE_CHARACTERISTIC = UUID.fromString("00002b8d-0000-1000-8000-00805f9b34fb");

    /**
     * Device Time Feature (Characteristic UUID: 0x2b8e)
     */
    public static final UUID DEVICE_TIME_FEATURE_CHARACTERISTIC = UUID.fromString("00002b8e-0000-1000-8000-00805f9b34fb");

    /**
     * Device Time Parameters (Characteristic UUID: 0x2b8f)
     */
    public static final UUID DEVICE_TIME_PARAMETERS_CHARACTERISTIC = UUID.fromString("00002b8f-0000-1000-8000-00805f9b34fb");

    /**
     * Device Time (Characteristic UUID: 0x2b90)
     */
    public static final UUID DEVICE_TIME_CHARACTERISTIC = UUID.fromString("00002b90-0000-1000-8000-00805f9b34fb");

    /**
     * Device Time Control Point (Characteristic UUID: 0x2b91)
     */
    public static final UUID DEVICE_TIME_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002b91-0000-1000-8000-00805f9b34fb");

    /**
     * Time Change Log Data (Characteristic UUID: 0x2b92)
     */
    public static final UUID TIME_CHANGE_LOG_DATA_CHARACTERISTIC = UUID.fromString("00002b92-0000-1000-8000-00805f9b34fb");

    /**
     * Media Player Name (Characteristic UUID: 0x2b93)
     */
    public static final UUID MEDIA_PLAYER_NAME_CHARACTERISTIC = UUID.fromString("00002b93-0000-1000-8000-00805f9b34fb");

    /**
     * Media Player Icon Object ID (Characteristic UUID: 0x2b94)
     */
    public static final UUID MEDIA_PLAYER_ICON_OBJECT_ID_CHARACTERISTIC = UUID.fromString("00002b94-0000-1000-8000-00805f9b34fb");

    /**
     * Media Player Icon URL (Characteristic UUID: 0x2b95)
     */
    public static final UUID MEDIA_PLAYER_ICON_URL_CHARACTERISTIC = UUID.fromString("00002b95-0000-1000-8000-00805f9b34fb");

    /**
     * Track Changed (Characteristic UUID: 0x2b96)
     */
    public static final UUID TRACK_CHANGED_CHARACTERISTIC = UUID.fromString("00002b96-0000-1000-8000-00805f9b34fb");

    /**
     * Track Title (Characteristic UUID: 0x2b97)
     */
    public static final UUID TRACK_TITLE_CHARACTERISTIC = UUID.fromString("00002b97-0000-1000-8000-00805f9b34fb");

    /**
     * Track Duration (Characteristic UUID: 0x2b98)
     */
    public static final UUID TRACK_DURATION_CHARACTERISTIC = UUID.fromString("00002b98-0000-1000-8000-00805f9b34fb");

    /**
     * Track Position (Characteristic UUID: 0x2b99)
     */
    public static final UUID TRACK_POSITION_CHARACTERISTIC = UUID.fromString("00002b99-0000-1000-8000-00805f9b34fb");

    /**
     * Playback Speed (Characteristic UUID: 0x2b9a)
     */
    public static final UUID PLAYBACK_SPEED_CHARACTERISTIC = UUID.fromString("00002b9a-0000-1000-8000-00805f9b34fb");

    /**
     * Seeking Speed (Characteristic UUID: 0x2b9b)
     */
    public static final UUID SEEKING_SPEED_CHARACTERISTIC = UUID.fromString("00002b9b-0000-1000-8000-00805f9b34fb");

    /**
     * Current Track Segments Object ID (Characteristic UUID: 0x2b9c)
     */
    public static final UUID CURRENT_TRACK_SEGMENTS_OBJECT_ID_CHARACTERISTIC = UUID.fromString("00002b9c-0000-1000-8000-00805f9b34fb");

    /**
     * Current Track Object ID (Characteristic UUID: 0x2b9d)
     */
    public static final UUID CURRENT_TRACK_OBJECT_ID_CHARACTERISTIC = UUID.fromString("00002b9d-0000-1000-8000-00805f9b34fb");

    /**
     * Next Track Object ID (Characteristic UUID: 0x2b9e)
     */
    public static final UUID NEXT_TRACK_OBJECT_ID_CHARACTERISTIC = UUID.fromString("00002b9e-0000-1000-8000-00805f9b34fb");

    /**
     * Parent Group Object ID (Characteristic UUID: 0x2b9f)
     */
    public static final UUID PARENT_GROUP_OBJECT_ID_CHARACTERISTIC = UUID.fromString("00002b9f-0000-1000-8000-00805f9b34fb");

    /**
     * Current Group Object ID (Characteristic UUID: 0x2ba0)
     */
    public static final UUID CURRENT_GROUP_OBJECT_ID_CHARACTERISTIC = UUID.fromString("00002ba0-0000-1000-8000-00805f9b34fb");

    /**
     * Playing Order (Characteristic UUID: 0x2ba1)
     */
    public static final UUID PLAYING_ORDER_CHARACTERISTIC = UUID.fromString("00002ba1-0000-1000-8000-00805f9b34fb");

    /**
     * Playing Orders Supported (Characteristic UUID: 0x2ba2)
     */
    public static final UUID PLAYING_ORDERS_SUPPORTED_CHARACTERISTIC = UUID.fromString("00002ba2-0000-1000-8000-00805f9b34fb");

    /**
     * Media State (Characteristic UUID: 0x2ba3)
     */
    public static final UUID MEDIA_STATE_CHARACTERISTIC = UUID.fromString("00002ba3-0000-1000-8000-00805f9b34fb");

    /**
     * Media Control Point (Characteristic UUID: 0x2ba4)
     */
    public static final UUID MEDIA_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002ba4-0000-1000-8000-00805f9b34fb");

    /**
     * Media Control Point Opcodes Supported (Characteristic UUID: 0x2ba5)
     */
    public static final UUID MEDIA_CONTROL_POINT_OPCODES_SUPPORTED_CHARACTERISTIC = UUID.fromString("00002ba5-0000-1000-8000-00805f9b34fb");

    /**
     * Search Results Object ID (Characteristic UUID: 0x2ba6)
     */
    public static final UUID SEARCH_RESULTS_OBJECT_ID_CHARACTERISTIC = UUID.fromString("00002ba6-0000-1000-8000-00805f9b34fb");

    /**
     * Search Control Point (Characteristic UUID: 0x2ba7)
     */
    public static final UUID SEARCH_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002ba7-0000-1000-8000-00805f9b34fb");

    /**
     * Energy 32 (Characteristic UUID: 0x2ba8)
     */
    public static final UUID ENERGY_32_CHARACTERISTIC = UUID.fromString("00002ba8-0000-1000-8000-00805f9b34fb");

    /**
     * Media Player Icon Object Type (Characteristic UUID: 0x2ba9)
     */
    public static final UUID MEDIA_PLAYER_ICON_OBJECT_TYPE_CHARACTERISTIC = UUID.fromString("00002ba9-0000-1000-8000-00805f9b34fb");

    /**
     * Track Segments Object Type (Characteristic UUID: 0x2baa)
     */
    public static final UUID TRACK_SEGMENTS_OBJECT_TYPE_CHARACTERISTIC = UUID.fromString("00002baa-0000-1000-8000-00805f9b34fb");

    /**
     * Track Object Type (Characteristic UUID: 0x2bab)
     */
    public static final UUID TRACK_OBJECT_TYPE_CHARACTERISTIC = UUID.fromString("00002bab-0000-1000-8000-00805f9b34fb");

    /**
     * Group Object Type (Characteristic UUID: 0x2bac)
     */
    public static final UUID GROUP_OBJECT_TYPE_CHARACTERISTIC = UUID.fromString("00002bac-0000-1000-8000-00805f9b34fb");

    /**
     * Constant Tone Extension Enable (Characteristic UUID: 0x2bad)
     */
    public static final UUID CONSTANT_TONE_EXTENSION_ENABLE_CHARACTERISTIC = UUID.fromString("00002bad-0000-1000-8000-00805f9b34fb");

    /**
     * Advertising Constant Tone Extension Minimum Length (Characteristic UUID: 0x2bae)
     */
    public static final UUID ADVERTISING_CONSTANT_TONE_EXTENSION_MINIMUM_LENGTH_CHARACTERISTIC = UUID.fromString("00002bae-0000-1000-8000-00805f9b34fb");

    /**
     * Advertising Constant Tone Extension Minimum Transmit Count (Characteristic UUID: 0x2baf)
     */
    public static final UUID ADVERTISING_CONSTANT_TONE_EXTENSION_MINIMUM_TRANSMIT_COUNT_CHARACTERISTIC = UUID.fromString("00002baf-0000-1000-8000-00805f9b34fb");

    /**
     * Advertising Constant Tone Extension Transmit Duration (Characteristic UUID: 0x2bb0)
     */
    public static final UUID ADVERTISING_CONSTANT_TONE_EXTENSION_TRANSMIT_DURATION_CHARACTERISTIC = UUID.fromString("00002bb0-0000-1000-8000-00805f9b34fb");

    /**
     * Advertising Constant Tone Extension Interval (Characteristic UUID: 0x2bb1)
     */
    public static final UUID ADVERTISING_CONSTANT_TONE_EXTENSION_INTERVAL_CHARACTERISTIC = UUID.fromString("00002bb1-0000-1000-8000-00805f9b34fb");

    /**
     * Advertising Constant Tone Extension PHY (Characteristic UUID: 0x2bb2)
     */
    public static final UUID ADVERTISING_CONSTANT_TONE_EXTENSION_PHY_CHARACTERISTIC = UUID.fromString("00002bb2-0000-1000-8000-00805f9b34fb");

    /**
     * Bearer Provider Name (Characteristic UUID: 0x2bb3)
     */
    public static final UUID BEARER_PROVIDER_NAME_CHARACTERISTIC = UUID.fromString("00002bb3-0000-1000-8000-00805f9b34fb");

    /**
     * Bearer UCI (Characteristic UUID: 0x2bb4)
     */
    public static final UUID BEARER_UCI_CHARACTERISTIC = UUID.fromString("00002bb4-0000-1000-8000-00805f9b34fb");

    /**
     * Bearer Technology (Characteristic UUID: 0x2bb5)
     */
    public static final UUID BEARER_TECHNOLOGY_CHARACTERISTIC = UUID.fromString("00002bb5-0000-1000-8000-00805f9b34fb");

    /**
     * Bearer URI Schemes Supported List (Characteristic UUID: 0x2bb6)
     */
    public static final UUID BEARER_URI_SCHEMES_SUPPORTED_LIST_CHARACTERISTIC = UUID.fromString("00002bb6-0000-1000-8000-00805f9b34fb");

    /**
     * Bearer Signal Strength (Characteristic UUID: 0x2bb7)
     */
    public static final UUID BEARER_SIGNAL_STRENGTH_CHARACTERISTIC = UUID.fromString("00002bb7-0000-1000-8000-00805f9b34fb");

    /**
     * Bearer Signal Strength Reporting Interval (Characteristic UUID: 0x2bb8)
     */
    public static final UUID BEARER_SIGNAL_STRENGTH_REPORTING_INTERVAL_CHARACTERISTIC = UUID.fromString("00002bb8-0000-1000-8000-00805f9b34fb");

    /**
     * Bearer List Current Calls (Characteristic UUID: 0x2bb9)
     */
    public static final UUID BEARER_LIST_CURRENT_CALLS_CHARACTERISTIC = UUID.fromString("00002bb9-0000-1000-8000-00805f9b34fb");

    /**
     * Content Control ID (Characteristic UUID: 0x2bba)
     */
    public static final UUID CONTENT_CONTROL_ID_CHARACTERISTIC = UUID.fromString("00002bba-0000-1000-8000-00805f9b34fb");

    /**
     * Status Flags (Characteristic UUID: 0x2bbb)
     */
    public static final UUID STATUS_FLAGS_CHARACTERISTIC = UUID.fromString("00002bbb-0000-1000-8000-00805f9b34fb");

    /**
     * Incoming Call Target Bearer URI (Characteristic UUID: 0x2bbc)
     */
    public static final UUID INCOMING_CALL_TARGET_BEARER_URI_CHARACTERISTIC = UUID.fromString("00002bbc-0000-1000-8000-00805f9b34fb");

    /**
     * Call State (Characteristic UUID: 0x2bbd)
     */
    public static final UUID CALL_STATE_CHARACTERISTIC = UUID.fromString("00002bbd-0000-1000-8000-00805f9b34fb");

    /**
     * Call Control Point (Characteristic UUID: 0x2bbe)
     */
    public static final UUID CALL_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002bbe-0000-1000-8000-00805f9b34fb");

    /**
     * Call Control Point Optional Opcodes (Characteristic UUID: 0x2bbf)
     */
    public static final UUID CALL_CONTROL_POINT_OPTIONAL_OPCODES_CHARACTERISTIC = UUID.fromString("00002bbf-0000-1000-8000-00805f9b34fb");

    /**
     * Termination Reason (Characteristic UUID: 0x2bc0)
     */
    public static final UUID TERMINATION_REASON_CHARACTERISTIC = UUID.fromString("00002bc0-0000-1000-8000-00805f9b34fb");

    /**
     * Incoming Call (Characteristic UUID: 0x2bc1)
     */
    public static final UUID INCOMING_CALL_CHARACTERISTIC = UUID.fromString("00002bc1-0000-1000-8000-00805f9b34fb");

    /**
     * Call Friendly Name (Characteristic UUID: 0x2bc2)
     */
    public static final UUID CALL_FRIENDLY_NAME_CHARACTERISTIC = UUID.fromString("00002bc2-0000-1000-8000-00805f9b34fb");

    /**
     * Mute (Characteristic UUID: 0x2bc3)
     */
    public static final UUID MUTE_CHARACTERISTIC = UUID.fromString("00002bc3-0000-1000-8000-00805f9b34fb");

    /**
     * Sink ASE (Characteristic UUID: 0x2bc4)
     */
    public static final UUID SINK_ASE_CHARACTERISTIC = UUID.fromString("00002bc4-0000-1000-8000-00805f9b34fb");

    /**
     * Source ASE (Characteristic UUID: 0x2bc5)
     */
    public static final UUID SOURCE_ASE_CHARACTERISTIC = UUID.fromString("00002bc5-0000-1000-8000-00805f9b34fb");

    /**
     * ASE Control Point (Characteristic UUID: 0x2bc6)
     */
    public static final UUID ASE_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002bc6-0000-1000-8000-00805f9b34fb");

    /**
     * Broadcast Audio Scan Control Point (Characteristic UUID: 0x2bc7)
     */
    public static final UUID BROADCAST_AUDIO_SCAN_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002bc7-0000-1000-8000-00805f9b34fb");

    /**
     * Broadcast Receive State (Characteristic UUID: 0x2bc8)
     */
    public static final UUID BROADCAST_RECEIVE_STATE_CHARACTERISTIC = UUID.fromString("00002bc8-0000-1000-8000-00805f9b34fb");

    /**
     * Sink PAC (Characteristic UUID: 0x2bc9)
     */
    public static final UUID SINK_PAC_CHARACTERISTIC = UUID.fromString("00002bc9-0000-1000-8000-00805f9b34fb");

    /**
     * Sink Audio Locations (Characteristic UUID: 0x2bca)
     */
    public static final UUID SINK_AUDIO_LOCATIONS_CHARACTERISTIC = UUID.fromString("00002bca-0000-1000-8000-00805f9b34fb");

    /**
     * Source PAC (Characteristic UUID: 0x2bcb)
     */
    public static final UUID SOURCE_PAC_CHARACTERISTIC = UUID.fromString("00002bcb-0000-1000-8000-00805f9b34fb");

    /**
     * Source Audio Locations (Characteristic UUID: 0x2bcc)
     */
    public static final UUID SOURCE_AUDIO_LOCATIONS_CHARACTERISTIC = UUID.fromString("00002bcc-0000-1000-8000-00805f9b34fb");

    /**
     * Available Audio Contexts (Characteristic UUID: 0x2bcd)
     */
    public static final UUID AVAILABLE_AUDIO_CONTEXTS_CHARACTERISTIC = UUID.fromString("00002bcd-0000-1000-8000-00805f9b34fb");

    /**
     * Supported Audio Contexts (Characteristic UUID: 0x2bce)
     */
    public static final UUID SUPPORTED_AUDIO_CONTEXTS_CHARACTERISTIC = UUID.fromString("00002bce-0000-1000-8000-00805f9b34fb");

    /**
     * Ammonia Concentration (Characteristic UUID: 0x2bcf)
     */
    public static final UUID AMMONIA_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bcf-0000-1000-8000-00805f9b34fb");

    /**
     * Carbon Monoxide Concentration (Characteristic UUID: 0x2bd0)
     */
    public static final UUID CARBON_MONOXIDE_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bd0-0000-1000-8000-00805f9b34fb");

    /**
     * Methane Concentration (Characteristic UUID: 0x2bd1)
     */
    public static final UUID METHANE_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bd1-0000-1000-8000-00805f9b34fb");

    /**
     * Nitrogen Dioxide Concentration (Characteristic UUID: 0x2bd2)
     */
    public static final UUID NITROGEN_DIOXIDE_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bd2-0000-1000-8000-00805f9b34fb");

    /**
     * Non-Methane Volatile Organic Compounds Concentration (Characteristic UUID: 0x2bd3)
     */
    public static final UUID NON_METHANE_VOLATILE_ORGANIC_COMPOUNDS_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bd3-0000-1000-8000-00805f9b34fb");

    /**
     * Ozone Concentration (Characteristic UUID: 0x2bd4)
     */
    public static final UUID OZONE_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bd4-0000-1000-8000-00805f9b34fb");

    /**
     * Particulate Matter - PM1 Concentration (Characteristic UUID: 0x2bd5)
     */
    public static final UUID PARTICULATE_MATTER_PM1_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bd5-0000-1000-8000-00805f9b34fb");

    /**
     * Particulate Matter - PM2.5 Concentration (Characteristic UUID: 0x2bd6)
     */
    public static final UUID PARTICULATE_MATTER_PM25_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bd6-0000-1000-8000-00805f9b34fb");

    /**
     * Particulate Matter - PM10 Concentration (Characteristic UUID: 0x2bd7)
     */
    public static final UUID PARTICULATE_MATTER_PM10_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bd7-0000-1000-8000-00805f9b34fb");

    /**
     * Sulfur Dioxide Concentration (Characteristic UUID: 0x2bd8)
     */
    public static final UUID SULFUR_DIOXIDE_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bd8-0000-1000-8000-00805f9b34fb");

    /**
     * Sulfur Hexafluoride Concentration (Characteristic UUID: 0x2bd9)
     */
    public static final UUID SULFUR_HEXAFLUORIDE_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002bd9-0000-1000-8000-00805f9b34fb");

    /**
     * Hearing Aid Features (Characteristic UUID: 0x2bda)
     */
    public static final UUID HEARING_AID_FEATURES_CHARACTERISTIC = UUID.fromString("00002bda-0000-1000-8000-00805f9b34fb");

    /**
     * Hearing Aid Preset Control Point (Characteristic UUID: 0x2bdb)
     */
    public static final UUID HEARING_AID_PRESET_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002bdb-0000-1000-8000-00805f9b34fb");

    /**
     * Active Preset Index (Characteristic UUID: 0x2bdc)
     */
    public static final UUID ACTIVE_PRESET_INDEX_CHARACTERISTIC = UUID.fromString("00002bdc-0000-1000-8000-00805f9b34fb");

    /**
     * Fixed String 64 (Characteristic UUID: 0x2bde)
     */
    public static final UUID FIXED_STRING_64_CHARACTERISTIC = UUID.fromString("00002bde-0000-1000-8000-00805f9b34fb");

    /**
     * High Temperature (Characteristic UUID: 0x2bdf)
     */
    public static final UUID HIGH_TEMPERATURE_CHARACTERISTIC = UUID.fromString("00002bdf-0000-1000-8000-00805f9b34fb");

    /**
     * High Voltage (Characteristic UUID: 0x2be0)
     */
    public static final UUID HIGH_VOLTAGE_CHARACTERISTIC = UUID.fromString("00002be0-0000-1000-8000-00805f9b34fb");

    /**
     * Light Distribution (Characteristic UUID: 0x2be1)
     */
    public static final UUID LIGHT_DISTRIBUTION_CHARACTERISTIC = UUID.fromString("00002be1-0000-1000-8000-00805f9b34fb");

    /**
     * Light Output (Characteristic UUID: 0x2be2)
     */
    public static final UUID LIGHT_OUTPUT_CHARACTERISTIC = UUID.fromString("00002be2-0000-1000-8000-00805f9b34fb");

    /**
     * Light Source Type (Characteristic UUID: 0x2be3)
     */
    public static final UUID LIGHT_SOURCE_TYPE_CHARACTERISTIC = UUID.fromString("00002be3-0000-1000-8000-00805f9b34fb");

    /**
     * Noise (Characteristic UUID: 0x2be4)
     */
    public static final UUID NOISE_CHARACTERISTIC = UUID.fromString("00002be4-0000-1000-8000-00805f9b34fb");

    /**
     * Relative Runtime in a Correlated Color Temperature Range (Characteristic UUID: 0x2be5)
     */
    public static final UUID RELATIVE_RUNTIME_IN_A_CORRELATED_COLOR_TEMPERATURE_RANGE_CHARACTERISTIC = UUID.fromString("00002be5-0000-1000-8000-00805f9b34fb");

    /**
     * Time Second 32 (Characteristic UUID: 0x2be6)
     */
    public static final UUID TIME_SECOND_32_CHARACTERISTIC = UUID.fromString("00002be6-0000-1000-8000-00805f9b34fb");

    /**
     * VOC Concentration (Characteristic UUID: 0x2be7)
     */
    public static final UUID VOC_CONCENTRATION_CHARACTERISTIC = UUID.fromString("00002be7-0000-1000-8000-00805f9b34fb");

    /**
     * Voltage Frequency (Characteristic UUID: 0x2be8)
     */
    public static final UUID VOLTAGE_FREQUENCY_CHARACTERISTIC = UUID.fromString("00002be8-0000-1000-8000-00805f9b34fb");

    /**
     * Battery Critical Status (Characteristic UUID: 0x2be9)
     */
    public static final UUID BATTERY_CRITICAL_STATUS_CHARACTERISTIC = UUID.fromString("00002be9-0000-1000-8000-00805f9b34fb");

    /**
     * Battery Health Status (Characteristic UUID: 0x2bea)
     */
    public static final UUID BATTERY_HEALTH_STATUS_CHARACTERISTIC = UUID.fromString("00002bea-0000-1000-8000-00805f9b34fb");

    /**
     * Battery Health Information (Characteristic UUID: 0x2beb)
     */
    public static final UUID BATTERY_HEALTH_INFORMATION_CHARACTERISTIC = UUID.fromString("00002beb-0000-1000-8000-00805f9b34fb");

    /**
     * Battery Information (Characteristic UUID: 0x2bec)
     */
    public static final UUID BATTERY_INFORMATION_CHARACTERISTIC = UUID.fromString("00002bec-0000-1000-8000-00805f9b34fb");

    /**
     * Battery Level Status (Characteristic UUID: 0x2bed)
     */
    public static final UUID BATTERY_LEVEL_STATUS_CHARACTERISTIC = UUID.fromString("00002bed-0000-1000-8000-00805f9b34fb");

    /**
     * Battery Time Status (Characteristic UUID: 0x2bee)
     */
    public static final UUID BATTERY_TIME_STATUS_CHARACTERISTIC = UUID.fromString("00002bee-0000-1000-8000-00805f9b34fb");

    /**
     * Estimated Service Date (Characteristic UUID: 0x2bef)
     */
    public static final UUID ESTIMATED_SERVICE_DATE_CHARACTERISTIC = UUID.fromString("00002bef-0000-1000-8000-00805f9b34fb");

    /**
     * Battery Energy Status (Characteristic UUID: 0x2bf0)
     */
    public static final UUID BATTERY_ENERGY_STATUS_CHARACTERISTIC = UUID.fromString("00002bf0-0000-1000-8000-00805f9b34fb");

    /**
     * LE GATT Security Levels (Characteristic UUID: 0x2bf5)
     */
    public static final UUID LE_GATT_SECURITY_LEVELS_CHARACTERISTIC = UUID.fromString("00002bf5-0000-1000-8000-00805f9b34fb");

    /**
     * ESL Address (Characteristic UUID: 0x2bf6)
     */
    public static final UUID ESL_ADDRESS_CHARACTERISTIC = UUID.fromString("00002bf6-0000-1000-8000-00805f9b34fb");

    /**
     * AP Sync Key Material (Characteristic UUID: 0x2bf7)
     */
    public static final UUID AP_SYNC_KEY_MATERIAL_CHARACTERISTIC = UUID.fromString("00002bf7-0000-1000-8000-00805f9b34fb");

    /**
     * ESL Response Key Material (Characteristic UUID: 0x2bf8)
     */
    public static final UUID ESL_RESPONSE_KEY_MATERIAL_CHARACTERISTIC = UUID.fromString("00002bf8-0000-1000-8000-00805f9b34fb");

    /**
     * ESL Control Point (Characteristic UUID: 0x2bfe)
     */
    public static final UUID ESL_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002bfe-0000-1000-8000-00805f9b34fb");

    /**
     * ESL Display Information (Characteristic UUID: 0x2bfa)
     */
    public static final UUID ESL_DISPLAY_INFORMATION_CHARACTERISTIC = UUID.fromString("00002bfa-0000-1000-8000-00805f9b34fb");

    /**
     * ESL Image Information (Characteristic UUID: 0x2bfb)
     */
    public static final UUID ESL_IMAGE_INFORMATION_CHARACTERISTIC = UUID.fromString("00002bfb-0000-1000-8000-00805f9b34fb");

    /**
     * ESL Sensor Information (Characteristic UUID: 0x2bfc)
     */
    public static final UUID ESL_SENSOR_INFORMATION_CHARACTERISTIC = UUID.fromString("00002bfc-0000-1000-8000-00805f9b34fb");

    /**
     * ESL LED Information (Characteristic UUID: 0x2bfd)
     */
    public static final UUID ESL_LED_INFORMATION_CHARACTERISTIC = UUID.fromString("00002bfd-0000-1000-8000-00805f9b34fb");

    /**
     * ESL Control Point (Characteristic UUID: 0x2bfe)
     */
    public static final UUID E_S_L_CONTROL_POINT_CHARACTERISTIC = UUID.fromString("00002bfe-0000-1000-8000-00805f9b34fb");

    /**
     * Digital (Characteristic UUID: 0x2a56)
     */
    public static final UUID DIGITAL_CHARACTERISTIC = UUID.fromString("00002a56-0000-1000-8000-00805f9b34fb");

    /**
     * Analog (Characteristic UUID: 0x2a58)
     */
    public static final UUID ANALOG_CHARACTERISTIC = UUID.fromString("00002a58-0000-1000-8000-00805f9b34fb");

    /**
     * Unspecified (Characteristic UUID: 0x2aca)
     */
    public static final UUID UNSPECIFIED_CHARACTERISTIC = UUID.fromString("00002aca-0000-1000-8000-00805f9b34fb");

    /**
     * Directory Listing (Characteristic UUID: 0x2acb)
     */
    public static final UUID DIRECTORY_LISTING_CHARACTERISTIC = UUID.fromString("00002acb-0000-1000-8000-00805f9b34fb");

}