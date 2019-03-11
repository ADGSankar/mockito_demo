package com.example.mockito.mockito_demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

public class ListTest {

	List listMock=mock(List.class);
	
	@Test
	public void test0FindGreatestFromAllData() {
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}
	@Test
	public void test1FindGreatestFromAllData() {
		
		when(listMock.get(0)).thenReturn(15);
		assertEquals(15, listMock.get(0));
		assertEquals(15, listMock.get(0));
		assertEquals(15, listMock.get(0));
	}
	@Test
	public void test2FindGreatestFromAllData() {
		
		when(listMock.get(0)).thenReturn(15).thenReturn(20);
		assertEquals(15, listMock.get(0));
		assertEquals(20, listMock.get(0));
		assertEquals(20, listMock.get(0));
	}
	@Test
	public void test3FindGreatestFromAllData() {	
		when(listMock.get(0)).thenReturn("Sankar");
		assertEquals("Sankar", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	@Test
	public void test4FindGreatestFromAllData() {	
		when(listMock.get(Mockito.anyInt())).thenReturn("Sankar");
		assertEquals("Sankar", listMock.get(0));
		assertEquals("Sankar", listMock.get(1));
		assertEquals("Sankar",listMock.get(12));
	}
}

