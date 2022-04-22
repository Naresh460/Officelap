package com.test;

import org.testng.annotations.Test;

public class Java_inheritance2 extends Java_inheritance {
	String names;
	@Test
	public void method1() {
	Java_inheritance classb = new Java_inheritance();  //one object acquires all the properties and behaviors of a parent object.
	String names=classb.name;
	
	}
}
