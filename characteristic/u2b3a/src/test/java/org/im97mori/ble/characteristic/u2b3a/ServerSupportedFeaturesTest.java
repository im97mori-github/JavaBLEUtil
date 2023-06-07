package org.im97mori.ble.characteristic.u2b3a;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ServerSupportedFeaturesTest extends TestBase {

    //@formatter:off
    @SuppressWarnings("unused")
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[0] = 0;
        data_00001 = data;
    }

    @SuppressWarnings("unused")
    private static final byte[] data_00002;
    static {
        byte[] data = new byte[1];
        data[0] = 1;
        data_00002 = data;
    }
    //@formatter:on

    @Test
    public void test_constructor_1_00001() {
        byte[] data = getData();

        ServerSupportedFeatures result1 = new ServerSupportedFeatures(data);
        assertEquals(1, result1.getServerSupportedFeaturesList().size());
        assertEquals(0b00000000, result1.getServerSupportedFeaturesList().get(0).intValue());
        assertFalse(result1.isEattSupported());
    }

    @Test
    public void test_constructor_1_00002() {
        byte[] data = getData();

        ServerSupportedFeatures result1 = new ServerSupportedFeatures(data);
        assertEquals(1, result1.getServerSupportedFeaturesList().size());
        assertEquals(0b00000001, result1.getServerSupportedFeaturesList().get(0).intValue());
        assertTrue(result1.isEattSupported());
    }

    @Test
    public void test_constructor_2_00001() {
        byte[] data = getData();

        List<Integer> serverSupportedFeaturesList = new ArrayList<>();
        for (byte octet : data) {
            serverSupportedFeaturesList.add(octet & 0xff);
        }
        ServerSupportedFeatures result1 = new ServerSupportedFeatures(serverSupportedFeaturesList);
        assertEquals(1, result1.getServerSupportedFeaturesList().size());
        assertEquals(0b00000000, result1.getServerSupportedFeaturesList().get(0).intValue());
        assertFalse(result1.isEattSupported());
    }

    @Test
    public void test_constructor_2_00002() {
        byte[] data = getData();

        List<Integer> serverSupportedFeaturesList = new ArrayList<>();
        for (byte octet : data) {
            serverSupportedFeaturesList.add(octet & 0xff);
        }
        ServerSupportedFeatures result1 = new ServerSupportedFeatures(serverSupportedFeaturesList);
        assertEquals(1, result1.getServerSupportedFeaturesList().size());
        assertEquals(0b00000001, result1.getServerSupportedFeaturesList().get(0).intValue());
        assertTrue(result1.isEattSupported());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ServerSupportedFeatures result1 = new ServerSupportedFeatures(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        ServerSupportedFeatures result1 = new ServerSupportedFeatures(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
