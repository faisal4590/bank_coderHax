package com.coderHax.DatabaseUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.coderHax.Service.BankDAOImplementation;

public class BankOperations {
	public Connection initialize() {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();
		return dbConnection;
	}

	public void coderHax6_assetsInThousandsImplentation() throws SQLException {
		String coderHax6_branch = "exec coderHax6_BranchNameAndAsset";

		PreparedStatement preparedStatement = initialize().prepareStatement(coderHax6_branch);
		// execute insert SQL stetement
		preparedStatement.execute();// returns true if the statement is ok
	}

	public void coderHax7_AssetsBetweenOneToFourMillionImplementation(int n, int m) throws SQLException {
		String coderHax7_branch = "{call coderHax7_AssetsBetweenOneToFourMillion(?,?)} ";
		CallableStatement cs = initialize().prepareCall(coderHax7_branch);

		cs.setInt(1, n);
		cs.setInt(2, m);
		
		cs.execute();
		
		// execute insert SQL stetement
		// returns true if the statement is ok
	}
	
	public void coderHax8_HaveAccountImplementation() throws SQLException {
		String coderHax8_branch = "{call coderHax6_BranchNameAndAsset} ";
		CallableStatement cs = initialize().prepareCall(coderHax8_branch);
		cs.execute();// returns true if the statement is ok
		
		// execute insert SQL stetement
		
	}

		
}
