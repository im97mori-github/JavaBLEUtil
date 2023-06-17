package org.im97mori.ble.constants;

import static org.im97mori.ble.constants.DeclarationUUID.CHARACTERISTIC_DECLARATION;
import static org.im97mori.ble.constants.DeclarationUUID.DECLARATION_MAPPING_128;
import static org.im97mori.ble.constants.DeclarationUUID.INCLUDE_DECLARATION;
import static org.im97mori.ble.constants.DeclarationUUID.PRIMARY_SERVICE_DECLARATION;
import static org.im97mori.ble.constants.DeclarationUUID.SECONDARY_SERVICE_DECLARATION;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DeclarationUUIDTest {

	@Test
	public void test_map_00001() {
		assertTrue(DECLARATION_MAPPING_128.containsKey(PRIMARY_SERVICE_DECLARATION));
		assertEquals("Primary Service", DECLARATION_MAPPING_128.get(PRIMARY_SERVICE_DECLARATION));
		assertTrue(DECLARATION_MAPPING_128.containsKey(SECONDARY_SERVICE_DECLARATION));
		assertEquals("Secondary Service", DECLARATION_MAPPING_128.get(SECONDARY_SERVICE_DECLARATION));
		assertTrue(DECLARATION_MAPPING_128.containsKey(INCLUDE_DECLARATION));
		assertEquals("Include", DECLARATION_MAPPING_128.get(INCLUDE_DECLARATION));
		assertTrue(DECLARATION_MAPPING_128.containsKey(CHARACTERISTIC_DECLARATION));
		assertEquals("Characteristic", DECLARATION_MAPPING_128.get(CHARACTERISTIC_DECLARATION));
	}
}