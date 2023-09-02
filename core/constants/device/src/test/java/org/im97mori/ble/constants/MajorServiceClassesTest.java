package org.im97mori.ble.constants;

import static org.im97mori.ble.constants.MajorDeviceClass.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class MajorServiceClassesTest extends TestBase {

	@Test
	public void test_map_00001() {
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(MISCELLANEOUS_MAJOR_DEVICE_CLASS));
		assertEquals("Miscellaneous", MAJOR_DEVICE_CLASS_MAPPING.get(MISCELLANEOUS_MAJOR_DEVICE_CLASS));
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(COMPUTER_MAJOR_DEVICE_CLASS));
		assertEquals("Computer (desktop, notebook, PDA, organizer, ...)",
				MAJOR_DEVICE_CLASS_MAPPING.get(COMPUTER_MAJOR_DEVICE_CLASS));
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(PHONE_MAJOR_DEVICE_CLASS));
		assertEquals("Phone (cellular, cordless, pay phone, modem, ...)",
				MAJOR_DEVICE_CLASS_MAPPING.get(PHONE_MAJOR_DEVICE_CLASS));
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(LAN_NETWORK_ACCESS_POINT_MAJOR_DEVICE_CLASS));
		assertEquals("LAN/Network Access point",
				MAJOR_DEVICE_CLASS_MAPPING.get(LAN_NETWORK_ACCESS_POINT_MAJOR_DEVICE_CLASS));
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(AUDIO_VIDEO_MAJOR_DEVICE_CLASS));
		assertEquals("Audio/Video (headset, speaker, stereo, video display, VCR, ...)",
				MAJOR_DEVICE_CLASS_MAPPING.get(AUDIO_VIDEO_MAJOR_DEVICE_CLASS));
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(PERIPHERAL_MAJOR_DEVICE_CLASS));
		assertEquals("Peripheral (mouse, joystick, keyboard, ...)",
				MAJOR_DEVICE_CLASS_MAPPING.get(PERIPHERAL_MAJOR_DEVICE_CLASS));
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(IMAGING_MAJOR_DEVICE_CLASS));
		assertEquals("Imaging (printer, scanner, camera, display, ...)",
				MAJOR_DEVICE_CLASS_MAPPING.get(IMAGING_MAJOR_DEVICE_CLASS));
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(WEARABLE_MAJOR_DEVICE_CLASS));
		assertEquals("Wearable", MAJOR_DEVICE_CLASS_MAPPING.get(WEARABLE_MAJOR_DEVICE_CLASS));
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(TOY_MAJOR_DEVICE_CLASS));
		assertEquals("Toy", MAJOR_DEVICE_CLASS_MAPPING.get(TOY_MAJOR_DEVICE_CLASS));
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(HEALTH_MAJOR_DEVICE_CLASS));
		assertEquals("Health", MAJOR_DEVICE_CLASS_MAPPING.get(HEALTH_MAJOR_DEVICE_CLASS));
		assertTrue(MAJOR_DEVICE_CLASS_MAPPING.containsKey(UNCATEGORIZED_MAJOR_DEVICE_CLASS));
		assertEquals("Uncategorized: device code not specified",
				MAJOR_DEVICE_CLASS_MAPPING.get(UNCATEGORIZED_MAJOR_DEVICE_CLASS));
	}
}