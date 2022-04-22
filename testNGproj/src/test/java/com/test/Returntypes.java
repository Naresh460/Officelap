package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Returntypes {
	
	@Test (dataProvider = "iterator")
	public void method1(Object[] name) {		
		System.out.println(name[0]+">>>>>"+name[1]);
	}
	
//	@DataProvider(name="data values")
//	public String[] dataProvider() {   // if String return type
//		String[] data = new String[] {
//				"Naresh",
//				"Suresh",
//				"Mahesh"				
//		};
//		return data;		
//	}
	
//	@DataProvider(name="data values")
//	public Integer[] dataProvider() {   // if Integer return type
//		Integer[] data = new Integer[] {
//				1,
//				2,
//				3
//		};
//		return data;		
//	}
	
//	@DataProvider(name="data values")
//	public Object[] dataProvider() {   // if Integer return type
//		Object[] data = new Object[] {
//				1,
//				"Naresh",
//				3
//		};
//		return data;		
//	}
	
//	@DataProvider(name="iterator")
//	public Iterator<String> iterator() {		
//		List<String> data = new ArrayList<>();
//		data.add("Naresh");
//		data.add("Mahesh");
//		data.add("Suresh");
//		
//		return data.iterator();
//	}
	
//	@DataProvider(name="iterator")
//	public Iterator<Integer> iterator() {		
//		Set<Integer> data = new HashSet<>();
//		data.add(1);
//		data.add(2);
//		data.add(3);
//		
//		return data.iterator();  //It will iterator single return so the parameter should be single
//	}
//	
	
	@DataProvider(name="iterator")
	public Iterator<Object[]> iterator() {		
		Set<Object[]> data = new HashSet<>();
		data.add(new Object[]{"Naresh",1});
		data.add(new Object[]{"mahesh",2});
		
		
		return data.iterator();  //It will iterator single return so the parameter should be single
	}
}

 





