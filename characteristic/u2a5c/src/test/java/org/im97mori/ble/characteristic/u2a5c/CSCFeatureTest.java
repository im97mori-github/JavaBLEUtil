package org.im97mori.ble.characteristic.u2a5c;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class CSCFeatureTest extends TestBase {

    //@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        int flag = CSCFeature.CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_FALSE
                | CSCFeature.CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_FALSE
        | CSCFeature.CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE;
        data[ 0] = (byte) flag;
        data[ 1] = (byte) (flag >> 8);
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        int flag = CSCFeature.CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_TRUE
                | CSCFeature.CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_FALSE
                | CSCFeature.CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE;
        data[ 0] = (byte) flag;
        data[ 1] = (byte) (flag >> 8);
        data_00002 = data;
    }

    private static final byte[] data_00101;
    static {
        byte[] data = new byte[2];
        int flag = CSCFeature.CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_FALSE
                | CSCFeature.CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_FALSE
                | CSCFeature.CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE;
        data[ 0] = (byte) flag;
        data[ 1] = (byte) (flag >> 8);
        data_00101 = data;
    }

    private static final byte[] data_00102;
    static {
        byte[] data = new byte[2];
        int flag = CSCFeature.CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_FALSE
                | CSCFeature.CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_TRUE
                | CSCFeature.CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE;
        data[ 0] = (byte) flag;
        data[ 1] = (byte) (flag >> 8);
        data_00102 = data;
    }

    private static final byte[] data_00201;
    static {
        byte[] data = new byte[2];
        int flag = CSCFeature.CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_FALSE
                | CSCFeature.CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_FALSE
                | CSCFeature.CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE;
        data[ 0] = (byte) flag;
        data[ 1] = (byte) (flag >> 8);
        data_00201 = data;
    }

    private static final byte[] data_00202;
    static {
        byte[] data = new byte[2];
        int flag = CSCFeature.CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_FALSE
                | CSCFeature.CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_FALSE
                | CSCFeature.CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_TRUE;
        data[ 0] = (byte) flag;
        data[ 1] = (byte) (flag >> 8);
        data_00202 = data;
    }
    //@formatter:on


    @Test
    public void test_constructor_00001() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getCscFeature());
        assertTrue(result1.isCscFeatureWheelRevolutionDataNotSupported());
        assertFalse(result1.isCscFeatureWheelRevolutionDataSupported());
    }

    @Test
    public void test_constructor_00002() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getCscFeature());
        assertFalse(result1.isCscFeatureWheelRevolutionDataNotSupported());
        assertTrue(result1.isCscFeatureWheelRevolutionDataSupported());
    }

    @Test
    public void test_constructor_00101() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getCscFeature());
        assertTrue(result1.isCscFeatureCrankRevolutionDataSupportedNotSupported());
        assertFalse(result1.isCscFeatureCrankRevolutionDataSupportedSupported());
    }

    @Test
    public void test_constructor_00102() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getCscFeature());
        assertFalse(result1.isCscFeatureCrankRevolutionDataSupportedNotSupported());
        assertTrue(result1.isCscFeatureCrankRevolutionDataSupportedSupported());
    }

    @Test
    public void test_constructor_00201() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getCscFeature());
        assertTrue(result1.isCscFeatureMultipleSensorLocationsSupportedNotSupported());
        assertFalse(result1.isCscFeatureMultipleSensorLocationsSupportedSupported());
    }

    @Test
    public void test_constructor_00202() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getCscFeature());
        assertFalse(result1.isCscFeatureMultipleSensorLocationsSupportedNotSupported());
        assertTrue(result1.isCscFeatureMultipleSensorLocationsSupportedSupported());
    }

    @Test
    public void test_parcelable_2_00001() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00002() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00101() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00102() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00201() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_2_00202() {
        byte[] data = getData();

        CSCFeature result1 = new CSCFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
