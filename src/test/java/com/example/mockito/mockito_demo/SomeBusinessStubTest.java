package com.example.mockito.mockito_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testFindGreatestFromAllData() {
		SomeBusinessImpl businessimpl=new SomeBusinessImpl(new DataServiceStub());
		int result = businessimpl.findGreatestFromAllData();
		assertEquals(24, result);
	
	}
}
class DataServiceStub implements DataService1{

	@Override
	public int[] retriveAllData() {
		return new int[]{24,6,15};
	}
	
}
