package org.im97mori.ble.constants;

import static org.im97mori.ble.constants.CompanyUUID.COMPANY_MAPPING_128;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class CompanyUUIDTest extends TestBase {

    @Test
    public void test_map_00001() {
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000000-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ericsson AB", COMPANY_MAPPING_128.get(UUID.fromString("00000000-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000001-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nokia Mobile Phones",
                COMPANY_MAPPING_128.get(UUID.fromString("00000001-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000002-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intel Corp.", COMPANY_MAPPING_128.get(UUID.fromString("00000002-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000003-0000-1000-8000-00805f9b34fb")));
        assertEquals("IBM Corp.", COMPANY_MAPPING_128.get(UUID.fromString("00000003-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000004-0000-1000-8000-00805f9b34fb")));
        assertEquals("Toshiba Corp.", COMPANY_MAPPING_128.get(UUID.fromString("00000004-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000005-0000-1000-8000-00805f9b34fb")));
        assertEquals("3Com", COMPANY_MAPPING_128.get(UUID.fromString("00000005-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000006-0000-1000-8000-00805f9b34fb")));
        assertEquals("Microsoft", COMPANY_MAPPING_128.get(UUID.fromString("00000006-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000007-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lucent", COMPANY_MAPPING_128.get(UUID.fromString("00000007-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000008-0000-1000-8000-00805f9b34fb")));
        assertEquals("Motorola", COMPANY_MAPPING_128.get(UUID.fromString("00000008-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000009-0000-1000-8000-00805f9b34fb")));
        assertEquals("Infineon Technologies AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000009-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000000a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm Technologies International, Ltd. (QTIL)",
                COMPANY_MAPPING_128.get(UUID.fromString("0000000a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000000b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Silicon Wave", COMPANY_MAPPING_128.get(UUID.fromString("0000000b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000000c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Digianswer A/S",
                COMPANY_MAPPING_128.get(UUID.fromString("0000000c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000000d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Texas Instruments Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000000d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000000e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Parthus Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000000e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000000f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Broadcom Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000000f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000010-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mitel Semiconductor",
                COMPANY_MAPPING_128.get(UUID.fromString("00000010-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000011-0000-1000-8000-00805f9b34fb")));
        assertEquals("Widcomm, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000011-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000012-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zeevo, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000012-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000013-0000-1000-8000-00805f9b34fb")));
        assertEquals("Atmel Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000013-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000014-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mitsubishi Electric Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000014-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000015-0000-1000-8000-00805f9b34fb")));
        assertEquals("RTX A/S", COMPANY_MAPPING_128.get(UUID.fromString("00000015-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000016-0000-1000-8000-00805f9b34fb")));
        assertEquals("KC Technology Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000016-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000017-0000-1000-8000-00805f9b34fb")));
        assertEquals("Newlogic", COMPANY_MAPPING_128.get(UUID.fromString("00000017-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000018-0000-1000-8000-00805f9b34fb")));
        assertEquals("Transilica, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000018-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000019-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rohde & Schwarz GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000019-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000001a-0000-1000-8000-00805f9b34fb")));
        assertEquals("TTPCom Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000001a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000001b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Signia Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000001b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000001c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Conexant Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000001c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000001d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm", COMPANY_MAPPING_128.get(UUID.fromString("0000001d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000001e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inventel", COMPANY_MAPPING_128.get(UUID.fromString("0000001e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000001f-0000-1000-8000-00805f9b34fb")));
        assertEquals("AVM Berlin", COMPANY_MAPPING_128.get(UUID.fromString("0000001f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000020-0000-1000-8000-00805f9b34fb")));
        assertEquals("BandSpeed, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000020-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000021-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mansella Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000021-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000022-0000-1000-8000-00805f9b34fb")));
        assertEquals("NEC Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000022-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000023-0000-1000-8000-00805f9b34fb")));
        assertEquals("WavePlus Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000023-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000024-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alcatel", COMPANY_MAPPING_128.get(UUID.fromString("00000024-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000025-0000-1000-8000-00805f9b34fb")));
        assertEquals("NXP B.V.", COMPANY_MAPPING_128.get(UUID.fromString("00000025-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000026-0000-1000-8000-00805f9b34fb")));
        assertEquals("C Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000026-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000027-0000-1000-8000-00805f9b34fb")));
        assertEquals("Open Interface",
                COMPANY_MAPPING_128.get(UUID.fromString("00000027-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000028-0000-1000-8000-00805f9b34fb")));
        assertEquals("R F Micro Devices",
                COMPANY_MAPPING_128.get(UUID.fromString("00000028-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000029-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hitachi Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000029-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000002a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Symbol Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000002a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000002b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tenovis", COMPANY_MAPPING_128.get(UUID.fromString("0000002b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000002c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Macronix International Co. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000002c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000002d-0000-1000-8000-00805f9b34fb")));
        assertEquals("GCT Semiconductor",
                COMPANY_MAPPING_128.get(UUID.fromString("0000002d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000002e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Norwood Systems",
                COMPANY_MAPPING_128.get(UUID.fromString("0000002e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000002f-0000-1000-8000-00805f9b34fb")));
        assertEquals("MewTel Technology Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000002f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000030-0000-1000-8000-00805f9b34fb")));
        assertEquals("ST Microelectronics",
                COMPANY_MAPPING_128.get(UUID.fromString("00000030-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000031-0000-1000-8000-00805f9b34fb")));
        assertEquals("Synopsys, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000031-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000032-0000-1000-8000-00805f9b34fb")));
        assertEquals("Red-M (Communications) Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000032-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000033-0000-1000-8000-00805f9b34fb")));
        assertEquals("Commil Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000033-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000034-0000-1000-8000-00805f9b34fb")));
        assertEquals("Computer Access Technology Corporation (CATC)",
                COMPANY_MAPPING_128.get(UUID.fromString("00000034-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000035-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eclipse (HQ Espana) S.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000035-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000036-0000-1000-8000-00805f9b34fb")));
        assertEquals("Renesas Electronics Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000036-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000037-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mobilian Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000037-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000038-0000-1000-8000-00805f9b34fb")));
        assertEquals("Syntronix Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000038-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000039-0000-1000-8000-00805f9b34fb")));
        assertEquals("Integrated System Solution Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000039-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000003a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Panasonic Holdings Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000003a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000003b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gennum Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000003b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000003c-0000-1000-8000-00805f9b34fb")));
        assertEquals("BlackBerry Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000003c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000003d-0000-1000-8000-00805f9b34fb")));
        assertEquals("IPextreme, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000003d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000003e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Systems and Chips, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000003e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000003f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bluetooth SIG, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000003f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000040-0000-1000-8000-00805f9b34fb")));
        assertEquals("Seiko Epson Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000040-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000041-0000-1000-8000-00805f9b34fb")));
        assertEquals("Integrated Silicon Solution Taiwan, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000041-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000042-0000-1000-8000-00805f9b34fb")));
        assertEquals("CONWISE Technology Corporation Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000042-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000043-0000-1000-8000-00805f9b34fb")));
        assertEquals("PARROT AUTOMOTIVE SAS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000043-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000044-0000-1000-8000-00805f9b34fb")));
        assertEquals("Socket Mobile", COMPANY_MAPPING_128.get(UUID.fromString("00000044-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000045-0000-1000-8000-00805f9b34fb")));
        assertEquals("Atheros Communications, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000045-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000046-0000-1000-8000-00805f9b34fb")));
        assertEquals("MediaTek, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000046-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000047-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bluegiga", COMPANY_MAPPING_128.get(UUID.fromString("00000047-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000048-0000-1000-8000-00805f9b34fb")));
        assertEquals("Marvell Technology Group Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000048-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000049-0000-1000-8000-00805f9b34fb")));
        assertEquals("3DSP Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000049-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000004a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Accel Semiconductor Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000004a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000004b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Continental Automotive Systems",
                COMPANY_MAPPING_128.get(UUID.fromString("0000004b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000004c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apple, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000004c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000004d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Staccato Communications, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000004d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000004e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Avago Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("0000004e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000004f-0000-1000-8000-00805f9b34fb")));
        assertEquals("APT Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("0000004f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000050-0000-1000-8000-00805f9b34fb")));
        assertEquals("SiRF Technology, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000050-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000051-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tzero Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000051-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000052-0000-1000-8000-00805f9b34fb")));
        assertEquals("J&M Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000052-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000053-0000-1000-8000-00805f9b34fb")));
        assertEquals("Free2move AB", COMPANY_MAPPING_128.get(UUID.fromString("00000053-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000054-0000-1000-8000-00805f9b34fb")));
        assertEquals("3DiJoy Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000054-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000055-0000-1000-8000-00805f9b34fb")));
        assertEquals("Plantronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000055-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000056-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sony Ericsson Mobile Communications",
                COMPANY_MAPPING_128.get(UUID.fromString("00000056-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000057-0000-1000-8000-00805f9b34fb")));
        assertEquals("Harman International Industries, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000057-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000058-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vizio, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000058-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000059-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nordic Semiconductor ASA",
                COMPANY_MAPPING_128.get(UUID.fromString("00000059-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000005a-0000-1000-8000-00805f9b34fb")));
        assertEquals("EM Microelectronic-Marin SA",
                COMPANY_MAPPING_128.get(UUID.fromString("0000005a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000005b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ralink Technology Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000005b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000005c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Belkin International, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000005c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000005d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Realtek Semiconductor Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000005d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000005e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Stonestreet One, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000005e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000005f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wicentric, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000005f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000060-0000-1000-8000-00805f9b34fb")));
        assertEquals("RivieraWaves S.A.S",
                COMPANY_MAPPING_128.get(UUID.fromString("00000060-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000061-0000-1000-8000-00805f9b34fb")));
        assertEquals("RDA Microelectronics",
                COMPANY_MAPPING_128.get(UUID.fromString("00000061-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000062-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gibson Guitars",
                COMPANY_MAPPING_128.get(UUID.fromString("00000062-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000063-0000-1000-8000-00805f9b34fb")));
        assertEquals("MiCommand Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000063-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000064-0000-1000-8000-00805f9b34fb")));
        assertEquals("Band XI International, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000064-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000065-0000-1000-8000-00805f9b34fb")));
        assertEquals("HP, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000065-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000066-0000-1000-8000-00805f9b34fb")));
        assertEquals("9Solutions Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000066-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000067-0000-1000-8000-00805f9b34fb")));
        assertEquals("GN Audio A/S", COMPANY_MAPPING_128.get(UUID.fromString("00000067-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000068-0000-1000-8000-00805f9b34fb")));
        assertEquals("General Motors",
                COMPANY_MAPPING_128.get(UUID.fromString("00000068-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000069-0000-1000-8000-00805f9b34fb")));
        assertEquals("A&D Engineering, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000069-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000006a-0000-1000-8000-00805f9b34fb")));
        assertEquals("MindTree Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("0000006a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000006b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Polar Electro OY",
                COMPANY_MAPPING_128.get(UUID.fromString("0000006b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000006c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beautiful Enterprise Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000006c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000006d-0000-1000-8000-00805f9b34fb")));
        assertEquals("BriarTek, Inc", COMPANY_MAPPING_128.get(UUID.fromString("0000006d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000006e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Summit Data Communications, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000006e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000006f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sound ID", COMPANY_MAPPING_128.get(UUID.fromString("0000006f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000070-0000-1000-8000-00805f9b34fb")));
        assertEquals("Monster, LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000070-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000071-0000-1000-8000-00805f9b34fb")));
        assertEquals("connectBlue AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000071-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000072-0000-1000-8000-00805f9b34fb")));
        assertEquals("ShangHai Super Smart Electronics Co. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000072-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000073-0000-1000-8000-00805f9b34fb")));
        assertEquals("Group Sense Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000073-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000074-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zomm, LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000074-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000075-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsung Electronics Co. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000075-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000076-0000-1000-8000-00805f9b34fb")));
        assertEquals("Creative Technology Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000076-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000077-0000-1000-8000-00805f9b34fb")));
        assertEquals("Laird Connectivity LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000077-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000078-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nike, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000078-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000079-0000-1000-8000-00805f9b34fb")));
        assertEquals("lesswire AG", COMPANY_MAPPING_128.get(UUID.fromString("00000079-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000007a-0000-1000-8000-00805f9b34fb")));
        assertEquals("MStar Semiconductor, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000007a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000007b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hanlynn Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("0000007b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000007c-0000-1000-8000-00805f9b34fb")));
        assertEquals("A & R Cambridge",
                COMPANY_MAPPING_128.get(UUID.fromString("0000007c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000007d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Seers Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000007d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000007e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sports Tracking Technologies Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000007e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000007f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Autonet Mobile",
                COMPANY_MAPPING_128.get(UUID.fromString("0000007f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000080-0000-1000-8000-00805f9b34fb")));
        assertEquals("DeLorme Publishing Company, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000080-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000081-0000-1000-8000-00805f9b34fb")));
        assertEquals("WuXi Vimicro", COMPANY_MAPPING_128.get(UUID.fromString("00000081-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000082-0000-1000-8000-00805f9b34fb")));
        assertEquals("DSEA A/S", COMPANY_MAPPING_128.get(UUID.fromString("00000082-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000083-0000-1000-8000-00805f9b34fb")));
        assertEquals("TimeKeeping Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000083-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000084-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ludus Helsinki Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000084-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000085-0000-1000-8000-00805f9b34fb")));
        assertEquals("BlueRadios, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000085-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000086-0000-1000-8000-00805f9b34fb")));
        assertEquals("Equinux AG", COMPANY_MAPPING_128.get(UUID.fromString("00000086-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000087-0000-1000-8000-00805f9b34fb")));
        assertEquals("Garmin International, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000087-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000088-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ecotest", COMPANY_MAPPING_128.get(UUID.fromString("00000088-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000089-0000-1000-8000-00805f9b34fb")));
        assertEquals("GN Hearing A/S",
                COMPANY_MAPPING_128.get(UUID.fromString("00000089-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000008a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jawbone", COMPANY_MAPPING_128.get(UUID.fromString("0000008a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000008b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Topcon Positioning Systems, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000008b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000008c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gimbal Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000008c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000008d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zscan Software",
                COMPANY_MAPPING_128.get(UUID.fromString("0000008d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000008e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Quintic Corp", COMPANY_MAPPING_128.get(UUID.fromString("0000008e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000008f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Telit Wireless Solutions GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000008f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000090-0000-1000-8000-00805f9b34fb")));
        assertEquals("Funai Electric Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000090-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000091-0000-1000-8000-00805f9b34fb")));
        assertEquals("Advanced PANMOBIL systems GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000091-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000092-0000-1000-8000-00805f9b34fb")));
        assertEquals("ThinkOptics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000092-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000093-0000-1000-8000-00805f9b34fb")));
        assertEquals("Universal Electronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000093-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000094-0000-1000-8000-00805f9b34fb")));
        assertEquals("Airoha Technology Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000094-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000095-0000-1000-8000-00805f9b34fb")));
        assertEquals("NEC Lighting, Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000095-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000096-0000-1000-8000-00805f9b34fb")));
        assertEquals("ODM Technology, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000096-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000097-0000-1000-8000-00805f9b34fb")));
        assertEquals("ConnecteDevice Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000097-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000098-0000-1000-8000-00805f9b34fb")));
        assertEquals("zero1.tv GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000098-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000099-0000-1000-8000-00805f9b34fb")));
        assertEquals("i.Tech Dynamic Global Distribution Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000099-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000009a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alpwise", COMPANY_MAPPING_128.get(UUID.fromString("0000009a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000009b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jiangsu Toppower Automotive Electronics Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000009b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000009c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Colorfy, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000009c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000009d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geoforce Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000009d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000009e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bose Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000009e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000009f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Suunto Oy", COMPANY_MAPPING_128.get(UUID.fromString("0000009f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000a0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kensington Computer Products Group",
                COMPANY_MAPPING_128.get(UUID.fromString("000000a0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000a1-0000-1000-8000-00805f9b34fb")));
        assertEquals("SR-Medizinelektronik",
                COMPANY_MAPPING_128.get(UUID.fromString("000000a1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000a2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vertu Corporation Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000000a2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000a3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meta Watch Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000a3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000a4-0000-1000-8000-00805f9b34fb")));
        assertEquals("LINAK A/S", COMPANY_MAPPING_128.get(UUID.fromString("000000a4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000a5-0000-1000-8000-00805f9b34fb")));
        assertEquals("OTL Dynamics LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000000a5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000a6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Panda Ocean Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000a6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000a7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Visteon Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000000a7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000a8-0000-1000-8000-00805f9b34fb")));
        assertEquals("ARP Devices Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000000a8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000a9-0000-1000-8000-00805f9b34fb")));
        assertEquals("MARELLI EUROPE S.P.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000a9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000aa-0000-1000-8000-00805f9b34fb")));
        assertEquals("CAEN RFID srl", COMPANY_MAPPING_128.get(UUID.fromString("000000aa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ingenieur-Systemgruppe Zahn GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ac-0000-1000-8000-00805f9b34fb")));
        assertEquals("Green Throttle Games",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ad-0000-1000-8000-00805f9b34fb")));
        assertEquals("Peter Systemtechnik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ae-0000-1000-8000-00805f9b34fb")));
        assertEquals("Omegawave Oy", COMPANY_MAPPING_128.get(UUID.fromString("000000ae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000af-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cinetix", COMPANY_MAPPING_128.get(UUID.fromString("000000af-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000b0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Passif Semiconductor Corp",
                COMPANY_MAPPING_128.get(UUID.fromString("000000b0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000b1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Saris Cycling Group, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000000b1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000b2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bekey A/S", COMPANY_MAPPING_128.get(UUID.fromString("000000b2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000b3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Clarinox Technologies Pty. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000b3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000b4-0000-1000-8000-00805f9b34fb")));
        assertEquals("BDE Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000b4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000b5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Swirl Networks",
                COMPANY_MAPPING_128.get(UUID.fromString("000000b5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000b6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meso international",
                COMPANY_MAPPING_128.get(UUID.fromString("000000b6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000b7-0000-1000-8000-00805f9b34fb")));
        assertEquals("TreLab Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000000b7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000b8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm Innovation Center, Inc. (QuIC)",
                COMPANY_MAPPING_128.get(UUID.fromString("000000b8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000b9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Johnson Controls, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000b9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Starkey Hearing Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000bb-0000-1000-8000-00805f9b34fb")));
        assertEquals("S-Power Electronics Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000000bb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000bc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ace Sensor Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000000bc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000bd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aplix Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000000bd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000be-0000-1000-8000-00805f9b34fb")));
        assertEquals("AAMP of America",
                COMPANY_MAPPING_128.get(UUID.fromString("000000be-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000bf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Stalmart Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000000bf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000c0-0000-1000-8000-00805f9b34fb")));
        assertEquals("AMICCOM Electronics Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000000c0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000c1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Excelsecu Data Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000000c1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000c2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geneq Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000000c2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000c3-0000-1000-8000-00805f9b34fb")));
        assertEquals("adidas AG", COMPANY_MAPPING_128.get(UUID.fromString("000000c3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000c4-0000-1000-8000-00805f9b34fb")));
        assertEquals("LG Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("000000c4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000c5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Onset Computer Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000000c5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000c6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Selfly BV", COMPANY_MAPPING_128.get(UUID.fromString("000000c6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000c7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Quuppa Oy.", COMPANY_MAPPING_128.get(UUID.fromString("000000c7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000c8-0000-1000-8000-00805f9b34fb")));
        assertEquals("GeLo Inc", COMPANY_MAPPING_128.get(UUID.fromString("000000c8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000c9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Evluma", COMPANY_MAPPING_128.get(UUID.fromString("000000c9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ca-0000-1000-8000-00805f9b34fb")));
        assertEquals("MC10", COMPANY_MAPPING_128.get(UUID.fromString("000000ca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000cb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Binauric SE", COMPANY_MAPPING_128.get(UUID.fromString("000000cb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000cc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beats Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("000000cc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000cd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Microchip Technology Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000cd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ce-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eve Systems GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000cf-0000-1000-8000-00805f9b34fb")));
        assertEquals("ARCHOS SA", COMPANY_MAPPING_128.get(UUID.fromString("000000cf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000d0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dexcom, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000000d0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000d1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Polar Electro Europe B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000d1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000d2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dialog Semiconductor B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000d2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000d3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Taixingbang Technology (HK) Co,. LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000d3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000d4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kawantech", COMPANY_MAPPING_128.get(UUID.fromString("000000d4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000d5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Austco Communication Systems",
                COMPANY_MAPPING_128.get(UUID.fromString("000000d5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000d6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Timex Group USA, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000d6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000d7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000d7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000d8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm Connected Experiences, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000d8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000d9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Voyetra Turtle Beach",
                COMPANY_MAPPING_128.get(UUID.fromString("000000d9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000da-0000-1000-8000-00805f9b34fb")));
        assertEquals("txtr GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000000da-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000db-0000-1000-8000-00805f9b34fb")));
        assertEquals("Snuza (Pty) Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000000db-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000dc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Procter & Gamble",
                COMPANY_MAPPING_128.get(UUID.fromString("000000dc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000dd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hosiden Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000000dd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000de-0000-1000-8000-00805f9b34fb")));
        assertEquals("Muzik LLC", COMPANY_MAPPING_128.get(UUID.fromString("000000de-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000df-0000-1000-8000-00805f9b34fb")));
        assertEquals("Misfit Wearables Corp",
                COMPANY_MAPPING_128.get(UUID.fromString("000000df-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000e0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Google", COMPANY_MAPPING_128.get(UUID.fromString("000000e0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000e1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Danlers Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000000e1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000e2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Semilink Inc", COMPANY_MAPPING_128.get(UUID.fromString("000000e2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000e3-0000-1000-8000-00805f9b34fb")));
        assertEquals("inMusic Brands, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000000e3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000e4-0000-1000-8000-00805f9b34fb")));
        assertEquals("L.S. Research, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000e4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000e5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eden Software Consultants Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000e5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000e6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Freshtemp", COMPANY_MAPPING_128.get(UUID.fromString("000000e6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000e7-0000-1000-8000-00805f9b34fb")));
        assertEquals("KS Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("000000e7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000e8-0000-1000-8000-00805f9b34fb")));
        assertEquals("ACTS Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("000000e8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000e9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vtrack Systems",
                COMPANY_MAPPING_128.get(UUID.fromString("000000e9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ea-0000-1000-8000-00805f9b34fb")));
        assertEquals("www.vtracksystems.com",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000eb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Server Technology Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000eb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ec-0000-1000-8000-00805f9b34fb")));
        assertEquals("BioResearch Associates",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ed-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jolly Logic, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Above Average Outcomes, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ef-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bitsplitters GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000f0-0000-1000-8000-00805f9b34fb")));
        assertEquals("PayPal, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000000f0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000f1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Witron Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000000f1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000f2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Morse Project Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000f2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000f3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kent Displays Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000f3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000f4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nautilus Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000000f4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000f5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smartifier Oy", COMPANY_MAPPING_128.get(UUID.fromString("000000f5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000f6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Elcometer Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000000f6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000f7-0000-1000-8000-00805f9b34fb")));
        assertEquals("VSN Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000f7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000f8-0000-1000-8000-00805f9b34fb")));
        assertEquals("AceUni Corp., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000000f8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000f9-0000-1000-8000-00805f9b34fb")));
        assertEquals("StickNFind", COMPANY_MAPPING_128.get(UUID.fromString("000000f9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000fa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Crystal Alarm AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000000fa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000fb-0000-1000-8000-00805f9b34fb")));
        assertEquals("KOUKAAM a.s.", COMPANY_MAPPING_128.get(UUID.fromString("000000fb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000fc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Delphi Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000000fc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000fd-0000-1000-8000-00805f9b34fb")));
        assertEquals("ValenceTech Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000000fd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000fe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Stanley Black and Decker",
                COMPANY_MAPPING_128.get(UUID.fromString("000000fe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000000ff-0000-1000-8000-00805f9b34fb")));
        assertEquals("Typo Products, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000000ff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000100-0000-1000-8000-00805f9b34fb")));
        assertEquals("TomTom International BV",
                COMPANY_MAPPING_128.get(UUID.fromString("00000100-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000101-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fugoo, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000101-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000102-0000-1000-8000-00805f9b34fb")));
        assertEquals("Keiser Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000102-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000103-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bang & Olufsen A/S",
                COMPANY_MAPPING_128.get(UUID.fromString("00000103-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000104-0000-1000-8000-00805f9b34fb")));
        assertEquals("PLUS Location Systems Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000104-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000105-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ubiquitous Computing Technology Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000105-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000106-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innovative Yachtter Solutions",
                COMPANY_MAPPING_128.get(UUID.fromString("00000106-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000107-0000-1000-8000-00805f9b34fb")));
        assertEquals("Demant A/S", COMPANY_MAPPING_128.get(UUID.fromString("00000107-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000108-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chicony Electronics Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000108-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000109-0000-1000-8000-00805f9b34fb")));
        assertEquals("Atus BV", COMPANY_MAPPING_128.get(UUID.fromString("00000109-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000010a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Codegate Ltd", COMPANY_MAPPING_128.get(UUID.fromString("0000010a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000010b-0000-1000-8000-00805f9b34fb")));
        assertEquals("ERi, Inc", COMPANY_MAPPING_128.get(UUID.fromString("0000010b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000010c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Transducers Direct, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000010c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000010d-0000-1000-8000-00805f9b34fb")));
        assertEquals("DENSO TEN Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000010d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000010e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Audi AG", COMPANY_MAPPING_128.get(UUID.fromString("0000010e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000010f-0000-1000-8000-00805f9b34fb")));
        assertEquals("HiSilicon Technologies CO., LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("0000010f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000110-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nippon Seiki Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000110-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000111-0000-1000-8000-00805f9b34fb")));
        assertEquals("Steelseries ApS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000111-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000112-0000-1000-8000-00805f9b34fb")));
        assertEquals("Visybl Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000112-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000113-0000-1000-8000-00805f9b34fb")));
        assertEquals("Openbrain Technologies, Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000113-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000114-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xensr", COMPANY_MAPPING_128.get(UUID.fromString("00000114-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000115-0000-1000-8000-00805f9b34fb")));
        assertEquals("e.solutions", COMPANY_MAPPING_128.get(UUID.fromString("00000115-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000116-0000-1000-8000-00805f9b34fb")));
        assertEquals("10AK Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000116-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000117-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wimoto Technologies Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000117-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000118-0000-1000-8000-00805f9b34fb")));
        assertEquals("Radius Networks, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000118-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000119-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wize Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000119-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000011a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm Labs, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000011a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000011b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hewlett Packard Enterprise",
                COMPANY_MAPPING_128.get(UUID.fromString("0000011b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000011c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Baidu", COMPANY_MAPPING_128.get(UUID.fromString("0000011c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000011d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Arendi AG", COMPANY_MAPPING_128.get(UUID.fromString("0000011d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000011e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Skoda Auto a.s.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000011e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000011f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Volkswagen AG", COMPANY_MAPPING_128.get(UUID.fromString("0000011f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000120-0000-1000-8000-00805f9b34fb")));
        assertEquals("Porsche AG", COMPANY_MAPPING_128.get(UUID.fromString("00000120-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000121-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sino Wealth Electronic Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000121-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000122-0000-1000-8000-00805f9b34fb")));
        assertEquals("AirTurn, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000122-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000123-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kinsa, Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000123-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000124-0000-1000-8000-00805f9b34fb")));
        assertEquals("HID Global", COMPANY_MAPPING_128.get(UUID.fromString("00000124-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000125-0000-1000-8000-00805f9b34fb")));
        assertEquals("SEAT es", COMPANY_MAPPING_128.get(UUID.fromString("00000125-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000126-0000-1000-8000-00805f9b34fb")));
        assertEquals("Promethean Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000126-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000127-0000-1000-8000-00805f9b34fb")));
        assertEquals("Salutica Allied Solutions",
                COMPANY_MAPPING_128.get(UUID.fromString("00000127-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000128-0000-1000-8000-00805f9b34fb")));
        assertEquals("GPSI Group Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000128-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000129-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nimble Devices Oy",
                COMPANY_MAPPING_128.get(UUID.fromString("00000129-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000012a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Changzhou Yongse Infotech  Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000012a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000012b-0000-1000-8000-00805f9b34fb")));
        assertEquals("SportIQ", COMPANY_MAPPING_128.get(UUID.fromString("0000012b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000012c-0000-1000-8000-00805f9b34fb")));
        assertEquals("TEMEC Instruments B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000012c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000012d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sony Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000012d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000012e-0000-1000-8000-00805f9b34fb")));
        assertEquals("ASSA ABLOY", COMPANY_MAPPING_128.get(UUID.fromString("0000012e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000012f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Clarion Co. Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000012f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000130-0000-1000-8000-00805f9b34fb")));
        assertEquals("Warehouse Innovations",
                COMPANY_MAPPING_128.get(UUID.fromString("00000130-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000131-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cypress Semiconductor",
                COMPANY_MAPPING_128.get(UUID.fromString("00000131-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000132-0000-1000-8000-00805f9b34fb")));
        assertEquals("MADS Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000132-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000133-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blue Maestro Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000133-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000134-0000-1000-8000-00805f9b34fb")));
        assertEquals("Resolution Products, Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000134-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000135-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aireware LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000135-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000136-0000-1000-8000-00805f9b34fb")));
        assertEquals("Silvair, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000136-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000137-0000-1000-8000-00805f9b34fb")));
        assertEquals("Prestigio Plaza Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000137-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000138-0000-1000-8000-00805f9b34fb")));
        assertEquals("NTEO Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000138-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000139-0000-1000-8000-00805f9b34fb")));
        assertEquals("Focus Systems Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000139-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000013a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tencent Holdings Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000013a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000013b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Allegion", COMPANY_MAPPING_128.get(UUID.fromString("0000013b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000013c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Murata Manufacturing Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000013c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000013d-0000-1000-8000-00805f9b34fb")));
        assertEquals("WirelessWERX", COMPANY_MAPPING_128.get(UUID.fromString("0000013d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000013e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nod, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000013e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000013f-0000-1000-8000-00805f9b34fb")));
        assertEquals("B&B Manufacturing Company",
                COMPANY_MAPPING_128.get(UUID.fromString("0000013f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000140-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alpine Electronics (China) Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000140-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000141-0000-1000-8000-00805f9b34fb")));
        assertEquals("FedEx Services",
                COMPANY_MAPPING_128.get(UUID.fromString("00000141-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000142-0000-1000-8000-00805f9b34fb")));
        assertEquals("Grape Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000142-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000143-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bkon Connect", COMPANY_MAPPING_128.get(UUID.fromString("00000143-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000144-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lintech GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000144-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000145-0000-1000-8000-00805f9b34fb")));
        assertEquals("Novatel Wireless",
                COMPANY_MAPPING_128.get(UUID.fromString("00000145-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000146-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ciright", COMPANY_MAPPING_128.get(UUID.fromString("00000146-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000147-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mighty Cast, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000147-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000148-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ambimat Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("00000148-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000149-0000-1000-8000-00805f9b34fb")));
        assertEquals("Perytons Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("00000149-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000014a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tivoli Audio, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000014a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000014b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Master Lock", COMPANY_MAPPING_128.get(UUID.fromString("0000014b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000014c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mesh-Net Ltd", COMPANY_MAPPING_128.get(UUID.fromString("0000014c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000014d-0000-1000-8000-00805f9b34fb")));
        assertEquals("HUIZHOU DESAY SV AUTOMOTIVE CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000014d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000014e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tangerine, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000014e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000014f-0000-1000-8000-00805f9b34fb")));
        assertEquals("B&W Group Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000014f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000150-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pioneer Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000150-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000151-0000-1000-8000-00805f9b34fb")));
        assertEquals("OnBeep", COMPANY_MAPPING_128.get(UUID.fromString("00000151-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000152-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vernier Software & Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("00000152-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000153-0000-1000-8000-00805f9b34fb")));
        assertEquals("ROL Ergo", COMPANY_MAPPING_128.get(UUID.fromString("00000153-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000154-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pebble Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("00000154-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000155-0000-1000-8000-00805f9b34fb")));
        assertEquals("NETATMO", COMPANY_MAPPING_128.get(UUID.fromString("00000155-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000156-0000-1000-8000-00805f9b34fb")));
        assertEquals("Accumulate AB", COMPANY_MAPPING_128.get(UUID.fromString("00000156-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000157-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anhui Huami Information Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000157-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000158-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inmite s.r.o.", COMPANY_MAPPING_128.get(UUID.fromString("00000158-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000159-0000-1000-8000-00805f9b34fb")));
        assertEquals("ChefSteps, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000159-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000015a-0000-1000-8000-00805f9b34fb")));
        assertEquals("micas AG", COMPANY_MAPPING_128.get(UUID.fromString("0000015a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000015b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Biomedical Research Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000015b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000015c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pitius Tec S.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000015c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000015d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Estimote, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000015d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000015e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Unikey Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000015e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000015f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Timer Cap Co.", COMPANY_MAPPING_128.get(UUID.fromString("0000015f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000160-0000-1000-8000-00805f9b34fb")));
        assertEquals("AwoX", COMPANY_MAPPING_128.get(UUID.fromString("00000160-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000161-0000-1000-8000-00805f9b34fb")));
        assertEquals("yikes", COMPANY_MAPPING_128.get(UUID.fromString("00000161-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000162-0000-1000-8000-00805f9b34fb")));
        assertEquals("MADSGlobalNZ Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000162-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000163-0000-1000-8000-00805f9b34fb")));
        assertEquals("PCH International",
                COMPANY_MAPPING_128.get(UUID.fromString("00000163-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000164-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qingdao Yeelink Information Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000164-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000165-0000-1000-8000-00805f9b34fb")));
        assertEquals("Milwaukee Electric Tools",
                COMPANY_MAPPING_128.get(UUID.fromString("00000165-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000166-0000-1000-8000-00805f9b34fb")));
        assertEquals("MISHIK Pte Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000166-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000167-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ascensia Diabetes Care US Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000167-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000168-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spicebox LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000168-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000169-0000-1000-8000-00805f9b34fb")));
        assertEquals("emberlight", COMPANY_MAPPING_128.get(UUID.fromString("00000169-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000016a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Emerson Digital Cold Chain, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000016a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000016b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qblinks", COMPANY_MAPPING_128.get(UUID.fromString("0000016b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000016c-0000-1000-8000-00805f9b34fb")));
        assertEquals("MYSPHERA", COMPANY_MAPPING_128.get(UUID.fromString("0000016c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000016d-0000-1000-8000-00805f9b34fb")));
        assertEquals("LifeScan Inc", COMPANY_MAPPING_128.get(UUID.fromString("0000016d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000016e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Volantic AB", COMPANY_MAPPING_128.get(UUID.fromString("0000016e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000016f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Podo Labs, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000016f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000170-0000-1000-8000-00805f9b34fb")));
        assertEquals("Roche Diabetes Care AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000170-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000171-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amazon.com Services LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000171-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000172-0000-1000-8000-00805f9b34fb")));
        assertEquals("Connovate Technology Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000172-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000173-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kocomojo, LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000173-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000174-0000-1000-8000-00805f9b34fb")));
        assertEquals("Everykey Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000174-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000175-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dynamic Controls",
                COMPANY_MAPPING_128.get(UUID.fromString("00000175-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000176-0000-1000-8000-00805f9b34fb")));
        assertEquals("SentriLock", COMPANY_MAPPING_128.get(UUID.fromString("00000176-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000177-0000-1000-8000-00805f9b34fb")));
        assertEquals("I-SYST inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000177-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000178-0000-1000-8000-00805f9b34fb")));
        assertEquals("CASIO COMPUTER CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000178-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000179-0000-1000-8000-00805f9b34fb")));
        assertEquals("LAPIS Semiconductor Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000179-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000017a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Telemonitor, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000017a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000017b-0000-1000-8000-00805f9b34fb")));
        assertEquals("taskit GmbH", COMPANY_MAPPING_128.get(UUID.fromString("0000017b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000017c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mercedes-Benz Group AG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000017c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000017d-0000-1000-8000-00805f9b34fb")));
        assertEquals("BatAndCat", COMPANY_MAPPING_128.get(UUID.fromString("0000017d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000017e-0000-1000-8000-00805f9b34fb")));
        assertEquals("BluDotz Ltd", COMPANY_MAPPING_128.get(UUID.fromString("0000017e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000017f-0000-1000-8000-00805f9b34fb")));
        assertEquals("XTel Wireless ApS",
                COMPANY_MAPPING_128.get(UUID.fromString("0000017f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000180-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gigaset Communications GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000180-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000181-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gecko Health Innovations, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000181-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000182-0000-1000-8000-00805f9b34fb")));
        assertEquals("HOP Ubiquitous",
                COMPANY_MAPPING_128.get(UUID.fromString("00000182-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000183-0000-1000-8000-00805f9b34fb")));
        assertEquals("Walt Disney", COMPANY_MAPPING_128.get(UUID.fromString("00000183-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000184-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nectar", COMPANY_MAPPING_128.get(UUID.fromString("00000184-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000185-0000-1000-8000-00805f9b34fb")));
        assertEquals("bel'apps LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000185-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000186-0000-1000-8000-00805f9b34fb")));
        assertEquals("CORE Lighting Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000186-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000187-0000-1000-8000-00805f9b34fb")));
        assertEquals("Seraphim Sense Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000187-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000188-0000-1000-8000-00805f9b34fb")));
        assertEquals("Unico RBC", COMPANY_MAPPING_128.get(UUID.fromString("00000188-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000189-0000-1000-8000-00805f9b34fb")));
        assertEquals("Physical Enterprises Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000189-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000018a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Able Trend Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000018a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000018b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Konica Minolta, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000018b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000018c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wilo SE", COMPANY_MAPPING_128.get(UUID.fromString("0000018c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000018d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Extron Design Services",
                COMPANY_MAPPING_128.get(UUID.fromString("0000018d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000018e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fitbit, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000018e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000018f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fireflies Systems",
                COMPANY_MAPPING_128.get(UUID.fromString("0000018f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000190-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intelletto Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000190-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000191-0000-1000-8000-00805f9b34fb")));
        assertEquals("FDK CORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("00000191-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000192-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cloudleaf, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000192-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000193-0000-1000-8000-00805f9b34fb")));
        assertEquals("Maveric Automation LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000193-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000194-0000-1000-8000-00805f9b34fb")));
        assertEquals("Acoustic Stream Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000194-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000195-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zuli", COMPANY_MAPPING_128.get(UUID.fromString("00000195-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000196-0000-1000-8000-00805f9b34fb")));
        assertEquals("Paxton Access Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000196-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000197-0000-1000-8000-00805f9b34fb")));
        assertEquals("WiSilica Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000197-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000198-0000-1000-8000-00805f9b34fb")));
        assertEquals("VENGIT Korlatolt Felelossegu Tarsasag",
                COMPANY_MAPPING_128.get(UUID.fromString("00000198-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000199-0000-1000-8000-00805f9b34fb")));
        assertEquals("SALTO SYSTEMS S.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000199-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000019a-0000-1000-8000-00805f9b34fb")));
        assertEquals("TRON Forum", COMPANY_MAPPING_128.get(UUID.fromString("0000019a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000019b-0000-1000-8000-00805f9b34fb")));
        assertEquals("CUBETECH s.r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000019b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000019c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cokiya Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("0000019c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000019d-0000-1000-8000-00805f9b34fb")));
        assertEquals("CVS Health", COMPANY_MAPPING_128.get(UUID.fromString("0000019d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000019e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ceruus", COMPANY_MAPPING_128.get(UUID.fromString("0000019e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000019f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Strainstall Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000019f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001a0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Channel Enterprises (HK) Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001a0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001a1-0000-1000-8000-00805f9b34fb")));
        assertEquals("FIAMM", COMPANY_MAPPING_128.get(UUID.fromString("000001a1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001a2-0000-1000-8000-00805f9b34fb")));
        assertEquals("GIGALANE.CO.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000001a2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001a3-0000-1000-8000-00805f9b34fb")));
        assertEquals("EROAD", COMPANY_MAPPING_128.get(UUID.fromString("000001a3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001a4-0000-1000-8000-00805f9b34fb")));
        assertEquals("MSA Innovation, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000001a4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001a5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Icon Health and Fitness",
                COMPANY_MAPPING_128.get(UUID.fromString("000001a5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001a6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wille Engineering",
                COMPANY_MAPPING_128.get(UUID.fromString("000001a6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001a7-0000-1000-8000-00805f9b34fb")));
        assertEquals("ENERGOUS CORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("000001a7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001a8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Taobao", COMPANY_MAPPING_128.get(UUID.fromString("000001a8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001a9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Canon Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000001a9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001aa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geophysical Technology Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001aa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meta Platforms, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ac-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trividia Health, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ad-0000-1000-8000-00805f9b34fb")));
        assertEquals("FlightSafety International",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ae-0000-1000-8000-00805f9b34fb")));
        assertEquals("Earlens Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001af-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sunrise Micro Devices, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001af-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001b0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Star Micronics Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001b0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001b1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Netizens Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001b1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001b2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nymi Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000001b2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001b3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nytec, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000001b3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001b4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trineo Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001b4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001b5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nest Labs Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001b5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001b6-0000-1000-8000-00805f9b34fb")));
        assertEquals("LM Technologies Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000001b6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001b7-0000-1000-8000-00805f9b34fb")));
        assertEquals("General Electric Company",
                COMPANY_MAPPING_128.get(UUID.fromString("000001b7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001b8-0000-1000-8000-00805f9b34fb")));
        assertEquals("i+D3 S.L.", COMPANY_MAPPING_128.get(UUID.fromString("000001b8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001b9-0000-1000-8000-00805f9b34fb")));
        assertEquals("HANA Micron", COMPANY_MAPPING_128.get(UUID.fromString("000001b9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Stages Cycling LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001bb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cochlear Bone Anchored Solutions AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000001bb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001bc-0000-1000-8000-00805f9b34fb")));
        assertEquals("SenionLab AB", COMPANY_MAPPING_128.get(UUID.fromString("000001bc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001bd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Syszone Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000001bd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001be-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pulsate Mobile Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001be-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001bf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hong Kong HunterSun Electronic Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000001bf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001c0-0000-1000-8000-00805f9b34fb")));
        assertEquals("pironex GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000001c0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001c1-0000-1000-8000-00805f9b34fb")));
        assertEquals("BRADATECH Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001c1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001c2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Transenergooil AG",
                COMPANY_MAPPING_128.get(UUID.fromString("000001c2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001c3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bunch", COMPANY_MAPPING_128.get(UUID.fromString("000001c3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001c4-0000-1000-8000-00805f9b34fb")));
        assertEquals("DME Microelectronics",
                COMPANY_MAPPING_128.get(UUID.fromString("000001c4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001c5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bitcraze AB", COMPANY_MAPPING_128.get(UUID.fromString("000001c5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001c6-0000-1000-8000-00805f9b34fb")));
        assertEquals("HASWARE Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000001c6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001c7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Abiogenix Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001c7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001c8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Poly-Control ApS",
                COMPANY_MAPPING_128.get(UUID.fromString("000001c8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001c9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Avi-on", COMPANY_MAPPING_128.get(UUID.fromString("000001c9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Laerdal Medical AS",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001cb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fetch My Pet", COMPANY_MAPPING_128.get(UUID.fromString("000001cb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001cc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sam Labs Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("000001cc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001cd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chengdu Synwing Technology Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000001cd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ce-0000-1000-8000-00805f9b34fb")));
        assertEquals("HOUWA SYSTEM DESIGN, k.k.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001cf-0000-1000-8000-00805f9b34fb")));
        assertEquals("BSH", COMPANY_MAPPING_128.get(UUID.fromString("000001cf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001d0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Primus Inter Pares Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000001d0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001d1-0000-1000-8000-00805f9b34fb")));
        assertEquals("August Home, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000001d1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001d2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gill Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("000001d2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001d3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sky Wave Design",
                COMPANY_MAPPING_128.get(UUID.fromString("000001d3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001d4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Newlab S.r.l.", COMPANY_MAPPING_128.get(UUID.fromString("000001d4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001d5-0000-1000-8000-00805f9b34fb")));
        assertEquals("ELAD srl", COMPANY_MAPPING_128.get(UUID.fromString("000001d5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001d6-0000-1000-8000-00805f9b34fb")));
        assertEquals("G-wearables inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001d6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001d7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Squadrone Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001d7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001d8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Code Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000001d8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001d9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Savant Systems LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000001d9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001da-0000-1000-8000-00805f9b34fb")));
        assertEquals("Logitech International SA",
                COMPANY_MAPPING_128.get(UUID.fromString("000001da-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001db-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innblue Consulting",
                COMPANY_MAPPING_128.get(UUID.fromString("000001db-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001dc-0000-1000-8000-00805f9b34fb")));
        assertEquals("iParking Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("000001dc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001dd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Koninklijke Philips N.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001dd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001de-0000-1000-8000-00805f9b34fb")));
        assertEquals("Minelab Electronics Pty Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000001de-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001df-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bison Group Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001df-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001e0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Widex A/S", COMPANY_MAPPING_128.get(UUID.fromString("000001e0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001e1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jolla Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000001e1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001e2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lectronix, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001e2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001e3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Caterpillar Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000001e3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001e4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Freedom Innovations",
                COMPANY_MAPPING_128.get(UUID.fromString("000001e4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001e5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dynamic Devices Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000001e5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001e6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Technology Solutions (UK) Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000001e6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001e7-0000-1000-8000-00805f9b34fb")));
        assertEquals("IPS Group Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001e7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001e8-0000-1000-8000-00805f9b34fb")));
        assertEquals("STIR", COMPANY_MAPPING_128.get(UUID.fromString("000001e8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001e9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sano, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000001e9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ea-0000-1000-8000-00805f9b34fb")));
        assertEquals("Advanced Application Design, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001eb-0000-1000-8000-00805f9b34fb")));
        assertEquals("AutoMap LLC", COMPANY_MAPPING_128.get(UUID.fromString("000001eb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spreadtrum Communications Shanghai Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ed-0000-1000-8000-00805f9b34fb")));
        assertEquals("CuteCircuit LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Valeo Service", COMPANY_MAPPING_128.get(UUID.fromString("000001ee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ef-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fullpower Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001f0-0000-1000-8000-00805f9b34fb")));
        assertEquals("KloudNation", COMPANY_MAPPING_128.get(UUID.fromString("000001f0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001f1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zebra Technologies Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000001f1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001f2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Itron, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000001f2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001f3-0000-1000-8000-00805f9b34fb")));
        assertEquals("The University of Tokyo",
                COMPANY_MAPPING_128.get(UUID.fromString("000001f3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001f4-0000-1000-8000-00805f9b34fb")));
        assertEquals("UTC Fire and Security",
                COMPANY_MAPPING_128.get(UUID.fromString("000001f4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001f5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cool Webthings Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000001f5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001f6-0000-1000-8000-00805f9b34fb")));
        assertEquals("DJO Global", COMPANY_MAPPING_128.get(UUID.fromString("000001f6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001f7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gelliner Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000001f7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001f8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anyka (Guangzhou) Microelectronics Technology Co, LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000001f8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001f9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Medtronic Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001f9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001fa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gozio Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000001fa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001fb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Form Lifting, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000001fb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001fc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wahoo Fitness, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000001fc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001fd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kontakt Micro-Location Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001fd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001fe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Radio Systems Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000001fe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000001ff-0000-1000-8000-00805f9b34fb")));
        assertEquals("Freescale Semiconductor, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000001ff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000200-0000-1000-8000-00805f9b34fb")));
        assertEquals("Verifone Systems Pte Ltd. Taiwan Branch",
                COMPANY_MAPPING_128.get(UUID.fromString("00000200-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000201-0000-1000-8000-00805f9b34fb")));
        assertEquals("AR Timing", COMPANY_MAPPING_128.get(UUID.fromString("00000201-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000202-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rigado LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000202-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000203-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kemppi Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000203-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000204-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tapcentive Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000204-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000205-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smartbotics Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000205-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000206-0000-1000-8000-00805f9b34fb")));
        assertEquals("Otter Products, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000206-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000207-0000-1000-8000-00805f9b34fb")));
        assertEquals("STEMP Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000207-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000208-0000-1000-8000-00805f9b34fb")));
        assertEquals("LumiGeek LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000208-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000209-0000-1000-8000-00805f9b34fb")));
        assertEquals("InvisionHeart Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000209-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000020a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Macnica Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000020a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000020b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jaguar Land Rover Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000020b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000020c-0000-1000-8000-00805f9b34fb")));
        assertEquals("CoroWare Technologies, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000020c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000020d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Simplo Technology Co., LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("0000020d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000020e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Omron Healthcare Co., LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("0000020e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000020f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Comodule GMBH", COMPANY_MAPPING_128.get(UUID.fromString("0000020f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000210-0000-1000-8000-00805f9b34fb")));
        assertEquals("ikeGPS", COMPANY_MAPPING_128.get(UUID.fromString("00000210-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000211-0000-1000-8000-00805f9b34fb")));
        assertEquals("Telink Semiconductor Co. Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000211-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000212-0000-1000-8000-00805f9b34fb")));
        assertEquals("Interplan Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000212-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000213-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wyler AG", COMPANY_MAPPING_128.get(UUID.fromString("00000213-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000214-0000-1000-8000-00805f9b34fb")));
        assertEquals("IK Multimedia Production srl",
                COMPANY_MAPPING_128.get(UUID.fromString("00000214-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000215-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lukoton Experience Oy",
                COMPANY_MAPPING_128.get(UUID.fromString("00000215-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000216-0000-1000-8000-00805f9b34fb")));
        assertEquals("MTI Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000216-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000217-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tech4home, Lda",
                COMPANY_MAPPING_128.get(UUID.fromString("00000217-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000218-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hiotech AB", COMPANY_MAPPING_128.get(UUID.fromString("00000218-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000219-0000-1000-8000-00805f9b34fb")));
        assertEquals("DOTT Limited", COMPANY_MAPPING_128.get(UUID.fromString("00000219-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000021a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blue Speck Labs, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000021a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000021b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cisco Systems, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000021b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000021c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mobicomm Inc", COMPANY_MAPPING_128.get(UUID.fromString("0000021c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000021d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Edamic", COMPANY_MAPPING_128.get(UUID.fromString("0000021d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000021e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Goodnet, Ltd", COMPANY_MAPPING_128.get(UUID.fromString("0000021e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000021f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Luster Leaf Products  Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000021f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000220-0000-1000-8000-00805f9b34fb")));
        assertEquals("Manus Machina BV",
                COMPANY_MAPPING_128.get(UUID.fromString("00000220-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000221-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mobiquity Networks Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000221-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000222-0000-1000-8000-00805f9b34fb")));
        assertEquals("Praxis Dynamics",
                COMPANY_MAPPING_128.get(UUID.fromString("00000222-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000223-0000-1000-8000-00805f9b34fb")));
        assertEquals("Philip Morris Products S.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000223-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000224-0000-1000-8000-00805f9b34fb")));
        assertEquals("Comarch SA", COMPANY_MAPPING_128.get(UUID.fromString("00000224-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000225-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nestlé Nespresso S.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000225-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000226-0000-1000-8000-00805f9b34fb")));
        assertEquals("Merlinia A/S", COMPANY_MAPPING_128.get(UUID.fromString("00000226-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000227-0000-1000-8000-00805f9b34fb")));
        assertEquals("LifeBEAM Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000227-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000228-0000-1000-8000-00805f9b34fb")));
        assertEquals("Twocanoes Labs, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000228-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000229-0000-1000-8000-00805f9b34fb")));
        assertEquals("Muoverti Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000229-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000022a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Stamer Musikanlagen GMBH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000022a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000022b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tesla, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000022b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000022c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pharynks Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000022c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000022d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lupine", COMPANY_MAPPING_128.get(UUID.fromString("0000022d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000022e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Siemens AG", COMPANY_MAPPING_128.get(UUID.fromString("0000022e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000022f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huami (Shanghai) Culture Communication CO., LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("0000022f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000230-0000-1000-8000-00805f9b34fb")));
        assertEquals("Foster Electric Company, Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000230-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000231-0000-1000-8000-00805f9b34fb")));
        assertEquals("ETA SA", COMPANY_MAPPING_128.get(UUID.fromString("00000231-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000232-0000-1000-8000-00805f9b34fb")));
        assertEquals("x-Senso Solutions Kft",
                COMPANY_MAPPING_128.get(UUID.fromString("00000232-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000233-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen SuLong Communication Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000233-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000234-0000-1000-8000-00805f9b34fb")));
        assertEquals("FengFan (BeiJing) Technology Co, Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000234-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000235-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qrio Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000235-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000236-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pitpatpet Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000236-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000237-0000-1000-8000-00805f9b34fb")));
        assertEquals("MSHeli s.r.l.", COMPANY_MAPPING_128.get(UUID.fromString("00000237-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000238-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trakm8 Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000238-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000239-0000-1000-8000-00805f9b34fb")));
        assertEquals("JIN CO, Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000239-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000023a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alatech Tehnology",
                COMPANY_MAPPING_128.get(UUID.fromString("0000023a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000023b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing CarePulse Electronic Technology Co, Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000023b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000023c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Awarepoint", COMPANY_MAPPING_128.get(UUID.fromString("0000023c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000023d-0000-1000-8000-00805f9b34fb")));
        assertEquals("ViCentra B.V.", COMPANY_MAPPING_128.get(UUID.fromString("0000023d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000023e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Raven Industries",
                COMPANY_MAPPING_128.get(UUID.fromString("0000023e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000023f-0000-1000-8000-00805f9b34fb")));
        assertEquals("WaveWare Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000023f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000240-0000-1000-8000-00805f9b34fb")));
        assertEquals("Argenox Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000240-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000241-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bragi GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000241-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000242-0000-1000-8000-00805f9b34fb")));
        assertEquals("16Lab Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000242-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000243-0000-1000-8000-00805f9b34fb")));
        assertEquals("Masimo Corp", COMPANY_MAPPING_128.get(UUID.fromString("00000243-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000244-0000-1000-8000-00805f9b34fb")));
        assertEquals("Iotera Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000244-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000245-0000-1000-8000-00805f9b34fb")));
        assertEquals("Endress+Hauser",
                COMPANY_MAPPING_128.get(UUID.fromString("00000245-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000246-0000-1000-8000-00805f9b34fb")));
        assertEquals("ACKme Networks, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000246-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000247-0000-1000-8000-00805f9b34fb")));
        assertEquals("FiftyThree Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000247-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000248-0000-1000-8000-00805f9b34fb")));
        assertEquals("Parker Hannifin Corp",
                COMPANY_MAPPING_128.get(UUID.fromString("00000248-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000249-0000-1000-8000-00805f9b34fb")));
        assertEquals("Transcranial Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000249-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000024a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Uwatec AG", COMPANY_MAPPING_128.get(UUID.fromString("0000024a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000024b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Orlan LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000024b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000024c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blue Clover Devices",
                COMPANY_MAPPING_128.get(UUID.fromString("0000024c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000024d-0000-1000-8000-00805f9b34fb")));
        assertEquals("M-Way Solutions GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000024d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000024e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Microtronics Engineering GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000024e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000024f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Schneider Schreibgeräte GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000024f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000250-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sapphire Circuits LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000250-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000251-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lumo Bodytech Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000251-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000252-0000-1000-8000-00805f9b34fb")));
        assertEquals("UKC Technosolution",
                COMPANY_MAPPING_128.get(UUID.fromString("00000252-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000253-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xicato Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000253-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000254-0000-1000-8000-00805f9b34fb")));
        assertEquals("Playbrush", COMPANY_MAPPING_128.get(UUID.fromString("00000254-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000255-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dai Nippon Printing Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000255-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000256-0000-1000-8000-00805f9b34fb")));
        assertEquals("G24 Power Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000256-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000257-0000-1000-8000-00805f9b34fb")));
        assertEquals("AdBabble Local Commerce Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000257-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000258-0000-1000-8000-00805f9b34fb")));
        assertEquals("Devialet SA", COMPANY_MAPPING_128.get(UUID.fromString("00000258-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000259-0000-1000-8000-00805f9b34fb")));
        assertEquals("ALTYOR", COMPANY_MAPPING_128.get(UUID.fromString("00000259-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000025a-0000-1000-8000-00805f9b34fb")));
        assertEquals("University of Applied Sciences Valais/Haute Ecole Valaisanne",
                COMPANY_MAPPING_128.get(UUID.fromString("0000025a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000025b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Five Interactive, LLC dba Zendo",
                COMPANY_MAPPING_128.get(UUID.fromString("0000025b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000025c-0000-1000-8000-00805f9b34fb")));
        assertEquals("NetEase（Hangzhou）Network co.Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000025c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000025d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lexmark International Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000025d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000025e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fluke Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000025e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000025f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yardarm Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("0000025f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000260-0000-1000-8000-00805f9b34fb")));
        assertEquals("SensaRx", COMPANY_MAPPING_128.get(UUID.fromString("00000260-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000261-0000-1000-8000-00805f9b34fb")));
        assertEquals("SECVRE GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000261-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000262-0000-1000-8000-00805f9b34fb")));
        assertEquals("Glacial Ridge Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000262-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000263-0000-1000-8000-00805f9b34fb")));
        assertEquals("Identiv, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000263-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000264-0000-1000-8000-00805f9b34fb")));
        assertEquals("DDS, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000264-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000265-0000-1000-8000-00805f9b34fb")));
        assertEquals("SMK Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000265-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000266-0000-1000-8000-00805f9b34fb")));
        assertEquals("Schawbel Technologies LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000266-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000267-0000-1000-8000-00805f9b34fb")));
        assertEquals("XMI Systems SA",
                COMPANY_MAPPING_128.get(UUID.fromString("00000267-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000268-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cerevo", COMPANY_MAPPING_128.get(UUID.fromString("00000268-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000269-0000-1000-8000-00805f9b34fb")));
        assertEquals("Torrox GmbH & Co KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000269-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000026a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gemalto", COMPANY_MAPPING_128.get(UUID.fromString("0000026a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000026b-0000-1000-8000-00805f9b34fb")));
        assertEquals("DEKA Research & Development Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000026b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000026c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Domster Tadeusz Szydlowski",
                COMPANY_MAPPING_128.get(UUID.fromString("0000026c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000026d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Technogym SPA", COMPANY_MAPPING_128.get(UUID.fromString("0000026d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000026e-0000-1000-8000-00805f9b34fb")));
        assertEquals("FLEURBAEY BVBA",
                COMPANY_MAPPING_128.get(UUID.fromString("0000026e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000026f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aptcode Solutions",
                COMPANY_MAPPING_128.get(UUID.fromString("0000026f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000270-0000-1000-8000-00805f9b34fb")));
        assertEquals("LSI ADL Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("00000270-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000271-0000-1000-8000-00805f9b34fb")));
        assertEquals("Animas Corp", COMPANY_MAPPING_128.get(UUID.fromString("00000271-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000272-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alps Alpine Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000272-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000273-0000-1000-8000-00805f9b34fb")));
        assertEquals("OCEASOFT", COMPANY_MAPPING_128.get(UUID.fromString("00000273-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000274-0000-1000-8000-00805f9b34fb")));
        assertEquals("Motsai Research",
                COMPANY_MAPPING_128.get(UUID.fromString("00000274-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000275-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geotab", COMPANY_MAPPING_128.get(UUID.fromString("00000275-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000276-0000-1000-8000-00805f9b34fb")));
        assertEquals("E.G.O. Elektro-Geraetebau GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000276-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000277-0000-1000-8000-00805f9b34fb")));
        assertEquals("bewhere inc", COMPANY_MAPPING_128.get(UUID.fromString("00000277-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000278-0000-1000-8000-00805f9b34fb")));
        assertEquals("Johnson Outdoors Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000278-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000279-0000-1000-8000-00805f9b34fb")));
        assertEquals("steute Schaltgerate GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000279-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000027a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ekomini inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000027a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000027b-0000-1000-8000-00805f9b34fb")));
        assertEquals("DEFA AS", COMPANY_MAPPING_128.get(UUID.fromString("0000027b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000027c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aseptika Ltd", COMPANY_MAPPING_128.get(UUID.fromString("0000027c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000027d-0000-1000-8000-00805f9b34fb")));
        assertEquals("HUAWEI Technologies Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000027d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000027e-0000-1000-8000-00805f9b34fb")));
        assertEquals("HabitAware, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000027e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000027f-0000-1000-8000-00805f9b34fb")));
        assertEquals("ruwido austria gmbh",
                COMPANY_MAPPING_128.get(UUID.fromString("0000027f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000280-0000-1000-8000-00805f9b34fb")));
        assertEquals("ITEC corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000280-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000281-0000-1000-8000-00805f9b34fb")));
        assertEquals("StoneL", COMPANY_MAPPING_128.get(UUID.fromString("00000281-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000282-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sonova AG", COMPANY_MAPPING_128.get(UUID.fromString("00000282-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000283-0000-1000-8000-00805f9b34fb")));
        assertEquals("Maven Machines, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000283-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000284-0000-1000-8000-00805f9b34fb")));
        assertEquals("Synapse Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("00000284-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000285-0000-1000-8000-00805f9b34fb")));
        assertEquals("WOWTech Canada Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000285-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000286-0000-1000-8000-00805f9b34fb")));
        assertEquals("RF Code, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000286-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000287-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wally Ventures S.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000287-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000288-0000-1000-8000-00805f9b34fb")));
        assertEquals("Willowbank Electronics Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000288-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000289-0000-1000-8000-00805f9b34fb")));
        assertEquals("SK Telecom", COMPANY_MAPPING_128.get(UUID.fromString("00000289-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000028a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jetro AS", COMPANY_MAPPING_128.get(UUID.fromString("0000028a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000028b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Code Gears LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("0000028b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000028c-0000-1000-8000-00805f9b34fb")));
        assertEquals("NANOLINK APS", COMPANY_MAPPING_128.get(UUID.fromString("0000028c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000028d-0000-1000-8000-00805f9b34fb")));
        assertEquals("IF, LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000028d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000028e-0000-1000-8000-00805f9b34fb")));
        assertEquals("RF Digital Corp",
                COMPANY_MAPPING_128.get(UUID.fromString("0000028e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000028f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Church & Dwight Co., Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000028f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000290-0000-1000-8000-00805f9b34fb")));
        assertEquals("Multibit Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000290-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000291-0000-1000-8000-00805f9b34fb")));
        assertEquals("CliniCloud Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000291-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000292-0000-1000-8000-00805f9b34fb")));
        assertEquals("SwiftSensors", COMPANY_MAPPING_128.get(UUID.fromString("00000292-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000293-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blue Bite", COMPANY_MAPPING_128.get(UUID.fromString("00000293-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000294-0000-1000-8000-00805f9b34fb")));
        assertEquals("ELIAS GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000294-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000295-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sivantos GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000295-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000296-0000-1000-8000-00805f9b34fb")));
        assertEquals("Petzl", COMPANY_MAPPING_128.get(UUID.fromString("00000296-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000297-0000-1000-8000-00805f9b34fb")));
        assertEquals("storm power ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000297-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000298-0000-1000-8000-00805f9b34fb")));
        assertEquals("EISST Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000298-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000299-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inexess Technology Simma KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000299-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000029a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Currant, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000029a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000029b-0000-1000-8000-00805f9b34fb")));
        assertEquals("C2 Development, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000029b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000029c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blue Sky Scientific, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000029c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000029d-0000-1000-8000-00805f9b34fb")));
        assertEquals("ALOTTAZS LABS, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000029d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000029e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kupson spol. s r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000029e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000029f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Areus Engineering GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000029f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002a0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Impossible Camera GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000002a0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002a1-0000-1000-8000-00805f9b34fb")));
        assertEquals("InventureTrack Systems",
                COMPANY_MAPPING_128.get(UUID.fromString("000002a1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002a2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sera4 Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("000002a2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002a3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Itude", COMPANY_MAPPING_128.get(UUID.fromString("000002a3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002a4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pacific Lock Company",
                COMPANY_MAPPING_128.get(UUID.fromString("000002a4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002a5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tendyron Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000002a5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002a6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Robert Bosch GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000002a6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002a7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Illuxtron international B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002a7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002a8-0000-1000-8000-00805f9b34fb")));
        assertEquals("miSport Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("000002a8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002a9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chargelib", COMPANY_MAPPING_128.get(UUID.fromString("000002a9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002aa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Doppler Lab", COMPANY_MAPPING_128.get(UUID.fromString("000002aa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ab-0000-1000-8000-00805f9b34fb")));
        assertEquals("BBPOS Limited", COMPANY_MAPPING_128.get(UUID.fromString("000002ab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ac-0000-1000-8000-00805f9b34fb")));
        assertEquals("RTB Elektronik GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ad-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rx Networks, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ae-0000-1000-8000-00805f9b34fb")));
        assertEquals("WeatherFlow, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002af-0000-1000-8000-00805f9b34fb")));
        assertEquals("Technicolor USA Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002af-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002b0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bestechnic(Shanghai),Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000002b0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002b1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Raden Inc", COMPANY_MAPPING_128.get(UUID.fromString("000002b1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002b2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Oura Health Oy",
                COMPANY_MAPPING_128.get(UUID.fromString("000002b2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002b3-0000-1000-8000-00805f9b34fb")));
        assertEquals("CLABER S.P.A.", COMPANY_MAPPING_128.get(UUID.fromString("000002b3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002b4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hyginex, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000002b4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002b5-0000-1000-8000-00805f9b34fb")));
        assertEquals("HANSHIN ELECTRIC RAILWAY CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002b5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002b6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Schneider Electric",
                COMPANY_MAPPING_128.get(UUID.fromString("000002b6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002b7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Oort Technologies LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000002b7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002b8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chrono Therapeutics",
                COMPANY_MAPPING_128.get(UUID.fromString("000002b8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002b9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rinnai Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000002b9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Swissprime Technologies AG",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002bb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Koha.,Co.Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000002bb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002bc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Genevac Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000002bc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002bd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chemtronics", COMPANY_MAPPING_128.get(UUID.fromString("000002bd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002be-0000-1000-8000-00805f9b34fb")));
        assertEquals("Seguro Technology Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002be-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002bf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Redbird Flight Simulations",
                COMPANY_MAPPING_128.get(UUID.fromString("000002bf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002c0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dash Robotics", COMPANY_MAPPING_128.get(UUID.fromString("000002c0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002c1-0000-1000-8000-00805f9b34fb")));
        assertEquals("LINE Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000002c1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002c2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Guillemot Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000002c2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002c3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Techtronic Power Tools Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000002c3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002c4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wilson Sporting Goods",
                COMPANY_MAPPING_128.get(UUID.fromString("000002c4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002c5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lenovo (Singapore) Pte Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002c5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002c6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ayatan Sensors",
                COMPANY_MAPPING_128.get(UUID.fromString("000002c6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002c7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Electronics Tomorrow Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000002c7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002c8-0000-1000-8000-00805f9b34fb")));
        assertEquals("OneSpan", COMPANY_MAPPING_128.get(UUID.fromString("000002c8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002c9-0000-1000-8000-00805f9b34fb")));
        assertEquals("PayRange Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000002c9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ca-0000-1000-8000-00805f9b34fb")));
        assertEquals("ABOV Semiconductor",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002cb-0000-1000-8000-00805f9b34fb")));
        assertEquals("AINA-Wireless Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002cb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002cc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eijkelkamp Soil & Water",
                COMPANY_MAPPING_128.get(UUID.fromString("000002cc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002cd-0000-1000-8000-00805f9b34fb")));
        assertEquals("BMA ergonomics b.v.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002cd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ce-0000-1000-8000-00805f9b34fb")));
        assertEquals("Teva Branded Pharmaceutical Products R&D, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002cf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anima", COMPANY_MAPPING_128.get(UUID.fromString("000002cf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002d0-0000-1000-8000-00805f9b34fb")));
        assertEquals("3M", COMPANY_MAPPING_128.get(UUID.fromString("000002d0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002d1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Empatica Srl", COMPANY_MAPPING_128.get(UUID.fromString("000002d1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002d2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Afero, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000002d2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002d3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Powercast Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000002d3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002d4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Secuyou ApS", COMPANY_MAPPING_128.get(UUID.fromString("000002d4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002d5-0000-1000-8000-00805f9b34fb")));
        assertEquals("OMRON Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000002d5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002d6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Send Solutions",
                COMPANY_MAPPING_128.get(UUID.fromString("000002d6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002d7-0000-1000-8000-00805f9b34fb")));
        assertEquals("NIPPON SYSTEMWARE CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002d7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002d8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Neosfar", COMPANY_MAPPING_128.get(UUID.fromString("000002d8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002d9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fliegl Agrartechnik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000002d9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002da-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gilvader", COMPANY_MAPPING_128.get(UUID.fromString("000002da-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002db-0000-1000-8000-00805f9b34fb")));
        assertEquals("Digi International Inc (R)",
                COMPANY_MAPPING_128.get(UUID.fromString("000002db-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002dc-0000-1000-8000-00805f9b34fb")));
        assertEquals("DeWalch Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002dc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002dd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Flint Rehabilitation Devices, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000002dd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002de-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsung SDS Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002de-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002df-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blur Product Development",
                COMPANY_MAPPING_128.get(UUID.fromString("000002df-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002e0-0000-1000-8000-00805f9b34fb")));
        assertEquals("University of Michigan",
                COMPANY_MAPPING_128.get(UUID.fromString("000002e0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002e1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Victron Energy BV",
                COMPANY_MAPPING_128.get(UUID.fromString("000002e1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002e2-0000-1000-8000-00805f9b34fb")));
        assertEquals("NTT docomo", COMPANY_MAPPING_128.get(UUID.fromString("000002e2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002e3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Carmanah Technologies Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002e3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002e4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bytestorm Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002e4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002e5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Espressif Systems (Shanghai) Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002e5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002e6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Unwire", COMPANY_MAPPING_128.get(UUID.fromString("000002e6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002e7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Connected Yard, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002e7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002e8-0000-1000-8000-00805f9b34fb")));
        assertEquals("American Music Environments",
                COMPANY_MAPPING_128.get(UUID.fromString("000002e8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002e9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensogram Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002e9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ea-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fujitsu Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002eb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ardic Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("000002eb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Delta Systems, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ed-0000-1000-8000-00805f9b34fb")));
        assertEquals("HTC Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Citizen Holdings Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ef-0000-1000-8000-00805f9b34fb")));
        assertEquals("SMART-INNOVATION.inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002f0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blackrat Software",
                COMPANY_MAPPING_128.get(UUID.fromString("000002f0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002f1-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Idea Cave, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000002f1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002f2-0000-1000-8000-00805f9b34fb")));
        assertEquals("GoPro, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000002f2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002f3-0000-1000-8000-00805f9b34fb")));
        assertEquals("AuthAir, Inc", COMPANY_MAPPING_128.get(UUID.fromString("000002f3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002f4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vensi, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000002f4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002f5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Indagem Tech LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000002f5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002f6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intemo Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("000002f6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002f7-0000-1000-8000-00805f9b34fb")));
        assertEquals("DreamVisions co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002f7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002f8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Runteq Oy Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000002f8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002f9-0000-1000-8000-00805f9b34fb")));
        assertEquals("IMAGINATION TECHNOLOGIES LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000002f9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002fa-0000-1000-8000-00805f9b34fb")));
        assertEquals("CoSTAR TEchnologies",
                COMPANY_MAPPING_128.get(UUID.fromString("000002fa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002fb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Clarius Mobile Health Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002fb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002fc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Frequen Microelectronics Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002fc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002fd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Uwanna, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000002fd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002fe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lierda Science & Technology Group Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000002fe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000002ff-0000-1000-8000-00805f9b34fb")));
        assertEquals("Silicon Laboratories",
                COMPANY_MAPPING_128.get(UUID.fromString("000002ff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000300-0000-1000-8000-00805f9b34fb")));
        assertEquals("World Moto Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000300-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000301-0000-1000-8000-00805f9b34fb")));
        assertEquals("Giatec Scientific Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000301-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000302-0000-1000-8000-00805f9b34fb")));
        assertEquals("Loop Devices, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000302-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000303-0000-1000-8000-00805f9b34fb")));
        assertEquals("IACA electronique",
                COMPANY_MAPPING_128.get(UUID.fromString("00000303-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000304-0000-1000-8000-00805f9b34fb")));
        assertEquals("Proxy Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000304-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000305-0000-1000-8000-00805f9b34fb")));
        assertEquals("Swipp ApS", COMPANY_MAPPING_128.get(UUID.fromString("00000305-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000306-0000-1000-8000-00805f9b34fb")));
        assertEquals("Life Laboratory Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000306-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000307-0000-1000-8000-00805f9b34fb")));
        assertEquals("FUJI INDUSTRIAL CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000307-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000308-0000-1000-8000-00805f9b34fb")));
        assertEquals("Surefire, LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000308-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000309-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dolby Labs", COMPANY_MAPPING_128.get(UUID.fromString("00000309-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000030a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ellisys", COMPANY_MAPPING_128.get(UUID.fromString("0000030a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000030b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Magnitude Lighting Converters",
                COMPANY_MAPPING_128.get(UUID.fromString("0000030b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000030c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hilti AG", COMPANY_MAPPING_128.get(UUID.fromString("0000030c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000030d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Devdata S.r.l.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000030d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000030e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Deviceworx", COMPANY_MAPPING_128.get(UUID.fromString("0000030e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000030f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shortcut Labs", COMPANY_MAPPING_128.get(UUID.fromString("0000030f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000310-0000-1000-8000-00805f9b34fb")));
        assertEquals("SGL Italia S.r.l.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000310-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000311-0000-1000-8000-00805f9b34fb")));
        assertEquals("PEEQ DATA", COMPANY_MAPPING_128.get(UUID.fromString("00000311-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000312-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ducere Technologies Pvt Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000312-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000313-0000-1000-8000-00805f9b34fb")));
        assertEquals("DiveNav, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000313-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000314-0000-1000-8000-00805f9b34fb")));
        assertEquals("RIIG AI Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000314-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000315-0000-1000-8000-00805f9b34fb")));
        assertEquals("Thermo Fisher Scientific",
                COMPANY_MAPPING_128.get(UUID.fromString("00000315-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000316-0000-1000-8000-00805f9b34fb")));
        assertEquals("AG Measurematics Pvt. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000316-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000317-0000-1000-8000-00805f9b34fb")));
        assertEquals("CHUO Electronics CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000317-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000318-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aspenta International",
                COMPANY_MAPPING_128.get(UUID.fromString("00000318-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000319-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eugster Frismag AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000319-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000031a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wurth Elektronik eiSos GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000031a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000031b-0000-1000-8000-00805f9b34fb")));
        assertEquals("HQ Inc", COMPANY_MAPPING_128.get(UUID.fromString("0000031b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000031c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lab Sensor Solutions",
                COMPANY_MAPPING_128.get(UUID.fromString("0000031c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000031d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Enterlab ApS", COMPANY_MAPPING_128.get(UUID.fromString("0000031d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000031e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eyefi, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000031e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000031f-0000-1000-8000-00805f9b34fb")));
        assertEquals("MetaSystem S.p.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000031f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000320-0000-1000-8000-00805f9b34fb")));
        assertEquals("SONO ELECTRONICS. CO., LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000320-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000321-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jewelbots", COMPANY_MAPPING_128.get(UUID.fromString("00000321-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000322-0000-1000-8000-00805f9b34fb")));
        assertEquals("Compumedics Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000322-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000323-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rotor Bike Components",
                COMPANY_MAPPING_128.get(UUID.fromString("00000323-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000324-0000-1000-8000-00805f9b34fb")));
        assertEquals("Astro, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000324-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000325-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amotus Solutions",
                COMPANY_MAPPING_128.get(UUID.fromString("00000325-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000326-0000-1000-8000-00805f9b34fb")));
        assertEquals("Healthwear Technologies (Changzhou)Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000326-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000327-0000-1000-8000-00805f9b34fb")));
        assertEquals("Essex Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("00000327-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000328-0000-1000-8000-00805f9b34fb")));
        assertEquals("Grundfos A/S", COMPANY_MAPPING_128.get(UUID.fromString("00000328-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000329-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eargo, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000329-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000032a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Electronic Design Lab",
                COMPANY_MAPPING_128.get(UUID.fromString("0000032a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000032b-0000-1000-8000-00805f9b34fb")));
        assertEquals("ESYLUX", COMPANY_MAPPING_128.get(UUID.fromString("0000032b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000032c-0000-1000-8000-00805f9b34fb")));
        assertEquals("NIPPON SMT.CO.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000032c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000032d-0000-1000-8000-00805f9b34fb")));
        assertEquals("BM innovations GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000032d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000032e-0000-1000-8000-00805f9b34fb")));
        assertEquals("indoormap", COMPANY_MAPPING_128.get(UUID.fromString("0000032e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000032f-0000-1000-8000-00805f9b34fb")));
        assertEquals("OttoQ Inc", COMPANY_MAPPING_128.get(UUID.fromString("0000032f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000330-0000-1000-8000-00805f9b34fb")));
        assertEquals("North Pole Engineering",
                COMPANY_MAPPING_128.get(UUID.fromString("00000330-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000331-0000-1000-8000-00805f9b34fb")));
        assertEquals("3flares Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000331-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000332-0000-1000-8000-00805f9b34fb")));
        assertEquals("Electrocompaniet A.S.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000332-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000333-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mul-T-Lock", COMPANY_MAPPING_128.get(UUID.fromString("00000333-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000334-0000-1000-8000-00805f9b34fb")));
        assertEquals("Airthings ASA", COMPANY_MAPPING_128.get(UUID.fromString("00000334-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000335-0000-1000-8000-00805f9b34fb")));
        assertEquals("Enlighted Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000335-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000336-0000-1000-8000-00805f9b34fb")));
        assertEquals("GISTIC", COMPANY_MAPPING_128.get(UUID.fromString("00000336-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000337-0000-1000-8000-00805f9b34fb")));
        assertEquals("AJP2 Holdings, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000337-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000338-0000-1000-8000-00805f9b34fb")));
        assertEquals("COBI GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000338-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000339-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blue Sky Scientific, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000339-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000033a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Appception, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000033a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000033b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Courtney Thorne Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000033b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000033c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Virtuosys", COMPANY_MAPPING_128.get(UUID.fromString("0000033c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000033d-0000-1000-8000-00805f9b34fb")));
        assertEquals("TPV Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000033d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000033e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Monitra SA", COMPANY_MAPPING_128.get(UUID.fromString("0000033e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000033f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Automation Components, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000033f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000340-0000-1000-8000-00805f9b34fb")));
        assertEquals("Letsense s.r.l.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000340-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000341-0000-1000-8000-00805f9b34fb")));
        assertEquals("Etesian Technologies LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000341-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000342-0000-1000-8000-00805f9b34fb")));
        assertEquals("GERTEC BRASIL LTDA.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000342-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000343-0000-1000-8000-00805f9b34fb")));
        assertEquals("Drekker Development Pty. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000343-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000344-0000-1000-8000-00805f9b34fb")));
        assertEquals("Whirl Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000344-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000345-0000-1000-8000-00805f9b34fb")));
        assertEquals("Locus Positioning",
                COMPANY_MAPPING_128.get(UUID.fromString("00000345-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000346-0000-1000-8000-00805f9b34fb")));
        assertEquals("Acuity Brands Lighting, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000346-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000347-0000-1000-8000-00805f9b34fb")));
        assertEquals("Prevent Biometrics",
                COMPANY_MAPPING_128.get(UUID.fromString("00000347-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000348-0000-1000-8000-00805f9b34fb")));
        assertEquals("Arioneo", COMPANY_MAPPING_128.get(UUID.fromString("00000348-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000349-0000-1000-8000-00805f9b34fb")));
        assertEquals("VersaMe", COMPANY_MAPPING_128.get(UUID.fromString("00000349-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000034a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vaddio", COMPANY_MAPPING_128.get(UUID.fromString("0000034a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000034b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Libratone A/S", COMPANY_MAPPING_128.get(UUID.fromString("0000034b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000034c-0000-1000-8000-00805f9b34fb")));
        assertEquals("HM Electronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000034c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000034d-0000-1000-8000-00805f9b34fb")));
        assertEquals("TASER International, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000034d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000034e-0000-1000-8000-00805f9b34fb")));
        assertEquals("SafeTrust Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000034e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000034f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Heartland Payment Systems",
                COMPANY_MAPPING_128.get(UUID.fromString("0000034f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000350-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bitstrata Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000350-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000351-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pieps GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000351-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000352-0000-1000-8000-00805f9b34fb")));
        assertEquals("iRiding(Xiamen)Technology Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000352-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000353-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alpha Audiotronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000353-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000354-0000-1000-8000-00805f9b34fb")));
        assertEquals("TOPPAN FORMS CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000354-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000355-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sigma Designs, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000355-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000356-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spectrum Brands, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000356-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000357-0000-1000-8000-00805f9b34fb")));
        assertEquals("Polymap Wireless",
                COMPANY_MAPPING_128.get(UUID.fromString("00000357-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000358-0000-1000-8000-00805f9b34fb")));
        assertEquals("MagniWare Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000358-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000359-0000-1000-8000-00805f9b34fb")));
        assertEquals("Novotec Medical GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000359-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000035a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Phillips-Medisize A/S",
                COMPANY_MAPPING_128.get(UUID.fromString("0000035a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000035b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Matrix Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000035b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000035c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eaton Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000035c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000035d-0000-1000-8000-00805f9b34fb")));
        assertEquals("KYS", COMPANY_MAPPING_128.get(UUID.fromString("0000035d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000035e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Naya Health, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000035e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000035f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Acromag", COMPANY_MAPPING_128.get(UUID.fromString("0000035f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000360-0000-1000-8000-00805f9b34fb")));
        assertEquals("Insulet Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000360-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000361-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wellinks Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000361-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000362-0000-1000-8000-00805f9b34fb")));
        assertEquals("ON Semiconductor",
                COMPANY_MAPPING_128.get(UUID.fromString("00000362-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000363-0000-1000-8000-00805f9b34fb")));
        assertEquals("FREELAP SA", COMPANY_MAPPING_128.get(UUID.fromString("00000363-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000364-0000-1000-8000-00805f9b34fb")));
        assertEquals("Favero Electronics Srl",
                COMPANY_MAPPING_128.get(UUID.fromString("00000364-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000365-0000-1000-8000-00805f9b34fb")));
        assertEquals("BioMech Sensor LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000365-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000366-0000-1000-8000-00805f9b34fb")));
        assertEquals("BOLTT Sports technologies Private limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000366-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000367-0000-1000-8000-00805f9b34fb")));
        assertEquals("Saphe International",
                COMPANY_MAPPING_128.get(UUID.fromString("00000367-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000368-0000-1000-8000-00805f9b34fb")));
        assertEquals("Metormote AB", COMPANY_MAPPING_128.get(UUID.fromString("00000368-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000369-0000-1000-8000-00805f9b34fb")));
        assertEquals("littleBits", COMPANY_MAPPING_128.get(UUID.fromString("00000369-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000036a-0000-1000-8000-00805f9b34fb")));
        assertEquals("SetPoint Medical",
                COMPANY_MAPPING_128.get(UUID.fromString("0000036a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000036b-0000-1000-8000-00805f9b34fb")));
        assertEquals("BRControls Products BV",
                COMPANY_MAPPING_128.get(UUID.fromString("0000036b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000036c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zipcar", COMPANY_MAPPING_128.get(UUID.fromString("0000036c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000036d-0000-1000-8000-00805f9b34fb")));
        assertEquals("AirBolt Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000036d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000036e-0000-1000-8000-00805f9b34fb")));
        assertEquals("MOTIVE TECHNOLOGIES, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000036e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000036f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Motiv, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000036f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000370-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wazombi Labs OÜ",
                COMPANY_MAPPING_128.get(UUID.fromString("00000370-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000371-0000-1000-8000-00805f9b34fb")));
        assertEquals("ORBCOMM", COMPANY_MAPPING_128.get(UUID.fromString("00000371-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000372-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nixie Labs, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000372-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000373-0000-1000-8000-00805f9b34fb")));
        assertEquals("AppNearMe Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000373-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000374-0000-1000-8000-00805f9b34fb")));
        assertEquals("Holman Industries",
                COMPANY_MAPPING_128.get(UUID.fromString("00000374-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000375-0000-1000-8000-00805f9b34fb")));
        assertEquals("Expain AS", COMPANY_MAPPING_128.get(UUID.fromString("00000375-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000376-0000-1000-8000-00805f9b34fb")));
        assertEquals("Electronic Temperature Instruments Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000376-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000377-0000-1000-8000-00805f9b34fb")));
        assertEquals("Plejd AB", COMPANY_MAPPING_128.get(UUID.fromString("00000377-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000378-0000-1000-8000-00805f9b34fb")));
        assertEquals("Propeller Health",
                COMPANY_MAPPING_128.get(UUID.fromString("00000378-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000379-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen iMCO Electronic Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000379-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000037a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Algoria", COMPANY_MAPPING_128.get(UUID.fromString("0000037a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000037b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apption Labs Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000037b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000037c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cronologics Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000037c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000037d-0000-1000-8000-00805f9b34fb")));
        assertEquals("MICRODIA Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("0000037d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000037e-0000-1000-8000-00805f9b34fb")));
        assertEquals("lulabytes S.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000037e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000037f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Société des Produits Nestlé S.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000037f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000380-0000-1000-8000-00805f9b34fb")));
        assertEquals("LLC \"MEGA-F service\"",
                COMPANY_MAPPING_128.get(UUID.fromString("00000380-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000381-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sharp Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000381-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000382-0000-1000-8000-00805f9b34fb")));
        assertEquals("Precision Outcomes Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000382-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000383-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kronos Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("00000383-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000384-0000-1000-8000-00805f9b34fb")));
        assertEquals("OCOSMOS Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000384-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000385-0000-1000-8000-00805f9b34fb")));
        assertEquals("Embedded Electronic Solutions Ltd. dba e2Solutions",
                COMPANY_MAPPING_128.get(UUID.fromString("00000385-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000386-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aterica Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000386-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000387-0000-1000-8000-00805f9b34fb")));
        assertEquals("BluStor PMC, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000387-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000388-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kapsch TrafficCom AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000388-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000389-0000-1000-8000-00805f9b34fb")));
        assertEquals("ActiveBlu Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000389-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000038a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kohler Mira Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000038a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000038b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Noke", COMPANY_MAPPING_128.get(UUID.fromString("0000038b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000038c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Appion Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000038c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000038d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Resmed Ltd", COMPANY_MAPPING_128.get(UUID.fromString("0000038d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000038e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Crownstone B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000038e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000038f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xiaomi Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000038f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000390-0000-1000-8000-00805f9b34fb")));
        assertEquals("INFOTECH s.r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000390-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000391-0000-1000-8000-00805f9b34fb")));
        assertEquals("Thingsquare AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000391-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000392-0000-1000-8000-00805f9b34fb")));
        assertEquals("T&D", COMPANY_MAPPING_128.get(UUID.fromString("00000392-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000393-0000-1000-8000-00805f9b34fb")));
        assertEquals("LAVAZZA S.p.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000393-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000394-0000-1000-8000-00805f9b34fb")));
        assertEquals("Netclearance Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000394-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000395-0000-1000-8000-00805f9b34fb")));
        assertEquals("SDATAWAY", COMPANY_MAPPING_128.get(UUID.fromString("00000395-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000396-0000-1000-8000-00805f9b34fb")));
        assertEquals("BLOKS GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000396-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000397-0000-1000-8000-00805f9b34fb")));
        assertEquals("LEGO System A/S",
                COMPANY_MAPPING_128.get(UUID.fromString("00000397-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000398-0000-1000-8000-00805f9b34fb")));
        assertEquals("Thetatronics Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000398-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000399-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nikon Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000399-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000039a-0000-1000-8000-00805f9b34fb")));
        assertEquals("NeST", COMPANY_MAPPING_128.get(UUID.fromString("0000039a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000039b-0000-1000-8000-00805f9b34fb")));
        assertEquals("South Silicon Valley Microelectronics",
                COMPANY_MAPPING_128.get(UUID.fromString("0000039b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000039c-0000-1000-8000-00805f9b34fb")));
        assertEquals("ALE International",
                COMPANY_MAPPING_128.get(UUID.fromString("0000039c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000039d-0000-1000-8000-00805f9b34fb")));
        assertEquals("CareView Communications, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000039d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000039e-0000-1000-8000-00805f9b34fb")));
        assertEquals("SchoolBoard Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000039e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000039f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Molex Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000039f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003a0-0000-1000-8000-00805f9b34fb")));
        assertEquals("IVT Wireless Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000003a0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003a1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alpine Labs LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000003a1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003a2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Candura Instruments",
                COMPANY_MAPPING_128.get(UUID.fromString("000003a2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003a3-0000-1000-8000-00805f9b34fb")));
        assertEquals("SmartMovt Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000003a3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003a4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Token Zero Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000003a4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003a5-0000-1000-8000-00805f9b34fb")));
        assertEquals("ACE CAD Enterprise Co., Ltd. (ACECAD)",
                COMPANY_MAPPING_128.get(UUID.fromString("000003a5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003a6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Medela, Inc", COMPANY_MAPPING_128.get(UUID.fromString("000003a6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003a7-0000-1000-8000-00805f9b34fb")));
        assertEquals("AeroScout", COMPANY_MAPPING_128.get(UUID.fromString("000003a7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003a8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Esrille Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000003a8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003a9-0000-1000-8000-00805f9b34fb")));
        assertEquals("THINKERLY SRL", COMPANY_MAPPING_128.get(UUID.fromString("000003a9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003aa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Exon Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003aa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meizu Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003ab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ac-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smablo LTD", COMPANY_MAPPING_128.get(UUID.fromString("000003ac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ad-0000-1000-8000-00805f9b34fb")));
        assertEquals("XiQ", COMPANY_MAPPING_128.get(UUID.fromString("000003ad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ae-0000-1000-8000-00805f9b34fb")));
        assertEquals("Allswell Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000003ae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003af-0000-1000-8000-00805f9b34fb")));
        assertEquals("Comm-N-Sense Corp DBA Verigo",
                COMPANY_MAPPING_128.get(UUID.fromString("000003af-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003b0-0000-1000-8000-00805f9b34fb")));
        assertEquals("VIBRADORM GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000003b0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003b1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Otodata Wireless Network Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003b1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003b2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Propagation Systems Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000003b2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003b3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Midwest Instruments & Controls",
                COMPANY_MAPPING_128.get(UUID.fromString("000003b3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003b4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alpha Nodus, inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003b4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003b5-0000-1000-8000-00805f9b34fb")));
        assertEquals("petPOMM, Inc", COMPANY_MAPPING_128.get(UUID.fromString("000003b5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003b6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mattel", COMPANY_MAPPING_128.get(UUID.fromString("000003b6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003b7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Airbly Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000003b7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003b8-0000-1000-8000-00805f9b34fb")));
        assertEquals("A-Safe Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000003b8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003b9-0000-1000-8000-00805f9b34fb")));
        assertEquals("FREDERIQUE CONSTANT SA",
                COMPANY_MAPPING_128.get(UUID.fromString("000003b9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Maxscend Microelectronics Company Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000003ba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003bb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Abbott", COMPANY_MAPPING_128.get(UUID.fromString("000003bb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003bc-0000-1000-8000-00805f9b34fb")));
        assertEquals("ASB Bank Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000003bc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003bd-0000-1000-8000-00805f9b34fb")));
        assertEquals("amadas", COMPANY_MAPPING_128.get(UUID.fromString("000003bd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003be-0000-1000-8000-00805f9b34fb")));
        assertEquals("Applied Science, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003be-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003bf-0000-1000-8000-00805f9b34fb")));
        assertEquals("iLumi Solutions Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003bf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003c0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Arch Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003c0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003c1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ember Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003c1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003c2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Snapchat Inc", COMPANY_MAPPING_128.get(UUID.fromString("000003c2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003c3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Casambi Technologies Oy",
                COMPANY_MAPPING_128.get(UUID.fromString("000003c3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003c4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pico Technology Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003c4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003c5-0000-1000-8000-00805f9b34fb")));
        assertEquals("St. Jude Medical, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003c5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003c6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intricon", COMPANY_MAPPING_128.get(UUID.fromString("000003c6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003c7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Structural Health Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003c7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003c8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Avvel International",
                COMPANY_MAPPING_128.get(UUID.fromString("000003c8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003c9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gallagher Group",
                COMPANY_MAPPING_128.get(UUID.fromString("000003c9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ca-0000-1000-8000-00805f9b34fb")));
        assertEquals("In2things Automation Pvt. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003ca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003cb-0000-1000-8000-00805f9b34fb")));
        assertEquals("SYSDEV Srl", COMPANY_MAPPING_128.get(UUID.fromString("000003cb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003cc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vonkil Technologies Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000003cc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003cd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wynd Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003cd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ce-0000-1000-8000-00805f9b34fb")));
        assertEquals("CONTRINEX S.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003ce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003cf-0000-1000-8000-00805f9b34fb")));
        assertEquals("MIRA, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000003cf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003d0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Watteam Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000003d0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003d1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Density Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000003d1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003d2-0000-1000-8000-00805f9b34fb")));
        assertEquals("IOT Pot India Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000003d2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003d3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sigma Connectivity AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000003d3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003d4-0000-1000-8000-00805f9b34fb")));
        assertEquals("PEG PEREGO SPA",
                COMPANY_MAPPING_128.get(UUID.fromString("000003d4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003d5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wyzelink Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003d5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003d6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yota Devices LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000003d6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003d7-0000-1000-8000-00805f9b34fb")));
        assertEquals("FINSECUR", COMPANY_MAPPING_128.get(UUID.fromString("000003d7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003d8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zen-Me Labs Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000003d8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003d9-0000-1000-8000-00805f9b34fb")));
        assertEquals("3IWare Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003d9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003da-0000-1000-8000-00805f9b34fb")));
        assertEquals("EnOcean GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000003da-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003db-0000-1000-8000-00805f9b34fb")));
        assertEquals("Instabeat, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000003db-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003dc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nima Labs", COMPANY_MAPPING_128.get(UUID.fromString("000003dc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003dd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Andreas Stihl AG & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000003dd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003de-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nathan Rhoades LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000003de-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003df-0000-1000-8000-00805f9b34fb")));
        assertEquals("Grob Technologies, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000003df-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003e0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Actions (Zhuhai) Technology Co., Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000003e0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003e1-0000-1000-8000-00805f9b34fb")));
        assertEquals("SPD Development Company Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000003e1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003e2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensoan Oy", COMPANY_MAPPING_128.get(UUID.fromString("000003e2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003e3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qualcomm Life Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000003e3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003e4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chip-ing AG", COMPANY_MAPPING_128.get(UUID.fromString("000003e4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003e5-0000-1000-8000-00805f9b34fb")));
        assertEquals("ffly4u", COMPANY_MAPPING_128.get(UUID.fromString("000003e5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003e6-0000-1000-8000-00805f9b34fb")));
        assertEquals("IoT Instruments Oy",
                COMPANY_MAPPING_128.get(UUID.fromString("000003e6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003e7-0000-1000-8000-00805f9b34fb")));
        assertEquals("TRUE Fitness Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("000003e7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003e8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Reiner Kartengeraete GmbH & Co. KG.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003e8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003e9-0000-1000-8000-00805f9b34fb")));
        assertEquals("SHENZHEN LEMONJOY TECHNOLOGY CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003e9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ea-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hello Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000003ea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003eb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ozo Edu, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000003eb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jigowatts Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003ec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ed-0000-1000-8000-00805f9b34fb")));
        assertEquals("BASIC MICRO.COM,INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003ed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ee-0000-1000-8000-00805f9b34fb")));
        assertEquals("CUBE TECHNOLOGIES",
                COMPANY_MAPPING_128.get(UUID.fromString("000003ee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ef-0000-1000-8000-00805f9b34fb")));
        assertEquals("foolography GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000003ef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003f0-0000-1000-8000-00805f9b34fb")));
        assertEquals("CLINK", COMPANY_MAPPING_128.get(UUID.fromString("000003f0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003f1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hestan Smart Cooking Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003f1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003f2-0000-1000-8000-00805f9b34fb")));
        assertEquals("WindowMaster A/S",
                COMPANY_MAPPING_128.get(UUID.fromString("000003f2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003f3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Flowscape AB", COMPANY_MAPPING_128.get(UUID.fromString("000003f3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003f4-0000-1000-8000-00805f9b34fb")));
        assertEquals("PAL Technologies Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000003f4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003f5-0000-1000-8000-00805f9b34fb")));
        assertEquals("WHERE, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000003f5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003f6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Iton Technology Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003f6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003f7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Owl Labs Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000003f7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003f8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rockford Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003f8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003f9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Becon Technologies Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000003f9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003fa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vyassoft Technologies Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000003fa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003fb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nox Medical", COMPANY_MAPPING_128.get(UUID.fromString("000003fb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003fc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kimberly-Clark",
                COMPANY_MAPPING_128.get(UUID.fromString("000003fc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003fd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trimble Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000003fd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003fe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Littelfuse", COMPANY_MAPPING_128.get(UUID.fromString("000003fe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000003ff-0000-1000-8000-00805f9b34fb")));
        assertEquals("Withings", COMPANY_MAPPING_128.get(UUID.fromString("000003ff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000400-0000-1000-8000-00805f9b34fb")));
        assertEquals("i-developer IT Beratung UG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000400-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000401-0000-1000-8000-00805f9b34fb")));
        assertEquals("Relations Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000401-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000402-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sears Holdings Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000402-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000403-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gantner Electronic GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000403-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000404-0000-1000-8000-00805f9b34fb")));
        assertEquals("Authomate Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000404-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000405-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vertex International, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000405-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000406-0000-1000-8000-00805f9b34fb")));
        assertEquals("Airtago", COMPANY_MAPPING_128.get(UUID.fromString("00000406-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000407-0000-1000-8000-00805f9b34fb")));
        assertEquals("Swiss Audio SA",
                COMPANY_MAPPING_128.get(UUID.fromString("00000407-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000408-0000-1000-8000-00805f9b34fb")));
        assertEquals("ToGetHome Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000408-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000409-0000-1000-8000-00805f9b34fb")));
        assertEquals("RYSE INC.", COMPANY_MAPPING_128.get(UUID.fromString("00000409-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000040a-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZF OPENMATICS s.r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000040a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000040b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jana Care Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000040b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000040c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Senix Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000040c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000040d-0000-1000-8000-00805f9b34fb")));
        assertEquals("NorthStar Battery Company, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000040d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000040e-0000-1000-8000-00805f9b34fb")));
        assertEquals("SKF (U.K.) Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000040e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000040f-0000-1000-8000-00805f9b34fb")));
        assertEquals("CO-AX Technology, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000040f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000410-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fender Musical Instruments",
                COMPANY_MAPPING_128.get(UUID.fromString("00000410-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000411-0000-1000-8000-00805f9b34fb")));
        assertEquals("Luidia Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000411-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000412-0000-1000-8000-00805f9b34fb")));
        assertEquals("SEFAM", COMPANY_MAPPING_128.get(UUID.fromString("00000412-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000413-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wireless Cables Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000413-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000414-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lightning Protection International Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000414-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000415-0000-1000-8000-00805f9b34fb")));
        assertEquals("Uber Technologies Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000415-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000416-0000-1000-8000-00805f9b34fb")));
        assertEquals("SODA GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000416-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000417-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fatigue Science",
                COMPANY_MAPPING_128.get(UUID.fromString("00000417-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000418-0000-1000-8000-00805f9b34fb")));
        assertEquals("Reserved", COMPANY_MAPPING_128.get(UUID.fromString("00000418-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000419-0000-1000-8000-00805f9b34fb")));
        assertEquals("Novalogy LTD", COMPANY_MAPPING_128.get(UUID.fromString("00000419-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000041a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Friday Labs Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000041a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000041b-0000-1000-8000-00805f9b34fb")));
        assertEquals("OrthoAccel Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("0000041b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000041c-0000-1000-8000-00805f9b34fb")));
        assertEquals("WaterGuru, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000041c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000041d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Benning Elektrotechnik und Elektronik GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000041d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000041e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dell Computer Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000041e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000041f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kopin Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000041f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000420-0000-1000-8000-00805f9b34fb")));
        assertEquals("TecBakery GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000420-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000421-0000-1000-8000-00805f9b34fb")));
        assertEquals("Backbone Labs, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000421-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000422-0000-1000-8000-00805f9b34fb")));
        assertEquals("DELSEY SA", COMPANY_MAPPING_128.get(UUID.fromString("00000422-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000423-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chargifi Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000423-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000424-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trainesense Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000424-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000425-0000-1000-8000-00805f9b34fb")));
        assertEquals("Unify Software and Solutions GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000425-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000426-0000-1000-8000-00805f9b34fb")));
        assertEquals("Husqvarna AB", COMPANY_MAPPING_128.get(UUID.fromString("00000426-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000427-0000-1000-8000-00805f9b34fb")));
        assertEquals("Focus fleet and fuel management inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000427-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000428-0000-1000-8000-00805f9b34fb")));
        assertEquals("SmallLoop, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000428-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000429-0000-1000-8000-00805f9b34fb")));
        assertEquals("Prolon Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000429-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000042a-0000-1000-8000-00805f9b34fb")));
        assertEquals("BD Medical", COMPANY_MAPPING_128.get(UUID.fromString("0000042a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000042b-0000-1000-8000-00805f9b34fb")));
        assertEquals("iMicroMed Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("0000042b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000042c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ticto N.V.", COMPANY_MAPPING_128.get(UUID.fromString("0000042c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000042d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meshtech AS", COMPANY_MAPPING_128.get(UUID.fromString("0000042d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000042e-0000-1000-8000-00805f9b34fb")));
        assertEquals("MemCachier Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000042e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000042f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Danfoss A/S", COMPANY_MAPPING_128.get(UUID.fromString("0000042f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000430-0000-1000-8000-00805f9b34fb")));
        assertEquals("SnapStyk Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000430-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000431-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alticor Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000431-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000432-0000-1000-8000-00805f9b34fb")));
        assertEquals("Silk Labs, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000432-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000433-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pillsy Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000433-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000434-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hatch Baby, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000434-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000435-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blocks Wearables Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000435-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000436-0000-1000-8000-00805f9b34fb")));
        assertEquals("Drayson Technologies (Europe) Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000436-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000437-0000-1000-8000-00805f9b34fb")));
        assertEquals("eBest IOT Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000437-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000438-0000-1000-8000-00805f9b34fb")));
        assertEquals("Helvar Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000438-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000439-0000-1000-8000-00805f9b34fb")));
        assertEquals("Radiance Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000439-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000043a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nuheara Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000043a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000043b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Appside co., ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000043b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000043c-0000-1000-8000-00805f9b34fb")));
        assertEquals("DeLaval", COMPANY_MAPPING_128.get(UUID.fromString("0000043c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000043d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Coiler Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000043d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000043e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Thermomedics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000043e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000043f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tentacle Sync GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000043f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000440-0000-1000-8000-00805f9b34fb")));
        assertEquals("Valencell, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000440-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000441-0000-1000-8000-00805f9b34fb")));
        assertEquals("iProtoXi Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000441-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000442-0000-1000-8000-00805f9b34fb")));
        assertEquals("SECOM CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000442-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000443-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tucker International LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000443-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000444-0000-1000-8000-00805f9b34fb")));
        assertEquals("Metanate Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000444-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000445-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kobian Canada Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000445-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000446-0000-1000-8000-00805f9b34fb")));
        assertEquals("NETGEAR, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000446-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000447-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fabtronics Australia Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000447-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000448-0000-1000-8000-00805f9b34fb")));
        assertEquals("Grand Centrix GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000448-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000449-0000-1000-8000-00805f9b34fb")));
        assertEquals("1UP USA.com llc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000449-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000044a-0000-1000-8000-00805f9b34fb")));
        assertEquals("SHIMANO INC.", COMPANY_MAPPING_128.get(UUID.fromString("0000044a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000044b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nain Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000044b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000044c-0000-1000-8000-00805f9b34fb")));
        assertEquals("LifeStyle Lock, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000044c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000044d-0000-1000-8000-00805f9b34fb")));
        assertEquals("VEGA Grieshaber KG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000044d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000044e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xtrava Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000044e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000044f-0000-1000-8000-00805f9b34fb")));
        assertEquals("TTS Tooltechnic Systems AG & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000044f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000450-0000-1000-8000-00805f9b34fb")));
        assertEquals("Teenage Engineering AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000450-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000451-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tunstall Nordic AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000451-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000452-0000-1000-8000-00805f9b34fb")));
        assertEquals("Svep Design Center AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000452-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000453-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qorvo Utrecht B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000453-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000454-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sphinx Electronics GmbH & Co KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000454-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000455-0000-1000-8000-00805f9b34fb")));
        assertEquals("Atomation", COMPANY_MAPPING_128.get(UUID.fromString("00000455-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000456-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nemik Consulting Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000456-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000457-0000-1000-8000-00805f9b34fb")));
        assertEquals("RF INNOVATION", COMPANY_MAPPING_128.get(UUID.fromString("00000457-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000458-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mini Solution Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000458-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000459-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lumenetix, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000459-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000045a-0000-1000-8000-00805f9b34fb")));
        assertEquals("2048450 Ontario Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000045a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000045b-0000-1000-8000-00805f9b34fb")));
        assertEquals("SPACEEK LTD", COMPANY_MAPPING_128.get(UUID.fromString("0000045b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000045c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Delta T Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000045c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000045d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Boston Scientific Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000045d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000045e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nuviz, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000045e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000045f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Real Time Automation, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000045f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000460-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kolibree", COMPANY_MAPPING_128.get(UUID.fromString("00000460-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000461-0000-1000-8000-00805f9b34fb")));
        assertEquals("vhf elektronik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000461-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000462-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bonsai Systems GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000462-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000463-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fathom Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000463-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000464-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bellman & Symfon",
                COMPANY_MAPPING_128.get(UUID.fromString("00000464-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000465-0000-1000-8000-00805f9b34fb")));
        assertEquals("International Forte Group LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000465-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000466-0000-1000-8000-00805f9b34fb")));
        assertEquals("CycleLabs Solutions inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000466-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000467-0000-1000-8000-00805f9b34fb")));
        assertEquals("Codenex Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000467-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000468-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kynesim Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000468-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000469-0000-1000-8000-00805f9b34fb")));
        assertEquals("Palago AB", COMPANY_MAPPING_128.get(UUID.fromString("00000469-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000046a-0000-1000-8000-00805f9b34fb")));
        assertEquals("INSIGMA INC.", COMPANY_MAPPING_128.get(UUID.fromString("0000046a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000046b-0000-1000-8000-00805f9b34fb")));
        assertEquals("PMD Solutions", COMPANY_MAPPING_128.get(UUID.fromString("0000046b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000046c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qingdao Realtime Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000046c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000046d-0000-1000-8000-00805f9b34fb")));
        assertEquals("BEGA Gantenbrink-Leuchten KG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000046d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000046e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pambor Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("0000046e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000046f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Develco Products A/S",
                COMPANY_MAPPING_128.get(UUID.fromString("0000046f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000470-0000-1000-8000-00805f9b34fb")));
        assertEquals("iDesign s.r.l.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000470-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000471-0000-1000-8000-00805f9b34fb")));
        assertEquals("TiVo Corp", COMPANY_MAPPING_128.get(UUID.fromString("00000471-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000472-0000-1000-8000-00805f9b34fb")));
        assertEquals("Control-J Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000472-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000473-0000-1000-8000-00805f9b34fb")));
        assertEquals("Steelcase, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000473-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000474-0000-1000-8000-00805f9b34fb")));
        assertEquals("iApartment co., ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000474-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000475-0000-1000-8000-00805f9b34fb")));
        assertEquals("Icom inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000475-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000476-0000-1000-8000-00805f9b34fb")));
        assertEquals("Oxstren Wearable Technologies Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000476-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000477-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blue Spark Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000477-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000478-0000-1000-8000-00805f9b34fb")));
        assertEquals("FarSite Communications Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000478-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000479-0000-1000-8000-00805f9b34fb")));
        assertEquals("mywerk system GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000479-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000047a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sinosun Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000047a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000047b-0000-1000-8000-00805f9b34fb")));
        assertEquals("MIYOSHI ELECTRONICS CORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("0000047b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000047c-0000-1000-8000-00805f9b34fb")));
        assertEquals("POWERMAT LTD", COMPANY_MAPPING_128.get(UUID.fromString("0000047c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000047d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Occly LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000047d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000047e-0000-1000-8000-00805f9b34fb")));
        assertEquals("OurHub Dev IvS",
                COMPANY_MAPPING_128.get(UUID.fromString("0000047e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000047f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pro-Mark, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000047f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000480-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dynometrics Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000480-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000481-0000-1000-8000-00805f9b34fb")));
        assertEquals("Quintrax Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000481-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000482-0000-1000-8000-00805f9b34fb")));
        assertEquals("POS Tuning Udo Vosshenrich GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000482-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000483-0000-1000-8000-00805f9b34fb")));
        assertEquals("Multi Care Systems B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000483-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000484-0000-1000-8000-00805f9b34fb")));
        assertEquals("Revol Technologies Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000484-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000485-0000-1000-8000-00805f9b34fb")));
        assertEquals("SKIDATA AG", COMPANY_MAPPING_128.get(UUID.fromString("00000485-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000486-0000-1000-8000-00805f9b34fb")));
        assertEquals("DEV TECNOLOGIA INDUSTRIA, COMERCIO E MANUTENCAO DE EQUIPAMENTOS LTDA. - ME",
                COMPANY_MAPPING_128.get(UUID.fromString("00000486-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000487-0000-1000-8000-00805f9b34fb")));
        assertEquals("Centrica Connected Home",
                COMPANY_MAPPING_128.get(UUID.fromString("00000487-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000488-0000-1000-8000-00805f9b34fb")));
        assertEquals("Automotive Data Solutions Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000488-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000489-0000-1000-8000-00805f9b34fb")));
        assertEquals("Igarashi Engineering",
                COMPANY_MAPPING_128.get(UUID.fromString("00000489-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000048a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Taelek Oy", COMPANY_MAPPING_128.get(UUID.fromString("0000048a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000048b-0000-1000-8000-00805f9b34fb")));
        assertEquals("CP Electronics Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000048b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000048c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vectronix AG", COMPANY_MAPPING_128.get(UUID.fromString("0000048c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000048d-0000-1000-8000-00805f9b34fb")));
        assertEquals("S-Labs Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000048d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000048e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Companion Medical, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000048e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000048f-0000-1000-8000-00805f9b34fb")));
        assertEquals("BlueKitchen GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000048f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000490-0000-1000-8000-00805f9b34fb")));
        assertEquals("Matting AB", COMPANY_MAPPING_128.get(UUID.fromString("00000490-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000491-0000-1000-8000-00805f9b34fb")));
        assertEquals("SOREX - Wireless Solutions GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000491-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000492-0000-1000-8000-00805f9b34fb")));
        assertEquals("ADC Technology, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000492-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000493-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lynxemi Pte Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000493-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000494-0000-1000-8000-00805f9b34fb")));
        assertEquals("SENNHEISER electronic GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000494-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000495-0000-1000-8000-00805f9b34fb")));
        assertEquals("LMT Mercer Group, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000495-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000496-0000-1000-8000-00805f9b34fb")));
        assertEquals("Polymorphic Labs LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000496-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000497-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cochlear Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000497-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000498-0000-1000-8000-00805f9b34fb")));
        assertEquals("METER Group, Inc. USA",
                COMPANY_MAPPING_128.get(UUID.fromString("00000498-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000499-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ruuvi Innovations Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000499-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000049a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Situne AS", COMPANY_MAPPING_128.get(UUID.fromString("0000049a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000049b-0000-1000-8000-00805f9b34fb")));
        assertEquals("nVisti, LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000049b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000049c-0000-1000-8000-00805f9b34fb")));
        assertEquals("DyOcean", COMPANY_MAPPING_128.get(UUID.fromString("0000049c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000049d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Uhlmann & Zacher GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000049d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000049e-0000-1000-8000-00805f9b34fb")));
        assertEquals("AND!XOR LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000049e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000049f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Popper Pay AB", COMPANY_MAPPING_128.get(UUID.fromString("0000049f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004a0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vypin, LLC", COMPANY_MAPPING_128.get(UUID.fromString("000004a0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004a1-0000-1000-8000-00805f9b34fb")));
        assertEquals("PNI Sensor Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000004a1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004a2-0000-1000-8000-00805f9b34fb")));
        assertEquals("ovrEngineered, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000004a2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004a3-0000-1000-8000-00805f9b34fb")));
        assertEquals("GT-tronics HK Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000004a3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004a4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Herbert Waldmann GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000004a4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004a5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Guangzhou FiiO Electronics Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000004a5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004a6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vinetech Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000004a6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004a7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dallas Logic Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000004a7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004a8-0000-1000-8000-00805f9b34fb")));
        assertEquals("BioTex, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000004a8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004a9-0000-1000-8000-00805f9b34fb")));
        assertEquals("DISCOVERY SOUND TECHNOLOGY, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000004a9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004aa-0000-1000-8000-00805f9b34fb")));
        assertEquals("LINKIO SAS", COMPANY_MAPPING_128.get(UUID.fromString("000004aa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Harbortronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004ab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ac-0000-1000-8000-00805f9b34fb")));
        assertEquals("Undagrid B.V.", COMPANY_MAPPING_128.get(UUID.fromString("000004ac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ad-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shure Inc", COMPANY_MAPPING_128.get(UUID.fromString("000004ad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ae-0000-1000-8000-00805f9b34fb")));
        assertEquals("ERM Electronic Systems LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000004ae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004af-0000-1000-8000-00805f9b34fb")));
        assertEquals("BIOROWER Handelsagentur GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000004af-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004b0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Weba Sport und Med. Artikel GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000004b0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004b1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kartographers Technologies Pvt. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004b1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004b2-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Shadow on the Moon",
                COMPANY_MAPPING_128.get(UUID.fromString("000004b2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004b3-0000-1000-8000-00805f9b34fb")));
        assertEquals("mobike (Hong Kong) Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000004b3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004b4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inuheat Group AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000004b4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004b5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Swiftronix AB", COMPANY_MAPPING_128.get(UUID.fromString("000004b5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004b6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Diagnoptics Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("000004b6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004b7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Analog Devices, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004b7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004b8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Soraa Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000004b8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004b9-0000-1000-8000-00805f9b34fb")));
        assertEquals("CSR Building Products Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000004b9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Crestron Electronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004ba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004bb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Neatebox Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000004bb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004bc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Draegerwerk AG & Co. KGaA",
                COMPANY_MAPPING_128.get(UUID.fromString("000004bc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004bd-0000-1000-8000-00805f9b34fb")));
        assertEquals("AlbynMedical", COMPANY_MAPPING_128.get(UUID.fromString("000004bd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004be-0000-1000-8000-00805f9b34fb")));
        assertEquals("Averos FZCO", COMPANY_MAPPING_128.get(UUID.fromString("000004be-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004bf-0000-1000-8000-00805f9b34fb")));
        assertEquals("VIT Initiative, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000004bf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004c0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Statsports International",
                COMPANY_MAPPING_128.get(UUID.fromString("000004c0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004c1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sospitas, s.r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004c1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004c2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dmet Products Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004c2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004c3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mantracourt Electronics Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000004c3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004c4-0000-1000-8000-00805f9b34fb")));
        assertEquals("TeAM Hutchins AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000004c4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004c5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Seibert Williams Glass, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000004c5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004c6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Insta GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000004c6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004c7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Svantek Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004c7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004c8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Flyco Electrical Appliance Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004c8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004c9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Thornwave Labs Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000004c9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Steiner-Optik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000004ca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004cb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Novo Nordisk A/S",
                COMPANY_MAPPING_128.get(UUID.fromString("000004cb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004cc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Enflux Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000004cc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004cd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Safetech Products LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000004cd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ce-0000-1000-8000-00805f9b34fb")));
        assertEquals("GOOOLED S.R.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004ce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004cf-0000-1000-8000-00805f9b34fb")));
        assertEquals("DOM Sicherheitstechnik GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000004cf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004d0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Olympus Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000004d0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004d1-0000-1000-8000-00805f9b34fb")));
        assertEquals("KTS GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000004d1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004d2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anloq Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004d2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004d3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Queercon, Inc", COMPANY_MAPPING_128.get(UUID.fromString("000004d3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004d4-0000-1000-8000-00805f9b34fb")));
        assertEquals("5th Element Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000004d4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004d5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gooee Limited", COMPANY_MAPPING_128.get(UUID.fromString("000004d5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004d6-0000-1000-8000-00805f9b34fb")));
        assertEquals("LUGLOC LLC", COMPANY_MAPPING_128.get(UUID.fromString("000004d6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004d7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blincam, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000004d7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004d8-0000-1000-8000-00805f9b34fb")));
        assertEquals("FUJIFILM Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000004d8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004d9-0000-1000-8000-00805f9b34fb")));
        assertEquals("RM Acquisition LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000004d9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004da-0000-1000-8000-00805f9b34fb")));
        assertEquals("Franceschi Marina snc",
                COMPANY_MAPPING_128.get(UUID.fromString("000004da-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004db-0000-1000-8000-00805f9b34fb")));
        assertEquals("Engineered Audio, LLC.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004db-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004dc-0000-1000-8000-00805f9b34fb")));
        assertEquals("IOTTIVE (OPC) PRIVATE LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("000004dc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004dd-0000-1000-8000-00805f9b34fb")));
        assertEquals("4MOD Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("000004dd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004de-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lutron Electronics Co., Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004de-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004df-0000-1000-8000-00805f9b34fb")));
        assertEquals("Emerson Electric Co.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004df-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004e0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Guardtec, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004e0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004e1-0000-1000-8000-00805f9b34fb")));
        assertEquals("REACTEC LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("000004e1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004e2-0000-1000-8000-00805f9b34fb")));
        assertEquals("EllieGrid", COMPANY_MAPPING_128.get(UUID.fromString("000004e2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004e3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Under Armour", COMPANY_MAPPING_128.get(UUID.fromString("000004e3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004e4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Woodenshark", COMPANY_MAPPING_128.get(UUID.fromString("000004e4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004e5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Avack Oy", COMPANY_MAPPING_128.get(UUID.fromString("000004e5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004e6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smart Solution Technology, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004e6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004e7-0000-1000-8000-00805f9b34fb")));
        assertEquals("REHABTRONICS INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004e7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004e8-0000-1000-8000-00805f9b34fb")));
        assertEquals("STABILO International",
                COMPANY_MAPPING_128.get(UUID.fromString("000004e8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004e9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Busch Jaeger Elektro GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000004e9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ea-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pacific Bioscience Laboratories, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000004ea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004eb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bird Home Automation GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000004eb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Motorola Solutions",
                COMPANY_MAPPING_128.get(UUID.fromString("000004ec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ed-0000-1000-8000-00805f9b34fb")));
        assertEquals("R9 Technology, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004ed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Auxivia", COMPANY_MAPPING_128.get(UUID.fromString("000004ee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ef-0000-1000-8000-00805f9b34fb")));
        assertEquals("DaisyWorks, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000004ef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004f0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kosi Limited", COMPANY_MAPPING_128.get(UUID.fromString("000004f0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004f1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Theben AG", COMPANY_MAPPING_128.get(UUID.fromString("000004f1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004f2-0000-1000-8000-00805f9b34fb")));
        assertEquals("InDreamer Techsol Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000004f2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004f3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cerevast Medical",
                COMPANY_MAPPING_128.get(UUID.fromString("000004f3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004f4-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZanCompute Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004f4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004f5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pirelli Tyre S.P.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004f5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004f6-0000-1000-8000-00805f9b34fb")));
        assertEquals("McLear Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000004f6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004f7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Goodix Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000004f7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004f8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Convergence Systems Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000004f8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004f9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Interactio", COMPANY_MAPPING_128.get(UUID.fromString("000004f9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004fa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Androtec GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000004fa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004fb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Benchmark Drives GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000004fb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004fc-0000-1000-8000-00805f9b34fb")));
        assertEquals("SwingLync L. L. C.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004fc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004fd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tapkey GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000004fd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004fe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Woosim Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000004fe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000004ff-0000-1000-8000-00805f9b34fb")));
        assertEquals("Microsemi Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000004ff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000500-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wiliot LTD.", COMPANY_MAPPING_128.get(UUID.fromString("00000500-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000501-0000-1000-8000-00805f9b34fb")));
        assertEquals("Polaris IND", COMPANY_MAPPING_128.get(UUID.fromString("00000501-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000502-0000-1000-8000-00805f9b34fb")));
        assertEquals("Specifi-Kali LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000502-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000503-0000-1000-8000-00805f9b34fb")));
        assertEquals("Locoroll, Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000503-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000504-0000-1000-8000-00805f9b34fb")));
        assertEquals("PHYPLUS Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000504-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000505-0000-1000-8000-00805f9b34fb")));
        assertEquals("InPlay, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000505-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000506-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hager", COMPANY_MAPPING_128.get(UUID.fromString("00000506-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000507-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yellowcog", COMPANY_MAPPING_128.get(UUID.fromString("00000507-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000508-0000-1000-8000-00805f9b34fb")));
        assertEquals("Axes System sp. z o. o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000508-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000509-0000-1000-8000-00805f9b34fb")));
        assertEquals("Garage Smart, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000509-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000050a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shake-on B.V.", COMPANY_MAPPING_128.get(UUID.fromString("0000050a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000050b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vibrissa Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000050b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000050c-0000-1000-8000-00805f9b34fb")));
        assertEquals("OSRAM GmbH", COMPANY_MAPPING_128.get(UUID.fromString("0000050c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000050d-0000-1000-8000-00805f9b34fb")));
        assertEquals("TRSystems GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000050d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000050e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yichip Microelectronics (Hangzhou) Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000050e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000050f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Foundation Engineering LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000050f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000510-0000-1000-8000-00805f9b34fb")));
        assertEquals("UNI-ELECTRONICS, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000510-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000511-0000-1000-8000-00805f9b34fb")));
        assertEquals("Brookfield Equinox LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000511-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000512-0000-1000-8000-00805f9b34fb")));
        assertEquals("Soprod SA", COMPANY_MAPPING_128.get(UUID.fromString("00000512-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000513-0000-1000-8000-00805f9b34fb")));
        assertEquals("9974091 Canada Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000513-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000514-0000-1000-8000-00805f9b34fb")));
        assertEquals("FIBRO GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000514-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000515-0000-1000-8000-00805f9b34fb")));
        assertEquals("RB Controls Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000515-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000516-0000-1000-8000-00805f9b34fb")));
        assertEquals("Footmarks", COMPANY_MAPPING_128.get(UUID.fromString("00000516-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000517-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amtronic Sverige AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000517-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000518-0000-1000-8000-00805f9b34fb")));
        assertEquals("MAMORIO.inc", COMPANY_MAPPING_128.get(UUID.fromString("00000518-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000519-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tyto Life LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000519-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000051a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Leica Camera AG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000051a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000051b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Angee Technologies Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000051b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000051c-0000-1000-8000-00805f9b34fb")));
        assertEquals("EDPS", COMPANY_MAPPING_128.get(UUID.fromString("0000051c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000051d-0000-1000-8000-00805f9b34fb")));
        assertEquals("OFF Line Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000051d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000051e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Detect Blue Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000051e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000051f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Setec Pty Ltd", COMPANY_MAPPING_128.get(UUID.fromString("0000051f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000520-0000-1000-8000-00805f9b34fb")));
        assertEquals("Target Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000520-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000521-0000-1000-8000-00805f9b34fb")));
        assertEquals("IAI Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000521-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000522-0000-1000-8000-00805f9b34fb")));
        assertEquals("NS Tech, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000522-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000523-0000-1000-8000-00805f9b34fb")));
        assertEquals("MTG Co., Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("00000523-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000524-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hangzhou iMagic Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000524-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000525-0000-1000-8000-00805f9b34fb")));
        assertEquals("HONGKONG NANO IC TECHNOLOGIES  CO., LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000525-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000526-0000-1000-8000-00805f9b34fb")));
        assertEquals("Honeywell International Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000526-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000527-0000-1000-8000-00805f9b34fb")));
        assertEquals("Albrecht JUNG", COMPANY_MAPPING_128.get(UUID.fromString("00000527-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000528-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lunera Lighting Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000528-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000529-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lumen UAB", COMPANY_MAPPING_128.get(UUID.fromString("00000529-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000052a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Keynes Controls Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000052a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000052b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Novartis AG", COMPANY_MAPPING_128.get(UUID.fromString("0000052b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000052c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geosatis SA", COMPANY_MAPPING_128.get(UUID.fromString("0000052c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000052d-0000-1000-8000-00805f9b34fb")));
        assertEquals("EXFO, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000052d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000052e-0000-1000-8000-00805f9b34fb")));
        assertEquals("LEDVANCE GmbH", COMPANY_MAPPING_128.get(UUID.fromString("0000052e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000052f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Center ID Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000052f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000530-0000-1000-8000-00805f9b34fb")));
        assertEquals("Adolene, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000530-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000531-0000-1000-8000-00805f9b34fb")));
        assertEquals("D&M Holdings Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000531-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000532-0000-1000-8000-00805f9b34fb")));
        assertEquals("CRESCO Wireless, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000532-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000533-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nura Operations Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000533-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000534-0000-1000-8000-00805f9b34fb")));
        assertEquals("Frontiergadget, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000534-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000535-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smart Component Technologies Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000535-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000536-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZTR Control Systems LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000536-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000537-0000-1000-8000-00805f9b34fb")));
        assertEquals("MetaLogics Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000537-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000538-0000-1000-8000-00805f9b34fb")));
        assertEquals("Medela AG", COMPANY_MAPPING_128.get(UUID.fromString("00000538-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000539-0000-1000-8000-00805f9b34fb")));
        assertEquals("OPPLE Lighting Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000539-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000053a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Savitech Corp.,",
                COMPANY_MAPPING_128.get(UUID.fromString("0000053a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000053b-0000-1000-8000-00805f9b34fb")));
        assertEquals("prodigy", COMPANY_MAPPING_128.get(UUID.fromString("0000053b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000053c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Screenovate Technologies Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000053c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000053d-0000-1000-8000-00805f9b34fb")));
        assertEquals("TESA SA", COMPANY_MAPPING_128.get(UUID.fromString("0000053d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000053e-0000-1000-8000-00805f9b34fb")));
        assertEquals("CLIM8 LIMITED", COMPANY_MAPPING_128.get(UUID.fromString("0000053e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000053f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Silergy Corp", COMPANY_MAPPING_128.get(UUID.fromString("0000053f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000540-0000-1000-8000-00805f9b34fb")));
        assertEquals("SilverPlus, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000540-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000541-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sharknet srl", COMPANY_MAPPING_128.get(UUID.fromString("00000541-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000542-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mist Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000542-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000543-0000-1000-8000-00805f9b34fb")));
        assertEquals("MIWA LOCK CO.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000543-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000544-0000-1000-8000-00805f9b34fb")));
        assertEquals("OrthoSensor, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000544-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000545-0000-1000-8000-00805f9b34fb")));
        assertEquals("Candy Hoover Group s.r.l",
                COMPANY_MAPPING_128.get(UUID.fromString("00000545-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000546-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apexar Technologies S.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000546-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000547-0000-1000-8000-00805f9b34fb")));
        assertEquals("LOGICDATA Electronic & Software Entwicklungs GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000547-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000548-0000-1000-8000-00805f9b34fb")));
        assertEquals("Knick Elektronische Messgeraete GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000548-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000549-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smart Technologies and Investment Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000549-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000054a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Linough Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000054a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000054b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Advanced Electronic Designs, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000054b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000054c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Carefree Scott Fetzer Co Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000054c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000054d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensome", COMPANY_MAPPING_128.get(UUID.fromString("0000054d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000054e-0000-1000-8000-00805f9b34fb")));
        assertEquals("FORTRONIK storitve d.o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000054e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000054f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sinnoz", COMPANY_MAPPING_128.get(UUID.fromString("0000054f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000550-0000-1000-8000-00805f9b34fb")));
        assertEquals("Versa Networks, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000550-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000551-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sylero", COMPANY_MAPPING_128.get(UUID.fromString("00000551-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000552-0000-1000-8000-00805f9b34fb")));
        assertEquals("Avempace SARL", COMPANY_MAPPING_128.get(UUID.fromString("00000552-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000553-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nintendo Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000553-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000554-0000-1000-8000-00805f9b34fb")));
        assertEquals("National Instruments",
                COMPANY_MAPPING_128.get(UUID.fromString("00000554-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000555-0000-1000-8000-00805f9b34fb")));
        assertEquals("KROHNE Messtechnik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000555-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000556-0000-1000-8000-00805f9b34fb")));
        assertEquals("Otodynamics Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000556-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000557-0000-1000-8000-00805f9b34fb")));
        assertEquals("Arwin Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000557-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000558-0000-1000-8000-00805f9b34fb")));
        assertEquals("benegear, inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000558-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000559-0000-1000-8000-00805f9b34fb")));
        assertEquals("Newcon Optik", COMPANY_MAPPING_128.get(UUID.fromString("00000559-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000055a-0000-1000-8000-00805f9b34fb")));
        assertEquals("CANDY HOUSE, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000055a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000055b-0000-1000-8000-00805f9b34fb")));
        assertEquals("FRANKLIN TECHNOLOGY INC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000055b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000055c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lely", COMPANY_MAPPING_128.get(UUID.fromString("0000055c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000055d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Valve Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000055d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000055e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hekatron Vertriebs GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000055e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000055f-0000-1000-8000-00805f9b34fb")));
        assertEquals("PROTECH S.A.S. DI GIRARDI ANDREA & C.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000055f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000560-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sarita CareTech APS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000560-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000561-0000-1000-8000-00805f9b34fb")));
        assertEquals("Finder S.p.A.", COMPANY_MAPPING_128.get(UUID.fromString("00000561-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000562-0000-1000-8000-00805f9b34fb")));
        assertEquals("Thalmic Labs Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000562-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000563-0000-1000-8000-00805f9b34fb")));
        assertEquals("Steinel Vertrieb GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000563-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000564-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beghelli Spa", COMPANY_MAPPING_128.get(UUID.fromString("00000564-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000565-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Smartspace Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000565-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000566-0000-1000-8000-00805f9b34fb")));
        assertEquals("CORE TRANSPORT TECHNOLOGIES NZ LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000566-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000567-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xiamen Everesports Goods Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000567-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000568-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bodyport Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000568-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000569-0000-1000-8000-00805f9b34fb")));
        assertEquals("Audionics System, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000569-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000056a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Flipnavi Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000056a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000056b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rion Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000056b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000056c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Long Range Systems, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000056c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000056d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Redmond Industrial Group LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000056d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000056e-0000-1000-8000-00805f9b34fb")));
        assertEquals("VIZPIN INC.", COMPANY_MAPPING_128.get(UUID.fromString("0000056e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000056f-0000-1000-8000-00805f9b34fb")));
        assertEquals("BikeFinder AS", COMPANY_MAPPING_128.get(UUID.fromString("0000056f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000570-0000-1000-8000-00805f9b34fb")));
        assertEquals("Consumer Sleep Solutions LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000570-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000571-0000-1000-8000-00805f9b34fb")));
        assertEquals("PSIKICK, INC.", COMPANY_MAPPING_128.get(UUID.fromString("00000571-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000572-0000-1000-8000-00805f9b34fb")));
        assertEquals("AntTail.com", COMPANY_MAPPING_128.get(UUID.fromString("00000572-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000573-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lighting Science Group Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000573-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000574-0000-1000-8000-00805f9b34fb")));
        assertEquals("AFFORDABLE ELECTRONICS INC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000574-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000575-0000-1000-8000-00805f9b34fb")));
        assertEquals("Integral Memroy Plc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000575-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000576-0000-1000-8000-00805f9b34fb")));
        assertEquals("Globalstar, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000576-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000577-0000-1000-8000-00805f9b34fb")));
        assertEquals("True Wearables, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000577-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000578-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wellington Drive Technologies Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000578-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000579-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ensemble Tech Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000579-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000057a-0000-1000-8000-00805f9b34fb")));
        assertEquals("OMNI Remotes", COMPANY_MAPPING_128.get(UUID.fromString("0000057a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000057b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Duracell U.S. Operations Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000057b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000057c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Toor Technologies LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000057c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000057d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Instinct Performance",
                COMPANY_MAPPING_128.get(UUID.fromString("0000057d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000057e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beco, Inc", COMPANY_MAPPING_128.get(UUID.fromString("0000057e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000057f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Scuf Gaming International, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000057f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000580-0000-1000-8000-00805f9b34fb")));
        assertEquals("ARANZ Medical Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000580-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000581-0000-1000-8000-00805f9b34fb")));
        assertEquals("LYS TECHNOLOGIES LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000581-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000582-0000-1000-8000-00805f9b34fb")));
        assertEquals("Breakwall Analytics, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000582-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000583-0000-1000-8000-00805f9b34fb")));
        assertEquals("Code Blue Communications",
                COMPANY_MAPPING_128.get(UUID.fromString("00000583-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000584-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gira Giersiepen GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000584-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000585-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hearing Lab Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("00000585-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000586-0000-1000-8000-00805f9b34fb")));
        assertEquals("LEGRAND", COMPANY_MAPPING_128.get(UUID.fromString("00000586-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000587-0000-1000-8000-00805f9b34fb")));
        assertEquals("Derichs GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000587-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000588-0000-1000-8000-00805f9b34fb")));
        assertEquals("ALT-TEKNIK LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000588-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000589-0000-1000-8000-00805f9b34fb")));
        assertEquals("Star Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000589-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000058a-0000-1000-8000-00805f9b34fb")));
        assertEquals("START TODAY CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000058a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000058b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Maxim Integrated Products",
                COMPANY_MAPPING_128.get(UUID.fromString("0000058b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000058c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fracarro Radioindustrie SRL",
                COMPANY_MAPPING_128.get(UUID.fromString("0000058c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000058d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jungheinrich Aktiengesellschaft",
                COMPANY_MAPPING_128.get(UUID.fromString("0000058d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000058e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meta Platforms Technologies, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000058e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000058f-0000-1000-8000-00805f9b34fb")));
        assertEquals("HENDON SEMICONDUCTORS PTY LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("0000058f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000590-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pur3 Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000590-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000591-0000-1000-8000-00805f9b34fb")));
        assertEquals("Viasat Group S.p.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000591-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000592-0000-1000-8000-00805f9b34fb")));
        assertEquals("IZITHERM", COMPANY_MAPPING_128.get(UUID.fromString("00000592-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000593-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spaulding Clinical Research",
                COMPANY_MAPPING_128.get(UUID.fromString("00000593-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000594-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kohler Company",
                COMPANY_MAPPING_128.get(UUID.fromString("00000594-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000595-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inor Process AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000595-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000596-0000-1000-8000-00805f9b34fb")));
        assertEquals("My Smart Blinds",
                COMPANY_MAPPING_128.get(UUID.fromString("00000596-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000597-0000-1000-8000-00805f9b34fb")));
        assertEquals("RadioPulse Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000597-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000598-0000-1000-8000-00805f9b34fb")));
        assertEquals("rapitag GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000598-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000599-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lazlo326, LLC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000599-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000059a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Teledyne Lecroy, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000059a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000059b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dataflow Systems Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000059b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000059c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Macrogiga Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("0000059c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000059d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tandem Diabetes Care",
                COMPANY_MAPPING_128.get(UUID.fromString("0000059d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000059e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Polycom, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000059e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000059f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fisher & Paykel Healthcare",
                COMPANY_MAPPING_128.get(UUID.fromString("0000059f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005a0-0000-1000-8000-00805f9b34fb")));
        assertEquals("RCP Software Oy",
                COMPANY_MAPPING_128.get(UUID.fromString("000005a0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005a1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Xiaoyi Technology Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005a1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005a2-0000-1000-8000-00805f9b34fb")));
        assertEquals("ADHERIUM(NZ) LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("000005a2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005a3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Axiomware Systems Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("000005a3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005a4-0000-1000-8000-00805f9b34fb")));
        assertEquals("O. E. M. Controls, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005a4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005a5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kiiroo BV", COMPANY_MAPPING_128.get(UUID.fromString("000005a5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005a6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Telecon Mobile Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000005a6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005a7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sonos Inc", COMPANY_MAPPING_128.get(UUID.fromString("000005a7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005a8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tom Allebrandi Consulting",
                COMPANY_MAPPING_128.get(UUID.fromString("000005a8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005a9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Monidor", COMPANY_MAPPING_128.get(UUID.fromString("000005a9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005aa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tramex Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000005aa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nofence AS", COMPANY_MAPPING_128.get(UUID.fromString("000005ab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ac-0000-1000-8000-00805f9b34fb")));
        assertEquals("GoerTek Dynaudio Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005ac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ad-0000-1000-8000-00805f9b34fb")));
        assertEquals("INIA", COMPANY_MAPPING_128.get(UUID.fromString("000005ad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ae-0000-1000-8000-00805f9b34fb")));
        assertEquals("CARMATE MFG.CO.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000005ae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005af-0000-1000-8000-00805f9b34fb")));
        assertEquals("OV LOOP, INC.", COMPANY_MAPPING_128.get(UUID.fromString("000005af-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005b0-0000-1000-8000-00805f9b34fb")));
        assertEquals("NewTec GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000005b0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005b1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Medallion Instrumentation Systems",
                COMPANY_MAPPING_128.get(UUID.fromString("000005b1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005b2-0000-1000-8000-00805f9b34fb")));
        assertEquals("CAREL INDUSTRIES S.P.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005b2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005b3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Parabit Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005b3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005b4-0000-1000-8000-00805f9b34fb")));
        assertEquals("White Horse Scientific ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000005b4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005b5-0000-1000-8000-00805f9b34fb")));
        assertEquals("verisilicon", COMPANY_MAPPING_128.get(UUID.fromString("000005b5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005b6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Elecs Industry Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005b6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005b7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Pinecone Electronics Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005b7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005b8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ambystoma Labs Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005b8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005b9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Suzhou Pairlink Network Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("000005b9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ba-0000-1000-8000-00805f9b34fb")));
        assertEquals("igloohome", COMPANY_MAPPING_128.get(UUID.fromString("000005ba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005bb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Oxford Metrics plc",
                COMPANY_MAPPING_128.get(UUID.fromString("000005bb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005bc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Leviton Mfg. Co., Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005bc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005bd-0000-1000-8000-00805f9b34fb")));
        assertEquals("ULC Robotics Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005bd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005be-0000-1000-8000-00805f9b34fb")));
        assertEquals("RFID Global by Softwork SrL",
                COMPANY_MAPPING_128.get(UUID.fromString("000005be-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005bf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Real-World-Systems Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000005bf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005c0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nalu Medical, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005c0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005c1-0000-1000-8000-00805f9b34fb")));
        assertEquals("P.I.Engineering",
                COMPANY_MAPPING_128.get(UUID.fromString("000005c1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005c2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Grote Industries",
                COMPANY_MAPPING_128.get(UUID.fromString("000005c2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005c3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Runtime, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000005c3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005c4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Codecoup sp. z o.o. sp. k.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005c4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005c5-0000-1000-8000-00805f9b34fb")));
        assertEquals("SELVE GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000005c5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005c6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smart Animal Training Systems, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000005c6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005c7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lippert Components, INC",
                COMPANY_MAPPING_128.get(UUID.fromString("000005c7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005c8-0000-1000-8000-00805f9b34fb")));
        assertEquals("SOMFY SAS", COMPANY_MAPPING_128.get(UUID.fromString("000005c8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005c9-0000-1000-8000-00805f9b34fb")));
        assertEquals("TBS Electronics B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005c9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ca-0000-1000-8000-00805f9b34fb")));
        assertEquals("MHL Custom Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000005ca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005cb-0000-1000-8000-00805f9b34fb")));
        assertEquals("LucentWear LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000005cb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005cc-0000-1000-8000-00805f9b34fb")));
        assertEquals("WATTS ELECTRONICS",
                COMPANY_MAPPING_128.get(UUID.fromString("000005cc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005cd-0000-1000-8000-00805f9b34fb")));
        assertEquals("RJ Brands LLC", COMPANY_MAPPING_128.get(UUID.fromString("000005cd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ce-0000-1000-8000-00805f9b34fb")));
        assertEquals("V-ZUG Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000005ce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005cf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Biowatch SA", COMPANY_MAPPING_128.get(UUID.fromString("000005cf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005d0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anova Applied Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("000005d0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005d1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lindab AB", COMPANY_MAPPING_128.get(UUID.fromString("000005d1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005d2-0000-1000-8000-00805f9b34fb")));
        assertEquals("frogblue TECHNOLOGY GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000005d2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005d3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Acurable Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000005d3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005d4-0000-1000-8000-00805f9b34fb")));
        assertEquals("LAMPLIGHT Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005d4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005d5-0000-1000-8000-00805f9b34fb")));
        assertEquals("TEGAM, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000005d5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005d6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zhuhai Jieli technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000005d6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005d7-0000-1000-8000-00805f9b34fb")));
        assertEquals("modum.io AG", COMPANY_MAPPING_128.get(UUID.fromString("000005d7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005d8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Farm Jenny LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000005d8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005d9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Toyo Electronics Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000005d9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005da-0000-1000-8000-00805f9b34fb")));
        assertEquals("Applied Neural Research Corp",
                COMPANY_MAPPING_128.get(UUID.fromString("000005da-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005db-0000-1000-8000-00805f9b34fb")));
        assertEquals("Avid Identification Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005db-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005dc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Petronics Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005dc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005dd-0000-1000-8000-00805f9b34fb")));
        assertEquals("essentim GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000005dd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005de-0000-1000-8000-00805f9b34fb")));
        assertEquals("QT Medical INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005de-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005df-0000-1000-8000-00805f9b34fb")));
        assertEquals("VIRTUALCLINIC.DIRECT LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("000005df-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005e0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Viper Design LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000005e0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005e1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Human, Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("000005e1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005e2-0000-1000-8000-00805f9b34fb")));
        assertEquals("stAPPtronics GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000005e2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005e3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Elemental Machines, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005e3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005e4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Taiyo Yuden Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000005e4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005e5-0000-1000-8000-00805f9b34fb")));
        assertEquals("INEO ENERGY& SYSTEMS",
                COMPANY_MAPPING_128.get(UUID.fromString("000005e5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005e6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Motion Instruments Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005e6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005e7-0000-1000-8000-00805f9b34fb")));
        assertEquals("PressurePro", COMPANY_MAPPING_128.get(UUID.fromString("000005e7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005e8-0000-1000-8000-00805f9b34fb")));
        assertEquals("COWBOY", COMPANY_MAPPING_128.get(UUID.fromString("000005e8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005e9-0000-1000-8000-00805f9b34fb")));
        assertEquals("iconmobile GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000005e9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ea-0000-1000-8000-00805f9b34fb")));
        assertEquals("ACS-Control-System GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000005ea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005eb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bayerische Motoren Werke AG",
                COMPANY_MAPPING_128.get(UUID.fromString("000005eb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gycom Svenska AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000005ec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ed-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fuji Xerox Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000005ed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wristcam Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000005ee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ef-0000-1000-8000-00805f9b34fb")));
        assertEquals("SIKOM AS", COMPANY_MAPPING_128.get(UUID.fromString("000005ef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005f0-0000-1000-8000-00805f9b34fb")));
        assertEquals("beken", COMPANY_MAPPING_128.get(UUID.fromString("000005f0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005f1-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Linux Foundation",
                COMPANY_MAPPING_128.get(UUID.fromString("000005f1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005f2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Try and E CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005f2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005f3-0000-1000-8000-00805f9b34fb")));
        assertEquals("SeeScan", COMPANY_MAPPING_128.get(UUID.fromString("000005f3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005f4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Clearity, LLC", COMPANY_MAPPING_128.get(UUID.fromString("000005f4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005f5-0000-1000-8000-00805f9b34fb")));
        assertEquals("GS TAG", COMPANY_MAPPING_128.get(UUID.fromString("000005f5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005f6-0000-1000-8000-00805f9b34fb")));
        assertEquals("DPTechnics", COMPANY_MAPPING_128.get(UUID.fromString("000005f6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005f7-0000-1000-8000-00805f9b34fb")));
        assertEquals("TRACMO, INC.", COMPANY_MAPPING_128.get(UUID.fromString("000005f7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005f8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anki Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000005f8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005f9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hagleitner Hygiene International GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000005f9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005fa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Konami Sports Life Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000005fa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005fb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Arblet Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000005fb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005fc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Masbando GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000005fc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005fd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innoseis", COMPANY_MAPPING_128.get(UUID.fromString("000005fd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005fe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Niko nv", COMPANY_MAPPING_128.get(UUID.fromString("000005fe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000005ff-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wellnomics Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000005ff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000600-0000-1000-8000-00805f9b34fb")));
        assertEquals("iRobot Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000600-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000601-0000-1000-8000-00805f9b34fb")));
        assertEquals("Schrader Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("00000601-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000602-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geberit International AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000602-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000603-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fourth Evolution Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000603-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000604-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cell2Jack LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000604-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000605-0000-1000-8000-00805f9b34fb")));
        assertEquals("FMW electronic Futterer u. Maier-Wolf OHG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000605-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000606-0000-1000-8000-00805f9b34fb")));
        assertEquals("John Deere", COMPANY_MAPPING_128.get(UUID.fromString("00000606-0000-1000-8000-00805f9b34fb")));
    }

    @Test
    public void test_map_00002() {
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000607-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rookery Technology Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000607-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000608-0000-1000-8000-00805f9b34fb")));
        assertEquals("KeySafe-Cloud", COMPANY_MAPPING_128.get(UUID.fromString("00000608-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000609-0000-1000-8000-00805f9b34fb")));
        assertEquals("BUCHI Labortechnik AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000609-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000060a-0000-1000-8000-00805f9b34fb")));
        assertEquals("IQAir AG", COMPANY_MAPPING_128.get(UUID.fromString("0000060a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000060b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Triax Technologies Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000060b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000060c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vuzix Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000060c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000060d-0000-1000-8000-00805f9b34fb")));
        assertEquals("TDK Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000060d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000060e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blueair AB", COMPANY_MAPPING_128.get(UUID.fromString("0000060e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000060f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Signify Netherlands B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000060f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000610-0000-1000-8000-00805f9b34fb")));
        assertEquals("ADH GUARDIAN USA LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000610-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000611-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beurer GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000611-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000612-0000-1000-8000-00805f9b34fb")));
        assertEquals("Playfinity AS", COMPANY_MAPPING_128.get(UUID.fromString("00000612-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000613-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hans Dinslage GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000613-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000614-0000-1000-8000-00805f9b34fb")));
        assertEquals("OnAsset Intelligence, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000614-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000615-0000-1000-8000-00805f9b34fb")));
        assertEquals("INTER ACTION Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000615-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000616-0000-1000-8000-00805f9b34fb")));
        assertEquals("OS42 UG (haftungsbeschraenkt)",
                COMPANY_MAPPING_128.get(UUID.fromString("00000616-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000617-0000-1000-8000-00805f9b34fb")));
        assertEquals("WIZCONNECTED COMPANY LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000617-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000618-0000-1000-8000-00805f9b34fb")));
        assertEquals("Audio-Technica Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000618-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000619-0000-1000-8000-00805f9b34fb")));
        assertEquals("Six Guys Labs, s.r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000619-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000061a-0000-1000-8000-00805f9b34fb")));
        assertEquals("R.W. Beckett Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000061a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000061b-0000-1000-8000-00805f9b34fb")));
        assertEquals("silex technology, inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000061b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000061c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Univations Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000061c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000061d-0000-1000-8000-00805f9b34fb")));
        assertEquals("SENS Innovation ApS",
                COMPANY_MAPPING_128.get(UUID.fromString("0000061d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000061e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Diamond Kinetics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000061e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000061f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Phrame Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000061f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000620-0000-1000-8000-00805f9b34fb")));
        assertEquals("Forciot Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000620-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000621-0000-1000-8000-00805f9b34fb")));
        assertEquals("Noordung d.o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000621-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000622-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beam Labs, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000622-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000623-0000-1000-8000-00805f9b34fb")));
        assertEquals("Philadelphia Scientific (U.K.) Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000623-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000624-0000-1000-8000-00805f9b34fb")));
        assertEquals("Biovotion AG", COMPANY_MAPPING_128.get(UUID.fromString("00000624-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000625-0000-1000-8000-00805f9b34fb")));
        assertEquals("Square Panda, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000625-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000626-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amplifico", COMPANY_MAPPING_128.get(UUID.fromString("00000626-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000627-0000-1000-8000-00805f9b34fb")));
        assertEquals("WEG S.A.", COMPANY_MAPPING_128.get(UUID.fromString("00000627-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000628-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ensto Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000628-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000629-0000-1000-8000-00805f9b34fb")));
        assertEquals("PHONEPE PVT LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000629-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000062a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lunatico Astronomia SL",
                COMPANY_MAPPING_128.get(UUID.fromString("0000062a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000062b-0000-1000-8000-00805f9b34fb")));
        assertEquals("MinebeaMitsumi Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000062b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000062c-0000-1000-8000-00805f9b34fb")));
        assertEquals("ASPion GmbH", COMPANY_MAPPING_128.get(UUID.fromString("0000062c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000062d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vossloh-Schwabe Deutschland GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000062d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000062e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Procept", COMPANY_MAPPING_128.get(UUID.fromString("0000062e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000062f-0000-1000-8000-00805f9b34fb")));
        assertEquals("ONKYO Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000062f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000630-0000-1000-8000-00805f9b34fb")));
        assertEquals("Asthrea D.O.O.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000630-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000631-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fortiori Design LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000631-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000632-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hugo Muller GmbH & Co KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000632-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000633-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wangi Lai PLT", COMPANY_MAPPING_128.get(UUID.fromString("00000633-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000634-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fanstel Corp", COMPANY_MAPPING_128.get(UUID.fromString("00000634-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000635-0000-1000-8000-00805f9b34fb")));
        assertEquals("Crookwood", COMPANY_MAPPING_128.get(UUID.fromString("00000635-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000636-0000-1000-8000-00805f9b34fb")));
        assertEquals("ELECTRONICA INTEGRAL DE SONIDO S.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000636-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000637-0000-1000-8000-00805f9b34fb")));
        assertEquals("GiP Innovation Tools GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000637-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000638-0000-1000-8000-00805f9b34fb")));
        assertEquals("LX SOLUTIONS PTY LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000638-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000639-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Minew Technologies Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000639-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000063a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Prolojik Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000063a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000063b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kromek Group Plc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000063b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000063c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Contec Medical Systems Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000063c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000063d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xradio Technology Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000063d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000063e-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Indoor Lab, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000063e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000063f-0000-1000-8000-00805f9b34fb")));
        assertEquals("LDL TECHNOLOGY",
                COMPANY_MAPPING_128.get(UUID.fromString("0000063f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000640-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dish Network LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000640-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000641-0000-1000-8000-00805f9b34fb")));
        assertEquals("Revenue Collection Systems FRANCE SAS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000641-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000642-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bluetrum Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000642-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000643-0000-1000-8000-00805f9b34fb")));
        assertEquals("makita corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000643-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000644-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apogee Instruments",
                COMPANY_MAPPING_128.get(UUID.fromString("00000644-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000645-0000-1000-8000-00805f9b34fb")));
        assertEquals("BM3", COMPANY_MAPPING_128.get(UUID.fromString("00000645-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000646-0000-1000-8000-00805f9b34fb")));
        assertEquals("SGV Group Holding GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000646-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000647-0000-1000-8000-00805f9b34fb")));
        assertEquals("MED-EL", COMPANY_MAPPING_128.get(UUID.fromString("00000647-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000648-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ultune Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000648-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000649-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ryeex Technology Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000649-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000064a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Open Research Institute, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000064a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000064b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Scale-Tec, Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000064b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000064c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zumtobel Group AG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000064c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000064d-0000-1000-8000-00805f9b34fb")));
        assertEquals("iLOQ Oy", COMPANY_MAPPING_128.get(UUID.fromString("0000064d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000064e-0000-1000-8000-00805f9b34fb")));
        assertEquals("KRUXWorks Technologies Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000064e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000064f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Digital Matter Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000064f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000650-0000-1000-8000-00805f9b34fb")));
        assertEquals("Coravin, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000650-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000651-0000-1000-8000-00805f9b34fb")));
        assertEquals("Stasis Labs, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000651-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000652-0000-1000-8000-00805f9b34fb")));
        assertEquals("ITZ Innovations- und Technologiezentrum GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000652-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000653-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meggitt SA", COMPANY_MAPPING_128.get(UUID.fromString("00000653-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000654-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ledlenser GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000654-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000655-0000-1000-8000-00805f9b34fb")));
        assertEquals("Renishaw PLC", COMPANY_MAPPING_128.get(UUID.fromString("00000655-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000656-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZhuHai AdvanPro Technology Company Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000656-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000657-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meshtronix Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000657-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000658-0000-1000-8000-00805f9b34fb")));
        assertEquals("Payex Norge AS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000658-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000659-0000-1000-8000-00805f9b34fb")));
        assertEquals("UnSeen Technologies Oy",
                COMPANY_MAPPING_128.get(UUID.fromString("00000659-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000065a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zound Industries International AB",
                COMPANY_MAPPING_128.get(UUID.fromString("0000065a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000065b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sesam Solutions BV",
                COMPANY_MAPPING_128.get(UUID.fromString("0000065b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000065c-0000-1000-8000-00805f9b34fb")));
        assertEquals("PixArt Imaging Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000065c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000065d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Panduit Corp.", COMPANY_MAPPING_128.get(UUID.fromString("0000065d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000065e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alo AB", COMPANY_MAPPING_128.get(UUID.fromString("0000065e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000065f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ricoh Company Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000065f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000660-0000-1000-8000-00805f9b34fb")));
        assertEquals("RTC Industries, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000660-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000661-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mode Lighting Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000661-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000662-0000-1000-8000-00805f9b34fb")));
        assertEquals("Particle Industries, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000662-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000663-0000-1000-8000-00805f9b34fb")));
        assertEquals("Advanced Telemetry Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000663-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000664-0000-1000-8000-00805f9b34fb")));
        assertEquals("RHA TECHNOLOGIES LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000664-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000665-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pure International Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000665-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000666-0000-1000-8000-00805f9b34fb")));
        assertEquals("WTO Werkzeug-Einrichtungen GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000666-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000667-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spark Technology Labs Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000667-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000668-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bleb Technology srl",
                COMPANY_MAPPING_128.get(UUID.fromString("00000668-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000669-0000-1000-8000-00805f9b34fb")));
        assertEquals("Livanova USA, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000669-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000066a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Brady Worldwide Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000066a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000066b-0000-1000-8000-00805f9b34fb")));
        assertEquals("DewertOkin GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000066b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000066c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ztove ApS", COMPANY_MAPPING_128.get(UUID.fromString("0000066c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000066d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Venso EcoSolutions AB",
                COMPANY_MAPPING_128.get(UUID.fromString("0000066d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000066e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eurotronik Kranj d.o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000066e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000066f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hug Technology Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000066f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000670-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gema Switzerland GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000670-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000671-0000-1000-8000-00805f9b34fb")));
        assertEquals("Buzz Products Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000671-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000672-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kopi", COMPANY_MAPPING_128.get(UUID.fromString("00000672-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000673-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innova Ideas Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000673-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000674-0000-1000-8000-00805f9b34fb")));
        assertEquals("BeSpoon", COMPANY_MAPPING_128.get(UUID.fromString("00000674-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000675-0000-1000-8000-00805f9b34fb")));
        assertEquals("Deco Enterprises, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000675-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000676-0000-1000-8000-00805f9b34fb")));
        assertEquals("Expai Solutions Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000676-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000677-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innovation First, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000677-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000678-0000-1000-8000-00805f9b34fb")));
        assertEquals("SABIK Offshore GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000678-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000679-0000-1000-8000-00805f9b34fb")));
        assertEquals("4iiii Innovations Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000679-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000067a-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Energy Conservatory, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000067a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000067b-0000-1000-8000-00805f9b34fb")));
        assertEquals("I.FARM, INC.", COMPANY_MAPPING_128.get(UUID.fromString("0000067b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000067c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tile, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000067c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000067d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Form Athletica Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000067d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000067e-0000-1000-8000-00805f9b34fb")));
        assertEquals("MbientLab Inc", COMPANY_MAPPING_128.get(UUID.fromString("0000067e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000067f-0000-1000-8000-00805f9b34fb")));
        assertEquals("NETGRID S.N.C. DI BISSOLI MATTEO, CAMPOREALE SIMONE, TOGNETTI FEDERICO",
                COMPANY_MAPPING_128.get(UUID.fromString("0000067f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000680-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mannkind Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000680-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000681-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trade FIDES a.s.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000681-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000682-0000-1000-8000-00805f9b34fb")));
        assertEquals("Photron Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000682-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000683-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eltako GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000683-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000684-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dermalapps, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000684-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000685-0000-1000-8000-00805f9b34fb")));
        assertEquals("Greenwald Industries",
                COMPANY_MAPPING_128.get(UUID.fromString("00000685-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000686-0000-1000-8000-00805f9b34fb")));
        assertEquals("inQs Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000686-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000687-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cherry GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000687-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000688-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amsted Digital Solutions Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000688-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000689-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tacx b.v.", COMPANY_MAPPING_128.get(UUID.fromString("00000689-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000068a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Raytac Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000068a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000068b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jiangsu Teranovo Tech Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000068b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000068c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Changzhou Sound Dragon Electronics and Acoustics Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000068c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000068d-0000-1000-8000-00805f9b34fb")));
        assertEquals("JetBeep Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000068d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000068e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Razer Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000068e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000068f-0000-1000-8000-00805f9b34fb")));
        assertEquals("JRM Group Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000068f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000690-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eccrine Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000690-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000691-0000-1000-8000-00805f9b34fb")));
        assertEquals("Curie Point AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000691-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000692-0000-1000-8000-00805f9b34fb")));
        assertEquals("Georg Fischer AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000692-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000693-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hach - Danaher",
                COMPANY_MAPPING_128.get(UUID.fromString("00000693-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000694-0000-1000-8000-00805f9b34fb")));
        assertEquals("T&A Laboratories LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000694-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000695-0000-1000-8000-00805f9b34fb")));
        assertEquals("Koki Holdings Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000695-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000696-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gunakar Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000696-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000697-0000-1000-8000-00805f9b34fb")));
        assertEquals("Stemco Products Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000697-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000698-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wood IT Security, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000698-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000699-0000-1000-8000-00805f9b34fb")));
        assertEquals("RandomLab SAS", COMPANY_MAPPING_128.get(UUID.fromString("00000699-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000069a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Adero, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000069a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000069b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dragonchip Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000069b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000069c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Noomi AB", COMPANY_MAPPING_128.get(UUID.fromString("0000069c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000069d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vakaros LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000069d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000069e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Delta Electronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000069e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000069f-0000-1000-8000-00805f9b34fb")));
        assertEquals("FlowMotion Technologies AS",
                COMPANY_MAPPING_128.get(UUID.fromString("0000069f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006a0-0000-1000-8000-00805f9b34fb")));
        assertEquals("OBIQ Location Technology Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006a0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006a1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cardo Systems, Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000006a1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006a2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Globalworx GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000006a2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006a3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nymbus, LLC", COMPANY_MAPPING_128.get(UUID.fromString("000006a3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006a4-0000-1000-8000-00805f9b34fb")));
        assertEquals("LIMNO Co. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006a4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006a5-0000-1000-8000-00805f9b34fb")));
        assertEquals("TEKZITEL PTY LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000006a5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006a6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Roambee Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000006a6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006a7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chipsea Technologies (ShenZhen) Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006a7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006a8-0000-1000-8000-00805f9b34fb")));
        assertEquals("GD Midea Air-Conditioning Equipment Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006a8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006a9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Soundmax Electronics Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000006a9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006aa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Produal Oy", COMPANY_MAPPING_128.get(UUID.fromString("000006aa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ab-0000-1000-8000-00805f9b34fb")));
        assertEquals("HMS Industrial Networks AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000006ab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ac-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ingchips Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006ac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ad-0000-1000-8000-00805f9b34fb")));
        assertEquals("InnovaSea Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006ad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ae-0000-1000-8000-00805f9b34fb")));
        assertEquals("SenseQ Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000006ae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006af-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shoof Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("000006af-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006b0-0000-1000-8000-00805f9b34fb")));
        assertEquals("BRK Brands, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006b0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006b1-0000-1000-8000-00805f9b34fb")));
        assertEquals("SimpliSafe, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006b1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006b2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tussock Innovation 2013 Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000006b2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006b3-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Hablab ApS",
                COMPANY_MAPPING_128.get(UUID.fromString("000006b3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006b4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sencilion Oy", COMPANY_MAPPING_128.get(UUID.fromString("000006b4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006b5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wabilogic Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006b5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006b6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sociometric Solutions, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006b6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006b7-0000-1000-8000-00805f9b34fb")));
        assertEquals("iCOGNIZE GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000006b7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006b8-0000-1000-8000-00805f9b34fb")));
        assertEquals("ShadeCraft, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000006b8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006b9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beflex Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000006b9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beaconzone Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000006ba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006bb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Leaftronix Analogic Solutions Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000006bb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006bc-0000-1000-8000-00805f9b34fb")));
        assertEquals("TWS Srl", COMPANY_MAPPING_128.get(UUID.fromString("000006bc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006bd-0000-1000-8000-00805f9b34fb")));
        assertEquals("ABB Oy", COMPANY_MAPPING_128.get(UUID.fromString("000006bd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006be-0000-1000-8000-00805f9b34fb")));
        assertEquals("HitSeed Oy", COMPANY_MAPPING_128.get(UUID.fromString("000006be-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006bf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Delcom Products Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006bf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006c0-0000-1000-8000-00805f9b34fb")));
        assertEquals("CAME S.p.A.", COMPANY_MAPPING_128.get(UUID.fromString("000006c0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006c1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alarm.com Holdings, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000006c1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006c2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Measurlogic Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006c2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006c3-0000-1000-8000-00805f9b34fb")));
        assertEquals("King I Electronics.Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000006c3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006c4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dream Labs GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000006c4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006c5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Urban Compass, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000006c5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006c6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Simm Tronic Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000006c6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006c7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Somatix Inc", COMPANY_MAPPING_128.get(UUID.fromString("000006c7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006c8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Storz & Bickel GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000006c8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006c9-0000-1000-8000-00805f9b34fb")));
        assertEquals("MYLAPS B.V.", COMPANY_MAPPING_128.get(UUID.fromString("000006c9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Zhongguang Infotech Technology Development Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000006ca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006cb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dyeware, LLC", COMPANY_MAPPING_128.get(UUID.fromString("000006cb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006cc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dongguan SmartAction Technology Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006cc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006cd-0000-1000-8000-00805f9b34fb")));
        assertEquals("DIG Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000006cd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ce-0000-1000-8000-00805f9b34fb")));
        assertEquals("FIOR & GENTZ", COMPANY_MAPPING_128.get(UUID.fromString("000006ce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006cf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Belparts N.V.", COMPANY_MAPPING_128.get(UUID.fromString("000006cf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006d0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Etekcity Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000006d0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006d1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meyer Sound Laboratories, Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("000006d1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006d2-0000-1000-8000-00805f9b34fb")));
        assertEquals("CeoTronics AG", COMPANY_MAPPING_128.get(UUID.fromString("000006d2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006d3-0000-1000-8000-00805f9b34fb")));
        assertEquals("TriTeq Lock and Security, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000006d3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006d4-0000-1000-8000-00805f9b34fb")));
        assertEquals("DYNAKODE TECHNOLOGY PRIVATE LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("000006d4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006d5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensirion AG", COMPANY_MAPPING_128.get(UUID.fromString("000006d5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006d6-0000-1000-8000-00805f9b34fb")));
        assertEquals("JCT Healthcare Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000006d6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006d7-0000-1000-8000-00805f9b34fb")));
        assertEquals("FUBA Automotive Electronics GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000006d7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006d8-0000-1000-8000-00805f9b34fb")));
        assertEquals("AW Company", COMPANY_MAPPING_128.get(UUID.fromString("000006d8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006d9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Mountain View Silicon Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006d9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006da-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zliide Technologies ApS",
                COMPANY_MAPPING_128.get(UUID.fromString("000006da-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006db-0000-1000-8000-00805f9b34fb")));
        assertEquals("Automatic Labs, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006db-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006dc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Industrial Network Controls, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000006dc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006dd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intellithings Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006dd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006de-0000-1000-8000-00805f9b34fb")));
        assertEquals("Navcast, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000006de-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006df-0000-1000-8000-00805f9b34fb")));
        assertEquals("HLI Solutions Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006df-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006e0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Avaya Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000006e0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006e1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Milestone AV Technologies LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000006e1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006e2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alango Technologies Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000006e2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006e3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spinlock Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000006e3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006e4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aluna", COMPANY_MAPPING_128.get(UUID.fromString("000006e4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006e5-0000-1000-8000-00805f9b34fb")));
        assertEquals("OPTEX CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006e5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006e6-0000-1000-8000-00805f9b34fb")));
        assertEquals("NIHON DENGYO KOUSAKU",
                COMPANY_MAPPING_128.get(UUID.fromString("000006e6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006e7-0000-1000-8000-00805f9b34fb")));
        assertEquals("VELUX A/S", COMPANY_MAPPING_128.get(UUID.fromString("000006e7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006e8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Almendo Technologies GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000006e8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006e9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zmartfun Electronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006e9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ea-0000-1000-8000-00805f9b34fb")));
        assertEquals("SafeLine Sweden AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000006ea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006eb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Houston Radar LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000006eb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sigur", COMPANY_MAPPING_128.get(UUID.fromString("000006ec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ed-0000-1000-8000-00805f9b34fb")));
        assertEquals("J Neades Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000006ed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Avantis Systems Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000006ee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ef-0000-1000-8000-00805f9b34fb")));
        assertEquals("ALCARE Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006ef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006f0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chargy Technologies, SL",
                COMPANY_MAPPING_128.get(UUID.fromString("000006f0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006f1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shibutani Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006f1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006f2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trapper Data AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000006f2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006f3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alfred International Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006f3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006f4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Touché Technology Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000006f4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006f5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vigil Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006f5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006f6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vitulo Plus BV",
                COMPANY_MAPPING_128.get(UUID.fromString("000006f6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006f7-0000-1000-8000-00805f9b34fb")));
        assertEquals("WILKA Schliesstechnik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000006f7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006f8-0000-1000-8000-00805f9b34fb")));
        assertEquals("BodyPlus Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000006f8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006f9-0000-1000-8000-00805f9b34fb")));
        assertEquals("happybrush GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000006f9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006fa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Enequi AB", COMPANY_MAPPING_128.get(UUID.fromString("000006fa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006fb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sartorius AG", COMPANY_MAPPING_128.get(UUID.fromString("000006fb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006fc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tom Communication Industrial Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006fc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006fd-0000-1000-8000-00805f9b34fb")));
        assertEquals("ESS Embedded System Solutions Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000006fd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006fe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mahr GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000006fe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000006ff-0000-1000-8000-00805f9b34fb")));
        assertEquals("Redpine Signals Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000006ff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000700-0000-1000-8000-00805f9b34fb")));
        assertEquals("TraqFreq LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000700-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000701-0000-1000-8000-00805f9b34fb")));
        assertEquals("PAFERS TECH", COMPANY_MAPPING_128.get(UUID.fromString("00000701-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000702-0000-1000-8000-00805f9b34fb")));
        assertEquals("Akciju sabiedriba \"SAF TEHNIKA\"",
                COMPANY_MAPPING_128.get(UUID.fromString("00000702-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000703-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Jingdong Century Trading Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000703-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000704-0000-1000-8000-00805f9b34fb")));
        assertEquals("JBX Designs Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000704-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000705-0000-1000-8000-00805f9b34fb")));
        assertEquals("AB Electrolux", COMPANY_MAPPING_128.get(UUID.fromString("00000705-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000706-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wernher von Braun Center for ASdvanced Research",
                COMPANY_MAPPING_128.get(UUID.fromString("00000706-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000707-0000-1000-8000-00805f9b34fb")));
        assertEquals("Essity Hygiene and Health Aktiebolag",
                COMPANY_MAPPING_128.get(UUID.fromString("00000707-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000708-0000-1000-8000-00805f9b34fb")));
        assertEquals("Be Interactive Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000708-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000709-0000-1000-8000-00805f9b34fb")));
        assertEquals("Carewear Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000709-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000070a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huf Hülsbeck & Fürst GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000070a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000070b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Element Products, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000070b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000070c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Winner Microelectronics Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000070c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000070d-0000-1000-8000-00805f9b34fb")));
        assertEquals("SmartSnugg Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000070d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000070e-0000-1000-8000-00805f9b34fb")));
        assertEquals("FiveCo Sarl", COMPANY_MAPPING_128.get(UUID.fromString("0000070e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000070f-0000-1000-8000-00805f9b34fb")));
        assertEquals("California Things Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000070f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000710-0000-1000-8000-00805f9b34fb")));
        assertEquals("Audiodo AB", COMPANY_MAPPING_128.get(UUID.fromString("00000710-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000711-0000-1000-8000-00805f9b34fb")));
        assertEquals("ABAX AS", COMPANY_MAPPING_128.get(UUID.fromString("00000711-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000712-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bull Group Company Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000712-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000713-0000-1000-8000-00805f9b34fb")));
        assertEquals("Respiri Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000713-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000714-0000-1000-8000-00805f9b34fb")));
        assertEquals("MindPeace Safety LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000714-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000715-0000-1000-8000-00805f9b34fb")));
        assertEquals("MBARC LABS Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000715-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000716-0000-1000-8000-00805f9b34fb")));
        assertEquals("Altonics", COMPANY_MAPPING_128.get(UUID.fromString("00000716-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000717-0000-1000-8000-00805f9b34fb")));
        assertEquals("iQsquare BV", COMPANY_MAPPING_128.get(UUID.fromString("00000717-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000718-0000-1000-8000-00805f9b34fb")));
        assertEquals("IDIBAIX enginneering",
                COMPANY_MAPPING_128.get(UUID.fromString("00000718-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000719-0000-1000-8000-00805f9b34fb")));
        assertEquals("COREIOT PTY LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000719-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000071a-0000-1000-8000-00805f9b34fb")));
        assertEquals("REVSMART WEARABLE HK CO LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("0000071a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000071b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Precor", COMPANY_MAPPING_128.get(UUID.fromString("0000071b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000071c-0000-1000-8000-00805f9b34fb")));
        assertEquals("F5 Sports, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000071c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000071d-0000-1000-8000-00805f9b34fb")));
        assertEquals("exoTIC Systems",
                COMPANY_MAPPING_128.get(UUID.fromString("0000071d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000071e-0000-1000-8000-00805f9b34fb")));
        assertEquals("DONGGUAN HELE ELECTRONICS CO., LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("0000071e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000071f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dongguan Liesheng Electronic Co.Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000071f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000720-0000-1000-8000-00805f9b34fb")));
        assertEquals("Oculeve, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000720-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000721-0000-1000-8000-00805f9b34fb")));
        assertEquals("Clover Network, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000721-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000722-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xiamen Eholder Electronics Co.Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000722-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000723-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ford Motor Company",
                COMPANY_MAPPING_128.get(UUID.fromString("00000723-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000724-0000-1000-8000-00805f9b34fb")));
        assertEquals("Guangzhou SuperSound Information Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000724-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000725-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tedee Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000725-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000726-0000-1000-8000-00805f9b34fb")));
        assertEquals("PHC Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000726-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000727-0000-1000-8000-00805f9b34fb")));
        assertEquals("STALKIT AS", COMPANY_MAPPING_128.get(UUID.fromString("00000727-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000728-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eli Lilly and Company",
                COMPANY_MAPPING_128.get(UUID.fromString("00000728-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000729-0000-1000-8000-00805f9b34fb")));
        assertEquals("SwaraLink Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000729-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000072a-0000-1000-8000-00805f9b34fb")));
        assertEquals("JMR embedded systems GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000072a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000072b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bitkey Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000072b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000072c-0000-1000-8000-00805f9b34fb")));
        assertEquals("GWA Hygiene GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000072c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000072d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Safera Oy", COMPANY_MAPPING_128.get(UUID.fromString("0000072d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000072e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Open Platform Systems LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000072e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000072f-0000-1000-8000-00805f9b34fb")));
        assertEquals("OnePlus Electronics (Shenzhen) Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000072f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000730-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wildlife Acoustics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000730-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000731-0000-1000-8000-00805f9b34fb")));
        assertEquals("ABLIC Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000731-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000732-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dairy Tech, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000732-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000733-0000-1000-8000-00805f9b34fb")));
        assertEquals("Iguanavation, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000733-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000734-0000-1000-8000-00805f9b34fb")));
        assertEquals("DiUS Computing Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000734-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000735-0000-1000-8000-00805f9b34fb")));
        assertEquals("UpRight Technologies LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000735-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000736-0000-1000-8000-00805f9b34fb")));
        assertEquals("Luna XIO, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000736-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000737-0000-1000-8000-00805f9b34fb")));
        assertEquals("LLC Navitek", COMPANY_MAPPING_128.get(UUID.fromString("00000737-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000738-0000-1000-8000-00805f9b34fb")));
        assertEquals("Glass Security Pte Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000738-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000739-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jiangsu Qinheng Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000739-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000073a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chandler Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000073a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000073b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fantini Cosmi s.p.a.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000073b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000073c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Acubit ApS", COMPANY_MAPPING_128.get(UUID.fromString("0000073c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000073d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Hao Heng Tian Tech Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000073d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000073e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bluepack S.R.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000073e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000073f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Unisoc Technologies Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000073f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000740-0000-1000-8000-00805f9b34fb")));
        assertEquals("HITIQ LIMITED", COMPANY_MAPPING_128.get(UUID.fromString("00000740-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000741-0000-1000-8000-00805f9b34fb")));
        assertEquals("MAC SRL", COMPANY_MAPPING_128.get(UUID.fromString("00000741-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000742-0000-1000-8000-00805f9b34fb")));
        assertEquals("DML LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000742-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000743-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sanofi", COMPANY_MAPPING_128.get(UUID.fromString("00000743-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000744-0000-1000-8000-00805f9b34fb")));
        assertEquals("SOCOMEC", COMPANY_MAPPING_128.get(UUID.fromString("00000744-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000745-0000-1000-8000-00805f9b34fb")));
        assertEquals("WIZNOVA, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000745-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000746-0000-1000-8000-00805f9b34fb")));
        assertEquals("Seitec Elektronik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000746-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000747-0000-1000-8000-00805f9b34fb")));
        assertEquals("OR Technologies Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000747-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000748-0000-1000-8000-00805f9b34fb")));
        assertEquals("GuangZhou KuGou Computer Technology Co.Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000748-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000749-0000-1000-8000-00805f9b34fb")));
        assertEquals("DIAODIAO (Beijing) Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000749-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000074a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Illusory Studios LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000074a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000074b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sarvavid Software Solutions LLP",
                COMPANY_MAPPING_128.get(UUID.fromString("0000074b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000074c-0000-1000-8000-00805f9b34fb")));
        assertEquals("iopool s.a.", COMPANY_MAPPING_128.get(UUID.fromString("0000074c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000074d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amtech Systems, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000074d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000074e-0000-1000-8000-00805f9b34fb")));
        assertEquals("EAGLE DETECTION SA",
                COMPANY_MAPPING_128.get(UUID.fromString("0000074e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000074f-0000-1000-8000-00805f9b34fb")));
        assertEquals("MEDIATECH S.R.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000074f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000750-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hamilton Professional Services of Canada Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("00000750-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000751-0000-1000-8000-00805f9b34fb")));
        assertEquals("Changsha JEMO IC Design Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000751-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000752-0000-1000-8000-00805f9b34fb")));
        assertEquals("Elatec GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000752-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000753-0000-1000-8000-00805f9b34fb")));
        assertEquals("JLG Industries, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000753-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000754-0000-1000-8000-00805f9b34fb")));
        assertEquals("Michael Parkin",
                COMPANY_MAPPING_128.get(UUID.fromString("00000754-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000755-0000-1000-8000-00805f9b34fb")));
        assertEquals("Brother Industries, Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000755-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000756-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lumens For Less, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000756-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000757-0000-1000-8000-00805f9b34fb")));
        assertEquals("ELA Innovation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000757-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000758-0000-1000-8000-00805f9b34fb")));
        assertEquals("umanSense AB", COMPANY_MAPPING_128.get(UUID.fromString("00000758-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000759-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai InGeek Cyber Security Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000759-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000075a-0000-1000-8000-00805f9b34fb")));
        assertEquals("HARMAN CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000075a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000075b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smart Sensor Devices AB",
                COMPANY_MAPPING_128.get(UUID.fromString("0000075b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000075c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Antitronics Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000075c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000075d-0000-1000-8000-00805f9b34fb")));
        assertEquals("RHOMBUS SYSTEMS, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000075d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000075e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Katerra Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000075e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000075f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Remote Solution Co., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000075f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000760-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vimar SpA", COMPANY_MAPPING_128.get(UUID.fromString("00000760-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000761-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mantis Tech LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000761-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000762-0000-1000-8000-00805f9b34fb")));
        assertEquals("TerOpta Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000762-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000763-0000-1000-8000-00805f9b34fb")));
        assertEquals("PIKOLIN S.L.", COMPANY_MAPPING_128.get(UUID.fromString("00000763-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000764-0000-1000-8000-00805f9b34fb")));
        assertEquals("WWZN Information Technology Company Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000764-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000765-0000-1000-8000-00805f9b34fb")));
        assertEquals("Voxx International",
                COMPANY_MAPPING_128.get(UUID.fromString("00000765-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000766-0000-1000-8000-00805f9b34fb")));
        assertEquals("ART AND PROGRAM, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000766-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000767-0000-1000-8000-00805f9b34fb")));
        assertEquals("NITTO DENKO ASIA TECHNICAL CENTRE PTE. LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000767-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000768-0000-1000-8000-00805f9b34fb")));
        assertEquals("Peloton Interactive Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000768-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000769-0000-1000-8000-00805f9b34fb")));
        assertEquals("Force Impact Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000769-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000076a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dmac Mobile Developments, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000076a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000076b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Engineered Medical Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("0000076b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000076c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Noodle Technology inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000076c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000076d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Graesslin GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000076d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000076e-0000-1000-8000-00805f9b34fb")));
        assertEquals("WuQi technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000076e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000076f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Successful Endeavours Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000076f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000770-0000-1000-8000-00805f9b34fb")));
        assertEquals("InnoCon Medical ApS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000770-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000771-0000-1000-8000-00805f9b34fb")));
        assertEquals("Corvex Connected Safety",
                COMPANY_MAPPING_128.get(UUID.fromString("00000771-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000772-0000-1000-8000-00805f9b34fb")));
        assertEquals("Thirdwayv Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000772-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000773-0000-1000-8000-00805f9b34fb")));
        assertEquals("Echoflex Solutions Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000773-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000774-0000-1000-8000-00805f9b34fb")));
        assertEquals("C-MAX Asia Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000774-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000775-0000-1000-8000-00805f9b34fb")));
        assertEquals("4eBusiness GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000775-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000776-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cyber Transport Control GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000776-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000777-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cue", COMPANY_MAPPING_128.get(UUID.fromString("00000777-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000778-0000-1000-8000-00805f9b34fb")));
        assertEquals("KOAMTAC INC.", COMPANY_MAPPING_128.get(UUID.fromString("00000778-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000779-0000-1000-8000-00805f9b34fb")));
        assertEquals("Loopshore Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000779-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000077a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Niruha Systems Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000077a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000077b-0000-1000-8000-00805f9b34fb")));
        assertEquals("AmaterZ, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000077b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000077c-0000-1000-8000-00805f9b34fb")));
        assertEquals("radius co., ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000077c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000077d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensority, s.r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000077d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000077e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sparkage Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000077e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000077f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Glenview Software Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000077f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000780-0000-1000-8000-00805f9b34fb")));
        assertEquals("Finch Technologies Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000780-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000781-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qingping Technology (Beijing) Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000781-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000782-0000-1000-8000-00805f9b34fb")));
        assertEquals("DeviceDrive AS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000782-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000783-0000-1000-8000-00805f9b34fb")));
        assertEquals("ESEMBER LIMITED LIABILITY COMPANY",
                COMPANY_MAPPING_128.get(UUID.fromString("00000783-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000784-0000-1000-8000-00805f9b34fb")));
        assertEquals("audifon GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000784-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000785-0000-1000-8000-00805f9b34fb")));
        assertEquals("O2 Micro, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000785-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000786-0000-1000-8000-00805f9b34fb")));
        assertEquals("HLP Controls Pty Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000786-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000787-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pangaea Solution",
                COMPANY_MAPPING_128.get(UUID.fromString("00000787-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000788-0000-1000-8000-00805f9b34fb")));
        assertEquals("BubblyNet, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000788-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000789-0000-1000-8000-00805f9b34fb")));
        assertEquals("PCB Piezotronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000789-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000078a-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Wildflower Foundation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000078a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000078b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Optikam Tech Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000078b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000078c-0000-1000-8000-00805f9b34fb")));
        assertEquals("MINIBREW HOLDING B.V",
                COMPANY_MAPPING_128.get(UUID.fromString("0000078c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000078d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cybex GmbH", COMPANY_MAPPING_128.get(UUID.fromString("0000078d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000078e-0000-1000-8000-00805f9b34fb")));
        assertEquals("FUJIMIC NIIGATA, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000078e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000078f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hanna Instruments, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000078f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000790-0000-1000-8000-00805f9b34fb")));
        assertEquals("KOMPAN A/S", COMPANY_MAPPING_128.get(UUID.fromString("00000790-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000791-0000-1000-8000-00805f9b34fb")));
        assertEquals("Scosche Industries, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000791-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000792-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cricut, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000792-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000793-0000-1000-8000-00805f9b34fb")));
        assertEquals("AEV spol. s r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000793-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000794-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Coca-Cola Company",
                COMPANY_MAPPING_128.get(UUID.fromString("00000794-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000795-0000-1000-8000-00805f9b34fb")));
        assertEquals("GASTEC CORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("00000795-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000796-0000-1000-8000-00805f9b34fb")));
        assertEquals("StarLeaf Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000796-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000797-0000-1000-8000-00805f9b34fb")));
        assertEquals("Water-i.d. GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000797-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000798-0000-1000-8000-00805f9b34fb")));
        assertEquals("HoloKit, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000798-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000799-0000-1000-8000-00805f9b34fb")));
        assertEquals("PlantChoir Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000799-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000079a-0000-1000-8000-00805f9b34fb")));
        assertEquals("GuangDong Oppo Mobile Telecommunications Corp., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000079a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000079b-0000-1000-8000-00805f9b34fb")));
        assertEquals("CST ELECTRONICS (PROPRIETARY) LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("0000079b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000079c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sky UK Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000079c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000079d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Digibale Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000079d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000079e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smartloxx GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000079e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000079f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pune Scientific LLP",
                COMPANY_MAPPING_128.get(UUID.fromString("0000079f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007a0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Regent Beleuchtungskorper AG",
                COMPANY_MAPPING_128.get(UUID.fromString("000007a0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007a1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apollo Neuroscience, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007a1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007a2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Roku, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000007a2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007a3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Comcast Cable", COMPANY_MAPPING_128.get(UUID.fromString("000007a3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007a4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xiamen Mage Information Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007a4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007a5-0000-1000-8000-00805f9b34fb")));
        assertEquals("RAB Lighting, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007a5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007a6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Musen Connect, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007a6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007a7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zume, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000007a7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007a8-0000-1000-8000-00805f9b34fb")));
        assertEquals("conbee GmbH", COMPANY_MAPPING_128.get(UUID.fromString("000007a8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007a9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bruel & Kjaer Sound & Vibration",
                COMPANY_MAPPING_128.get(UUID.fromString("000007a9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007aa-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Kroger Co.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007aa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Granite River Solutions, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007ab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ac-0000-1000-8000-00805f9b34fb")));
        assertEquals("LoupeDeck Oy", COMPANY_MAPPING_128.get(UUID.fromString("000007ac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ad-0000-1000-8000-00805f9b34fb")));
        assertEquals("New H3C Technologies Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000007ad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ae-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aurea Solucoes Tecnologicas Ltda.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007ae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007af-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hong Kong Bouffalo Lab Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000007af-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007b0-0000-1000-8000-00805f9b34fb")));
        assertEquals("GV Concepts Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007b0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007b1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Thomas Dynamics, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000007b1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007b2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Moeco IOT Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007b2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007b3-0000-1000-8000-00805f9b34fb")));
        assertEquals("2N TELEKOMUNIKACE a.s.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007b3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007b4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hormann KG Antriebstechnik",
                COMPANY_MAPPING_128.get(UUID.fromString("000007b4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007b5-0000-1000-8000-00805f9b34fb")));
        assertEquals("CRONO CHIP, S.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007b5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007b6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Soundbrenner Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000007b6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007b7-0000-1000-8000-00805f9b34fb")));
        assertEquals("ETABLISSEMENTS GEORGES RENAULT",
                COMPANY_MAPPING_128.get(UUID.fromString("000007b7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007b8-0000-1000-8000-00805f9b34fb")));
        assertEquals("iSwip", COMPANY_MAPPING_128.get(UUID.fromString("000007b8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007b9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Epona Biotec Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000007b9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Battery-Biz Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007ba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007bb-0000-1000-8000-00805f9b34fb")));
        assertEquals("EPIC S.R.L.", COMPANY_MAPPING_128.get(UUID.fromString("000007bb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007bc-0000-1000-8000-00805f9b34fb")));
        assertEquals("KD CIRCUITS LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000007bc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007bd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Genedrive Diagnostics Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000007bd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007be-0000-1000-8000-00805f9b34fb")));
        assertEquals("Axentia Technologies AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000007be-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007bf-0000-1000-8000-00805f9b34fb")));
        assertEquals("REGULA Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("000007bf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007c0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Biral AG", COMPANY_MAPPING_128.get(UUID.fromString("000007c0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007c1-0000-1000-8000-00805f9b34fb")));
        assertEquals("A.W. Chesterton Company",
                COMPANY_MAPPING_128.get(UUID.fromString("000007c1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007c2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Radinn AB", COMPANY_MAPPING_128.get(UUID.fromString("000007c2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007c3-0000-1000-8000-00805f9b34fb")));
        assertEquals("CIMTechniques, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007c3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007c4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Johnson Health Tech NA",
                COMPANY_MAPPING_128.get(UUID.fromString("000007c4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007c5-0000-1000-8000-00805f9b34fb")));
        assertEquals("June Life, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007c5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007c6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bluenetics GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000007c6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007c7-0000-1000-8000-00805f9b34fb")));
        assertEquals("iaconicDesign Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007c7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007c8-0000-1000-8000-00805f9b34fb")));
        assertEquals("WRLDS Creations AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000007c8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007c9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Skullcandy, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007c9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Modul-System HH AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000007ca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007cb-0000-1000-8000-00805f9b34fb")));
        assertEquals("West Pharmaceutical Services, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007cb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007cc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Barnacle Systems Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007cc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007cd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smart Wave Technologies Canada Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000007cd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ce-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Top-Chip Microelectronics Tech. Co., LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000007ce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007cf-0000-1000-8000-00805f9b34fb")));
        assertEquals("NeoSensory, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007cf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007d0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hangzhou Tuya Information  Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000007d0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007d1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Panchip Microelectronics Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000007d1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007d2-0000-1000-8000-00805f9b34fb")));
        assertEquals("React Accessibility Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000007d2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007d3-0000-1000-8000-00805f9b34fb")));
        assertEquals("LIVNEX Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007d3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007d4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kano Computing Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000007d4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007d5-0000-1000-8000-00805f9b34fb")));
        assertEquals("hoots classic GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000007d5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007d6-0000-1000-8000-00805f9b34fb")));
        assertEquals("ecobee Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000007d6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007d7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nanjing Qinheng Microelectronics Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000007d7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007d8-0000-1000-8000-00805f9b34fb")));
        assertEquals("SOLUTIONS AMBRA INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007d8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007d9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Micro-Design, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007d9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007da-0000-1000-8000-00805f9b34fb")));
        assertEquals("STARLITE Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007da-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007db-0000-1000-8000-00805f9b34fb")));
        assertEquals("Remedee Labs", COMPANY_MAPPING_128.get(UUID.fromString("000007db-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007dc-0000-1000-8000-00805f9b34fb")));
        assertEquals("ThingOS GmbH & Co KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000007dc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007dd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Linear Circuits",
                COMPANY_MAPPING_128.get(UUID.fromString("000007dd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007de-0000-1000-8000-00805f9b34fb")));
        assertEquals("Unlimited Engineering SL",
                COMPANY_MAPPING_128.get(UUID.fromString("000007de-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007df-0000-1000-8000-00805f9b34fb")));
        assertEquals("Snap-on Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("000007df-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007e0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Edifier International Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000007e0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007e1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lucie Labs", COMPANY_MAPPING_128.get(UUID.fromString("000007e1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007e2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alfred Kaercher SE & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000007e2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007e3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Airoha Technology Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007e3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007e4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geeksme S.L.", COMPANY_MAPPING_128.get(UUID.fromString("000007e4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007e5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Minut, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000007e5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007e6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Waybeyond Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000007e6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007e7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Komfort IQ, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007e7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007e8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Packetcraft, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007e8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007e9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Häfele GmbH & Co KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000007e9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ea-0000-1000-8000-00805f9b34fb")));
        assertEquals("ShapeLog, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007ea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007eb-0000-1000-8000-00805f9b34fb")));
        assertEquals("NOVABASE S.R.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007eb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Frecce LLC", COMPANY_MAPPING_128.get(UUID.fromString("000007ec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ed-0000-1000-8000-00805f9b34fb")));
        assertEquals("Joule IQ, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007ed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ee-0000-1000-8000-00805f9b34fb")));
        assertEquals("KidzTek LLC", COMPANY_MAPPING_128.get(UUID.fromString("000007ee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ef-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aktiebolaget Sandvik Coromant",
                COMPANY_MAPPING_128.get(UUID.fromString("000007ef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007f0-0000-1000-8000-00805f9b34fb")));
        assertEquals("e-moola.com Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000007f0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007f1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zimi Innovations Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000007f1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007f2-0000-1000-8000-00805f9b34fb")));
        assertEquals("SERENE GROUP, INC",
                COMPANY_MAPPING_128.get(UUID.fromString("000007f2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007f3-0000-1000-8000-00805f9b34fb")));
        assertEquals("DIGISINE ENERGYTECH CO. LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007f3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007f4-0000-1000-8000-00805f9b34fb")));
        assertEquals("MEDIRLAB Orvosbiologiai Fejleszto Korlatolt Felelossegu Tarsasag",
                COMPANY_MAPPING_128.get(UUID.fromString("000007f4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007f5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Byton North America Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000007f5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007f6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen TonliScience and Technology Development Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000007f6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007f7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cesar Systems Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007f7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007f8-0000-1000-8000-00805f9b34fb")));
        assertEquals("quip NYC Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000007f8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007f9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Direct Communication Solutions, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007f9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007fa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Klipsch Group, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007fa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007fb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Access Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000007fb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007fc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Renault SA", COMPANY_MAPPING_128.get(UUID.fromString("000007fc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007fd-0000-1000-8000-00805f9b34fb")));
        assertEquals("JSK CO., LTD.", COMPANY_MAPPING_128.get(UUID.fromString("000007fd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007fe-0000-1000-8000-00805f9b34fb")));
        assertEquals("BIROTA", COMPANY_MAPPING_128.get(UUID.fromString("000007fe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000007ff-0000-1000-8000-00805f9b34fb")));
        assertEquals("maxon motor ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000007ff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000800-0000-1000-8000-00805f9b34fb")));
        assertEquals("Optek", COMPANY_MAPPING_128.get(UUID.fromString("00000800-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000801-0000-1000-8000-00805f9b34fb")));
        assertEquals("CRONUS ELECTRONICS LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000801-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000802-0000-1000-8000-00805f9b34fb")));
        assertEquals("NantSound, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000802-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000803-0000-1000-8000-00805f9b34fb")));
        assertEquals("Domintell s.a.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000803-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000804-0000-1000-8000-00805f9b34fb")));
        assertEquals("Andon Health Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000804-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000805-0000-1000-8000-00805f9b34fb")));
        assertEquals("Urbanminded Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000805-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000806-0000-1000-8000-00805f9b34fb")));
        assertEquals("TYRI Sweden AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000806-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000807-0000-1000-8000-00805f9b34fb")));
        assertEquals("ECD Electronic Components GmbH Dresden",
                COMPANY_MAPPING_128.get(UUID.fromString("00000807-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000808-0000-1000-8000-00805f9b34fb")));
        assertEquals("SISTEMAS KERN, SOCIEDAD ANÓMINA",
                COMPANY_MAPPING_128.get(UUID.fromString("00000808-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000809-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trulli Audio", COMPANY_MAPPING_128.get(UUID.fromString("00000809-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000080a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Altaneos", COMPANY_MAPPING_128.get(UUID.fromString("0000080a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000080b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nanoleaf Canada Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000080b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000080c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ingy B.V.", COMPANY_MAPPING_128.get(UUID.fromString("0000080c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000080d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Azbil Co.", COMPANY_MAPPING_128.get(UUID.fromString("0000080d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000080e-0000-1000-8000-00805f9b34fb")));
        assertEquals("TATTCOM LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000080e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000080f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Paradox Engineering SA",
                COMPANY_MAPPING_128.get(UUID.fromString("0000080f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000810-0000-1000-8000-00805f9b34fb")));
        assertEquals("LECO Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000810-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000811-0000-1000-8000-00805f9b34fb")));
        assertEquals("Becker Antriebe GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000811-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000812-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mstream Technologies., Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000812-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000813-0000-1000-8000-00805f9b34fb")));
        assertEquals("Flextronics International USA Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000813-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000814-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ossur hf.", COMPANY_MAPPING_128.get(UUID.fromString("00000814-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000815-0000-1000-8000-00805f9b34fb")));
        assertEquals("SKC Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000815-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000816-0000-1000-8000-00805f9b34fb")));
        assertEquals("SPICA SYSTEMS LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000816-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000817-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wangs Alliance Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000817-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000818-0000-1000-8000-00805f9b34fb")));
        assertEquals("tatwah SA", COMPANY_MAPPING_128.get(UUID.fromString("00000818-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000819-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hunter Douglas Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000819-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000081a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Conex",
                COMPANY_MAPPING_128.get(UUID.fromString("0000081a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000081b-0000-1000-8000-00805f9b34fb")));
        assertEquals("DIM3", COMPANY_MAPPING_128.get(UUID.fromString("0000081b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000081c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bobrick Washroom Equipment, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000081c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000081d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Potrykus Holdings and Development LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000081d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000081e-0000-1000-8000-00805f9b34fb")));
        assertEquals("iNFORM Technology GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000081e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000081f-0000-1000-8000-00805f9b34fb")));
        assertEquals("eSenseLab LTD", COMPANY_MAPPING_128.get(UUID.fromString("0000081f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000820-0000-1000-8000-00805f9b34fb")));
        assertEquals("Brilliant Home Technology, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000820-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000821-0000-1000-8000-00805f9b34fb")));
        assertEquals("INOVA Geophysical, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000821-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000822-0000-1000-8000-00805f9b34fb")));
        assertEquals("adafruit industries",
                COMPANY_MAPPING_128.get(UUID.fromString("00000822-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000823-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nexite Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000823-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000824-0000-1000-8000-00805f9b34fb")));
        assertEquals("8Power Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000824-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000825-0000-1000-8000-00805f9b34fb")));
        assertEquals("CME PTE. LTD.", COMPANY_MAPPING_128.get(UUID.fromString("00000825-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000826-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hyundai Motor Company",
                COMPANY_MAPPING_128.get(UUID.fromString("00000826-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000827-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kickmaker", COMPANY_MAPPING_128.get(UUID.fromString("00000827-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000828-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Suisheng Information Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000828-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000829-0000-1000-8000-00805f9b34fb")));
        assertEquals("HEXAGON METROLOGY DIVISION ROMER",
                COMPANY_MAPPING_128.get(UUID.fromString("00000829-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000082a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mitutoyo Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000082a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000082b-0000-1000-8000-00805f9b34fb")));
        assertEquals("shenzhen fitcare electronics Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000082b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000082c-0000-1000-8000-00805f9b34fb")));
        assertEquals("INGICS TECHNOLOGY CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000082c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000082d-0000-1000-8000-00805f9b34fb")));
        assertEquals("INCUS PERFORMANCE LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000082d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000082e-0000-1000-8000-00805f9b34fb")));
        assertEquals("ABB S.p.A.", COMPANY_MAPPING_128.get(UUID.fromString("0000082e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000082f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blippit AB", COMPANY_MAPPING_128.get(UUID.fromString("0000082f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000830-0000-1000-8000-00805f9b34fb")));
        assertEquals("Core Health and Fitness LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000830-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000831-0000-1000-8000-00805f9b34fb")));
        assertEquals("Foxble, LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000831-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000832-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intermotive,Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000832-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000833-0000-1000-8000-00805f9b34fb")));
        assertEquals("Conneqtech B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000833-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000834-0000-1000-8000-00805f9b34fb")));
        assertEquals("RIKEN KEIKI CO., LTD.,",
                COMPANY_MAPPING_128.get(UUID.fromString("00000834-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000835-0000-1000-8000-00805f9b34fb")));
        assertEquals("Canopy Growth Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000835-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000836-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bitwards Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000836-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000837-0000-1000-8000-00805f9b34fb")));
        assertEquals("vivo Mobile Communication Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000837-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000838-0000-1000-8000-00805f9b34fb")));
        assertEquals("Etymotic Research, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000838-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000839-0000-1000-8000-00805f9b34fb")));
        assertEquals("A puissance 3", COMPANY_MAPPING_128.get(UUID.fromString("00000839-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000083a-0000-1000-8000-00805f9b34fb")));
        assertEquals("BPW Bergische Achsen Kommanditgesellschaft",
                COMPANY_MAPPING_128.get(UUID.fromString("0000083a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000083b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Piaggio Fast Forward",
                COMPANY_MAPPING_128.get(UUID.fromString("0000083b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000083c-0000-1000-8000-00805f9b34fb")));
        assertEquals("BeerTech LTD", COMPANY_MAPPING_128.get(UUID.fromString("0000083c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000083d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tokenize, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000083d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000083e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zorachka LTD", COMPANY_MAPPING_128.get(UUID.fromString("0000083e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000083f-0000-1000-8000-00805f9b34fb")));
        assertEquals("D-Link Corp.", COMPANY_MAPPING_128.get(UUID.fromString("0000083f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000840-0000-1000-8000-00805f9b34fb")));
        assertEquals("Down Range Systems LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000840-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000841-0000-1000-8000-00805f9b34fb")));
        assertEquals("General Luminaire (Shanghai) Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000841-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000842-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tangshan HongJia electronic technology co., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000842-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000843-0000-1000-8000-00805f9b34fb")));
        assertEquals("FRAGRANCE DELIVERY TECHNOLOGIES LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000843-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000844-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pepperl + Fuchs GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000844-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000845-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dometic Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000845-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000846-0000-1000-8000-00805f9b34fb")));
        assertEquals("USound GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000846-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000847-0000-1000-8000-00805f9b34fb")));
        assertEquals("DNANUDGE LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000847-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000848-0000-1000-8000-00805f9b34fb")));
        assertEquals("JUJU JOINTS CANADA CORP.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000848-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000849-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dopple Technologies B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000849-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000084a-0000-1000-8000-00805f9b34fb")));
        assertEquals("ARCOM", COMPANY_MAPPING_128.get(UUID.fromString("0000084a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000084b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Biotechware SRL",
                COMPANY_MAPPING_128.get(UUID.fromString("0000084b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000084c-0000-1000-8000-00805f9b34fb")));
        assertEquals("ORSO Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000084c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000084d-0000-1000-8000-00805f9b34fb")));
        assertEquals("SafePort", COMPANY_MAPPING_128.get(UUID.fromString("0000084d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000084e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Carol Cole Company",
                COMPANY_MAPPING_128.get(UUID.fromString("0000084e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000084f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Embedded Fitness B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000084f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000850-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yealink (Xiamen) Network Technology Co.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000850-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000851-0000-1000-8000-00805f9b34fb")));
        assertEquals("Subeca, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000851-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000852-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cognosos, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000852-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000853-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pektron Group Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000853-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000854-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tap Sound System",
                COMPANY_MAPPING_128.get(UUID.fromString("00000854-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000855-0000-1000-8000-00805f9b34fb")));
        assertEquals("Helios Sports, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000855-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000856-0000-1000-8000-00805f9b34fb")));
        assertEquals("Canopy Growth Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000856-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000857-0000-1000-8000-00805f9b34fb")));
        assertEquals("Parsyl Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000857-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000858-0000-1000-8000-00805f9b34fb")));
        assertEquals("SOUNDBOKS", COMPANY_MAPPING_128.get(UUID.fromString("00000858-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000859-0000-1000-8000-00805f9b34fb")));
        assertEquals("BlueUp", COMPANY_MAPPING_128.get(UUID.fromString("00000859-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000085a-0000-1000-8000-00805f9b34fb")));
        assertEquals("DAKATECH", COMPANY_MAPPING_128.get(UUID.fromString("0000085a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000085b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nisshinbo Micro Devices Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000085b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000085c-0000-1000-8000-00805f9b34fb")));
        assertEquals("ACOS CO.,LTD.", COMPANY_MAPPING_128.get(UUID.fromString("0000085c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000085d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Guilin Zhishen Information Technology Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000085d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000085e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Krog Systems LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000085e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000085f-0000-1000-8000-00805f9b34fb")));
        assertEquals("COMPEGPS TEAM,SOCIEDAD LIMITADA",
                COMPANY_MAPPING_128.get(UUID.fromString("0000085f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000860-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alflex Products B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000860-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000861-0000-1000-8000-00805f9b34fb")));
        assertEquals("SmartSensor Labs Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000861-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000862-0000-1000-8000-00805f9b34fb")));
        assertEquals("SmartDrive", COMPANY_MAPPING_128.get(UUID.fromString("00000862-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000863-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yo-tronics Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000863-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000864-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rafaelmicro", COMPANY_MAPPING_128.get(UUID.fromString("00000864-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000865-0000-1000-8000-00805f9b34fb")));
        assertEquals("Emergency Lighting Products Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000865-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000866-0000-1000-8000-00805f9b34fb")));
        assertEquals("LAONZ Co.,Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000866-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000867-0000-1000-8000-00805f9b34fb")));
        assertEquals("Western Digital Techologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000867-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000868-0000-1000-8000-00805f9b34fb")));
        assertEquals("WIOsense GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000868-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000869-0000-1000-8000-00805f9b34fb")));
        assertEquals("EVVA Sicherheitstechnologie GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000869-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000086a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Odic Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("0000086a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000086b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pacific Track, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000086b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000086c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Revvo Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000086c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000086d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Biometrika d.o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000086d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000086e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vorwerk Elektrowerke GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000086e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000086f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trackunit A/S", COMPANY_MAPPING_128.get(UUID.fromString("0000086f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000870-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wyze Labs, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000870-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000871-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dension Elektronikai Kft.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000871-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000872-0000-1000-8000-00805f9b34fb")));
        assertEquals("11 Health & Technologies Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000872-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000873-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innophase Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("00000873-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000874-0000-1000-8000-00805f9b34fb")));
        assertEquals("Treegreen Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000874-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000875-0000-1000-8000-00805f9b34fb")));
        assertEquals("Berner International LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000875-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000876-0000-1000-8000-00805f9b34fb")));
        assertEquals("SmartResQ ApS", COMPANY_MAPPING_128.get(UUID.fromString("00000876-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000877-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tome, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000877-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000878-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Chamberlain Group, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000878-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000879-0000-1000-8000-00805f9b34fb")));
        assertEquals("MIZUNO Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000879-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000087a-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZRF, LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000087a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000087b-0000-1000-8000-00805f9b34fb")));
        assertEquals("BYSTAMP", COMPANY_MAPPING_128.get(UUID.fromString("0000087b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000087c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Crosscan GmbH", COMPANY_MAPPING_128.get(UUID.fromString("0000087c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000087d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Konftel AB", COMPANY_MAPPING_128.get(UUID.fromString("0000087d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000087e-0000-1000-8000-00805f9b34fb")));
        assertEquals("1bar.net Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000087e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000087f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Phillips Connect Technologies LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000087f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000880-0000-1000-8000-00805f9b34fb")));
        assertEquals("imagiLabs AB", COMPANY_MAPPING_128.get(UUID.fromString("00000880-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000881-0000-1000-8000-00805f9b34fb")));
        assertEquals("Optalert", COMPANY_MAPPING_128.get(UUID.fromString("00000881-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000882-0000-1000-8000-00805f9b34fb")));
        assertEquals("PSYONIC, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000882-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000883-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wintersteiger AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000883-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000884-0000-1000-8000-00805f9b34fb")));
        assertEquals("Controlid Industria, Comercio de Hardware e Servicos de Tecnologia Ltda",
                COMPANY_MAPPING_128.get(UUID.fromString("00000884-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000885-0000-1000-8000-00805f9b34fb")));
        assertEquals("LEVOLOR INC", COMPANY_MAPPING_128.get(UUID.fromString("00000885-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000886-0000-1000-8000-00805f9b34fb")));
        assertEquals("Movella Technologies B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000886-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000887-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hydro-Gear Limited Partnership",
                COMPANY_MAPPING_128.get(UUID.fromString("00000887-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000888-0000-1000-8000-00805f9b34fb")));
        assertEquals("EnPointe Fencing Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000888-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000889-0000-1000-8000-00805f9b34fb")));
        assertEquals("XANTHIO", COMPANY_MAPPING_128.get(UUID.fromString("00000889-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000088a-0000-1000-8000-00805f9b34fb")));
        assertEquals("sclak s.r.l.", COMPANY_MAPPING_128.get(UUID.fromString("0000088a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000088b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tricorder Arraay Technologies LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000088b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000088c-0000-1000-8000-00805f9b34fb")));
        assertEquals("GB Solution co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000088c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000088d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Soliton Systems K.K.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000088d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000088e-0000-1000-8000-00805f9b34fb")));
        assertEquals("GIGA-TMS INC", COMPANY_MAPPING_128.get(UUID.fromString("0000088e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000088f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tait International Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000088f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000890-0000-1000-8000-00805f9b34fb")));
        assertEquals("NICHIEI INTEC CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000890-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000891-0000-1000-8000-00805f9b34fb")));
        assertEquals("SmartWireless GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000891-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000892-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ingenieurbuero Birnfeld UG (haftungsbeschraenkt)",
                COMPANY_MAPPING_128.get(UUID.fromString("00000892-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000893-0000-1000-8000-00805f9b34fb")));
        assertEquals("Maytronics Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000893-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000894-0000-1000-8000-00805f9b34fb")));
        assertEquals("EPIFIT", COMPANY_MAPPING_128.get(UUID.fromString("00000894-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000895-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gimer medical", COMPANY_MAPPING_128.get(UUID.fromString("00000895-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000896-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nokian Renkaat Oyj",
                COMPANY_MAPPING_128.get(UUID.fromString("00000896-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000897-0000-1000-8000-00805f9b34fb")));
        assertEquals("Current Lighting Solutions LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000897-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000898-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensibo, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000898-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000899-0000-1000-8000-00805f9b34fb")));
        assertEquals("SFS unimarket AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000899-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000089a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Private limited company \"Teltonika\"",
                COMPANY_MAPPING_128.get(UUID.fromString("0000089a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000089b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Saucon Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("0000089b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000089c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Embedded Devices Co. Company",
                COMPANY_MAPPING_128.get(UUID.fromString("0000089c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000089d-0000-1000-8000-00805f9b34fb")));
        assertEquals("J-J.A.D.E. Enterprise LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000089d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000089e-0000-1000-8000-00805f9b34fb")));
        assertEquals("i-SENS, inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000089e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000089f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Witschi Electronic Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000089f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008a0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aclara Technologies LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000008a0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008a1-0000-1000-8000-00805f9b34fb")));
        assertEquals("EXEO TECH CORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("000008a1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008a2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Epic Systems Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008a2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008a3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hoffmann SE", COMPANY_MAPPING_128.get(UUID.fromString("000008a3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008a4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Realme Chongqing Mobile Telecommunications Corp., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008a4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008a5-0000-1000-8000-00805f9b34fb")));
        assertEquals("UMEHEAL Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000008a5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008a6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intelligenceworks Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008a6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008a7-0000-1000-8000-00805f9b34fb")));
        assertEquals("TGR 1.618 Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000008a7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008a8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Kfcube Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000008a8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008a9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fraunhofer IIS",
                COMPANY_MAPPING_128.get(UUID.fromString("000008a9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008aa-0000-1000-8000-00805f9b34fb")));
        assertEquals("SZ DJI TECHNOLOGY CO.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000008aa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Coburn Technology, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ac-0000-1000-8000-00805f9b34fb")));
        assertEquals("Topre Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ad-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kayamatics Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ae-0000-1000-8000-00805f9b34fb")));
        assertEquals("Moticon ReGo AG",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008af-0000-1000-8000-00805f9b34fb")));
        assertEquals("Polidea Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008af-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008b0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trivedi Advanced Technologies LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000008b0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008b1-0000-1000-8000-00805f9b34fb")));
        assertEquals("CORE|vision BV",
                COMPANY_MAPPING_128.get(UUID.fromString("000008b1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008b2-0000-1000-8000-00805f9b34fb")));
        assertEquals("PF SCHWEISSTECHNOLOGIE GMBH",
                COMPANY_MAPPING_128.get(UUID.fromString("000008b2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008b3-0000-1000-8000-00805f9b34fb")));
        assertEquals("IONIQ Skincare GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("000008b3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008b4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sengled Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008b4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008b5-0000-1000-8000-00805f9b34fb")));
        assertEquals("TransferFi", COMPANY_MAPPING_128.get(UUID.fromString("000008b5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008b6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Boehringer Ingelheim Vetmedica GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000008b6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008b7-0000-1000-8000-00805f9b34fb")));
        assertEquals("ABB Inc", COMPANY_MAPPING_128.get(UUID.fromString("000008b7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008b8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Check Technology Solutions LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000008b8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008b9-0000-1000-8000-00805f9b34fb")));
        assertEquals("U-Shin Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("000008b9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ba-0000-1000-8000-00805f9b34fb")));
        assertEquals("HYPER ICE, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008bb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tokai-rika co.,ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008bb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008bc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Prevayl Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000008bc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008bd-0000-1000-8000-00805f9b34fb")));
        assertEquals("bf1systems limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000008bd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008be-0000-1000-8000-00805f9b34fb")));
        assertEquals("ubisys technologies GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000008be-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008bf-0000-1000-8000-00805f9b34fb")));
        assertEquals("SIRC Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008bf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008c0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Accent Advanced Systems SLU",
                COMPANY_MAPPING_128.get(UUID.fromString("000008c0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008c1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rayden.Earth LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000008c1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008c2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lindinvent AB", COMPANY_MAPPING_128.get(UUID.fromString("000008c2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008c3-0000-1000-8000-00805f9b34fb")));
        assertEquals("CHIPOLO d.o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008c3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008c4-0000-1000-8000-00805f9b34fb")));
        assertEquals("CellAssist, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000008c4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008c5-0000-1000-8000-00805f9b34fb")));
        assertEquals("J. Wagner GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000008c5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008c6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Integra Optics Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000008c6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008c7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Monadnock Systems Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008c7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008c8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Liteboxer Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008c8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008c9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Noventa AG", COMPANY_MAPPING_128.get(UUID.fromString("000008c9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nubia Technology Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008cb-0000-1000-8000-00805f9b34fb")));
        assertEquals("JT INNOVATIONS LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("000008cb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008cc-0000-1000-8000-00805f9b34fb")));
        assertEquals("TGM TECHNOLOGY CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008cc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008cd-0000-1000-8000-00805f9b34fb")));
        assertEquals("ifly", COMPANY_MAPPING_128.get(UUID.fromString("000008cd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ce-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZIMI CORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008cf-0000-1000-8000-00805f9b34fb")));
        assertEquals("betternotstealmybike UG (with limited liability)",
                COMPANY_MAPPING_128.get(UUID.fromString("000008cf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008d0-0000-1000-8000-00805f9b34fb")));
        assertEquals("ESTOM Infotech Kft.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008d0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008d1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensovium Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008d1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008d2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Virscient Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000008d2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008d3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Novel Bits, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000008d3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008d4-0000-1000-8000-00805f9b34fb")));
        assertEquals("ADATA Technology Co., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008d4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008d5-0000-1000-8000-00805f9b34fb")));
        assertEquals("KEYes", COMPANY_MAPPING_128.get(UUID.fromString("000008d5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008d6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nome Oy", COMPANY_MAPPING_128.get(UUID.fromString("000008d6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008d7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inovonics Corp",
                COMPANY_MAPPING_128.get(UUID.fromString("000008d7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008d8-0000-1000-8000-00805f9b34fb")));
        assertEquals("WARES", COMPANY_MAPPING_128.get(UUID.fromString("000008d8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008d9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pointr Labs Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000008d9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008da-0000-1000-8000-00805f9b34fb")));
        assertEquals("Miridia Technology Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("000008da-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008db-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tertium Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("000008db-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008dc-0000-1000-8000-00805f9b34fb")));
        assertEquals("SHENZHEN AUKEY E BUSINESS CO., LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000008dc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008dd-0000-1000-8000-00805f9b34fb")));
        assertEquals("code-Q", COMPANY_MAPPING_128.get(UUID.fromString("000008dd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008de-0000-1000-8000-00805f9b34fb")));
        assertEquals("TE Connectivity Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000008de-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008df-0000-1000-8000-00805f9b34fb")));
        assertEquals("IRIS OHYAMA CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008df-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008e0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Philia Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("000008e0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008e1-0000-1000-8000-00805f9b34fb")));
        assertEquals("KOZO KEIKAKU ENGINEERING Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008e1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008e2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Simo Technology co. LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000008e2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008e3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Republic Wireless, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008e3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008e4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rashidov ltd", COMPANY_MAPPING_128.get(UUID.fromString("000008e4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008e5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Crowd Connected Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000008e5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008e6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eneso Tecnologia de Adaptacion S.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008e6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008e7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Barrot Technology Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008e7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008e8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Naonext", COMPANY_MAPPING_128.get(UUID.fromString("000008e8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008e9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Taiwan Intelligent Home Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008e9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ea-0000-1000-8000-00805f9b34fb")));
        assertEquals("COWBELL ENGINEERING CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008eb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Big Moment Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008eb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Denso Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ed-0000-1000-8000-00805f9b34fb")));
        assertEquals("IMI Hydronic Engineering International SA",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Askey Computer Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ef-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cumulus Digital Systems, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008f0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Joovv, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000008f0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008f1-0000-1000-8000-00805f9b34fb")));
        assertEquals("The L.S. Starrett Company",
                COMPANY_MAPPING_128.get(UUID.fromString("000008f1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008f2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Microoled", COMPANY_MAPPING_128.get(UUID.fromString("000008f2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008f3-0000-1000-8000-00805f9b34fb")));
        assertEquals("PSP - Pauli Services & Products GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000008f3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008f4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kodimo Technologies Company Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000008f4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008f5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tymtix Technologies Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000008f5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008f6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dermal Photonics Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000008f6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008f7-0000-1000-8000-00805f9b34fb")));
        assertEquals("MTD Products Inc & Affiliates",
                COMPANY_MAPPING_128.get(UUID.fromString("000008f7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008f8-0000-1000-8000-00805f9b34fb")));
        assertEquals("instagrid GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000008f8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008f9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spacelabs Medical Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008f9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008fa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Troo Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000008fa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008fb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Darkglass Electronics Oy",
                COMPANY_MAPPING_128.get(UUID.fromString("000008fb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008fc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hill-Rom", COMPANY_MAPPING_128.get(UUID.fromString("000008fc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008fd-0000-1000-8000-00805f9b34fb")));
        assertEquals("BioIntelliSense, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000008fd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008fe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ketronixs Sdn Bhd",
                COMPANY_MAPPING_128.get(UUID.fromString("000008fe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000008ff-0000-1000-8000-00805f9b34fb")));
        assertEquals("Plastimold Products, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000008ff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000900-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Zizai Technology Co., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000900-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000901-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lucimed", COMPANY_MAPPING_128.get(UUID.fromString("00000901-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000902-0000-1000-8000-00805f9b34fb")));
        assertEquals("TSC Auto-ID Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000902-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000903-0000-1000-8000-00805f9b34fb")));
        assertEquals("DATAMARS, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000903-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000904-0000-1000-8000-00805f9b34fb")));
        assertEquals("SUNCORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("00000904-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000905-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yandex Services AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000905-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000906-0000-1000-8000-00805f9b34fb")));
        assertEquals("Scope Logistical Solutions",
                COMPANY_MAPPING_128.get(UUID.fromString("00000906-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000907-0000-1000-8000-00805f9b34fb")));
        assertEquals("User Hello, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000907-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000908-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pinpoint Innovations Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000908-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000909-0000-1000-8000-00805f9b34fb")));
        assertEquals("70mai Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000909-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000090a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zhuhai Hoksi Technology CO.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("0000090a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000090b-0000-1000-8000-00805f9b34fb")));
        assertEquals("EMBR labs, INC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000090b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000090c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Radiawave Technologies Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000090c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000090d-0000-1000-8000-00805f9b34fb")));
        assertEquals("IOT Invent GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000090d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000090e-0000-1000-8000-00805f9b34fb")));
        assertEquals("OPTIMUSIOT TECH LLP",
                COMPANY_MAPPING_128.get(UUID.fromString("0000090e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000090f-0000-1000-8000-00805f9b34fb")));
        assertEquals("VC Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000090f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000910-0000-1000-8000-00805f9b34fb")));
        assertEquals("ASR Microelectronics (Shanghai) Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000910-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000911-0000-1000-8000-00805f9b34fb")));
        assertEquals("Douglas Lighting Controls Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000911-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000912-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nerbio Medical Software Platforms Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000912-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000913-0000-1000-8000-00805f9b34fb")));
        assertEquals("Braveheart Wireless, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000913-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000914-0000-1000-8000-00805f9b34fb")));
        assertEquals("INEO-SENSE", COMPANY_MAPPING_128.get(UUID.fromString("00000914-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000915-0000-1000-8000-00805f9b34fb")));
        assertEquals("Honda Motor Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000915-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000916-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ambient Sensors LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000916-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000917-0000-1000-8000-00805f9b34fb")));
        assertEquals("ASR Microelectronics(ShenZhen)Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000917-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000918-0000-1000-8000-00805f9b34fb")));
        assertEquals("Technosphere Labs Pvt. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000918-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000919-0000-1000-8000-00805f9b34fb")));
        assertEquals("NO SMD LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000919-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000091a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Albertronic BV",
                COMPANY_MAPPING_128.get(UUID.fromString("0000091a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000091b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Luminostics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000091b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000091c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Oblamatik AG", COMPANY_MAPPING_128.get(UUID.fromString("0000091c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000091d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innokind, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000091d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000091e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Melbot Studios, Sociedad Limitada",
                COMPANY_MAPPING_128.get(UUID.fromString("0000091e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000091f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Myzee Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("0000091f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000920-0000-1000-8000-00805f9b34fb")));
        assertEquals("Omnisense Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000920-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000921-0000-1000-8000-00805f9b34fb")));
        assertEquals("KAHA PTE. LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000921-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000922-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai MXCHIP Information Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000922-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000923-0000-1000-8000-00805f9b34fb")));
        assertEquals("JSB TECH PTE LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000923-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000924-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fundacion Tecnalia Research and Innovation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000924-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000925-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yukai Engineering Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000925-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000926-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gooligum Technologies Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000926-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000927-0000-1000-8000-00805f9b34fb")));
        assertEquals("ROOQ GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000927-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000928-0000-1000-8000-00805f9b34fb")));
        assertEquals("AiRISTA", COMPANY_MAPPING_128.get(UUID.fromString("00000928-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000929-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qingdao Haier Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000929-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000092a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sappl Verwaltungs- und Betriebs GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000092a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000092b-0000-1000-8000-00805f9b34fb")));
        assertEquals("TekHome", COMPANY_MAPPING_128.get(UUID.fromString("0000092b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000092c-0000-1000-8000-00805f9b34fb")));
        assertEquals("PCI Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000092c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000092d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Leggett & Platt, Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("0000092d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000092e-0000-1000-8000-00805f9b34fb")));
        assertEquals("PS GmbH", COMPANY_MAPPING_128.get(UUID.fromString("0000092e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000092f-0000-1000-8000-00805f9b34fb")));
        assertEquals("C.O.B.O. SpA", COMPANY_MAPPING_128.get(UUID.fromString("0000092f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000930-0000-1000-8000-00805f9b34fb")));
        assertEquals("James Walker RotaBolt Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000930-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000931-0000-1000-8000-00805f9b34fb")));
        assertEquals("BREATHINGS Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000931-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000932-0000-1000-8000-00805f9b34fb")));
        assertEquals("BarVision, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000932-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000933-0000-1000-8000-00805f9b34fb")));
        assertEquals("SRAM", COMPANY_MAPPING_128.get(UUID.fromString("00000933-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000934-0000-1000-8000-00805f9b34fb")));
        assertEquals("KiteSpring Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000934-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000935-0000-1000-8000-00805f9b34fb")));
        assertEquals("Reconnect, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000935-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000936-0000-1000-8000-00805f9b34fb")));
        assertEquals("Elekon AG", COMPANY_MAPPING_128.get(UUID.fromString("00000936-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000937-0000-1000-8000-00805f9b34fb")));
        assertEquals("RealThingks GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000937-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000938-0000-1000-8000-00805f9b34fb")));
        assertEquals("Henway Technologies, LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000938-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000939-0000-1000-8000-00805f9b34fb")));
        assertEquals("ASTEM Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000939-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000093a-0000-1000-8000-00805f9b34fb")));
        assertEquals("LinkedSemi Microelectronics (Xiamen) Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("0000093a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000093b-0000-1000-8000-00805f9b34fb")));
        assertEquals("ENSESO LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000093b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000093c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xenoma Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000093c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000093d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Adolf Wuerth GmbH & Co KG",
                COMPANY_MAPPING_128.get(UUID.fromString("0000093d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000093e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Catalyft Labs, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000093e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000093f-0000-1000-8000-00805f9b34fb")));
        assertEquals("JEPICO Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000093f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000940-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hero Workout GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000940-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000941-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rivian Automotive, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000941-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000942-0000-1000-8000-00805f9b34fb")));
        assertEquals("TRANSSION HOLDINGS LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000942-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000943-0000-1000-8000-00805f9b34fb")));
        assertEquals("Reserved", COMPANY_MAPPING_128.get(UUID.fromString("00000943-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000944-0000-1000-8000-00805f9b34fb")));
        assertEquals("Agitron d.o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000944-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000945-0000-1000-8000-00805f9b34fb")));
        assertEquals("Globe (Jiangsu) Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000945-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000946-0000-1000-8000-00805f9b34fb")));
        assertEquals("AMC International Alfa Metalcraft Corporation AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000946-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000947-0000-1000-8000-00805f9b34fb")));
        assertEquals("First Light Technologies Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000947-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000948-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wearable Link Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000948-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000949-0000-1000-8000-00805f9b34fb")));
        assertEquals("Metronom Health Europe",
                COMPANY_MAPPING_128.get(UUID.fromString("00000949-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000094a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zwift, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000094a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000094b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kindeva Drug Delivery L.P.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000094b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000094c-0000-1000-8000-00805f9b34fb")));
        assertEquals("GimmiSys GmbH", COMPANY_MAPPING_128.get(UUID.fromString("0000094c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000094d-0000-1000-8000-00805f9b34fb")));
        assertEquals("tkLABS INC.", COMPANY_MAPPING_128.get(UUID.fromString("0000094d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000094e-0000-1000-8000-00805f9b34fb")));
        assertEquals("PassiveBolt, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000094e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000094f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Limited Liability Company \"Mikrotikls\"",
                COMPANY_MAPPING_128.get(UUID.fromString("0000094f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000950-0000-1000-8000-00805f9b34fb")));
        assertEquals("Capetech", COMPANY_MAPPING_128.get(UUID.fromString("00000950-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000951-0000-1000-8000-00805f9b34fb")));
        assertEquals("PPRS", COMPANY_MAPPING_128.get(UUID.fromString("00000951-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000952-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apptricity Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000952-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000953-0000-1000-8000-00805f9b34fb")));
        assertEquals("LogiLube, LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000953-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000954-0000-1000-8000-00805f9b34fb")));
        assertEquals("Julbo", COMPANY_MAPPING_128.get(UUID.fromString("00000954-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000955-0000-1000-8000-00805f9b34fb")));
        assertEquals("Breville Group",
                COMPANY_MAPPING_128.get(UUID.fromString("00000955-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000956-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kerlink", COMPANY_MAPPING_128.get(UUID.fromString("00000956-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000957-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ohsung Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("00000957-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000958-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZTE Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000958-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000959-0000-1000-8000-00805f9b34fb")));
        assertEquals("HerdDogg, Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000959-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000095a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Selekt Bilgisayar, lletisim Urunleri lnsaat Sanayi ve Ticaret Limited Sirketi",
                COMPANY_MAPPING_128.get(UUID.fromString("0000095a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000095b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lismore Instruments Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000095b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000095c-0000-1000-8000-00805f9b34fb")));
        assertEquals("LogiLube, LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000095c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000095d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Electronic Theatre Controls",
                COMPANY_MAPPING_128.get(UUID.fromString("0000095d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000095e-0000-1000-8000-00805f9b34fb")));
        assertEquals("BioEchoNet inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000095e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000095f-0000-1000-8000-00805f9b34fb")));
        assertEquals("NUANCE HEARING LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("0000095f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000960-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sena Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000960-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000961-0000-1000-8000-00805f9b34fb")));
        assertEquals("Linkura AB", COMPANY_MAPPING_128.get(UUID.fromString("00000961-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000962-0000-1000-8000-00805f9b34fb")));
        assertEquals("GL Solutions K.K.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000962-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000963-0000-1000-8000-00805f9b34fb")));
        assertEquals("Moonbird BV", COMPANY_MAPPING_128.get(UUID.fromString("00000963-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000964-0000-1000-8000-00805f9b34fb")));
        assertEquals("Countrymate Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000964-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000965-0000-1000-8000-00805f9b34fb")));
        assertEquals("Asahi Kasei Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000965-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000966-0000-1000-8000-00805f9b34fb")));
        assertEquals("PointGuard, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000966-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000967-0000-1000-8000-00805f9b34fb")));
        assertEquals("Neo Materials and Consulting Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000967-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000968-0000-1000-8000-00805f9b34fb")));
        assertEquals("Actev Motors, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000968-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000969-0000-1000-8000-00805f9b34fb")));
        assertEquals("Woan Technology (Shenzhen) Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000969-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000096a-0000-1000-8000-00805f9b34fb")));
        assertEquals("dricos, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000096a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000096b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Guide ID B.V.", COMPANY_MAPPING_128.get(UUID.fromString("0000096b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000096c-0000-1000-8000-00805f9b34fb")));
        assertEquals("9374-7319 Quebec inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000096c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000096d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gunwerks, LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000096d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000096e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Band Industries, inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000096e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000096f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lund Motion Products, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000096f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000970-0000-1000-8000-00805f9b34fb")));
        assertEquals("IBA Dosimetry GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000970-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000971-0000-1000-8000-00805f9b34fb")));
        assertEquals("GA", COMPANY_MAPPING_128.get(UUID.fromString("00000971-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000972-0000-1000-8000-00805f9b34fb")));
        assertEquals("Closed Joint Stock Company \"Zavod Flometr\" (\"Zavod Flometr\" CJSC)",
                COMPANY_MAPPING_128.get(UUID.fromString("00000972-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000973-0000-1000-8000-00805f9b34fb")));
        assertEquals("Popit Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000973-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000974-0000-1000-8000-00805f9b34fb")));
        assertEquals("ABEYE", COMPANY_MAPPING_128.get(UUID.fromString("00000974-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000975-0000-1000-8000-00805f9b34fb")));
        assertEquals("BlueIOT(Beijing) Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000975-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000976-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fauna Audio GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000976-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000977-0000-1000-8000-00805f9b34fb")));
        assertEquals("TOYOTA motor corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000977-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000978-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZifferEins GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000978-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000979-0000-1000-8000-00805f9b34fb")));
        assertEquals("BIOTRONIK SE & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000979-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000097a-0000-1000-8000-00805f9b34fb")));
        assertEquals("CORE CORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("0000097a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000097b-0000-1000-8000-00805f9b34fb")));
        assertEquals("CTEK Sweden AB",
                COMPANY_MAPPING_128.get(UUID.fromString("0000097b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000097c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Thorley Industries, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000097c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000097d-0000-1000-8000-00805f9b34fb")));
        assertEquals("CLB B.V.", COMPANY_MAPPING_128.get(UUID.fromString("0000097d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000097e-0000-1000-8000-00805f9b34fb")));
        assertEquals("SonicSensory Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("0000097e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000097f-0000-1000-8000-00805f9b34fb")));
        assertEquals("ISEMAR S.R.L.", COMPANY_MAPPING_128.get(UUID.fromString("0000097f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000980-0000-1000-8000-00805f9b34fb")));
        assertEquals("DEKRA TESTING AND CERTIFICATION, S.A.U.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000980-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000981-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bernard Krone Holding SE & Co.KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000981-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000982-0000-1000-8000-00805f9b34fb")));
        assertEquals("ELPRO-BUCHS AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000982-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000983-0000-1000-8000-00805f9b34fb")));
        assertEquals("Feedback Sports LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000983-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000984-0000-1000-8000-00805f9b34fb")));
        assertEquals("TeraTron GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000984-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000985-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lumos Health Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000985-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000986-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cello Hill, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000986-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000987-0000-1000-8000-00805f9b34fb")));
        assertEquals("TSE BRAKES, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000987-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000988-0000-1000-8000-00805f9b34fb")));
        assertEquals("BHM-Tech Produktionsgesellschaft m.b.H",
                COMPANY_MAPPING_128.get(UUID.fromString("00000988-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000989-0000-1000-8000-00805f9b34fb")));
        assertEquals("WIKA Alexander Wiegand SE & Co.KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000989-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000098a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Biovigil", COMPANY_MAPPING_128.get(UUID.fromString("0000098a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000098b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mequonic Engineering, S.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000098b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000098c-0000-1000-8000-00805f9b34fb")));
        assertEquals("bGrid B.V.", COMPANY_MAPPING_128.get(UUID.fromString("0000098c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000098d-0000-1000-8000-00805f9b34fb")));
        assertEquals("C3-WIRELESS, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("0000098d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000098e-0000-1000-8000-00805f9b34fb")));
        assertEquals("ADVEEZ", COMPANY_MAPPING_128.get(UUID.fromString("0000098e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000098f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aktiebolaget Regin",
                COMPANY_MAPPING_128.get(UUID.fromString("0000098f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000990-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anton Paar GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000990-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000991-0000-1000-8000-00805f9b34fb")));
        assertEquals("Telenor ASA", COMPANY_MAPPING_128.get(UUID.fromString("00000991-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000992-0000-1000-8000-00805f9b34fb")));
        assertEquals("Big Kaiser Precision Tooling Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000992-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000993-0000-1000-8000-00805f9b34fb")));
        assertEquals("Absolute Audio Labs B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000993-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000994-0000-1000-8000-00805f9b34fb")));
        assertEquals("VT42 Pty Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000994-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000995-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bronkhorst High-Tech B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000995-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000996-0000-1000-8000-00805f9b34fb")));
        assertEquals("C. & E. Fein GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000996-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000997-0000-1000-8000-00805f9b34fb")));
        assertEquals("NextMind", COMPANY_MAPPING_128.get(UUID.fromString("00000997-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000998-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pixie Dust Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000998-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000999-0000-1000-8000-00805f9b34fb")));
        assertEquals("eTactica ehf", COMPANY_MAPPING_128.get(UUID.fromString("00000999-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000099a-0000-1000-8000-00805f9b34fb")));
        assertEquals("New Audio LLC", COMPANY_MAPPING_128.get(UUID.fromString("0000099a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000099b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sendum Wireless Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("0000099b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000099c-0000-1000-8000-00805f9b34fb")));
        assertEquals("deister electronic GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("0000099c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000099d-0000-1000-8000-00805f9b34fb")));
        assertEquals("YKK AP Inc.", COMPANY_MAPPING_128.get(UUID.fromString("0000099d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000099e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Step One Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("0000099e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("0000099f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Koya Medical, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("0000099f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009a0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Proof Diagnostics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009a0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009a1-0000-1000-8000-00805f9b34fb")));
        assertEquals("VOS Systems, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000009a1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009a2-0000-1000-8000-00805f9b34fb")));
        assertEquals("ENGAGENOW DATA SCIENCES PRIVATE LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("000009a2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009a3-0000-1000-8000-00805f9b34fb")));
        assertEquals("ARDUINO SA", COMPANY_MAPPING_128.get(UUID.fromString("000009a3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009a4-0000-1000-8000-00805f9b34fb")));
        assertEquals("KUMHO ELECTRICS, INC",
                COMPANY_MAPPING_128.get(UUID.fromString("000009a4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009a5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Security Enhancement Systems, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000009a5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009a6-0000-1000-8000-00805f9b34fb")));
        assertEquals("BEIJING ELECTRIC VEHICLE CO.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000009a6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009a7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Paybuddy ApS", COMPANY_MAPPING_128.get(UUID.fromString("000009a7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009a8-0000-1000-8000-00805f9b34fb")));
        assertEquals("KHN Solutions LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000009a8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009a9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nippon Ceramic Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009a9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009aa-0000-1000-8000-00805f9b34fb")));
        assertEquals("PHOTODYNAMIC INCORPORATED",
                COMPANY_MAPPING_128.get(UUID.fromString("000009aa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ab-0000-1000-8000-00805f9b34fb")));
        assertEquals("DashLogic, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009ab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ac-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ambiq", COMPANY_MAPPING_128.get(UUID.fromString("000009ac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ad-0000-1000-8000-00805f9b34fb")));
        assertEquals("Narhwall Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000009ad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ae-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pozyx NV", COMPANY_MAPPING_128.get(UUID.fromString("000009ae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009af-0000-1000-8000-00805f9b34fb")));
        assertEquals("ifLink Open Community",
                COMPANY_MAPPING_128.get(UUID.fromString("000009af-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009b0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Deublin Company, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000009b0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009b1-0000-1000-8000-00805f9b34fb")));
        assertEquals("BLINQY", COMPANY_MAPPING_128.get(UUID.fromString("000009b1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009b2-0000-1000-8000-00805f9b34fb")));
        assertEquals("DYPHI", COMPANY_MAPPING_128.get(UUID.fromString("000009b2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009b3-0000-1000-8000-00805f9b34fb")));
        assertEquals("BlueX Microelectronics Corp Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009b3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009b4-0000-1000-8000-00805f9b34fb")));
        assertEquals("PentaLock Aps.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009b4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009b5-0000-1000-8000-00805f9b34fb")));
        assertEquals("AUTEC Gesellschaft fuer Automationstechnik mbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000009b5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009b6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pegasus Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009b6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009b7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bout Labs, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000009b7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009b8-0000-1000-8000-00805f9b34fb")));
        assertEquals("PlayerData Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("000009b8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009b9-0000-1000-8000-00805f9b34fb")));
        assertEquals("SAVOY ELECTRONIC LIGHTING",
                COMPANY_MAPPING_128.get(UUID.fromString("000009b9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Elimo Engineering Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000009ba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009bb-0000-1000-8000-00805f9b34fb")));
        assertEquals("SkyStream Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000009bb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009bc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aerosens LLC", COMPANY_MAPPING_128.get(UUID.fromString("000009bc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009bd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Centre Suisse d'Electronique et de Microtechnique SA",
                COMPANY_MAPPING_128.get(UUID.fromString("000009bd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009be-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vessel Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("000009be-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009bf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Span.IO, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000009bf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009c0-0000-1000-8000-00805f9b34fb")));
        assertEquals("AnotherBrain inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009c0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009c1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rosewill", COMPANY_MAPPING_128.get(UUID.fromString("000009c1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009c2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Universal Audio, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009c2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009c3-0000-1000-8000-00805f9b34fb")));
        assertEquals("JAPAN TOBACCO INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009c3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009c4-0000-1000-8000-00805f9b34fb")));
        assertEquals("UVISIO", COMPANY_MAPPING_128.get(UUID.fromString("000009c4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009c5-0000-1000-8000-00805f9b34fb")));
        assertEquals("HungYi Microelectronics Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009c5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009c6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Honor Device Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009c6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009c7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Combustion, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000009c7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009c8-0000-1000-8000-00805f9b34fb")));
        assertEquals("XUNTONG", COMPANY_MAPPING_128.get(UUID.fromString("000009c8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009c9-0000-1000-8000-00805f9b34fb")));
        assertEquals("CrowdGlow Ltd", COMPANY_MAPPING_128.get(UUID.fromString("000009c9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mobitrace", COMPANY_MAPPING_128.get(UUID.fromString("000009ca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009cb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hx Engineering, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000009cb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009cc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Senso4s d.o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009cc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009cd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blyott", COMPANY_MAPPING_128.get(UUID.fromString("000009cd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ce-0000-1000-8000-00805f9b34fb")));
        assertEquals("Julius Blum GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000009ce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009cf-0000-1000-8000-00805f9b34fb")));
        assertEquals("BlueStreak IoT, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000009cf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009d0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chess Wise B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009d0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009d1-0000-1000-8000-00805f9b34fb")));
        assertEquals("ABLEPAY TECHNOLOGIES AS",
                COMPANY_MAPPING_128.get(UUID.fromString("000009d1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009d2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Temperature Sensitive Solutions Systems Sweden AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000009d2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009d3-0000-1000-8000-00805f9b34fb")));
        assertEquals("HeartHero, inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009d3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009d4-0000-1000-8000-00805f9b34fb")));
        assertEquals("ORBIS Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000009d4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009d5-0000-1000-8000-00805f9b34fb")));
        assertEquals("GEAR RADIO ELECTRONICS CORP.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009d5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009d6-0000-1000-8000-00805f9b34fb")));
        assertEquals("EAR TEKNIK ISITME VE ODIOMETRI CIHAZLARI SANAYI VE TICARET ANONIM SIRKETI",
                COMPANY_MAPPING_128.get(UUID.fromString("000009d6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009d7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Coyotta", COMPANY_MAPPING_128.get(UUID.fromString("000009d7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009d8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Synergy Tecnologia em Sistemas Ltda",
                COMPANY_MAPPING_128.get(UUID.fromString("000009d8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009d9-0000-1000-8000-00805f9b34fb")));
        assertEquals("VivoSensMedical GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000009d9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009da-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nagravision SA",
                COMPANY_MAPPING_128.get(UUID.fromString("000009da-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009db-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bionic Avionics Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009db-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009dc-0000-1000-8000-00805f9b34fb")));
        assertEquals("AON2 Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("000009dc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009dd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innoware Development AB",
                COMPANY_MAPPING_128.get(UUID.fromString("000009dd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009de-0000-1000-8000-00805f9b34fb")));
        assertEquals("JLD Technology Solutions, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("000009de-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009df-0000-1000-8000-00805f9b34fb")));
        assertEquals("Magnus Technology Sdn Bhd",
                COMPANY_MAPPING_128.get(UUID.fromString("000009df-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009e0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Preddio Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009e0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009e1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tag-N-Trac Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("000009e1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009e2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wuhan Linptech Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009e2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009e3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Friday Home Aps",
                COMPANY_MAPPING_128.get(UUID.fromString("000009e3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009e4-0000-1000-8000-00805f9b34fb")));
        assertEquals("CPS AS", COMPANY_MAPPING_128.get(UUID.fromString("000009e4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009e5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mobilogix", COMPANY_MAPPING_128.get(UUID.fromString("000009e5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009e6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Masonite Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000009e6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009e7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kabushikigaisha HANERON",
                COMPANY_MAPPING_128.get(UUID.fromString("000009e7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009e8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Melange Systems Pvt. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009e8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009e9-0000-1000-8000-00805f9b34fb")));
        assertEquals("LumenRadio AB", COMPANY_MAPPING_128.get(UUID.fromString("000009e9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ea-0000-1000-8000-00805f9b34fb")));
        assertEquals("Athlos Oy", COMPANY_MAPPING_128.get(UUID.fromString("000009ea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009eb-0000-1000-8000-00805f9b34fb")));
        assertEquals("KEAN ELECTRONICS PTY LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000009eb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yukon advanced optics worldwide, UAB",
                COMPANY_MAPPING_128.get(UUID.fromString("000009ec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ed-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sibel Inc.", COMPANY_MAPPING_128.get(UUID.fromString("000009ed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ee-0000-1000-8000-00805f9b34fb")));
        assertEquals("OJMAR SA", COMPANY_MAPPING_128.get(UUID.fromString("000009ee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ef-0000-1000-8000-00805f9b34fb")));
        assertEquals("Steinel Solutions AG",
                COMPANY_MAPPING_128.get(UUID.fromString("000009ef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009f0-0000-1000-8000-00805f9b34fb")));
        assertEquals("WatchGas B.V.", COMPANY_MAPPING_128.get(UUID.fromString("000009f0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009f1-0000-1000-8000-00805f9b34fb")));
        assertEquals("OM Digital Solutions Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000009f1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009f2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Audeara Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000009f2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009f3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Zero Zero Infinity Technology Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009f3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009f4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spectrum Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009f4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009f5-0000-1000-8000-00805f9b34fb")));
        assertEquals("OKI Electric Industry Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("000009f5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009f6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mobile Action Technology Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009f6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009f7-0000-1000-8000-00805f9b34fb")));
        assertEquals("SENSATEC Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009f7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009f8-0000-1000-8000-00805f9b34fb")));
        assertEquals("R.O. S.R.L.", COMPANY_MAPPING_128.get(UUID.fromString("000009f8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009f9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hangzhou Yaguan Technology Co. LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("000009f9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009fa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Listen Technologies Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("000009fa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009fb-0000-1000-8000-00805f9b34fb")));
        assertEquals("TOITU CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009fb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009fc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Confidex", COMPANY_MAPPING_128.get(UUID.fromString("000009fc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009fd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Keep Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("000009fd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009fe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lichtvision Engineering GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("000009fe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("000009ff-0000-1000-8000-00805f9b34fb")));
        assertEquals("AIRSTAR", COMPANY_MAPPING_128.get(UUID.fromString("000009ff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a00-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ampler Bikes OU",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a00-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a01-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cleveron AS", COMPANY_MAPPING_128.get(UUID.fromString("00000a01-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a02-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ayxon-Dynamics GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a02-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a03-0000-1000-8000-00805f9b34fb")));
        assertEquals("donutrobotics Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a03-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a04-0000-1000-8000-00805f9b34fb")));
        assertEquals("Flosonics Medical",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a04-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a05-0000-1000-8000-00805f9b34fb")));
        assertEquals("Southwire Company, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a05-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a06-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai wuqi microelectronics Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a06-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a07-0000-1000-8000-00805f9b34fb")));
        assertEquals("Reflow Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a07-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a08-0000-1000-8000-00805f9b34fb")));
        assertEquals("Oras Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000a08-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a09-0000-1000-8000-00805f9b34fb")));
        assertEquals("ECCT", COMPANY_MAPPING_128.get(UUID.fromString("00000a09-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a0a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Volan Technology Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a0a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a0b-0000-1000-8000-00805f9b34fb")));
        assertEquals("SIANA Systems", COMPANY_MAPPING_128.get(UUID.fromString("00000a0b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a0c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Yidian Intelligent Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a0c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a0d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Blue Peacock GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a0d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a0e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Roland Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a0e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a0f-0000-1000-8000-00805f9b34fb")));
        assertEquals("LIXIL Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a0f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a10-0000-1000-8000-00805f9b34fb")));
        assertEquals("SUBARU Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a10-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a11-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensolus", COMPANY_MAPPING_128.get(UUID.fromString("00000a11-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a12-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dyson Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a12-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a13-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tec4med LifeScience GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a13-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a14-0000-1000-8000-00805f9b34fb")));
        assertEquals("CROXEL, INC.", COMPANY_MAPPING_128.get(UUID.fromString("00000a14-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a15-0000-1000-8000-00805f9b34fb")));
        assertEquals("Syng Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000a15-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a16-0000-1000-8000-00805f9b34fb")));
        assertEquals("RIDE VISION LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a16-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a17-0000-1000-8000-00805f9b34fb")));
        assertEquals("Plume Design Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a17-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a18-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cambridge Animal Technologies Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a18-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a19-0000-1000-8000-00805f9b34fb")));
        assertEquals("Maxell, Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("00000a19-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a1a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Link Labs, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a1a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a1b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Embrava Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a1b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a1c-0000-1000-8000-00805f9b34fb")));
        assertEquals("INPEAK S.C.", COMPANY_MAPPING_128.get(UUID.fromString("00000a1c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a1d-0000-1000-8000-00805f9b34fb")));
        assertEquals("API-K", COMPANY_MAPPING_128.get(UUID.fromString("00000a1d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a1e-0000-1000-8000-00805f9b34fb")));
        assertEquals("CombiQ AB", COMPANY_MAPPING_128.get(UUID.fromString("00000a1e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a1f-0000-1000-8000-00805f9b34fb")));
        assertEquals("DeVilbiss Healthcare LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a1f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a20-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jiangxi Innotech Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a20-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a21-0000-1000-8000-00805f9b34fb")));
        assertEquals("Apollogic Sp. z o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a21-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a22-0000-1000-8000-00805f9b34fb")));
        assertEquals("DAIICHIKOSHO CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a22-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a23-0000-1000-8000-00805f9b34fb")));
        assertEquals("BIXOLON CO.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a23-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a24-0000-1000-8000-00805f9b34fb")));
        assertEquals("Atmosic Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a24-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a25-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eran Financial Services LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a25-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a26-0000-1000-8000-00805f9b34fb")));
        assertEquals("Louis Vuitton", COMPANY_MAPPING_128.get(UUID.fromString("00000a26-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a27-0000-1000-8000-00805f9b34fb")));
        assertEquals("AYU DEVICES PRIVATE LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a27-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a28-0000-1000-8000-00805f9b34fb")));
        assertEquals("NanoFlex Power Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a28-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a29-0000-1000-8000-00805f9b34fb")));
        assertEquals("Worthcloud Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a29-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a2a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yamaha Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a2a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a2b-0000-1000-8000-00805f9b34fb")));
        assertEquals("PaceBait IVS", COMPANY_MAPPING_128.get(UUID.fromString("00000a2b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a2c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen H&T Intelligent Control Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a2c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a2d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Feasycom Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a2d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a2e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zuma Array Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a2e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a2f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Instamic, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a2f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a30-0000-1000-8000-00805f9b34fb")));
        assertEquals("Air-Weigh", COMPANY_MAPPING_128.get(UUID.fromString("00000a30-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a31-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nevro Corp.", COMPANY_MAPPING_128.get(UUID.fromString("00000a31-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a32-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pinnacle Technology, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a32-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a33-0000-1000-8000-00805f9b34fb")));
        assertEquals("WMF AG", COMPANY_MAPPING_128.get(UUID.fromString("00000a33-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a34-0000-1000-8000-00805f9b34fb")));
        assertEquals("Luxer Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a34-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a35-0000-1000-8000-00805f9b34fb")));
        assertEquals("safectory GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a35-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a36-0000-1000-8000-00805f9b34fb")));
        assertEquals("NGK SPARK PLUG CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a36-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a37-0000-1000-8000-00805f9b34fb")));
        assertEquals("2587702 Ontario Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a37-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a38-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bouffalo Lab (Nanjing)., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a38-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a39-0000-1000-8000-00805f9b34fb")));
        assertEquals("BLUETICKETING SRL",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a39-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a3a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Incotex Co. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a3a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a3b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Galileo Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a3b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a3c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Siteco GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000a3c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a3d-0000-1000-8000-00805f9b34fb")));
        assertEquals("DELABIE", COMPANY_MAPPING_128.get(UUID.fromString("00000a3d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a3e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hefei Yunlian Semiconductor Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a3e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a3f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Yopeak Optoelectronics Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a3f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a40-0000-1000-8000-00805f9b34fb")));
        assertEquals("GEWISS S.p.A.", COMPANY_MAPPING_128.get(UUID.fromString("00000a40-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a41-0000-1000-8000-00805f9b34fb")));
        assertEquals("OPEX Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a41-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a42-0000-1000-8000-00805f9b34fb")));
        assertEquals("Motionalysis, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a42-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a43-0000-1000-8000-00805f9b34fb")));
        assertEquals("Busch Systems International Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a43-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a44-0000-1000-8000-00805f9b34fb")));
        assertEquals("Novidan, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000a44-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a45-0000-1000-8000-00805f9b34fb")));
        assertEquals("3SI Security Systems, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a45-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a46-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing HC-Infinite Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a46-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a47-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Wand Company Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a47-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a48-0000-1000-8000-00805f9b34fb")));
        assertEquals("JRC Mobility Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a48-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a49-0000-1000-8000-00805f9b34fb")));
        assertEquals("Venture Research Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a49-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a4a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Map Large, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a4a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a4b-0000-1000-8000-00805f9b34fb")));
        assertEquals("MistyWest Energy and Transport Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a4b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a4c-0000-1000-8000-00805f9b34fb")));
        assertEquals("SiFli Technologies (shanghai) Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a4c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a4d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lockn Technologies Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a4d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a4e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Toytec Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a4e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a4f-0000-1000-8000-00805f9b34fb")));
        assertEquals("VANMOOF Global Holding B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a4f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a50-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nextscape Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a50-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a51-0000-1000-8000-00805f9b34fb")));
        assertEquals("CSIRO", COMPANY_MAPPING_128.get(UUID.fromString("00000a51-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a52-0000-1000-8000-00805f9b34fb")));
        assertEquals("Follow Sense Europe B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a52-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a53-0000-1000-8000-00805f9b34fb")));
        assertEquals("KKM COMPANY LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a53-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a54-0000-1000-8000-00805f9b34fb")));
        assertEquals("SQL Technologies Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a54-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a55-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inugo Systems Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a55-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a56-0000-1000-8000-00805f9b34fb")));
        assertEquals("ambie", COMPANY_MAPPING_128.get(UUID.fromString("00000a56-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a57-0000-1000-8000-00805f9b34fb")));
        assertEquals("Meizhou Guo Wei Electronics Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a57-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a58-0000-1000-8000-00805f9b34fb")));
        assertEquals("Indigo Diabetes",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a58-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a59-0000-1000-8000-00805f9b34fb")));
        assertEquals("TourBuilt, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a59-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a5a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sontheim Industrie Elektronik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a5a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a5b-0000-1000-8000-00805f9b34fb")));
        assertEquals("LEGIC Identsystems AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a5b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a5c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innovative Design Labs Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a5c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a5d-0000-1000-8000-00805f9b34fb")));
        assertEquals("MG Energy Systems B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a5d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a5e-0000-1000-8000-00805f9b34fb")));
        assertEquals("LaceClips llc", COMPANY_MAPPING_128.get(UUID.fromString("00000a5e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a5f-0000-1000-8000-00805f9b34fb")));
        assertEquals("stryker", COMPANY_MAPPING_128.get(UUID.fromString("00000a5f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a60-0000-1000-8000-00805f9b34fb")));
        assertEquals("DATANG SEMICONDUCTOR TECHNOLOGY CO.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a60-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a61-0000-1000-8000-00805f9b34fb")));
        assertEquals("Smart Parks B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a61-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a62-0000-1000-8000-00805f9b34fb")));
        assertEquals("MOKO TECHNOLOGY Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a62-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a63-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gremsy JSC", COMPANY_MAPPING_128.get(UUID.fromString("00000a63-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a64-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geopal system A/S",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a64-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a65-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lytx, INC.", COMPANY_MAPPING_128.get(UUID.fromString("00000a65-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a66-0000-1000-8000-00805f9b34fb")));
        assertEquals("JUSTMORPH PTE. LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a66-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a67-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing SuperHexa Century Technology CO. Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a67-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a68-0000-1000-8000-00805f9b34fb")));
        assertEquals("Focus Ingenieria SRL",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a68-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a69-0000-1000-8000-00805f9b34fb")));
        assertEquals("HAPPIEST BABY, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a69-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a6a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Scribble Design Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a6a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a6b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Olympic Ophthalmics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a6b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a6c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pokkels", COMPANY_MAPPING_128.get(UUID.fromString("00000a6c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a6d-0000-1000-8000-00805f9b34fb")));
        assertEquals("KUUKANJYOKIN Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a6d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a6e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pac Sane Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a6e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a6f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Warner Bros.", COMPANY_MAPPING_128.get(UUID.fromString("00000a6f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a70-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ooma", COMPANY_MAPPING_128.get(UUID.fromString("00000a70-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a71-0000-1000-8000-00805f9b34fb")));
        assertEquals("Senquip Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a71-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a72-0000-1000-8000-00805f9b34fb")));
        assertEquals("Jumo GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a72-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a73-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innohome Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000a73-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a74-0000-1000-8000-00805f9b34fb")));
        assertEquals("MICROSON S.A.", COMPANY_MAPPING_128.get(UUID.fromString("00000a74-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a75-0000-1000-8000-00805f9b34fb")));
        assertEquals("Delta Cycle Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a75-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a76-0000-1000-8000-00805f9b34fb")));
        assertEquals("Synaptics Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a76-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a77-0000-1000-8000-00805f9b34fb")));
        assertEquals("AXTRO PTE. LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a77-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a78-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Sunricher Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a78-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a79-0000-1000-8000-00805f9b34fb")));
        assertEquals("Webasto SE", COMPANY_MAPPING_128.get(UUID.fromString("00000a79-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a7a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Emlid Limited", COMPANY_MAPPING_128.get(UUID.fromString("00000a7a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a7b-0000-1000-8000-00805f9b34fb")));
        assertEquals("UniqAir Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000a7b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a7c-0000-1000-8000-00805f9b34fb")));
        assertEquals("WAFERLOCK", COMPANY_MAPPING_128.get(UUID.fromString("00000a7c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a7d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Freedman Electronics Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a7d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a7e-0000-1000-8000-00805f9b34fb")));
        assertEquals("KEBA Handover Automation GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a7e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a7f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Intuity Medical",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a7f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a80-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cleer Limited", COMPANY_MAPPING_128.get(UUID.fromString("00000a80-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a81-0000-1000-8000-00805f9b34fb")));
        assertEquals("Universal Biosensors Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a81-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a82-0000-1000-8000-00805f9b34fb")));
        assertEquals("Corsair", COMPANY_MAPPING_128.get(UUID.fromString("00000a82-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a83-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rivata, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000a83-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a84-0000-1000-8000-00805f9b34fb")));
        assertEquals("Greennote Inc,",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a84-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a85-0000-1000-8000-00805f9b34fb")));
        assertEquals("Snowball Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a85-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a86-0000-1000-8000-00805f9b34fb")));
        assertEquals("ALIZENT International",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a86-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a87-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai Smart System Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a87-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a88-0000-1000-8000-00805f9b34fb")));
        assertEquals("PSA Peugeot Citroen",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a88-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a89-0000-1000-8000-00805f9b34fb")));
        assertEquals("SES-Imagotag", COMPANY_MAPPING_128.get(UUID.fromString("00000a89-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a8a-0000-1000-8000-00805f9b34fb")));
        assertEquals("HAINBUCH GMBH SPANNENDE TECHNIK",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a8a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a8b-0000-1000-8000-00805f9b34fb")));
        assertEquals("SANlight GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000a8b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a8c-0000-1000-8000-00805f9b34fb")));
        assertEquals("DelpSys, s.r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a8c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a8d-0000-1000-8000-00805f9b34fb")));
        assertEquals("JCM TECHNOLOGIES S.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a8d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a8e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Perfect Company",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a8e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a8f-0000-1000-8000-00805f9b34fb")));
        assertEquals("TOTO LTD.", COMPANY_MAPPING_128.get(UUID.fromString("00000a8f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a90-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Grandsun Electronic Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a90-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a91-0000-1000-8000-00805f9b34fb")));
        assertEquals("Monarch International Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a91-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a92-0000-1000-8000-00805f9b34fb")));
        assertEquals("Carestream Dental LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a92-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a93-0000-1000-8000-00805f9b34fb")));
        assertEquals("GiPStech S.r.l.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a93-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a94-0000-1000-8000-00805f9b34fb")));
        assertEquals("OOBIK Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000a94-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a95-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pamex Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000a95-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a96-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lightricity Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a96-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a97-0000-1000-8000-00805f9b34fb")));
        assertEquals("SensTek", COMPANY_MAPPING_128.get(UUID.fromString("00000a97-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a98-0000-1000-8000-00805f9b34fb")));
        assertEquals("Foil, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000a98-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a99-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai high-flying electronics technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a99-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a9a-0000-1000-8000-00805f9b34fb")));
        assertEquals("TEMKIN ASSOCIATES, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a9a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a9b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Eello LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000a9b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a9c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xi'an Fengyu Information Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a9c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a9d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Canon Finetech Nisca Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a9d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a9e-0000-1000-8000-00805f9b34fb")));
        assertEquals("LifePlus, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a9e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000a9f-0000-1000-8000-00805f9b34fb")));
        assertEquals("ista International GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000a9f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aa0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Loy Tec electronics GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aa0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aa1-0000-1000-8000-00805f9b34fb")));
        assertEquals("LINCOGN TECHNOLOGY CO. LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aa1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aa2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Care Bloom, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aa2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aa3-0000-1000-8000-00805f9b34fb")));
        assertEquals("DIC Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aa3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aa4-0000-1000-8000-00805f9b34fb")));
        assertEquals("FAZEPRO LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000aa4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aa5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Uascent Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aa5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aa6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Realityworks, inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aa6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aa7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Urbanista AB", COMPANY_MAPPING_128.get(UUID.fromString("00000aa7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aa8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zencontrol Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aa8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aa9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Spintly, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000aa9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aaa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Computime International Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aaa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Anhui Listenai Co",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aac-0000-1000-8000-00805f9b34fb")));
        assertEquals("OSM HK Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aad-0000-1000-8000-00805f9b34fb")));
        assertEquals("Adevo Consulting AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aae-0000-1000-8000-00805f9b34fb")));
        assertEquals("PS Engineering, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aaf-0000-1000-8000-00805f9b34fb")));
        assertEquals("AIAIAI ApS", COMPANY_MAPPING_128.get(UUID.fromString("00000aaf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ab0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Visiontronic s.r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ab0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ab1-0000-1000-8000-00805f9b34fb")));
        assertEquals("InVue Security Products Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ab1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ab2-0000-1000-8000-00805f9b34fb")));
        assertEquals("TouchTronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ab2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ab3-0000-1000-8000-00805f9b34fb")));
        assertEquals("INNER RANGE PTY. LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ab3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ab4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ellenby Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ab4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ab5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Elstat Electronics Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ab5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ab6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xenter, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000ab6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ab7-0000-1000-8000-00805f9b34fb")));
        assertEquals("LogTag North America Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ab7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ab8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sens.ai Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ab8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ab9-0000-1000-8000-00805f9b34fb")));
        assertEquals("STL", COMPANY_MAPPING_128.get(UUID.fromString("00000ab9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Open Bionics Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000abb-0000-1000-8000-00805f9b34fb")));
        assertEquals("R-DAS, s.r.o.", COMPANY_MAPPING_128.get(UUID.fromString("00000abb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000abc-0000-1000-8000-00805f9b34fb")));
        assertEquals("KCCS Mobile Engineering Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000abc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000abd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Inventas AS", COMPANY_MAPPING_128.get(UUID.fromString("00000abd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000abe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Robkoo Information & Technologies Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000abe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000abf-0000-1000-8000-00805f9b34fb")));
        assertEquals("PAUL HARTMANN AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000abf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ac0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Omni-ID USA, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ac0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ac1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Jingxun Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ac1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ac2-0000-1000-8000-00805f9b34fb")));
        assertEquals("RealMega Microelectronics technology (Shanghai) Co. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ac2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ac3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kenzen, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000ac3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ac4-0000-1000-8000-00805f9b34fb")));
        assertEquals("CODIUM", COMPANY_MAPPING_128.get(UUID.fromString("00000ac4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ac5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Flexoptix GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ac5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ac6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Barnes Group Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ac6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ac7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chengdu Aich Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ac7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ac8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Keepin Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ac8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ac9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Swedlock AB", COMPANY_MAPPING_128.get(UUID.fromString("00000ac9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen CoolKit Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000acb-0000-1000-8000-00805f9b34fb")));
        assertEquals("ise Individuelle Software und Elektronik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000acb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000acc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nuvoton", COMPANY_MAPPING_128.get(UUID.fromString("00000acc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000acd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Visuallex Sport International Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000acd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ace-0000-1000-8000-00805f9b34fb")));
        assertEquals("KOBATA GAUGE MFG. CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ace-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000acf-0000-1000-8000-00805f9b34fb")));
        assertEquals("CACI Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000acf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ad0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nordic Strong ApS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ad0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ad1-0000-1000-8000-00805f9b34fb")));
        assertEquals("EAGLE KINGDOM TECHNOLOGIES LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ad1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ad2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lautsprecher Teufel GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ad2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ad3-0000-1000-8000-00805f9b34fb")));
        assertEquals("SSV Software Systems GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ad3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ad4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zhuhai Pantum Electronisc Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ad4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ad5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Streamit B.V.", COMPANY_MAPPING_128.get(UUID.fromString("00000ad5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ad6-0000-1000-8000-00805f9b34fb")));
        assertEquals("nymea GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000ad6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ad7-0000-1000-8000-00805f9b34fb")));
        assertEquals("AL-KO Geraete GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ad7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ad8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Franz Kaldewei GmbH&Co KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ad8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ad9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Aimore. Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ad9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ada-0000-1000-8000-00805f9b34fb")));
        assertEquals("Codefabrik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ada-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000adb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Reelables, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000adb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000adc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Duravit AG", COMPANY_MAPPING_128.get(UUID.fromString("00000adc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000add-0000-1000-8000-00805f9b34fb")));
        assertEquals("Boss Audio", COMPANY_MAPPING_128.get(UUID.fromString("00000add-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ade-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vocera Communications, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ade-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000adf-0000-1000-8000-00805f9b34fb")));
        assertEquals("Douglas Dynamics L.L.C.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000adf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ae0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Viceroy Devices Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ae0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ae1-0000-1000-8000-00805f9b34fb")));
        assertEquals("ChengDu ForThink Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ae1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ae2-0000-1000-8000-00805f9b34fb")));
        assertEquals("IMATRIX SYSTEMS, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ae2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ae3-0000-1000-8000-00805f9b34fb")));
        assertEquals("GlobalMed", COMPANY_MAPPING_128.get(UUID.fromString("00000ae3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ae4-0000-1000-8000-00805f9b34fb")));
        assertEquals("DALI Alliance", COMPANY_MAPPING_128.get(UUID.fromString("00000ae4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ae5-0000-1000-8000-00805f9b34fb")));
        assertEquals("unu GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000ae5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ae6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hexology", COMPANY_MAPPING_128.get(UUID.fromString("00000ae6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ae7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sunplus Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ae7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ae8-0000-1000-8000-00805f9b34fb")));
        assertEquals("LEVEL, s.r.o.", COMPANY_MAPPING_128.get(UUID.fromString("00000ae8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ae9-0000-1000-8000-00805f9b34fb")));
        assertEquals("FLIR Systems AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ae9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aea-0000-1000-8000-00805f9b34fb")));
        assertEquals("Borda Technology",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aeb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Square, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000aeb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aec-0000-1000-8000-00805f9b34fb")));
        assertEquals("FUTEK ADVANCED SENSOR TECHNOLOGY, INC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aed-0000-1000-8000-00805f9b34fb")));
        assertEquals("Saxonar GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000aed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aee-0000-1000-8000-00805f9b34fb")));
        assertEquals("Velentium, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aef-0000-1000-8000-00805f9b34fb")));
        assertEquals("GLP German Light Products GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000af0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Leupold & Stevens, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000af0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000af1-0000-1000-8000-00805f9b34fb")));
        assertEquals("CRADERS,CO.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000af1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000af2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shanghai All Link Microelectronics Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000af2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000af3-0000-1000-8000-00805f9b34fb")));
        assertEquals("701x Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000af3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000af4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Radioworks Microelectronics PTY LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000af4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000af5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Unitech Electronic Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000af5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000af6-0000-1000-8000-00805f9b34fb")));
        assertEquals("AMETEK, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000af6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000af7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Irdeto", COMPANY_MAPPING_128.get(UUID.fromString("00000af7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000af8-0000-1000-8000-00805f9b34fb")));
        assertEquals("First Design System Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000af8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000af9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Unisto AG", COMPANY_MAPPING_128.get(UUID.fromString("00000af9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000afa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Chengdu Ambit Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000afa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000afb-0000-1000-8000-00805f9b34fb")));
        assertEquals("SMT ELEKTRONIK GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000afb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000afc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cerebrum Sensor Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000afc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000afd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Weber Sensors, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000afd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000afe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Earda Technologies Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000afe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000aff-0000-1000-8000-00805f9b34fb")));
        assertEquals("FUSEAWARE LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000aff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b00-0000-1000-8000-00805f9b34fb")));
        assertEquals("Flaircomm Microelectronics Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b00-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b01-0000-1000-8000-00805f9b34fb")));
        assertEquals("RESIDEO TECHNOLOGIES, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b01-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b02-0000-1000-8000-00805f9b34fb")));
        assertEquals("IORA Technology Development Ltd. Sti.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b02-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b03-0000-1000-8000-00805f9b34fb")));
        assertEquals("Precision Triathlon Systems Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b03-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b04-0000-1000-8000-00805f9b34fb")));
        assertEquals("I-PERCUT", COMPANY_MAPPING_128.get(UUID.fromString("00000b04-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b05-0000-1000-8000-00805f9b34fb")));
        assertEquals("Marquardt GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b05-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b06-0000-1000-8000-00805f9b34fb")));
        assertEquals("FAZUA GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000b06-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b07-0000-1000-8000-00805f9b34fb")));
        assertEquals("Workaround Gmbh",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b07-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b08-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Qianfenyi Intelligent Technology Co., LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b08-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b09-0000-1000-8000-00805f9b34fb")));
        assertEquals("soonisys", COMPANY_MAPPING_128.get(UUID.fromString("00000b09-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b0a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Belun Technology Company Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b0a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b0b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sanistaal A/S", COMPANY_MAPPING_128.get(UUID.fromString("00000b0b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b0c-0000-1000-8000-00805f9b34fb")));
        assertEquals("BluPeak", COMPANY_MAPPING_128.get(UUID.fromString("00000b0c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b0d-0000-1000-8000-00805f9b34fb")));
        assertEquals("SANYO DENKO Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b0d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b0e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Honda Lock Mfg. Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b0e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b0f-0000-1000-8000-00805f9b34fb")));
        assertEquals("B.E.A. S.A.", COMPANY_MAPPING_128.get(UUID.fromString("00000b0f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b10-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alfa Laval Corporate AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b10-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b11-0000-1000-8000-00805f9b34fb")));
        assertEquals("ThermoWorks, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b11-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b12-0000-1000-8000-00805f9b34fb")));
        assertEquals("ToughBuilt Industries LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b12-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b13-0000-1000-8000-00805f9b34fb")));
        assertEquals("IOTOOLS", COMPANY_MAPPING_128.get(UUID.fromString("00000b13-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b14-0000-1000-8000-00805f9b34fb")));
        assertEquals("Olumee", COMPANY_MAPPING_128.get(UUID.fromString("00000b14-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b15-0000-1000-8000-00805f9b34fb")));
        assertEquals("NAOS JAPAN K.K.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b15-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b16-0000-1000-8000-00805f9b34fb")));
        assertEquals("Guard RFID Solutions Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b16-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b17-0000-1000-8000-00805f9b34fb")));
        assertEquals("SIG SAUER, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b17-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b18-0000-1000-8000-00805f9b34fb")));
        assertEquals("DECATHLON SE", COMPANY_MAPPING_128.get(UUID.fromString("00000b18-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b19-0000-1000-8000-00805f9b34fb")));
        assertEquals("WBS PROJECT H PTY LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b19-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b1a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Roca Sanitario, S.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b1a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b1b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Enerpac Tool Group Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b1b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b1c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nanoleq AG", COMPANY_MAPPING_128.get(UUID.fromString("00000b1c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b1d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Accelerated Systems",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b1d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b1e-0000-1000-8000-00805f9b34fb")));
        assertEquals("PB INC.", COMPANY_MAPPING_128.get(UUID.fromString("00000b1e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b1f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing ESWIN Computing Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b1f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b20-0000-1000-8000-00805f9b34fb")));
        assertEquals("TKH Security B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b20-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b21-0000-1000-8000-00805f9b34fb")));
        assertEquals("ams AG", COMPANY_MAPPING_128.get(UUID.fromString("00000b21-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b22-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hygiene IQ, LLC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b22-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b23-0000-1000-8000-00805f9b34fb")));
        assertEquals("iRhythm Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b23-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b24-0000-1000-8000-00805f9b34fb")));
        assertEquals("BeiJing ZiJie TiaoDong KeJi Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b24-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b25-0000-1000-8000-00805f9b34fb")));
        assertEquals("NIBROTECH LTD", COMPANY_MAPPING_128.get(UUID.fromString("00000b25-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b26-0000-1000-8000-00805f9b34fb")));
        assertEquals("Baracoda Daily Healthtech.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b26-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b27-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lumi United Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b27-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b28-0000-1000-8000-00805f9b34fb")));
        assertEquals("CHACON", COMPANY_MAPPING_128.get(UUID.fromString("00000b28-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b29-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tech-Venom Entertainment Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b29-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b2a-0000-1000-8000-00805f9b34fb")));
        assertEquals("ACL Airshop B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b2a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b2b-0000-1000-8000-00805f9b34fb")));
        assertEquals("MAINBOT", COMPANY_MAPPING_128.get(UUID.fromString("00000b2b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b2c-0000-1000-8000-00805f9b34fb")));
        assertEquals("ILLUMAGEAR, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b2c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b2d-0000-1000-8000-00805f9b34fb")));
        assertEquals("REDARC ELECTRONICS PTY LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b2d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b2e-0000-1000-8000-00805f9b34fb")));
        assertEquals("MOCA System Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b2e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b2f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Duke Manufacturing Co",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b2f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b30-0000-1000-8000-00805f9b34fb")));
        assertEquals("ART SPA", COMPANY_MAPPING_128.get(UUID.fromString("00000b30-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b31-0000-1000-8000-00805f9b34fb")));
        assertEquals("Silver Wolf Vehicles Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b31-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b32-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hala Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b32-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b33-0000-1000-8000-00805f9b34fb")));
        assertEquals("ARMATURA LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000b33-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b34-0000-1000-8000-00805f9b34fb")));
        assertEquals("CONZUMEX INDUSTRIES PRIVATE LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b34-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b35-0000-1000-8000-00805f9b34fb")));
        assertEquals("BH SENS", COMPANY_MAPPING_128.get(UUID.fromString("00000b35-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b36-0000-1000-8000-00805f9b34fb")));
        assertEquals("SINTEF", COMPANY_MAPPING_128.get(UUID.fromString("00000b36-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b37-0000-1000-8000-00805f9b34fb")));
        assertEquals("Omnivoltaic Energy Solutions Limited Company",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b37-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b38-0000-1000-8000-00805f9b34fb")));
        assertEquals("WISYCOM S.R.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b38-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b39-0000-1000-8000-00805f9b34fb")));
        assertEquals("Red 100 Lighting Co., ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b39-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b3a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Impact Biosystems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b3a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b3b-0000-1000-8000-00805f9b34fb")));
        assertEquals("AIC semiconductor (Shanghai) Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b3b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b3c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dodge Industrial, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b3c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b3d-0000-1000-8000-00805f9b34fb")));
        assertEquals("REALTIMEID AS", COMPANY_MAPPING_128.get(UUID.fromString("00000b3d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b3e-0000-1000-8000-00805f9b34fb")));
        assertEquals("ISEO Serrature S.p.a.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b3e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b3f-0000-1000-8000-00805f9b34fb")));
        assertEquals("MindRhythm, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b3f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b40-0000-1000-8000-00805f9b34fb")));
        assertEquals("Havells India Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b40-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b41-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sentrax GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000b41-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b42-0000-1000-8000-00805f9b34fb")));
        assertEquals("TSI", COMPANY_MAPPING_128.get(UUID.fromString("00000b42-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b43-0000-1000-8000-00805f9b34fb")));
        assertEquals("INCITAT ENVIRONNEMENT",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b43-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b44-0000-1000-8000-00805f9b34fb")));
        assertEquals("nFore Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b44-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b45-0000-1000-8000-00805f9b34fb")));
        assertEquals("Electronic Sensors, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b45-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b46-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bird Rides, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b46-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b47-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gentex Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b47-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b48-0000-1000-8000-00805f9b34fb")));
        assertEquals("NIO USA, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000b48-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b49-0000-1000-8000-00805f9b34fb")));
        assertEquals("SkyHawke Technologies",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b49-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b4a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nomono AS", COMPANY_MAPPING_128.get(UUID.fromString("00000b4a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b4b-0000-1000-8000-00805f9b34fb")));
        assertEquals("EMS Integrators, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b4b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b4c-0000-1000-8000-00805f9b34fb")));
        assertEquals("BiosBob.Biz", COMPANY_MAPPING_128.get(UUID.fromString("00000b4c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b4d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Adam Hall GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b4d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b4e-0000-1000-8000-00805f9b34fb")));
        assertEquals("ICP Systems B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b4e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b4f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Breezi.io, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b4f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b50-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mesh Systems LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b50-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b51-0000-1000-8000-00805f9b34fb")));
        assertEquals("FUN FACTORY GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b51-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b52-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZIIP Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000b52-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b53-0000-1000-8000-00805f9b34fb")));
        assertEquals("SHENZHEN KAADAS INTELLIGENT TECHNOLOGY CO.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b53-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b54-0000-1000-8000-00805f9b34fb")));
        assertEquals("Emotion Fitness GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b54-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b55-0000-1000-8000-00805f9b34fb")));
        assertEquals("H G M Automotive Electronics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b55-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b56-0000-1000-8000-00805f9b34fb")));
        assertEquals("BORA - Vertriebs GmbH & Co KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b56-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b57-0000-1000-8000-00805f9b34fb")));
        assertEquals("CONVERTRONIX TECHNOLOGIES AND SERVICES LLP",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b57-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b58-0000-1000-8000-00805f9b34fb")));
        assertEquals("TOKAI-DENSHI INC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b58-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b59-0000-1000-8000-00805f9b34fb")));
        assertEquals("Versa Group B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b59-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b5a-0000-1000-8000-00805f9b34fb")));
        assertEquals("H.P. Shelby Manufacturing, LLC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b5a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b5b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen ImagineVision Technology Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b5b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b5c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Exponential Power, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b5c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b5d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fujian Newland Auto-ID Tech. Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b5d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b5e-0000-1000-8000-00805f9b34fb")));
        assertEquals("CELLCONTROL, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b5e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b5f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rivieh, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000b5f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b60-0000-1000-8000-00805f9b34fb")));
        assertEquals("RATOC Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b60-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b61-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sentek Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b61-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b62-0000-1000-8000-00805f9b34fb")));
        assertEquals("NOVEA ENERGIES",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b62-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b63-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innolux Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b63-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b64-0000-1000-8000-00805f9b34fb")));
        assertEquals("NingBo klite Electric Manufacture Co.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b64-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b65-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Apache Software Foundation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b65-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b66-0000-1000-8000-00805f9b34fb")));
        assertEquals("MITSUBISHI ELECTRIC AUTOMATION (THAILAND) COMPANY LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b66-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b67-0000-1000-8000-00805f9b34fb")));
        assertEquals("CleanSpace Technology Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b67-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b68-0000-1000-8000-00805f9b34fb")));
        assertEquals("Quha oy", COMPANY_MAPPING_128.get(UUID.fromString("00000b68-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b69-0000-1000-8000-00805f9b34fb")));
        assertEquals("Addaday", COMPANY_MAPPING_128.get(UUID.fromString("00000b69-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b6a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dymo", COMPANY_MAPPING_128.get(UUID.fromString("00000b6a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b6b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Samsara Networks, Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b6b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b6c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensitech, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b6c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b6d-0000-1000-8000-00805f9b34fb")));
        assertEquals("SOLUM CO., LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b6d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b6e-0000-1000-8000-00805f9b34fb")));
        assertEquals("React Mobile", COMPANY_MAPPING_128.get(UUID.fromString("00000b6e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b6f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Malide Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b6f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b70-0000-1000-8000-00805f9b34fb")));
        assertEquals("JDRF Electromag Engineering Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b70-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b71-0000-1000-8000-00805f9b34fb")));
        assertEquals("lilbit ODM AS", COMPANY_MAPPING_128.get(UUID.fromString("00000b71-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b72-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geeknet, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000b72-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b73-0000-1000-8000-00805f9b34fb")));
        assertEquals("HARADA INDUSTRY CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b73-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b74-0000-1000-8000-00805f9b34fb")));
        assertEquals("BQN", COMPANY_MAPPING_128.get(UUID.fromString("00000b74-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b75-0000-1000-8000-00805f9b34fb")));
        assertEquals("Triple W Japan Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b75-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b76-0000-1000-8000-00805f9b34fb")));
        assertEquals("MAX-co., ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000b76-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b77-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aixlink(Chengdu) Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b77-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b78-0000-1000-8000-00805f9b34fb")));
        assertEquals("FIELD DESIGN INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b78-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b79-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sankyo Air Tech Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b79-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b7a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen KTC Technology Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b7a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b7b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hardcoder Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000b7b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b7c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Scangrip A/S", COMPANY_MAPPING_128.get(UUID.fromString("00000b7c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b7d-0000-1000-8000-00805f9b34fb")));
        assertEquals("FoundersLane GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b7d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b7e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Offcode Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000b7e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b7f-0000-1000-8000-00805f9b34fb")));
        assertEquals("ICU tech GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000b7f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b80-0000-1000-8000-00805f9b34fb")));
        assertEquals("AXELIFE", COMPANY_MAPPING_128.get(UUID.fromString("00000b80-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b81-0000-1000-8000-00805f9b34fb")));
        assertEquals("SCM Group", COMPANY_MAPPING_128.get(UUID.fromString("00000b81-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b82-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mammut Sports Group AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b82-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b83-0000-1000-8000-00805f9b34fb")));
        assertEquals("Taiga Motors Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b83-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b84-0000-1000-8000-00805f9b34fb")));
        assertEquals("Presidio Medical, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b84-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b85-0000-1000-8000-00805f9b34fb")));
        assertEquals("VIMANA TECH PTY LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b85-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b86-0000-1000-8000-00805f9b34fb")));
        assertEquals("Trek Bicycle", COMPANY_MAPPING_128.get(UUID.fromString("00000b86-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b87-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ampetronic Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b87-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b88-0000-1000-8000-00805f9b34fb")));
        assertEquals("Muguang (Guangdong) Intelligent Lighting Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b88-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b89-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rotronic AG", COMPANY_MAPPING_128.get(UUID.fromString("00000b89-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b8a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Seiko Instruments Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b8a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b8b-0000-1000-8000-00805f9b34fb")));
        assertEquals("American Technology Components, Incorporated",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b8b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b8c-0000-1000-8000-00805f9b34fb")));
        assertEquals("MOTREX", COMPANY_MAPPING_128.get(UUID.fromString("00000b8c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b8d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pertech Industries Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b8d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b8e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gentle Energy Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b8e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b8f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Senscomm Semiconductor Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b8f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b90-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ineos Automotive Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b90-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b91-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alfen ICU B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b91-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b92-0000-1000-8000-00805f9b34fb")));
        assertEquals("Citisend Solutions, SL",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b92-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b93-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hangzhou BroadLink Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b93-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b94-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dreem SAS", COMPANY_MAPPING_128.get(UUID.fromString("00000b94-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b95-0000-1000-8000-00805f9b34fb")));
        assertEquals("Netwake GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000b95-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b96-0000-1000-8000-00805f9b34fb")));
        assertEquals("Telecom Design",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b96-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b97-0000-1000-8000-00805f9b34fb")));
        assertEquals("SILVER TREE LABS, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b97-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b98-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gymstory B.V.", COMPANY_MAPPING_128.get(UUID.fromString("00000b98-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b99-0000-1000-8000-00805f9b34fb")));
        assertEquals("The Goodyear Tire & Rubber Company",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b99-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b9a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing Wisepool Infinite Intelligence Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b9a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b9b-0000-1000-8000-00805f9b34fb")));
        assertEquals("GISMAN", COMPANY_MAPPING_128.get(UUID.fromString("00000b9b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b9c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Komatsu Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("00000b9c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b9d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensoria Holdings LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b9d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b9e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Audio Partnership Plc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b9e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000b9f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Group Lotus Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000b9f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ba0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Data Sciences International",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ba0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ba1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Bunn-O-Matic Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ba1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ba2-0000-1000-8000-00805f9b34fb")));
        assertEquals("TireCheck GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ba2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ba3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sonova Consumer Hearing GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ba3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ba4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vervent Audio Group",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ba4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ba5-0000-1000-8000-00805f9b34fb")));
        assertEquals("SONICOS ENTERPRISES, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ba5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ba6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nissan Motor Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ba6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ba7-0000-1000-8000-00805f9b34fb")));
        assertEquals("hearX Group (Pty) Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ba7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ba8-0000-1000-8000-00805f9b34fb")));
        assertEquals("GLOWFORGE INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ba8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ba9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Allterco Robotics ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ba9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000baa-0000-1000-8000-00805f9b34fb")));
        assertEquals("Infinitegra, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000baa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bab-0000-1000-8000-00805f9b34fb")));
        assertEquals("Grandex International Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bab-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bac-0000-1000-8000-00805f9b34fb")));
        assertEquals("Machfu Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000bac-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bad-0000-1000-8000-00805f9b34fb")));
        assertEquals("Roambotics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bad-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bae-0000-1000-8000-00805f9b34fb")));
        assertEquals("Soma Labs LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000bae-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000baf-0000-1000-8000-00805f9b34fb")));
        assertEquals("NITTO KOGYO CORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("00000baf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bb0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ecolab Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000bb0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bb1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Beijing ranxin intelligence technology Co.,LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bb1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bb2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fjorden Electra AS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bb2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bb3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Flender GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000bb3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bb4-0000-1000-8000-00805f9b34fb")));
        assertEquals("New Cosmos USA, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bb4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bb5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xirgo Technologies, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bb5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bb6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Build With Robots Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bb6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bb7-0000-1000-8000-00805f9b34fb")));
        assertEquals("IONA Tech LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000bb7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bb8-0000-1000-8000-00805f9b34fb")));
        assertEquals("INNOVAG PTY. LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bb8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bb9-0000-1000-8000-00805f9b34fb")));
        assertEquals("SaluStim Group Oy",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bb9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bba-0000-1000-8000-00805f9b34fb")));
        assertEquals("Huso, INC", COMPANY_MAPPING_128.get(UUID.fromString("00000bba-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bbb-0000-1000-8000-00805f9b34fb")));
        assertEquals("SWISSINNO SOLUTIONS AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bbb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bbc-0000-1000-8000-00805f9b34fb")));
        assertEquals("T2REALITY SOLUTIONS PRIVATE LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bbc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bbd-0000-1000-8000-00805f9b34fb")));
        assertEquals("ETHEORY PTY LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bbd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bbe-0000-1000-8000-00805f9b34fb")));
        assertEquals("SAAB Aktiebolag",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bbe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bbf-0000-1000-8000-00805f9b34fb")));
        assertEquals("HIMSA II K/S", COMPANY_MAPPING_128.get(UUID.fromString("00000bbf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bc0-0000-1000-8000-00805f9b34fb")));
        assertEquals("READY FOR SKY LLP",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bc0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bc1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Miele & Cie. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bc1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bc2-0000-1000-8000-00805f9b34fb")));
        assertEquals("EntWick Co.", COMPANY_MAPPING_128.get(UUID.fromString("00000bc2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bc3-0000-1000-8000-00805f9b34fb")));
        assertEquals("MCOT INC.", COMPANY_MAPPING_128.get(UUID.fromString("00000bc3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bc4-0000-1000-8000-00805f9b34fb")));
        assertEquals("TECHTICS ENGINEERING B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bc4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bc5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aperia Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bc5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bc6-0000-1000-8000-00805f9b34fb")));
        assertEquals("TCL COMMUNICATION EQUIPMENT CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bc6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bc7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Signtle Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000bc7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bc8-0000-1000-8000-00805f9b34fb")));
        assertEquals("OTF Distribution, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bc8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bc9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Neuvatek Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000bc9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bca-0000-1000-8000-00805f9b34fb")));
        assertEquals("Perimeter Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bca-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bcb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Divesoft s.r.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bcb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bcc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sylvac sa", COMPANY_MAPPING_128.get(UUID.fromString("00000bcc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bcd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amiko srl", COMPANY_MAPPING_128.get(UUID.fromString("00000bcd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bce-0000-1000-8000-00805f9b34fb")));
        assertEquals("Neurosity, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bce-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bcf-0000-1000-8000-00805f9b34fb")));
        assertEquals("LL Tec Group LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bcf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bd0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Durag GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000bd0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bd1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hubei Yuan Times Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bd1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bd2-0000-1000-8000-00805f9b34fb")));
        assertEquals("IDEC", COMPANY_MAPPING_128.get(UUID.fromString("00000bd2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bd3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Procon Analytics, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bd3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bd4-0000-1000-8000-00805f9b34fb")));
        assertEquals("ndd Medizintechnik AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bd4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bd5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Super B Lithium Power B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bd5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bd6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Injoinic Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bd6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bd7-0000-1000-8000-00805f9b34fb")));
        assertEquals("VINFAST TRADING AND PRODUCTION JOINT STOCK COMPANY",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bd7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bd8-0000-1000-8000-00805f9b34fb")));
        assertEquals("PURA SCENTS, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bd8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bd9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Elics Basis Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bd9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bda-0000-1000-8000-00805f9b34fb")));
        assertEquals("Aardex Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("00000bda-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bdb-0000-1000-8000-00805f9b34fb")));
        assertEquals("CHAR-BROIL, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bdb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bdc-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ledworks S.r.l.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bdc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bdd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Coroflo Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bdd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bde-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yale", COMPANY_MAPPING_128.get(UUID.fromString("00000bde-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bdf-0000-1000-8000-00805f9b34fb")));
        assertEquals("WINKEY ENTERPRISE (HONG KONG) LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bdf-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000be0-0000-1000-8000-00805f9b34fb")));
        assertEquals("Koizumi Lighting Technology corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000be0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000be1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Back40 Precision",
                COMPANY_MAPPING_128.get(UUID.fromString("00000be1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000be2-0000-1000-8000-00805f9b34fb")));
        assertEquals("OTC engineering",
                COMPANY_MAPPING_128.get(UUID.fromString("00000be2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000be3-0000-1000-8000-00805f9b34fb")));
        assertEquals("Comtel Systems Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000be3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000be4-0000-1000-8000-00805f9b34fb")));
        assertEquals("Deepfield Connect GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000be4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000be5-0000-1000-8000-00805f9b34fb")));
        assertEquals("ZWILLING J.A. Henckels Aktiengesellschaft",
                COMPANY_MAPPING_128.get(UUID.fromString("00000be5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000be6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Puratap Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000be6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000be7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fresnel Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000be7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000be8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensormate AG", COMPANY_MAPPING_128.get(UUID.fromString("00000be8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000be9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shindengen Electric Manufacturing Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000be9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bea-0000-1000-8000-00805f9b34fb")));
        assertEquals("Twenty Five Seven, prodaja in storitve, d.o.o.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bea-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000beb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Luna Health, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000beb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bec-0000-1000-8000-00805f9b34fb")));
        assertEquals("Miracle-Ear, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bec-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bed-0000-1000-8000-00805f9b34fb")));
        assertEquals("CORAL-TAIYI Co. Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bed-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bee-0000-1000-8000-00805f9b34fb")));
        assertEquals("LINKSYS USA, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bee-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bef-0000-1000-8000-00805f9b34fb")));
        assertEquals("Safetytest GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bef-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bf0-0000-1000-8000-00805f9b34fb")));
        assertEquals("KIDO SPORTS CO., LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bf0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bf1-0000-1000-8000-00805f9b34fb")));
        assertEquals("Site IQ LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000bf1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bf2-0000-1000-8000-00805f9b34fb")));
        assertEquals("Angel Medical Systems, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bf2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bf3-0000-1000-8000-00805f9b34fb")));
        assertEquals("PONE BIOMETRICS AS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bf3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bf4-0000-1000-8000-00805f9b34fb")));
        assertEquals("ER Lab LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000bf4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bf5-0000-1000-8000-00805f9b34fb")));
        assertEquals("T5 tek, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000bf5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bf6-0000-1000-8000-00805f9b34fb")));
        assertEquals("greenTEG AG", COMPANY_MAPPING_128.get(UUID.fromString("00000bf6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bf7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wacker Neuson SE",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bf7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bf8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Innovacionnye Resheniya",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bf8-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bf9-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alio, Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000bf9-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bfa-0000-1000-8000-00805f9b34fb")));
        assertEquals("CleanBands Systems Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bfa-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bfb-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dodam Enersys Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bfb-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bfc-0000-1000-8000-00805f9b34fb")));
        assertEquals("T+A elektroakustik GmbH & Co.KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bfc-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bfd-0000-1000-8000-00805f9b34fb")));
        assertEquals("Esmé Solutions",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bfd-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bfe-0000-1000-8000-00805f9b34fb")));
        assertEquals("Media-Cartec GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bfe-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000bff-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ratio Electric BV",
                COMPANY_MAPPING_128.get(UUID.fromString("00000bff-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c00-0000-1000-8000-00805f9b34fb")));
        assertEquals("MQA Limited", COMPANY_MAPPING_128.get(UUID.fromString("00000c00-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c01-0000-1000-8000-00805f9b34fb")));
        assertEquals("NEOWRK SISTEMAS INTELIGENTES S.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c01-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c02-0000-1000-8000-00805f9b34fb")));
        assertEquals("Loomanet, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c02-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c03-0000-1000-8000-00805f9b34fb")));
        assertEquals("Puff Corp", COMPANY_MAPPING_128.get(UUID.fromString("00000c03-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c04-0000-1000-8000-00805f9b34fb")));
        assertEquals("Happy Health, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c04-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c05-0000-1000-8000-00805f9b34fb")));
        assertEquals("Montage Connect, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c05-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c06-0000-1000-8000-00805f9b34fb")));
        assertEquals("LED Smart Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c06-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c07-0000-1000-8000-00805f9b34fb")));
        assertEquals("CONSTRUKTS, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c07-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c08-0000-1000-8000-00805f9b34fb")));
        assertEquals("limited liability company \"Red\"",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c08-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c09-0000-1000-8000-00805f9b34fb")));
        assertEquals("Senic Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000c09-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c0a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Automated Pet Care Products, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c0a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c0b-0000-1000-8000-00805f9b34fb")));
        assertEquals("aconno GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000c0b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c0c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mendeltron, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c0c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c0d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mereltron bv", COMPANY_MAPPING_128.get(UUID.fromString("00000c0d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c0e-0000-1000-8000-00805f9b34fb")));
        assertEquals("ALEX DENKO CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c0e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c0f-0000-1000-8000-00805f9b34fb")));
        assertEquals("AETERLINK", COMPANY_MAPPING_128.get(UUID.fromString("00000c0f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c10-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cosmed s.r.l.", COMPANY_MAPPING_128.get(UUID.fromString("00000c10-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c11-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gordon Murray Design Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c11-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c12-0000-1000-8000-00805f9b34fb")));
        assertEquals("IoSA", COMPANY_MAPPING_128.get(UUID.fromString("00000c12-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c13-0000-1000-8000-00805f9b34fb")));
        assertEquals("Scandinavian Health Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c13-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c14-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fasetto, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000c14-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c15-0000-1000-8000-00805f9b34fb")));
        assertEquals("Geva Sol B.V.", COMPANY_MAPPING_128.get(UUID.fromString("00000c15-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c16-0000-1000-8000-00805f9b34fb")));
        assertEquals("TYKEE PTY. LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c16-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c17-0000-1000-8000-00805f9b34fb")));
        assertEquals("SomnoMed Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c17-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c18-0000-1000-8000-00805f9b34fb")));
        assertEquals("CORROHM", COMPANY_MAPPING_128.get(UUID.fromString("00000c18-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c19-0000-1000-8000-00805f9b34fb")));
        assertEquals("Arlo Technologies, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c19-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c1a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Catapult Group International Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c1a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c1b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rockchip Electronics Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c1b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c1c-0000-1000-8000-00805f9b34fb")));
        assertEquals("GEMU", COMPANY_MAPPING_128.get(UUID.fromString("00000c1c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c1d-0000-1000-8000-00805f9b34fb")));
        assertEquals("OFF Line Japan Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c1d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c1e-0000-1000-8000-00805f9b34fb")));
        assertEquals("EC sense co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c1e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c1f-0000-1000-8000-00805f9b34fb")));
        assertEquals("LVI Co.", COMPANY_MAPPING_128.get(UUID.fromString("00000c1f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c20-0000-1000-8000-00805f9b34fb")));
        assertEquals("COMELIT GROUP S.P.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c20-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c21-0000-1000-8000-00805f9b34fb")));
        assertEquals("Foshan Viomi Electrical Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c21-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c22-0000-1000-8000-00805f9b34fb")));
        assertEquals("Glamo Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000c22-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c23-0000-1000-8000-00805f9b34fb")));
        assertEquals("KEYTEC,Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000c23-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c24-0000-1000-8000-00805f9b34fb")));
        assertEquals("SMARTD TECHNOLOGIES INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c24-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c25-0000-1000-8000-00805f9b34fb")));
        assertEquals("JURA Elektroapparate AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c25-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c26-0000-1000-8000-00805f9b34fb")));
        assertEquals("Performance Electronics, Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c26-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c27-0000-1000-8000-00805f9b34fb")));
        assertEquals("Pal Electronics",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c27-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c28-0000-1000-8000-00805f9b34fb")));
        assertEquals("Embecta Corp.", COMPANY_MAPPING_128.get(UUID.fromString("00000c28-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c29-0000-1000-8000-00805f9b34fb")));
        assertEquals("DENSO AIRCOOL CORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c29-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c2a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Caresix Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000c2a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c2b-0000-1000-8000-00805f9b34fb")));
        assertEquals("GigaDevice Semiconductor Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c2b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c2c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zeku Technology (Shanghai) Corp., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c2c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c2d-0000-1000-8000-00805f9b34fb")));
        assertEquals("OTF Product Sourcing, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c2d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c2e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Easee AS", COMPANY_MAPPING_128.get(UUID.fromString("00000c2e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c2f-0000-1000-8000-00805f9b34fb")));
        assertEquals("BEEHERO, INC.", COMPANY_MAPPING_128.get(UUID.fromString("00000c2f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c30-0000-1000-8000-00805f9b34fb")));
        assertEquals("McIntosh Group Inc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c30-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c31-0000-1000-8000-00805f9b34fb")));
        assertEquals("KINDOO LLP", COMPANY_MAPPING_128.get(UUID.fromString("00000c31-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c32-0000-1000-8000-00805f9b34fb")));
        assertEquals("Xian Yisuobao Electronic Technology Co., Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c32-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c33-0000-1000-8000-00805f9b34fb")));
        assertEquals("Exeger Operations AB",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c33-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c34-0000-1000-8000-00805f9b34fb")));
        assertEquals("BYD Company Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c34-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c35-0000-1000-8000-00805f9b34fb")));
        assertEquals("Thermokon-Sensortechnik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c35-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c36-0000-1000-8000-00805f9b34fb")));
        assertEquals("Cosmicnode BV", COMPANY_MAPPING_128.get(UUID.fromString("00000c36-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c37-0000-1000-8000-00805f9b34fb")));
        assertEquals("SignalQuest, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c37-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c38-0000-1000-8000-00805f9b34fb")));
        assertEquals("Noritz Corporation.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c38-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c39-0000-1000-8000-00805f9b34fb")));
        assertEquals("TIGER CORPORATION",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c39-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c3a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Equinosis, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c3a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c3b-0000-1000-8000-00805f9b34fb")));
        assertEquals("ORB Innovations Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c3b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c3c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Classified Cycling",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c3c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c3d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Wrmth Corp.", COMPANY_MAPPING_128.get(UUID.fromString("00000c3d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c3e-0000-1000-8000-00805f9b34fb")));
        assertEquals("BELLDESIGN Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c3e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c3f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Stinger Equipment, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c3f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c40-0000-1000-8000-00805f9b34fb")));
        assertEquals("HORIBA, Ltd.", COMPANY_MAPPING_128.get(UUID.fromString("00000c40-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c41-0000-1000-8000-00805f9b34fb")));
        assertEquals("Control Solutions LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c41-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c42-0000-1000-8000-00805f9b34fb")));
        assertEquals("Heath Consultants Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c42-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c43-0000-1000-8000-00805f9b34fb")));
        assertEquals("Berlinger & Co. AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c43-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c44-0000-1000-8000-00805f9b34fb")));
        assertEquals("ONCELABS LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000c44-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c45-0000-1000-8000-00805f9b34fb")));
        assertEquals("Brose Verwaltung SE, Bamberg",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c45-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c46-0000-1000-8000-00805f9b34fb")));
        assertEquals("Granwin IoT Technology (Guangzhou) Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c46-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c47-0000-1000-8000-00805f9b34fb")));
        assertEquals("Epsilon Electronics,lnc",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c47-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c48-0000-1000-8000-00805f9b34fb")));
        assertEquals("VALEO MANAGEMENT SERVICES",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c48-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c49-0000-1000-8000-00805f9b34fb")));
        assertEquals("twopounds gmbh",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c49-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c4a-0000-1000-8000-00805f9b34fb")));
        assertEquals("atSpiro ApS", COMPANY_MAPPING_128.get(UUID.fromString("00000c4a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c4b-0000-1000-8000-00805f9b34fb")));
        assertEquals("ADTRAN, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000c4b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c4c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Orpyx Medical Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c4c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c4d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Seekwave Technology Co.,ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c4d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c4e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Tactile Engineering, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c4e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c4f-0000-1000-8000-00805f9b34fb")));
        assertEquals("SharkNinja Operating LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c4f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c50-0000-1000-8000-00805f9b34fb")));
        assertEquals("Imostar Technologies Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c50-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c51-0000-1000-8000-00805f9b34fb")));
        assertEquals("INNOVA S.R.L.", COMPANY_MAPPING_128.get(UUID.fromString("00000c51-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c52-0000-1000-8000-00805f9b34fb")));
        assertEquals("ESCEA LIMITED", COMPANY_MAPPING_128.get(UUID.fromString("00000c52-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c53-0000-1000-8000-00805f9b34fb")));
        assertEquals("Taco, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000c53-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c54-0000-1000-8000-00805f9b34fb")));
        assertEquals("HiViz Lighting, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c54-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c55-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zintouch B.V.", COMPANY_MAPPING_128.get(UUID.fromString("00000c55-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c56-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rheem Sales Company, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c56-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c57-0000-1000-8000-00805f9b34fb")));
        assertEquals("UNEEG medical A/S",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c57-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c58-0000-1000-8000-00805f9b34fb")));
        assertEquals("Hykso Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000c58-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c59-0000-1000-8000-00805f9b34fb")));
        assertEquals("CYBERDYNE Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c59-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c5a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Lockswitch Sdn Bhd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c5a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c5b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Alban Giacomo S.P.A.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c5b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c5c-0000-1000-8000-00805f9b34fb")));
        assertEquals("MGM WIRELESSS HOLDINGS PTY LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c5c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c5d-0000-1000-8000-00805f9b34fb")));
        assertEquals("StepUp Solutions ApS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c5d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c5e-0000-1000-8000-00805f9b34fb")));
        assertEquals("BlueID GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000c5e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c5f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nanjing Linkpower Microelectronics Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c5f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c60-0000-1000-8000-00805f9b34fb")));
        assertEquals("KEBA Energy Automation GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c60-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c61-0000-1000-8000-00805f9b34fb")));
        assertEquals("NNOXX, Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000c61-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c62-0000-1000-8000-00805f9b34fb")));
        assertEquals("Phiaton Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c62-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c63-0000-1000-8000-00805f9b34fb")));
        assertEquals("phg Peter Hengstler GmbH + Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c63-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c64-0000-1000-8000-00805f9b34fb")));
        assertEquals("dormakaba Holding AG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c64-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c65-0000-1000-8000-00805f9b34fb")));
        assertEquals("WAKO CO,.LTD", COMPANY_MAPPING_128.get(UUID.fromString("00000c65-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c66-0000-1000-8000-00805f9b34fb")));
        assertEquals("DEN Smart Home B.V.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c66-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c67-0000-1000-8000-00805f9b34fb")));
        assertEquals("TRACKTING S.R.L.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c67-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c68-0000-1000-8000-00805f9b34fb")));
        assertEquals("Emerja Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c68-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c69-0000-1000-8000-00805f9b34fb")));
        assertEquals("BLITZ electric motors. LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c69-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c6a-0000-1000-8000-00805f9b34fb")));
        assertEquals("CONSORCIO TRUST CONTROL - NETTEL",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c6a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c6b-0000-1000-8000-00805f9b34fb")));
        assertEquals("GILSON SAS", COMPANY_MAPPING_128.get(UUID.fromString("00000c6b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c6c-0000-1000-8000-00805f9b34fb")));
        assertEquals("SNIFF LOGIC LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c6c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c6d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Fidure Corp.", COMPANY_MAPPING_128.get(UUID.fromString("00000c6d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c6e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sensa LLC", COMPANY_MAPPING_128.get(UUID.fromString("00000c6e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c6f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Parakey AB", COMPANY_MAPPING_128.get(UUID.fromString("00000c6f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c70-0000-1000-8000-00805f9b34fb")));
        assertEquals("SCARAB SOLUTIONS LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c70-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c71-0000-1000-8000-00805f9b34fb")));
        assertEquals("BitGreen Technolabz (OPC) Private Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c71-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c72-0000-1000-8000-00805f9b34fb")));
        assertEquals("StreetCar ORV, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c72-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c73-0000-1000-8000-00805f9b34fb")));
        assertEquals("Truma Gerätetechnik GmbH & Co. KG",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c73-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c74-0000-1000-8000-00805f9b34fb")));
        assertEquals("yupiteru", COMPANY_MAPPING_128.get(UUID.fromString("00000c74-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c75-0000-1000-8000-00805f9b34fb")));
        assertEquals("Embedded Engineering Solutions LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c75-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c76-0000-1000-8000-00805f9b34fb")));
        assertEquals("Shenzhen Gwell Times Technology Co. , Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c76-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c77-0000-1000-8000-00805f9b34fb")));
        assertEquals("TEAC Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c77-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c78-0000-1000-8000-00805f9b34fb")));
        assertEquals("CHARGTRON IOT PRIVATE LIMITED",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c78-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c79-0000-1000-8000-00805f9b34fb")));
        assertEquals("Zhuhai Smartlink Technology Co., Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c79-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c7a-0000-1000-8000-00805f9b34fb")));
        assertEquals("Triductor Technology (Suzhou), Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c7a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c7b-0000-1000-8000-00805f9b34fb")));
        assertEquals("PT SADAMAYA GRAHA TEKNOLOGI",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c7b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c7c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Mopeka Products LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c7c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c7d-0000-1000-8000-00805f9b34fb")));
        assertEquals("3ALogics, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c7d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c7e-0000-1000-8000-00805f9b34fb")));
        assertEquals("BOOMING OF THINGS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c7e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c7f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Rochester Sensors, LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c7f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c80-0000-1000-8000-00805f9b34fb")));
        assertEquals("CARDIOID - TECHNOLOGIES, LDA",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c80-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c81-0000-1000-8000-00805f9b34fb")));
        assertEquals("Carrier Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c81-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c82-0000-1000-8000-00805f9b34fb")));
        assertEquals("NACON", COMPANY_MAPPING_128.get(UUID.fromString("00000c82-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c83-0000-1000-8000-00805f9b34fb")));
        assertEquals("Watchdog Systems LLC",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c83-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c84-0000-1000-8000-00805f9b34fb")));
        assertEquals("MAXON INDUSTRIES, INC.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c84-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c85-0000-1000-8000-00805f9b34fb")));
        assertEquals("Amlogic, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000c85-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c86-0000-1000-8000-00805f9b34fb")));
        assertEquals("Qingdao Eastsoft Communication Technology Co.,Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c86-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c87-0000-1000-8000-00805f9b34fb")));
        assertEquals("Weltek Technologies Company Limited",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c87-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c88-0000-1000-8000-00805f9b34fb")));
        assertEquals("Nextivity Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c88-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c89-0000-1000-8000-00805f9b34fb")));
        assertEquals("AGZZX OPTOELECTRONICS TECHNOLOGY CO., LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c89-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c8a-0000-1000-8000-00805f9b34fb")));
        assertEquals("ARTISTIC&CO.GLOBAL Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c8a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c8b-0000-1000-8000-00805f9b34fb")));
        assertEquals("Heavys Inc", COMPANY_MAPPING_128.get(UUID.fromString("00000c8b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c8c-0000-1000-8000-00805f9b34fb")));
        assertEquals("T-Mobile USA", COMPANY_MAPPING_128.get(UUID.fromString("00000c8c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c8d-0000-1000-8000-00805f9b34fb")));
        assertEquals("tonies GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000c8d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c8e-0000-1000-8000-00805f9b34fb")));
        assertEquals("Technocon Engineering Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c8e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c8f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Radar Automobile Sales(Shandong)Co.,Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c8f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c90-0000-1000-8000-00805f9b34fb")));
        assertEquals("WESCO AG", COMPANY_MAPPING_128.get(UUID.fromString("00000c90-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c91-0000-1000-8000-00805f9b34fb")));
        assertEquals("Yashu Systems", COMPANY_MAPPING_128.get(UUID.fromString("00000c91-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c92-0000-1000-8000-00805f9b34fb")));
        assertEquals("Kesseböhmer Ergonomietechnik GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c92-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c93-0000-1000-8000-00805f9b34fb")));
        assertEquals("Movesense Oy", COMPANY_MAPPING_128.get(UUID.fromString("00000c93-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c94-0000-1000-8000-00805f9b34fb")));
        assertEquals("Baxter Healthcare Corporation",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c94-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c95-0000-1000-8000-00805f9b34fb")));
        assertEquals("Gemstone Lights Canada Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c95-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c96-0000-1000-8000-00805f9b34fb")));
        assertEquals("H+B Hightech GmbH",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c96-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c97-0000-1000-8000-00805f9b34fb")));
        assertEquals("Deako", COMPANY_MAPPING_128.get(UUID.fromString("00000c97-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c98-0000-1000-8000-00805f9b34fb")));
        assertEquals("MiX Telematics International (PTY) LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c98-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c99-0000-1000-8000-00805f9b34fb")));
        assertEquals("Vire Health Oy",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c99-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c9a-0000-1000-8000-00805f9b34fb")));
        assertEquals("ALF Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000c9a-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c9b-0000-1000-8000-00805f9b34fb")));
        assertEquals("NTT sonority, Inc.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c9b-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c9c-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sunstone-RTLS Ipari Szolgaltato Korlatolt Felelossegu Tarsasag",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c9c-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c9d-0000-1000-8000-00805f9b34fb")));
        assertEquals("Ribbiot, INC.", COMPANY_MAPPING_128.get(UUID.fromString("00000c9d-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c9e-0000-1000-8000-00805f9b34fb")));
        assertEquals("ECCEL CORPORATION SAS",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c9e-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000c9f-0000-1000-8000-00805f9b34fb")));
        assertEquals("Dragonfly Energy Corp.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000c9f-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ca0-0000-1000-8000-00805f9b34fb")));
        assertEquals("BIGBEN", COMPANY_MAPPING_128.get(UUID.fromString("00000ca0-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ca1-0000-1000-8000-00805f9b34fb")));
        assertEquals("YAMAHA MOTOR CO.,LTD.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ca1-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ca2-0000-1000-8000-00805f9b34fb")));
        assertEquals("XSENSE LTD", COMPANY_MAPPING_128.get(UUID.fromString("00000ca2-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ca3-0000-1000-8000-00805f9b34fb")));
        assertEquals("MAQUET GmbH", COMPANY_MAPPING_128.get(UUID.fromString("00000ca3-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ca4-0000-1000-8000-00805f9b34fb")));
        assertEquals("MITSUBISHI ELECTRIC LIGHTING CO, LTD",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ca4-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ca5-0000-1000-8000-00805f9b34fb")));
        assertEquals("Princess Cruise Lines, Ltd.",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ca5-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ca6-0000-1000-8000-00805f9b34fb")));
        assertEquals("Megger Ltd", COMPANY_MAPPING_128.get(UUID.fromString("00000ca6-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ca7-0000-1000-8000-00805f9b34fb")));
        assertEquals("Verve InfoTec Pty Ltd",
                COMPANY_MAPPING_128.get(UUID.fromString("00000ca7-0000-1000-8000-00805f9b34fb")));
        assertTrue(COMPANY_MAPPING_128.containsKey(UUID.fromString("00000ca8-0000-1000-8000-00805f9b34fb")));
        assertEquals("Sonas, Inc.", COMPANY_MAPPING_128.get(UUID.fromString("00000ca8-0000-1000-8000-00805f9b34fb")));
    }
}
