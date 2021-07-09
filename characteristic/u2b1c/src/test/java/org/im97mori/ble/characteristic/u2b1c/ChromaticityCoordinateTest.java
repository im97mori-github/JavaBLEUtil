package org.im97mori.ble.characteristic.u2b1c;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

public class ChromaticityCoordinateTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        ChromaticityCoordinate result = new ChromaticityCoordinate(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getChromaticityCoordinate());
    }

    @Test
    public void test_constructor_00101() {
        int chromaticityCoordinate = 1;

        ChromaticityCoordinate result = new ChromaticityCoordinate(chromaticityCoordinate);
        assertEquals(chromaticityCoordinate, result.getChromaticityCoordinate());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        ChromaticityCoordinate result1 = new ChromaticityCoordinate(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
