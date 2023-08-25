package org.im97mori.ble.characteristic.u2ae3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ChromaticDistanceFromPlanckianTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        ChromaticDistanceFromPlanckian result = new ChromaticDistanceFromPlanckian(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getDistanceFromPlanckian());
    }

    @Test
    public void test_constructor_00101() {
        int distanceFromPlanckian = 1;

        ChromaticDistanceFromPlanckian result = new ChromaticDistanceFromPlanckian(distanceFromPlanckian);
        assertEquals(distanceFromPlanckian, result.getDistanceFromPlanckian());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        ChromaticDistanceFromPlanckian result1 = new ChromaticDistanceFromPlanckian(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
