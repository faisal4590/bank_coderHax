package com.coderHax.Service;

import static org.junit.Assert.*;

import org.junit.Test;


public class BankDAOImplementationTest{
	
	BankDAOImplementation u=new BankDAOImplementation ();
	@Test
	public void testTask04() { 
		assertEquals("sA-201A-217",u.coderHax4_balanceGreaterThan700(700) );
		
	}
	@Test
	public void testTask05() { 
		
		assertTrue(u.coderHax4_balanceGreaterThan800(700, "Brighton"));		
			
	}
	@Test
	public void testTask09() { 
		
		assertTrue(u.coderHax9_balance400OrLess(400));	
			
	}
}
