package org.im97mori.ble.constants;

import static org.im97mori.ble.constants.DescriptorUUID.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class DescriptorUUIDTest extends TestBase {

	@Test
	public void test_map_00001() {
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(CHARACTERISTIC_EXTENDED_PROPERTIES_DESCRIPTOR));
		assertEquals("Characteristic Extended Properties",
				DESCRIPTOR_MAPPING_128.get(CHARACTERISTIC_EXTENDED_PROPERTIES_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTOR));
		assertEquals("Characteristic User Description",
				DESCRIPTOR_MAPPING_128.get(CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(CLIENT_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR));
		assertEquals("Client Characteristic Configuration",
				DESCRIPTOR_MAPPING_128.get(CLIENT_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(SERVER_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR));
		assertEquals("Server Characteristic Configuration",
				DESCRIPTOR_MAPPING_128.get(SERVER_CHARACTERISTIC_CONFIGURATION_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(CHARACTERISTIC_PRESENTATION_FORMAT_DESCRIPTOR));
		assertEquals("Characteristic Presentation Format",
				DESCRIPTOR_MAPPING_128.get(CHARACTERISTIC_PRESENTATION_FORMAT_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(CHARACTERISTIC_AGGREGATE_FORMAT_DESCRIPTOR));
		assertEquals("Characteristic Aggregate Format",
				DESCRIPTOR_MAPPING_128.get(CHARACTERISTIC_AGGREGATE_FORMAT_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(VALID_RANGE_DESCRIPTOR));
		assertEquals("Valid Range", DESCRIPTOR_MAPPING_128.get(VALID_RANGE_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(EXTERNAL_REPORT_REFERENCE_DESCRIPTOR));
		assertEquals("External Report Reference", DESCRIPTOR_MAPPING_128.get(EXTERNAL_REPORT_REFERENCE_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(REPORT_REFERENCE_DESCRIPTOR));
		assertEquals("Report Reference", DESCRIPTOR_MAPPING_128.get(REPORT_REFERENCE_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(NUMBER_OF_DIGITALS_DESCRIPTOR));
		assertEquals("Number of Digitals", DESCRIPTOR_MAPPING_128.get(NUMBER_OF_DIGITALS_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(VALUE_TRIGGER_SETTING_DESCRIPTOR));
		assertEquals("Value Trigger Setting", DESCRIPTOR_MAPPING_128.get(VALUE_TRIGGER_SETTING_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(ENVIRONMENTAL_SENSING_CONFIGURATION_DESCRIPTOR));
		assertEquals("Environmental Sensing Configuration",
				DESCRIPTOR_MAPPING_128.get(ENVIRONMENTAL_SENSING_CONFIGURATION_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(ENVIRONMENTAL_SENSING_MEASUREMENT_DESCRIPTOR));
		assertEquals("Environmental Sensing Measurement",
				DESCRIPTOR_MAPPING_128.get(ENVIRONMENTAL_SENSING_MEASUREMENT_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(ENVIRONMENTAL_SENSING_TRIGGER_SETTING_DESCRIPTOR));
		assertEquals("Environmental Sensing Trigger Setting",
				DESCRIPTOR_MAPPING_128.get(ENVIRONMENTAL_SENSING_TRIGGER_SETTING_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(TIME_TRIGGER_SETTING_DESCRIPTOR));
		assertEquals("Time Trigger Setting", DESCRIPTOR_MAPPING_128.get(TIME_TRIGGER_SETTING_DESCRIPTOR));
		assertTrue(DESCRIPTOR_MAPPING_128.containsKey(COMPLETE_BR_EDR_TRANSPORT_BLOCK_DATA_DESCRIPTOR));
		assertEquals("Complete BR-EDR Transport Block Data",
				DESCRIPTOR_MAPPING_128.get(COMPLETE_BR_EDR_TRANSPORT_BLOCK_DATA_DESCRIPTOR));
	}
}