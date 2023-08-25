package org.im97mori.ble.characteristic.u2ac3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ObjectIdTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT;
        data[ 1] = (byte) (ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT >> 8);
        data[ 2] = (byte) (ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT >> 16);
        data[ 3] = (byte) (ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT >> 24);
        data[ 4] = (byte) (ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT >> 32);
        data[ 5] = (byte) (ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT >> 40);
        //@formatter:on

        ObjectId result1 = new ObjectId(data);
        assertEquals(BLEUtils.createUInt48(data, 0), result1.getObjectId());
        assertTrue(result1.isObjectIdDirectoryListingObject());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 0x000000000100;
        data[ 1] = (byte) (0x000000000100 >> 8);
        data[ 2] = (byte) (0x000000000100 >> 16);
        data[ 3] = (byte) (0x000000000100 >> 24);
        data[ 4] = (byte) (0x000000000100 >> 32);
        data[ 5] = (byte) (0x000000000100 >> 40);
        //@formatter:on

        ObjectId result1 = new ObjectId(data);
        assertEquals(BLEUtils.createUInt48(data, 0), result1.getObjectId());
        assertFalse(result1.isObjectIdDirectoryListingObject());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 0xFFFFFFFFFFFFL ;
        data[ 1] = (byte) (0xFFFFFFFFFFFFL  >> 8);
        data[ 2] = (byte) (0xFFFFFFFFFFFFL  >> 16);
        data[ 3] = (byte) (0xFFFFFFFFFFFFL  >> 24);
        data[ 4] = (byte) (0xFFFFFFFFFFFFL  >> 32);
        data[ 5] = (byte) (0xFFFFFFFFFFFFL  >> 40);
        //@formatter:on

        ObjectId result1 = new ObjectId(data);
        assertEquals(BLEUtils.createUInt48(data, 0), result1.getObjectId());
        assertFalse(result1.isObjectIdDirectoryListingObject());
    }

    @Test
    public void test_constructor_00101() {
        long objectId = ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT;

        ObjectId result1 = new ObjectId(objectId);
        assertEquals(objectId, result1.getObjectId());
    }

    @Test
    public void test_constructor_00102() {
        long objectId = 0x000000000100;

        ObjectId result1 = new ObjectId(objectId);
        assertEquals(objectId, result1.getObjectId());
    }

    @Test
    public void test_constructor_00103() {
        long objectId = 0xFFFFFFFFFFFFL;

        ObjectId result1 = new ObjectId(objectId);
        assertEquals(objectId, result1.getObjectId());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT;
        data[ 1] = (byte) (ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT >> 8);
        data[ 2] = (byte) (ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT >> 16);
        data[ 3] = (byte) (ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT >> 24);
        data[ 4] = (byte) (ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT >> 32);
        data[ 5] = (byte) (ObjectId.OBJECT_ID_DIRECTORY_LISTING_OBJECT >> 40);
        //@formatter:on

        ObjectId result1 = new ObjectId(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 0x000000000100;
        data[ 1] = (byte) (0x000000000100 >> 8);
        data[ 2] = (byte) (0x000000000100 >> 16);
        data[ 3] = (byte) (0x000000000100 >> 24);
        data[ 4] = (byte) (0x000000000100 >> 32);
        data[ 5] = (byte) (0x000000000100 >> 40);
        //@formatter:on

        ObjectId result1 = new ObjectId(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) 0xFFFFFFFFFFFFL ;
        data[ 1] = (byte) (0xFFFFFFFFFFFFL  >> 8);
        data[ 2] = (byte) (0xFFFFFFFFFFFFL  >> 16);
        data[ 3] = (byte) (0xFFFFFFFFFFFFL  >> 24);
        data[ 4] = (byte) (0xFFFFFFFFFFFFL  >> 32);
        data[ 5] = (byte) (0xFFFFFFFFFFFFL  >> 40);
        //@formatter:on

        ObjectId result1 = new ObjectId(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
