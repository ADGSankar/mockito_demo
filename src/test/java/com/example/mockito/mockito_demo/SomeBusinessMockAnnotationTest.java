package com.example.mockito.mockito_demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationTest {

	@Mock
	DataService1 dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessimpl;
	
	@Test
	public void test0FindGreatestFromAllData() {	
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {24,10,5});
		assertEquals(24, businessimpl.findGreatestFromAllData());
	}
	@Test
	public void test1FindGreatestFromAllData() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {15});
		assertEquals(15, businessimpl.findGreatestFromAllData());
	}
	@Test
	public void test2FindGreatestFromAllData() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessimpl.findGreatestFromAllData());
	}
	
}

