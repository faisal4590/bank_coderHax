package com.coderHax.DAO;

import java.sql.SQLException;

public interface BankDAO {
	boolean coderHax1_customerName();
	boolean coderHax2_branchName();
	boolean coderHax3_allFromBranch();
	String coderHax4_balanceGreaterThan700(int n);
	boolean coderHax5_balanceGreaterThan800(int n, String m);
	boolean coderHax6_assetsInThousands();
	boolean coderHax7_balanceBetweenOneAndFourMillion(int n, int m);
	boolean coderHax8_customersWhoHaveAccount();
	boolean coderHax9_balance400OrLess(int n) throws SQLException;
}
