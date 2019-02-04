package com.faisal.StoredProcedure.Stored_procedure;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.coderHax.Service.BankDAOImplementation;

import junit.framework.TestCase;

public class MethodJUnitTest extends TestCase {
	BankDAOImplementation bdimpl = new BankDAOImplementation();
	
	@Test
	public void testCoderHax1_customerName() {
		assertEquals(true, bdimpl.coderHax1_customerName());
	}
	
	@Test
	public void testCoderHax2_branchName() {
		assertEquals(true, bdimpl.coderHax2_branchName());
	}
	
	@Test
	public void testCoderHax3_allFromBranch() {
		assertEquals(true, bdimpl.coderHax3_allFromBranch());
	}
	@Test
	public void testTask04() { 
		assertEquals("sA-201A-217",bdimpl.coderHax4_balanceGreaterThan700(700) );
		
	}
	@Test
	public void testTask05() { 
		
		assertTrue(bdimpl.coderHax5_balanceGreaterThan800(700, "Brighton"));		
			
	}

	@Test
	public void testQuery6() throws SQLException
	{
		
		assertEquals(true, bdimpl.coderHax6_assetsInThousands());
	}
	@Test
	public void testQuery7() throws SQLException
	{
		
		assertEquals(true, bdimpl.coderHax7_balanceBetweenOneAndFourMillion(1000000, 4000000));
	}
	
	@Test
	public void testQuery8() throws SQLException
	{
		
		assertEquals(true, bdimpl.coderHax8_customersWhoHaveAccount());
	}
	@Test
	public void testTask09() throws SQLException { 
		
		assertTrue(bdimpl.coderHax9_balance400OrLess(400));	
			
	}
}
