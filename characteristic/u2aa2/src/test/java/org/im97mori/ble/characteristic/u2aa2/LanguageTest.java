package org.im97mori.ble.characteristic.u2aa2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class LanguageTest extends TestBase {

    @Test
    public void test_constructor001() {
        String languageCode = "ja";

        Language result1 = new Language(languageCode.getBytes());
        assertEquals(languageCode, result1.getLanguage());
    }

    @Test
    public void test_constructor002() {
        String languageCode = "ab";

        Language result1 = new Language(languageCode.getBytes());
        assertEquals(languageCode, result1.getLanguage());
    }

    @Test
    public void test_constructor003() {
        String languageCode = "ab";

        Language result1 = new Language(languageCode);
        assertEquals(languageCode, result1.getLanguage());
    }

    @Test
    public void test_parcelable003() {
        String languageCode = "ab";

        Language result1 = new Language(languageCode.getBytes());
        byte[] resultData = result1.getBytes();
        assertArrayEquals(languageCode.getBytes(), resultData);
    }

}
