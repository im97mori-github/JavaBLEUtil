package org.im97mori.ble.characteristic.u2aa1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings({ "unused" })
public class MagneticFluxDensity3DTest {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[6];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data_00001 = data;
    }
    //@formatter:on

    private byte[] getData() {
        int index = -1;
        byte[] data = null;

        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTraceElementArray.length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArray[i];
            if ("getData".equals(stackTraceElement.getMethodName())) {
                index = i + 1;
                break;
            }
        }
        if (index >= 0 && index < stackTraceElementArray.length) {
            StackTraceElement stackTraceElement = stackTraceElementArray[index];
            String[] splitted = stackTraceElement.getMethodName().split("_");
            try {
                data = (byte[]) this.getClass().getDeclaredField("data_" + splitted[splitted.length - 1]).get(null);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        MagneticFluxDensity3D result1 = new MagneticFluxDensity3D(data);
        assertEquals(0x0201, result1.getMagneticFluxDensityXAxis());
        assertEquals(MagneticFluxDensity3D.MAGNETIC_FLUX_DENSITY_X_AXIS_RESOLUTION * 0x0201, result1.getMagneticFluxDensityXAxisTesla(), 0);
        assertEquals(0x0403, result1.getMagneticFluxDensityYAxis());
        assertEquals(MagneticFluxDensity3D.MAGNETIC_FLUX_DENSITY_Y_AXIS_RESOLUTION * 0x0403, result1.getMagneticFluxDensityYAxisTesla(), 0);
        assertEquals(0x0605, result1.getMagneticFluxDensityZAxis());
        assertEquals(MagneticFluxDensity3D.MAGNETIC_FLUX_DENSITY_Z_AXIS_RESOLUTION * 0x0605, result1.getMagneticFluxDensityZAxisTesla(), 0);
    }

    @Test
    public void test_constructor_00002() {
        int magneticFluxDensityXAxis = 1;
        int magneticFluxDensityYAxis = 2;
        int magneticFluxDensityZAxis = 3;

        MagneticFluxDensity3D result1 = new MagneticFluxDensity3D(magneticFluxDensityXAxis, magneticFluxDensityYAxis, magneticFluxDensityZAxis);
        assertEquals(magneticFluxDensityXAxis, result1.getMagneticFluxDensityXAxis());
        assertEquals(magneticFluxDensityYAxis, result1.getMagneticFluxDensityYAxis());
        assertEquals(magneticFluxDensityZAxis, result1.getMagneticFluxDensityZAxis());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        MagneticFluxDensity3D result1 = new MagneticFluxDensity3D(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
