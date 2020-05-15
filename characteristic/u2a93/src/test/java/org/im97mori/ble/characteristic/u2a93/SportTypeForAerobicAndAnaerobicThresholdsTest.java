package org.im97mori.ble.characteristic.u2a93;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SportTypeForAerobicAndAnaerobicThresholdsTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_UNSPECIFIED;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_UNSPECIFIED, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_RUNNING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_RUNNING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CYCLING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CYCLING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_ROWING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_ROWING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CROSS_TRAINING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CROSS_TRAINING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor006() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CLIMBING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CLIMBING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor007() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_SKIING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_SKIING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor008() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_SKATING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_SKATING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor009() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_ARM_EXERCISING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_ARM_EXERCISING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor010() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_LOWER_BODY_EXERCISING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_LOWER_BODY_EXERCISING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor011() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_UPPER_BODY_EXERCISING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_UPPER_BODY_EXERCISING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor012() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_WHOLE_BODY_EXERCISING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertEquals(SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_WHOLE_BODY_EXERCISING, result1.getSportTypeForAerobicAndAnaerobicThresholds());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUnspecified());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRunning());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCycling());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsRowing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsClimbing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkiing());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsSkating());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsArmExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising());
        assertFalse(result1.isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising());
        assertTrue(result1.isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising());
    }

    @Test
    public void test_constructor013() {
        int sportTypeForAerobicAndAnaerobicThresholds = 1;

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(sportTypeForAerobicAndAnaerobicThresholds);
        assertEquals(sportTypeForAerobicAndAnaerobicThresholds, result1.getSportTypeForAerobicAndAnaerobicThresholds());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = SportTypeForAerobicAndAnaerobicThresholds.SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_RUNNING;
        //@formatter:on

        SportTypeForAerobicAndAnaerobicThresholds result1 = new SportTypeForAerobicAndAnaerobicThresholds(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
