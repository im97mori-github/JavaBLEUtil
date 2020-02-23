package org.im97mori.ble.characteristic.u2a47;

import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.core.AlertCategoryIdBitMaskUtils;
import org.junit.Test;

public class SupportedNewAlertCategoryTest {

    @Test
    public void test_constructor001() {
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
    }

    @Test
    public void test_constructor002() {
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
    }

    @Test
    public void test_constructor101() {
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
        assertEquals(flags2, result1.getCategoryIdBitMask1());
    }

    @Test
    public void test_constructor102() {
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
        assertEquals(flags2, result1.getCategoryIdBitMask1());
    }

}
