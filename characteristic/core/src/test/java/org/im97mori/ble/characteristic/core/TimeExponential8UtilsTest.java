package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TimeExponential8UtilsTest {

    @Test
    public void test_isTimeExponential8ZeroSeconds_00001() {
        assertTrue(TimeExponential8Utils.isTimeExponential8ZeroSeconds(TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS));
    }

    @Test
    public void test_isTimeExponential8ZeroSeconds_00002() {
        assertFalse(TimeExponential8Utils.isTimeExponential8ZeroSeconds(TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE));
    }

    @Test
    public void test_isTimeExponential8ZeroSeconds_00003() {
        assertFalse(TimeExponential8Utils.isTimeExponential8ZeroSeconds(TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isTimeExponential8ZeroSeconds_00004() {
        assertFalse(TimeExponential8Utils.isTimeExponential8ZeroSeconds(1));
    }

    @Test
    public void test_isTimeExponential8ZeroSeconds_00005() {
        assertFalse(TimeExponential8Utils.isTimeExponential8ZeroSeconds(253));
    }

    @Test
    public void test_isTimeExponential8TotalLifeOfTheDevice_00001() {
        assertFalse(TimeExponential8Utils.isTimeExponential8TotalLifeOfTheDevice(TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS));
    }

    @Test
    public void test_isTimeExponential8TotalLifeOfTheDevice_00002() {
        assertTrue(TimeExponential8Utils.isTimeExponential8TotalLifeOfTheDevice(TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE));
    }

    @Test
    public void test_isTimeExponential8TotalLifeOfTheDevice_00003() {
        assertFalse(TimeExponential8Utils.isTimeExponential8TotalLifeOfTheDevice(TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isTimeExponential8TotalLifeOfTheDevice_00004() {
        assertFalse(TimeExponential8Utils.isTimeExponential8TotalLifeOfTheDevice(1));
    }

    @Test
    public void test_isTimeExponential8TotalLifeOfTheDevice_00005() {
        assertFalse(TimeExponential8Utils.isTimeExponential8TotalLifeOfTheDevice(253));
    }

    @Test
    public void test_isTimeExponential8ValueIsNotKnown_00001() {
        assertFalse(TimeExponential8Utils.isTimeExponential8ValueIsNotKnown(TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS));
    }

    @Test
    public void test_isTimeExponential8ValueIsNotKnown_00002() {
        assertFalse(TimeExponential8Utils.isTimeExponential8ValueIsNotKnown(TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE));
    }

    @Test
    public void test_isTimeExponential8ValueIsNotKnown_00003() {
        assertTrue(TimeExponential8Utils.isTimeExponential8ValueIsNotKnown(TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isTimeExponential8ValueIsNotKnown_00004() {
        assertFalse(TimeExponential8Utils.isTimeExponential8ValueIsNotKnown(1));
    }

    @Test
    public void test_isTimeExponential8ValueIsNotKnown_00005() {
        assertFalse(TimeExponential8Utils.isTimeExponential8ValueIsNotKnown(253));
    }

}
