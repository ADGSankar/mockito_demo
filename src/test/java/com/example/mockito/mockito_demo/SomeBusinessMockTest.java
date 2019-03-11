package com.example.mockito.mockito_demo;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

	@Test
	public void test0FindGreatestFromAllData() {
		
		DataService1 dataServiceMock=mock(DataService1.class);
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {24,10,5});
		SomeBusinessImpl businessimpl=new SomeBusinessImpl(dataServiceMock );
		int result = businessimpl.findGreatestFromAllData();
		assertEquals(24, result);
	}
	@Test
	public void test1FindGreatestFromAllData() {
		
		DataService1 dataServiceMock=mock(DataService1.class);
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {15});
		SomeBusinessImpl businessimpl=new SomeBusinessImpl(dataServiceMock );
		int result = businessimpl.findGreatestFromAllData();
		assertEquals(15, result);
	}
	
}

