package org.im97mori.ble.test;

import java.lang.reflect.Field;

public class TestBase {

	protected static byte[] getData() {
		int index = -1;
		byte[] data = null;

		StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
		for (int i = 0; i < stackTraceElementArray.length; i++) {
			StackTraceElement stackTraceElement = stackTraceElementArray[i];
			if ("getData".equals(stackTraceElement.getMethodName())) {
				index = i + 1;
				break;
			}
		}
		if (index >= 0 && index < stackTraceElementArray.length) {
			StackTraceElement stackTraceElement = stackTraceElementArray[index];
			String[] splitted = stackTraceElement.getMethodName().split("_");
			try {
				Class<?> clazz = Class.forName(stackTraceElement.getClassName());
				Field field = clazz.getDeclaredField("data_" + splitted[splitted.length - 1]);
				field.setAccessible(true);
				data = (byte[]) field.get(null);
			} catch (NoSuchFieldException | ClassNotFoundException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return data;
	}

}
