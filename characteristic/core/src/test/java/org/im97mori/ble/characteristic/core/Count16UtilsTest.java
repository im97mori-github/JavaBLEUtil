package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class Count16UtilsTest extends TestBase {

    @Test
    public void test_isCountValueIsNotKnown_00001() {
        assertTrue(Count16Utils.isCountValueIsNotKnown(Count16Utils.COUNT_IS_NOT_KNOWN));
    }

    @Test
    public void test_isCountValueIsNotKnown_00002() {
        assertFalse(Count16Utils.isCountValueIsNotKnown(0));
    }

}
