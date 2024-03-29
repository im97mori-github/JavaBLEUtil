package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.URI_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.net.URI;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.constants.Scheme;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class UniformResourceIdentifierTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        // http scheme
        byte[] schemedata = Scheme.HTTP_SCHEME.toString().getBytes();
        String body = "//im97mori.org/";

        byte[] utf8data = body.getBytes();
        byte[] data = new byte[utf8data.length + 2 + schemedata.length];
        data[0] = (byte) (utf8data.length + schemedata.length + 1);
        data[1] = URI_DATA_TYPE;
        System.arraycopy(schemedata, 0, data, 2, schemedata.length);
        System.arraycopy(utf8data, 0, data, 2 + schemedata.length, utf8data.length);
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        // example scheme
        byte[] schemedata = Scheme.EXAMPLE_SCHEME.toString().getBytes();
        String body = "//im97mori.org/";

        byte[] utf8data = body.getBytes();
        byte[] data = new byte[utf8data.length + 2 + schemedata.length];
        data[0] = (byte) (utf8data.length + schemedata.length + 1);
        data[1] = URI_DATA_TYPE;
        System.arraycopy(schemedata, 0, data, 2, schemedata.length);
        System.arraycopy(utf8data, 0, data, 2 + schemedata.length, utf8data.length);
        data_00002 = data;
    }

	private static final byte[] data_00003;
    static {
        // example scheme
        byte[] schemedata = Scheme.EMPTY_SCHEME_NAME_SCHEME.toString().getBytes();
        String body = "empty://im97mori.org/";

        byte[] utf8data = body.getBytes();
        byte[] data = new byte[utf8data.length + 2 + schemedata.length];
        data[0] = (byte) (utf8data.length + schemedata.length + 1);
        data[1] = URI_DATA_TYPE;
        System.arraycopy(schemedata, 0, data, 2, schemedata.length);
        System.arraycopy(utf8data, 0, data, 2 + schemedata.length, utf8data.length);
        data_00003 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(URI_DATA_TYPE, result1.getDataType());
		assertEquals(Scheme.HTTP_SCHEME.charValue(), result1.getScheme());
		assertEquals(new String(data, 3, data.length - 3), result1.getUriString());
		assertEquals(URI.create("http://im97mori.org/"), result1.getUri());
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(URI_DATA_TYPE, result1.getDataType());
		assertEquals(Scheme.EXAMPLE_SCHEME.charValue(), result1.getScheme());
		assertEquals(new String(data, 4, data.length - 4), result1.getUriString());
		assertEquals(URI.create("example://im97mori.org/"), result1.getUri());
	}

	@Test
	public void test_constructor_1_00003() {
		byte[] data = getData();

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(data, 0, data[0]);
		assertEquals(data[0], result1.getLength());
		assertEquals(URI_DATA_TYPE, result1.getDataType());
		assertEquals(Scheme.EMPTY_SCHEME_NAME_SCHEME.charValue(), result1.getScheme());
		assertEquals("//im97mori.org/", result1.getUriString());
		assertEquals(URI.create("empty://im97mori.org/"), result1.getUri());
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(URI_DATA_TYPE, result1.getDataType());
		assertEquals(Scheme.HTTP_SCHEME.charValue(), result1.getScheme());
		assertEquals(new String(data, 3, data.length - 3), result1.getUriString());
		assertEquals(URI.create("http://im97mori.org/"), result1.getUri());
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(URI_DATA_TYPE, result1.getDataType());
		assertEquals(Scheme.EXAMPLE_SCHEME.charValue(), result1.getScheme());
		assertEquals(new String(data, 4, data.length - 4), result1.getUriString());
		assertEquals(URI.create("example://im97mori.org/"), result1.getUri());
	}

	@Test
	public void test_constructor_2_00003() {
		byte[] data = getData();

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(data, 0);
		assertEquals(data[0], result1.getLength());
		assertEquals(URI_DATA_TYPE, result1.getDataType());
		assertEquals(Scheme.EMPTY_SCHEME_NAME_SCHEME.charValue(), result1.getScheme());
		assertEquals("//im97mori.org/", result1.getUriString());
		assertEquals(URI.create("empty://im97mori.org/"), result1.getUri());
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		String allString = new String(data, 2, data[0] - 1);

		char scheme = allString.charAt(0);
		String uriString = allString.substring(1);

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(scheme, uriString);
		assertEquals(data[0], result1.getLength());
		assertEquals(URI_DATA_TYPE, result1.getDataType());
		assertEquals(Scheme.HTTP_SCHEME.charValue(), result1.getScheme());
		assertEquals(new String(data, 3, data.length - 3), result1.getUriString());
		assertEquals(URI.create("http://im97mori.org/"), result1.getUri());
	}

	@Test
	public void test_constructor_3_00002() {
		byte[] data = getData();

		String allString = new String(data, 2, data[0] - 1);

		char scheme = allString.charAt(0);
		String uriString = allString.substring(1);

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(scheme, uriString);
		assertEquals(data[0], result1.getLength());
		assertEquals(URI_DATA_TYPE, result1.getDataType());
		assertEquals(Scheme.EXAMPLE_SCHEME.charValue(), result1.getScheme());
		assertEquals(new String(data, 4, data.length - 4), result1.getUriString());
		assertEquals(URI.create("example://im97mori.org/"), result1.getUri());
	}

	@Test
	public void test_constructor_3_00003() {
		byte[] data = getData();

		String allString = new String(data, 2, data[0] - 1);

		char scheme = allString.charAt(0);
		String uriString = allString.substring(1);

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(scheme, uriString);
		assertEquals(data[0], result1.getLength());
		assertEquals(URI_DATA_TYPE, result1.getDataType());
		assertEquals(Scheme.EMPTY_SCHEME_NAME_SCHEME.charValue(), result1.getScheme());
		assertEquals("//im97mori.org/", result1.getUriString());
		assertEquals(URI.create("empty://im97mori.org/"), result1.getUri());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		UniformResourceIdentifier result1 = new UniformResourceIdentifier(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}
}
