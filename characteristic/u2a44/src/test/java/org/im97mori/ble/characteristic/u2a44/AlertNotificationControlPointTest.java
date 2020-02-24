package org.im97mori.ble.characteristic.u2a44;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.characteristic.core.AlertCategoryIdUtils;
import org.junit.Test;

public class AlertNotificationControlPointTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_ENABLE_NEW_IMCOMING_ALERT_NOTIFICATION;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_SIMPLE_ALERT;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertEquals(AlertNotificationControlPoint.COMMAND_ID_ENABLE_NEW_IMCOMING_ALERT_NOTIFICATION, result1.getCommandId());
        assertTrue(result1.isCommandIdEnableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdEnableUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdDisableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdDisableeUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdNotifyNewIncomingAlertImmediately());
        assertFalse(result1.isCommandIdNotifyUnreadCategoryStatusImmediately());
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_SIMPLE_ALERT, result1.getCategoryId());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_ENABLE_UNREAD_CATEGORY_STATUS_NOTIFICATION;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_EMAIL;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertEquals(AlertNotificationControlPoint.COMMAND_ID_ENABLE_UNREAD_CATEGORY_STATUS_NOTIFICATION, result1.getCommandId());
        assertFalse(result1.isCommandIdEnableNewIncomingAlertNotification());
        assertTrue(result1.isCommandIdEnableUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdDisableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdDisableeUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdNotifyNewIncomingAlertImmediately());
        assertFalse(result1.isCommandIdNotifyUnreadCategoryStatusImmediately());
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_EMAIL, result1.getCategoryId());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_DISABLE_NEW_IMCOMING_ALERT_NOTIFICATION;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_NEWS;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertEquals(AlertNotificationControlPoint.COMMAND_ID_DISABLE_NEW_IMCOMING_ALERT_NOTIFICATION, result1.getCommandId());
        assertFalse(result1.isCommandIdEnableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdEnableUnreadCategoryStatusNotification());
        assertTrue(result1.isCommandIdDisableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdDisableeUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdNotifyNewIncomingAlertImmediately());
        assertFalse(result1.isCommandIdNotifyUnreadCategoryStatusImmediately());
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_NEWS, result1.getCategoryId());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_DISABLE_UNREAD_CATEGORY_STATUS_NOTIFICATION;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_CALL;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertEquals(AlertNotificationControlPoint.COMMAND_ID_DISABLE_UNREAD_CATEGORY_STATUS_NOTIFICATION, result1.getCommandId());
        assertFalse(result1.isCommandIdEnableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdEnableUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdDisableNewIncomingAlertNotification());
        assertTrue(result1.isCommandIdDisableeUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdNotifyNewIncomingAlertImmediately());
        assertFalse(result1.isCommandIdNotifyUnreadCategoryStatusImmediately());
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_CALL, result1.getCategoryId());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_NEW_INCOMING_ALERT_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_MISSED_CALL;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertEquals(AlertNotificationControlPoint.COMMAND_ID_NOTIFY_NEW_INCOMING_ALERT_IMMEDIATELY, result1.getCommandId());
        assertFalse(result1.isCommandIdEnableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdEnableUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdDisableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdDisableeUnreadCategoryStatusNotification());
        assertTrue(result1.isCommandIdNotifyNewIncomingAlertImmediately());
        assertFalse(result1.isCommandIdNotifyUnreadCategoryStatusImmediately());
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_MISSED_CALL, result1.getCategoryId());
    }

    @Test
    public void test_constructor006() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_SMS_MMS;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertEquals(AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY, result1.getCommandId());
        assertFalse(result1.isCommandIdEnableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdEnableUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdDisableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdDisableeUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdNotifyNewIncomingAlertImmediately());
        assertTrue(result1.isCommandIdNotifyUnreadCategoryStatusImmediately());
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_SMS_MMS, result1.getCategoryId());
    }

    @Test
    public void test_constructor007() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_VOICE_MAIL;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertEquals(AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY, result1.getCommandId());
        assertFalse(result1.isCommandIdEnableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdEnableUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdDisableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdDisableeUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdNotifyNewIncomingAlertImmediately());
        assertTrue(result1.isCommandIdNotifyUnreadCategoryStatusImmediately());
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_VOICE_MAIL, result1.getCategoryId());
    }

    @Test
    public void test_constructor008() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_SCHEDULE;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertEquals(AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY, result1.getCommandId());
        assertFalse(result1.isCommandIdEnableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdEnableUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdDisableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdDisableeUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdNotifyNewIncomingAlertImmediately());
        assertTrue(result1.isCommandIdNotifyUnreadCategoryStatusImmediately());
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_SCHEDULE, result1.getCategoryId());
    }

    @Test
    public void test_constructor009() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_HIGH_PRIORITIZED_ALERT;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertEquals(AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY, result1.getCommandId());
        assertFalse(result1.isCommandIdEnableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdEnableUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdDisableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdDisableeUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdNotifyNewIncomingAlertImmediately());
        assertTrue(result1.isCommandIdNotifyUnreadCategoryStatusImmediately());
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_HIGH_PRIORITIZED_ALERT, result1.getCategoryId());
    }

    @Test
    public void test_constructor010() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_INSTANT_MESSAGE;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertEquals(AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY, result1.getCommandId());
        assertFalse(result1.isCommandIdEnableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdEnableUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdDisableNewIncomingAlertNotification());
        assertFalse(result1.isCommandIdDisableeUnreadCategoryStatusNotification());
        assertFalse(result1.isCommandIdNotifyNewIncomingAlertImmediately());
        assertTrue(result1.isCommandIdNotifyUnreadCategoryStatusImmediately());
        assertEquals(AlertCategoryIdUtils.CATEGORY_ID_INSTANT_MESSAGE, result1.getCategoryId());
    }

    @Test
    public void test_parcelable101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_ENABLE_NEW_IMCOMING_ALERT_NOTIFICATION;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_SIMPLE_ALERT;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_ENABLE_UNREAD_CATEGORY_STATUS_NOTIFICATION;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_EMAIL;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_DISABLE_NEW_IMCOMING_ALERT_NOTIFICATION;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_NEWS;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable104() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_DISABLE_UNREAD_CATEGORY_STATUS_NOTIFICATION;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_CALL;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable105() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_NEW_INCOMING_ALERT_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_MISSED_CALL;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable106() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_SMS_MMS;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable107() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_VOICE_MAIL;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable108() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_SCHEDULE;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable109() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_NOTIFY_UNREAD_CATEGORY_STATUS_IMMEDIATELY;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_HIGH_PRIORITIZED_ALERT;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable110() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = AlertNotificationControlPoint.COMMAND_ID_ENABLE_UNREAD_CATEGORY_STATUS_NOTIFICATION;
        data[ 1] = AlertCategoryIdUtils.CATEGORY_ID_EMAIL;
        //@formatter:on

        AlertNotificationControlPoint result1 = new AlertNotificationControlPoint(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
