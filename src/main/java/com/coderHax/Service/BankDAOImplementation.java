package com.coderHax.Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.coderHax.DAO.BankDAO;
import com.coderHax.DatabaseUtil.BankOperations;
import com.coderHax.DatabaseUtil.DBConnection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankDAOImplementation implements BankDAO {

	@Override
	public boolean coderHax1_customerName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean coderHax2_branchName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean coderHax3_allFromBranch() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String coderHax4_balanceGreaterThan700(int n) {

		String s = BankOperations.Task04(n);
		if (s != null)
			return s;

		return null;
	}

	@Override
	public boolean coderHax4_balanceGreaterThan800(int n, String m) {

		return BankOperations.Task05(n, m);

	}

	@Override
	public boolean coderHax6_assetsInThousands() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean coderHax7_balanceBetweenOneAndFourMillion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean coderHax8_customersWhoHaveAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean coderHax9_balance400OrLess(int n) {
		// TODO Auto-generated method stub
		return BankOperations.Task09(n);
	}

	

}
