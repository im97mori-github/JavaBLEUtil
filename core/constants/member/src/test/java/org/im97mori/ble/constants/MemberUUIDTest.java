package org.im97mori.ble.constants;

import static org.im97mori.ble.constants.MemberUUID.MEMBER_MAPPING_128;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;

public class MemberUUIDTest extends TestBase {

    @Test
    public void test_map_00001() {
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcb7-0000-1000-8000-00805f9b34fb")));
        assertEquals("T-Mobile USA", MEMBER_MAPPING_128.get(UUID.fromString("0000fcb7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcb8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ribbiot, INC.", MEMBER_MAPPING_128.get(UUID.fromString("0000fcb8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcb9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lumi United Technology Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcb9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcba-0000-1000-8000-00805f9b34fb")));
        assertEquals("BlueID GmbH", MEMBER_MAPPING_128.get(UUID.fromString("0000fcba-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcbb-0000-1000-8000-00805f9b34fb")));
        assertEquals("SharkNinja Operating LLC",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcbb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcbc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Drowsy Digital, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcbc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcbd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Toshiba Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcbd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcbe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Musen Connect, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcbe-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcbf-0000-1000-8000-00805f9b34fb")));
        assertEquals("ASSA ABLOY Opening Solutions Sweden AB",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcbf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcc0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xiaomi Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fcc0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcc1-0000-1000-8000-00805f9b34fb")));
        assertEquals("TIMECODE SYSTEMS LIMITED",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcc1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcc2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm Technologies, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcc2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcc3-0000-1000-8000-00805f9b34fb")));
        assertEquals("HP Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fcc3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcc4-0000-1000-8000-00805f9b34fb")));
        assertEquals("OMRON(DALIAN) CO,.LTD.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcc4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcc5-0000-1000-8000-00805f9b34fb")));
        assertEquals("OMRON(DALIAN) CO,.LTD.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcc5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcc6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wiliot LTD.", MEMBER_MAPPING_128.get(UUID.fromString("0000fcc6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcc7-0000-1000-8000-00805f9b34fb")));
        assertEquals("PB INC.", MEMBER_MAPPING_128.get(UUID.fromString("0000fcc7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcc8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Allthenticate, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcc8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcc9-0000-1000-8000-00805f9b34fb")));
        assertEquals("SkyHawke Technologies",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcc9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cosmed s.r.l.", MEMBER_MAPPING_128.get(UUID.fromString("0000fcca-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fccb-0000-1000-8000-00805f9b34fb")));
        assertEquals("TOTO LTD.", MEMBER_MAPPING_128.get(UUID.fromString("0000fccb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fccc-0000-1000-8000-00805f9b34fb")));
        assertEquals("WiFi Alliance", MEMBER_MAPPING_128.get(UUID.fromString("0000fccc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fccd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zound Industries International AB",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fccd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcce-0000-1000-8000-00805f9b34fb")));
        assertEquals("Luna Health, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcce-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fccf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fccf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcd0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Laerdal Medical AS",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcd0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcd1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Benwei Media Co.,Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcd1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcd2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Allterco Robotics ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcd2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcd3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fisher & Paykel Healthcare",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcd3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcd4-0000-1000-8000-00805f9b34fb")));
        assertEquals("OMRON HEALTHCARE",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcd4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcd5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nortek Security & Control",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcd5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcd6-0000-1000-8000-00805f9b34fb")));
        assertEquals("SWISSINNO SOLUTIONS AG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcd6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcd7-0000-1000-8000-00805f9b34fb")));
        assertEquals("PowerPal Pty Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcd7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcd8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Appex Factory S.L.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcd8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcd9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huso, INC", MEMBER_MAPPING_128.get(UUID.fromString("0000fcd9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcda-0000-1000-8000-00805f9b34fb")));
        assertEquals("Draeger", MEMBER_MAPPING_128.get(UUID.fromString("0000fcda-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcdb-0000-1000-8000-00805f9b34fb")));
        assertEquals("aconno GmbH", MEMBER_MAPPING_128.get(UUID.fromString("0000fcdb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcdc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amazon.com Services, LLC",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcdc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcdd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mobilaris AB", MEMBER_MAPPING_128.get(UUID.fromString("0000fcdd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcde-0000-1000-8000-00805f9b34fb")));
        assertEquals("ARCTOP, INC.", MEMBER_MAPPING_128.get(UUID.fromString("0000fcde-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcdf-0000-1000-8000-00805f9b34fb")));
        assertEquals("NIO USA, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fcdf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fce0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Akciju sabiedriba \"SAF TEHNIKA\"",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fce0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fce1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sony Group Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fce1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fce2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Baracoda Daily Healthtech",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fce2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fce3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smith & Nephew Medical Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fce3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fce4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsara Networks, Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fce4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fce5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsara Networks, Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fce5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fce6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Guard RFID Solutions Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fce6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fce7-0000-1000-8000-00805f9b34fb")));
        assertEquals("TKH Security B.V.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fce7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fce8-0000-1000-8000-00805f9b34fb")));
        assertEquals("ITT Industries", MEMBER_MAPPING_128.get(UUID.fromString("0000fce8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fce9-0000-1000-8000-00805f9b34fb")));
        assertEquals("MindRhythm, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fce9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcea-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chess Wise B.V.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcea-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fceb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Avi-On", MEMBER_MAPPING_128.get(UUID.fromString("0000fceb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Griffwerk GmbH", MEMBER_MAPPING_128.get(UUID.fromString("0000fcec-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fced-0000-1000-8000-00805f9b34fb")));
        assertEquals("Workaround Gmbh",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fced-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Velentium, LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fcee-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcef-0000-1000-8000-00805f9b34fb")));
        assertEquals("Divesoft s.r.o.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcef-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcf0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Security Enhancement Systems, LLC",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcf0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcf1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fcf1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcf2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bitwards Oy", MEMBER_MAPPING_128.get(UUID.fromString("0000fcf2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcf3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Armatura LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fcf3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcf4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Allegion", MEMBER_MAPPING_128.get(UUID.fromString("0000fcf4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcf5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trident Communication Technology, LLC",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcf5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcf6-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Linux Foundation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcf6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcf7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Honor Device Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcf7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcf8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Honor Device Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcf8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcf9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Leupold & Stevens, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcf9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcfa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Leupold & Stevens, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcfa-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcfb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Benwei Media Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcfb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcfc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Barrot Technology Co.,Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcfc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcfd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Barrot Technology Co.,Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcfd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcfe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sennheiser Consumer Audio GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fcfe-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fcff-0000-1000-8000-00805f9b34fb")));
        assertEquals("701x", MEMBER_MAPPING_128.get(UUID.fromString("0000fcff-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd00-0000-1000-8000-00805f9b34fb")));
        assertEquals("FUTEK Advanced Sensor Technology, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd00-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd01-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sanvita Medical Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd01-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd02-0000-1000-8000-00805f9b34fb")));
        assertEquals("LEGO System A/S",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd02-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd03-0000-1000-8000-00805f9b34fb")));
        assertEquals("Quuppa Oy", MEMBER_MAPPING_128.get(UUID.fromString("0000fd03-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd04-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shure Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd04-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd05-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm Technologies, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd05-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd06-0000-1000-8000-00805f9b34fb")));
        assertEquals("RACE-AI LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fd06-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd07-0000-1000-8000-00805f9b34fb")));
        assertEquals("Swedlock AB", MEMBER_MAPPING_128.get(UUID.fromString("0000fd07-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd08-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bull Group Incorporated Company",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd08-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd09-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cousins and Sears LLC",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd09-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd0a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Luminostics, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd0a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd0b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Luminostics, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd0b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd0c-0000-1000-8000-00805f9b34fb")));
        assertEquals("OSM HK Limited", MEMBER_MAPPING_128.get(UUID.fromString("0000fd0c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd0d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blecon Ltd", MEMBER_MAPPING_128.get(UUID.fromString("0000fd0d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd0e-0000-1000-8000-00805f9b34fb")));
        assertEquals("HerdDogg, Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000fd0e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd0f-0000-1000-8000-00805f9b34fb")));
        assertEquals("AEON MOTOR CO.,LTD.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd0f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd10-0000-1000-8000-00805f9b34fb")));
        assertEquals("AEON MOTOR CO.,LTD.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd10-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd11-0000-1000-8000-00805f9b34fb")));
        assertEquals("AEON MOTOR CO.,LTD.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd11-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd12-0000-1000-8000-00805f9b34fb")));
        assertEquals("AEON MOTOR CO.,LTD.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd12-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd13-0000-1000-8000-00805f9b34fb")));
        assertEquals("BRG Sports, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd13-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd14-0000-1000-8000-00805f9b34fb")));
        assertEquals("BRG Sports, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd14-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd15-0000-1000-8000-00805f9b34fb")));
        assertEquals("Panasonic Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd15-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd16-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensitech, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd16-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd17-0000-1000-8000-00805f9b34fb")));
        assertEquals("LEGIC Identsystems AG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd17-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd18-0000-1000-8000-00805f9b34fb")));
        assertEquals("LEGIC Identsystems AG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd18-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd19-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smith & Nephew Medical Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd19-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd1a-0000-1000-8000-00805f9b34fb")));
        assertEquals("CSIRO", MEMBER_MAPPING_128.get(UUID.fromString("0000fd1a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd1b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Helios Sports, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd1b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd1c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Brady Worldwide Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd1c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd1d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsung Electronics Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd1d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd1e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Plume Design Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd1e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd1f-0000-1000-8000-00805f9b34fb")));
        assertEquals("3M", MEMBER_MAPPING_128.get(UUID.fromString("0000fd1f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd20-0000-1000-8000-00805f9b34fb")));
        assertEquals("GN Hearing A/S", MEMBER_MAPPING_128.get(UUID.fromString("0000fd20-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd21-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huawei Technologies Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd21-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd22-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huawei Technologies Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd22-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd23-0000-1000-8000-00805f9b34fb")));
        assertEquals("DOM Sicherheitstechnik GmbH & Co. KG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd23-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd24-0000-1000-8000-00805f9b34fb")));
        assertEquals("GD Midea Air-Conditioning Equipment Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd24-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd25-0000-1000-8000-00805f9b34fb")));
        assertEquals("GD Midea Air-Conditioning Equipment Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd25-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd26-0000-1000-8000-00805f9b34fb")));
        assertEquals("Novo Nordisk A/S",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd26-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd27-0000-1000-8000-00805f9b34fb")));
        assertEquals("Integrated Illumination Systems, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd27-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd28-0000-1000-8000-00805f9b34fb")));
        assertEquals("Julius Blum GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd28-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd29-0000-1000-8000-00805f9b34fb")));
        assertEquals("Asahi Kasei Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd29-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd2a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sony Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd2a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd2b-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Access Technologies",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd2b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd2c-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Access Technologies",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd2c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd2d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xiaomi Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd2d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd2e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bitstrata Systems Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd2e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd2f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bitstrata Systems Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd2f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd30-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sesam Solutions BV",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd30-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd31-0000-1000-8000-00805f9b34fb")));
        assertEquals("LG Electronics Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd31-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd32-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gemalto Holding BV",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd32-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd33-0000-1000-8000-00805f9b34fb")));
        assertEquals("DashLogic, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd33-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd34-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aerosens LLC.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd34-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd35-0000-1000-8000-00805f9b34fb")));
        assertEquals("Transsion Holdings Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd35-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd36-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fd36-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd37-0000-1000-8000-00805f9b34fb")));
        assertEquals("TireCheck GmbH", MEMBER_MAPPING_128.get(UUID.fromString("0000fd37-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd38-0000-1000-8000-00805f9b34fb")));
        assertEquals("Danfoss A/S", MEMBER_MAPPING_128.get(UUID.fromString("0000fd38-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd39-0000-1000-8000-00805f9b34fb")));
        assertEquals("PREDIKTAS", MEMBER_MAPPING_128.get(UUID.fromString("0000fd39-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd3a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Verkada Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd3a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd3b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Verkada Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd3b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd3c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Redline Communications Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd3c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd3d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Woan Technology (Shenzhen) Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd3d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd3e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pure Watercraft, inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd3e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd3f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cognosos, Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000fd3f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd40-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beflex Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd40-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd41-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amazon Lab126", MEMBER_MAPPING_128.get(UUID.fromString("0000fd41-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd42-0000-1000-8000-00805f9b34fb")));
        assertEquals("Globe (Jiangsu) Co.,Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd42-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd43-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd43-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd44-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd44-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd45-0000-1000-8000-00805f9b34fb")));
        assertEquals("GB Solution co.,Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd45-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd46-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lemco IKE", MEMBER_MAPPING_128.get(UUID.fromString("0000fd46-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd47-0000-1000-8000-00805f9b34fb")));
        assertEquals("Liberty Global Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd47-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd48-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geberit International AG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd48-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd49-0000-1000-8000-00805f9b34fb")));
        assertEquals("Panasonic Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd49-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd4a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sigma Elektro GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd4a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd4b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsung Electronics Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd4b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd4c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Adolf Wuerth GmbH & Co KG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd4c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd4d-0000-1000-8000-00805f9b34fb")));
        assertEquals("70mai Co.,Ltd.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd4d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd4e-0000-1000-8000-00805f9b34fb")));
        assertEquals("70mai Co.,Ltd.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd4e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd4f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Forkbeard Technologies AS",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd4f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd50-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hangzhou Tuya Information  Technology Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd50-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd51-0000-1000-8000-00805f9b34fb")));
        assertEquals("UTC Fire and Security",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd51-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd52-0000-1000-8000-00805f9b34fb")));
        assertEquals("UTC Fire and Security",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd52-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd53-0000-1000-8000-00805f9b34fb")));
        assertEquals("PCI Private Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd53-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd54-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qingdao Haier Technology Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd54-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd55-0000-1000-8000-00805f9b34fb")));
        assertEquals("Braveheart Wireless, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd55-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd56-0000-1000-8000-00805f9b34fb")));
        assertEquals("Resmed Ltd", MEMBER_MAPPING_128.get(UUID.fromString("0000fd56-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd57-0000-1000-8000-00805f9b34fb")));
        assertEquals("Volvo Car Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd57-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd58-0000-1000-8000-00805f9b34fb")));
        assertEquals("Volvo Car Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd58-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd59-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsung Electronics Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd59-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd5a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsung Electronics Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd5a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd5b-0000-1000-8000-00805f9b34fb")));
        assertEquals("V2SOFT INC.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd5b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd5c-0000-1000-8000-00805f9b34fb")));
        assertEquals("React Mobile", MEMBER_MAPPING_128.get(UUID.fromString("0000fd5c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd5d-0000-1000-8000-00805f9b34fb")));
        assertEquals("maxon motor ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd5d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd5e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tapkey GmbH", MEMBER_MAPPING_128.get(UUID.fromString("0000fd5e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd5f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meta Platforms Technologies, LLC",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd5f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd60-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sercomm Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd60-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd61-0000-1000-8000-00805f9b34fb")));
        assertEquals("Arendi AG", MEMBER_MAPPING_128.get(UUID.fromString("0000fd61-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd62-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fitbit, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd62-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd63-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fitbit, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd63-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd64-0000-1000-8000-00805f9b34fb")));
        assertEquals("INRIA", MEMBER_MAPPING_128.get(UUID.fromString("0000fd64-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd65-0000-1000-8000-00805f9b34fb")));
        assertEquals("Razer Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd65-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd66-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zebra Technologies Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd66-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd67-0000-1000-8000-00805f9b34fb")));
        assertEquals("Montblanc Simplo GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd67-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd68-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ubique Innovation AG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd68-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd69-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsung Electronics Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd69-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd6a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Emerson", MEMBER_MAPPING_128.get(UUID.fromString("0000fd6a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd6b-0000-1000-8000-00805f9b34fb")));
        assertEquals("rapitag GmbH", MEMBER_MAPPING_128.get(UUID.fromString("0000fd6b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd6c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsung Electronics Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd6c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd6d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sigma Elektro GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd6d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd6e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Polidea sp. z o.o.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd6e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd6f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd6f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd70-0000-1000-8000-00805f9b34fb")));
        assertEquals("GuangDong Oppo Mobile Telecommunications Corp., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd70-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd71-0000-1000-8000-00805f9b34fb")));
        assertEquals("GN Hearing A/S", MEMBER_MAPPING_128.get(UUID.fromString("0000fd71-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd72-0000-1000-8000-00805f9b34fb")));
        assertEquals("Logitech International SA",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd72-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd73-0000-1000-8000-00805f9b34fb")));
        assertEquals("BRControls Products BV",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd73-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd74-0000-1000-8000-00805f9b34fb")));
        assertEquals("BRControls Products BV",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd74-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd75-0000-1000-8000-00805f9b34fb")));
        assertEquals("Insulet Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd75-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd76-0000-1000-8000-00805f9b34fb")));
        assertEquals("Insulet Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd76-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd77-0000-1000-8000-00805f9b34fb")));
        assertEquals("Withings", MEMBER_MAPPING_128.get(UUID.fromString("0000fd77-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd78-0000-1000-8000-00805f9b34fb")));
        assertEquals("Withings", MEMBER_MAPPING_128.get(UUID.fromString("0000fd78-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd79-0000-1000-8000-00805f9b34fb")));
        assertEquals("Withings", MEMBER_MAPPING_128.get(UUID.fromString("0000fd79-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd7a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Withings", MEMBER_MAPPING_128.get(UUID.fromString("0000fd7a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd7b-0000-1000-8000-00805f9b34fb")));
        assertEquals("WYZE LABS, INC.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd7b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd7c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Toshiba Information Systems(Japan) Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd7c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd7d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Center for Advanced Research Wernher Von Braun",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd7d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd7e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsung Electronics Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd7e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd7f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Husqvarna AB", MEMBER_MAPPING_128.get(UUID.fromString("0000fd7f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd80-0000-1000-8000-00805f9b34fb")));
        assertEquals("Phindex Technologies, Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd80-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd81-0000-1000-8000-00805f9b34fb")));
        assertEquals("CANDY HOUSE, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd81-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd82-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sony Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd82-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd83-0000-1000-8000-00805f9b34fb")));
        assertEquals("iNFORM Technology GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd83-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd84-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tile, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd84-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd85-0000-1000-8000-00805f9b34fb")));
        assertEquals("Husqvarna AB", MEMBER_MAPPING_128.get(UUID.fromString("0000fd85-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd86-0000-1000-8000-00805f9b34fb")));
        assertEquals("Abbott", MEMBER_MAPPING_128.get(UUID.fromString("0000fd86-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd87-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fd87-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd88-0000-1000-8000-00805f9b34fb")));
        assertEquals("Urbanminded LTD",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd88-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd89-0000-1000-8000-00805f9b34fb")));
        assertEquals("Urbanminded LTD",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd89-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd8a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Signify Netherlands B.V.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd8a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd8b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jigowatts Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd8b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd8c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fd8c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd8d-0000-1000-8000-00805f9b34fb")));
        assertEquals("quip NYC Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd8d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd8e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Motorola Solutions",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd8e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd8f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Matrix ComSec Pvt. Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd8f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd90-0000-1000-8000-00805f9b34fb")));
        assertEquals("Guangzhou SuperSound Information Technology Co.,Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd90-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd91-0000-1000-8000-00805f9b34fb")));
        assertEquals("Groove X, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fd91-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd92-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm Technologies International, Ltd. (QTIL)",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd92-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd93-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bayerische Motoren Werke AG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd93-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd94-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hewlett Packard Enterprise",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd94-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd95-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rigado", MEMBER_MAPPING_128.get(UUID.fromString("0000fd95-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd96-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fd96-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd97-0000-1000-8000-00805f9b34fb")));
        assertEquals("June Life, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd97-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd98-0000-1000-8000-00805f9b34fb")));
        assertEquals("Disney Worldwide Services, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd98-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd99-0000-1000-8000-00805f9b34fb")));
        assertEquals("ABB Oy", MEMBER_MAPPING_128.get(UUID.fromString("0000fd99-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd9a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huawei Technologies Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd9a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd9b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huawei Technologies Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd9b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd9c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huawei Technologies Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd9c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd9d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gastec Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd9d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd9e-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Coca-Cola Company",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd9e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fd9f-0000-1000-8000-00805f9b34fb")));
        assertEquals("VitalTech Affiliates LLC",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fd9f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fda0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Secugen Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fda0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fda1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Groove X, Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000fda1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fda2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Groove X, Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000fda2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fda3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inseego Corp.", MEMBER_MAPPING_128.get(UUID.fromString("0000fda3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fda4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inseego Corp.", MEMBER_MAPPING_128.get(UUID.fromString("0000fda4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fda5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Neurostim OAB, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fda5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fda6-0000-1000-8000-00805f9b34fb")));
        assertEquals("WWZN Information Technology Company Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fda6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fda7-0000-1000-8000-00805f9b34fb")));
        assertEquals("WWZN Information Technology Company Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fda7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fda8-0000-1000-8000-00805f9b34fb")));
        assertEquals("PSA Peugeot Citroën",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fda8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fda9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rhombus Systems, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fda9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdaa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xiaomi Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fdaa-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xiaomi Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fdab-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdac-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tentacle Sync GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdac-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdad-0000-1000-8000-00805f9b34fb")));
        assertEquals("Houwa System Design, k.k.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdad-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdae-0000-1000-8000-00805f9b34fb")));
        assertEquals("Houwa System Design, k.k.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdae-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdaf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wiliot LTD", MEMBER_MAPPING_128.get(UUID.fromString("0000fdaf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdb0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Proxy Technologies, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdb0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdb1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Proxy Technologies, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdb1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdb2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Portable Multimedia Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdb2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdb3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Audiodo AB", MEMBER_MAPPING_128.get(UUID.fromString("0000fdb3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdb4-0000-1000-8000-00805f9b34fb")));
        assertEquals("HP Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000fdb4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdb5-0000-1000-8000-00805f9b34fb")));
        assertEquals("ECSG", MEMBER_MAPPING_128.get(UUID.fromString("0000fdb5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdb6-0000-1000-8000-00805f9b34fb")));
        assertEquals("GWA Hygiene GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdb6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdb7-0000-1000-8000-00805f9b34fb")));
        assertEquals("LivaNova USA Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdb7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdb8-0000-1000-8000-00805f9b34fb")));
        assertEquals("LivaNova USA Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdb8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdb9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Comcast Cable Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdb9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Comcast Cable Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdba-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdbb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Profoto", MEMBER_MAPPING_128.get(UUID.fromString("0000fdbb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdbc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Emerson", MEMBER_MAPPING_128.get(UUID.fromString("0000fdbc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdbd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Clover Network, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdbd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdbe-0000-1000-8000-00805f9b34fb")));
        assertEquals("California Things Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdbe-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdbf-0000-1000-8000-00805f9b34fb")));
        assertEquals("California Things Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdbf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdc0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hunter Douglas", MEMBER_MAPPING_128.get(UUID.fromString("0000fdc0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdc1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hunter Douglas", MEMBER_MAPPING_128.get(UUID.fromString("0000fdc1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdc2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Baidu Online Network Technology (Beijing) Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdc2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdc3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Baidu Online Network Technology (Beijing) Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdc3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdc4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Simavita (Aust) Pty Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdc4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdc5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Automatic Labs", MEMBER_MAPPING_128.get(UUID.fromString("0000fdc5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdc6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eli Lilly and Company",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdc6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdc7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eli Lilly and Company",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdc7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdc8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hach – Danaher", MEMBER_MAPPING_128.get(UUID.fromString("0000fdc8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdc9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Busch-Jaeger Elektro GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdc9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fortin Electronic Systems",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdca-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdcb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meggitt SA", MEMBER_MAPPING_128.get(UUID.fromString("0000fdcb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdcc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shoof Technologies",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdcc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdcd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qingping Technology (Beijing) Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdcd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdce-0000-1000-8000-00805f9b34fb")));
        assertEquals("SENNHEISER electronic GmbH & Co. KG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdce-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdcf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nalu Medical, Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdcf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdd0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huawei Technologies Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdd0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdd1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huawei Technologies Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdd1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdd2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bose Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdd2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdd3-0000-1000-8000-00805f9b34fb")));
        assertEquals("FUBA Automotive Electronics GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdd3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdd4-0000-1000-8000-00805f9b34fb")));
        assertEquals("LX Solutions Pty Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdd4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdd5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Brompton Bicycle Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdd5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdd6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ministry of Supply",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdd6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdd7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Emerson", MEMBER_MAPPING_128.get(UUID.fromString("0000fdd7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdd8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jiangsu Teranovo Tech Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdd8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdd9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jiangsu Teranovo Tech Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdd9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdda-0000-1000-8000-00805f9b34fb")));
        assertEquals("MHCS", MEMBER_MAPPING_128.get(UUID.fromString("0000fdda-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fddb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsung Electronics Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fddb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fddc-0000-1000-8000-00805f9b34fb")));
        assertEquals("4iiii Innovations Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fddc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fddd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Arch Systems Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fddd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdde-0000-1000-8000-00805f9b34fb")));
        assertEquals("Noodle Technology Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdde-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fddf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Harman International",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fddf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fde0-0000-1000-8000-00805f9b34fb")));
        assertEquals("John Deere", MEMBER_MAPPING_128.get(UUID.fromString("0000fde0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fde1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fortin Electronic Systems",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fde1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fde2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fde2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fde3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Abbott Diabetes Care",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fde3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fde4-0000-1000-8000-00805f9b34fb")));
        assertEquals("JUUL Labs, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fde4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fde5-0000-1000-8000-00805f9b34fb")));
        assertEquals("SMK Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fde5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fde6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intelletto Technologies Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fde6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fde7-0000-1000-8000-00805f9b34fb")));
        assertEquals("SECOM Co., LTD", MEMBER_MAPPING_128.get(UUID.fromString("0000fde7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fde8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Robert Bosch GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fde8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fde9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spacesaver Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fde9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdea-0000-1000-8000-00805f9b34fb")));
        assertEquals("SeeScan, Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000fdea-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdeb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Syntronix Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdeb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mannkind Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdec-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fded-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pole Star", MEMBER_MAPPING_128.get(UUID.fromString("0000fded-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huawei Technologies Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdee-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdef-0000-1000-8000-00805f9b34fb")));
        assertEquals("ART AND PROGRAM, INC.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdef-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdf0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fdf0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdf1-0000-1000-8000-00805f9b34fb")));
        assertEquals("LAMPLIGHT Co.,Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdf1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdf2-0000-1000-8000-00805f9b34fb")));
        assertEquals("AMICCOM Electronics Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdf2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdf3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amersports", MEMBER_MAPPING_128.get(UUID.fromString("0000fdf3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdf4-0000-1000-8000-00805f9b34fb")));
        assertEquals("O. E. M. Controls, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdf4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdf5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Milwaukee Electric Tools",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdf5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdf6-0000-1000-8000-00805f9b34fb")));
        assertEquals("AIAIAI ApS", MEMBER_MAPPING_128.get(UUID.fromString("0000fdf6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdf7-0000-1000-8000-00805f9b34fb")));
        assertEquals("HP Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fdf7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdf8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Onvocal", MEMBER_MAPPING_128.get(UUID.fromString("0000fdf8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdf9-0000-1000-8000-00805f9b34fb")));
        assertEquals("INIA", MEMBER_MAPPING_128.get(UUID.fromString("0000fdf9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdfa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tandem Diabetes Care",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdfa-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdfb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tandem Diabetes Care",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdfb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdfc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Optrel AG", MEMBER_MAPPING_128.get(UUID.fromString("0000fdfc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdfd-0000-1000-8000-00805f9b34fb")));
        assertEquals("RecursiveSoft Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdfd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdfe-0000-1000-8000-00805f9b34fb")));
        assertEquals("ADHERIUM(NZ) LIMITED",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fdfe-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fdff-0000-1000-8000-00805f9b34fb")));
        assertEquals("OSRAM GmbH", MEMBER_MAPPING_128.get(UUID.fromString("0000fdff-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe00-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amazon.com Services, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe00-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe01-0000-1000-8000-00805f9b34fb")));
        assertEquals("Duracell U.S. Operations Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe01-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe02-0000-1000-8000-00805f9b34fb")));
        assertEquals("Robert Bosch GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe02-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe03-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amazon.com Services, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe03-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe04-0000-1000-8000-00805f9b34fb")));
        assertEquals("OpenPath Security Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe04-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe05-0000-1000-8000-00805f9b34fb")));
        assertEquals("CORE Transport Technologies NZ Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe05-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe06-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm Technologies, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe06-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe07-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sonos, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe07-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe08-0000-1000-8000-00805f9b34fb")));
        assertEquals("Microsoft", MEMBER_MAPPING_128.get(UUID.fromString("0000fe08-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe09-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pillsy, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe09-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe0a-0000-1000-8000-00805f9b34fb")));
        assertEquals("ruwido austria gmbh",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe0a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe0b-0000-1000-8000-00805f9b34fb")));
        assertEquals("ruwido austria gmbh",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe0b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe0c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Procter & Gamble",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe0c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe0d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Procter & Gamble",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe0d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe0e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Setec Pty Ltd", MEMBER_MAPPING_128.get(UUID.fromString("0000fe0e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe0f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Signify Netherlands B.V. (formerly Philips Lighting B.V.)",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe0f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe10-0000-1000-8000-00805f9b34fb")));
        assertEquals("LAPIS Technology Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe10-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe11-0000-1000-8000-00805f9b34fb")));
        assertEquals("GMC-I Messtechnik GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe11-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe12-0000-1000-8000-00805f9b34fb")));
        assertEquals("M-Way Solutions GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe12-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe13-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe13-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe14-0000-1000-8000-00805f9b34fb")));
        assertEquals("Flextronics International USA Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe14-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe15-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amazon.com Services, Inc..",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe15-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe16-0000-1000-8000-00805f9b34fb")));
        assertEquals("Footmarks, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe16-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe17-0000-1000-8000-00805f9b34fb")));
        assertEquals("Telit Wireless Solutions GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe17-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe18-0000-1000-8000-00805f9b34fb")));
        assertEquals("Runtime, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe18-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe19-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe19-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe1a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tyto Life LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe1a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe1b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tyto Life LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe1b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe1c-0000-1000-8000-00805f9b34fb")));
        assertEquals("NetMedia, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe1c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe1d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Illuminati Instrument Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe1d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe1e-0000-1000-8000-00805f9b34fb")));
        assertEquals("LAMPLIGHT Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe1e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe1f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Garmin International, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe1f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe20-0000-1000-8000-00805f9b34fb")));
        assertEquals("Emerson", MEMBER_MAPPING_128.get(UUID.fromString("0000fe20-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe21-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bose Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe21-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe22-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zoll Medical Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe22-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe23-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zoll Medical Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe23-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe24-0000-1000-8000-00805f9b34fb")));
        assertEquals("August Home Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe24-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe25-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe25-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe26-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe26-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe27-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe27-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe28-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ayla Networks", MEMBER_MAPPING_128.get(UUID.fromString("0000fe28-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe29-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gibson Innovations",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe29-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe2a-0000-1000-8000-00805f9b34fb")));
        assertEquals("DaisyWorks, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe2a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe2b-0000-1000-8000-00805f9b34fb")));
        assertEquals("ITT Industries", MEMBER_MAPPING_128.get(UUID.fromString("0000fe2b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe2c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe2c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe2d-0000-1000-8000-00805f9b34fb")));
        assertEquals("LAMPLIGHT Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe2d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe2e-0000-1000-8000-00805f9b34fb")));
        assertEquals("ERi,Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe2e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe2f-0000-1000-8000-00805f9b34fb")));
        assertEquals("CRESCO Wireless, Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe2f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe30-0000-1000-8000-00805f9b34fb")));
        assertEquals("Volkswagen AG", MEMBER_MAPPING_128.get(UUID.fromString("0000fe30-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe31-0000-1000-8000-00805f9b34fb")));
        assertEquals("Volkswagen AG", MEMBER_MAPPING_128.get(UUID.fromString("0000fe31-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe32-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pro-Mark, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe32-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe33-0000-1000-8000-00805f9b34fb")));
        assertEquals("CHIPOLO d.o.o.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe33-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe34-0000-1000-8000-00805f9b34fb")));
        assertEquals("SmallLoop LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe34-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe35-0000-1000-8000-00805f9b34fb")));
        assertEquals("HUAWEI Technologies Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe35-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe36-0000-1000-8000-00805f9b34fb")));
        assertEquals("HUAWEI Technologies Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe36-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe37-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spaceek LTD", MEMBER_MAPPING_128.get(UUID.fromString("0000fe37-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe38-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spaceek LTD", MEMBER_MAPPING_128.get(UUID.fromString("0000fe38-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe39-0000-1000-8000-00805f9b34fb")));
        assertEquals("TTS Tooltechnic Systems AG & Co. KG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe39-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe3a-0000-1000-8000-00805f9b34fb")));
        assertEquals("TTS Tooltechnic Systems AG & Co. KG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe3a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe3b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dolby Laboratories",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe3b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe3c-0000-1000-8000-00805f9b34fb")));
        assertEquals("alibaba", MEMBER_MAPPING_128.get(UUID.fromString("0000fe3c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe3d-0000-1000-8000-00805f9b34fb")));
        assertEquals("BD Medical", MEMBER_MAPPING_128.get(UUID.fromString("0000fe3d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe3e-0000-1000-8000-00805f9b34fb")));
        assertEquals("BD Medical", MEMBER_MAPPING_128.get(UUID.fromString("0000fe3e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe3f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Friday Labs Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe3f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe40-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inugo Systems Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe40-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe41-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inugo Systems Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe41-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe42-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nets A/S", MEMBER_MAPPING_128.get(UUID.fromString("0000fe42-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe43-0000-1000-8000-00805f9b34fb")));
        assertEquals("Andreas Stihl AG & Co. KG",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe43-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe44-0000-1000-8000-00805f9b34fb")));
        assertEquals("SK Telecom", MEMBER_MAPPING_128.get(UUID.fromString("0000fe44-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe45-0000-1000-8000-00805f9b34fb")));
        assertEquals("Snapchat Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000fe45-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe46-0000-1000-8000-00805f9b34fb")));
        assertEquals("B&O Play A/S", MEMBER_MAPPING_128.get(UUID.fromString("0000fe46-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe47-0000-1000-8000-00805f9b34fb")));
        assertEquals("General Motors", MEMBER_MAPPING_128.get(UUID.fromString("0000fe47-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe48-0000-1000-8000-00805f9b34fb")));
        assertEquals("General Motors", MEMBER_MAPPING_128.get(UUID.fromString("0000fe48-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe49-0000-1000-8000-00805f9b34fb")));
        assertEquals("SenionLab AB", MEMBER_MAPPING_128.get(UUID.fromString("0000fe49-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe4a-0000-1000-8000-00805f9b34fb")));
        assertEquals("OMRON HEALTHCARE Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe4a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe4b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Signify Netherlands B.V. (formerly Philips Lighting B.V.)",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe4b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe4c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Volkswagen AG", MEMBER_MAPPING_128.get(UUID.fromString("0000fe4c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe4d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Casambi Technologies Oy",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe4d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe4e-0000-1000-8000-00805f9b34fb")));
        assertEquals("NTT docomo", MEMBER_MAPPING_128.get(UUID.fromString("0000fe4e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe4f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Molekule, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe4f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe50-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe50-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe51-0000-1000-8000-00805f9b34fb")));
        assertEquals("SRAM", MEMBER_MAPPING_128.get(UUID.fromString("0000fe51-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe52-0000-1000-8000-00805f9b34fb")));
        assertEquals("SetPoint Medical",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe52-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe53-0000-1000-8000-00805f9b34fb")));
        assertEquals("3M", MEMBER_MAPPING_128.get(UUID.fromString("0000fe53-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe54-0000-1000-8000-00805f9b34fb")));
        assertEquals("Motiv, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe54-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe55-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe55-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe56-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe56-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe57-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dotted Labs", MEMBER_MAPPING_128.get(UUID.fromString("0000fe57-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe58-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nordic Semiconductor ASA",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe58-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe59-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nordic Semiconductor ASA",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe59-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe5a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cronologics Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe5a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe5b-0000-1000-8000-00805f9b34fb")));
        assertEquals("GT-tronics HK Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe5b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe5c-0000-1000-8000-00805f9b34fb")));
        assertEquals("million hunters GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe5c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe5d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Grundfos A/S", MEMBER_MAPPING_128.get(UUID.fromString("0000fe5d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe5e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Plastc Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe5e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe5f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eyefi, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe5f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe60-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lierda Science & Technology Group Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe60-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe61-0000-1000-8000-00805f9b34fb")));
        assertEquals("Logitech International SA",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe61-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe62-0000-1000-8000-00805f9b34fb")));
        assertEquals("Indagem Tech LLC",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe62-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe63-0000-1000-8000-00805f9b34fb")));
        assertEquals("Connected Yard, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe63-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe64-0000-1000-8000-00805f9b34fb")));
        assertEquals("Siemens AG", MEMBER_MAPPING_128.get(UUID.fromString("0000fe64-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe65-0000-1000-8000-00805f9b34fb")));
        assertEquals("CHIPOLO d.o.o.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe65-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe66-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intel Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe66-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe67-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lab Sensor Solutions",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe67-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe68-0000-1000-8000-00805f9b34fb")));
        assertEquals("Capsle Technologies Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe68-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe69-0000-1000-8000-00805f9b34fb")));
        assertEquals("Capsle Technologies Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe69-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe6a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kontakt Micro-Location Sp. z o.o.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe6a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe6b-0000-1000-8000-00805f9b34fb")));
        assertEquals("TASER International, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe6b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe6c-0000-1000-8000-00805f9b34fb")));
        assertEquals("TASER International, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe6c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe6d-0000-1000-8000-00805f9b34fb")));
        assertEquals("The University of Tokyo",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe6d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe6e-0000-1000-8000-00805f9b34fb")));
        assertEquals("The University of Tokyo",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe6e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe6f-0000-1000-8000-00805f9b34fb")));
        assertEquals("LINE Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe6f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe70-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Jingdong Century Trading Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe70-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe71-0000-1000-8000-00805f9b34fb")));
        assertEquals("Plume Design Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe71-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe72-0000-1000-8000-00805f9b34fb")));
        assertEquals("Abbott (formerly St. Jude Medical, Inc.)",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe72-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe73-0000-1000-8000-00805f9b34fb")));
        assertEquals("Abbott (formerly St. Jude Medical, Inc.)",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe73-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe74-0000-1000-8000-00805f9b34fb")));
        assertEquals("unwire", MEMBER_MAPPING_128.get(UUID.fromString("0000fe74-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe75-0000-1000-8000-00805f9b34fb")));
        assertEquals("TangoMe", MEMBER_MAPPING_128.get(UUID.fromString("0000fe75-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe76-0000-1000-8000-00805f9b34fb")));
        assertEquals("TangoMe", MEMBER_MAPPING_128.get(UUID.fromString("0000fe76-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe77-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hewlett-Packard Company",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe77-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe78-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hewlett-Packard Company",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe78-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe79-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zebra Technologies",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe79-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe7a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bragi GmbH", MEMBER_MAPPING_128.get(UUID.fromString("0000fe7a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe7b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Orion Labs, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe7b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe7c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Telit Wireless Solutions (Formerly Stollmann E+V GmbH)",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe7c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe7d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aterica Health Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe7d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe7e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Awear Solutions Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe7e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe7f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Doppler Lab", MEMBER_MAPPING_128.get(UUID.fromString("0000fe7f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe80-0000-1000-8000-00805f9b34fb")));
        assertEquals("Doppler Lab", MEMBER_MAPPING_128.get(UUID.fromString("0000fe80-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe81-0000-1000-8000-00805f9b34fb")));
        assertEquals("Medtronic Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe81-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe82-0000-1000-8000-00805f9b34fb")));
        assertEquals("Medtronic Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe82-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe83-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blue Bite", MEMBER_MAPPING_128.get(UUID.fromString("0000fe83-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe84-0000-1000-8000-00805f9b34fb")));
        assertEquals("RF Digital Corp",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe84-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe85-0000-1000-8000-00805f9b34fb")));
        assertEquals("RF Digital Corp",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe85-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe86-0000-1000-8000-00805f9b34fb")));
        assertEquals("HUAWEI Technologies Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe86-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe87-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qingdao Yeelink Information Technology Co., Ltd. ( 青岛亿联客信息技术有限公司 )",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe87-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe88-0000-1000-8000-00805f9b34fb")));
        assertEquals("SALTO SYSTEMS S.L.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe88-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe89-0000-1000-8000-00805f9b34fb")));
        assertEquals("B&O Play A/S", MEMBER_MAPPING_128.get(UUID.fromString("0000fe89-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe8a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe8a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe8b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe8b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe8c-0000-1000-8000-00805f9b34fb")));
        assertEquals("TRON Forum", MEMBER_MAPPING_128.get(UUID.fromString("0000fe8c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe8d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Interaxon Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe8d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe8e-0000-1000-8000-00805f9b34fb")));
        assertEquals("ARM Ltd", MEMBER_MAPPING_128.get(UUID.fromString("0000fe8e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe8f-0000-1000-8000-00805f9b34fb")));
        assertEquals("CSR", MEMBER_MAPPING_128.get(UUID.fromString("0000fe8f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe90-0000-1000-8000-00805f9b34fb")));
        assertEquals("JUMA", MEMBER_MAPPING_128.get(UUID.fromString("0000fe90-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe91-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Imilab Technology Co.,Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe91-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe92-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jarden Safety & Security",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe92-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe93-0000-1000-8000-00805f9b34fb")));
        assertEquals("OttoQ In", MEMBER_MAPPING_128.get(UUID.fromString("0000fe93-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe94-0000-1000-8000-00805f9b34fb")));
        assertEquals("OttoQ In", MEMBER_MAPPING_128.get(UUID.fromString("0000fe94-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe95-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xiaomi Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fe95-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe96-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tesla Motors Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe96-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe97-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tesla Motors Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe97-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe98-0000-1000-8000-00805f9b34fb")));
        assertEquals("Currant Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000fe98-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe99-0000-1000-8000-00805f9b34fb")));
        assertEquals("Currant Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000fe99-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe9a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Estimote", MEMBER_MAPPING_128.get(UUID.fromString("0000fe9a-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe9b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsara Networks, Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe9b-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe9c-0000-1000-8000-00805f9b34fb")));
        assertEquals("GSI Laboratories, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe9c-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe9d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mobiquity Networks Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe9d-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe9e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dialog Semiconductor B.V.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fe9e-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fe9f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fe9f-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fea0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fea0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fea1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intrepid Control Systems, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fea1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fea2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intrepid Control Systems, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fea2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fea3-0000-1000-8000-00805f9b34fb")));
        assertEquals("ITT Industries", MEMBER_MAPPING_128.get(UUID.fromString("0000fea3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fea4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Paxton Access Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fea4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fea5-0000-1000-8000-00805f9b34fb")));
        assertEquals("GoPro, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fea5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fea6-0000-1000-8000-00805f9b34fb")));
        assertEquals("GoPro, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fea6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fea7-0000-1000-8000-00805f9b34fb")));
        assertEquals("UTC Fire and Security",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fea7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fea8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Savant Systems LLC",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fea8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fea9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Savant Systems LLC",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fea9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feaa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000feaa-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nokia", MEMBER_MAPPING_128.get(UUID.fromString("0000feab-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feac-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nokia", MEMBER_MAPPING_128.get(UUID.fromString("0000feac-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fead-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nokia", MEMBER_MAPPING_128.get(UUID.fromString("0000fead-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feae-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nokia", MEMBER_MAPPING_128.get(UUID.fromString("0000feae-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feaf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nest Labs Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000feaf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feb0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nest Labs Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000feb0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feb1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Electronics Tomorrow Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feb1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feb2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Microsoft Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feb2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feb3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Taobao", MEMBER_MAPPING_128.get(UUID.fromString("0000feb3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feb4-0000-1000-8000-00805f9b34fb")));
        assertEquals("WiSilica Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000feb4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feb5-0000-1000-8000-00805f9b34fb")));
        assertEquals("WiSilica Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000feb5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feb6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vencer Co., Ltd",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feb6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feb7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meta Platforms, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feb7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feb8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meta Platforms, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feb8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feb9-0000-1000-8000-00805f9b34fb")));
        assertEquals("LG Electronics", MEMBER_MAPPING_128.get(UUID.fromString("0000feb9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tencent Holdings Limited",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feba-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000febb-0000-1000-8000-00805f9b34fb")));
        assertEquals("adafruit industries",
                MEMBER_MAPPING_128.get(UUID.fromString("0000febb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000febc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dexcom Inc", MEMBER_MAPPING_128.get(UUID.fromString("0000febc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000febd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Clover Network, Inc",
                MEMBER_MAPPING_128.get(UUID.fromString("0000febd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000febe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bose Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000febe-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000febf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nod, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000febf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fec0-0000-1000-8000-00805f9b34fb")));
        assertEquals("KDDI Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fec0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fec1-0000-1000-8000-00805f9b34fb")));
        assertEquals("KDDI Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fec1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fec2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blue Spark Technologies, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fec2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fec3-0000-1000-8000-00805f9b34fb")));
        assertEquals("360fly, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fec3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fec4-0000-1000-8000-00805f9b34fb")));
        assertEquals("PLUS Location Systems",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fec4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fec5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Realtek Semiconductor Corp.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fec5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fec6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kocomojo, LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fec6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fec7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fec7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fec8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fec8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fec9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fec9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000feca-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fecb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fecb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fecc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fecc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fecd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fecd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fece-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fece-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fecf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fecf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fed0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fed0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fed1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fed1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fed2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fed2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fed3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fed3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fed4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fed4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fed5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Plantronics Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fed5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fed6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Broadcom", MEMBER_MAPPING_128.get(UUID.fromString("0000fed6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fed7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Broadcom", MEMBER_MAPPING_128.get(UUID.fromString("0000fed7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fed8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fed8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fed9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pebble Technology Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fed9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feda-0000-1000-8000-00805f9b34fb")));
        assertEquals("ISSC Technologies Corp.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feda-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fedb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Perka, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fedb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fedc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jawbone", MEMBER_MAPPING_128.get(UUID.fromString("0000fedc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fedd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jawbone", MEMBER_MAPPING_128.get(UUID.fromString("0000fedd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fede-0000-1000-8000-00805f9b34fb")));
        assertEquals("Coin, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fede-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fedf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Design SHIFT", MEMBER_MAPPING_128.get(UUID.fromString("0000fedf-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fee0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anhui Huami Information Technology Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fee0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fee1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anhui Huami Information Technology Co., Ltd.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fee1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fee2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anki, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fee2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fee3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anki, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fee3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fee4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nordic Semiconductor ASA",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fee4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fee5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nordic Semiconductor ASA",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fee5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fee6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Silvair, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fee6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fee7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tencent Holdings Limited.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fee7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fee8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Quintic Corp.", MEMBER_MAPPING_128.get(UUID.fromString("0000fee8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fee9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Quintic Corp.", MEMBER_MAPPING_128.get(UUID.fromString("0000fee9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feea-0000-1000-8000-00805f9b34fb")));
        assertEquals("Swirl Networks, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feea-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feeb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Swirl Networks, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feeb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tile, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000feec-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feed-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tile, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000feed-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Polar Electro Oy",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feee-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feef-0000-1000-8000-00805f9b34fb")));
        assertEquals("Polar Electro Oy",
                MEMBER_MAPPING_128.get(UUID.fromString("0000feef-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fef0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intel", MEMBER_MAPPING_128.get(UUID.fromString("0000fef0-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fef1-0000-1000-8000-00805f9b34fb")));
        assertEquals("CSR", MEMBER_MAPPING_128.get(UUID.fromString("0000fef1-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fef2-0000-1000-8000-00805f9b34fb")));
        assertEquals("CSR", MEMBER_MAPPING_128.get(UUID.fromString("0000fef2-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fef3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fef3-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fef4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google LLC", MEMBER_MAPPING_128.get(UUID.fromString("0000fef4-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fef5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dialog Semiconductor GmbH",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fef5-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fef6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wicentric, Inc.",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fef6-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fef7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aplix Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fef7-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fef8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aplix Corporation",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fef8-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fef9-0000-1000-8000-00805f9b34fb")));
        assertEquals("PayPal, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fef9-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fefa-0000-1000-8000-00805f9b34fb")));
        assertEquals("PayPal, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fefa-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fefb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Telit Wireless Solutions (Formerly Stollmann E+V GmbH)",
                MEMBER_MAPPING_128.get(UUID.fromString("0000fefb-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fefc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gimbal, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fefc-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fefd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gimbal, Inc.", MEMBER_MAPPING_128.get(UUID.fromString("0000fefd-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000fefe-0000-1000-8000-00805f9b34fb")));
        assertEquals("GN Hearing A/S", MEMBER_MAPPING_128.get(UUID.fromString("0000fefe-0000-1000-8000-00805f9b34fb")));
        assertTrue(MEMBER_MAPPING_128.containsKey(UUID.fromString("0000feff-0000-1000-8000-00805f9b34fb")));
        assertEquals("GN Netcom", MEMBER_MAPPING_128.get(UUID.fromString("0000feff-0000-1000-8000-00805f9b34fb")));
    }
}
