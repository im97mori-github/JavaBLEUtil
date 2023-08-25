package org.im97mori.ble.descriptor.u290b;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class EnvironmentalSensingConfigurationTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = 0x01;
        //@formatter:on

        EnvironmentalSensingConfiguration result = new EnvironmentalSensingConfiguration(value);
        assertEquals(value[0], result.getTriggerLogicValue());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingConfiguration.TRIGGER_LOGIC_VALUE_BOOLAEN_AND;
        //@formatter:on

        EnvironmentalSensingConfiguration result = new EnvironmentalSensingConfiguration(value);
        assertTrue(result.isTriggerLogicValueBooleanAnd());
        assertFalse(result.isTriggerLogicValueBooleanOr());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingConfiguration.TRIGGER_LOGIC_VALUE_BOOLAEN_OR;
        //@formatter:on

        EnvironmentalSensingConfiguration result = new EnvironmentalSensingConfiguration(value);
        assertFalse(result.isTriggerLogicValueBooleanAnd());
        assertTrue(result.isTriggerLogicValueBooleanOr());
    }

    @Test
    public void test_constructor004() {
        int triggerLogicValue = 1;

        EnvironmentalSensingConfiguration result = new EnvironmentalSensingConfiguration(triggerLogicValue);
        assertEquals(triggerLogicValue, result.getTriggerLogicValue());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = 0x01;
        //@formatter:on

        EnvironmentalSensingConfiguration result1 = new EnvironmentalSensingConfiguration(value);
        assertArrayEquals(value, result1.getBytes());
    }

}
