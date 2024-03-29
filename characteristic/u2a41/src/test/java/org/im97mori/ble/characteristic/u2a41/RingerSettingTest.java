package org.im97mori.ble.characteristic.u2a41;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class RingerSettingTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = RingerSetting.RINGER_SETTING_SILENT;
        //@formatter:on

        RingerSetting result1 = new RingerSetting(data);
        assertEquals(RingerSetting.RINGER_SETTING_SILENT, result1.getRingerSetting());
        assertTrue(result1.isRingerSettingSilent());
        assertFalse(result1.isRingerSettingNormal());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = RingerSetting.RINGER_SETTING_NORMAL;
        //@formatter:on

        RingerSetting result1 = new RingerSetting(data);
        assertEquals(RingerSetting.RINGER_SETTING_NORMAL, result1.getRingerSetting());
        assertFalse(result1.isRingerSettingSilent());
        assertTrue(result1.isRingerSettingNormal());
    }

    @Test
    public void test_constructor003() {
        int ringerSetting = 1;

        RingerSetting result1 = new RingerSetting(ringerSetting);
        assertEquals(ringerSetting, result1.getRingerSetting());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = RingerSetting.RINGER_SETTING_SILENT;
        //@formatter:on

        RingerSetting result1 = new RingerSetting(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
