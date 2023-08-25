package org.im97mori.ble.characteristic.u2a43;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.core.AlertCategoryIdUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class AlertCategoryIdTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdUtils.CATEGORY_ID_SIMPLE_ALERT;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_SIMPLE_ALERT, result1.getCategoryId());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdUtils.CATEGORY_ID_EMAIL;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_EMAIL, result1.getCategoryId());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdUtils.CATEGORY_ID_NEWS;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_NEWS, result1.getCategoryId());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdUtils.CATEGORY_ID_CALL;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_CALL, result1.getCategoryId());
    }

    @Test
    public void test_constructor_00005() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdUtils.CATEGORY_ID_MISSED_CALL;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_MISSED_CALL, result1.getCategoryId());
    }

    @Test
    public void test_constructor_00006() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdUtils.CATEGORY_ID_SMS_MMS;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_SMS_MMS, result1.getCategoryId());
    }

    @Test
    public void test_constructor_00007() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdUtils.CATEGORY_ID_VOICE_MAIL;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_VOICE_MAIL, result1.getCategoryId());
    }

    @Test
    public void test_constructor_00008() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdUtils.CATEGORY_ID_SCHEDULE;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_SCHEDULE, result1.getCategoryId());
    }

    @Test
    public void test_constructor_00009() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdUtils.CATEGORY_ID_HIGH_PRIORITIZED_ALERT;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_HIGH_PRIORITIZED_ALERT, result1.getCategoryId());
    }

    @Test
    public void test_constructor_00010() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) AlertCategoryIdUtils.CATEGORY_ID_INSTANT_MESSAGE;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_INSTANT_MESSAGE, result1.getCategoryId());
    }

    @Test
    public void test_constructor_00101() {
        int categoryId = 0x01;

        AlertCategoryId result1 = new AlertCategoryId(categoryId);
        assertEquals(categoryId, result1.getCategoryId());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        AlertCategoryId result1 = new AlertCategoryId(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
