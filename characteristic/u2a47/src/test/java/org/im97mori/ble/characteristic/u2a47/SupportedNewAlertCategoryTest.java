package org.im97mori.ble.characteristic.u2a47;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.characteristic.core.AlertCategoryIdBitMaskUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class SupportedNewAlertCategoryTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags1;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data);
        assertEquals(flags1, result1.getCategoryIdBitMask0());
        assertFalse(result1.hasCategoryIdBitMask1());
        assertEquals(0, result1.getCategoryIdBitMask1());
    }

    @Test
    public void test_constructor_00002() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags1;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data);
        assertEquals(flags1, result1.getCategoryIdBitMask0());
        assertFalse(result1.hasCategoryIdBitMask1());
        assertEquals(0, result1.getCategoryIdBitMask1());
    }

    @Test
    public void test_constructor_00101() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        int flags2 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_HIGH_PRIORITIZED_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_INSTANT_MESSAGE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags1;
        data[ 1] = (byte) flags2;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data);
        assertEquals(flags1, result1.getCategoryIdBitMask0());
        assertTrue(result1.hasCategoryIdBitMask1());
        assertEquals(flags2, result1.getCategoryIdBitMask1());
    }

    @Test
    public void test_constructor_00102() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        int flags2 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_HIGH_PRIORITIZED_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_INSTANT_MESSAGE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags1;
        data[ 1] = (byte) flags2;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data);
        assertEquals(flags1, result1.getCategoryIdBitMask0());
        assertTrue(result1.hasCategoryIdBitMask1());
        assertEquals(flags2, result1.getCategoryIdBitMask1());
    }

    @Test
    public void test_constructor_00201() {
        int categoryIdBitMask0 = 1;

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(categoryIdBitMask0);
        assertEquals(categoryIdBitMask0, result1.getCategoryIdBitMask0());
        assertFalse(result1.hasCategoryIdBitMask1());
        assertEquals(0, result1.getCategoryIdBitMask1());
    }

    @Test
    public void test_constructor_00301() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        int flags2 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_HIGH_PRIORITIZED_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_INSTANT_MESSAGE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags1;
        data[ 1] = (byte) flags2;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data[0], data[1]);
        assertEquals(data[0], result1.getCategoryIdBitMask0());
        assertTrue(result1.hasCategoryIdBitMask1());
        assertEquals(data[1], result1.getCategoryIdBitMask1());
    }

    @Test
    public void test_constructor_00401() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        int flags2 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_HIGH_PRIORITIZED_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_INSTANT_MESSAGE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags1;
        data[ 1] = (byte) flags2;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data[0], false, data[1]);
        assertEquals(data[0], result1.getCategoryIdBitMask0());
        assertFalse(result1.hasCategoryIdBitMask1());
        assertEquals(0, result1.getCategoryIdBitMask1());
    }

    @Test
    public void test_constructor_00402() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        int flags2 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_HIGH_PRIORITIZED_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_INSTANT_MESSAGE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags1;
        data[ 1] = (byte) flags2;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data[0], true, data[1]);
        assertEquals(data[0], result1.getCategoryIdBitMask0());
        assertTrue(result1.hasCategoryIdBitMask1());
        assertEquals(data[1], result1.getCategoryIdBitMask1());
    }

    @Test
    public void test_parcelable_00101() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags1;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) flags1;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        int flags2 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_HIGH_PRIORITIZED_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_INSTANT_MESSAGE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags1;
        data[ 1] = (byte) flags2;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        int flags1 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_NOT_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_NOT_SUPPORTED;
        int flags2 = AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_HIGH_PRIORITIZED_SUPPORTED
                | AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_INSTANT_MESSAGE_NOT_SUPPORTED;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags1;
        data[ 1] = (byte) flags2;
        //@formatter:on

        SupportedNewAlertCategory result1 = new SupportedNewAlertCategory(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
