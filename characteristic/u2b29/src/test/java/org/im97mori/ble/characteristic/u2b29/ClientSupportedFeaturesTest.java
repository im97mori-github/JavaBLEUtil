package org.im97mori.ble.characteristic.u2b29;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ClientSupportedFeaturesTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET + 1];
        data[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET] = ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_BIT;
        //@formatter:on

        ClientSupportedFeatures result1 = new ClientSupportedFeatures(data);
        assertArrayEquals(data, result1.getClientFeatures());
        assertTrue(result1.isClientFeatresRobustCachingSuppreted());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET + 1];
        data[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET] = (byte) 0xff;
        //@formatter:on

        ClientSupportedFeatures result1 = new ClientSupportedFeatures(data);
        assertArrayEquals(data, result1.getClientFeatures());
        assertTrue(result1.isClientFeatresRobustCachingSuppreted());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET + 1];
        data[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET] = ~ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_BIT;
        //@formatter:on

        ClientSupportedFeatures result1 = new ClientSupportedFeatures(data);
        assertArrayEquals(data, result1.getClientFeatures());
        assertFalse(result1.isClientFeatresRobustCachingSuppreted());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] data = new byte[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET + 2];
        data[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET] = ~ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_BIT;
        data[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET + 1] = ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_BIT;
        //@formatter:on

        ClientSupportedFeatures result1 = new ClientSupportedFeatures(data);
        assertArrayEquals(data, result1.getClientFeatures());
        assertFalse(result1.isClientFeatresRobustCachingSuppreted());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET + 1];
        data[ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_OCTET] = ~ClientSupportedFeatures.CLIENT_FEATYRES_ROBUST_CACHING_BIT;
        //@formatter:on

        ClientSupportedFeatures result1 = new ClientSupportedFeatures(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
