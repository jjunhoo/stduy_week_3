package com.cubed.reflection.source2;

import java.lang.reflect.Method;

import com.cubed.reflection.data.TestObject;

public class Source2 {
	public static void main(String[] args) {
		try {
			Class c = TestObject.class;
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++)
				System.out.println(m[i].toString());
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}
