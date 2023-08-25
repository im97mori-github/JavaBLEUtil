package org.im97mori.ble.characteristic.core;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;

public class TemperatureTypeUtilsTest extends TestBase {

    @Test
    public void test_isTemperatureTextDescriptionTypeArmpit_001() {
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM));
    }

    @Test
    public void test_isTemperatureTextDescriptionTypeBodyGeneral_001() {
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM));
    }

    @Test
    public void test_isTemperatureTextDescriptionTypeEarUsuallyEarLobe_001() {
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM));
    }

    @Test
    public void test_isTemperatureTextDescriptionTypeFinger_001() {
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM));
    }

    @Test
    public void test_isTemperatureTextDescriptionTypeGastroIntestinalTract_001() {
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM));
    }

    @Test
    public void test_isTemperatureTextDescriptionTypeMouth_001() {
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM));
    }

    @Test
    public void test_isTemperatureTextDescriptionTypeRectum_001() {
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM));
    }

    @Test
    public void test_isTemperatureTextDescriptionTypeToe_001() {
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM));
    }

    @Test
    public void test_isTemperatureTextDescriptionTypeTympanumEarDrum_001() {
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM));
    }

}
