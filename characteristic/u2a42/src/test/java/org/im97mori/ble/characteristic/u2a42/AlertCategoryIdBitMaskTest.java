package org.im97mori.ble.characteristic.u2a42;

import static org.junit.Assert.assertArrayEquals;

import org.im97mori.ble.characteristic.core.AlertCategoryIdBitMaskUtils;
import org.junit.Test;

public class AlertCategoryIdBitMaskTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SIMPLE_ALERT_SUPPORTED;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getCategoryIdBitMask());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_EMAIL_SUPPORTED;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getCategoryIdBitMask());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_NEWS_SUPPORTED;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getCategoryIdBitMask());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_CALL_SUPPORTED;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getCategoryIdBitMask());
    }

    @Test
    public void test_constructor_00005() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_MISSED_CALL_SUPPORTED;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getCategoryIdBitMask());
    }

    @Test
    public void test_constructor_00006() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SMS_MMS_SUPPORTED;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getCategoryIdBitMask());
    }

    @Test
    public void test_constructor_00007() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_VOICE_MAIL_SUPPORTED;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getCategoryIdBitMask());
    }

    @Test
    public void test_constructor_00008() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_0_SCHEDULE_SUPPORTED;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getCategoryIdBitMask());
    }

    @Test
    public void test_constructor_00009() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x00;
        data[ 1] = (byte) AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_HIGH_PRIORITIZED_SUPPORTED;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getCategoryIdBitMask());
    }

    @Test
    public void test_constructor_00010() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x00;
        data[ 1] = (byte) AlertCategoryIdBitMaskUtils.CATEGORY_ID_BIT_MASK_1_INSTANT_MESSAGE_SUPPORTED;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getCategoryIdBitMask());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        AlertCategoryIdBitMask result1 = new AlertCategoryIdBitMask(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
