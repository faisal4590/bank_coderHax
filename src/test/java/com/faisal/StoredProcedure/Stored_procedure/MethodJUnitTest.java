package com.faisal.StoredProcedure.Stored_procedure;

import static org.junit.Assert.*;
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

}
