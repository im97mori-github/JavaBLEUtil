package org.im97mori.ble.characteristic.u2abe;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class ObjectNameTest {

    @Test
    public void test_constructor_00001() {
        String name = "Rbt-Sensor";

        ObjectName result1 = new ObjectName(name.getBytes());
        assertEquals(name, result1.getObjectName());
    }

    @Test
    public void test_constructor_00002() {
        String name = "Rbt-Sensor";

        ObjectName result1 = new ObjectName(name);
        assertEquals(name, result1.getObjectName());
    }

    @Test
    public void test_parcelable_00002() {
        String name = "Rbt-Sensor";

        ObjectName result1 = new ObjectName(name.getBytes());
        byte[] resultData = result1.getBytes();
        assertArrayEquals(name.getBytes(), resultData);
    }

}
