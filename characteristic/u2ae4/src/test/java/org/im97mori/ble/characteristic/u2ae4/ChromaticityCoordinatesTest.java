package org.im97mori.ble.characteristic.u2ae4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ChromaticityCoordinatesTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        ChromaticityCoordinates result = new ChromaticityCoordinates(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getChromaticityXCoordinate());
        assertEquals(BLEUtils.createUInt16(data, 2), result.getChromaticityYCoordinate());
    }

    @Test
    public void test_constructor_00101() {
        int chromaticityXCoordinate = 1;
        int chromaticityYCoordinate = 2;

        ChromaticityCoordinates result = new ChromaticityCoordinates(chromaticityXCoordinate, chromaticityYCoordinate);
        assertEquals(chromaticityXCoordinate, result.getChromaticityXCoordinate());
        assertEquals(chromaticityYCoordinate, result.getChromaticityYCoordinate());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        ChromaticityCoordinates result1 = new ChromaticityCoordinates(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
