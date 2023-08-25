package org.im97mori.ble.characteristic.u2a31;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class ScanRefreshTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = ScanRefresh.SCAN_REFRESH_VALUE_SERVER_REQUIRES_REFRESH;
        data_00001 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        ScanRefresh result1 = new ScanRefresh(data);
        assertEquals(ScanRefresh.SCAN_REFRESH_VALUE_SERVER_REQUIRES_REFRESH, result1.getScanRefreshValue());
        assertTrue(result1.isScanRefreshValueServerRequiresRefresh());
    }

    @Test
    public void test_constructor_00002() {
        int scanRefreshValue = 1;

        ScanRefresh result1 = new ScanRefresh(scanRefreshValue);
        assertEquals(scanRefreshValue, result1.getScanRefreshValue());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        ScanRefresh result1 = new ScanRefresh(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
