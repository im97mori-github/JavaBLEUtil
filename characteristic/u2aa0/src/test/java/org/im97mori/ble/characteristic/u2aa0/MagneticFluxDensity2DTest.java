package org.im97mori.ble.characteristic.u2aa0;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class MagneticFluxDensity2DTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data_00001 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        MagneticFluxDensity2D result1 = new MagneticFluxDensity2D(data);
        assertEquals(0x0201, result1.getMagneticFluxDensityXAxis());
        assertEquals(MagneticFluxDensity2D.MAGNETIC_FLUX_DENSITY_X_AXIS_RESOLUTION * 0x0201, result1.getMagneticFluxDensityXAxisTesla(), 0);
        assertEquals(0x0403, result1.getMagneticFluxDensityYAxis());
        assertEquals(MagneticFluxDensity2D.MAGNETIC_FLUX_DENSITY_Y_AXIS_RESOLUTION * 0x0403, result1.getMagneticFluxDensityYAxisTesla(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int magneticFluxDensityXAxis = 1;
        int magneticFluxDensityYAxis = 2;

        MagneticFluxDensity2D result1 = new MagneticFluxDensity2D(magneticFluxDensityXAxis, magneticFluxDensityYAxis);
        assertEquals(magneticFluxDensityXAxis, result1.getMagneticFluxDensityXAxis());
        assertEquals(magneticFluxDensityYAxis, result1.getMagneticFluxDensityYAxis());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        MagneticFluxDensity2D result1 = new MagneticFluxDensity2D(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
