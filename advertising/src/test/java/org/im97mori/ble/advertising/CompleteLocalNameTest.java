package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.COMPLETE_LOCAL_NAME_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class CompleteLocalNameTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        String name = "complete local name";
        byte[] utf8data = name.getBytes();
        byte[] data = new byte[utf8data.length + 2];
        data[0] = (byte) (utf8data.length + 1);
        data[1] = COMPLETE_LOCAL_NAME_DATA_TYPE;
        System.arraycopy(utf8data, 0, data, 2, utf8data.length);
        data_00001 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		CompleteLocalName result1 = new CompleteLocalName(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(COMPLETE_LOCAL_NAME_DATA_TYPE, result1.getDataType());
		assertEquals(new String(data, 2, data.length - 2), result1.getCompleteLocalName());
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		CompleteLocalName result1 = new CompleteLocalName(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(COMPLETE_LOCAL_NAME_DATA_TYPE, result1.getDataType());
		assertEquals(new String(data, 2, data.length - 2), result1.getCompleteLocalName());
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		CompleteLocalName result1 = new CompleteLocalName(new String(data, 2, data.length - 2));
		assertEquals(data[0], result1.getLength());
		assertEquals(COMPLETE_LOCAL_NAME_DATA_TYPE, result1.getDataType());
		assertEquals(new String(data, 2, data.length - 2), result1.getCompleteLocalName());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		CompleteLocalName result1 = new CompleteLocalName(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

}
