package org.im97mori.ble.characteristic.u2a8c;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GenderTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = Gender.GENDER_MALE;
        //@formatter:on

        Gender result1 = new Gender(data);
        assertEquals(Gender.GENDER_MALE, result1.getGender());
        assertTrue(result1.isGenderMale());
        assertFalse(result1.isGenderFemale());
        assertFalse(result1.isGenderUnspecified());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = Gender.GENDER_FEMALE;
        //@formatter:on

        Gender result1 = new Gender(data);
        assertEquals(Gender.GENDER_FEMALE, result1.getGender());
        assertFalse(result1.isGenderMale());
        assertTrue(result1.isGenderFemale());
        assertFalse(result1.isGenderUnspecified());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = Gender.GENDER_UNSPECIFIED;
        //@formatter:on

        Gender result1 = new Gender(data);
        assertEquals(Gender.GENDER_UNSPECIFIED, result1.getGender());
        assertFalse(result1.isGenderMale());
        assertFalse(result1.isGenderFemale());
        assertTrue(result1.isGenderUnspecified());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = Gender.GENDER_FEMALE;
        //@formatter:on

        Gender result1 = new Gender(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
