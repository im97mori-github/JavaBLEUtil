package org.im97mori.ble.characteristic.core;

public class TemperatureTypeUtils {

    /**
     * 1: Armpit
     */
    public static final int TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT = 1;

    /**
     * 2: Body (general)
     */
    public static final int TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL = 2;

    /**
     * 3: Ear (usually ear lobe)
     */
    public static final int TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE = 3;

    /**
     * 4: Finger
     */
    public static final int TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER = 4;

    /**
     * 5: Gastro-intestinal Tract
     */
    public static final int TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT = 5;

    /**
     * 6: Mouth
     */
    public static final int TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH = 6;

    /**
     * 7: Rectum
     */
    public static final int TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM = 7;

    /**
     * 8: Toe
     */
    public static final int TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE = 8;

    /**
     * 9: Tympanum (ear drum)
     */
    public static final int TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM = 9;

    /**
     * @param temperatureTextDescription Temperature Text Description
     * @return {@code true}:Armpit, {@code false}:not Armpit
     */
    public static boolean isTemperatureTextDescriptionTypeArmpit(int temperatureTextDescription) {
        return TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT == temperatureTextDescription;
    }

    /**
     * @param temperatureTextDescription Temperature Text Description
     * @return {@code true}:Body (general), {@code false}:not Body (general)
     */
    public static boolean isTemperatureTextDescriptionTypeBodyGeneral(int temperatureTextDescription) {
        return TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL == temperatureTextDescription;
    }

    /**
     * @param temperatureTextDescription Temperature Text Description
     * @return {@code true}:Ear (usually ear lobe), {@code false}:not Ear (usually ear lobe)
     */
    public static boolean isTemperatureTextDescriptionTypeEarUsuallyEarLobe(int temperatureTextDescription) {
        return TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE == temperatureTextDescription;
    }

    /**
     * @param temperatureTextDescription Temperature Text Description
     * @return {@code true}:Finger, {@code false}:not Finger
     */
    public static boolean isTemperatureTextDescriptionTypeFinger(int temperatureTextDescription) {
        return TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER == temperatureTextDescription;
    }

    /**
     * @param temperatureTextDescription Temperature Text Description
     * @return {@code true}:Gastro-intestinal Tract, {@code false}:not Gastro-intestinal Tract
     */
    public static boolean isTemperatureTextDescriptionTypeGastroIntestinalTract(int temperatureTextDescription) {
        return TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT == temperatureTextDescription;
    }

    /**
     * @param temperatureTextDescription Temperature Text Description
     * @return {@code true}:Mouth, {@code false}:not Mouth
     */
    public static boolean isTemperatureTextDescriptionTypeMouth(int temperatureTextDescription) {
        return TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH == temperatureTextDescription;
    }

    /**
     * @param temperatureTextDescription Temperature Text Description
     * @return {@code true}:Rectum, {@code false}:not Rectum
     */
    public static boolean isTemperatureTextDescriptionTypeRectum(int temperatureTextDescription) {
        return TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM == temperatureTextDescription;
    }

    /**
     * @param temperatureTextDescription Temperature Text Description
     * @return {@code true}:Toe, {@code false}:not Toe
     */
    public static boolean isTemperatureTextDescriptionTypeToe(int temperatureTextDescription) {
        return TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE == temperatureTextDescription;
    }

    /**
     * @param temperatureTextDescription Temperature Text Description
     * @return {@code true}:Tympanum (ear drum), {@code false}:not Tympanum (ear drum)
     */
    public static boolean isTemperatureTextDescriptionTypeTympanumEarDrum(int temperatureTextDescription) {
        return TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM == temperatureTextDescription;
    }

}
