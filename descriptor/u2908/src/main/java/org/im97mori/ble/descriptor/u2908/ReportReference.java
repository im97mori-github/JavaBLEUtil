package org.im97mori.ble.descriptor.u2908;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Report Reference (Descriptor UUID: 0x2908)
 */
public class ReportReference implements ByteArrayInterface {

    /**
     * Report Type:Input Report
     */
    public static final int REPORT_TYPE_INPUT_REPORT = 0x01;

    /**
     * Report Type:Output Report
     */
    public static final int REPORT_TYPE_OUTPUT_REPORT = 0x02;

    /**
     * Report Type:Feature Report
     */
    public static final int REPORT_TYPE_FEATURE_REPORT = 0x03;

    /**
     * Report ID
     */
    private final int mReportId;

    /**
     * Report Type
     */
    private final int mReportType;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
     */
    public ReportReference(@NonNull byte[] values) {
        mReportId = (values[0] & 0xff);
        mReportType = (values[1] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param reportId   Report ID
     * @param reportType Report Type
     */
    public ReportReference(int reportId, int reportType) {
        mReportId = reportId;
        mReportType = reportType;
    }

    /**
     * @return Report ID
     */
    public int getReportId() {
        return mReportId;
    }

    /**
     * @return Report Type
     */
    public int getReportType() {
        return mReportType;
    }

    /**
     * @return {@code true}:report type is {@link #REPORT_TYPE_INPUT_REPORT}, {@code false}:not {@link #REPORT_TYPE_INPUT_REPORT}
     */
    public boolean isReportTypeInputReport() {
        return REPORT_TYPE_INPUT_REPORT == mReportType;
    }

    /**
     * @return {@code true}:report type is {@link #REPORT_TYPE_OUTPUT_REPORT}, {@code false}:not {@link #REPORT_TYPE_OUTPUT_REPORT}
     */
    public boolean isReportTypeOutputReport() {
        return REPORT_TYPE_OUTPUT_REPORT == mReportType;
    }

    /**
     * @return {@code true}:report type is {@link #REPORT_TYPE_FEATURE_REPORT}, {@code false}:not {@link #REPORT_TYPE_FEATURE_REPORT}
     */
    public boolean isReportTypeFeatureReport() {
        return REPORT_TYPE_FEATURE_REPORT == mReportType;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mReportId);
        byteBuffer.put((byte) mReportType);
        return data;
    }

}
